package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ef5 {

    /* JADX INFO: renamed from: a */
    public final String f58946a;

    /* JADX INFO: renamed from: b */
    public final String f58947b;

    /* JADX INFO: renamed from: c */
    public final String f58948c;

    /* JADX INFO: renamed from: d */
    public final int f58949d;

    /* JADX INFO: renamed from: e */
    public final String f58950e;

    /* JADX INFO: renamed from: f */
    public final boolean f58951f;

    public ef5(String str, int i, String str2, String str3, boolean z, String str4) {
        this.f58946a = str;
        this.f58947b = str2;
        this.f58948c = str3;
        this.f58949d = i;
        this.f58950e = str4;
        this.f58951f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef5)) {
            return false;
        }
        ef5 ef5Var = (ef5) obj;
        return wj50.m88271j(this.f58946a, ef5Var.f58946a) && wj50.m88271j(this.f58947b, ef5Var.f58947b) && wj50.m88271j(this.f58948c, ef5Var.f58948c) && this.f58949d == ef5Var.f58949d && wj50.m88271j(this.f58950e, ef5Var.f58950e) && this.f58951f == ef5Var.f58951f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58951f) + s571.m77243b(mt60.m62800g(this.f58949d, s571.m77243b(s571.m77243b(this.f58946a.hashCode() * 31, 31, this.f58947b), 31, this.f58948c), 31), 31, this.f58950e);
    }
}
