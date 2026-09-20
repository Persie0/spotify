package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class v9d implements lad {

    /* JADX INFO: renamed from: a */
    public final String f238915a;

    /* JADX INFO: renamed from: b */
    public final pdj f238916b;

    /* JADX INFO: renamed from: c */
    public final long f238917c;

    public v9d(String str, pdj pdjVar, long j) {
        this.f238915a = str;
        this.f238916b = pdjVar;
        this.f238917c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9d)) {
            return false;
        }
        v9d v9dVar = (v9d) obj;
        return wj50.m88271j(this.f238915a, v9dVar.f238915a) && wj50.m88271j(this.f238916b, v9dVar.f238916b) && this.f238917c == v9dVar.f238917c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f238917c) + ((this.f238916b.hashCode() + (this.f238915a.hashCode() * 31)) * 31);
    }
}
