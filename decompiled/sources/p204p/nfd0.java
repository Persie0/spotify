package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class nfd0 {

    /* JADX INFO: renamed from: f */
    public static final nfd0 f153322f = new nfd0(new mfd0());

    /* JADX INFO: renamed from: g */
    public static final String f153323g;

    /* JADX INFO: renamed from: h */
    public static final String f153324h;

    /* JADX INFO: renamed from: i */
    public static final String f153325i;

    /* JADX INFO: renamed from: j */
    public static final String f153326j;

    /* JADX INFO: renamed from: k */
    public static final String f153327k;

    /* JADX INFO: renamed from: a */
    public final long f153328a;

    /* JADX INFO: renamed from: b */
    public final long f153329b;

    /* JADX INFO: renamed from: c */
    public final long f153330c;

    /* JADX INFO: renamed from: d */
    public final float f153331d;

    /* JADX INFO: renamed from: e */
    public final float f153332e;

    static {
        String str = h0b1.f86200a;
        f153323g = Integer.toString(0, 36);
        f153324h = Integer.toString(1, 36);
        f153325i = Integer.toString(2, 36);
        f153326j = Integer.toString(3, 36);
        f153327k = Integer.toString(4, 36);
    }

    public nfd0(mfd0 mfd0Var) {
        long j = mfd0Var.f143041a;
        long j2 = mfd0Var.f143042b;
        long j3 = mfd0Var.f143043c;
        float f = mfd0Var.f143044d;
        float f2 = mfd0Var.f143045e;
        this.f153328a = j;
        this.f153329b = j2;
        this.f153330c = j3;
        this.f153331d = f;
        this.f153332e = f2;
    }

    /* JADX INFO: renamed from: b */
    public static nfd0 m64339b(Bundle bundle) {
        mfd0 mfd0Var = new mfd0();
        nfd0 nfd0Var = f153322f;
        mfd0Var.f143041a = bundle.getLong(f153323g, nfd0Var.f153328a);
        mfd0Var.f143042b = bundle.getLong(f153324h, nfd0Var.f153329b);
        mfd0Var.f143043c = bundle.getLong(f153325i, nfd0Var.f153330c);
        mfd0Var.f143044d = bundle.getFloat(f153326j, nfd0Var.f153331d);
        mfd0Var.f143045e = bundle.getFloat(f153327k, nfd0Var.f153332e);
        return new nfd0(mfd0Var);
    }

    /* JADX INFO: renamed from: a */
    public final mfd0 m64340a() {
        mfd0 mfd0Var = new mfd0();
        mfd0Var.f143041a = this.f153328a;
        mfd0Var.f143042b = this.f153329b;
        mfd0Var.f143043c = this.f153330c;
        mfd0Var.f143044d = this.f153331d;
        mfd0Var.f143045e = this.f153332e;
        return mfd0Var;
    }

    /* JADX INFO: renamed from: c */
    public final Bundle m64341c() {
        Bundle bundle = new Bundle();
        nfd0 nfd0Var = f153322f;
        long j = nfd0Var.f153328a;
        long j2 = this.f153328a;
        if (j2 != j) {
            bundle.putLong(f153323g, j2);
        }
        long j3 = nfd0Var.f153329b;
        long j4 = this.f153329b;
        if (j4 != j3) {
            bundle.putLong(f153324h, j4);
        }
        long j5 = nfd0Var.f153330c;
        long j6 = this.f153330c;
        if (j6 != j5) {
            bundle.putLong(f153325i, j6);
        }
        float f = nfd0Var.f153331d;
        float f2 = this.f153331d;
        if (f2 != f) {
            bundle.putFloat(f153326j, f2);
        }
        float f3 = nfd0Var.f153332e;
        float f4 = this.f153332e;
        if (f4 != f3) {
            bundle.putFloat(f153327k, f4);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfd0)) {
            return false;
        }
        nfd0 nfd0Var = (nfd0) obj;
        return this.f153328a == nfd0Var.f153328a && this.f153329b == nfd0Var.f153329b && this.f153330c == nfd0Var.f153330c && this.f153331d == nfd0Var.f153331d && this.f153332e == nfd0Var.f153332e;
    }

    public final int hashCode() {
        long j = this.f153328a;
        long j2 = this.f153329b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f153330c;
        int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
        float f = this.f153331d;
        int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.f153332e;
        return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }
}
