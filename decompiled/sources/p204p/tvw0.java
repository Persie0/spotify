package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tvw0 {

    /* JADX INFO: renamed from: a */
    public final String f224264a;

    /* JADX INFO: renamed from: b */
    public final String f224265b;

    /* JADX INFO: renamed from: c */
    public final String f224266c;

    public tvw0(String str, String str2, String str3) {
        this.f224264a = str;
        this.f224265b = str2;
        this.f224266c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvw0)) {
            return false;
        }
        tvw0 tvw0Var = (tvw0) obj;
        return wj50.m88271j(this.f224264a, tvw0Var.f224264a) && wj50.m88271j(this.f224265b, tvw0Var.f224265b) && wj50.m88271j(this.f224266c, tvw0Var.f224266c);
    }

    public final int hashCode() {
        return this.f224266c.hashCode() + s571.m77243b(this.f224264a.hashCode() * 31, 31, this.f224265b);
    }
}
