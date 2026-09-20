package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class efm0 implements ffm0 {

    /* JADX INFO: renamed from: a */
    public final kbm0 f59070a;

    /* JADX INFO: renamed from: b */
    public final zam0 f59071b;

    public efm0(kbm0 kbm0Var, zam0 zam0Var) {
        this.f59070a = kbm0Var;
        this.f59071b = zam0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efm0)) {
            return false;
        }
        efm0 efm0Var = (efm0) obj;
        return wj50.m88271j(this.f59070a, efm0Var.f59070a) && wj50.m88271j(this.f59071b, efm0Var.f59071b);
    }

    public final int hashCode() {
        return this.f59071b.hashCode() + (this.f59070a.f121231a.hashCode() * 31);
    }
}
