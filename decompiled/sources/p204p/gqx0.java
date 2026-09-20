package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gqx0 implements zqx0 {

    /* JADX INFO: renamed from: a */
    public final int f83572a;

    /* JADX INFO: renamed from: b */
    public final String f83573b;

    /* JADX INFO: renamed from: c */
    public final int f83574c;

    /* JADX INFO: renamed from: d */
    public final String f83575d;

    /* JADX INFO: renamed from: e */
    public final boolean f83576e;

    public gqx0(int i, boolean z, String str, int i2, String str2) {
        this.f83572a = i;
        this.f83573b = str;
        this.f83574c = i2;
        this.f83575d = str2;
        this.f83576e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqx0)) {
            return false;
        }
        gqx0 gqx0Var = (gqx0) obj;
        return this.f83572a == gqx0Var.f83572a && wj50.m88271j(this.f83573b, gqx0Var.f83573b) && this.f83574c == gqx0Var.f83574c && wj50.m88271j(this.f83575d, gqx0Var.f83575d) && this.f83576e == gqx0Var.f83576e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f83576e) + s571.m77243b(mt60.m62800g(this.f83574c, s571.m77243b(Integer.hashCode(this.f83572a) * 31, 31, this.f83573b), 31), 31, this.f83575d);
    }

    @Override // p204p.zqx0
    /* JADX INFO: renamed from: s */
    public final int mo30282s() {
        return this.f83572a;
    }
}
