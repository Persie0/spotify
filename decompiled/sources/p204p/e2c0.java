package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e2c0 extends n2c0 {

    /* JADX INFO: renamed from: a */
    public final String f55422a;

    /* JADX INFO: renamed from: b */
    public final boolean f55423b;

    /* JADX INFO: renamed from: c */
    public final String f55424c;

    /* JADX INFO: renamed from: d */
    public final boolean f55425d;

    public e2c0(String str, boolean z, String str2, boolean z2) {
        this.f55422a = str;
        this.f55423b = z;
        this.f55424c = str2;
        this.f55425d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2c0)) {
            return false;
        }
        e2c0 e2c0Var = (e2c0) obj;
        return wj50.m88271j(this.f55422a, e2c0Var.f55422a) && this.f55423b == e2c0Var.f55423b && wj50.m88271j(this.f55424c, e2c0Var.f55424c) && this.f55425d == e2c0Var.f55425d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f55425d) + s571.m77243b(s571.m77245d(this.f55422a.hashCode() * 31, 31, this.f55423b), 31, this.f55424c);
    }
}
