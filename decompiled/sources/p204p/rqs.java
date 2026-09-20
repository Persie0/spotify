package p204p;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rqs {

    /* JADX INFO: renamed from: a */
    public static final float f201876a = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: b */
    public static final double f201877b;

    /* JADX INFO: renamed from: c */
    public static final double f201878c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f201877b = dLog;
        f201878c = dLog - 1.0d;
    }
}
