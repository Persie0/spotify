package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class aml {

    /* JADX INFO: renamed from: a */
    public final String f17152a;

    /* JADX INFO: renamed from: b */
    public final xll f17153b;

    /* JADX INFO: renamed from: c */
    public final zll f17154c;

    public aml(String str, xll xllVar, zll zllVar) {
        this.f17152a = str;
        this.f17153b = xllVar;
        this.f17154c = zllVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aml)) {
            return false;
        }
        aml amlVar = (aml) obj;
        return wj50.m88271j(this.f17152a, amlVar.f17152a) && wj50.m88271j(this.f17153b, amlVar.f17153b) && wj50.m88271j(this.f17154c, amlVar.f17154c);
    }

    public final int hashCode() {
        String str = this.f17152a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        xll xllVar = this.f17153b;
        int iHashCode2 = (iHashCode + (xllVar == null ? 0 : xllVar.hashCode())) * 31;
        zll zllVar = this.f17154c;
        return iHashCode2 + (zllVar != null ? zllVar.hashCode() : 0);
    }
}
