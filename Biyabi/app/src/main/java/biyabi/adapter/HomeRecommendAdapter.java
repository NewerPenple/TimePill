package biyabi.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import biyabi.R;
import biyabi.bean.HomeItemBean;
import biyabi.bean.ResultBean;
import biyabi.holder.HomeIconHolder;
import biyabi.holder.HomeOrderHolder;
import biyabi.holder.HomeTitleHolder;
import biyabi.util.ImageUtils;

public class HomeRecommendAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements View.OnClickListener{
    private static final String TAG = HomeRecommendAdapter.class.getName();
    private Context context;
    private ArrayList<String> titlePicUrlList;
    private ArrayList<String> iconPicUrlList;
    private ArrayList<String> iconPicNameList;
    private HomeItemBean orderResult;

    public HomeRecommendAdapter(Context context) {
        this.context = context;
    }

    public void initData(ResultBean result) {
        titlePicUrlList = new ArrayList<>();
        iconPicUrlList = new ArrayList<>();
        iconPicNameList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            titlePicUrlList.add(result.getResult()[0].getResult()[i].getProImage());
        }
        for (int i = 0; i < 4; i++) {
            iconPicUrlList.add(result.getResult()[1].getResult()[i].getIcoImage());
            iconPicNameList.add(result.getResult()[1].getResult()[1].getIcoName());
        }
        orderResult = result.getResult()[2];
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout = null;
        RecyclerView.ViewHolder holder = null;
        switch (viewType) {
            case 0:
                layout = LayoutInflater.from(context).inflate(R.layout.item_home_title, parent, false);
                holder = new HomeTitleHolder(layout, context);
                break;
            case 1:
                layout = LayoutInflater.from(context).inflate(R.layout.item_home_icon, parent, false);
                holder = new HomeIconHolder(layout);
                break;
            case 2:
                layout = LayoutInflater.from(context).inflate(R.layout.item_home_order, parent, false);
                holder = new HomeOrderHolder(layout, context);
                break;
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (position) {
            case 0:
                if (titlePicUrlList != null) {
                    ((HomeTitleHolder) holder).setHolder(titlePicUrlList);
                }
                break;
            case 1:
                if (iconPicUrlList != null && iconPicNameList != null) {
                    HomeIconHolder homeIconHolder = (HomeIconHolder) holder;
                    ImageUtils.setImage(homeIconHolder.mnivIcon1, iconPicUrlList.get(0));
                    ImageUtils.setImage(homeIconHolder.mnivIcon2, iconPicUrlList.get(1));
                    ImageUtils.setImage(homeIconHolder.mnivIcon3, iconPicUrlList.get(2));
                    ImageUtils.setImage(homeIconHolder.mnivIcon4, iconPicUrlList.get(3));
                    homeIconHolder.mtvIcon1.setText(iconPicNameList.get(0));
                    homeIconHolder.mtvIcon2.setText(iconPicNameList.get(1));
                    homeIconHolder.mtvIcon3.setText(iconPicNameList.get(2));
                    homeIconHolder.mtvIcon4.setText(iconPicNameList.get(3));
                    homeIconHolder.mLayoutIcon1.setOnClickListener(this);
                    homeIconHolder.mLayoutIcon1.setOnClickListener(this);
                    homeIconHolder.mLayoutIcon1.setOnClickListener(this);
                    homeIconHolder.mLayoutIcon1.setOnClickListener(this);
                }
                break;
            case 2:
                if (orderResult != null) {
                    ((HomeOrderHolder) holder).setHolder(orderResult);
                }
                break;
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.layout_home_icon1:

                break;
            case R.id.layout_home_icon2:

                break;
            case R.id.layout_home_icon3:

                break;
            case R.id.layout_home_icon4:

                break;
        }
    }
}
