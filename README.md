Creates a VM image and installs java8 on it.

```bash
vagrant up
```

Ping:

```bash
ansible spring-boot-ansible -m ping --ask-pass
```

Install playbook manually:

```bash
ansible-playbook install.yml --ask-pass
```

To force provisioning again if the machine is up already:
```bash
vagrant provision
```


