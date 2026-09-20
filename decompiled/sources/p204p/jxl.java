package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jxl extends lxl {

    /* JADX INFO: renamed from: a */
    public final pxl f117152a;

    /* JADX INFO: renamed from: b */
    public final gpk f117153b;

    public jxl(pxl pxlVar, gpk gpkVar) {
        this.f117152a = pxlVar;
        this.f117153b = gpkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxl)) {
            return false;
        }
        jxl jxlVar = (jxl) obj;
        return wj50.m88271j(this.f117152a, jxlVar.f117152a) && wj50.m88271j(this.f117153b, jxlVar.f117153b);
    }

    public final int hashCode() {
        int iHashCode = this.f117152a.hashCode() * 31;
        gpk gpkVar = this.f117153b;
        return iHashCode + (gpkVar == null ? 0 : gpkVar.hashCode());
    }
}
