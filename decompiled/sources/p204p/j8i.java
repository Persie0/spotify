package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class j8i extends w8i {

    /* JADX INFO: renamed from: a */
    public final ae50 f109946a;

    /* JADX INFO: renamed from: b */
    public final String f109947b;

    public j8i(String str, ae50 ae50Var) {
        this.f109946a = ae50Var;
        this.f109947b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8i)) {
            return false;
        }
        j8i j8iVar = (j8i) obj;
        return this.f109946a.equals(j8iVar.f109946a) && wj50.m88271j(this.f109947b, j8iVar.f109947b);
    }

    public final int hashCode() {
        int iHashCode = this.f109946a.hashCode() * 31;
        String str = this.f109947b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
