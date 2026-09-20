package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ucx {

    /* JADX INFO: renamed from: a */
    public final String f229128a;

    /* JADX INFO: renamed from: b */
    public final String f229129b;

    /* JADX INFO: renamed from: c */
    public final String f229130c;

    /* JADX INFO: renamed from: d */
    public final String f229131d;

    /* JADX INFO: renamed from: e */
    public final int f229132e;

    public ucx(int i, String str, String str2, String str3, String str4) {
        this.f229128a = str;
        this.f229129b = str2;
        this.f229130c = str3;
        this.f229131d = str4;
        this.f229132e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucx)) {
            return false;
        }
        ucx ucxVar = (ucx) obj;
        return wj50.m88271j(this.f229128a, ucxVar.f229128a) && wj50.m88271j(this.f229129b, ucxVar.f229129b) && wj50.m88271j(this.f229130c, ucxVar.f229130c) && wj50.m88271j(this.f229131d, ucxVar.f229131d) && this.f229132e == ucxVar.f229132e;
    }

    public final int hashCode() {
        int iHashCode = this.f229128a.hashCode() * 31;
        String str = this.f229129b;
        return edb.m38547C(this.f229132e) + s571.m77243b(s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f229130c), 31, this.f229131d);
    }
}
