package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mes extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f142833a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wds f142834b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mes(wds wdsVar, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f142833a = i;
        this.f142834b = wdsVar;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f142833a) {
            case 0:
                return new mes(this.f142834b, fbkVar, 0);
            case 1:
                return new mes(this.f142834b, fbkVar, 1);
            case 2:
                return new mes(this.f142834b, fbkVar, 2);
            default:
                return new mes(this.f142834b, fbkVar, 3);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f142833a) {
            case 0:
                mes mesVar = (mes) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                mesVar.invokeSuspend(w2a1Var);
                return w2a1Var;
            case 1:
                mes mesVar2 = (mes) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                mesVar2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
            case 2:
                mes mesVar3 = (mes) create(xukVar, fbkVar);
                w2a1 w2a1Var3 = w2a1.f247311a;
                mesVar3.invokeSuspend(w2a1Var3);
                return w2a1Var3;
            default:
                mes mesVar4 = (mes) create(xukVar, fbkVar);
                w2a1 w2a1Var4 = w2a1.f247311a;
                mesVar4.invokeSuspend(w2a1Var4);
                return w2a1Var4;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f142833a) {
            case 0:
                bga.m29073P(obj);
                break;
            case 1:
                bga.m29073P(obj);
                break;
            case 2:
                bga.m29073P(obj);
                break;
            default:
                bga.m29073P(obj);
                break;
        }
        return w2a1.f247311a;
    }
}
