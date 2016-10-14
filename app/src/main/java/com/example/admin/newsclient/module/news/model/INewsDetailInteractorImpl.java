package com.example.admin.newsclient.module.news.model;

import com.example.admin.newsclient.base.BaseSubscriber;
import com.example.admin.newsclient.bean.NeteastNewsDetail;
import com.example.admin.newsclient.callback.RequestCallback;
import com.example.admin.newsclient.http.HostType;
import com.example.admin.newsclient.http.manager.RetrofitManager;

import java.util.Map;

import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;

/**
 * ClassName: INewsDetailInteractorImpl<p>
 * Author: oubowu<p>
 * Fuction: 新闻详情的Model层接口实现<p>
 * CreateDate: 2016/2/19 21:02<p>
 * UpdateUser: <p>
 * UpdateDate: <p>
 */
public class INewsDetailInteractorImpl implements INewsDetailInteractor<NeteastNewsDetail> {

    @Override
    public Subscription requestNewsDetail(final RequestCallback<NeteastNewsDetail> callback, final String id) {
        return RetrofitManager.getInstance(HostType.NETEASE_NEWS_VIDEO).getNewsDetailObservable(id)
                /*.doOnSubscribe(new Action0() {
                    @Override
                    public void call() {
                        callback.beforeRequest();
                    }
                })*/.subscribeOn(AndroidSchedulers.mainThread())
                .map(new Func1<Map<String, NeteastNewsDetail>, NeteastNewsDetail>() {
                    @Override
                    public NeteastNewsDetail call(Map<String, NeteastNewsDetail> map) {
                        return map.get(id);
                    }
                }).subscribe(new BaseSubscriber<NeteastNewsDetail>(callback));
                /*.subscribe(new Subscriber<NeteastNewsDetail>() {
                    @Override
                    public void onCompleted() {
                        callback.requestComplete();
                    }

                    @Override
                    public void onError(Throwable e) {
                        KLog.e(e.getLocalizedMessage() + "\n" + e);
                        callback.requestError(e.getLocalizedMessage() + "\n" + e);
                    }

                    @Override
                    public void onNext(NeteastNewsDetail neteastNewsDetail) {
                        callback.requestSuccess(neteastNewsDetail);
                    }
                });*/
    }

}
