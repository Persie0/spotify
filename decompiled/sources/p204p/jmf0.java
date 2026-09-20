package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jmf0 implements rmf0 {

    /* JADX INFO: renamed from: a */
    public final b791 f113850a;

    /* JADX INFO: renamed from: b */
    public final emf0 f113851b;

    /* JADX INFO: renamed from: c */
    public final b791 f113852c;

    /* JADX INFO: renamed from: d */
    public final b791 f113853d;

    /* JADX INFO: renamed from: e */
    public final b791 f113854e;

    /* JADX INFO: renamed from: f */
    public final double f113855f;

    /* JADX INFO: renamed from: g */
    public final imf0 f113856g;

    /* JADX INFO: renamed from: h */
    public final z650 f113857h;

    public jmf0(b791 b791Var, emf0 emf0Var, b791 b791Var2, b791 b791Var3, b791 b791Var4, double d, imf0 imf0Var, z650 z650Var) {
        this.f113850a = b791Var;
        this.f113851b = emf0Var;
        this.f113852c = b791Var2;
        this.f113853d = b791Var3;
        this.f113854e = b791Var4;
        this.f113855f = d;
        this.f113856g = imf0Var;
        this.f113857h = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmf0)) {
            return false;
        }
        jmf0 jmf0Var = (jmf0) obj;
        return wj50.m88271j(this.f113850a, jmf0Var.f113850a) && wj50.m88271j(this.f113851b, jmf0Var.f113851b) && wj50.m88271j(this.f113852c, jmf0Var.f113852c) && wj50.m88271j(this.f113853d, jmf0Var.f113853d) && wj50.m88271j(this.f113854e, jmf0Var.f113854e) && Double.compare(this.f113855f, jmf0Var.f113855f) == 0 && wj50.m88271j(this.f113856g, jmf0Var.f113856g) && wj50.m88271j(this.f113857h, jmf0Var.f113857h);
    }

    public final int hashCode() {
        b791 b791Var = this.f113850a;
        int iHashCode = (this.f113851b.hashCode() + ((b791Var == null ? 0 : b791Var.hashCode()) * 31)) * 31;
        b791 b791Var2 = this.f113852c;
        int iHashCode2 = (iHashCode + (b791Var2 == null ? 0 : b791Var2.hashCode())) * 31;
        b791 b791Var3 = this.f113853d;
        int iHashCode3 = (this.f113856g.hashCode() + xl81.m91399h(this.f113855f, (this.f113854e.hashCode() + ((iHashCode2 + (b791Var3 == null ? 0 : b791Var3.hashCode())) * 31)) * 31, 31)) * 31;
        z650 z650Var = this.f113857h;
        return iHashCode3 + (z650Var != null ? z650Var.f279709a.hashCode() : 0);
    }
}
