# SpringBatch
### version 1 (add mywriter)
 - Modified SpringBatch in demos to provide txt form outputs
 - 修改处：
   - 自定义Writer类：MyWriter，实现txt文本格式输出(调用Report中添加的toMyString()方法)
   - job-hello-world.xml(line 18、60): 添加step2(使用MyWriter进行输出，并做好了相应配置)
