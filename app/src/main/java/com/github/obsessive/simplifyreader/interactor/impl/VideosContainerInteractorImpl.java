/*
 * Copyright (c) 2015 [1076559197@qq.com | tchen0707@gmail.com]
 *
 * Licensed under the Apache License, Version 2.0 (the "License”);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.obsessive.simplifyreader.interactor.impl;

import android.content.Context;

import com.github.obsessive.simplifyreader.R;
import com.github.obsessive.simplifyreader.bean.BaseEntity;
import com.github.obsessive.simplifyreader.interactor.CommonContainerInteractor;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:  Tau.Chen
 * Email:   1076559197@qq.com | tauchen1990@gmail.com
 * Date:    2015/4/9.
 * Description:
 */
public class VideosContainerInteractorImpl implements CommonContainerInteractor {
    @Override
    public List<BaseEntity> getCommonCategoryList(Context context) {
        List<BaseEntity> resultData = new ArrayList<>();
        String[] videosCategoryArray = context.getResources().getStringArray(R.array.videos_category_list);
        resultData.add(new BaseEntity(videosCategoryArray[0], videosCategoryArray[0]));
        resultData.add(new BaseEntity(videosCategoryArray[1], videosCategoryArray[1]));
        resultData.add(new BaseEntity(videosCategoryArray[2], videosCategoryArray[2]));
        resultData.add(new BaseEntity(videosCategoryArray[3], videosCategoryArray[3]));
        return resultData;
    }
}
