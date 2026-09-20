package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class rad1 {

    /* JADX INFO: renamed from: a */
    public final e940 f197289a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2609yd f197290b;

    public rad1(e940 e940Var, InterfaceC2609yd interfaceC2609yd) {
        this.f197289a = e940Var;
        this.f197290b = interfaceC2609yd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rad1)) {
            return false;
        }
        rad1 rad1Var = (rad1) obj;
        return wj50.m88271j(this.f197289a, rad1Var.f197289a) && wj50.m88271j(this.f197290b, rad1Var.f197290b);
    }

    public final int hashCode() {
        return this.f197290b.hashCode() + (this.f197289a.hashCode() * 31);
    }
}
