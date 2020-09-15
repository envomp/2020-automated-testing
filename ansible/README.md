# Setup for assignment 1

As an example we will be setting up the development environment for assignment 1 with Git, Java and Maven in a Linux or Windows Subsystem for Linux. An optional step is setting up VS Code, but this step applies for Linux graphical environment, **in a WSL environment it is redundant and you can omit this step** (although it won't do anything bad).

## Prerequisites
- Linux
- Or Windows Subsystem for Linux (we will be using Ubuntu 18.04)
- Ansible installed
- Ansible roles installed
- Visual Studio Code and/or plugins
    - visualstudioexptteam.vscodeintellicode
    - esbenp.prettier-vscode
    - vscoss.vscode-ansible
    - ms-vscode-remote.remote-wsl
    - vscjava.vscode-java-pack

# What will be installed

The ansible playbook will install the following:
- Git
- JDK
- Maven
- VSCode with all relevant plugins *(Optional: When running on WSL it is redundant)*

# Running playbook
```commandline
ansible-playbook ansible/assignment-1-setup.yml
```

# Generating Maven Quickstart Project

Replace the groupId and artifactId:
- groupId: **ee.icd0004.yourusername** (for example your Gitlab username like *pepaan* which stands for Peeter Paan)
- artifactId: **assignment-1**

```
mvn archetype:generate -DgroupId=com.company.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```

# Reference materials
- [What is Ansible: Advantages, Features, and Architecture](https://www.simplilearn.com/tutorials/ansible-tutorial/what-is-ansible)
- [Installing Ansible](https://docs.ansible.com/ansible/latest/installation_guide/intro_installation.html)
- [Ansible Galaxy](https://galaxy.ansible.com)
- [Ansible Docs](https://docs.ansible.com/ansible/latest/index.html)
- [Maven in 5 minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
- [Testing Java with Visual Studio Code](https://code.visualstudio.com/docs/java/java-testing)