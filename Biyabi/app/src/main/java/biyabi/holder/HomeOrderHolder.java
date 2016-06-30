package biyabi.holder;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;

import biyabi.R;
import biyabi.bean.HomeItemBean;
import biyabi.util.ImageUtils;

public class HomeOrderHolder extends RecyclerView.ViewHolder {
    private Context context;
    public RecyclerView mrvHomeOrder;
    private LinearLayoutManager manager;
    private HomeOrderAdapter adapter;

    public HomeOrderHolder(View itemView, Context context) {
        super(itemView);
        this.context = context;
        initView();
    }

    private void initView() {
        mrvHomeOrder = (RecyclerView) itemView.findViewById(R.id.rv_home_order);
        manager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        mrvHomeOrder.setLayoutManager(manager);
        adapter = new HomeOrderAdapter(context);
        mrvHomeOrder.setAdapter(adapter);
    }

    public void setHolder(HomeItemBean orderResult) {
        adapter.initData(orderResult);
    }

    private class HomeOrderAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        private Context context;
        private HomeItemBean orderResult;

        public HomeOrderAdapter(Context context) {
            this.context = context;
        }

        public void initData(HomeItemBean orderResult) {
            this.orderResult = orderResult;
            notifyDataSetChanged();
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View layout = null;
            RecyclerView.ViewHolder holder = null;
            if (viewType < getItemCount() - 1) {
                layout = LayoutInflater.from(context).inflate(R.layout.item_home_order_data, parent, false);
                holder = new HomeOrderDataHolder(layout);
            } else {
                layout = LayoutInflater.from(context).inflate(R.layout.item_home_order_more, parent, false);
                holder = new HomeOrderMoreHolder(layout);
            }
            return holder;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            if (orderResult != null) {
                if (position < getItemCount() - 1) {
                    HomeOrderDataHolder dataHolder = (HomeOrderDataHolder) holder;
                    ImageUtils.setImage(dataHolder.mnivOrderPic, orderResult.getResult()[position].getStrMainImage());
                    dataHolder.mtvOrderPrice.setText("¥ " + orderResult.getResult()[position].getDecOrginalPriceRMB());
                    dataHolder.mLayoutOrderItem.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                        }
                    });
                } else {
                    ((HomeOrderMoreHolder) holder).mLayoutOrderMore.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                        }
                    });
                }
            }
        }

        @Override
        public int getItemCount() {
            return 11;
        }

        @Override
        public int getItemViewType(int position) {
            return position;
        }
    }

    private class HomeOrderDataHolder extends RecyclerView.ViewHolder {
        LinearLayout mLayoutOrderItem;
        NetworkImageView mnivOrderPic;
        TextView mtvOrderPrice;

        public HomeOrderDataHolder(View itemView) {
            super(itemView);
            mLayoutOrderItem = (LinearLayout) itemView.findViewById(R.id.layout_home_order_item);
            mnivOrderPic = (NetworkImageView) itemView.findViewById(R.id.niv_home_order_pic);
            mtvOrderPrice = (TextView) itemView.findViewById(R.id.tv_home_order_price);
        }
    }

    private class HomeOrderMoreHolder extends RecyclerView.ViewHolder {
        LinearLayout mLayoutOrderMore;

        public HomeOrderMoreHolder(View itemView) {
            super(itemView);
            mLayoutOrderMore = (LinearLayout) itemView.findViewById(R.id.layout_home_order_more);
        }
    }
}
