package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tak0 implements uak0 {

    /* JADX INFO: renamed from: a */
    public final s730 f218624a;

    /* JADX INFO: renamed from: b */
    public final int f218625b;

    public tak0(s730 s730Var, int i) {
        this.f218624a = s730Var;
        this.f218625b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tak0)) {
            return false;
        }
        tak0 tak0Var = (tak0) obj;
        return wj50.m88271j(this.f218624a, tak0Var.f218624a) && this.f218625b == tak0Var.f218625b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f218625b) + (this.f218624a.hashCode() * 31);
    }
}
