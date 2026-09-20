package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class eqm0 {

    /* JADX INFO: renamed from: a */
    public final String f61919a;

    /* JADX INFO: renamed from: b */
    public final String f61920b;

    /* JADX INFO: renamed from: c */
    public final String f61921c;

    /* JADX INFO: renamed from: d */
    public final String f61922d;

    /* JADX INFO: renamed from: e */
    public final String f61923e;

    /* JADX INFO: renamed from: f */
    public final String f61924f;

    /* JADX INFO: renamed from: g */
    public final boolean f61925g;

    public eqm0(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.f61919a = str;
        this.f61920b = str2;
        this.f61921c = str3;
        this.f61922d = str4;
        this.f61923e = str5;
        this.f61924f = str6;
        this.f61925g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqm0)) {
            return false;
        }
        eqm0 eqm0Var = (eqm0) obj;
        return wj50.m88271j(this.f61919a, eqm0Var.f61919a) && wj50.m88271j(this.f61920b, eqm0Var.f61920b) && wj50.m88271j(this.f61921c, eqm0Var.f61921c) && wj50.m88271j(this.f61922d, eqm0Var.f61922d) && wj50.m88271j(this.f61923e, eqm0Var.f61923e) && wj50.m88271j(this.f61924f, eqm0Var.f61924f) && this.f61925g == eqm0Var.f61925g;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f61919a.hashCode() * 31, 31, this.f61920b), 31, this.f61921c), 31, this.f61922d), 31, this.f61923e);
        String str = this.f61924f;
        return Boolean.hashCode(this.f61925g) + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
