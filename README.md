# asg.No8
# 内容

- MySQLのテーブルからレコードを全件取得するAPIを実装する
- クエリ文字を指定して検索するAPIを実装する

# 動作確認
### MySQL Databasesのnamesテーブルに5つのテーブルを追加
- [x] 5つの名前が追加されていることを確認
  ![image](https://github.com/Chisato630/asg.No8/assets/153170893/cb640a9b-61ea-43d5-9a28-5e21c75c5fca)

### GETリクエスト
1. 全件取得
   `http://localhost:8080/names`
- [x] HTTPステータスコード200を確認
- [x] 全件レスポンスボディに表示されていることを確認
  ![image](https://github.com/Chisato630/asg.No8/assets/153170893/051ecb31-5b5d-45ad-9717-d58361bd1f69)

2. 頭が「b」で始まる名前を取得
   `http://localhost:8080/names?startsWith=b`
- [x] HTTPステータスコード200を確認
- [x] 「b」で始まる5つの名前が表示されていることを確認
  ![image](https://github.com/Chisato630/asg.No8/assets/153170893/658c1789-2c38-409c-acd4-e329df57e4ee)

3. 頭が「a」で始まる名前を取得
   `http://localhost:8080/names?startsWith=a`
- [x] HTTPステータスコード200を確認
- [x] 「a」で始まる名前が無いため表示されていないことを確認
  ![image](https://github.com/Chisato630/asg.No8/assets/153170893/08331ed2-306f-435c-8cbd-bb40f3bfa8ed)

4. 語尾が「n」で終わる名前を取得
   `http://localhost:8080/names?endsWith=n`
- [x] HTTPステータスコード200を確認
- [x] 「n」で終わる2つの名前が表示されていることを確認
  ![image](https://github.com/Chisato630/asg.No8/assets/153170893/611a65ad-4211-4767-ab90-7205660c1ba6)

5. 「i」が含まれる名前を取得
   `http://localhost:8080/names?contains=i`
- [x] HTTPステータスコード200を確認
- [x] 「i」が含まれる2つの名前が表示されていることを確認
  ![image](https://github.com/Chisato630/asg.No8/assets/153170893/d2071c4e-fad9-441d-a704-3357c423eda2)

6. 頭が「b」、語尾が「n」、名前に「i」が含まれる名前を取得
   `http://localhost:8080/names?startsWith=b&endsWith=n&contains=i`
- [x] HTTPステータスコード200を確認
- [x] 上記が対応する1つの名前が表示されていることを確認
  ![image](https://github.com/Chisato630/asg.No8/assets/153170893/e32a0ee1-31ab-49f3-ae7e-d2b0fbdc8099)