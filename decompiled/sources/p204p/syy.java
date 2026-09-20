package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class syy implements tyy {

    /* JADX INFO: renamed from: a */
    public final nr31 f215346a;

    /* JADX INFO: renamed from: b */
    public final int f215347b;

    public syy(nr31 nr31Var, int i) {
        this.f215346a = nr31Var;
        this.f215347b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof syy)) {
            return false;
        }
        syy syyVar = (syy) obj;
        return wj50.m88271j(this.f215346a, syyVar.f215346a) && this.f215347b == syyVar.f215347b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f215347b) + (this.f215346a.hashCode() * 31);
    }
}
