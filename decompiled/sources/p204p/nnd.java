package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nnd extends pnd {

    /* JADX INFO: renamed from: a */
    public final mk01 f156402a;

    /* JADX INFO: renamed from: b */
    public final String f156403b;

    public nnd(String str, mk01 mk01Var) {
        this.f156402a = mk01Var;
        this.f156403b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnd)) {
            return false;
        }
        nnd nndVar = (nnd) obj;
        return wj50.m88271j(this.f156402a, nndVar.f156402a) && wj50.m88271j(this.f156403b, nndVar.f156403b);
    }

    public final int hashCode() {
        int iHashCode = this.f156402a.hashCode() * 31;
        String str = this.f156403b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
