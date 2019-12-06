package com.nasserkh.testproject1;

import android.content.Context;
import android.widget.ListView;

import androidx.core.content.res.ResourcesCompat;

import java.util.ArrayList;
import java.util.List;

public class FakeDataGenerator {
    public static List<PostDM> getData(Context context) {
        List<PostDM> posts = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            PostDM post = new PostDM();
            post.setId(0);
            post.setTitle("لورم ایپسوم چیست؟");
            post.setContent("در این صورت می توان امید داشت که تمام و دشواری موجود در ارائه راهکارها و شرایط سخت تایپ به پایان رسد و زمان مورد نیاز شامل حروفچینی دستاوردهای اصلی و جوابگوی سوالات پیوسته اهل دنیای موجود طراحی اساسا مورد استفاده قرار گیرد.");
            post.setDate("دو ساعت پیش");
            switch (i) {

                case 1:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),
                            R.drawable.pic01, null));
                    break;
                case 2:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),
                            R.drawable.pic02, null));
                    break;
                case 3:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),
                            R.drawable.pic03, null));
                    break;
                case 4:
                case 6:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),
                            R.drawable.pic04, null));
                    break;
                case 5:
                default:
                    post.setImage(ResourcesCompat.getDrawable(context.getResources(),
                            R.drawable.pic05, null));
                    break;
            }
            posts.add(post);
        }
        return posts;
    }
}
