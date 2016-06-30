package biyabi.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import biyabi.R;

public class HomeFragment extends Fragment {
    private static final String TAG = HomeFragment.class.getName();
    private ViewPager mvpHome;
    private HomeAdapter adapter;
    private HomeRecommendFragment homeRecommendFragment;
    private BaseFragment[] fragmentArr;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_home, container, false);
        mvpHome = (ViewPager) layout.findViewById(R.id.vp_home);
        return layout;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        initFragment();
        fragmentArr[0].initData();
        setListener();
    }

    private void setListener() {

    }

    private void initFragment() {
        homeRecommendFragment = new HomeRecommendFragment();
        fragmentArr = new BaseFragment[]{homeRecommendFragment};
        adapter = new HomeAdapter(getActivity().getSupportFragmentManager(), fragmentArr);
        mvpHome.setAdapter(adapter);
        mvpHome.setCurrentItem(0);
    }

    private void initView() {

    }

    private class HomeAdapter extends FragmentPagerAdapter {
        private Fragment[] fragments;

        public HomeAdapter(FragmentManager fm, Fragment[] fragments) {
            super(fm);
            this.fragments = fragments;
        }

        @Override
        public Fragment getItem(int position) {
            return fragments[position];
        }

        @Override
        public int getCount() {
            return fragments.length;
        }
    }
}
