#private key 错误
- github 需要 ecdsa 而不是rsa
- jgit 需要 PEM格式

####解决方法， 用下面的命令从新生成 ecdsa key
`ssh-keygen -m PEM -t ecdsa -b 521`