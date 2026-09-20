package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class vu80 extends av80 {

    /* JADX INFO: renamed from: a */
    public final int f244887a;

    /* JADX INFO: renamed from: b */
    public final dw50 f244888b;

    public vu80(int i, dw50 dw50Var) {
        this.f244887a = i;
        this.f244888b = dw50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu80)) {
            return false;
        }
        vu80 vu80Var = (vu80) obj;
        return this.f244887a == vu80Var.f244887a && wj50.m88271j(this.f244888b, vu80Var.f244888b);
    }

    public final int hashCode() {
        return this.f244888b.hashCode() + (Integer.hashCode(this.f244887a) * 31);
    }
}
