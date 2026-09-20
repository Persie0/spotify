package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class x17 {

    /* JADX INFO: renamed from: a */
    public final long f257076a;

    /* JADX INFO: renamed from: b */
    public final long f257077b;

    public x17(long j, long j2) {
        this.f257076a = j;
        this.f257077b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x17)) {
            return false;
        }
        x17 x17Var = (x17) obj;
        return this.f257076a == x17Var.f257076a && this.f257077b == x17Var.f257077b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f257077b) + (Long.hashCode(this.f257076a) * 31);
    }
}
