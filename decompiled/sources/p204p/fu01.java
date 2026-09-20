package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fu01 {

    /* JADX INFO: renamed from: a */
    public final long f73366a;

    /* JADX INFO: renamed from: b */
    public final long f73367b;

    public fu01(long j, long j2) {
        this.f73366a = j;
        this.f73367b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu01)) {
            return false;
        }
        fu01 fu01Var = (fu01) obj;
        return this.f73366a == fu01Var.f73366a && this.f73367b == fu01Var.f73367b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f73367b) + (Long.hashCode(this.f73366a) * 31);
    }
}
