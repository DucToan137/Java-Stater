## Chapter 1

### #1. Java là gì?

### #2. Setup Java

#### 1. JDK (java development kit)

https://www.oracle.com/java/technologies/downloads/archive/
https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html

- Download và cài đặt java 17 (8, 11, 17, 21 -> LST: long term support)
- kiểm tra version: java --version
- kiểm tra java path (if needed)
  https://www.w3schools.com/java/java_getstarted.asp

#### 2. Setup IDE

- Spring tool suite: https://spring.io/tools
- Spring Tools 4 for Eclipse
  **Bước 1:** Download files
  **Bước 2:** giải nén file .jar
  **Bước 3:** giải nén file contents.zip
  **Bước 4:** Run file sts-4.20.0.RELEASE/SpringToolSuite4.exe

### #3. Hello world with Java

#### 1. Run HelloWorld

Lưu ý:

- Đã cài đặt thành công java. Kiểm tra = cách: java --version
- Đã cài đặt Spring tool suite

##### Bước 1: tạo Java project

File -> New -> Java Project
(hoặc chọn trực tiếp "Create a Java project")

##### Bước 2:

Project name: hoidanit

- Có thể lựa chọn location của project
- sử dụng JRE là java 17
  -> chọn finish
  Mặc định, project java được tạo sẵn, sẽ bao gồm:
- JRE System library: các thư viện viết sẵn của java khi cài đặt java
- src : (package) thư mục nơi chứa code

##### Bước 3:

Tạo file: Nhấn chuột phải vào src -> New -> Class -> HelloWorld -> finish
-> mặc định, sẽ có 1 file tên là HelloWorld.java được tạo bên trong src/hoidanit

##### Bước 4: Chạy chương trình

**Cách 1**: Nhấn chuột phải vào HelloWorld.java -> Run as -> Java application
**Cách 2**: Open file location -> gõ lệnh: java HelloWorld.java

### #4. Setup Spring Tool Suite

#### 1. auto format code

Truyền thống (thổ dân):
select block code -> nhấn chuột phải -> Source -> Format (ctrl +shift + F)
Cấu hình:
https://stackoverflow.com/a/234625

#### 2. Chỉnh font

https://stackoverflow.com/a/4923243

#### 3. Chỉnh theme light/dark

Windows -> preferences -> Appearance -> theme

#### 4. Bảo vệ mã nguồn với GIT

Link git của khóa học:
https://gitlab.com/public-starter-projects1/05-java-core/01-java-starter

### #5. Variables (Khái niệm biến)

### #6. Các hàm xuất ra màn hình

https://stackoverflow.com/questions/12519335/resource-leak-in-is-never-closed

### #7. Các hàm toán học

1. <a href="https://www.w3schools.com/java/java_math.asp">Java Math </a>
2. <a href="https://www.w3schools.com/java/java_ref_math.asp">Java Math Methods</a>

### #8. Bài tập Lab 01

### #9. Chữa bài tập Lab 01
