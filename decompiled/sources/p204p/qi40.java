package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class qi40 implements ri40 {

    /* JADX INFO: renamed from: a */
    public final int f188932a;

    /* JADX INFO: renamed from: b */
    public final int f188933b;

    /* JADX INFO: renamed from: c */
    public final int f188934c;

    public qi40(int i, int i2, int i3) {
        this.f188932a = i;
        this.f188933b = i2;
        this.f188934c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi40)) {
            return false;
        }
        qi40 qi40Var = (qi40) obj;
        return this.f188932a == qi40Var.f188932a && this.f188933b == qi40Var.f188933b && this.f188934c == qi40Var.f188934c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f188934c) + mt60.m62800g(this.f188933b, Integer.hashCode(this.f188932a) * 31, 31);
    }
}
