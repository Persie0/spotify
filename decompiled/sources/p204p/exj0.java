package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class exj0 {

    /* JADX INFO: renamed from: a */
    public final String f63784a;

    /* JADX INFO: renamed from: b */
    public final String f63785b;

    /* JADX INFO: renamed from: c */
    public final int f63786c;

    /* JADX INFO: renamed from: d */
    public final int f63787d;

    /* JADX INFO: renamed from: e */
    public final boolean f63788e;

    public exj0(int i, boolean z, String str, int i2, String str2) {
        this.f63784a = str;
        this.f63785b = str2;
        this.f63786c = i;
        this.f63787d = i2;
        this.f63788e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exj0)) {
            return false;
        }
        exj0 exj0Var = (exj0) obj;
        return this.f63784a.equals(exj0Var.f63784a) && wj50.m88271j(this.f63785b, exj0Var.f63785b) && this.f63786c == exj0Var.f63786c && this.f63787d == exj0Var.f63787d && this.f63788e == exj0Var.f63788e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63788e) + f710.m40938f(this.f63787d, f710.m40938f(this.f63786c, s571.m77243b(this.f63784a.hashCode() * 31, 31, this.f63785b), 31), 31);
    }
}
