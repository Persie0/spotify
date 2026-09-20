package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class m7a0 extends xoi0 {

    /* JADX INFO: renamed from: L0 */
    public n7a0 f140750L0;

    /* JADX INFO: renamed from: Y */
    public final l5f1 f140751Y;

    /* JADX INFO: renamed from: Z */
    public hc80 f140752Z;

    public m7a0(l5f1 l5f1Var) {
        this.f140751Y = l5f1Var;
        if (l5f1Var.f129909a != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        l5f1Var.f129909a = this;
    }

    @Override // p204p.ck90
    /* JADX INFO: renamed from: h */
    public final void mo15625h() {
        l5f1 l5f1Var = this.f140751Y;
        l5f1Var.f129910b = true;
        l5f1Var.f129912d = false;
        l5f1Var.f129911c = false;
        l5f1Var.f129917i.drainPermits();
        l5f1Var.m58215a();
        l5f1Var.f129915g = new en6(l5f1Var);
        l5f1Var.m58216b();
    }

    @Override // p204p.ck90
    /* JADX INFO: renamed from: i */
    public final void mo15626i() {
        this.f140751Y.f129910b = false;
    }

    @Override // p204p.ck90
    /* JADX INFO: renamed from: k */
    public final void mo33102k(dqk0 dqk0Var) {
        super.mo33102k(dqk0Var);
        this.f140752Z = null;
        this.f140750L0 = null;
    }

    /* JADX INFO: renamed from: n */
    public final void m61059n() {
        l5f1 l5f1Var = this.f140751Y;
        l5f1Var.m58215a();
        l5f1Var.f129911c = true;
        n7a0 n7a0Var = this.f140750L0;
        if (n7a0Var != null) {
            mo33102k(n7a0Var);
        }
        m7a0 m7a0Var = l5f1Var.f129909a;
        if (m7a0Var == null) {
            throw new IllegalStateException("No listener register");
        }
        if (m7a0Var != this) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        l5f1Var.f129909a = null;
        if (n7a0Var != null) {
            boolean z = n7a0Var.f151122b;
        }
        l5f1Var.f129912d = true;
        l5f1Var.f129910b = false;
        l5f1Var.f129911c = false;
        l5f1Var.f129913e = false;
    }

    /* JADX INFO: renamed from: o */
    public final void m61060o() {
        hc80 hc80Var = this.f140752Z;
        n7a0 n7a0Var = this.f140750L0;
        if (hc80Var == null || n7a0Var == null) {
            return;
        }
        super.mo33102k(n7a0Var);
        m33099f(hc80Var, n7a0Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        kgg1.m56348k(this.f140751Y, sb);
        sb.append("}}");
        return sb.toString();
    }
}
