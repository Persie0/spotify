package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class a5p0 {

    /* JADX INFO: renamed from: a */
    public final String f12577a;

    /* JADX INFO: renamed from: b */
    public final String f12578b;

    /* JADX INFO: renamed from: c */
    public final qf40 f12579c;

    public a5p0(String str, String str2, qf40 qf40Var) {
        this.f12577a = str;
        this.f12578b = str2;
        this.f12579c = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5p0)) {
            return false;
        }
        a5p0 a5p0Var = (a5p0) obj;
        return wj50.m88271j(this.f12577a, a5p0Var.f12577a) && wj50.m88271j(this.f12578b, a5p0Var.f12578b) && wj50.m88271j(this.f12579c, a5p0Var.f12579c);
    }

    public final int hashCode() {
        return this.f12579c.hashCode() + s571.m77243b(this.f12577a.hashCode() * 31, 31, this.f12578b);
    }
}
