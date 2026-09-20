package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class nfi0 implements z5m0 {

    /* JADX INFO: renamed from: a */
    public final zjq f153383a;

    /* JADX INFO: renamed from: b */
    public final mfi0 f153384b = new mfi0(this);

    public nfi0(xio xioVar) {
        this.f153383a = new zjq(xioVar);
    }

    @Override // p204p.z5m0
    /* JADX INFO: renamed from: a */
    public final Object mo48941a(Class cls) {
        if (cls.equals(pgo.class)) {
            return this.f153383a;
        }
        if (cls.equals(mfi0.class)) {
            return this.f153384b;
        }
        return null;
    }

    @Override // p204p.z5m0
    /* JADX INFO: renamed from: b */
    public final void mo64343b(pfm0 pfm0Var) {
        this.f153383a.m96240i(pfm0Var);
    }

    @Override // p204p.z5m0
    public final void dispose() {
        this.f153383a.m96238g();
    }
}
