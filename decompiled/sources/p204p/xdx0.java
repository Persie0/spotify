package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xdx0 {

    /* JADX INFO: renamed from: a */
    public final jex0 f260565a;

    /* JADX INFO: renamed from: b */
    public final String f260566b;

    /* JADX INFO: renamed from: c */
    public final rq91 f260567c;

    public xdx0(jex0 jex0Var, String str, rq91 rq91Var) {
        this.f260565a = jex0Var;
        this.f260566b = str;
        this.f260567c = rq91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdx0)) {
            return false;
        }
        xdx0 xdx0Var = (xdx0) obj;
        return this.f260565a.equals(xdx0Var.f260565a) && this.f260566b.equals(xdx0Var.f260566b) && this.f260567c.equals(xdx0Var.f260567c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f260567c.f201781b) + s571.m77243b(this.f260565a.hashCode() * 31, 31, this.f260566b);
    }
}
