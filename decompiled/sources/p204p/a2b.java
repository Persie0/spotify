package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class a2b {

    /* JADX INFO: renamed from: a */
    public final long f11612a;

    /* JADX INFO: renamed from: b */
    public final long f11613b;

    public a2b(long j, long j2) {
        this.f11612a = j;
        this.f11613b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2b)) {
            return false;
        }
        a2b a2bVar = (a2b) obj;
        return this.f11612a == a2bVar.f11612a && this.f11613b == a2bVar.f11613b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11613b) + (Long.hashCode(this.f11612a) * 31);
    }
}
