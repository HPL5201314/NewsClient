package com.example.admin.newsclient.module.photo.view;

import com.example.admin.newsclient.base.BaseView;
import com.example.admin.newsclient.bean.SinaPhotoDetail;

/**
 * ClassName: IPhotoDetailView<p>
 * Author: oubowu<p>
 * Fuction: 图片新闻详情视图接口<p>
 * CreateDate: 2016/2/21 1:35<p>
 * UpdateUser: <p>
 * UpdateDate: <p>
 */
public interface IPhotoDetailView extends BaseView {

    void initViewPager(SinaPhotoDetail photoList);

}
