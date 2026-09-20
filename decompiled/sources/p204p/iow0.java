package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class iow0 extends now0 {

    /* JADX INFO: renamed from: a */
    public final String f104294a;

    /* JADX INFO: renamed from: b */
    public final xcl0 f104295b;

    public iow0(String str, xcl0 xcl0Var) {
        this.f104294a = str;
        this.f104295b = xcl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iow0)) {
            return false;
        }
        iow0 iow0Var = (iow0) obj;
        return wj50.m88271j(this.f104294a, iow0Var.f104294a) && wj50.m88271j(this.f104295b, iow0Var.f104295b);
    }

    public final int hashCode() {
        return this.f104295b.hashCode() + (this.f104294a.hashCode() * 31);
    }
}
