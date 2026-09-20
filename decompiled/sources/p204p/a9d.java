package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class a9d implements lad {

    /* JADX INFO: renamed from: a */
    public final String f13544a;

    /* JADX INFO: renamed from: b */
    public final long f13545b;

    public a9d(String str, long j) {
        this.f13544a = str;
        this.f13545b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9d)) {
            return false;
        }
        a9d a9dVar = (a9d) obj;
        return wj50.m88271j(this.f13544a, a9dVar.f13544a) && this.f13545b == a9dVar.f13545b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13545b) + (this.f13544a.hashCode() * 31);
    }
}
