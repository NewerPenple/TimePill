package biyabi.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;

import biyabi.R;

public class HomeIconHolder extends RecyclerView.ViewHolder {
    public RelativeLayout mLayoutIcon1,mLayoutIcon2,mLayoutIcon3, mLayoutIcon4;
    public NetworkImageView mnivIcon1,mnivIcon2,mnivIcon3, mnivIcon4;
    public TextView mtvIcon1,mtvIcon2,mtvIcon3, mtvIcon4;

    public HomeIconHolder(View itemView) {
        super(itemView);
        initView();
    }

    private void initView() {
        mLayoutIcon1 = (RelativeLayout) itemView.findViewById(R.id.layout_home_icon1);
        mLayoutIcon2 = (RelativeLayout) itemView.findViewById(R.id.layout_home_icon2);
        mLayoutIcon3 = (RelativeLayout) itemView.findViewById(R.id.layout_home_icon3);
        mLayoutIcon4 = (RelativeLayout) itemView.findViewById(R.id.layout_home_icon4);
        mnivIcon1 = (NetworkImageView) itemView.findViewById(R.id.niv_home_icon1);
        mnivIcon2 = (NetworkImageView) itemView.findViewById(R.id.niv_home_icon2);
        mnivIcon3 = (NetworkImageView) itemView.findViewById(R.id.niv_home_icon3);
        mnivIcon4 = (NetworkImageView) itemView.findViewById(R.id.niv_home_icon4);
        mtvIcon1 = (TextView) itemView.findViewById(R.id.tv_home_icon1);
        mtvIcon2 = (TextView) itemView.findViewById(R.id.tv_home_icon2);
        mtvIcon3 = (TextView) itemView.findViewById(R.id.tv_home_icon3);
        mtvIcon4 = (TextView) itemView.findViewById(R.id.tv_home_icon4);
    }
}
