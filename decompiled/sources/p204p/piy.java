package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class piy implements vwf {

    /* JADX INFO: renamed from: a */
    public final vwf f178077a;

    /* JADX INFO: renamed from: b */
    public final vwf f178078b;

    public piy(vwf vwfVar, vwf vwfVar2) {
        this.f178077a = vwfVar;
        this.f178078b = vwfVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof piy)) {
            return false;
        }
        piy piyVar = (piy) obj;
        return wj50.m88271j(this.f178077a, piyVar.f178077a) && wj50.m88271j(this.f178078b, piyVar.f178078b);
    }

    public final int hashCode() {
        vwf vwfVar = this.f178077a;
        int iHashCode = (vwfVar == null ? 0 : vwfVar.hashCode()) * 31;
        vwf vwfVar2 = this.f178078b;
        return iHashCode + (vwfVar2 != null ? vwfVar2.hashCode() : 0);
    }
}
