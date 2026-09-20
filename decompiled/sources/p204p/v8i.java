package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class v8i extends w8i {

    /* JADX INFO: renamed from: a */
    public final w8b1 f238581a;

    /* JADX INFO: renamed from: b */
    public final String f238582b;

    public v8i(w8b1 w8b1Var, String str) {
        this.f238581a = w8b1Var;
        this.f238582b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8i)) {
            return false;
        }
        v8i v8iVar = (v8i) obj;
        return wj50.m88271j(this.f238581a, v8iVar.f238581a) && wj50.m88271j(this.f238582b, v8iVar.f238582b);
    }

    public final int hashCode() {
        int iHashCode = this.f238581a.hashCode() * 31;
        String str = this.f238582b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
