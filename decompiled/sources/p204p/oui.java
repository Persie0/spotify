package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class oui extends qui {

    /* JADX INFO: renamed from: a */
    public final String f170296a;

    /* JADX INFO: renamed from: b */
    public final boolean f170297b;

    /* JADX INFO: renamed from: c */
    public final xfr f170298c;

    public oui(String str, boolean z, xfr xfrVar) {
        this.f170296a = str;
        this.f170297b = z;
        this.f170298c = xfrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oui)) {
            return false;
        }
        oui ouiVar = (oui) obj;
        return wj50.m88271j(this.f170296a, ouiVar.f170296a) && this.f170297b == ouiVar.f170297b && this.f170298c == ouiVar.f170298c;
    }

    public final int hashCode() {
        return this.f170298c.hashCode() + s571.m77245d(this.f170296a.hashCode() * 31, 31, this.f170297b);
    }
}
