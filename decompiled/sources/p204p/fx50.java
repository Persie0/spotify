package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class fx50 {

    /* JADX INFO: renamed from: a */
    public final String f74243a;

    /* JADX INFO: renamed from: b */
    public final String f74244b;

    /* JADX INFO: renamed from: c */
    public final int f74245c;

    /* JADX INFO: renamed from: d */
    public final ex50 f74246d;

    public fx50(String str, String str2, int i, ex50 ex50Var) {
        this.f74243a = str;
        this.f74244b = str2;
        this.f74245c = i;
        this.f74246d = ex50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx50)) {
            return false;
        }
        fx50 fx50Var = (fx50) obj;
        return ux50.m84130a(this.f74243a, fx50Var.f74243a) && wj50.m88271j(this.f74244b, fx50Var.f74244b) && this.f74245c == fx50Var.f74245c && wj50.m88271j(this.f74246d, fx50Var.f74246d);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f74245c, s571.m77243b(ux50.m84131b(this.f74243a) * 31, 31, this.f74244b), 31);
        ex50 ex50Var = this.f74246d;
        return iM40938f + (ex50Var == null ? 0 : ex50Var.hashCode());
    }
}
