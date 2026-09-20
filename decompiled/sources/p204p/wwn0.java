package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class wwn0 {

    /* JADX INFO: renamed from: a */
    public final int f255794a;

    /* JADX INFO: renamed from: b */
    public final int f255795b;

    /* JADX INFO: renamed from: c */
    public final boolean f255796c;

    /* JADX INFO: renamed from: d */
    public final boolean f255797d;

    /* JADX INFO: renamed from: e */
    public final boolean f255798e;

    /* JADX INFO: renamed from: f */
    public final String f255799f;

    /* JADX INFO: renamed from: g */
    public final String f255800g;

    /* JADX INFO: renamed from: h */
    public final int f255801h;

    public wwn0(int i, int i2, boolean z, boolean z2, boolean z3, String str, String str2, int i3) {
        this.f255794a = i;
        this.f255795b = i2;
        this.f255796c = z;
        this.f255797d = z2;
        this.f255798e = z3;
        this.f255799f = str;
        this.f255800g = str2;
        this.f255801h = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwn0)) {
            return false;
        }
        wwn0 wwn0Var = (wwn0) obj;
        return this.f255794a == wwn0Var.f255794a && this.f255795b == wwn0Var.f255795b && this.f255796c == wwn0Var.f255796c && this.f255797d == wwn0Var.f255797d && this.f255798e == wwn0Var.f255798e && wj50.m88271j(this.f255799f, wwn0Var.f255799f) && wj50.m88271j(this.f255800g, wwn0Var.f255800g) && this.f255801h == wwn0Var.f255801h;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(mt60.m62800g(this.f255795b, Integer.hashCode(this.f255794a) * 31, 31), 31, this.f255796c), 31, this.f255797d), 31, this.f255798e);
        String str = this.f255799f;
        int iHashCode = (iM77245d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f255800g;
        return Integer.hashCode(this.f255801h) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
