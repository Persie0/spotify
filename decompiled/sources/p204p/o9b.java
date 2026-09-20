package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class o9b implements vwf {

    /* JADX INFO: renamed from: a */
    public final String f162992a;

    /* JADX INFO: renamed from: b */
    public final wwu f162993b;

    /* JADX INFO: renamed from: c */
    public final String f162994c;

    /* JADX INFO: renamed from: d */
    public final x4x f162995d;

    public o9b(String str, wwu wwuVar, String str2, x4x x4xVar) {
        this.f162992a = str;
        this.f162993b = wwuVar;
        this.f162994c = str2;
        this.f162995d = x4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9b)) {
            return false;
        }
        o9b o9bVar = (o9b) obj;
        return wj50.m88271j(this.f162992a, o9bVar.f162992a) && wj50.m88271j(this.f162993b, o9bVar.f162993b) && wj50.m88271j(this.f162994c, o9bVar.f162994c) && wj50.m88271j(this.f162995d, o9bVar.f162995d);
    }

    public final int hashCode() {
        int iHashCode = this.f162992a.hashCode() * 31;
        wwu wwuVar = this.f162993b;
        return this.f162995d.hashCode() + s571.m77243b((iHashCode + (wwuVar == null ? 0 : wwuVar.hashCode())) * 31, 31, this.f162994c);
    }
}
