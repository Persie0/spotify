package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pm01 extends sm01 {

    /* JADX INFO: renamed from: a */
    public final String f178855a;

    /* JADX INFO: renamed from: b */
    public final mk01 f178856b;

    /* JADX INFO: renamed from: c */
    public final String f178857c;

    public pm01(String str, mk01 mk01Var, String str2) {
        this.f178855a = str;
        this.f178856b = mk01Var;
        this.f178857c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm01)) {
            return false;
        }
        pm01 pm01Var = (pm01) obj;
        return wj50.m88271j(this.f178855a, pm01Var.f178855a) && wj50.m88271j(this.f178856b, pm01Var.f178856b) && wj50.m88271j(this.f178857c, pm01Var.f178857c);
    }

    public final int hashCode() {
        int iHashCode = this.f178855a.hashCode() * 31;
        mk01 mk01Var = this.f178856b;
        int iHashCode2 = (iHashCode + (mk01Var == null ? 0 : mk01Var.hashCode())) * 31;
        String str = this.f178857c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
