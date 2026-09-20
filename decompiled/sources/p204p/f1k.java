package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class f1k {

    /* JADX INFO: renamed from: a */
    public final String f64910a;

    /* JADX INFO: renamed from: b */
    public final String f64911b;

    /* JADX INFO: renamed from: c */
    public final String f64912c;

    /* JADX INFO: renamed from: d */
    public final d1k f64913d;

    /* JADX INFO: renamed from: e */
    public final eh00 f64914e;

    /* JADX INFO: renamed from: f */
    public final eh00 f64915f;

    /* JADX INFO: renamed from: g */
    public final boolean f64916g;

    /* JADX INFO: renamed from: h */
    public final String f64917h;

    /* JADX INFO: renamed from: i */
    public final y0k f64918i;

    public f1k(String str, String str2, String str3, d1k d1kVar, eh00 eh00Var, eh00 eh00Var2, boolean z, String str4, y0k y0kVar) {
        this.f64910a = str;
        this.f64911b = str2;
        this.f64912c = str3;
        this.f64913d = d1kVar;
        this.f64914e = eh00Var;
        this.f64915f = eh00Var2;
        this.f64916g = z;
        this.f64917h = str4;
        this.f64918i = y0kVar;
    }

    /* JADX INFO: renamed from: a */
    public static f1k m40558a(f1k f1kVar, eh00 eh00Var, zq2 zq2Var, int i) {
        String str = f1kVar.f64910a;
        String str2 = f1kVar.f64911b;
        String str3 = f1kVar.f64912c;
        d1k d1kVar = f1kVar.f64913d;
        if ((i & 16) != 0) {
            eh00Var = f1kVar.f64914e;
        }
        eh00 eh00Var2 = eh00Var;
        eh00 eh00Var3 = zq2Var;
        if ((i & 32) != 0) {
            eh00Var3 = f1kVar.f64915f;
        }
        boolean z = f1kVar.f64916g;
        String str4 = f1kVar.f64917h;
        y0k y0kVar = f1kVar.f64918i;
        f1kVar.getClass();
        return new f1k(str, str2, str3, d1kVar, eh00Var2, eh00Var3, z, str4, y0kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1k)) {
            return false;
        }
        f1k f1kVar = (f1k) obj;
        return wj50.m88271j(this.f64910a, f1kVar.f64910a) && wj50.m88271j(this.f64911b, f1kVar.f64911b) && wj50.m88271j(this.f64913d, f1kVar.f64913d) && this.f64916g == f1kVar.f64916g && wj50.m88271j(this.f64917h, f1kVar.f64917h) && wj50.m88271j(this.f64918i, f1kVar.f64918i) && wj50.m88271j(this.f64915f.invoke(), f1kVar.f64915f.invoke());
    }

    public final int hashCode() {
        int iHashCode = this.f64910a.hashCode() * 31;
        String str = this.f64911b;
        int iM77245d = s571.m77245d((this.f64913d.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31, 31, this.f64916g);
        String str2 = this.f64917h;
        return ((q4k) this.f64915f.invoke()).hashCode() + ((this.f64918i.hashCode() + ((iM77245d + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ f1k(String str, String str2, String str3, d1k d1kVar, eh00 eh00Var, eh00 eh00Var2, boolean z, String str4, int i) {
        y0k y0kVar;
        String str5 = (i & 2) != 0 ? null : str2;
        String str6 = (i & 4) != 0 ? null : str3;
        d1k d1kVar2 = (i & 8) != 0 ? a1k.f11431a : d1kVar;
        eh00 eh00Var3 = (i & 16) != 0 ? null : eh00Var;
        eh00 eh00Var4 = (i & 32) != 0 ? bpj.f29509f : eh00Var2;
        boolean z2 = (i & 64) != 0 ? false : z;
        String str7 = (i & 128) != 0 ? null : str4;
        if ((i & 256) != 0) {
            y0kVar = w0k.f246748a;
        } else {
            y0kVar = x0k.f256890a;
        }
        this(str, str5, str6, d1kVar2, eh00Var3, eh00Var4, z2, str7, y0kVar);
    }
}
