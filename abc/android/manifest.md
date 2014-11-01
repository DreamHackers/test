# AndroidManifest.xml

```
<application
  ...
  <activity
    ...
    android:launchMode="singleTop" >
    ...
  </activity>
</application>
```

対象のTaskのスタックに既にActivityインスタンスがあるときに→そのインスタンスのonNewIntent()を呼び出す。

似た処理として、Activityをぶち殺して使うときはsingleTaskで。推奨はされてない。

なので、Oauth認証時には利用する。
