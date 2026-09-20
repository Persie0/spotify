package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lzs0 implements eld0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f138425a;

    /* JADX INFO: renamed from: b */
    public final eld0 f138426b;

    /* JADX INFO: renamed from: c */
    public final gh00 f138427c;

    public /* synthetic */ lzs0(eld0 eld0Var, gh00 gh00Var, int i) {
        this.f138425a = i;
        this.f138426b = eld0Var;
        this.f138427c = gh00Var;
    }

    @Override // p204p.eld0
    /* JADX INFO: renamed from: a */
    public final mko mo39360a() {
        switch (this.f138425a) {
            case 0:
                mko mkoVarMo39360a = this.f138426b.mo39360a();
                if (mkoVarMo39360a != null) {
                    return new oko(mkoVarMo39360a, this.f138427c);
                }
                return null;
            default:
                mko mkoVarMo39360a2 = this.f138426b.mo39360a();
                if (mkoVarMo39360a2 != null) {
                    return new nko(mkoVarMo39360a2, this.f138427c);
                }
                return null;
        }
    }

    @Override // p204p.eld0
    /* JADX INFO: renamed from: b */
    public final ewt mo39361b(Object obj, Object obj2) {
        switch (this.f138425a) {
            case 0:
                return this.f138426b.mo39361b(this.f138427c.invoke(obj), obj2);
            default:
                return this.f138426b.mo39361b(this.f138427c.invoke(obj), obj2);
        }
    }
}
