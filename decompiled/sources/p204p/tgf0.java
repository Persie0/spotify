package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tgf0 implements ugf0 {

    /* JADX INFO: renamed from: a */
    public final int f220185a;

    /* JADX INFO: renamed from: b */
    public final int f220186b;

    public tgf0(int i, int i2) {
        this.f220185a = i;
        this.f220186b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgf0)) {
            return false;
        }
        tgf0 tgf0Var = (tgf0) obj;
        return this.f220185a == tgf0Var.f220185a && this.f220186b == tgf0Var.f220186b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f220186b) + (Integer.hashCode(this.f220185a) * 31);
    }
}
