package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class fu31 implements rsy {

    /* JADX INFO: renamed from: a */
    public final vc40 f73394a;

    /* JADX INFO: renamed from: b */
    public final String f73395b;

    /* JADX INFO: renamed from: c */
    public final int f73396c;

    public fu31(vc40 vc40Var, String str, int i) {
        this.f73394a = vc40Var;
        this.f73395b = str;
        this.f73396c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu31)) {
            return false;
        }
        fu31 fu31Var = (fu31) obj;
        return wj50.m88271j(this.f73394a, fu31Var.f73394a) && wj50.m88271j(this.f73395b, fu31Var.f73395b) && this.f73396c == fu31Var.f73396c;
    }

    public final int hashCode() {
        int iHashCode = this.f73394a.hashCode() * 31;
        String str = this.f73395b;
        return edb.m38547C(this.f73396c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.f73394a + ", mimeType=" + this.f73395b + ", dataSource=" + adn.m25613y(this.f73396c) + ')';
    }
}
