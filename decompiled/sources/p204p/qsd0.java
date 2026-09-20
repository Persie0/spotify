package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qsd0 {

    /* JADX INFO: renamed from: a */
    public final long f192074a;

    /* JADX INFO: renamed from: b */
    public final long f192075b;

    public qsd0(long j) {
        this.f192074a = j;
        this.f192075b = j * 1000;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return qsd0.class.equals(obj != null ? obj.getClass() : null) && Math.abs(this.f192074a - ((qsd0) obj).f192074a) < 1000;
    }

    public final int hashCode() {
        return Long.hashCode(this.f192074a / 1000);
    }
}
