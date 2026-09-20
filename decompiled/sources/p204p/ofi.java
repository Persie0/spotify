package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ofi {

    /* JADX INFO: renamed from: a */
    public final luh f164766a;

    /* JADX INFO: renamed from: b */
    public final pfa0 f164767b;

    /* JADX INFO: renamed from: c */
    public final boolean f164768c;

    /* JADX INFO: renamed from: d */
    public final v140 f164769d;

    /* JADX INFO: renamed from: e */
    public final erc1 f164770e;

    public ofi(luh luhVar, v140 v140Var, pfa0 pfa0Var, erc1 erc1Var, boolean z) {
        this.f164766a = luhVar;
        this.f164767b = pfa0Var;
        this.f164768c = z;
        this.f164769d = v140Var;
        this.f164770e = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofi)) {
            return false;
        }
        ofi ofiVar = (ofi) obj;
        return wj50.m88271j(this.f164766a, ofiVar.f164766a) && wj50.m88271j(this.f164767b, ofiVar.f164767b) && this.f164768c == ofiVar.f164768c && wj50.m88271j(this.f164769d, ofiVar.f164769d) && wj50.m88271j(this.f164770e, ofiVar.f164770e);
    }

    public final int hashCode() {
        int iHashCode = (this.f164769d.hashCode() + s571.m77245d((this.f164767b.hashCode() + (this.f164766a.hashCode() * 31)) * 31, 31, this.f164768c)) * 31;
        erc1 erc1Var = this.f164770e;
        return iHashCode + (erc1Var == null ? 0 : erc1Var.hashCode());
    }
}
