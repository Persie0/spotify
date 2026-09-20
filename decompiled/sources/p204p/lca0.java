package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lca0 implements nca0 {

    /* JADX INFO: renamed from: a */
    public final cvt f131886a;

    public lca0(cvt cvtVar) {
        this.f131886a = cvtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lca0) && wj50.m88271j(this.f131886a, ((lca0) obj).f131886a);
    }

    public final int hashCode() {
        cvt cvtVar = this.f131886a;
        if (cvtVar == null) {
            return 0;
        }
        return cvtVar.hashCode();
    }
}
