package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class f6o0 {

    /* JADX INFO: renamed from: a */
    public final int f66449a;

    /* JADX INFO: renamed from: b */
    public final int f66450b;

    /* JADX INFO: renamed from: c */
    public final o7o0 f66451c;

    public f6o0(int i, int i2, o7o0 o7o0Var) {
        this.f66449a = i;
        this.f66450b = i2;
        this.f66451c = o7o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6o0)) {
            return false;
        }
        f6o0 f6o0Var = (f6o0) obj;
        return this.f66449a == f6o0Var.f66449a && this.f66450b == f6o0Var.f66450b && wj50.m88271j(this.f66451c, f6o0Var.f66451c);
    }

    public final int hashCode() {
        return this.f66451c.f162594a.hashCode() + mt60.m62800g(this.f66450b, Integer.hashCode(this.f66449a) * 31, 31);
    }
}
