package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class l9m extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f131147a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ u9m f131148b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l9m(u9m u9mVar, int i) {
        super(1);
        this.f131147a = i;
        this.f131148b = u9mVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f131147a) {
            case 0:
                fdx0 fdx0Var = (fdx0) obj;
                u9m u9mVar = this.f131148b;
                fdx0Var.m41397w(u9mVar.f228225a.m84031v());
                fdx0Var.m41380b(((Boolean) u9mVar.f228231g.getValue()).booleanValue() ? 1.0f : 0.0f);
                break;
            case 1:
                int i = (int) (((g450) obj).f76347a & 4294967295L);
                u9m u9mVar2 = this.f131148b;
                int iM82647d = u9mVar2.m82647d();
                yum0 yum0Var = u9mVar2.f228231g;
                if (i != iM82647d) {
                    u9mVar2.f228227c.setValue(Integer.valueOf(i));
                    if (i > 0) {
                        yum0Var.setValue(Boolean.TRUE);
                    }
                    if (!((Boolean) u9mVar2.f228226b.getValue()).booleanValue()) {
                        xf11 xf11VarM82646c = u9mVar2.m82646c();
                        u9mVar2.m82648f(xf11VarM82646c);
                        u9mVar2.f228225a.m84032w(u9mVar2.m82650h(xf11VarM82646c));
                        if (u9mVar2.m82647d() > 0) {
                            yum0Var.setValue(Boolean.TRUE);
                        }
                    }
                }
                break;
            default:
                this.f131148b.m82645b(((Number) obj).floatValue());
                break;
        }
        return w2a1.f247311a;
    }
}
