package com.example.admin.newsclient.module.photo.presenter;

import com.example.admin.newsclient.base.BasePresenter;

/**
 * ClassName: IPhotoListPresenter<p>
 * Author: oubowu<p>
 * Fuction: 图片列表代理接口<p>
 * CreateDate: 2016/2/21 16:15<p>
 * UpdateUser: <p>
 * UpdateDate: <p>
 */
public interface IPhotoListPresenter extends BasePresenter {

    void refreshData();

    void loadMoreData();

}
