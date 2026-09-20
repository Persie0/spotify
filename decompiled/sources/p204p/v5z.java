package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class v5z {

    /* JADX INFO: renamed from: a */
    public final u5z f237684a;

    /* JADX INFO: renamed from: b */
    public final String f237685b;

    public v5z(u5z u5zVar, String str) {
        this.f237684a = u5zVar;
        this.f237685b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5z)) {
            return false;
        }
        v5z v5zVar = (v5z) obj;
        return wj50.m88271j(this.f237684a, v5zVar.f237684a) && wj50.m88271j(this.f237685b, v5zVar.f237685b);
    }

    public final int hashCode() {
        int iHashCode = this.f237684a.hashCode() * 31;
        String str = this.f237685b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
