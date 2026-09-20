package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mxp0 extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f148130a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f148131b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f148132c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ dyp0 f148133d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mxp0(dyp0 dyp0Var, fbk fbkVar, int i) {
        super(3, fbkVar);
        this.f148130a = i;
        this.f148133d = dyp0Var;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        int i = this.f148130a;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        fbk fbkVar = (fbk) obj3;
        switch (i) {
            case 0:
                mxp0 mxp0Var = new mxp0(this.f148133d, fbkVar, 0);
                mxp0Var.f148131b = zBooleanValue;
                mxp0Var.f148132c = zBooleanValue2;
                return mxp0Var.invokeSuspend(w2a1.f247311a);
            default:
                mxp0 mxp0Var2 = new mxp0(this.f148133d, fbkVar, 1);
                mxp0Var2.f148131b = zBooleanValue;
                mxp0Var2.f148132c = zBooleanValue2;
                return mxp0Var2.invokeSuspend(w2a1.f247311a);
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f148130a) {
            case 0:
                boolean z = this.f148131b;
                boolean z2 = this.f148132c;
                bga.m29073P(obj);
                return new xwp0(this.f148133d.f54427a, z, z2);
            default:
                boolean z3 = this.f148131b;
                boolean z4 = this.f148132c;
                bga.m29073P(obj);
                return new xwp0(this.f148133d.f54427a, z3, z4);
        }
    }
}
