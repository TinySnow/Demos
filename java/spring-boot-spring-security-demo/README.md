# Spring Boot 与 Spring Security 集成 Demo

## 目录结构

- MVC 结构，与普通 Spring Boot 项目相同
- 业务代码极简化，只有 config 和 controller
  - config 配置 Spring Security
  - controller 配有两个 RESTful API
    - "/yes" 可以直接访问
    - "/no" 需要鉴权验证

## 运行环境

- Java 17
- Spring Boot 3

## 运行访问

- 无需额外工作
- IDE 中运行启动该项目即可

## 最终效果

![](./image/result.png)

## 文件更改说明

- 以此 `README.md` 文件当前目录作为相对路径

- ```bash
  PROJECT
  │  .gitignore
  │  pom.xml
  │  README.md
  │  spring-boot-spring-security-demo.iml
  │
  ├─image
  │      result.png
  │
  └─src
      ├─main
      │  ├─java
      │  │  └─tinysnow
      │  │      └─demo
      │  │          │  SpringBootSpringSecurityDemoApplication.java
      │  │          │
      │  │          ├─config
      │  │          │      SpringSecurityConfiguration.java
      │  │          │
      │  │          └─controller
      │  │                  TestController.java
      │  │
      │  └─resources
      │      │  application.yml
      │      │
      │      ├─static
      │      └─templates
      └─test
          └─java
              └─tinysnow
                  └─demo
                          SpringBootSpringSecurityDemoApplicationTests.java
  ```

### 无更改

- `./pom.xml` 无更改
- `./src/main/java/tinysnow/demoSpringBootSpringSecurityDemoApplication.java` 无更改
- `./src/test` 文件夹下所有内容无更改

### 有更改

- `./src/main/resources/application.yml` 有部分配置，说明请查看该文件
- `./image` 文件夹添加最终效果图
- `./src/main/java/tinysnow/demo` 添加 `config` 和 `controller` 文件夹
  - 包括文件夹下的所有文件