package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class kzi {

    /* JADX INFO: renamed from: g */
    public static final String f128125g;

    /* JADX INFO: renamed from: h */
    public static final String f128126h;

    /* JADX INFO: renamed from: i */
    public static final String f128127i;

    /* JADX INFO: renamed from: j */
    public static final String f128128j;

    /* JADX INFO: renamed from: k */
    public static final String f128129k;

    /* JADX INFO: renamed from: l */
    public static final String f128130l;

    /* JADX INFO: renamed from: a */
    public final int f128131a;

    /* JADX INFO: renamed from: b */
    public final int f128132b;

    /* JADX INFO: renamed from: c */
    public final String f128133c;

    /* JADX INFO: renamed from: d */
    public final int f128134d;

    /* JADX INFO: renamed from: e */
    public final Bundle f128135e;

    /* JADX INFO: renamed from: f */
    public final int f128136f;

    static {
        String str = h0b1.f86200a;
        f128125g = Integer.toString(0, 36);
        f128126h = Integer.toString(1, 36);
        f128127i = Integer.toString(2, 36);
        f128128j = Integer.toString(3, 36);
        f128129k = Integer.toString(4, 36);
        f128130l = Integer.toString(5, 36);
    }

    public kzi(int i, int i2, String str, int i3, Bundle bundle, int i4) {
        this.f128131a = i;
        this.f128132b = i2;
        this.f128133c = str;
        this.f128134d = i3;
        this.f128135e = bundle;
        this.f128136f = i4;
    }

    /* JADX INFO: renamed from: a */
    public static kzi m57757a(Bundle bundle) {
        int i = bundle.getInt(f128125g, 0);
        int i2 = bundle.getInt(f128129k, 0);
        String string = bundle.getString(f128126h);
        string.getClass();
        String str = f128127i;
        c95.m31843i(bundle.containsKey(str));
        int i3 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f128128j);
        int i4 = bundle.getInt(f128130l, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new kzi(i, i2, string, i3, bundle2, i4);
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m57758b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f128125g, this.f128131a);
        bundle.putString(f128126h, this.f128133c);
        bundle.putInt(f128127i, this.f128134d);
        bundle.putBundle(f128128j, this.f128135e);
        bundle.putInt(f128129k, this.f128132b);
        bundle.putInt(f128130l, this.f128136f);
        return bundle;
    }
}
