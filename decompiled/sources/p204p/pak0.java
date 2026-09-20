package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pak0 {

    /* JADX INFO: renamed from: a */
    public final bap0 f175549a;

    /* JADX INFO: renamed from: b */
    public final eyj f175550b;

    /* JADX INFO: renamed from: c */
    public final dwi f175551c;

    /* JADX INFO: renamed from: d */
    public final boolean f175552d;

    /* JADX INFO: renamed from: e */
    public final boolean f175553e;

    /* JADX INFO: renamed from: f */
    public final boolean f175554f;

    public pak0(bap0 bap0Var, eyj eyjVar, dwi dwiVar, boolean z, boolean z2, boolean z3) {
        this.f175549a = bap0Var;
        this.f175550b = eyjVar;
        this.f175551c = dwiVar;
        this.f175552d = z;
        this.f175553e = z2;
        this.f175554f = z3;
    }

    /* JADX INFO: renamed from: a */
    public static pak0 m69492a(pak0 pak0Var, bap0 bap0Var, eyj eyjVar, dwi dwiVar, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            bap0Var = pak0Var.f175549a;
        }
        bap0 bap0Var2 = bap0Var;
        if ((i & 2) != 0) {
            eyjVar = pak0Var.f175550b;
        }
        eyj eyjVar2 = eyjVar;
        if ((i & 4) != 0) {
            dwiVar = pak0Var.f175551c;
        }
        dwi dwiVar2 = dwiVar;
        if ((i & 8) != 0) {
            z = pak0Var.f175552d;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z2 = pak0Var.f175553e;
        }
        boolean z5 = z2;
        if ((i & 32) != 0) {
            z3 = pak0Var.f175554f;
        }
        pak0Var.getClass();
        return new pak0(bap0Var2, eyjVar2, dwiVar2, z4, z5, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pak0)) {
            return false;
        }
        pak0 pak0Var = (pak0) obj;
        return wj50.m88271j(this.f175549a, pak0Var.f175549a) && wj50.m88271j(this.f175550b, pak0Var.f175550b) && wj50.m88271j(this.f175551c, pak0Var.f175551c) && this.f175552d == pak0Var.f175552d && this.f175553e == pak0Var.f175553e && this.f175554f == pak0Var.f175554f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f175554f) + s571.m77245d(s571.m77245d((this.f175551c.hashCode() + ((this.f175550b.hashCode() + (this.f175549a.hashCode() * 31)) * 31)) * 31, 31, this.f175552d), 31, this.f175553e);
    }
}
