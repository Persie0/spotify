package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class j091 {

    /* JADX INFO: renamed from: a */
    public final m291 f107398a;

    /* JADX INFO: renamed from: b */
    public final long f107399b;

    public j091(m291 m291Var, long j) {
        this.f107398a = m291Var;
        this.f107399b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j091)) {
            return false;
        }
        j091 j091Var = (j091) obj;
        return wj50.m88271j(this.f107398a, j091Var.f107398a) && this.f107399b == j091Var.f107399b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f107399b) + (this.f107398a.f139292a.hashCode() * 31);
    }
}
