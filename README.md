Final Project Description:

1. Membuat Web UI Test gunakan website berikut sebagai target dan pembuatan test scenario: https://www.demoblaze.com/
2. Membuat API test, gunakan public API berikut:
   https://dummyapi.io/docs/user (Get User by ID, Create User, Update User, Delete User)
   https://dummyapi.io/docs/tag (Get List of Tags)
   header -> "app-id", token: "65ba064fdeb37cb465f62836"

Detail:
1. Buatlah automation test framework dan simpan kodenya sebagai repository di GitHub. Automation test framework harus mengandung beberapa aspek yang di ikuti, antara lain :
2. Buatlah test untuk Web UI dan API didalam satu repository
3. Test case untuk Web dan API harus menggunakan Gherkin format, gunakan Cucumber sebagai library untuk implementasinya
4. Buatlah folder atau package terpisah pada Java Code, Step Definitions dan Feature untuk masing-masing jenis test (Web dan API)
5. Buatlah 2 Gradle Task untuk menjalankan fungsi berikut
6. Execute semua cucumber test yang memiliki tag @api
7. Execute semua cucumber test yang memiliki tag @web
8.Buatlah report menggunakan Cucumber untuk format HTML dan JSON
9.Buatlah GitHub Actions workflow untuk menjalankan test yang sudah dibuat dengan cara (event) manual trigger dan setiap kali ada   Pull Request
10.Jangan lupa tambahkan README file dan berikian setiap informasi penting dari repository kalian, seperti tools dan library yang digunakan, dan bagaimana cara menjalankan test nya
