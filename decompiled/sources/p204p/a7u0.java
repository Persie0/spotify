package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a7u0 {

    /* JADX INFO: renamed from: a */
    public static final String f13140a;

    static {
        String str = h0b1.f86200a;
        f13140a = Integer.toString(0, 36);
    }

    /* JADX INFO: renamed from: a */
    public static a7u0 m24998a(Bundle bundle) {
        String str = f13140a;
        int i = bundle.getInt(str, -1);
        if (i == 0) {
            String str2 = xp20.f264411d;
            c95.m31843i(bundle.getInt(str, -1) == 0);
            return bundle.getBoolean(xp20.f264411d, false) ? new xp20(bundle.getBoolean(xp20.f264412e, false)) : new xp20();
        }
        if (i == 1) {
            String str3 = jln0.f113653c;
            c95.m31843i(bundle.getInt(str, -1) == 1);
            float f = bundle.getFloat(jln0.f113653c, -1.0f);
            return f == -1.0f ? new jln0() : new jln0(f);
        }
        if (i != 2) {
            if (i != 3) {
                throw new IllegalArgumentException(s571.m77246e(i, "Unknown RatingType: "));
            }
            String str4 = xh71.f261462d;
            c95.m31843i(bundle.getInt(str, -1) == 3);
            return bundle.getBoolean(xh71.f261462d, false) ? new xh71(bundle.getBoolean(xh71.f261463e, false)) : new xh71();
        }
        String str5 = vo41.f243365d;
        c95.m31843i(bundle.getInt(str, -1) == 2);
        int i2 = bundle.getInt(vo41.f243365d, 5);
        float f2 = bundle.getFloat(vo41.f243366e, -1.0f);
        return f2 == -1.0f ? new vo41(i2) : new vo41(i2, f2);
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo24999b();

    /* JADX INFO: renamed from: c */
    public abstract Bundle mo25000c();
}
