package p204p;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public abstract class qa81 {
    /* JADX INFO: renamed from: a */
    public static void m72417a(String str, int i) {
        Trace.beginAsyncSection(str, i);
    }

    /* JADX INFO: renamed from: b */
    public static void m72418b(String str, int i) {
        Trace.endAsyncSection(str, i);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m72419c() {
        return Trace.isEnabled();
    }

    /* JADX INFO: renamed from: d */
    public static void m72420d(int i, String str) {
        Trace.setCounter(str, i);
    }
}
