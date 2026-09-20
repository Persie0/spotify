package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fle0 {

    /* JADX INFO: renamed from: a */
    public final String f70755a;

    /* JADX INFO: renamed from: b */
    public final String f70756b;

    /* JADX INFO: renamed from: c */
    public final String f70757c;

    /* JADX INFO: renamed from: d */
    public final String f70758d;

    /* JADX INFO: renamed from: e */
    public final String f70759e;

    /* JADX INFO: renamed from: f */
    public final String f70760f;

    /* JADX INFO: renamed from: g */
    public final rcm0 f70761g;

    /* JADX INFO: renamed from: h */
    public final boolean f70762h;

    public fle0(String str, String str2, String str3, String str4, String str5, String str6, rcm0 rcm0Var, boolean z) {
        this.f70755a = str;
        this.f70756b = str2;
        this.f70757c = str3;
        this.f70758d = str4;
        this.f70759e = str5;
        this.f70760f = str6;
        this.f70761g = rcm0Var;
        this.f70762h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fle0)) {
            return false;
        }
        fle0 fle0Var = (fle0) obj;
        return wj50.m88271j(this.f70755a, fle0Var.f70755a) && wj50.m88271j(this.f70756b, fle0Var.f70756b) && wj50.m88271j(this.f70757c, fle0Var.f70757c) && wj50.m88271j(this.f70758d, fle0Var.f70758d) && wj50.m88271j(this.f70759e, fle0Var.f70759e) && wj50.m88271j(this.f70760f, fle0Var.f70760f) && wj50.m88271j(this.f70761g, fle0Var.f70761g) && this.f70762h == fle0Var.f70762h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f70762h) + yds.m93483m(this.f70761g, s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f70755a.hashCode() * 31, 31, this.f70756b), 31, this.f70757c), 31, this.f70758d), 31, this.f70759e), 31, this.f70760f), 31);
    }
}
