package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class nua0 {

    /* JADX INFO: renamed from: a */
    public final String f158545a;

    /* JADX INFO: renamed from: b */
    public final String f158546b;

    /* JADX INFO: renamed from: c */
    public final jg7 f158547c;

    public nua0(String str, String str2, jg7 jg7Var) {
        this.f158545a = str;
        this.f158546b = str2;
        this.f158547c = jg7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nua0)) {
            return false;
        }
        nua0 nua0Var = (nua0) obj;
        return wj50.m88271j(this.f158545a, nua0Var.f158545a) && wj50.m88271j(this.f158546b, nua0Var.f158546b) && wj50.m88271j(this.f158547c, nua0Var.f158547c);
    }

    public final int hashCode() {
        return this.f158547c.hashCode() + s571.m77243b(this.f158545a.hashCode() * 31, 31, this.f158546b);
    }
}
