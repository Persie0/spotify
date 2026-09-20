package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cfy {

    /* JADX INFO: renamed from: a */
    public final boolean f37477a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1737cd f37478b;

    public cfy(boolean z, AbstractC1737cd abstractC1737cd) {
        this.f37477a = z;
        this.f37478b = abstractC1737cd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfy)) {
            return false;
        }
        cfy cfyVar = (cfy) obj;
        return this.f37477a == cfyVar.f37477a && wj50.m88271j(this.f37478b, cfyVar.f37478b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f37477a) * 31;
        AbstractC1737cd abstractC1737cd = this.f37478b;
        return iHashCode + (abstractC1737cd == null ? 0 : abstractC1737cd.hashCode());
    }
}
