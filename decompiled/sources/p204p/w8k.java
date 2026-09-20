package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class w8k {

    /* JADX INFO: renamed from: a */
    public final int f248939a;

    /* JADX INFO: renamed from: b */
    public final long f248940b;

    public w8k(int i, long j) {
        this.f248939a = i;
        this.f248940b = j;
    }

    /* JADX INFO: renamed from: a */
    public final int m87463a() {
        return this.f248939a;
    }

    /* JADX INFO: renamed from: b */
    public final long m87464b() {
        return this.f248940b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8k)) {
            return false;
        }
        w8k w8kVar = (w8k) obj;
        return this.f248939a == w8kVar.f248939a && this.f248940b == w8kVar.f248940b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f248940b) + (Integer.hashCode(this.f248939a) * 31);
    }
}
