package biyabi.holder;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.RelativeLayout;

import com.android.volley.toolbox.NetworkImageView;

import java.util.ArrayList;

import biyabi.R;
import biyabi.util.ImageUtils;
import biyabi.view.HomeTitleIndictor;

public class HomeTitleHolder extends RecyclerView.ViewHolder {
    private Context context;
    RelativeLayout mLayoutHomeTitle;
    ViewPager mvpHomeTitle;
    HomeTitleIndictor htiHomeTitle;
    private HomeTitlePagerAdapter adapter;
    private boolean isOperate;
    private Object operateFlag;

    public HomeTitleHolder(View itemView, Context context) {
        super(itemView);
        this.context = context;
        mLayoutHomeTitle = (RelativeLayout) itemView.findViewById(R.id.layout_home_title);
        mvpHomeTitle = (ViewPager) itemView.findViewById(R.id.vp_home_title);
        htiHomeTitle = (HomeTitleIndictor) itemView.findViewById(R.id.hti_home_title);
        setHeight();
        setAdapter();
        setListener();
        startCarousel();
    }

    public void setHolder(ArrayList<String> picUrlList) {
        setHeight();
        adapter.initList(picUrlList);
    }

    private void startCarousel() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int index = 1;
                while (true) {
                    SystemClock.sleep(4000);
                    if (!isOperate) {
                        final int i = index;
                        ((Activity)context).runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                mvpHomeTitle.setCurrentItem(i);
                            }
                        });
                        if (index < 5) {
                            index++;
                        } else {
                            index = 0;
                        }
                    }
                }
            }
        }).start();
    }

    private void setListener() {
        mvpHomeTitle.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                htiHomeTitle.setIndex(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        mvpHomeTitle.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        isOperate = true;
                        operateFlag = new Object();
                        break;
                    case MotionEvent.ACTION_UP:
                        setCarousel(operateFlag);
                        break;
                }
                return false;
            }
        });
    }

    public void setCarousel(final Object carousel) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SystemClock.sleep(1500);
                if (operateFlag.equals(carousel)) {
                    isOperate = false;
                }
            }
        }).start();
    }

    private void setAdapter() {
        adapter = new HomeTitlePagerAdapter(context);
        mvpHomeTitle.setAdapter(adapter);
    }

    private void setHeight() {
        WindowManager manager = ((Activity)context).getWindowManager();
        int width = manager.getDefaultDisplay().getWidth();
        Drawable drawable = context.getResources().getDrawable(R.drawable.home_title_pic1);
        int picWidth = drawable.getMinimumWidth();
        int picHeight = drawable.getMinimumHeight();
        ViewGroup.LayoutParams params = mLayoutHomeTitle.getLayoutParams();
        params.width = width;
        params.height = width * picHeight / picWidth;
        mLayoutHomeTitle.setLayoutParams(params);
    }

    private class HomeTitlePagerAdapter extends PagerAdapter {
        private Context context;
        private ArrayList<String> picUrlList;

        public HomeTitlePagerAdapter(Context context) {
            this.context = context;
            this.picUrlList = new ArrayList<>();
        }

        public void initList(ArrayList<String> picUrlList) {
            this.picUrlList.clear();
            this.picUrlList.addAll(picUrlList);
            notifyDataSetChanged();
        }

        @Override
        public int getCount() {
            return picUrlList == null ? 0 : picUrlList.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            NetworkImageView niv = new NetworkImageView(context);
            niv.setLayoutParams(new ViewPager.LayoutParams());
            if (picUrlList != null && picUrlList.size() > 0) {
                ImageUtils.setImage(niv, picUrlList.get(position));
            } else {
                ImageUtils.setImage(niv, "");
            }
            container.addView(niv);
            return niv;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((NetworkImageView) object);
        }
    }
}
