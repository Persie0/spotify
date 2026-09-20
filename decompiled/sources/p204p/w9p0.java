package p204p;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public final class w9p0 {

    /* JADX INFO: renamed from: c */
    public static final w9p0 f249227c = new w9p0("");

    /* JADX INFO: renamed from: d */
    public static final w9p0 f249228d = new w9p0("preload");

    /* JADX INFO: renamed from: a */
    public final String f249229a;

    /* JADX INFO: renamed from: b */
    public final t1j f249230b;

    public w9p0(String str) {
        this.f249229a = str;
        this.f249230b = Build.VERSION.SDK_INT >= 31 ? new t1j(3) : null;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized LogSessionId m87525a() {
        t1j t1jVar;
        t1jVar = this.f249230b;
        t1jVar.getClass();
        return (LogSessionId) t1jVar.f216285b;
    }
}
