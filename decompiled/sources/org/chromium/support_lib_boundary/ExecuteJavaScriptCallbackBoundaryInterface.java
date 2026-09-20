package org.chromium.support_lib_boundary;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes11.dex */
public interface ExecuteJavaScriptCallbackBoundaryInterface {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ExecuteJavaScriptExceptionTypeBoundaryInterface {
        public static final int FRAME_DESTROYED = 1;
        public static final int GENERIC = 0;
    }

    void onFailure(int i, String str);

    void onSuccess(String str);
}
