package p204p;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class fi41 implements oad0 {

    /* JADX INFO: renamed from: a */
    public final gh61 f69776a;

    /* JADX INFO: renamed from: b */
    public boolean f69777b;

    /* JADX INFO: renamed from: c */
    public long f69778c;

    /* JADX INFO: renamed from: d */
    public long f69779d;

    /* JADX INFO: renamed from: e */
    public h1p0 f69780e = h1p0.f86671d;

    public fi41(gh61 gh61Var) {
        this.f69776a = gh61Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m41692a(long j) {
        this.f69778c = j;
        if (this.f69777b) {
            this.f69776a.getClass();
            this.f69779d = SystemClock.elapsedRealtime();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m41693b() {
        if (this.f69777b) {
            return;
        }
        this.f69776a.getClass();
        this.f69779d = SystemClock.elapsedRealtime();
        this.f69777b = true;
    }

    @Override // p204p.oad0
    /* JADX INFO: renamed from: j */
    public final h1p0 mo41694j() {
        return this.f69780e;
    }

    @Override // p204p.oad0
    /* JADX INFO: renamed from: l */
    public final void mo41695l(h1p0 h1p0Var) {
        if (this.f69777b) {
            m41692a(mo41696q());
        }
        this.f69780e = h1p0Var;
    }

    @Override // p204p.oad0
    /* JADX INFO: renamed from: q */
    public final long mo41696q() {
        long j = this.f69778c;
        if (!this.f69777b) {
            return j;
        }
        this.f69776a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f69779d;
        h1p0 h1p0Var = this.f69780e;
        return (h1p0Var.f86674a == 1.0f ? h0b1.m46295W(jElapsedRealtime) : h1p0Var.m46463a(jElapsedRealtime)) + j;
    }
}
