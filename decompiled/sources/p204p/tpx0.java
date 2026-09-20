package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tpx0 implements zqx0 {

    /* JADX INFO: renamed from: a */
    public final int f222616a;

    /* JADX INFO: renamed from: b */
    public final String f222617b;

    /* JADX INFO: renamed from: c */
    public final int f222618c;

    /* JADX INFO: renamed from: d */
    public final f271 f222619d;

    /* JADX INFO: renamed from: e */
    public final boolean f222620e;

    public tpx0(int i, int i2, String str, f271 f271Var, boolean z) {
        this.f222616a = i;
        this.f222617b = str;
        this.f222618c = i2;
        this.f222619d = f271Var;
        this.f222620e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpx0)) {
            return false;
        }
        tpx0 tpx0Var = (tpx0) obj;
        return this.f222616a == tpx0Var.f222616a && wj50.m88271j(this.f222617b, tpx0Var.f222617b) && this.f222618c == tpx0Var.f222618c && wj50.m88271j(this.f222619d, tpx0Var.f222619d) && this.f222620e == tpx0Var.f222620e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f222620e) + ((this.f222619d.hashCode() + mt60.m62800g(this.f222618c, s571.m77243b(Integer.hashCode(this.f222616a) * 31, 31, this.f222617b), 31)) * 31);
    }

    @Override // p204p.zqx0
    /* JADX INFO: renamed from: s */
    public final int mo30282s() {
        return this.f222616a;
    }
}
