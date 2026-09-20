package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ts1 implements vs1 {

    /* JADX INFO: renamed from: a */
    public final long f223186a;

    public ts1(long j) {
        this.f223186a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ts1) && g450.m43520b(this.f223186a, ((ts1) obj).f223186a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f223186a);
    }
}
