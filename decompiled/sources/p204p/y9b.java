package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class y9b implements vwf {

    /* JADX INFO: renamed from: a */
    public final String f270556a;

    /* JADX INFO: renamed from: b */
    public final wwu f270557b;

    /* JADX INFO: renamed from: c */
    public final vwf f270558c;

    /* JADX INFO: renamed from: d */
    public final String f270559d;

    /* JADX INFO: renamed from: e */
    public final String f270560e;

    public y9b(String str, wwu wwuVar, vwf vwfVar, String str2, String str3) {
        this.f270556a = str;
        this.f270557b = wwuVar;
        this.f270558c = vwfVar;
        this.f270559d = str2;
        this.f270560e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9b)) {
            return false;
        }
        y9b y9bVar = (y9b) obj;
        return wj50.m88271j(this.f270556a, y9bVar.f270556a) && wj50.m88271j(this.f270557b, y9bVar.f270557b) && wj50.m88271j(this.f270558c, y9bVar.f270558c) && wj50.m88271j(this.f270559d, y9bVar.f270559d) && wj50.m88271j(this.f270560e, y9bVar.f270560e);
    }

    public final int hashCode() {
        int iHashCode = this.f270556a.hashCode() * 31;
        wwu wwuVar = this.f270557b;
        int iHashCode2 = (iHashCode + (wwuVar == null ? 0 : wwuVar.hashCode())) * 31;
        vwf vwfVar = this.f270558c;
        return this.f270560e.hashCode() + s571.m77243b((iHashCode2 + (vwfVar != null ? vwfVar.hashCode() : 0)) * 31, 31, this.f270559d);
    }
}
