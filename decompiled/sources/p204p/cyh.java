package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class cyh extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43277a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f43278b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rlv0 f43279c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cyh(rlv0 rlv0Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f43277a = i;
        this.f43279c = rlv0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f43277a) {
            case 0:
                cyh cyhVar = new cyh(this.f43279c, fbkVar, 0);
                cyhVar.f43278b = obj;
                return cyhVar;
            case 1:
                cyh cyhVar2 = new cyh(this.f43279c, fbkVar, 1);
                cyhVar2.f43278b = obj;
                return cyhVar2;
            case 2:
                cyh cyhVar3 = new cyh(this.f43279c, fbkVar, 2);
                cyhVar3.f43278b = obj;
                return cyhVar3;
            default:
                cyh cyhVar4 = new cyh(this.f43279c, fbkVar, 3);
                cyhVar4.f43278b = obj;
                return cyhVar4;
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f43277a) {
            case 0:
                cyh cyhVar = (cyh) create((gqx) obj, (fbk) obj2);
                w2a1 w2a1Var = w2a1.f247311a;
                cyhVar.invokeSuspend(w2a1Var);
                return w2a1Var;
            case 1:
                cyh cyhVar2 = (cyh) create((gqx) obj, (fbk) obj2);
                w2a1 w2a1Var2 = w2a1.f247311a;
                cyhVar2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
            case 2:
                cyh cyhVar3 = (cyh) create((String) obj, (fbk) obj2);
                w2a1 w2a1Var3 = w2a1.f247311a;
                cyhVar3.invokeSuspend(w2a1Var3);
                return w2a1Var3;
            default:
                cyh cyhVar4 = (cyh) create((s1a0) obj, (fbk) obj2);
                w2a1 w2a1Var4 = w2a1.f247311a;
                cyhVar4.invokeSuspend(w2a1Var4);
                return w2a1Var4;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f43277a) {
            case 0:
                gqx gqxVar = (gqx) this.f43278b;
                bga.m29073P(obj);
                this.f43279c.f200373a = gqxVar;
                break;
            case 1:
                gqx gqxVar2 = (gqx) this.f43278b;
                bga.m29073P(obj);
                this.f43279c.f200373a = gqxVar2;
                break;
            case 2:
                String str = (String) this.f43278b;
                bga.m29073P(obj);
                if (str.length() == 0) {
                    str = null;
                }
                this.f43279c.f200373a = str;
                break;
            default:
                s1a0 s1a0Var = (s1a0) this.f43278b;
                bga.m29073P(obj);
                if (s1a0Var instanceof r1a0) {
                    this.f43279c.f200373a = s1a0Var;
                }
                break;
        }
        return w2a1.f247311a;
    }
}
