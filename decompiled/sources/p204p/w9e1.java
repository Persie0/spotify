package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class w9e1 {

    /* JADX INFO: renamed from: a */
    public final boolean f249166a;

    /* JADX INFO: renamed from: b */
    public final boolean f249167b;

    /* JADX INFO: renamed from: c */
    public final u9e1 f249168c;

    /* JADX INFO: renamed from: d */
    public final boolean f249169d;

    public w9e1(boolean z, boolean z2, u9e1 u9e1Var, boolean z3) {
        this.f249166a = z;
        this.f249167b = z2;
        this.f249168c = u9e1Var;
        this.f249169d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9e1)) {
            return false;
        }
        w9e1 w9e1Var = (w9e1) obj;
        return this.f249166a == w9e1Var.f249166a && this.f249167b == w9e1Var.f249167b && this.f249168c.equals(w9e1Var.f249168c) && this.f249169d == w9e1Var.f249169d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f249169d) + ((this.f249168c.hashCode() + s571.m77245d(Boolean.hashCode(this.f249166a) * 31, 31, this.f249167b)) * 31);
    }
}
