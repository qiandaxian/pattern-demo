# 状态模式DEMO
### 业务场景描述
web服务端通过mq下发命令到中间件，中间件解析json，根据命令类型(command)，采用对应的handle处理。

### 关键点
- 将web下发的命令，抽象成一种状态。如：设备更新命令(command:DEVICE_UPDATE),媒体资源禁用(command:RESOURCE_DISABLE)
- 通过反射，将json中commad和状态实现类关联


