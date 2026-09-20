package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class x7i {

    /* JADX INFO: renamed from: a */
    public final ae50 f258925a;

    /* JADX INFO: renamed from: b */
    public final String f258926b;

    public x7i(String str, ae50 ae50Var) {
        this.f258925a = ae50Var;
        this.f258926b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7i)) {
            return false;
        }
        x7i x7iVar = (x7i) obj;
        return this.f258925a.equals(x7iVar.f258925a) && wj50.m88271j(this.f258926b, x7iVar.f258926b);
    }

    public final int hashCode() {
        int iHashCode = this.f258925a.hashCode() * 31;
        String str = this.f258926b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
