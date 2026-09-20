package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nxh {

    /* JADX INFO: renamed from: a */
    public final String f159468a;

    /* JADX INFO: renamed from: b */
    public final String f159469b;

    /* JADX INFO: renamed from: c */
    public final String f159470c;

    /* JADX INFO: renamed from: d */
    public final eh00 f159471d;

    /* JADX INFO: renamed from: e */
    public final eh00 f159472e;

    public nxh(String str, String str2, String str3, eh00 eh00Var, eh00 eh00Var2) {
        this.f159468a = str;
        this.f159469b = str2;
        this.f159470c = str3;
        this.f159471d = eh00Var;
        this.f159472e = eh00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxh)) {
            return false;
        }
        nxh nxhVar = (nxh) obj;
        return wj50.m88271j(this.f159468a, nxhVar.f159468a) && wj50.m88271j(this.f159469b, nxhVar.f159469b) && wj50.m88271j(this.f159470c, nxhVar.f159470c) && wj50.m88271j(this.f159471d, nxhVar.f159471d) && wj50.m88271j(this.f159472e, nxhVar.f159472e);
    }

    public final int hashCode() {
        return this.f159472e.hashCode() + p1v.m68853j(s571.m77243b(s571.m77243b(this.f159468a.hashCode() * 31, 31, this.f159469b), 31, this.f159470c), this.f159471d, 31);
    }
}
