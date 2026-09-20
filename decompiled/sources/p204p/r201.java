package p204p;

import android.os.Bundle;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class r201 {

    /* JADX INFO: renamed from: e */
    public static final String f194999e;

    /* JADX INFO: renamed from: f */
    public static final String f195000f;

    /* JADX INFO: renamed from: g */
    public static final String f195001g;

    /* JADX INFO: renamed from: h */
    public static final String f195002h;

    /* JADX INFO: renamed from: a */
    public final int f195003a;

    /* JADX INFO: renamed from: b */
    public final Bundle f195004b;

    /* JADX INFO: renamed from: c */
    public final long f195005c;

    /* JADX INFO: renamed from: d */
    public final h001 f195006d;

    static {
        String str = h0b1.f86200a;
        f194999e = Integer.toString(0, 36);
        f195000f = Integer.toString(1, 36);
        f195001g = Integer.toString(2, 36);
        f195002h = Integer.toString(3, 36);
    }

    public r201(int i) {
        this(i, Bundle.EMPTY);
    }

    /* JADX INFO: renamed from: a */
    public static r201 m74501a(Bundle bundle) {
        h001 h001Var;
        int i = bundle.getInt(f194999e, -1);
        Bundle bundleM46328p = h0b1.m46328p(bundle.getBundle(f195000f));
        long j = bundle.getLong(f195001g, SystemClock.elapsedRealtime());
        Bundle bundle2 = bundle.getBundle(f195002h);
        if (bundle2 != null) {
            h001Var = h001.m46234a(bundle2);
        } else {
            h001Var = i != 0 ? new h001(i) : null;
        }
        h001 h001Var2 = h001Var;
        if (bundleM46328p == null) {
            bundleM46328p = Bundle.EMPTY;
        }
        return new r201(i, bundleM46328p, j, h001Var2);
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m74502b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f194999e, this.f195003a);
        bundle.putBundle(f195000f, this.f195004b);
        bundle.putLong(f195001g, this.f195005c);
        h001 h001Var = this.f195006d;
        if (h001Var != null) {
            bundle.putBundle(f195002h, h001Var.m46235b());
        }
        return bundle;
    }

    public r201(int i, Bundle bundle) {
        this(i, bundle, SystemClock.elapsedRealtime(), null);
    }

    public r201(int i, Bundle bundle, long j, h001 h001Var) {
        boolean z = true;
        if (h001Var != null && i >= 0 && i != 1) {
            z = false;
        }
        c95.m31843i(z);
        this.f195003a = i;
        this.f195004b = new Bundle(bundle);
        this.f195005c = j;
        if (h001Var == null && i < 0) {
            h001Var = new h001(i);
        }
        this.f195006d = h001Var;
    }
}
