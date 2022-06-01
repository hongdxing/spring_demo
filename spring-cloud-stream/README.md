

#Kafka
- 默认情况下，只有创建一个partition, 所以即使启动多个服务， 也只有一个服务能分配到唯一的partition, 所有的Message 都只做这台服务上消费，起不到分散负载的目的
  - 看启动日志会发现没有分配到partition 的服务会看到`g-new-order-notify: partitions assigned:[]`
  - 所以加了下面两行配置，让系统启动是至少创建2个partition
    - `spring.cloud.stream.kafka.binder.min-partition-count=2`
      `spring.cloud.stream.kafka.binder.autoAddPartitions=true`