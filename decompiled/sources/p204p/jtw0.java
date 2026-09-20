package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jtw0 implements ktw0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC2524w8 f115978a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2524w8 f115979b;

    /* JADX INFO: renamed from: c */
    public final boolean f115980c;

    /* JADX INFO: renamed from: d */
    public final otw0 f115981d;

    public jtw0(AbstractC2524w8 abstractC2524w8, AbstractC2524w8 abstractC2524w9, boolean z, otw0 otw0Var) {
        this.f115978a = abstractC2524w8;
        this.f115979b = abstractC2524w9;
        this.f115980c = z;
        this.f115981d = otw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtw0)) {
            return false;
        }
        jtw0 jtw0Var = (jtw0) obj;
        return wj50.m88271j(this.f115978a, jtw0Var.f115978a) && wj50.m88271j(this.f115979b, jtw0Var.f115979b) && this.f115980c == jtw0Var.f115980c && this.f115981d == jtw0Var.f115981d;
    }

    public final int hashCode() {
        int iHashCode = this.f115978a.hashCode() * 31;
        AbstractC2524w8 abstractC2524w8 = this.f115979b;
        return this.f115981d.hashCode() + s571.m77245d((iHashCode + (abstractC2524w8 == null ? 0 : abstractC2524w8.hashCode())) * 31, 31, this.f115980c);
    }
}
