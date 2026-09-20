package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class p9v {

    /* JADX INFO: renamed from: a */
    public final o9v f175304a;

    /* JADX INFO: renamed from: b */
    public final long f175305b;

    public p9v(o9v o9vVar, long j) {
        this.f175304a = o9vVar;
        this.f175305b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9v)) {
            return false;
        }
        p9v p9vVar = (p9v) obj;
        return wj50.m88271j(this.f175304a, p9vVar.f175304a) && this.f175305b == p9vVar.f175305b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f175305b) + (this.f175304a.hashCode() * 31);
    }
}
