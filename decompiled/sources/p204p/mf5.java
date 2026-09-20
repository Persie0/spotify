package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mf5 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f142960a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f142961b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eh00 f142962c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mf5(eh00 eh00Var, kqi0 kqi0Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f142960a = i;
        this.f142962c = eh00Var;
        this.f142961b = kqi0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f142960a) {
            case 0:
                return new mf5(this.f142962c, this.f142961b, fbkVar, 0);
            case 1:
                return new mf5(this.f142961b, this.f142962c, fbkVar);
            case 2:
                return new mf5(this.f142962c, this.f142961b, fbkVar, 2);
            default:
                return new mf5(this.f142962c, this.f142961b, fbkVar, 3);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f142960a) {
            case 0:
                mf5 mf5Var = (mf5) create((xuk) obj, (fbk) obj2);
                w2a1 w2a1Var = w2a1.f247311a;
                mf5Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            case 1:
                mf5 mf5Var2 = (mf5) create((qho) obj, (fbk) obj2);
                w2a1 w2a1Var2 = w2a1.f247311a;
                mf5Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
            case 2:
                mf5 mf5Var3 = (mf5) create((xuk) obj, (fbk) obj2);
                w2a1 w2a1Var3 = w2a1.f247311a;
                mf5Var3.invokeSuspend(w2a1Var3);
                return w2a1Var3;
            default:
                mf5 mf5Var4 = (mf5) create((xuk) obj, (fbk) obj2);
                w2a1 w2a1Var4 = w2a1.f247311a;
                mf5Var4.invokeSuspend(w2a1Var4);
                return w2a1Var4;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f142960a) {
            case 0:
                bga.m29073P(obj);
                if (((eg5) this.f142961b.getValue()).f59221d) {
                    this.f142962c.invoke();
                }
                break;
            case 1:
                bga.m29073P(obj);
                this.f142961b.setValue(this.f142962c.invoke());
                break;
            case 2:
                bga.m29073P(obj);
                this.f142962c.invoke();
                this.f142961b.setValue(Boolean.TRUE);
                break;
            default:
                bga.m29073P(obj);
                if (((Boolean) this.f142961b.getValue()).booleanValue()) {
                    this.f142962c.invoke();
                }
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf5(kqi0 kqi0Var, eh00 eh00Var, fbk fbkVar) {
        super(2, fbkVar);
        this.f142960a = 1;
        this.f142961b = kqi0Var;
        this.f142962c = eh00Var;
    }
}
