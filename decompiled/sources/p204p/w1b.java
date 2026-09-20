package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class w1b implements z1b {

    /* JADX INFO: renamed from: a */
    public final String f247050a;

    /* JADX INFO: renamed from: b */
    public final long f247051b;

    public w1b(String str, long j) {
        this.f247050a = str;
        this.f247051b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1b)) {
            return false;
        }
        w1b w1bVar = (w1b) obj;
        return wj50.m88271j(this.f247050a, w1bVar.f247050a) && this.f247051b == w1bVar.f247051b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f247051b) + (this.f247050a.hashCode() * 31);
    }
}
