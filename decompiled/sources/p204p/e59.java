package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class e59 extends h59 {

    /* JADX INFO: renamed from: a */
    public final int f56320a;

    /* JADX INFO: renamed from: b */
    public final hy81 f56321b;

    public e59(int i, hy81 hy81Var) {
        this.f56320a = i;
        this.f56321b = hy81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e59)) {
            return false;
        }
        e59 e59Var = (e59) obj;
        return this.f56320a == e59Var.f56320a && wj50.m88271j(this.f56321b, e59Var.f56321b);
    }

    public final int hashCode() {
        return this.f56321b.hashCode() + (Integer.hashCode(this.f56320a) * 31);
    }
}
