package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class p490 {

    /* JADX INFO: renamed from: a */
    public final String f173872a;

    /* JADX INFO: renamed from: b */
    public final boolean f173873b;

    public p490(String str, boolean z) {
        this.f173872a = str;
        this.f173873b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p490)) {
            return false;
        }
        p490 p490Var = (p490) obj;
        return wj50.m88271j(this.f173872a, p490Var.f173872a) && this.f173873b == p490Var.f173873b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f173873b) + (this.f173872a.hashCode() * 31);
    }
}
