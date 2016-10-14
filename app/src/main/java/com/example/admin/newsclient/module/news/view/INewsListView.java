package com.example.admin.newsclient.module.news.view;

import com.example.admin.newsclient.base.BaseView;
import com.example.admin.newsclient.bean.NeteastNewsSummary;
import com.example.admin.newsclient.common.DataLoadType;

import java.util.List;

/**
 * ClassName: INewsListView<p>
 * Author: oubowu<p>
 * Fuction: 新闻列表视图接口<p>
 * CreateDate: 2016/2/18 14:42<p>
 * UpdateUser: <p>
 * UpdateDate: <p>
 */
public interface INewsListView extends BaseView {

    void updateNewsList(List<NeteastNewsSummary> data, @DataLoadType.DataLoadTypeChecker int type);

}
