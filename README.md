When re-creating the Vagrant image you will need to remove the key fingerprint from your
`~/.ssh/known_hosts` file

```bash
ansible all -m ping --ask-pass
```

```bash
ansible-playbook install.yml --ask-pass
```

```bash
ansible-playbook install-with-role.yml --ask-pass
```
