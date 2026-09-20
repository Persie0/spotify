package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class y6b implements c7b {

    /* JADX INFO: renamed from: a */
    public final String f269717a;

    /* JADX INFO: renamed from: b */
    public final Boolean f269718b;

    public /* synthetic */ y6b(String str, int i) {
        this((i & 1) != 0 ? null : str, (Boolean) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6b)) {
            return false;
        }
        y6b y6bVar = (y6b) obj;
        return wj50.m88271j(this.f269717a, y6bVar.f269717a) && wj50.m88271j(this.f269718b, y6bVar.f269718b);
    }

    public final int hashCode() {
        String str = this.f269717a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f269718b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public y6b(String str, Boolean bool) {
        this.f269717a = str;
        this.f269718b = bool;
    }
}
