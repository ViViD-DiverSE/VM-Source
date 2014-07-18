VM Variability Modeling and Configuration Language
=========
Last update 26/03/2014 by [@mauricio.alferez](https://github.com/mao2013)

VM original webpage: http://mao2013.github.io/VM/

### Wiki
Please visit our VM project [wiki](https://github.com/ViViD-DiverSE/VM-Source/wiki) to see tutorials and examples.

### Installation
Only prerequisite:
Any updated Eclipse installation (https://www.eclipse.org/downloads/). 

We tested VM using the Eclipse Kepler (4.3.2) SR2 Eclipse Modeling Tools, but you can use lighter versions such as Eclipse Standard, Eclipse IDE for Java and DSL Developers.

The VM language is composed of Eclipse plugins. You can install them using our Eclipse update site: `http://mao2013.github.io/VM/vmUpdateSite/`

If you are not sure where to introduce our update site address, follow the next steps:

1. In Eclipse, choose **Help > Install New Software...**
2. In the "Work with" section, click the **Add...** button. The "Add Repository" dialog box appears.
3. Write `http://mao2013.github.io/VM/vmUpdateSite/` in "Location" and click the **OK** button. The "Available Software" wizard appears.
4. click the **Select All** and then click **Finish**.
5. Eclipse will take a while to resolve dependencies and ask you if you are sure to install unsigned content. Agree and accept all the questions.
6. Restart Eclipse.

### Creating a VM project and model.
1. Install VM.
2. Create a new project in a new Eclipse Application instance.
3. Create a file with extension "vm" in the new project.
4. Click "yes" if Eclipse asks you if you want to add the "Xtext nature" to the project.
5. Get familiar with VM by understanding some examples (e.g., mobilePhone_v1.vm)

### The following steps are for developers:

1. Download and install [Eclipse Xtext](https://www.eclipse.org/Xtext/download.html).
2. Start eclipse and create a new workspace. To start Eclipse, double-click on the eclipse.exe (Microsoft Windows) or eclipse (Linux / Mac) file in the directory where you unpacked Eclipse Xtext. The system will prompt you for the workspace location (file path). Select an empty directory and click the "OK" button.
3. Follow the next steps according to your user profile: 

#### Developers interested to have the VM code:
- Follow the steps 1. and 2. 
- Download the VM project repository [zip](https://github.com/ViViD-DiverSE/VM-Source/archive/master.zip)

#### Developers interested to contribute to the VM project:
- Follow the steps 1. and 2.
- Create a new branch (i.e., fork it) of the [GitHub VM project](https://github.com/ViViD-DiverSE/VM-Source/) following the Github [instructions](https://help.github.com/articles/fork-a-repo). We suggest you rename your the new branch to identify clearly your intended VM improvement (e.g., implementing-new-xyz-annotations-types).
- We recommend to install and use the [Egit](https://www.eclipse.org/egit/) plugin as it is very well integrated with Eclipse, however, you are free to use any other Git software. EGit will ease to perform the following 2 steps and committing changes to our cloned copy.
- Clone your new branch in your local machine.
- Import to the Xtext Eclipse workspace the projects that start by fr.inria.lang from the cloned VM repository. All the projects that you selected will appear in your Eclipse package explorer view.
- Provide improvements.
- If you want to contribute back to the original fork, do not forget to send us a [pull request](https://help.github.com/articles/using-pull-requests).
