package p204p;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;

/* JADX INFO: loaded from: classes.dex */
public abstract class zb40 {

    /* JADX INFO: renamed from: a */
    public static final skp f281236a;

    /* JADX INFO: renamed from: b */
    public static final skp f281237b;

    /* JADX INFO: renamed from: c */
    public static final skp f281238c;

    /* JADX INFO: renamed from: d */
    public static final skp f281239d;

    /* JADX INFO: renamed from: e */
    public static final skp f281240e;

    /* JADX INFO: renamed from: f */
    public static final skp f281241f;

    /* JADX INFO: renamed from: g */
    public static final skp f281242g;

    static {
        int i = 7;
        f281236a = new skp(r691.f196215a, i);
        f281237b = new skp(h1b1.f86552b, i);
        Object obj = null;
        f281238c = new skp(obj, 7);
        Boolean bool = Boolean.TRUE;
        int i2 = 7;
        f281239d = new skp(bool, i2);
        f281240e = new skp(obj, i2);
        int i3 = 7;
        f281241f = new skp(bool, i3);
        f281242g = new skp(Boolean.FALSE, i3);
    }

    /* JADX INFO: renamed from: a */
    public static final Bitmap.Config m95822a(ivl0 ivl0Var) {
        return (Bitmap.Config) zuj0.m97055r(ivl0Var, f281237b);
    }

    /* JADX INFO: renamed from: b */
    public static final ColorSpace m95823b(ivl0 ivl0Var) {
        return gx31.m46004j(zuj0.m97055r(ivl0Var, f281238c));
    }
}
