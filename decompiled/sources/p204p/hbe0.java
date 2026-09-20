package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hbe0 {

    /* JADX INFO: renamed from: a */
    public final String f89511a;

    /* JADX INFO: renamed from: b */
    public final String f89512b;

    public hbe0(String str, String str2) {
        this.f89511a = str;
        this.f89512b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbe0)) {
            return false;
        }
        hbe0 hbe0Var = (hbe0) obj;
        return wj50.m88271j(this.f89511a, hbe0Var.f89511a) && wj50.m88271j(this.f89512b, hbe0Var.f89512b);
    }

    public final int hashCode() {
        return this.f89512b.hashCode() + (this.f89511a.hashCode() * 31);
    }
}
