package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class uyw implements y2x {

    /* JADX INFO: renamed from: a */
    public final String f235372a;

    /* JADX INFO: renamed from: b */
    public final String f235373b;

    public uyw(String str, String str2) {
        this.f235372a = str;
        this.f235373b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uyw)) {
            return false;
        }
        uyw uywVar = (uyw) obj;
        return wj50.m88271j(this.f235372a, uywVar.f235372a) && wj50.m88271j(this.f235373b, uywVar.f235373b);
    }

    public final int hashCode() {
        return this.f235373b.hashCode() + (this.f235372a.hashCode() * 31);
    }
}
