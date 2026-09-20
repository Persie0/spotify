package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bqv0 {

    /* JADX INFO: renamed from: a */
    public final String f29889a;

    /* JADX INFO: renamed from: b */
    public final String f29890b;

    /* JADX INFO: renamed from: c */
    public final String f29891c;

    /* JADX INFO: renamed from: d */
    public final String f29892d;

    /* JADX INFO: renamed from: e */
    public final String f29893e;

    /* JADX INFO: renamed from: f */
    public final String f29894f;

    /* JADX INFO: renamed from: g */
    public final String f29895g;

    public bqv0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f29889a = str;
        this.f29890b = str2;
        this.f29891c = str3;
        this.f29892d = str4;
        this.f29893e = str5;
        this.f29894f = str6;
        this.f29895g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqv0)) {
            return false;
        }
        bqv0 bqv0Var = (bqv0) obj;
        return wj50.m88271j(this.f29889a, bqv0Var.f29889a) && wj50.m88271j(this.f29890b, bqv0Var.f29890b) && wj50.m88271j(this.f29891c, bqv0Var.f29891c) && wj50.m88271j(this.f29892d, bqv0Var.f29892d) && wj50.m88271j(this.f29893e, bqv0Var.f29893e) && wj50.m88271j(this.f29894f, bqv0Var.f29894f) && wj50.m88271j(this.f29895g, bqv0Var.f29895g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f29889a.hashCode() * 31, 31, this.f29890b);
        String str = this.f29891c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f29892d;
        return this.f29895g.hashCode() + s571.m77243b(s571.m77243b((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f29893e), 31, this.f29894f);
    }
}
