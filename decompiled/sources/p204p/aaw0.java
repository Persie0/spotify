package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class aaw0 implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final dit0 f13944a;

    /* JADX INFO: renamed from: b */
    public final gaw0 f13945b;

    public aaw0(bji bjiVar, dit0 dit0Var) {
        this.f13944a = dit0Var;
        gaw0 gaw0Var = new gaw0(true, bjiVar);
        this.f13945b = gaw0Var;
        if (gaw0Var.m44183a()) {
            dit0Var.mo28403a();
        } else {
            dit0Var.cancel();
        }
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }

    @Override // p204p.hgm
    public final void shutdown() {
    }
}
