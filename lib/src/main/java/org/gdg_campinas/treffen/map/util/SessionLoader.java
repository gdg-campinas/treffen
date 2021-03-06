/*
 * Copyright 2015 Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gdg_campinas.treffen.map.util;

import android.content.Context;
import android.net.Uri;
import android.support.v4.content.CursorLoader;

/**
 * Wrapper for CursorLoaders that need to pass room information.
 */
public abstract class SessionLoader extends CursorLoader {

    private final String mRoomTitle;
    private final String mRoomId;
    private final int mRoomType;
    private final String mIconType;

    public SessionLoader(Context context, String roomId, String roomTitle, int roomType,
                         String iconType, Uri uri, String[] projection, String selection,
                         String[] selectionArgs, String sortOrder) {
        super(context, uri, projection, selection, selectionArgs, sortOrder);
        mRoomId = roomId;
        mRoomTitle = roomTitle;
        mRoomType = roomType;
        mIconType = iconType;
    }

    public int getRoomType() {
        return mRoomType;
    }

    public String getRoomId() {
        return mRoomId;
    }

    public String getRoomTitle() {
        return mRoomTitle;
    }

    public String getIconType() {
        return mIconType;
    }
}
