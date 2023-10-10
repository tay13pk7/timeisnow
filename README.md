# timeisnow


No, they have different purposes.

A constructor is used to initialise an object (eg, set values for its attributes), while getters and setters are used to encapsulate data and control its modification rules. An example may help.

Imagine that you have a class Person with an attribute age, and you decide to allow direct access to its attribute. So you have a lot of code doing using person.age. But then you realise that actually need to store a person’s birthDate as well, so the right thing to do is the use the birth date to calculate the age dynamically. Oops… that means that you need to track down every single use of person.age and replace it with whatever logic you use to calculate the age. Terrible.

That’s where using getters will save you: you can change the way the age is calculated as many times as you want without breaking the class’ API. Other objects don’t care, they just call person.getAge() knowing they will get what they need. A setter has similar advantages: you give all the control to the class to do any validation or transformation required to store the value. The outside world doesn’t care, they only know what they will get.

In Java, you probably want to add getters an setter for all attributes, because requirements change. You need to be prepared.
