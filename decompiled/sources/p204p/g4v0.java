package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class g4v0 {

    /* JADX INFO: renamed from: a */
    public final String f76535a;

    /* JADX INFO: renamed from: b */
    public final String f76536b;

    /* JADX INFO: renamed from: c */
    public final un20 f76537c;

    /* JADX INFO: renamed from: d */
    public final String f76538d;

    /* JADX INFO: renamed from: e */
    public final boolean f76539e;

    public g4v0(String str, String str2, un20 un20Var, String str3, boolean z) {
        this.f76535a = str;
        this.f76536b = str2;
        this.f76537c = un20Var;
        this.f76538d = str3;
        this.f76539e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4v0)) {
            return false;
        }
        g4v0 g4v0Var = (g4v0) obj;
        return wj50.m88271j(this.f76535a, g4v0Var.f76535a) && wj50.m88271j(this.f76536b, g4v0Var.f76536b) && wj50.m88271j(this.f76537c, g4v0Var.f76537c) && wj50.m88271j(this.f76538d, g4v0Var.f76538d) && this.f76539e == g4v0Var.f76539e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f76535a.hashCode() * 31, 31, this.f76536b);
        un20 un20Var = this.f76537c;
        return Boolean.hashCode(this.f76539e) + s571.m77243b((iM77243b + (un20Var == null ? 0 : un20Var.hashCode())) * 31, 31, this.f76538d);
    }
}
