package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class o4x {

    /* JADX INFO: renamed from: a */
    public final int f161797a;

    /* JADX INFO: renamed from: b */
    public final long f161798b;

    public o4x(int i, long j) {
        this.f161797a = i;
        this.f161798b = j;
    }

    /* JADX INFO: renamed from: a */
    public final long m66259a() {
        return this.f161798b;
    }

    /* JADX INFO: renamed from: b */
    public final int m66260b() {
        return this.f161797a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4x)) {
            return false;
        }
        o4x o4xVar = (o4x) obj;
        return this.f161797a == o4xVar.f161797a && this.f161798b == o4xVar.f161798b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f161798b) + (Integer.hashCode(this.f161797a) * 31);
    }
}
