package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bbv0 {

    /* JADX INFO: renamed from: a */
    public final String f25665a;

    /* JADX INFO: renamed from: b */
    public final String f25666b;

    /* JADX INFO: renamed from: c */
    public final String f25667c;

    /* JADX INFO: renamed from: d */
    public final int f25668d;

    public bbv0(String str, String str2, int i, String str3) {
        this.f25665a = str;
        this.f25666b = str2;
        this.f25667c = str3;
        this.f25668d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbv0)) {
            return false;
        }
        bbv0 bbv0Var = (bbv0) obj;
        return wj50.m88271j(this.f25665a, bbv0Var.f25665a) && wj50.m88271j(this.f25666b, bbv0Var.f25666b) && wj50.m88271j(this.f25667c, bbv0Var.f25667c) && this.f25668d == bbv0Var.f25668d;
    }

    public final int hashCode() {
        int iHashCode = this.f25665a.hashCode() * 31;
        String str = this.f25666b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25667c;
        return edb.m38547C(this.f25668d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
