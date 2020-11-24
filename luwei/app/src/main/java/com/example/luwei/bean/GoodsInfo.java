package com.example.luwei.bean;

import com.example.luwei.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "iPhone 12", "荣耀Play4T", "华为 nova6", "华为荣耀20青春版", "华为HONOR荣耀", "OPPO Reno3pro", "华为nova", "华为9A"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "Apple/苹果 iPhone 12 Pro全网通5G智能手机 官方授权苹果12pro",
            "华为Honor/荣耀Play4T手机新品大内存AI/摄影官方正品华为旗舰店30全新SX游戏手机Play4T直降",
            " Huawei/华为 nova6 5G/4G官方旗舰店官网华为手机nova7 se正品p40 pro直降mate30",
            "Huawei/华为荣耀20青春版AMOLED屏幕指纹手机 荣耀手机 官方旗舰店",
            "华为HONOR荣耀 畅玩9A手机9a学生老人10青春超长待机官方旗舰店10e正品大音量拍照智能千元机",
            "OPPO Reno3pro全网通5g opporeno3pro5g版手机 新款opporeno3por reno3 oppoace oppo新品r17 r19 未来findx2",
            "Huawei/华为nova 5i手机官网官方旗舰店正品手机nova5pro/手机nova6se/p40/nova7新品",
            "全新华为荣耀畅玩9A 4+64G 全网通 幻夜黑 双卡双待 全国联保"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {11299, 1369, 3999, 2098,3299, 3799, 5528, 3325};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.sj1, R.drawable.sj2, R.drawable.sj3,R.drawable.sj4, R.drawable.sj5, R.drawable.sj6,R.drawable.sj7, R.drawable.sj8
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.sj1, R.drawable.sj2, R.drawable.sj3,R.drawable.sj4, R.drawable.sj5, R.drawable.sj6,R.drawable.sj7, R.drawable.sj8
    };
    // 声明一个手机商品的大图数组


    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
