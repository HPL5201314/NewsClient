package com.example.admin.newsclient.module.news.presenter;

import com.example.admin.newsclient.base.BasePresenterImpl;
import com.example.admin.newsclient.bean.NeteastNewsDetail;
import com.example.admin.newsclient.module.news.model.INewsDetailInteractor;
import com.example.admin.newsclient.module.news.model.INewsDetailInteractorImpl;
import com.example.admin.newsclient.module.news.view.INewsDetailView;

/**
 * ClassName: INewsDetailPresenterImpl<p>
 * Author: oubowu<p>
 * Fuction: 新闻详情代理接口实现<p>
 * CreateDate: 2016/2/19 21:11<p>
 * UpdateUser: <p>
 * UpdateDate: <p>
 */
public class INewsDetailPresenterImpl extends BasePresenterImpl<INewsDetailView, NeteastNewsDetail>
        implements INewsDetailPresenter {

    public INewsDetailPresenterImpl(INewsDetailView newsDetailView, String postId) {
        super(newsDetailView);
        INewsDetailInteractor<NeteastNewsDetail> newsDetailInteractor = new INewsDetailInteractorImpl();
        mSubscription = newsDetailInteractor.requestNewsDetail(this, postId);
    }

    @Override
    public void requestSuccess(NeteastNewsDetail data) {
        mView.initNewsDetail(data);
    }
}
