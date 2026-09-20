package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class h6t {

    /* JADX INFO: renamed from: a */
    public final String f88243a;

    /* JADX INFO: renamed from: b */
    public final String f88244b;

    /* JADX INFO: renamed from: c */
    public final String f88245c;

    /* JADX INFO: renamed from: d */
    public final vc41 f88246d;

    /* JADX INFO: renamed from: e */
    public final String f88247e;

    public h6t(String str, String str2, String str3, vc41 vc41Var, String str4) {
        this.f88243a = str;
        this.f88244b = str2;
        this.f88245c = str3;
        this.f88246d = vc41Var;
        this.f88247e = str4;
    }

    /* JADX INFO: renamed from: a */
    public static h6t m46746a(h6t h6tVar, String str) {
        String str2 = h6tVar.f88243a;
        String str3 = h6tVar.f88245c;
        vc41 vc41Var = h6tVar.f88246d;
        String str4 = h6tVar.f88247e;
        h6tVar.getClass();
        return new h6t(str2, str, str3, vc41Var, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6t)) {
            return false;
        }
        h6t h6tVar = (h6t) obj;
        return wj50.m88271j(this.f88243a, h6tVar.f88243a) && wj50.m88271j(this.f88244b, h6tVar.f88244b) && wj50.m88271j(this.f88245c, h6tVar.f88245c) && this.f88246d == h6tVar.f88246d && wj50.m88271j(this.f88247e, h6tVar.f88247e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f88243a.hashCode() * 31, 31, this.f88244b);
        String str = this.f88245c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        vc41 vc41Var = this.f88246d;
        int iHashCode2 = (iHashCode + (vc41Var == null ? 0 : vc41Var.hashCode())) * 31;
        String str2 = this.f88247e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public /* synthetic */ h6t(String str, String str2, vc41 vc41Var, String str3, int i) {
        this(str, "", (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : vc41Var, (i & 16) != 0 ? null : str3);
    }
}
