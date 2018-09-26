# SlotMachine Example
An example of an MVC component with JavaFX.

There's a writeup about this article [here](https://medium.com/@vapurrmaid/javafx-reusable-fxml-component-26f6716bce18).

## Overview

The program is an example of creating reusable MVC components with JavaFX.

![MVC](https://github.com/vapurrmaid/SlotMachineExample/blob/master/docs/MVC.png)

The model is a simple POJO that uses a JavaBeans Property:

![UML](https://github.com/vapurrmaid/SlotMachineExample/blob/master/docs/machine.png)

There will be 2 such models instantiated at run time. They will exist as separate tabs in a `TabPane`:

![UI](https://github.com/vapurrmaid/SlotMachineExample/blob/master/docs/Tabs.png)


## Files
- [bin/](https://github.com/vapurrmaid/SlotMachineExample/tree/master/bin) contains an executable JAR of the program
- [docs/](https://github.com/vapurrmaid/SlotMachineExample/tree/master/docs) contains all of the diagrams and images. The UML was created with [UMLet](https://www.umlet.com/) and the diagrams were created with [Balsamiq](https://balsamiq.com/)
- [nbproject/](https://github.com/vapurrmaid/SlotMachineExample/tree/master/nbproject) contains NetBeans project files (minus the private directory). This project is best used in NetBeans though it is not necessary.
- [MainCLI.java](https://github.com/vapurrmaid/SlotMachineExample/blob/master/src/mediumjavafxmvcexample/MainCLI.java) A class to run a system I/O loop.
- [MediumExample.java](https://github.com/vapurrmaid/SlotMachineExample/blob/master/src/mediumjavafxmvcexample/MediumExample.java) This is the Main class.
- [SlotMachine.java](https://github.com/vapurrmaid/SlotMachineExample/blob/master/src/mediumjavafxmvcexample/SlotMachine.java) The model.
- [SlotMachineTab.fxml](https://github.com/vapurrmaid/SlotMachineExample/blob/master/src/mediumjavafxmvcexample/SlotMachineTab.fxml) The view template.
- [SlotMachineTabController](https://github.com/vapurrmaid/SlotMachineExample/blob/master/src/mediumjavafxmvcexample/SlotMachineTabController.java) The controller for the view template
- [slotmachinetab.css](https://github.com/vapurrmaid/SlotMachineExample/blob/master/src/mediumjavafxmvcexample/slotmachinetab.css) Any styles for the template would go here.

## Donations
[![Donate](https://img.shields.io/badge/Donate-PayPal-green.svg)](https://www.paypal.me/vapurrmaid)

I write ~weekly tutorials covering explorations in computer science and web development. If you find the articles useful, I'll happily accept any donations.

A few other tutorials/projects I've written about:
- [Understand Express Servers](https://medium.com/@vapurrmaid/creating-an-express-server-run-on-part-3-f5e1dc7c6570)
- [Heroku Postgres](https://medium.com/@vapurrmaid/getting-started-with-heroku-postgres-and-pgadmin-run-on-part-2-90d9499ed8fb)
- [Getting started with Travis CI, NPM, Linting and Greenkeeper](https://medium.com/@vapurrmaid/getting-started-with-travis-npm-linting-and-greenkeeper-run-on-part-1-7a2a1a228d3a)
- [R-Way Tries in JavaScript](https://medium.com/@vapurrmaid/fun-with-strings-in-js-hacking-fallout-4-with-r-way-tries-d51cf56fa5a9)
- [SCSS Navigation Drawer](https://medium.com/@vapurrmaid/building-a-sassy-navigation-drawer-from-scratch-8b025f86b95e)
- [Managing a PostgreSQL database from Bash](https://medium.com/@vapurrmaid/managing-a-music-database-from-the-command-line-3a5b85f414e9)
- [Wave Visualizer with Web Audio API](https://medium.com/@vapurrmaid/c-s-weekly-2-material-wave-visualizer-and-the-web-audio-api-5a16c2af4d3b)
- [Hand Coding SVGs](https://medium.com/@vapurrmaid/c-s-weekly-1-envelope-svg-dbab242bc28b)
- [Code Something Weekly: How and Why](https://medium.com/@vapurrmaid/code-something-weekly-how-and-why-44640d279ca1)

