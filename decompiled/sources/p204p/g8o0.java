package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class g8o0 {

    /* JADX INFO: renamed from: a */
    public final String f77563a;

    /* JADX INFO: renamed from: b */
    public final String f77564b;

    /* JADX INFO: renamed from: c */
    public final String f77565c;

    /* JADX INFO: renamed from: d */
    public final String f77566d;

    /* JADX INFO: renamed from: e */
    public final String f77567e;

    /* JADX INFO: renamed from: f */
    public final String f77568f;

    public g8o0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f77563a = str;
        this.f77564b = str2;
        this.f77565c = str3;
        this.f77566d = str4;
        this.f77567e = str5;
        this.f77568f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8o0)) {
            return false;
        }
        g8o0 g8o0Var = (g8o0) obj;
        return wj50.m88271j(this.f77563a, g8o0Var.f77563a) && wj50.m88271j(this.f77564b, g8o0Var.f77564b) && wj50.m88271j(this.f77565c, g8o0Var.f77565c) && wj50.m88271j(this.f77566d, g8o0Var.f77566d) && wj50.m88271j(this.f77567e, g8o0Var.f77567e) && wj50.m88271j(this.f77568f, g8o0Var.f77568f);
    }

    public final int hashCode() {
        return this.f77568f.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f77563a.hashCode() * 31, 31, this.f77564b), 31, this.f77565c), 31, this.f77566d), 31, this.f77567e);
    }
}
