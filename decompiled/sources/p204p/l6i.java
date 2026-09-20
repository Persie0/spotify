package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class l6i extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f130391a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z9j0 f130392b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l6i(z9j0 z9j0Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f130391a = i;
        this.f130392b = z9j0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f130391a) {
            case 0:
                return new l6i(this.f130392b, fbkVar, 0);
            case 1:
                return new l6i(this.f130392b, fbkVar, 1);
            case 2:
                return new l6i(this.f130392b, fbkVar, 2);
            case 3:
                return new l6i(this.f130392b, fbkVar, 3);
            default:
                return new l6i(this.f130392b, fbkVar, 4);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f130391a) {
            case 0:
                l6i l6iVar = (l6i) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                l6iVar.invokeSuspend(w2a1Var);
                return w2a1Var;
            case 1:
                l6i l6iVar2 = (l6i) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                l6iVar2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
            case 2:
                l6i l6iVar3 = (l6i) create(xukVar, fbkVar);
                w2a1 w2a1Var3 = w2a1.f247311a;
                l6iVar3.invokeSuspend(w2a1Var3);
                return w2a1Var3;
            case 3:
                l6i l6iVar4 = (l6i) create(xukVar, fbkVar);
                w2a1 w2a1Var4 = w2a1.f247311a;
                l6iVar4.invokeSuspend(w2a1Var4);
                return w2a1Var4;
            default:
                l6i l6iVar5 = (l6i) create(xukVar, fbkVar);
                w2a1 w2a1Var5 = w2a1.f247311a;
                l6iVar5.invokeSuspend(w2a1Var5);
                return w2a1Var5;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f130391a) {
            case 0:
                bga.m29073P(obj);
                this.f130392b.mo47345e();
                break;
            case 1:
                bga.m29073P(obj);
                this.f130392b.mo47345e();
                break;
            case 2:
                bga.m29073P(obj);
                this.f130392b.mo47345e();
                break;
            case 3:
                bga.m29073P(obj);
                this.f130392b.mo47345e();
                break;
            default:
                bga.m29073P(obj);
                this.f130392b.mo47345e();
                break;
        }
        return w2a1.f247311a;
    }
}
