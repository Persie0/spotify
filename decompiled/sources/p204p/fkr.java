package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fkr extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70583a = 1;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f70584b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qe70 f70585c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fkr(fbk fbkVar, eh00 eh00Var) {
        super(2, fbkVar);
        this.f70585c = (qe70) eh00Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v1, types: [p.eh00, p.qe70] */
    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f70583a) {
            case 0:
                return new fkr(this.f70585c, this.f70584b, fbkVar);
            default:
                fkr fkrVar = new fkr(fbkVar, this.f70585c);
                fkrVar.f70584b = obj;
                return fkrVar;
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f70583a) {
            case 0:
                fkr fkrVar = (fkr) create((xuk) obj, (fbk) obj2);
                w2a1 w2a1Var = w2a1.f247311a;
                fkrVar.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                fkr fkrVar2 = (fkr) create((iso) obj, (fbk) obj2);
                w2a1 w2a1Var2 = w2a1.f247311a;
                fkrVar2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r2v4, types: [p.eh00, p.qe70] */
    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f70583a) {
            case 0:
                bga.m29073P(obj);
                this.f70585c.invoke(this.f70584b);
                break;
            default:
                iso isoVar = (iso) this.f70584b;
                bga.m29073P(obj);
                if ((isoVar instanceof gso) || (isoVar instanceof fso)) {
                    this.f70585c.invoke();
                }
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fkr(gh00 gh00Var, Object obj, fbk fbkVar) {
        super(2, fbkVar);
        this.f70585c = (qe70) gh00Var;
        this.f70584b = obj;
    }
}
