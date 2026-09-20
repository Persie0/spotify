package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class tm10 extends um10 {

    /* JADX INFO: renamed from: a */
    public final String f221565a;

    /* JADX INFO: renamed from: b */
    public final String f221566b;

    /* JADX INFO: renamed from: c */
    public final int f221567c;

    /* JADX INFO: renamed from: d */
    public final String f221568d;

    public tm10(String str, String str2, int i, String str3) {
        this.f221565a = str;
        this.f221566b = str2;
        this.f221567c = i;
        this.f221568d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm10)) {
            return false;
        }
        tm10 tm10Var = (tm10) obj;
        return wj50.m88271j(this.f221565a, tm10Var.f221565a) && wj50.m88271j(this.f221566b, tm10Var.f221566b) && this.f221567c == tm10Var.f221567c && wj50.m88271j(this.f221568d, tm10Var.f221568d);
    }

    public final int hashCode() {
        return this.f221568d.hashCode() + f710.m40938f(this.f221567c, s571.m77243b(this.f221565a.hashCode() * 31, 31, this.f221566b), 31);
    }
}
