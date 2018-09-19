# Draw

**Overview**

The Draw App is designed to allow the user to enter text into a text box and click a button to change the color of the text randomly. It will also display the RGB code of the color shown, as well as the Hex code. The user can then switch to another activity screen where they can select a color and draw on the screen using their finger. This page allows them to either clear the screen or save the image to their device.

**Directions for Use**

When the Draw App is opened, this will be the screen you arrive on. There is a text box that reads “Tap to Change Color.” You can either type inside the box or leave the text that is there and press the purple button that says “Press Here.”

![add text](https://github.com/ukwildcat/Draw/blob/master/Screenshot_20180918-195408.jpg)

Once you click the button, you will see the color change inside the box, and the color codes listed as RGB and Hex will appear on the screen.

You can also see the “Switch To Drawing Activity” button at the bottom of the screen. Pressing it will take you to another screen.

![add text](https://github.com/ukwildcat/Draw/blob/master/Screenshot_20180918-195437.jpg)

This is what the next screen will look like. In order to draw on the screen, you must first click the button “Select Color Here to Begin Drawing.”

![alt text](https://github.com/ukwildcat/Draw/blob/master/Screenshot_20180918-195443.jpg)

After clicking the button, a color picker will appear. You can select the color you want and click OK.

![alt etxt](https://github.com/ukwildcat/Draw/blob/master/Screenshot_20180918-195447.jpg)

The next picture shows what it will look like when you draw on the screen using your finger.

![alt text](https://github.com/ukwildcat/Draw/blob/master/Screenshot_20180918-195459.jpg)

If you would like to save your picture or clear the screen, you can click on the 3 dots at the top of the screen, to show this:

![alt text](https://github.com/ukwildcat/Draw/blob/master/Screenshot_20180918-195502.jpg)

The picture will be saved to a file called “/Saved Images” on your device.

**Class Functionality**

The Draw App has 4 classes. The MainActivity class is designed to set up the main screen, setting up the buttons with their functionality. The MainActivity2 class sets up the drawing screen, the color picker and the save/clear functions. The FingerPath class is set up to work with the PaintView class with helpers for drawing and color. The PaintView class is the class that contains methods for setting up the drawing screen to make touch drawing possible. This class also contains a method for saving the image as a .jpg file named “Drawing- + a random number.” This class is called on in MainActivity2.

**Credits**

The Draw App uses a library import for the Color Picker from <https://github.com/kristiyanP/colorpicker>. This was implemented by adding an Array List to the project and populating it with colors that I chose.

