package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xio0 {

    /* JADX INFO: renamed from: a */
    public final pob f261923a;

    public xio0(pob pobVar) {
        this.f261923a = pobVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xio0) && wj50.m88271j(this.f261923a, ((xio0) obj).f261923a);
    }

    public final int hashCode() {
        pob pobVar = this.f261923a;
        if (pobVar == null) {
            return 0;
        }
        return pobVar.hashCode();
    }
}
