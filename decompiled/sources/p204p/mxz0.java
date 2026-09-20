package p204p;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class mxz0 {

    /* JADX INFO: renamed from: d */
    public static final wsv0 f148226d;

    /* JADX INFO: renamed from: e */
    public static final wsv0 f148227e;

    /* JADX INFO: renamed from: f */
    public static final wsv0 f148228f;

    /* JADX INFO: renamed from: g */
    public static final wsv0 f148229g;

    /* JADX INFO: renamed from: h */
    public static final String f148230h;

    /* JADX INFO: renamed from: i */
    public static final String f148231i;

    /* JADX INFO: renamed from: j */
    public static final String f148232j;

    /* JADX INFO: renamed from: a */
    public final int f148233a;

    /* JADX INFO: renamed from: b */
    public final String f148234b;

    /* JADX INFO: renamed from: c */
    public final Bundle f148235c;

    static {
        kf40 kf40Var = pf40.f176960b;
        wsv0 wsv0Var = wsv0.f254763e;
        f148226d = wsv0Var;
        f148227e = pf40.m69794t(40010);
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        jhl0.m53416j(objArr);
        f148228f = pf40.m69787l(7, objArr);
        f148229g = wsv0Var;
        String str = h0b1.f86200a;
        f148230h = Integer.toString(0, 36);
        f148231i = Integer.toString(1, 36);
        f148232j = Integer.toString(2, 36);
    }

    public mxz0(int i) {
        c95.m31844j(i != 0, "commandCode shouldn't be COMMAND_CODE_CUSTOM");
        this.f148233a = i;
        this.f148234b = "";
        this.f148235c = Bundle.EMPTY;
    }

    /* JADX INFO: renamed from: a */
    public static mxz0 m63117a(Bundle bundle) {
        int i = bundle.getInt(f148230h, 0);
        if (i != 0) {
            return new mxz0(i);
        }
        String string = bundle.getString(f148231i);
        string.getClass();
        Bundle bundleM46328p = h0b1.m46328p(bundle.getBundle(f148232j));
        if (bundleM46328p == null) {
            bundleM46328p = Bundle.EMPTY;
        }
        return new mxz0(string, bundleM46328p);
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m63118b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f148230h, this.f148233a);
        bundle.putString(f148231i, this.f148234b);
        bundle.putBundle(f148232j, this.f148235c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mxz0)) {
            return false;
        }
        mxz0 mxz0Var = (mxz0) obj;
        return this.f148233a == mxz0Var.f148233a && TextUtils.equals(this.f148234b, mxz0Var.f148234b);
    }

    public final int hashCode() {
        return Objects.hash(this.f148234b, Integer.valueOf(this.f148233a));
    }

    public mxz0(String str, Bundle bundle) {
        this.f148233a = 0;
        str.getClass();
        this.f148234b = str;
        bundle.getClass();
        this.f148235c = new Bundle(bundle);
    }
}
