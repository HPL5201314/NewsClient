package com.example.admin.newsclient.module.photo.presenter;

import com.example.admin.newsclient.base.BasePresenterImpl;
import com.example.admin.newsclient.bean.SinaPhotoDetail;
import com.example.admin.newsclient.module.photo.model.IPhotoDetailInteractor;
import com.example.admin.newsclient.module.photo.model.IPhotoDetailInteractorImpl;
import com.example.admin.newsclient.module.photo.view.IPhotoDetailView;

/**
 * ClassName: IPhotoDetailPresenterImpl<p>
 * Author: oubowu<p>
 * Fuction: 图片详情代理接口实现<p>
 * CreateDate: 2016/2/22 17:46<p>
 * UpdateUser: <p>
 * UpdateDate: <p>
 */
public class IPhotoDetailPresenterImpl extends BasePresenterImpl<IPhotoDetailView, SinaPhotoDetail>
        implements IPhotoDetailPresenter {

    private IPhotoDetailInteractor<SinaPhotoDetail> mDetailInteractor;

    public IPhotoDetailPresenterImpl(IPhotoDetailView view, String id, SinaPhotoDetail data) {
        super(view);
        mDetailInteractor = new IPhotoDetailInteractorImpl();
        if (data != null) {
            mView.initViewPager(data);
        } else {
            mSubscription = mDetailInteractor.requestPhotoDetail(this, id);
        }
    }

    @Override
    public void requestSuccess(SinaPhotoDetail data) {
        mView.initViewPager(data);
    }
}
