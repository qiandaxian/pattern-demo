# 状态模式应用DEMO
### 业务场景描述
web服务端通过mq下发JSON命令到中间件,json格式：
> 
 {
   “command”：“DeviceUpdate”,
   “param”：“{...}”
 }
>
中间件解析，根据命令类型(command)，采用不同的handle进行处理。

### 关键点
- 将web下发的命令类型(command)，抽象成一种状态。
- 反射和状态模式组合，实现状态的动态拓展