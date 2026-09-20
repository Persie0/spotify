package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lzw implements y2x {

    /* JADX INFO: renamed from: a */
    public final String f138462a;

    /* JADX INFO: renamed from: b */
    public final m3x0 f138463b;

    /* JADX INFO: renamed from: c */
    public final String f138464c;

    public lzw(String str, m3x0 m3x0Var, String str2) {
        this.f138462a = str;
        this.f138463b = m3x0Var;
        this.f138464c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzw)) {
            return false;
        }
        lzw lzwVar = (lzw) obj;
        if (!wj50.m88271j(this.f138462a, lzwVar.f138462a) || !wj50.m88271j(this.f138463b, lzwVar.f138463b)) {
            return false;
        }
        String str = lzwVar.f138464c;
        wp6 wp6Var = jvw0.f116535b;
        return wj50.m88271j(this.f138464c, str);
    }

    public final int hashCode() {
        int iHashCode = (this.f138463b.hashCode() + (this.f138462a.hashCode() * 31)) * 31;
        wp6 wp6Var = jvw0.f116535b;
        return this.f138464c.hashCode() + iHashCode;
    }
}
