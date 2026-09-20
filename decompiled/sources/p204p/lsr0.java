package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lsr0 extends usr0 {

    /* JADX INFO: renamed from: a */
    public final boolean f136590a;

    /* JADX INFO: renamed from: b */
    public final boolean f136591b;

    /* JADX INFO: renamed from: c */
    public final boolean f136592c;

    /* JADX INFO: renamed from: d */
    public final boolean f136593d;

    /* JADX INFO: renamed from: e */
    public final String f136594e;

    public lsr0(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f136590a = z;
        this.f136591b = z2;
        this.f136592c = z3;
        this.f136593d = z4;
        this.f136594e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsr0)) {
            return false;
        }
        lsr0 lsr0Var = (lsr0) obj;
        return this.f136590a == lsr0Var.f136590a && this.f136591b == lsr0Var.f136591b && this.f136592c == lsr0Var.f136592c && this.f136593d == lsr0Var.f136593d && wj50.m88271j(this.f136594e, lsr0Var.f136594e);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f136590a) * 31, 31, this.f136591b), 31, this.f136592c), 31, this.f136593d);
        String str = this.f136594e;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }
}
