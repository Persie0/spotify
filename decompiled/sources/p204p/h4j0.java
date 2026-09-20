package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class h4j0 implements yvb0 {

    /* JADX INFO: renamed from: a */
    public final int f87543a;

    /* JADX INFO: renamed from: b */
    public final int f87544b;

    /* JADX INFO: renamed from: c */
    public final float f87545c;

    public h4j0(int i, int i2, float f) {
        this.f87543a = i;
        this.f87544b = i2;
        this.f87545c = f;
    }

    @Override // p204p.yvb0
    /* JADX INFO: renamed from: a */
    public final yvb0 mo46657a(yvb0 yvb0Var, float f) {
        h4j0 h4j0Var = (h4j0) yvb0Var;
        return new h4j0(wj50.m88250J(this.f87543a, h4j0Var.f87543a, f), wj50.m88250J(this.f87544b, h4j0Var.f87544b, f), wj50.m88249I(this.f87545c, h4j0Var.f87545c, f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4j0)) {
            return false;
        }
        h4j0 h4j0Var = (h4j0) obj;
        return this.f87543a == h4j0Var.f87543a && this.f87544b == h4j0Var.f87544b && Float.compare(this.f87545c, h4j0Var.f87545c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f87545c) + mt60.m62800g(this.f87544b, Integer.hashCode(this.f87543a) * 31, 31);
    }
}
