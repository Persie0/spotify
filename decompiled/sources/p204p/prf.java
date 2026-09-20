package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class prf implements rrf {

    /* JADX INFO: renamed from: a */
    public final String f180579a;

    /* JADX INFO: renamed from: b */
    public final String f180580b;

    /* JADX INFO: renamed from: c */
    public final String f180581c;

    /* JADX INFO: renamed from: d */
    public final String f180582d;

    /* JADX INFO: renamed from: e */
    public final int f180583e;

    public prf(int i, String str, String str2, String str3, String str4) {
        this.f180579a = str;
        this.f180580b = str2;
        this.f180581c = str3;
        this.f180582d = str4;
        this.f180583e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof prf)) {
            return false;
        }
        prf prfVar = (prf) obj;
        return wj50.m88271j(this.f180579a, prfVar.f180579a) && wj50.m88271j(this.f180580b, prfVar.f180580b) && wj50.m88271j(this.f180581c, prfVar.f180581c) && wj50.m88271j(this.f180582d, prfVar.f180582d) && this.f180583e == prfVar.f180583e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f180579a.hashCode() * 31, 31, this.f180580b), 31, this.f180581c);
        String str = this.f180582d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        int i = this.f180583e;
        return iHashCode + (i != 0 ? edb.m38547C(i) : 0);
    }
}
