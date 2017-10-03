Install ansible

```bash
brew install ansible
```

Install dependencies:

```bash
ansible-galaxy install -r requirements.yml
```

Verify that dependencies were installed:

```bash
ansible-galaxy list
- geerlingguy.java, 1.7.4
- geerlingguy.postgresql, 1.3.1
```

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
journalctl -n 1000 -f -u spring-boot-ansible.service
```

Create postgresql schema
```bash
$ createdb demo
$ CREATE USER spring WITH PASSWORD 'spring';
$ GRANT ALL PRIVILEGES ON DATABASE demo to spring;
```



Resources:
https://techdev.io/en/developer-blog/jvm-applications-as-a-service-with-systemd
https://github.com/pellepelster/ansible-springboot-role
http://codeboje.de/spring-boot-info-actuator/