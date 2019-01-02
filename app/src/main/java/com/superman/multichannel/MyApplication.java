package com.superman.multichannel;

import android.app.Application;

import com.umeng.commonsdk.UMConfigure;

/**
 * 作者 Superman
 * 日期 2018/12/28 10:51.
 * 文件 AndroidMultiChannelPackage
 * 描述
 */

public class MyApplication extends Application {
    /**
     * 参数1:上下文，必须的参数，不能为空
     * 参数2:友盟 app key，非必须参数，如果Manifest文件中已配置app key，该参数可以传空，则使用Manifest中配置的app key，否则该参数必须传入
     * 参数3:友盟 channel，非必须参数，如果Manifest文件中已配置channel，该参数可以传空，则使用Manifest中配置的channel，否则该参数必须传入，channel命名请详见channel渠道命名规范
     * 参数4:设备类型，必须参数，传参数为UMConfigure.DEVICE_TYPE_PHONE则表示手机；传参数为UMConfigure.DEVICE_TYPE_BOX则表示盒子；默认为手机
     * 参数5:Push推送业务的secret，需要集成Push功能时必须传入Push的secret，否则传空
     */
    @Override
    public void onCreate() {
        super.onCreate();
//        UMConfigure.init(this,);
    }
}
