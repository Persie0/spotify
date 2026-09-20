package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class p9d implements lad {

    /* JADX INFO: renamed from: a */
    public final pdj f175215a;

    /* JADX INFO: renamed from: b */
    public final String f175216b;

    public p9d(kdj kdjVar, String str) {
        this.f175215a = kdjVar;
        this.f175216b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9d)) {
            return false;
        }
        p9d p9dVar = (p9d) obj;
        return wj50.m88271j(this.f175215a, p9dVar.f175215a) && wj50.m88271j(this.f175216b, p9dVar.f175216b);
    }

    public final int hashCode() {
        return this.f175216b.hashCode() + (this.f175215a.hashCode() * 31);
    }
}
