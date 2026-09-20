package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class y06 {

    /* JADX INFO: renamed from: a */
    public final String f267913a;

    /* JADX INFO: renamed from: b */
    public final String f267914b;

    /* JADX INFO: renamed from: c */
    public final String f267915c;

    /* JADX INFO: renamed from: d */
    public final int f267916d;

    /* JADX INFO: renamed from: e */
    public final String f267917e;

    public y06(int i, String str, String str2, String str3, String str4) {
        this.f267913a = str;
        this.f267914b = str2;
        this.f267915c = str3;
        this.f267916d = i;
        this.f267917e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y06)) {
            return false;
        }
        y06 y06Var = (y06) obj;
        return wj50.m88271j(this.f267913a, y06Var.f267913a) && wj50.m88271j(this.f267914b, y06Var.f267914b) && wj50.m88271j(this.f267915c, y06Var.f267915c) && this.f267916d == y06Var.f267916d && wj50.m88271j(this.f267917e, y06Var.f267917e);
    }

    public final int hashCode() {
        return this.f267917e.hashCode() + mt60.m62800g(this.f267916d, s571.m77243b(s571.m77243b(this.f267913a.hashCode() * 31, 31, this.f267914b), 31, this.f267915c), 31);
    }
}
