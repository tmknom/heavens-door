[![CircleCI](https://circleci.com/gh/tmknom/heavens-door.svg?style=svg)](https://circleci.com/gh/tmknom/heavens-door)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/0b6991a8921b4d0dbf7e47c58629b2f1)](https://www.codacy.com/app/tmknom/heavens-door)
[![Codacy Badge](https://api.codacy.com/project/badge/Coverage/0b6991a8921b4d0dbf7e47c58629b2f1)](https://www.codacy.com/app/tmknom/heavens-door)

# heavens-door

## テスト

```
sbt test
```

## マイグレーション

```
sbt flywayMigrate
sbt flywayClean # 全部消したい場合
```

## 起動

```
sbt run
```

## 静的解析：Scalastyle

```
sbt scalastyle
```

### コピペチェック

```
sbt cpd
```

## 依存ライブラリのバージョンアップチェック

```
sbt dependencyUpdates
```

## コードの統計情報

```
sbt stats
```

## データベースの起動

```
mysql.server start
```
