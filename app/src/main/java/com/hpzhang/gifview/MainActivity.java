package com.hpzhang.gifview;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

/**
 * 加载Gif图片
 *
 * @author hpzhang
 */
public class MainActivity extends AppCompatActivity {

    SimpleDraweeView simpleDraweeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(this);
        setContentView(R.layout.activity_main);

        simpleDraweeView = (SimpleDraweeView) findViewById(R.id.simpleDraweeView);
//        String url = "res:///"+R.drawable.bed;
//        String url = "asset:///bed.gif";
        String url = "http://i1.mhimg.com/M01/0D/E7/CgAAhlTSxP-AaPAJACCrDgY0KdM857.gif";
        Uri uri = Uri.parse(url);
        /**
         * 下面是主要代码：
         */
        DraweeController draweeController = Fresco.newDraweeControllerBuilder()
                .setAutoPlayAnimations(true)//自动播放动画
                .setUri(uri)//路径
                .build();
        simpleDraweeView.setController(draweeController);

    }
}
