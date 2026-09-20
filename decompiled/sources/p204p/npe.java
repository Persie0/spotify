package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class npe extends rpe {

    /* JADX INFO: renamed from: a */
    public final ty81 f156954a;

    /* JADX INFO: renamed from: b */
    public final fq01 f156955b;

    /* JADX INFO: renamed from: c */
    public final int f156956c;

    static {
        wg61 wg61Var = fq01.f72032c;
    }

    public npe(ty81 ty81Var, fq01 fq01Var, int i) {
        this.f156954a = ty81Var;
        this.f156955b = fq01Var;
        this.f156956c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npe)) {
            return false;
        }
        npe npeVar = (npe) obj;
        return wj50.m88271j(this.f156954a, npeVar.f156954a) && wj50.m88271j(this.f156955b, npeVar.f156955b) && this.f156956c == npeVar.f156956c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f156956c) + ((this.f156955b.hashCode() + (this.f156954a.hashCode() * 31)) * 31);
    }
}
