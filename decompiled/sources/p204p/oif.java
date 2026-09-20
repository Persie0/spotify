package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class oif {

    /* JADX INFO: renamed from: a */
    public final String f165804a;

    /* JADX INFO: renamed from: b */
    public final String f165805b;

    public oif(String str, String str2) {
        this.f165804a = str;
        this.f165805b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oif)) {
            return false;
        }
        oif oifVar = (oif) obj;
        return wj50.m88271j(this.f165804a, oifVar.f165804a) && wj50.m88271j(this.f165805b, oifVar.f165805b);
    }

    public final int hashCode() {
        int iHashCode = this.f165804a.hashCode() * 31;
        String str = this.f165805b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
