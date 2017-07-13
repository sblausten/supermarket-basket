## Supermarket Item Pricing Kata

First Java project - spec taken from PragDave's [Kata](http://codekata.com/kata/kata01-supermarket-pricing/).

### Requirements:
- [ ] Add an item to stock (as an admin)
- [ ] Move item from stock to shopping basket (as a customer)
- [ ] Checkout shopping basket (as a customer)
- [ ] Get list of items in basket and their prices (as an admin)
- [ ] Calculate items price subtotal (as an admin)
- [ ] Get breakdown of price savings from offers for items in basket (as an admin)
- [ ] Calculate savings total (as an admin)
- [ ] Calculate net total price for basket (as an admin)

#### Special pricing offers:
- [ ] Three cans of beans for the price of two.
- [ ] Oranges for £1.99/kilo.
- [ ] Two cans of Coke, for £1.

### Initial architecture approach
As it is my first project I'm going to test drive using unit tests initially with a fairly simple [Facade pattern](https://en.wikipedia.org/wiki/Facade_pattern) and then potentially refactor with the [Onion Pattern](http://jeffreypalermo.com/blog/the-onion-architecture-part-1/) for future extensibility - and for practice!   

A very rough first diagram of classes can be viewed and commented on [here](https://drive.google.com/file/d/0B0xb9lq0JFMDTnY3bUM4Zm8xdnc/view?usp=sharing)

### Tools:
- Build: [Gradle](https://gradle.org/)
- Testing: [JUnit](http://junit.org/junit4/), [Mockito](http://junit.org/junit4/)
