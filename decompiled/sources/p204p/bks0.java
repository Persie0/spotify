package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class bks0 implements iks0 {

    /* JADX INFO: renamed from: a */
    public final boolean f28008a;

    /* JADX INFO: renamed from: b */
    public final ths0 f28009b;

    public bks0(boolean z, ths0 ths0Var) {
        this.f28008a = z;
        this.f28009b = ths0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bks0)) {
            return false;
        }
        bks0 bks0Var = (bks0) obj;
        return this.f28008a == bks0Var.f28008a && wj50.m88271j(this.f28009b, bks0Var.f28009b);
    }

    public final int hashCode() {
        return this.f28009b.hashCode() + (Boolean.hashCode(this.f28008a) * 31);
    }
}
