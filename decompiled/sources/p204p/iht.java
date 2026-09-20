package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class iht {

    /* JADX INFO: renamed from: a */
    public final String f102361a;

    /* JADX INFO: renamed from: b */
    public final ovd f102362b;

    public iht(String str, ovd ovdVar) {
        this.f102361a = str;
        this.f102362b = ovdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iht)) {
            return false;
        }
        iht ihtVar = (iht) obj;
        return wj50.m88271j(this.f102361a, ihtVar.f102361a) && this.f102362b == ihtVar.f102362b;
    }

    public final int hashCode() {
        int iHashCode = this.f102361a.hashCode() * 31;
        ovd ovdVar = this.f102362b;
        return iHashCode + (ovdVar == null ? 0 : ovdVar.hashCode());
    }
}
