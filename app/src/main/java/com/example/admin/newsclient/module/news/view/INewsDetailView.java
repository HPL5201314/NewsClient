package com.example.admin.newsclient.module.news.view;

import com.example.admin.newsclient.base.BaseView;
import com.example.admin.newsclient.bean.NeteastNewsDetail;

/**
 * ClassName: INewsDetailView<p>
 * Author: oubowu<p>
 * Fuction: 新闻详情视图接口<p>
 * CreateDate: 2016/2/19 14:52<p>
 * UpdateUser: <p>
 * UpdateDate: <p>
 */
public interface INewsDetailView extends BaseView{

    void initNewsDetail(NeteastNewsDetail data);

}
