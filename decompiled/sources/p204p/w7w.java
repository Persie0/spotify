package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class w7w {

    /* JADX INFO: renamed from: a */
    public final String f248799a;

    /* JADX INFO: renamed from: b */
    public final int f248800b;

    /* JADX INFO: renamed from: c */
    public final int f248801c;

    /* JADX INFO: renamed from: d */
    public final int f248802d;

    /* JADX INFO: renamed from: e */
    public final boolean f248803e;

    /* JADX INFO: renamed from: f */
    public final boolean f248804f;

    /* JADX INFO: renamed from: g */
    public final boolean f248805g;

    /* JADX INFO: renamed from: h */
    public final boolean f248806h;

    /* JADX INFO: renamed from: i */
    public final y6s0 f248807i;

    public /* synthetic */ w7w(String str, int i, int i2, int i3, boolean z, boolean z2) {
        this(str, i, i2, i3, z, z2, false, false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7w)) {
            return false;
        }
        w7w w7wVar = (w7w) obj;
        return wj50.m88271j(this.f248799a, w7wVar.f248799a) && this.f248800b == w7wVar.f248800b && this.f248801c == w7wVar.f248801c && this.f248802d == w7wVar.f248802d && this.f248803e == w7wVar.f248803e && this.f248804f == w7wVar.f248804f && this.f248805g == w7wVar.f248805g && this.f248806h == w7wVar.f248806h && wj50.m88271j(this.f248807i, w7wVar.f248807i);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(mt60.m62800g(this.f248802d, mt60.m62800g(this.f248801c, mt60.m62800g(this.f248800b, this.f248799a.hashCode() * 31, 31), 31), 31), 31, this.f248803e), 31, this.f248804f), 31, this.f248805g), 31, this.f248806h);
        y6s0 y6s0Var = this.f248807i;
        return iM77245d + (y6s0Var == null ? 0 : y6s0Var.hashCode());
    }

    public w7w(String str, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, y6s0 y6s0Var) {
        this.f248799a = str;
        this.f248800b = i;
        this.f248801c = i2;
        this.f248802d = i3;
        this.f248803e = z;
        this.f248804f = z2;
        this.f248805g = z3;
        this.f248806h = z4;
        this.f248807i = y6s0Var;
    }
}
