package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class uia1 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f230650a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f230651b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uia1(int i, fbk fbkVar, kqi0 kqi0Var) {
        super(2, fbkVar);
        this.f230650a = i;
        this.f230651b = kqi0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f230650a) {
            case 0:
                return new uia1(0, fbkVar, this.f230651b);
            default:
                return new uia1(1, fbkVar, this.f230651b);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f230650a) {
            case 0:
                uia1 uia1Var = (uia1) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                uia1Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                uia1 uia1Var2 = (uia1) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                uia1Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f230650a) {
            case 0:
                bga.m29073P(obj);
                this.f230651b.setValue(Boolean.TRUE);
                break;
            default:
                bga.m29073P(obj);
                tf60 tf60Var = (tf60) this.f230651b.getValue();
                if (tf60Var != null) {
                    tf60Var.mo26601e(null);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
