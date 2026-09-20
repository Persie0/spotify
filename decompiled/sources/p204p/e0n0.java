package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e0n0 {

    /* JADX INFO: renamed from: a */
    public final boolean f55003a;

    /* JADX INFO: renamed from: b */
    public final boolean f55004b;

    /* JADX INFO: renamed from: c */
    public final String f55005c;

    /* JADX INFO: renamed from: d */
    public final String f55006d;

    /* JADX INFO: renamed from: e */
    public final String f55007e;

    public e0n0(String str, String str2, String str3, boolean z, boolean z2) {
        this.f55003a = z;
        this.f55004b = z2;
        this.f55005c = str;
        this.f55006d = str2;
        this.f55007e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0n0)) {
            return false;
        }
        e0n0 e0n0Var = (e0n0) obj;
        return this.f55003a == e0n0Var.f55003a && this.f55004b == e0n0Var.f55004b && wj50.m88271j(this.f55005c, e0n0Var.f55005c) && wj50.m88271j(this.f55006d, e0n0Var.f55006d) && wj50.m88271j(this.f55007e, e0n0Var.f55007e);
    }

    public final int hashCode() {
        return this.f55007e.hashCode() + s571.m77243b(s571.m77243b(s571.m77245d(Boolean.hashCode(this.f55003a) * 31, 31, this.f55004b), 31, this.f55005c), 31, this.f55006d);
    }
}
