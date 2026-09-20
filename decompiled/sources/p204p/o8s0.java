package p204p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class o8s0 implements ck81 {

    /* JADX INFO: renamed from: a */
    public final p0y0 f162861a;

    /* JADX INFO: renamed from: b */
    public final p0y0 f162862b;

    /* JADX INFO: renamed from: c */
    public final nlr f162863c = new nlr();

    /* JADX INFO: renamed from: d */
    public final AtomicReference f162864d = new AtomicReference(n8s0.f151616a);

    public o8s0(p0y0 p0y0Var) {
        this.f162861a = p0y0Var;
        this.f162862b = p0y0Var;
    }

    @Override // p204p.ck81
    /* JADX INFO: renamed from: a */
    public final void mo33087a(r300 r300Var) {
        this.f162861a.mo33087a(r300Var);
    }

    @Override // p204p.ck81
    /* JADX INFO: renamed from: b */
    public final void mo33088b(long j, int i, int i2, int i3, bk81 bk81Var) {
        m66432h().mo33088b(j, i, i2, i3, bk81Var);
        AtomicReference atomicReference = this.f162864d;
        if (atomicReference.get() == n8s0.f151617b) {
            this.f162862b.m68732A(false);
            atomicReference.set(n8s0.f151618c);
        }
    }

    @Override // p204p.ck81
    /* JADX INFO: renamed from: c */
    public final void mo33089c(l2n0 l2n0Var, int i, int i2) {
        m66432h().mo33089c(l2n0Var, i, i2);
    }

    @Override // p204p.ck81
    /* JADX INFO: renamed from: d */
    public final int mo33090d(fho fhoVar, int i, boolean z) {
        return m66432h().mo33090d(fhoVar, i, z);
    }

    @Override // p204p.ck81
    /* JADX INFO: renamed from: e */
    public final int mo33091e(fho fhoVar, int i, boolean z) {
        return m66432h().mo33091e(fhoVar, i, z);
    }

    @Override // p204p.ck81
    /* JADX INFO: renamed from: f */
    public final void mo33092f(int i, l2n0 l2n0Var) {
        m66432h().mo33092f(i, l2n0Var);
    }

    /* JADX INFO: renamed from: h */
    public final ck81 m66432h() {
        return this.f162864d.get() == n8s0.f151618c ? this.f162863c : this.f162862b;
    }

    @Override // p204p.ck81
    /* JADX INFO: renamed from: g */
    public final void mo33093g(long j) {
    }
}
