package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ogt implements ymt {

    /* JADX INFO: renamed from: a */
    public final String f165251a;

    /* JADX INFO: renamed from: b */
    public final String f165252b;

    public ogt(String str, String str2) {
        this.f165251a = str;
        this.f165252b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogt)) {
            return false;
        }
        ogt ogtVar = (ogt) obj;
        return wj50.m88271j(this.f165251a, ogtVar.f165251a) && wj50.m88271j(this.f165252b, ogtVar.f165252b);
    }

    public final int hashCode() {
        int iHashCode = this.f165251a.hashCode() * 31;
        String str = this.f165252b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
