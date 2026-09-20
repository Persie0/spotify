package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class f3y {

    /* JADX INFO: renamed from: a */
    public final paf0 f65609a;

    /* JADX INFO: renamed from: b */
    public final String f65610b;

    /* JADX INFO: renamed from: c */
    public final String f65611c;

    public f3y(paf0 paf0Var, String str, String str2) {
        this.f65609a = paf0Var;
        this.f65610b = str;
        this.f65611c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3y)) {
            return false;
        }
        f3y f3yVar = (f3y) obj;
        return wj50.m88271j(this.f65609a, f3yVar.f65609a) && wj50.m88271j(this.f65610b, f3yVar.f65610b) && wj50.m88271j(this.f65611c, f3yVar.f65611c);
    }

    public final int hashCode() {
        int iHashCode = this.f65609a.hashCode() * 31;
        String str = this.f65610b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f65611c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
