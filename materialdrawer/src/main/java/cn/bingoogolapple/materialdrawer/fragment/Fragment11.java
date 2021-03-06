package cn.bingoogolapple.materialdrawer.fragment;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import cn.bingoogolapple.basenote.util.SkinUtil;
import cn.bingoogolapple.materialdrawer.R;
import cn.bingoogolapple.materialdrawer.activity.TestToolbarActivity;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:16/1/11 下午1:39
 * 描述:
 */
public class Fragment11 extends BaseMainFragment {

    @Override
    protected void initView(Bundle savedInstanceState) {
        setContentView(R.layout.fragment_11);
    }

    @Override
    protected void setListener() {
        setOnClickListener(R.id.testToolbarActivity);
        setOnClickListener(R.id.changeToOrange);
    }

    @Override
    protected void processLogic(Bundle savedInstanceState) {
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_changetoback1, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.changetoback1) {
            mMainActivity.putBackFragment(new FragmentBack1());
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onStart() {
        super.onStart();
        mMainActivity.changeNavIconToMenu(mToolbar);
        setTitle(R.string.menu_11);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.testToolbarActivity) {
            mActivity.forward(TestToolbarActivity.class);
        } else if (v.getId() == R.id.changeToOrange) {
            SkinUtil.changeToOrange(mActivity);
        }
    }
}
