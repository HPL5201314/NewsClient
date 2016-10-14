package com.example.admin.newsclient.module.photo.view;

import com.example.admin.newsclient.base.BaseView;
import com.example.admin.newsclient.bean.SinaPhotoList;
import com.example.admin.newsclient.common.DataLoadType;

import java.util.List;

/**
 * ClassName: IPhotoListView<p>
 * Author: oubowu<p>
 * Fuction: 图片新闻列表接口<p>
 * CreateDate: 2016/2/21 1:35<p>
 * UpdateUser: <p>
 * UpdateDate: <p>
 */
public interface IPhotoListView extends BaseView {

    void updatePhotoList(List<SinaPhotoList.DataEntity.PhotoListEntity> data, @DataLoadType.DataLoadTypeChecker int type);

}
