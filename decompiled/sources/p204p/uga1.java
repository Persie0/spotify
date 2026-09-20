package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class uga1 {

    /* JADX INFO: renamed from: a */
    public final String f230061a;

    /* JADX INFO: renamed from: b */
    public final String f230062b;

    /* JADX INFO: renamed from: c */
    public final String f230063c;

    /* JADX INFO: renamed from: d */
    public final String f230064d;

    /* JADX INFO: renamed from: e */
    public final String f230065e;

    /* JADX INFO: renamed from: f */
    public final String f230066f;

    /* JADX INFO: renamed from: g */
    public final String f230067g;

    public uga1(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f230061a = str;
        this.f230062b = str2;
        this.f230063c = str3;
        this.f230064d = str4;
        this.f230065e = str5;
        this.f230066f = str6;
        this.f230067g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uga1)) {
            return false;
        }
        uga1 uga1Var = (uga1) obj;
        return wj50.m88271j(this.f230061a, uga1Var.f230061a) && wj50.m88271j(this.f230062b, uga1Var.f230062b) && wj50.m88271j(this.f230063c, uga1Var.f230063c) && wj50.m88271j(this.f230064d, uga1Var.f230064d) && wj50.m88271j(this.f230065e, uga1Var.f230065e) && wj50.m88271j(this.f230066f, uga1Var.f230066f) && wj50.m88271j(this.f230067g, uga1Var.f230067g);
    }

    public final int hashCode() {
        return this.f230067g.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f230061a.hashCode() * 31, 31, this.f230062b), 31, this.f230063c), 31, this.f230064d), 31, this.f230065e), 31, this.f230066f);
    }
}
