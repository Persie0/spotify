package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gwe0 {

    /* JADX INFO: renamed from: a */
    public final String f84988a;

    /* JADX INFO: renamed from: b */
    public final String f84989b;

    /* JADX INFO: renamed from: c */
    public final String f84990c;

    public gwe0(String str, String str2, String str3) {
        this.f84988a = str;
        this.f84989b = str2;
        this.f84990c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwe0)) {
            return false;
        }
        gwe0 gwe0Var = (gwe0) obj;
        return wj50.m88271j(this.f84988a, gwe0Var.f84988a) && wj50.m88271j(this.f84989b, gwe0Var.f84989b) && wj50.m88271j(this.f84990c, gwe0Var.f84990c);
    }

    public final int hashCode() {
        return this.f84990c.hashCode() + s571.m77243b(this.f84988a.hashCode() * 31, 31, this.f84989b);
    }
}
