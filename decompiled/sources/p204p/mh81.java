package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class mh81 {

    /* JADX INFO: renamed from: a */
    public final String f143725a;

    /* JADX INFO: renamed from: b */
    public final String f143726b;

    /* JADX INFO: renamed from: c */
    public final boolean f143727c;

    /* JADX INFO: renamed from: d */
    public final String f143728d;

    /* JADX INFO: renamed from: e */
    public final String f143729e;

    /* JADX INFO: renamed from: f */
    public final lh81 f143730f;

    /* JADX INFO: renamed from: g */
    public final String f143731g;

    /* JADX INFO: renamed from: h */
    public final String f143732h;

    /* JADX INFO: renamed from: i */
    public final String f143733i;

    /* JADX INFO: renamed from: j */
    public final boolean f143734j;

    public mh81(String str, String str2, boolean z, String str3, String str4, lh81 lh81Var, String str5, String str6, String str7, boolean z2) {
        this.f143725a = str;
        this.f143726b = str2;
        this.f143727c = z;
        this.f143728d = str3;
        this.f143729e = str4;
        this.f143730f = lh81Var;
        this.f143731g = str5;
        this.f143732h = str6;
        this.f143733i = str7;
        this.f143734j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh81)) {
            return false;
        }
        mh81 mh81Var = (mh81) obj;
        return wj50.m88271j(this.f143725a, mh81Var.f143725a) && wj50.m88271j(this.f143726b, mh81Var.f143726b) && this.f143727c == mh81Var.f143727c && wj50.m88271j(this.f143728d, mh81Var.f143728d) && wj50.m88271j(this.f143729e, mh81Var.f143729e) && wj50.m88271j(this.f143730f, mh81Var.f143730f) && wj50.m88271j(this.f143731g, mh81Var.f143731g) && wj50.m88271j(this.f143732h, mh81Var.f143732h) && wj50.m88271j(this.f143733i, mh81Var.f143733i) && this.f143734j == mh81Var.f143734j;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b((this.f143730f.hashCode() + s571.m77243b(s571.m77243b(s571.m77245d(s571.m77243b(this.f143725a.hashCode() * 31, 31, this.f143726b), 31, this.f143727c), 31, this.f143728d), 31, this.f143729e)) * 31, 31, this.f143731g);
        String str = this.f143732h;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f143733i;
        return Boolean.hashCode(this.f143734j) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
