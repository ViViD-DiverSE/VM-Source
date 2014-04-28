VM-Source
=========
Welcome to the VM wiki!
Last update 26/03/2014 by [@mauricio.alferez](https://github.com/mao2013)

##Installation Guide

###Steps to all users:
1. Download and install [Eclipse Xtext](https://www.eclipse.org/Xtext/download.html).
2. Start eclipse and create a new workspace. To start Eclipse, double-click on the eclipse.exe (Microsoft Windows) or eclipse (Linux / Mac) file in the directory where you unpacked Eclipse Xtext. The system will prompt you for the workspace location (file path). Select an empty directory and click the "OK" button.
3. Follow the steps according to your user profile. 

### Steps for VM **modelers**.
- Follow the steps 1. and 2. 
- Download the VM project repository [zip](https://github.com/ViViD-DiverSE/VM-Source/master.zip)
- Unzip the downloaded file.
- In the unzipped directory, copy the projects that start by fr.inria.lang.vm.* to the "_dropins_" directory of your Xtext Eclipse installation.  After a restart of your Eclipse your plug-in should be available and ready for use.
- Create a new project in a new Eclipse Application instance.
- Create a file with extension "vm" in the new project.
- Click "yes" if Eclipse asks you if you want to add the "Xtext nature" to the project.
- Get familiar with VM by understanding some examples (e.g., mobilePhone_v1.vm)

### Steps for **developers**:
- Follow the steps 1. and 2.
- Create a new branch (i.e., fork it) of the [GitHub VM project](https://github.com/ViViD-DiverSE/VM-Source/) following the Github [instructions](https://help.github.com/articles/fork-a-repo). We suggest you rename your the new branch to identify clearly your intended VM improvement (e.g., implementing-new-xyz-annotations-types).
- We recommend to install and use the [Egit](https://www.eclipse.org/egit/) plugin as it is very well integrated with Eclipse, however, you are free to use any other Git software. EGit will ease to perform the following 2 steps and committing changes to our cloned copy.
- Clone your new branch in your local machine.
- Import to the Xtext Eclipse workspace the projects that start by fr.inria.lang.vm.* from the cloned VM repository. All the projects that you selected will appear in your Eclipse package explorer view.
- Provide improvements.
- If you want to contribute back to the original fork, do not forget to send us a [pull request](https://help.github.com/articles/using-pull-requests).

##Examples:
- Copy the projects with names that start by the prefix "fr.inria.lang.vm.examples" from the VM project repository [zip](https://github.com/ViViD-DiverSE/VM-Source/archive/master.zip). 
- Import the example projects to your Eclipse installation.
- If you export your plug-in locally, you can put it into the Eclipse dropins folder of your Eclipse installation. After a restart of your Eclipse your plug-in should be available and ready for use.
- Remember that you have to export the copy the projects that you downloaded from the VM project repository into the "Plugings" directory of your Eclipse installation to see the VM models syntax highlighting and full-fledge features of the language provided by Xtext.

##Screencasts:
