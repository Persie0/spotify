package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class am81 {

    /* JADX INFO: renamed from: a */
    public final long f17060a;

    /* JADX INFO: renamed from: b */
    public final long f17061b;

    public am81(long j, long j2) {
        this.f17060a = j;
        this.f17061b = j2;
    }

    /* JADX INFO: renamed from: a */
    public final long m26388a() {
        return this.f17061b;
    }

    /* JADX INFO: renamed from: b */
    public final long m26389b() {
        return this.f17060a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am81)) {
            return false;
        }
        am81 am81Var = (am81) obj;
        return this.f17060a == am81Var.f17060a && this.f17061b == am81Var.f17061b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17061b) + (Long.hashCode(this.f17060a) * 31);
    }
}
