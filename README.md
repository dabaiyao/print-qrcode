## 程序功能
+ 本程序根据模型层全局车辆表获取车牌号、车牌颜色，定制二维码（可以先生成100辆），主要流程如下:
 1. 获取二维码base64字符串：http://192.168.90.220/qrcode/swagger-ui.html 其中:size=600, fontSize=40, text=https://www.hzyzwxgzh.com/hzyz2/kyfw.html?cphm={车牌号码}&color={车牌颜色}, tips=车牌号码
 2. 将获取到的base64字符串转成图片，以车牌号命名



