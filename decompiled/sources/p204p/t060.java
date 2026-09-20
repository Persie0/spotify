package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class t060 {

    /* JADX INFO: renamed from: a */
    public final String f215769a;

    /* JADX INFO: renamed from: b */
    public final x060 f215770b;

    public t060(String str, x060 x060Var) {
        this.f215769a = str;
        this.f215770b = x060Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t060)) {
            return false;
        }
        t060 t060Var = (t060) obj;
        return wj50.m88271j(this.f215769a, t060Var.f215769a) && wj50.m88271j(this.f215770b, t060Var.f215770b);
    }

    public final int hashCode() {
        return this.f215770b.hashCode() + (this.f215769a.hashCode() * 31);
    }
}
