package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class yfb0 implements agb0 {

    /* JADX INFO: renamed from: a */
    public final boolean f272199a;

    /* JADX INFO: renamed from: b */
    public final csc1 f272200b;

    public yfb0(boolean z, csc1 csc1Var) {
        this.f272199a = z;
        this.f272200b = csc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfb0)) {
            return false;
        }
        yfb0 yfb0Var = (yfb0) obj;
        return this.f272199a == yfb0Var.f272199a && this.f272200b == yfb0Var.f272200b;
    }

    public final int hashCode() {
        return this.f272200b.hashCode() + (Boolean.hashCode(this.f272199a) * 31);
    }
}
