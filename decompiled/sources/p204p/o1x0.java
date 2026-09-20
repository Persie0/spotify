package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class o1x0 {

    /* JADX INFO: renamed from: a */
    public final h1x0 f160874a;

    /* JADX INFO: renamed from: b */
    public final h1x0 f160875b;

    /* JADX INFO: renamed from: c */
    public final String f160876c;

    /* JADX INFO: renamed from: d */
    public final h1x0 f160877d;

    /* JADX INFO: renamed from: e */
    public final boolean f160878e;

    /* JADX INFO: renamed from: f */
    public final String f160879f;

    /* JADX INFO: renamed from: g */
    public final o1x0 f160880g;

    public /* synthetic */ o1x0(h1x0 h1x0Var, h1x0 h1x0Var2, String str, h7a h7aVar, int i) {
        this(h1x0Var, h1x0Var2, str, (i & 8) != 0 ? null : h7aVar, (i & 16) == 0, null, null);
    }

    /* JADX INFO: renamed from: a */
    public static o1x0 m66086a(o1x0 o1x0Var, String str, String str2, o1x0 o1x0Var2) {
        h1x0 h1x0Var = o1x0Var.f160874a;
        h1x0 h1x0Var2 = o1x0Var.f160875b;
        h1x0 h1x0Var3 = o1x0Var.f160877d;
        boolean z = o1x0Var.f160878e;
        o1x0Var.getClass();
        return new o1x0(h1x0Var, h1x0Var2, str, h1x0Var3, z, str2, o1x0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1x0)) {
            return false;
        }
        o1x0 o1x0Var = (o1x0) obj;
        return wj50.m88271j(this.f160874a, o1x0Var.f160874a) && wj50.m88271j(this.f160875b, o1x0Var.f160875b) && wj50.m88271j(this.f160876c, o1x0Var.f160876c) && wj50.m88271j(this.f160877d, o1x0Var.f160877d) && this.f160878e == o1x0Var.f160878e && wj50.m88271j(this.f160879f, o1x0Var.f160879f) && wj50.m88271j(this.f160880g, o1x0Var.f160880g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b((this.f160875b.hashCode() + (this.f160874a.hashCode() * 31)) * 31, 31, this.f160876c);
        h1x0 h1x0Var = this.f160877d;
        int iM77245d = s571.m77245d((iM77243b + (h1x0Var == null ? 0 : h1x0Var.hashCode())) * 31, 31, this.f160878e);
        String str = this.f160879f;
        int iHashCode = (iM77245d + (str == null ? 0 : str.hashCode())) * 31;
        o1x0 o1x0Var = this.f160880g;
        return iHashCode + (o1x0Var != null ? o1x0Var.hashCode() : 0);
    }

    public o1x0(h1x0 h1x0Var, h1x0 h1x0Var2, String str, h1x0 h1x0Var3, boolean z, String str2, o1x0 o1x0Var) {
        this.f160874a = h1x0Var;
        this.f160875b = h1x0Var2;
        this.f160876c = str;
        this.f160877d = h1x0Var3;
        this.f160878e = z;
        this.f160879f = str2;
        this.f160880g = o1x0Var;
    }
}
