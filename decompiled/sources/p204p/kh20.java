package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kh20 {

    /* JADX INFO: renamed from: a */
    public final float f122504a;

    /* JADX INFO: renamed from: b */
    public final jh20 f122505b;

    public kh20(float f, jh20 jh20Var) {
        this.f122504a = f;
        this.f122505b = jh20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh20)) {
            return false;
        }
        kh20 kh20Var = (kh20) obj;
        return Float.compare(this.f122504a, kh20Var.f122504a) == 0 && wj50.m88271j(this.f122505b, kh20Var.f122505b);
    }

    public final int hashCode() {
        return this.f122505b.hashCode() + (Float.hashCode(this.f122504a) * 31);
    }
}
