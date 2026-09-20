package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class hgo implements dfo, kdd0 {

    /* JADX INFO: renamed from: a */
    public final dfo f91184a;

    /* JADX INFO: renamed from: b */
    public final gh00 f91185b;

    public hgo(dfo dfoVar, gh00 gh00Var) {
        this.f91184a = dfoVar;
        this.f91185b = gh00Var;
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return fem.m41473v(this.f91184a.mo24358a(), this.f91185b);
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: b */
    public final String mo29771b() {
        return this.f91184a.mo29771b();
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f91184a.mo24359c();
    }

    @Override // p204p.izd1
    /* JADX INFO: renamed from: e */
    public final pgo mo24649e() {
        return this.f91184a.mo24649e();
    }

    @Override // p204p.kdd0
    /* JADX INFO: renamed from: f */
    public final eld0 mo44700f() {
        eld0 eld0VarMo44700f;
        dfo dfoVar = this.f91184a;
        kdd0 kdd0Var = dfoVar instanceof kdd0 ? (kdd0) dfoVar : null;
        return (kdd0Var == null || (eld0VarMo44700f = kdd0Var.mo44700f()) == null) ? new qau() : new lzs0(eld0VarMo44700f, this.f91185b, 1);
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return fem.m41472u(this.f91184a.getBehavior(), this.f91185b);
    }

    @Override // p204p.izd1
    public final mko getData() {
        return new nko(this.f91184a.getData(), this.f91185b);
    }
}
