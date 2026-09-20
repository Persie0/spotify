package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class b4m0 implements pe10 {

    /* JADX INFO: renamed from: a */
    public final z3m0 f23388a;

    /* JADX INFO: renamed from: b */
    public final z3m0 f23389b;

    /* JADX INFO: renamed from: c */
    public final z3m0 f23390c;

    /* JADX INFO: renamed from: d */
    public final z3m0 f23391d;

    /* JADX INFO: renamed from: e */
    public final z3m0 f23392e;

    /* JADX INFO: renamed from: f */
    public final z3m0 f23393f;

    public b4m0(z3m0 z3m0Var, z3m0 z3m0Var2, z3m0 z3m0Var3, z3m0 z3m0Var4, z3m0 z3m0Var5, z3m0 z3m0Var6) {
        this.f23388a = z3m0Var;
        this.f23389b = z3m0Var2;
        this.f23390c = z3m0Var3;
        this.f23391d = z3m0Var4;
        this.f23392e = z3m0Var5;
        this.f23393f = z3m0Var6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4m0)) {
            return false;
        }
        b4m0 b4m0Var = (b4m0) obj;
        return wj50.m88271j(this.f23388a, b4m0Var.f23388a) && wj50.m88271j(this.f23389b, b4m0Var.f23389b) && wj50.m88271j(this.f23390c, b4m0Var.f23390c) && wj50.m88271j(this.f23391d, b4m0Var.f23391d) && wj50.m88271j(this.f23392e, b4m0Var.f23392e) && wj50.m88271j(this.f23393f, b4m0Var.f23393f);
    }

    public final int hashCode() {
        return this.f23393f.hashCode() + ((this.f23392e.hashCode() + ((this.f23391d.hashCode() + ((this.f23390c.hashCode() + ((this.f23389b.hashCode() + (this.f23388a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PaddingModifier(left=" + this.f23388a + ", start=" + this.f23389b + ", top=" + this.f23390c + ", right=" + this.f23391d + ", end=" + this.f23392e + ", bottom=" + this.f23393f + ')';
    }

    public /* synthetic */ b4m0(z3m0 z3m0Var, z3m0 z3m0Var2, z3m0 z3m0Var3, z3m0 z3m0Var4) {
        this(new z3m0(0.0f, 3), z3m0Var, z3m0Var2, new z3m0(0.0f, 3), z3m0Var3, z3m0Var4);
    }
}
