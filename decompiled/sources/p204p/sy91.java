package p204p;

import android.os.Build;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class sy91 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m79677a() {
        int i = Build.VERSION.SDK_INT;
        return i < 36 ? i * 100000 : Build.VERSION.SDK_INT_FULL;
    }
}
