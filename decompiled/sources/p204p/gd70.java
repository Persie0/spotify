package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class gd70 implements d15, kd70 {

    /* JADX INFO: renamed from: a */
    public int f78751a;

    /* JADX INFO: renamed from: A0 */
    public abstract List mo36061A0();

    /* JADX INFO: renamed from: B0 */
    public abstract gn91 mo36062B0();

    /* JADX INFO: renamed from: C0 */
    public abstract jn91 mo36063C0();

    /* JADX INFO: renamed from: D0 */
    public abstract boolean mo36064D0();

    /* JADX INFO: renamed from: E0 */
    public abstract gd70 mo41684E0(ld70 ld70Var);

    /* JADX INFO: renamed from: F0 */
    public abstract d6a1 mo35108F0();

    /* JADX INFO: renamed from: J */
    public abstract bfe0 mo36065J();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd70)) {
            return false;
        }
        gd70 gd70Var = (gd70) obj;
        if (mo36064D0() == gd70Var.mo36064D0()) {
            return akg1.m26238w(unq0.f232220N0, mo35108F0(), gd70Var.mo35108F0());
        }
        return false;
    }

    @Override // p204p.d15
    public final l25 getAnnotations() {
        l25 l25Var;
        o25 o25Var = (o25) p25.f173246b.m97257o(mo36062B0(), p25.f173245a[0]);
        return (o25Var == null || (l25Var = o25Var.f160933a) == null) ? e370.f55667h : l25Var;
    }

    public final int hashCode() {
        int iHashCode;
        int i = this.f78751a;
        if (i != 0) {
            return i;
        }
        if (qug1.m73946p(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (mo36064D0() ? 1 : 0) + ((mo36061A0().hashCode() + (mo36063C0().hashCode() * 31)) * 31);
        }
        this.f78751a = iHashCode;
        return iHashCode;
    }
}
