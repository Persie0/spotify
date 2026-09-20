package p204p;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class ah71 {

    /* JADX INFO: renamed from: a */
    public static final long f15634a;

    static {
        long id;
        try {
            id = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id = -1;
        }
        f15634a = id;
    }
}
