炫酷的摇摆下拉刷新

![image](https://github.com/mengcuiguang/HaoKanRefresh-master/blob/master/test.gif )  

原文作者：https://github.com/android-cjj

使用方法：
    
1、布局文件

    <com.meng.refreshdemo.library.HaoKanRefreshLayout
        android:id="@+id/haokan_refresh"
        android:layout_width="match_parent"
        android:layout_height="match_parent">

2、MainActivity

        HaoKanRefreshLayout haoKanRefreshLayout = (HaoKanRefreshLayout) findViewById(R.id.haokan_refresh);
        haoKanRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        haoKanRefreshLayout.setRefreshing(false);
                    }
                },3000);
            }
        });

        haoKanRefreshLayout.setRefreshing(true);
        
    

