package p204p;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zg71 {

    /* JADX INFO: renamed from: a */
    public static final Handler f282542a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    public static void m96049a() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Not running on main thread when it is required to");
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m96050b(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            f282542a.post(runnable);
        }
    }
}
