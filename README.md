## Supermarket Item Pricing Kata

First Java project - spec taken from PragDave's [Kata](http://codekata.com/kata/kata01-supermarket-pricing/).

### To download local copy
```bash
git clone https://github.com/sblausten/supermarket-kata
```

### To import into Eclipse so you can run tests and the program
Please install [Eclipse](https://eclipse.org/downloads/packages/eclipse-ide-java-developers/oxygenr) and follow this [guide](https://github.com/collab-uniba/socialcde4eclipse/wiki/How-to-import-a-GitHub-project-into-Eclipse)

### Requirements:
- [x] Add item to shopping basket (as a customer)
- [x] Add item by weight to shopping basket (as a customer)
- [x] Checkout shopping basket (as a customer)
- [x] Get list of items in basket and their prices (as an admin)
- [x] Calculate items price subtotal (as an admin)
- [x] Get breakdown of price savings from offers for items in basket (as an admin)
- [x] Calculate savings total (as an admin)
- [x] Calculate net total price for basket (as an admin)

#### Special pricing offers:
- [x] Three cans of beans for the price of two.
- [x] Oranges for £1.99/kilo.
- [x] Two cans of Coke, for £1.

#### Items in stock:
- Beans @ 0.5/unit
- Coke @ 0.7/unit
- Orange @ 0.00199/gram

### Architecture approach
A Diagram of classes can be viewed and commented on [here](https://drive.google.com/file/d/0B0xb9lq0JFMDTnY3bUM4Zm8xdnc/view?usp=sharing)

### Tools:
- Build: [Gradle](https://gradle.org/)
- Testing: [JUnit](http://junit.org/junit4/), [Mockito](http://junit.org/junit4/), [PowerMockito](https://powermock.github.io/)
