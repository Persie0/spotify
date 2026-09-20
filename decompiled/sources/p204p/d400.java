package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class d400 {

    /* JADX INFO: renamed from: a */
    public final String f45039a;

    /* JADX INFO: renamed from: b */
    public final String f45040b;

    /* JADX INFO: renamed from: c */
    public final String f45041c;

    /* JADX INFO: renamed from: d */
    public final String f45042d;

    public d400(String str, String str2, String str3, String str4) {
        this.f45039a = str;
        this.f45040b = str2;
        this.f45041c = str3;
        this.f45042d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d400)) {
            return false;
        }
        d400 d400Var = (d400) obj;
        return wj50.m88271j(this.f45039a, d400Var.f45039a) && wj50.m88271j(this.f45040b, d400Var.f45040b) && wj50.m88271j(this.f45041c, d400Var.f45041c) && wj50.m88271j(this.f45042d, d400Var.f45042d);
    }

    public final int hashCode() {
        return this.f45042d.hashCode() + s571.m77243b(s571.m77243b(this.f45039a.hashCode() * 31, 31, this.f45040b), 31, this.f45041c);
    }
}
