package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class vbl {

    /* JADX INFO: renamed from: a */
    public final String f239522a;

    /* JADX INFO: renamed from: b */
    public final String f239523b;

    public vbl(String str, String str2) {
        this.f239522a = str;
        this.f239523b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbl)) {
            return false;
        }
        vbl vblVar = (vbl) obj;
        return wj50.m88271j(this.f239522a, vblVar.f239522a) && wj50.m88271j(this.f239523b, vblVar.f239523b);
    }

    public final int hashCode() {
        return this.f239523b.hashCode() + (this.f239522a.hashCode() * 31);
    }
}
