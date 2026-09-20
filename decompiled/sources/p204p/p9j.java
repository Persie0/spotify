package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class p9j {

    /* JADX INFO: renamed from: a */
    public final String f175252a;

    /* JADX INFO: renamed from: b */
    public final String f175253b;

    /* JADX INFO: renamed from: c */
    public final boolean f175254c;

    /* JADX INFO: renamed from: d */
    public final String f175255d;

    public p9j(String str, String str2, boolean z, String str3) {
        this.f175252a = str;
        this.f175253b = str2;
        this.f175254c = z;
        this.f175255d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9j)) {
            return false;
        }
        p9j p9jVar = (p9j) obj;
        return wj50.m88271j(this.f175252a, p9jVar.f175252a) && wj50.m88271j(this.f175253b, p9jVar.f175253b) && this.f175254c == p9jVar.f175254c && wj50.m88271j(this.f175255d, p9jVar.f175255d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(this.f175252a.hashCode() * 31, 31, this.f175253b), 31, this.f175254c);
        String str = this.f175255d;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }
}
