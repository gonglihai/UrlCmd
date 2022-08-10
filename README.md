# UrlCmd
 windows 浏览器协议(URL Protocol)
 浏览器访问后, 执行cmd命令
 ```fileclient://calc``` 打开计算器
 ```fileclient://mstsc``` 远程桌面
 ```fileclient://mstsc "C:\home\rdp\xxx.rdp"``` 远程桌面到某个rdp文件
 
 ## 环境需求
 java运行环境, java8


 ## 配置
 修改 ```dist/urlCmd.reg``` 第 17 行, 修改 java.exe, 与 jar 包 位置
 
 ## 安装
 1. 双击 ```dist/urlCmd.red```
 2. 浏览器输入 ```fileclient://calc```
 
 ## 警告
 1. 直接执行的CMD命令, 未进行任何的拦截, 风险较大
