package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class y1b implements z1b {

    /* JADX INFO: renamed from: a */
    public final String f268219a;

    /* JADX INFO: renamed from: b */
    public final long f268220b;

    public y1b(String str, long j) {
        this.f268219a = str;
        this.f268220b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1b)) {
            return false;
        }
        y1b y1bVar = (y1b) obj;
        return wj50.m88271j(this.f268219a, y1bVar.f268219a) && this.f268220b == y1bVar.f268220b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f268220b) + (this.f268219a.hashCode() * 31);
    }
}
