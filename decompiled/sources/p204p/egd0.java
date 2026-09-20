package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class egd0 {

    /* JADX INFO: renamed from: e */
    public static final String f59306e;

    /* JADX INFO: renamed from: f */
    public static final String f59307f;

    /* JADX INFO: renamed from: g */
    public static final String f59308g;

    /* JADX INFO: renamed from: h */
    public static final String f59309h;

    /* JADX INFO: renamed from: a */
    public final Bundle f59310a;

    /* JADX INFO: renamed from: b */
    public final boolean f59311b;

    /* JADX INFO: renamed from: c */
    public final boolean f59312c;

    /* JADX INFO: renamed from: d */
    public final boolean f59313d;

    static {
        String str = h0b1.f86200a;
        f59306e = Integer.toString(0, 36);
        f59307f = Integer.toString(1, 36);
        f59308g = Integer.toString(2, 36);
        f59309h = Integer.toString(3, 36);
    }

    public egd0(Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.f59310a = new Bundle(bundle);
        this.f59311b = z;
        this.f59312c = z2;
        this.f59313d = z3;
    }

    /* JADX INFO: renamed from: a */
    public static egd0 m38849a(Bundle bundle) {
        Bundle bundleM46328p = h0b1.m46328p(bundle.getBundle(f59306e));
        boolean z = bundle.getBoolean(f59307f, false);
        boolean z2 = bundle.getBoolean(f59308g, false);
        boolean z3 = bundle.getBoolean(f59309h, false);
        if (bundleM46328p == null) {
            bundleM46328p = Bundle.EMPTY;
        }
        return new egd0(bundleM46328p, z, z2, z3);
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m38850b() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f59306e, this.f59310a);
        bundle.putBoolean(f59307f, this.f59311b);
        bundle.putBoolean(f59308g, this.f59312c);
        bundle.putBoolean(f59309h, this.f59313d);
        return bundle;
    }
}
