package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class o7v0 extends q7v0 {

    /* JADX INFO: renamed from: a */
    public final un20 f162618a;

    /* JADX INFO: renamed from: b */
    public final boolean f162619b;

    public o7v0(un20 un20Var, boolean z) {
        this.f162618a = un20Var;
        this.f162619b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7v0)) {
            return false;
        }
        o7v0 o7v0Var = (o7v0) obj;
        return wj50.m88271j(this.f162618a, o7v0Var.f162618a) && this.f162619b == o7v0Var.f162619b;
    }

    public final int hashCode() {
        un20 un20Var = this.f162618a;
        return Boolean.hashCode(this.f162619b) + ((un20Var == null ? 0 : un20Var.hashCode()) * 31);
    }
}
