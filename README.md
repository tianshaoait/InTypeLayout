# InTypeLayout

# compile 'com.github.tianshaoait:InTypeLayout:0.1'

# 判断是否显示数据或显示null等状态图片等(只能包含一个view)


  <com.tianshaoait.administrator.mylibrary.InTypeLayout
        android:id="@+id/main_intypelayout"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:inTypeTextColor="#000000"//设置状态字体颜色
        app:inTypeTextSize="13dp"//设置状态字体大小
        >

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent">

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Hello World!" />
        </RelativeLayout>
    </com.tianshaoait.administrator.mylibrary.InTypeLayout>
    


   if (a == null) {
       show("数据错误", R.mipmap.ic_launcher);
    } else {
      clear();
      ....//显示数据操作
    }
