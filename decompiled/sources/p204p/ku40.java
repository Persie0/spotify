package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ku40 extends mu40 {

    /* JADX INFO: renamed from: a */
    public final String f126452a;

    /* JADX INFO: renamed from: b */
    public final String f126453b;

    /* JADX INFO: renamed from: c */
    public final String f126454c;

    /* JADX INFO: renamed from: d */
    public final String f126455d;

    /* JADX INFO: renamed from: e */
    public final String f126456e;

    /* JADX INFO: renamed from: f */
    public final String f126457f;

    public ku40(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f126452a = str;
        this.f126453b = str2;
        this.f126454c = str3;
        this.f126455d = str4;
        this.f126456e = str5;
        this.f126457f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ku40)) {
            return false;
        }
        ku40 ku40Var = (ku40) obj;
        return wj50.m88271j(this.f126452a, ku40Var.f126452a) && wj50.m88271j(this.f126453b, ku40Var.f126453b) && wj50.m88271j(this.f126454c, ku40Var.f126454c) && wj50.m88271j(this.f126455d, ku40Var.f126455d) && wj50.m88271j(this.f126456e, ku40Var.f126456e) && wj50.m88271j(this.f126457f, ku40Var.f126457f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f126452a.hashCode() * 31, 31, this.f126453b), 31, this.f126454c), 31, this.f126455d);
        String str = this.f126456e;
        return this.f126457f.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
