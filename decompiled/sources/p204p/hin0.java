package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hin0 {

    /* JADX INFO: renamed from: a */
    public final fmr0 f91846a;

    /* JADX INFO: renamed from: b */
    public final int f91847b;

    /* JADX INFO: renamed from: c */
    public final int f91848c;

    /* JADX INFO: renamed from: d */
    public final qco0 f91849d;

    public hin0(fmr0 fmr0Var, int i, int i2, qco0 qco0Var) {
        this.f91846a = fmr0Var;
        this.f91847b = i;
        this.f91848c = i2;
        this.f91849d = qco0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hin0)) {
            return false;
        }
        hin0 hin0Var = (hin0) obj;
        return wj50.m88271j(this.f91846a, hin0Var.f91846a) && this.f91847b == hin0Var.f91847b && this.f91848c == hin0Var.f91848c && wj50.m88271j(this.f91849d, hin0Var.f91849d);
    }

    public final int hashCode() {
        return this.f91849d.hashCode() + mt60.m62800g(this.f91848c, mt60.m62800g(this.f91847b, this.f91846a.hashCode() * 31, 31), 31);
    }
}
