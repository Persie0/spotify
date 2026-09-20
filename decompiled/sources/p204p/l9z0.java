package p204p;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes7.dex */
public final class l9z0 extends jjv0 {

    /* JADX INFO: renamed from: a */
    public final djv0 f131195a;

    /* JADX INFO: renamed from: b */
    public int f131196b;

    /* JADX INFO: renamed from: c */
    public int f131197c;

    /* JADX INFO: renamed from: d */
    public int f131198d;

    /* JADX INFO: renamed from: e */
    public boolean f131199e = true;

    /* JADX INFO: renamed from: f */
    public final SparseIntArray f131200f = new SparseIntArray();

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ o9z0 f131201g;

    public l9z0(o9z0 o9z0Var, djv0 djv0Var) {
        this.f131201g = o9z0Var;
        this.f131195a = djv0Var;
        djv0Var.mo47719v(this);
    }

    @Override // p204p.jjv0
    /* JADX INFO: renamed from: a */
    public final void mo29357a() {
        o9z0 o9z0Var = this.f131201g;
        o9z0Var.m66505D();
        o9z0Var.m47712h();
    }

    @Override // p204p.jjv0
    /* JADX INFO: renamed from: b */
    public final void mo29358b(int i, int i2) {
        this.f131201g.f92278a.m50840d(this.f131197c + i, i2, null);
    }

    @Override // p204p.jjv0
    /* JADX INFO: renamed from: c */
    public final void mo29359c(int i, int i2, Object obj) {
        this.f131201g.f92278a.m50840d(this.f131197c + i, i2, obj);
    }

    @Override // p204p.jjv0
    /* JADX INFO: renamed from: d */
    public final void mo29360d(int i, int i2) {
        int i3 = this.f131197c + i;
        o9z0 o9z0Var = this.f131201g;
        o9z0Var.m47715k(i3, i2);
        o9z0.m66502A(o9z0Var, this.f131196b + 1, i2);
    }

    @Override // p204p.jjv0
    /* JADX INFO: renamed from: e */
    public final void mo29361e(int i, int i2) {
        int i3 = this.f131197c;
        this.f131201g.m47714j(i + i3, i3 + i2);
    }

    @Override // p204p.jjv0
    /* JADX INFO: renamed from: f */
    public final void mo29362f(int i, int i2) {
        int i3 = this.f131197c + i;
        o9z0 o9z0Var = this.f131201g;
        o9z0Var.m47716l(i3, i2);
        o9z0.m66502A(o9z0Var, this.f131196b + 1, -i2);
    }
}
