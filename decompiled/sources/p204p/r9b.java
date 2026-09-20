package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class r9b {

    /* JADX INFO: renamed from: a */
    public final String f196965a;

    /* JADX INFO: renamed from: b */
    public final int f196966b;

    public r9b(String str, int i) {
        this.f196965a = str;
        this.f196966b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9b)) {
            return false;
        }
        r9b r9bVar = (r9b) obj;
        return wj50.m88271j(this.f196965a, r9bVar.f196965a) && this.f196966b == r9bVar.f196966b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f196966b) + (this.f196965a.hashCode() * 31);
    }
}
