package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lnk {

    /* JADX INFO: renamed from: a */
    public final hnk f135175a;

    public lnk(hnk hnkVar) {
        this.f135175a = hnkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lnk) && wj50.m88271j(this.f135175a, ((lnk) obj).f135175a);
    }

    public final int hashCode() {
        return this.f135175a.hashCode();
    }
}
