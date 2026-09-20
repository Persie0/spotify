package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class d6b1 implements guj {

    /* JADX INFO: renamed from: a */
    public final String f45650a;

    /* JADX INFO: renamed from: b */
    public final String f45651b;

    /* JADX INFO: renamed from: c */
    public final String f45652c;

    /* JADX INFO: renamed from: d */
    public final String f45653d;

    public d6b1(String str, String str2, String str3, String str4) {
        this.f45650a = str;
        this.f45651b = str2;
        this.f45652c = str3;
        this.f45653d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6b1)) {
            return false;
        }
        d6b1 d6b1Var = (d6b1) obj;
        return wj50.m88271j(this.f45650a, d6b1Var.f45650a) && wj50.m88271j(this.f45651b, d6b1Var.f45651b) && wj50.m88271j(this.f45652c, d6b1Var.f45652c) && wj50.m88271j(this.f45653d, d6b1Var.f45653d);
    }

    public final int hashCode() {
        String str = this.f45650a;
        return this.f45653d.hashCode() + s571.m77243b(s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f45651b), 31, this.f45652c);
    }
}
