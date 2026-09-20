package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fpy extends hpy {

    /* JADX INFO: renamed from: a */
    public final boolean f72014a;

    /* JADX INFO: renamed from: b */
    public final String f72015b;

    public fpy(String str, int i) {
        boolean z = (i & 1) == 0;
        str = (i & 2) != 0 ? null : str;
        this.f72014a = z;
        this.f72015b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpy)) {
            return false;
        }
        fpy fpyVar = (fpy) obj;
        return this.f72014a == fpyVar.f72014a && wj50.m88271j(this.f72015b, fpyVar.f72015b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f72014a) * 31;
        String str = this.f72015b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
