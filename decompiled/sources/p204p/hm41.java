package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hm41 {

    /* JADX INFO: renamed from: a */
    public final String f92823a;

    /* JADX INFO: renamed from: b */
    public final String f92824b;

    /* JADX INFO: renamed from: c */
    public final String f92825c;

    /* JADX INFO: renamed from: d */
    public final String f92826d;

    /* JADX INFO: renamed from: e */
    public final int f92827e;

    public hm41(int i, String str, String str2, String str3, String str4) {
        this.f92823a = str;
        this.f92824b = str2;
        this.f92825c = str3;
        this.f92826d = str4;
        this.f92827e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm41)) {
            return false;
        }
        hm41 hm41Var = (hm41) obj;
        return wj50.m88271j(this.f92823a, hm41Var.f92823a) && wj50.m88271j(this.f92824b, hm41Var.f92824b) && this.f92825c.equals(hm41Var.f92825c) && wj50.m88271j(this.f92826d, hm41Var.f92826d) && this.f92827e == hm41Var.f92827e;
    }

    public final int hashCode() {
        return edb.m38547C(this.f92827e) + s571.m77243b(s571.m77243b(s571.m77243b(this.f92823a.hashCode() * 31, 31, this.f92824b), 31, this.f92825c), 31, this.f92826d);
    }
}
