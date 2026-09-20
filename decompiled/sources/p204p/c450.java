package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class c450 {

    /* JADX INFO: renamed from: e */
    public static final c450 f33847e = new c450(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f33848a;

    /* JADX INFO: renamed from: b */
    public final int f33849b;

    /* JADX INFO: renamed from: c */
    public final int f33850c;

    /* JADX INFO: renamed from: d */
    public final int f33851d;

    public c450(int i, int i2, int i3, int i4) {
        this.f33848a = i;
        this.f33849b = i2;
        this.f33850c = i3;
        this.f33851d = i4;
    }

    /* JADX INFO: renamed from: a */
    public final long m31423a() {
        int iM31426d = (m31426d() / 2) + this.f33848a;
        return (((long) ((m31424b() / 2) + this.f33849b)) & 4294967295L) | (((long) iM31426d) << 32);
    }

    /* JADX INFO: renamed from: b */
    public final int m31424b() {
        return this.f33851d - this.f33849b;
    }

    /* JADX INFO: renamed from: c */
    public final long m31425c() {
        return (((long) this.f33848a) << 32) | (((long) this.f33849b) & 4294967295L);
    }

    /* JADX INFO: renamed from: d */
    public final int m31426d() {
        return this.f33850c - this.f33848a;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m31427e() {
        return this.f33848a >= this.f33850c || this.f33849b >= this.f33851d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c450)) {
            return false;
        }
        c450 c450Var = (c450) obj;
        return this.f33848a == c450Var.f33848a && this.f33849b == c450Var.f33849b && this.f33850c == c450Var.f33850c && this.f33851d == c450Var.f33851d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33851d) + mt60.m62800g(this.f33850c, mt60.m62800g(this.f33849b, Integer.hashCode(this.f33848a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f33848a);
        sb.append(", ");
        sb.append(this.f33849b);
        sb.append(", ");
        sb.append(this.f33850c);
        sb.append(", ");
        return edb.m38567p(sb, this.f33851d, ')');
    }
}
