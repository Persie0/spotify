package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class e4v0 implements l630 {

    /* JADX INFO: renamed from: a */
    public final g4v0 f56179a;

    /* JADX INFO: renamed from: b */
    public final String f56180b;

    /* JADX INFO: renamed from: c */
    public final b250 f56181c;

    public e4v0(g4v0 g4v0Var, String str, b250 b250Var) {
        this.f56179a = g4v0Var;
        this.f56180b = str;
        this.f56181c = b250Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4v0)) {
            return false;
        }
        e4v0 e4v0Var = (e4v0) obj;
        return wj50.m88271j(this.f56179a, e4v0Var.f56179a) && wj50.m88271j(this.f56180b, e4v0Var.f56180b) && wj50.m88271j(this.f56181c, e4v0Var.f56181c);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f56180b;
    }

    public final int hashCode() {
        return this.f56181c.hashCode() + s571.m77243b(this.f56179a.hashCode() * 31, 31, this.f56180b);
    }
}
