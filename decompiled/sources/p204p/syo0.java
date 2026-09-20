package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class syo0 implements yyo0 {

    /* JADX INFO: renamed from: a */
    public final int f215305a;

    /* JADX INFO: renamed from: b */
    public final long f215306b;

    public syo0(int i, long j) {
        this.f215305a = i;
        this.f215306b = j;
    }

    /* JADX INFO: renamed from: a */
    public final long m79708a() {
        return this.f215306b;
    }

    /* JADX INFO: renamed from: b */
    public final int m79709b() {
        return this.f215305a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof syo0)) {
            return false;
        }
        syo0 syo0Var = (syo0) obj;
        return this.f215305a == syo0Var.f215305a && this.f215306b == syo0Var.f215306b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f215306b) + (edb.m38547C(this.f215305a) * 31);
    }
}
