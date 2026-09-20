package p204p;

import android.os.Trace;

/* JADX INFO: loaded from: classes11.dex */
public abstract class why0 implements AutoCloseable {
    /* JADX INFO: renamed from: a */
    public static void m88178a(String str) {
        if (str.length() > 127) {
            str = s571.m77250i(str.substring(0, 124), "...");
        }
        Trace.beginSection(str);
    }
}
