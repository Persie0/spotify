package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class cn80 {

    /* JADX INFO: renamed from: a */
    public final int f39916a;

    /* JADX INFO: renamed from: b */
    public final int f39917b;

    /* JADX INFO: renamed from: c */
    public final String f39918c;

    /* JADX INFO: renamed from: d */
    public final String f39919d;

    /* JADX INFO: renamed from: e */
    public final eh00 f39920e;

    public cn80(int i, int i2, String str, String str2, eh00 eh00Var) {
        this.f39916a = i;
        this.f39917b = i2;
        this.f39918c = str;
        this.f39919d = str2;
        this.f39920e = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn80)) {
            return false;
        }
        cn80 cn80Var = (cn80) obj;
        return this.f39916a == cn80Var.f39916a && this.f39917b == cn80Var.f39917b && wj50.m88271j(this.f39918c, cn80Var.f39918c) && wj50.m88271j(this.f39919d, cn80Var.f39919d) && wj50.m88271j(this.f39920e, cn80Var.f39920e);
    }

    public final int hashCode() {
        return this.f39920e.hashCode() + s571.m77243b(s571.m77243b(mt60.m62800g(this.f39917b, Integer.hashCode(this.f39916a) * 31, 31), 31, this.f39918c), 31, this.f39919d);
    }
}
