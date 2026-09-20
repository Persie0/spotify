package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class uh20 implements vh20 {

    /* JADX INFO: renamed from: a */
    public final int f230349a;

    /* JADX INFO: renamed from: b */
    public final boolean f230350b;

    public uh20(int i, boolean z) {
        this.f230349a = i;
        this.f230350b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh20)) {
            return false;
        }
        uh20 uh20Var = (uh20) obj;
        return this.f230349a == uh20Var.f230349a && this.f230350b == uh20Var.f230350b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f230350b) + (Integer.hashCode(this.f230349a) * 31);
    }
}
