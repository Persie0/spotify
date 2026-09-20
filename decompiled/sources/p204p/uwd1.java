package p204p;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public abstract class uwd1 {

    /* JADX INFO: renamed from: a */
    public static final float f234634a = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: b */
    public static final double f234635b;

    /* JADX INFO: renamed from: c */
    public static final double f234636c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f234635b = dLog;
        f234636c = dLog - 1.0d;
    }
}
