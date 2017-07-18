package items;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
	
	public void MockItemConstructor(Double price) {
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
		MockItemConstructor(0.5);
		Items itemsSpy = spyOnItems();
		when(itemsSpy.getItemPrice("beans")).thenReturn(0.5);
		assertThat(itemsSpy.getNewItem("beans"), instanceOf(Item.class));
	}
	
	@Test
	public void getNewItem_ShouldNotReturnItemObjectIfItemHasNoPrice() {
		MockItemConstructor((Double) null);
		Items itemsSpy = spyOnItems();
		when(itemsSpy.getItemPrice("beans")).thenReturn((Double) null);
		Item result = itemsSpy.getNewItem("beans");
		assertEquals(result, null);
	}
	
	@Test
	public void getPrice_ShouldReturnDoubleIfPassedValidItemName() {
		Items testItems = new ItemsFactory();
		Double returnPrice = testItems.getItemPrice("beans");
		assertEquals(returnPrice, (Double)0.5);
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
		Double returnPrice = testItems.getItemPrice("nonexistant");
		assertEquals(returnPrice, (Double)null);
	}
	
	@Test
	public void addNewItemType_ShouldPrintExceptionIfItemExists() {
		Items testItems = new ItemsFactory();
		testItems.addNewItemType("beans", 0.8);
		assertEquals("java.lang.IllegalArgumentException: Item already exists. Please update it instead.\n",
				errContent.toString());
	}
	
	@Test
	public void updateItemPrice_ShouldPrintWarningIfItemDoesNotExist() {
		Items testItems = new ItemsFactory();
		testItems.updateItemPrice("bla", 0.8);
		assertEquals("Item did not exist so new a item was added.\n",
				outContent.toString());
	}

}
