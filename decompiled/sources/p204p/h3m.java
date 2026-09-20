package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class h3m {

    /* JADX INFO: renamed from: a */
    public final uu41 f87250a;

    /* JADX INFO: renamed from: b */
    public final String f87251b;

    public h3m(uu41 uu41Var, String str) {
        this.f87250a = uu41Var;
        this.f87251b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3m)) {
            return false;
        }
        h3m h3mVar = (h3m) obj;
        return wj50.m88271j(this.f87250a, h3mVar.f87250a) && wj50.m88271j(this.f87251b, h3mVar.f87251b);
    }

    public final int hashCode() {
        int iHashCode = this.f87250a.hashCode() * 31;
        String str = this.f87251b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
