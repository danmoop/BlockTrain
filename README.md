# BlockTrain

So I'm practicing with blockchain. I will use blocktrain in android app later.

```java
Block myBlock1 = new Block("Some information"); // This block automatically added to train
Train.getTrain(); // Returns List of Block objects

myBlock1.getHash();
myBlock1.getPreviousHash();
myBlock1.getMessage(); // Some information
myBlock1.getFullMessage(); // Some information - 1524334576106

// 1524334576106 is a number of milliseconds passed since 1970
```


**Examle output**:
```java


1 : MESSAGE : Hello, Trevor
1 : FULL MESSAGE : Hello, Trevor - 1524334576106
1 : HASH : 22342fb63a978061c1ddf6791431cf0361da30c7cd10770db46b349542ae9dd3
1 : PREV HASH : none
---------------------------------------------------------------------------------
2 : MESSAGE : Hello, Ben
2 : FULL MESSAGE : Hello, Ben - 1524334576131
2 : HASH : 115c7c944e18c158d3977aa06a8a1df84499e4dadc1487237b6aa917573d1a5c
2 : PREV HASH : 22342fb63a978061c1ddf6791431cf0361da30c7cd10770db46b349542ae9dd3
---------------------------------------------------------------------------------
3 : MESSAGE : Hello, Anna
3 : FULL MESSAGE : Hello, Anna - 1524334576131
3 : HASH : d09228e2c8d3c19bb39de6ba377bf151ac0ed5761087a131c5aa4ab33cfc768e
3 : PREV HASH : 115c7c944e18c158d3977aa06a8a1df84499e4dadc1487237b6aa917573d1a5c
---------------------------------------------------------------------------------
4 : MESSAGE : Hello, Franklin
4 : FULL MESSAGE : Hello, Franklin - 1524334576132
4 : HASH : fade2516e75cc177d5b8b7c27c1d1295951e06ef6641f9763023957277e8ba8e
4 : PREV HASH : d09228e2c8d3c19bb39de6ba377bf151ac0ed5761087a131c5aa4ab33cfc768e
---------------------------------------------------------------------------------
5 : MESSAGE : Hello, Trevor
5 : FULL MESSAGE : Hello, Trevor - 1524334576132
5 : HASH : 9ee95d7938f940551aa46496e8e5a3388ecf90ed27aec3d2d46492ac8368190b
5 : PREV HASH : fade2516e75cc177d5b8b7c27c1d1295951e06ef6641f9763023957277e8ba8e
---------------------------------------------------------------------------------
[model.Block@135fbaa4, model.Block@45ee12a7, model.Block@330bedb4, model.Block@2503dbd3, model.Block@4b67cf4d]

```
