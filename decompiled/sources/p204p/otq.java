package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class otq {

    /* JADX INFO: renamed from: c */
    public static final otq f170066c = new otq(0, 0);

    /* JADX INFO: renamed from: a */
    public final long f170067a;

    /* JADX INFO: renamed from: b */
    public final long f170068b;

    public otq(long j, long j2) {
        this.f170067a = j;
        this.f170068b = j2;
    }

    /* JADX INFO: renamed from: a */
    public final long m68067a() {
        return this.f170067a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof otq) {
            otq otqVar = (otq) obj;
            return g450.m43520b(this.f170067a, otqVar.f170067a) && this.f170068b == otqVar.f170068b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f170068b) + (Long.hashCode(this.f170067a) * 31);
    }
}
