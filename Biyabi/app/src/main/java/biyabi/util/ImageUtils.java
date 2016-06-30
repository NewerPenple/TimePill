package biyabi.util;

import android.graphics.Color;

import com.android.volley.toolbox.NetworkImageView;

public class ImageUtils {
    public static void setImage(NetworkImageView niv, String url) {
        niv.setDefaultImageResId(Color.WHITE);
        if (url != null) {
            niv.setImageUrl(url, RequestManager.getImageLoader());
        }
        niv.setErrorImageResId(Color.WHITE);
    }
}
