package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class tol {

    /* JADX INFO: renamed from: a */
    public final String f222283a;

    /* JADX INFO: renamed from: b */
    public final vwf f222284b;

    public tol(String str, vwf vwfVar) {
        this.f222283a = str;
        this.f222284b = vwfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tol)) {
            return false;
        }
        tol tolVar = (tol) obj;
        return wj50.m88271j(this.f222283a, tolVar.f222283a) && wj50.m88271j(this.f222284b, tolVar.f222284b);
    }

    public final int hashCode() {
        String str = this.f222283a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        vwf vwfVar = this.f222284b;
        return iHashCode + (vwfVar != null ? vwfVar.hashCode() : 0);
    }
}
