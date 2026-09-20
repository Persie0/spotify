package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pda1 {

    /* JADX INFO: renamed from: a */
    public final String f176397a;

    /* JADX INFO: renamed from: b */
    public final String f176398b;

    /* JADX INFO: renamed from: c */
    public final ney0 f176399c;

    /* JADX INFO: renamed from: d */
    public final String f176400d;

    /* JADX INFO: renamed from: e */
    public final String f176401e;

    /* JADX INFO: renamed from: f */
    public final Boolean f176402f;

    /* JADX INFO: renamed from: g */
    public final g081 f176403g;

    /* JADX INFO: renamed from: h */
    public final String f176404h;

    public /* synthetic */ pda1(String str, String str2, ney0 ney0Var, Boolean bool) {
        this(str, str2, ney0Var, null, null, bool, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pda1)) {
            return false;
        }
        pda1 pda1Var = (pda1) obj;
        return wj50.m88271j(this.f176397a, pda1Var.f176397a) && wj50.m88271j(this.f176398b, pda1Var.f176398b) && wj50.m88271j(this.f176399c, pda1Var.f176399c) && wj50.m88271j(this.f176400d, pda1Var.f176400d) && wj50.m88271j(this.f176401e, pda1Var.f176401e) && wj50.m88271j(this.f176402f, pda1Var.f176402f) && wj50.m88271j(this.f176403g, pda1Var.f176403g) && wj50.m88271j(this.f176404h, pda1Var.f176404h);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f176397a.hashCode() * 31, 31, this.f176398b);
        ney0 ney0Var = this.f176399c;
        int iHashCode = (iM77243b + (ney0Var == null ? 0 : ney0Var.hashCode())) * 31;
        String str = this.f176400d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f176401e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f176402f;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        g081 g081Var = this.f176403g;
        int iHashCode5 = (iHashCode4 + (g081Var == null ? 0 : g081Var.f75311a.hashCode())) * 31;
        String str3 = this.f176404h;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public pda1(String str, String str2, ney0 ney0Var, String str3, String str4, Boolean bool, g081 g081Var, String str5) {
        this.f176397a = str;
        this.f176398b = str2;
        this.f176399c = ney0Var;
        this.f176400d = str3;
        this.f176401e = str4;
        this.f176402f = bool;
        this.f176403g = g081Var;
        this.f176404h = str5;
    }
}
