package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mct {

    /* JADX INFO: renamed from: a */
    public final String f142242a;

    /* JADX INFO: renamed from: b */
    public final String f142243b;

    /* JADX INFO: renamed from: c */
    public final String f142244c;

    /* JADX INFO: renamed from: d */
    public final String f142245d;

    /* JADX INFO: renamed from: e */
    public final gh00 f142246e;

    public mct(String str, String str2, String str3, String str4, gh00 gh00Var) {
        this.f142242a = str;
        this.f142243b = str2;
        this.f142244c = str3;
        this.f142245d = str4;
        this.f142246e = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mct)) {
            return false;
        }
        mct mctVar = (mct) obj;
        return wj50.m88271j(this.f142242a, mctVar.f142242a) && wj50.m88271j(this.f142243b, mctVar.f142243b) && wj50.m88271j(this.f142244c, mctVar.f142244c) && wj50.m88271j(this.f142245d, mctVar.f142245d) && wj50.m88271j(this.f142246e, mctVar.f142246e);
    }

    public final int hashCode() {
        int iHashCode = this.f142242a.hashCode() * 31;
        String str = this.f142243b;
        return this.f142246e.hashCode() + s571.m77243b(s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f142244c), 31, this.f142245d);
    }
}
