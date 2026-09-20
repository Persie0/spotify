package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ke61 implements me61, cn41 {

    /* JADX INFO: renamed from: a */
    public final int f121815a;

    /* JADX INFO: renamed from: b */
    public final boolean f121816b;

    public ke61(int i, boolean z) {
        this.f121815a = i;
        this.f121816b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke61)) {
            return false;
        }
        ke61 ke61Var = (ke61) obj;
        return this.f121815a == ke61Var.f121815a && this.f121816b == ke61Var.f121816b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f121816b) + (edb.m38547C(this.f121815a) * 31);
    }
}
