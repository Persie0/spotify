package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class w5c1 {

    /* JADX INFO: renamed from: a */
    public final t5c1 f248062a;

    /* JADX INFO: renamed from: b */
    public final vco f248063b;

    public w5c1(t5c1 t5c1Var, vco vcoVar) {
        this.f248062a = t5c1Var;
        this.f248063b = vcoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5c1)) {
            return false;
        }
        w5c1 w5c1Var = (w5c1) obj;
        return wj50.m88271j(this.f248062a, w5c1Var.f248062a) && wj50.m88271j(this.f248063b, w5c1Var.f248063b);
    }

    public final int hashCode() {
        return this.f248063b.hashCode() + (this.f248062a.hashCode() * 31);
    }
}
