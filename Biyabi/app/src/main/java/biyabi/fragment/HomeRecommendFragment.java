package biyabi.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import biyabi.BiyabiApplication;
import biyabi.R;
import biyabi.adapter.HomeRecommendAdapter;
import biyabi.bean.ResultBean;
import biyabi.util.OkHttpUtils2;

public class HomeRecommendFragment extends BaseFragment {
    private static final String TAG = HomeRecommendFragment.class.getName();
    private RecyclerView mrvHomeRecommend;
    private HomeRecommendAdapter adapter;
    private LinearLayoutManager manager;

    public HomeRecommendFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_home_recommend, container, false);
        mrvHomeRecommend = (RecyclerView) layout.findViewById(R.id.rv_home_recommend);
        return layout;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
    }

    @Override
    public void initData() {
        downloadTitle();
    }

    private void downloadTitle() {
        OkHttpUtils2<ResultBean> utils = new OkHttpUtils2<ResultBean>();
        utils.url(BiyabiApplication.SERVER_ROOT)
                .addParam("infoNation", String.valueOf(0))
                .addParam("mallUrl","")
                .targetClass(ResultBean.class)
                .execute(new OkHttpUtils2.OnCompleteListener<ResultBean>() {
                    @Override
                    public void onSuccess(ResultBean result) {
                        if (result != null) {
                            adapter.initData(result);
                        } else {
                            Log.i("my", TAG + " result is null");
                        }
                    }

                    @Override
                    public void onError(String error) {
                        Log.i("my", TAG + " error: " + error);
                    }
                });
    }

    private void initView() {
        manager = new LinearLayoutManager(getActivity());
        mrvHomeRecommend.setLayoutManager(manager);
        adapter = new HomeRecommendAdapter(getActivity());
        mrvHomeRecommend.setAdapter(adapter);
    }
}
