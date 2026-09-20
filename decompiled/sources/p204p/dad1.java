package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class dad1 {

    /* JADX INFO: renamed from: a */
    public final String f47023a;

    /* JADX INFO: renamed from: b */
    public final String f47024b;

    /* JADX INFO: renamed from: c */
    public final String f47025c;

    /* JADX INFO: renamed from: d */
    public final String f47026d;

    /* JADX INFO: renamed from: e */
    public final String f47027e;

    /* JADX INFO: renamed from: f */
    public final c340 f47028f;

    /* JADX INFO: renamed from: g */
    public final ztb1 f47029g;

    /* JADX INFO: renamed from: h */
    public final String f47030h;

    /* JADX INFO: renamed from: i */
    public final String f47031i;

    /* JADX INFO: renamed from: j */
    public final c340 f47032j;

    /* JADX INFO: renamed from: k */
    public final String f47033k;

    /* JADX INFO: renamed from: l */
    public final Float f47034l;

    public dad1(String str, String str2, String str3, String str4, String str5, c340 c340Var, ztb1 ztb1Var, String str6, String str7, c340 c340Var2, String str8, Float f) {
        this.f47023a = str;
        this.f47024b = str2;
        this.f47025c = str3;
        this.f47026d = str4;
        this.f47027e = str5;
        this.f47028f = c340Var;
        this.f47029g = ztb1Var;
        this.f47030h = str6;
        this.f47031i = str7;
        this.f47032j = c340Var2;
        this.f47033k = str8;
        this.f47034l = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dad1)) {
            return false;
        }
        dad1 dad1Var = (dad1) obj;
        return wj50.m88271j(this.f47023a, dad1Var.f47023a) && wj50.m88271j(this.f47024b, dad1Var.f47024b) && wj50.m88271j(this.f47025c, dad1Var.f47025c) && wj50.m88271j(this.f47026d, dad1Var.f47026d) && wj50.m88271j(this.f47027e, dad1Var.f47027e) && wj50.m88271j(this.f47028f, dad1Var.f47028f) && wj50.m88271j(this.f47029g, dad1Var.f47029g) && wj50.m88271j(this.f47030h, dad1Var.f47030h) && wj50.m88271j(this.f47031i, dad1Var.f47031i) && wj50.m88271j(this.f47032j, dad1Var.f47032j) && wj50.m88271j(this.f47033k, dad1Var.f47033k) && wj50.m88271j(this.f47034l, dad1Var.f47034l);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b((this.f47032j.hashCode() + s571.m77243b(s571.m77243b((this.f47029g.hashCode() + ((this.f47028f.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f47023a.hashCode() * 31, 31, this.f47024b), 31, this.f47025c), 31, this.f47026d), 31, this.f47027e)) * 31)) * 31, 31, this.f47030h), 31, this.f47031i)) * 31, 31, this.f47033k);
        Float f = this.f47034l;
        return iM77243b + (f == null ? 0 : f.hashCode());
    }
}
