package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class b251 {

    /* JADX INFO: renamed from: a */
    public final int f22498a;

    /* JADX INFO: renamed from: b */
    public final int f22499b;

    /* JADX INFO: renamed from: c */
    public final String f22500c;

    /* JADX INFO: renamed from: d */
    public final int f22501d;

    /* JADX INFO: renamed from: e */
    public final int f22502e;

    public b251(int i, int i2, int i3, int i4, String str) {
        this.f22498a = i;
        this.f22499b = i2;
        this.f22500c = str;
        this.f22501d = i3;
        this.f22502e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b251)) {
            return false;
        }
        b251 b251Var = (b251) obj;
        return this.f22498a == b251Var.f22498a && this.f22499b == b251Var.f22499b && this.f22500c.equals(b251Var.f22500c) && this.f22501d == b251Var.f22501d && this.f22502e == b251Var.f22502e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22502e) + f710.m40938f(this.f22501d, s571.m77243b(mt60.m62800g(this.f22499b, Integer.hashCode(this.f22498a) * 31, 31), 31, this.f22500c), 31);
    }
}
