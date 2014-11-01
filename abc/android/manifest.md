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

なので、Oauth認証時には利用する。
