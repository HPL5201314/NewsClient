package com.example.admin.newsclient.module.photo.ui;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.example.admin.newsclient.R;
import com.example.admin.newsclient.annotation.ActivityFragmentInject;
import com.example.admin.newsclient.base.BaseActivity;
import com.example.admin.newsclient.base.BaseFragment;
import com.example.admin.newsclient.base.BaseFragmentAdapter;
import com.example.admin.newsclient.http.Api;
import com.example.admin.newsclient.module.photo.presenter.IPhotoPresenter;
import com.example.admin.newsclient.module.photo.presenter.IPhotoPresenterImpl;
import com.example.admin.newsclient.module.photo.view.IPhotoView;
import com.example.admin.newsclient.utils.ViewUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: PhotoActivity<p>
 * Author: oubowu<p>
 * Fuction: 图片新闻界面<p>
 * CreateDate: 2016/2/21 16:13<p>
 * UpdateUser: <p>
 * UpdateDate: <p>
 */
@ActivityFragmentInject(contentViewId = R.layout.activity_photo,
        menuId = R.menu.menu_photo,
        hasNavigationView = true,
        toolbarTitle = R.string.photo,
        toolbarIndicator = R.drawable.ic_list_white,
        menuDefaultCheckedItem = R.id.action_photo)
public class PhotoActivity extends BaseActivity<IPhotoPresenter> implements IPhotoView {

    @Override
    protected void initView() {

        mPresenter = new IPhotoPresenterImpl(this);

    }

    @Override
    public void initViewPager() {
        final TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        List<BaseFragment> fragments = new ArrayList<>();
        final List<String> title = Arrays.asList("精选", "趣图", "美图", "故事");

        fragments.add(PhotoListFragment.newInstance(Api.SINA_PHOTO_CHOICE_ID, 0));
        fragments.add(PhotoListFragment.newInstance(Api.SINAD_PHOTO_FUN_ID, 1));
        fragments.add(PhotoListFragment.newInstance(Api.SINAD_PHOTO_PRETTY_ID, 2));
        fragments.add(PhotoListFragment.newInstance(Api.SINA_PHOTO_STORY_ID, 3));

        BaseFragmentAdapter adapter = new BaseFragmentAdapter(getSupportFragmentManager(), fragments,
                title);
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
        ViewUtil.dynamicSetTabLayoutMode(tabLayout);

        setOnTabSelectEvent(viewPager, tabLayout);

    }

}
