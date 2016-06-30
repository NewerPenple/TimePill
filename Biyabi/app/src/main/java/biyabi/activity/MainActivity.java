package biyabi.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import biyabi.R;
import biyabi.fragment.HomeFragment;

public class MainActivity extends AppCompatActivity {
    private LinearLayout mLayoutmenu;
    private Button mbtnHome,mbtnSearch,mbtnShare,mbtnCart,mbtnUser;
    private FrameLayout mLayoutContainer;
    private HomeFragment mHomeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initData() {
        getSupportFragmentManager().beginTransaction()
                .add(R.id.layout_main_container, mHomeFragment)
                .show(mHomeFragment).commit();
    }

    private void initView() {
        mLayoutmenu = (LinearLayout) findViewById(R.id.layout_main_menu);
        mbtnHome = (Button) findViewById(R.id.btn_main_home);
        mbtnSearch = (Button) findViewById(R.id.btn_main_search);
        mbtnShare = (Button) findViewById(R.id.btn_main_share);
        mbtnCart = (Button) findViewById(R.id.btn_main_cart);
        mbtnUser = (Button) findViewById(R.id.btn_main_user);
        mLayoutContainer = (FrameLayout) findViewById(R.id.layout_main_container);
        mHomeFragment = new HomeFragment();
    }
}
