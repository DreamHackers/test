事始め（はじめに読む）
====

説明用Gitリポジトリ

## 注意点
* .gitignoreを固定させ、個人のローカル情報をコミットしないようにする
* コミットする際のコメントに何を実装しているのかを記す
* 常にpull requestでプッシュしておく→ソースレビューは他の人が問題なければOKとする
* 

## ソースレビュー

### なぜするか
* バグ、脆弱性の早期発見

### なにを見るか
* 命名規則→基本は、名前はGoogle翻訳でよさ気なのを使うこと。(x kensaku(), o search())
* コメントは最小限に。コメントを書かないと理解できないソースがゴミ。多少わかりづらいところなら仕方ないが、各メソッド内に20％以下に留める。何をしているかは、Javadocに書けばいい。（例外としては、ライブラリを利用している時など。これは、ライブラリの中の処理を追う必要性を殺すため。存分に書いてくれ。）
* 設計の不自然さ→継承、インタフェース、委譲、unsafeなどは最低限
* デザインパターンに凝る必要性がなければ無理に当てはめない。それよりも作法を重視しているかどうか
* パフォーマンス→無駄な処理が多くないかどうか。インスタンスをやたらと作りすぎてないか。特にネイティブなので、メモリにダメージを与えないような実装をしたい。
* 参照渡し禁止。オブジェクト思考多少無視してもいいから、やらないこと。そこまで共通化する意味はない。
* メモリ開放→マジで死ぬやつ
* 再起→これも死ぬやつ
* 境界値テスト
 
## Gitフロー（1～3名）
* develop => 開発用ブランチ
* master => リリース用ブランチ
* hotfix => 緊急用ブランチ
 
### 実際の開発スタイル

```
# 自分のリポジトリを本体と同じ最新版にしたい時
# まず、本体のソースをローカルにpullして、それをoriginにpush
# 変更点があれば、developへpull requestをする（masterにしてはいけない）

$ git clone git@github.com:{自分のアカウント名}/test.git
$ git cd test
$ git checkout develop
$ git remote add upstream git@github.com:NativeAppDevelopmentInstitute/test.git
$ git pull upstream develop
$ git push origin develop
```
 
## 開発環境
* OS => Linux or Mac
* Java => 1.7
* Gradle => 2.1
* Android Studio => 0.8.6
* Android OS => 4.4
* GenyMotion(実機ないなら)
