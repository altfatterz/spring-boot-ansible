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


Start the service:

```bash
systemctl start spring-boot-ansible
```

Check status
```bash
systemctl status spring-boot-ansible
```

Check the logs:

```bash
journalctl -f -u spring-boot-ansible.service
```




Resources:
https://techdev.io/en/developer-blog/jvm-applications-as-a-service-with-systemd
https://github.com/pellepelster/ansible-springboot-role
