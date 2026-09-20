package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@rtz0
public final class xhv0 {
    public static final whv0 Companion = new whv0();

    /* JADX INFO: renamed from: g */
    public static final fr70[] f261714g = {null, null, q3d0.m72078I(2, o5t0.f162078Y0), q3d0.m72078I(2, o5t0.f162080Z0), null, null};

    /* JADX INFO: renamed from: a */
    public final String f261715a;

    /* JADX INFO: renamed from: b */
    public final int f261716b;

    /* JADX INFO: renamed from: c */
    public final Set f261717c;

    /* JADX INFO: renamed from: d */
    public final Set f261718d;

    /* JADX INFO: renamed from: e */
    public final String f261719e;

    /* JADX INFO: renamed from: f */
    public final boolean f261720f;

    public /* synthetic */ xhv0(int i, String str, int i2, Set set, Set set2, String str2, boolean z) {
        if (2 != (i & 2)) {
            edo.m38617p(i, 2, vhv0.f241560a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f261715a = null;
        } else {
            this.f261715a = str;
        }
        this.f261716b = i2;
        if ((i & 4) == 0) {
            this.f261717c = null;
        } else {
            this.f261717c = set;
        }
        if ((i & 8) == 0) {
            this.f261718d = null;
        } else {
            this.f261718d = set2;
        }
        if ((i & 16) == 0) {
            this.f261719e = null;
        } else {
            this.f261719e = str2;
        }
        if ((i & 32) == 0) {
            this.f261720f = true;
        } else {
            this.f261720f = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhv0)) {
            return false;
        }
        xhv0 xhv0Var = (xhv0) obj;
        return wj50.m88271j(this.f261715a, xhv0Var.f261715a) && this.f261716b == xhv0Var.f261716b && wj50.m88271j(this.f261717c, xhv0Var.f261717c) && wj50.m88271j(this.f261718d, xhv0Var.f261718d) && wj50.m88271j(this.f261719e, xhv0Var.f261719e) && this.f261720f == xhv0Var.f261720f;
    }

    public final int hashCode() {
        String str = this.f261715a;
        int iM62800g = mt60.m62800g(this.f261716b, (str == null ? 0 : str.hashCode()) * 31, 31);
        Set set = this.f261717c;
        int iHashCode = (iM62800g + (set == null ? 0 : set.hashCode())) * 31;
        Set set2 = this.f261718d;
        int iHashCode2 = (iHashCode + (set2 == null ? 0 : set2.hashCode())) * 31;
        String str2 = this.f261719e;
        return Boolean.hashCode(this.f261720f) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public xhv0(int i, String str, String str2, Set set, Set set2) {
        this.f261715a = str;
        this.f261716b = i;
        this.f261717c = set;
        this.f261718d = set2;
        this.f261719e = str2;
        this.f261720f = true;
    }
}
