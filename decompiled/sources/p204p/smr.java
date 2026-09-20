package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class smr extends pnr {

    /* JADX INFO: renamed from: a */
    public final ppr f210721a;

    /* JADX INFO: renamed from: b */
    public final boolean f210722b;

    public smr(ppr pprVar, boolean z) {
        this.f210721a = pprVar;
        this.f210722b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smr)) {
            return false;
        }
        smr smrVar = (smr) obj;
        return wj50.m88271j(this.f210721a, smrVar.f210721a) && this.f210722b == smrVar.f210722b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f210722b) + (this.f210721a.hashCode() * 31);
    }
}
