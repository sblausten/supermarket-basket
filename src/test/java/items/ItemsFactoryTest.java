package items;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import items.Item;
import items.Items;
import items.ItemsFactory;

@RunWith(PowerMockRunner.class)
@PrepareForTest( { Item.class })
public class ItemsFactoryTest {
	
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
	  System.setErr(new PrintStream(errContent));
	  System.setOut(new PrintStream(outContent));
	}
	
	public Items spyOnItems() {
		Items items = new ItemsFactory();
		Items itemsSpy = spy(items);
		return itemsSpy;
	}
	
	public void MockItemConstructor(BigDecimal price) {
		Item testItem = PowerMockito.mock(Item.class);
		try {
			PowerMockito.whenNew(Item.class).withArguments("beans", price).thenReturn(testItem);
		} catch (Exception e) {
			fail("Item constructor was not passed expected arguments");
		}
	}

	@After
	public void cleanUpStreams() {
	  System.setErr(null);
	  System.setOut(null);
	}
	
	@Test
	public void getNewItem_ShouldCallGetItemPrice() {
		Items itemsSpy = spyOnItems();
		itemsSpy.getNewItem("beans");
		verify(itemsSpy, atMost(1)).getItemPrice("beans");
	}
	
	@Test
	public void getNewItem_ShouldThrowExceptionIfNoPrice() {
		Items itemsSpy = spyOnItems();
		when(itemsSpy.getItemPrice("beans")).thenReturn(null);
		itemsSpy.getNewItem("beans");
		assertEquals("java.lang.Exception: Requested item has price: null\n", errContent.toString());
	}

	@Test
	public void getNewItem_ShouldReturnItemObjectIfPassedValidName() {
		BigDecimal price = new BigDecimal("0.5").setScale(2, BigDecimal.ROUND_HALF_EVEN);
		MockItemConstructor(price);
		Items itemsSpy = spyOnItems();
		when(itemsSpy.getItemPrice("beans")).thenReturn(price);
		assertThat(itemsSpy.getNewItem("beans"), instanceOf(Item.class));
	}
	
	@Test
	public void getNewItem_ShouldNotReturnItemObjectIfItemHasNoPrice() {
		MockItemConstructor((BigDecimal) null);
		Items itemsSpy = spyOnItems();
		when(itemsSpy.getItemPrice("beans")).thenReturn((BigDecimal) null);
		Item result = itemsSpy.getNewItem("beans");
		assertEquals(result, null);
	}
	
	@Test
	public void getPrice_ShouldReturnBigDecimalIfPassedValidItemName() {
		Items testItems = new ItemsFactory();
		BigDecimal returnPrice = testItems.getItemPrice("beans");
		BigDecimal expectedPrice = new BigDecimal("0.50");
		assertEquals(expectedPrice, returnPrice);
	}
	
	@Test
	public void getPrice_ShouldOutputExceptionIfNotPassedValidItemName() {
		Items testItems = new ItemsFactory();
		testItems.getItemPrice("nonexistant");
		assertEquals("java.lang.Exception: Requested Item does not exist with that name\n", errContent.toString());
	}
	
	@Test
	public void getPrice_ShouldReturnNullIfNotPassedValidItemName() {
		Items testItems = new ItemsFactory();
		BigDecimal returnPrice = testItems.getItemPrice("nonexistant");
		assertEquals(returnPrice, (BigDecimal)null);
	}
	
	@Test
	public void addNewItemType_ShouldPrintExceptionIfItemExists() {
		Items testItems = new ItemsFactory();
		BigDecimal price = new BigDecimal("0.80");
		testItems.addNewItemType("beans", price);
		assertEquals("java.lang.IllegalArgumentException: Item already exists. Please update it instead.\n",
				errContent.toString());
	}
	
	@Test
	public void updateItemPrice_ShouldPrintWarningIfItemDoesNotExist() {
		Items testItems = new ItemsFactory();
		BigDecimal price = new BigDecimal("0.80");
		testItems.updateItemPrice("test", price);
		assertEquals("Item did not exist so new a item was added.\n",
				outContent.toString());
	}

}
