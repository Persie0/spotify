package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hke0 implements xjx {

    /* JADX INFO: renamed from: a */
    public final xjx f92427a;

    /* JADX INFO: renamed from: b */
    public final kf81 f92428b;

    public hke0(xjx xjxVar, kf81 kf81Var) {
        this.f92427a = xjxVar;
        this.f92428b = kf81Var;
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: a */
    public final boolean mo34611a(int i, long j) {
        return this.f92427a.mo34611a(i, j);
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: b */
    public final boolean mo32619b(long j, mce mceVar, List list) {
        return this.f92427a.mo32619b(j, mceVar, list);
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: c */
    public final int mo28306c() {
        return this.f92427a.mo28306c();
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: d */
    public final void mo34612d() {
        this.f92427a.mo34612d();
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: e */
    public final r300 mo34613e(int i) {
        return this.f92428b.f122102d[this.f92427a.mo34614f(i)];
    }

    public final boolean equals(Object obj) {
        if (m47782u(obj) && (obj instanceof hke0)) {
            return this.f92428b.equals(((hke0) obj).f92428b);
        }
        return false;
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: f */
    public final int mo34614f(int i) {
        return this.f92427a.mo34614f(i);
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: g */
    public final void mo32620g() {
        this.f92427a.mo32620g();
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: h */
    public final boolean mo34615h(int i, long j) {
        return this.f92427a.mo34615h(i, j);
    }

    public final int hashCode() {
        return this.f92428b.hashCode() + (this.f92427a.hashCode() * 31);
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: i */
    public final void mo34616i(float f) {
        this.f92427a.mo34616i(f);
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: j */
    public final Object mo28307j() {
        return this.f92427a.mo28307j();
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: k */
    public final void mo47781k() {
        this.f92427a.mo47781k();
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: l */
    public final void mo28308l(long j, long j2, long j3, List list, nad0[] nad0VarArr) {
        this.f92427a.mo28308l(j, j2, j3, list, nad0VarArr);
    }

    @Override // p204p.xjx
    public final int length() {
        return this.f92427a.length();
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: m */
    public final int mo34617m(int i) {
        return this.f92427a.mo34617m(i);
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: n */
    public final kf81 mo34618n() {
        return this.f92428b;
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: o */
    public final void mo34619o(boolean z) {
        this.f92427a.mo34619o(z);
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: p */
    public final void mo32621p() {
        this.f92427a.mo32621p();
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: q */
    public final int mo32622q(long j, List list) {
        return this.f92427a.mo32622q(j, list);
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: r */
    public final int mo34620r() {
        return this.f92427a.mo34620r();
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: s */
    public final r300 mo34621s() {
        return this.f92428b.f122102d[this.f92427a.mo34620r()];
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: t */
    public final int mo28309t() {
        return this.f92427a.mo28309t();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m47782u(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hke0) {
            return this.f92427a.equals(((hke0) obj).f92427a);
        }
        return false;
    }

    @Override // p204p.xjx
    /* JADX INFO: renamed from: v */
    public final void mo47783v() {
        this.f92427a.mo47783v();
    }
}
