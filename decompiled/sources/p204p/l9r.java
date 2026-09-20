package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class l9r {

    /* JADX INFO: renamed from: a */
    public final double f131169a;

    /* JADX INFO: renamed from: b */
    public final long f131170b;

    public l9r(double d, long j) {
        this.f131169a = d;
        this.f131170b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9r)) {
            return false;
        }
        l9r l9rVar = (l9r) obj;
        return Double.compare(this.f131169a, l9rVar.f131169a) == 0 && this.f131170b == l9rVar.f131170b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f131170b) + (Double.hashCode(this.f131169a) * 31);
    }
}
