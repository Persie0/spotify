package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class l031 {

    /* JADX INFO: renamed from: a */
    public final o031 f128288a;

    /* JADX INFO: renamed from: b */
    public final long f128289b;

    public l031(o031 o031Var, long j) {
        this.f128288a = o031Var;
        this.f128289b = j;
    }

    /* JADX INFO: renamed from: a */
    public final long m57783a() {
        return this.f128289b;
    }

    /* JADX INFO: renamed from: b */
    public final o031 m57784b() {
        return this.f128288a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l031)) {
            return false;
        }
        l031 l031Var = (l031) obj;
        return wj50.m88271j(this.f128288a, l031Var.f128288a) && this.f128289b == l031Var.f128289b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f128289b) + (this.f128288a.hashCode() * 31);
    }
}
