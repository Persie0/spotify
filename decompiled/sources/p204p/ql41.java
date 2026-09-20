package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ql41 {

    /* JADX INFO: renamed from: a */
    public final pob f189734a;

    public ql41(pob pobVar) {
        this.f189734a = pobVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ql41) && wj50.m88271j(this.f189734a, ((ql41) obj).f189734a);
    }

    public final int hashCode() {
        pob pobVar = this.f189734a;
        if (pobVar == null) {
            return 0;
        }
        return pobVar.hashCode();
    }
}
