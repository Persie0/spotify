package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wbv {

    /* JADX INFO: renamed from: a */
    public final String f249855a;

    /* JADX INFO: renamed from: b */
    public final String f249856b;

    /* JADX INFO: renamed from: c */
    public final String f249857c;

    /* JADX INFO: renamed from: d */
    public final String f249858d;

    /* JADX INFO: renamed from: e */
    public final dvg1 f249859e;

    public wbv(String str, String str2, String str3, String str4, dvg1 dvg1Var) {
        this.f249855a = str;
        this.f249856b = str2;
        this.f249857c = str3;
        this.f249858d = str4;
        this.f249859e = dvg1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbv)) {
            return false;
        }
        wbv wbvVar = (wbv) obj;
        return wj50.m88271j(this.f249855a, wbvVar.f249855a) && wj50.m88271j(this.f249856b, wbvVar.f249856b) && wj50.m88271j(this.f249857c, wbvVar.f249857c) && wj50.m88271j(this.f249858d, wbvVar.f249858d) && wj50.m88271j(this.f249859e, wbvVar.f249859e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f249855a.hashCode() * 31, 31, this.f249856b), 31, this.f249857c);
        String str = this.f249858d;
        return this.f249859e.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
