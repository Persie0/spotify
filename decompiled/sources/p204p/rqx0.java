package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rqx0 implements zqx0 {

    /* JADX INFO: renamed from: a */
    public final int f201903a;

    /* JADX INFO: renamed from: b */
    public final int f201904b;

    /* JADX INFO: renamed from: c */
    public final String f201905c;

    /* JADX INFO: renamed from: d */
    public final f271 f201906d;

    /* JADX INFO: renamed from: e */
    public final boolean f201907e;

    public rqx0(int i, int i2, String str, f271 f271Var, boolean z) {
        this.f201903a = i;
        this.f201904b = i2;
        this.f201905c = str;
        this.f201906d = f271Var;
        this.f201907e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rqx0)) {
            return false;
        }
        rqx0 rqx0Var = (rqx0) obj;
        return this.f201903a == rqx0Var.f201903a && this.f201904b == rqx0Var.f201904b && wj50.m88271j(this.f201905c, rqx0Var.f201905c) && wj50.m88271j(this.f201906d, rqx0Var.f201906d) && this.f201907e == rqx0Var.f201907e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f201907e) + ((this.f201906d.hashCode() + s571.m77243b(mt60.m62800g(this.f201904b, Integer.hashCode(this.f201903a) * 31, 31), 31, this.f201905c)) * 31);
    }

    @Override // p204p.zqx0
    /* JADX INFO: renamed from: s */
    public final int mo30282s() {
        return this.f201903a;
    }
}
