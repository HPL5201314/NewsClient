package com.example.admin.newsclient.module.photo.model;

import com.example.admin.newsclient.callback.RequestCallback;

import rx.Subscription;

/**
 * ClassName: IPhotoDetailInteractor<p>
 * Author: oubowu<p>
 * Fuction: 图片详情的Model层接口<p>
 * CreateDate: 2016/2/22 17:47<p>
 * UpdateUser: <p>
 * UpdateDate: <p>
 */
public interface IPhotoDetailInteractor<T> {

    Subscription requestPhotoDetail(RequestCallback<T> callback, String id);

}
