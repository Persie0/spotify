package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public final class sh50 {

    /* JADX INFO: renamed from: a */
    public final k7i0 f209103a;

    /* JADX INFO: renamed from: b */
    public final boolean f209104b;

    /* JADX INFO: renamed from: c */
    public final ig21 f209105c;

    /* JADX INFO: renamed from: d */
    public final boolean f209106d;

    /* JADX INFO: renamed from: e */
    public final long f209107e;

    /* JADX INFO: renamed from: f */
    public final long f209108f;

    /* JADX INFO: renamed from: g */
    public final float f209109g;

    /* JADX INFO: renamed from: h */
    public final long f209110h;

    /* JADX INFO: renamed from: i */
    public final j9c1 f209111i;

    public sh50(k7i0 k7i0Var, boolean z, ig21 ig21Var, boolean z2, long j, long j2, float f, long j3, j9c1 j9c1Var) {
        this.f209103a = k7i0Var;
        this.f209104b = z;
        this.f209105c = ig21Var;
        this.f209106d = z2;
        this.f209107e = j;
        this.f209108f = j2;
        this.f209109g = f;
        this.f209110h = j3;
        this.f209111i = j9c1Var;
    }

    /* JADX INFO: renamed from: a */
    public static sh50 m78126a(sh50 sh50Var, k7i0 k7i0Var, boolean z, ig21 ig21Var, boolean z2, long j, long j2, float f, long j3, j9c1 j9c1Var, int i) {
        if ((i & 1) != 0) {
            k7i0Var = sh50Var.f209103a;
        }
        k7i0 k7i0Var2 = k7i0Var;
        if ((i & 2) != 0) {
            z = sh50Var.f209104b;
        }
        boolean z3 = z;
        ig21 ig21Var2 = (i & 4) != 0 ? sh50Var.f209105c : ig21Var;
        boolean z4 = (i & 8) != 0 ? sh50Var.f209106d : z2;
        long j4 = (i & 16) != 0 ? sh50Var.f209107e : j;
        long j5 = (i & 32) != 0 ? sh50Var.f209108f : j2;
        float f2 = (i & 64) != 0 ? sh50Var.f209109g : f;
        long j6 = (i & 128) != 0 ? sh50Var.f209110h : j3;
        j9c1 j9c1Var2 = (i & 256) != 0 ? sh50Var.f209111i : j9c1Var;
        sh50Var.getClass();
        return new sh50(k7i0Var2, z3, ig21Var2, z4, j4, j5, f2, j6, j9c1Var2);
    }

    /* JADX INFO: renamed from: b */
    public final k7i0 m78127b() {
        return this.f209103a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh50)) {
            return false;
        }
        sh50 sh50Var = (sh50) obj;
        return wj50.m88271j(this.f209103a, sh50Var.f209103a) && this.f209104b == sh50Var.f209104b && wj50.m88271j(this.f209105c, sh50Var.f209105c) && this.f209106d == sh50Var.f209106d && this.f209107e == sh50Var.f209107e && this.f209108f == sh50Var.f209108f && Float.compare(this.f209109g, sh50Var.f209109g) == 0 && this.f209110h == sh50Var.f209110h && wj50.m88271j(this.f209111i, sh50Var.f209111i);
    }

    public final int hashCode() {
        k7i0 k7i0Var = this.f209103a;
        int iM36605e = dq60.m36605e(AbstractC0000a.m8g(dq60.m36605e(dq60.m36605e(s571.m77245d((this.f209105c.hashCode() + s571.m77245d((k7i0Var == null ? 0 : k7i0Var.hashCode()) * 31, 31, this.f209104b)) * 31, 31, this.f209106d), this.f209107e, 31), this.f209108f, 31), 31, this.f209109g), this.f209110h, 31);
        j9c1 j9c1Var = this.f209111i;
        return iM36605e + (j9c1Var != null ? j9c1Var.hashCode() : 0);
    }
}
