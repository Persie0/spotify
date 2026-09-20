package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class h1s0 extends m1s0 {

    /* JADX INFO: renamed from: a */
    public final String f86690a;

    /* JADX INFO: renamed from: b */
    public final int f86691b;

    /* JADX INFO: renamed from: c */
    public final String f86692c;

    /* JADX INFO: renamed from: d */
    public final String f86693d;

    /* JADX INFO: renamed from: e */
    public final String f86694e;

    /* JADX INFO: renamed from: f */
    public final boolean f86695f;

    public h1s0(String str, int i, String str2, String str3, boolean z, String str4) {
        this.f86690a = str;
        this.f86691b = i;
        this.f86692c = str2;
        this.f86693d = str3;
        this.f86694e = str4;
        this.f86695f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1s0)) {
            return false;
        }
        h1s0 h1s0Var = (h1s0) obj;
        return wj50.m88271j(this.f86690a, h1s0Var.f86690a) && this.f86691b == h1s0Var.f86691b && wj50.m88271j(this.f86692c, h1s0Var.f86692c) && wj50.m88271j(this.f86693d, h1s0Var.f86693d) && wj50.m88271j(this.f86694e, h1s0Var.f86694e) && this.f86695f == h1s0Var.f86695f;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(mt60.m62800g(this.f86691b, this.f86690a.hashCode() * 31, 31), 31, this.f86692c), 31, this.f86693d);
        String str = this.f86694e;
        return Boolean.hashCode(this.f86695f) + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
