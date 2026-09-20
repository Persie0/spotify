package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jiy {

    /* JADX INFO: renamed from: a */
    public final String f112834a;

    /* JADX INFO: renamed from: b */
    public final ygy f112835b;

    public jiy(String str, ygy ygyVar) {
        this.f112834a = str;
        this.f112835b = ygyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jiy)) {
            return false;
        }
        jiy jiyVar = (jiy) obj;
        return wj50.m88271j(this.f112834a, jiyVar.f112834a) && wj50.m88271j(this.f112835b, jiyVar.f112835b);
    }

    public final int hashCode() {
        int iHashCode = this.f112834a.hashCode() * 31;
        ygy ygyVar = this.f112835b;
        return iHashCode + (ygyVar == null ? 0 : ygyVar.hashCode());
    }
}
