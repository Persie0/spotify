package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class b1w0 {

    /* JADX INFO: renamed from: a */
    public final String f22428a;

    /* JADX INFO: renamed from: b */
    public final c1w0 f22429b;

    /* JADX INFO: renamed from: c */
    public final b250 f22430c;

    public b1w0(String str, c1w0 c1w0Var, b250 b250Var) {
        this.f22428a = str;
        this.f22429b = c1w0Var;
        this.f22430c = b250Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1w0)) {
            return false;
        }
        b1w0 b1w0Var = (b1w0) obj;
        return wj50.m88271j(this.f22428a, b1w0Var.f22428a) && wj50.m88271j(this.f22429b, b1w0Var.f22429b) && wj50.m88271j(this.f22430c, b1w0Var.f22430c);
    }

    public final int hashCode() {
        return this.f22430c.hashCode() + ((this.f22429b.hashCode() + (this.f22428a.hashCode() * 31)) * 31);
    }
}
