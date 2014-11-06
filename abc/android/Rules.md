# Android App develop Rules

## Summary
Android Appの開発ルールまとめ

## Requirements

### common
* JDK 1.7
* gradle 2.1
* Android Studio

### SDK類
* SDK Platform Android 4.4W.2, API 20, revision 2
* Android SDK Build-tools, revision 20
* Android SDK Platform-tools, revision 21
* Android SDK Tools, revision 23.0.5

### mac only
* JavaForOSX

### Optional
* Source Tree

## Set up
1. install Requirements && Android Studio open ( => auto build)
2. 足りないbuildライブラリなどをダウンロードする (syncするたびにこれを施行しエラーを消すこと)
3. build に必要なJDKなどのセットアップがあれば修正するが、基本は大丈夫なはず
4. Run {今回は実機を推奨 (理由はエミュレータだと不完全なテストしかできないから)}

## Android
* 4.0〜4.4.*に対応
