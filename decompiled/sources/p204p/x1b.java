package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class x1b implements z1b {

    /* JADX INFO: renamed from: a */
    public final String f257121a;

    /* JADX INFO: renamed from: b */
    public final long f257122b;

    public x1b(String str, long j) {
        this.f257121a = str;
        this.f257122b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1b)) {
            return false;
        }
        x1b x1bVar = (x1b) obj;
        return wj50.m88271j(this.f257121a, x1bVar.f257121a) && this.f257122b == x1bVar.f257122b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f257122b) + (this.f257121a.hashCode() * 31);
    }
}
