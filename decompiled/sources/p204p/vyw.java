package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vyw implements y2x {

    /* JADX INFO: renamed from: a */
    public final String f246340a;

    /* JADX INFO: renamed from: b */
    public final String f246341b;

    public vyw(String str, String str2) {
        this.f246340a = str;
        this.f246341b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vyw)) {
            return false;
        }
        vyw vywVar = (vyw) obj;
        if (!wj50.m88271j(this.f246340a, vywVar.f246340a)) {
            return false;
        }
        String str = vywVar.f246341b;
        wp6 wp6Var = xgn0.f261341b;
        return wj50.m88271j(this.f246341b, str);
    }

    public final int hashCode() {
        int iHashCode = this.f246340a.hashCode() * 31;
        wp6 wp6Var = xgn0.f261341b;
        return this.f246341b.hashCode() + iHashCode;
    }
}
