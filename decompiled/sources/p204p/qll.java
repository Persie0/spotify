package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qll {

    /* JADX INFO: renamed from: a */
    public final String f189878a;

    /* JADX INFO: renamed from: b */
    public final String f189879b;

    /* JADX INFO: renamed from: c */
    public final int f189880c;

    /* JADX INFO: renamed from: d */
    public final pll f189881d;

    /* JADX INFO: renamed from: e */
    public final boolean f189882e;

    /* JADX INFO: renamed from: f */
    public final boolean f189883f;

    public qll(String str, String str2, int i, pll pllVar, boolean z, boolean z2) {
        this.f189878a = str;
        this.f189879b = str2;
        this.f189880c = i;
        this.f189881d = pllVar;
        this.f189882e = z;
        this.f189883f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qll)) {
            return false;
        }
        qll qllVar = (qll) obj;
        return wj50.m88271j(this.f189878a, qllVar.f189878a) && wj50.m88271j(this.f189879b, qllVar.f189879b) && this.f189880c == qllVar.f189880c && wj50.m88271j(this.f189881d, qllVar.f189881d) && this.f189882e == qllVar.f189882e && this.f189883f == qllVar.f189883f;
    }

    public final int hashCode() {
        int iHashCode = this.f189878a.hashCode() * 31;
        String str = this.f189879b;
        return Boolean.hashCode(this.f189883f) + s571.m77245d((this.f189881d.hashCode() + f710.m40938f(this.f189880c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31, this.f189882e);
    }
}
