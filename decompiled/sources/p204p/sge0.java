package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class sge0 {

    /* JADX INFO: renamed from: a */
    public final long f208843a;

    /* JADX INFO: renamed from: b */
    public final long f208844b;

    public sge0(long j, long j2) {
        this.f208843a = j;
        this.f208844b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sge0)) {
            return false;
        }
        sge0 sge0Var = (sge0) obj;
        return this.f208843a == sge0Var.f208843a && this.f208844b == sge0Var.f208844b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f208844b) + (Long.hashCode(this.f208843a) * 31);
    }
}
