package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class u1d1 {

    /* JADX INFO: renamed from: a */
    public final String f225760a;

    /* JADX INFO: renamed from: b */
    public final String f225761b;

    /* JADX INFO: renamed from: c */
    public final String f225762c;

    /* JADX INFO: renamed from: d */
    public final String f225763d;

    /* JADX INFO: renamed from: e */
    public final int f225764e;

    public u1d1(int i, String str, String str2, String str3, String str4) {
        this.f225760a = str;
        this.f225761b = str2;
        this.f225762c = str3;
        this.f225763d = str4;
        this.f225764e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1d1)) {
            return false;
        }
        u1d1 u1d1Var = (u1d1) obj;
        return wj50.m88271j(this.f225760a, u1d1Var.f225760a) && wj50.m88271j(this.f225761b, u1d1Var.f225761b) && wj50.m88271j(this.f225762c, u1d1Var.f225762c) && wj50.m88271j(this.f225763d, u1d1Var.f225763d) && this.f225764e == u1d1Var.f225764e;
    }

    public final int hashCode() {
        return edb.m38547C(this.f225764e) + s571.m77243b(s571.m77243b(s571.m77243b(this.f225760a.hashCode() * 31, 31, this.f225761b), 31, this.f225762c), 31, this.f225763d);
    }
}
