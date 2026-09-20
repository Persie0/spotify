package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pn9 extends mb61 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f179344a;

    /* JADX INFO: renamed from: b */
    public int f179345b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ un9 f179346c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pn9(un9 un9Var, fbk fbkVar, int i) {
        super(1, fbkVar);
        this.f179344a = i;
        this.f179346c = un9Var;
    }

    @Override // p204p.ly8
    public final fbk create(fbk fbkVar) {
        switch (this.f179344a) {
            case 0:
                return new pn9(this.f179346c, fbkVar, 0);
            default:
                return new pn9(this.f179346c, fbkVar, 1);
        }
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        fbk fbkVar = (fbk) obj;
        switch (this.f179344a) {
            case 0:
                break;
        }
        return ((pn9) create(fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) throws Exception {
        switch (this.f179344a) {
            case 0:
                int i = this.f179345b;
                w2a1 w2a1Var = w2a1.f247311a;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return w2a1Var;
                }
                bga.m29073P(obj);
                go9 go9Var = this.f179346c.f232099c;
                this.f179345b = 1;
                Object objM45330e = go9Var.m45330e(new wn9(go9Var, null, 0 == true ? 1 : 0, 0), this);
                yuk yukVar = yuk.f276404a;
                if (objM45330e != yukVar) {
                    objM45330e = w2a1Var;
                }
                return objM45330e == yukVar ? yukVar : w2a1Var;
            default:
                int i2 = this.f179345b;
                w2a1 w2a1Var2 = w2a1.f247311a;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return w2a1Var2;
                }
                bga.m29073P(obj);
                go9 go9Var2 = this.f179346c.f232099c;
                this.f179345b = 1;
                Object objM45329d = go9Var2.m45329d(new gs3(go9Var2, null), this);
                yuk yukVar2 = yuk.f276404a;
                if (objM45329d != yukVar2) {
                    objM45329d = w2a1Var2;
                }
                return objM45329d == yukVar2 ? yukVar2 : w2a1Var2;
        }
    }
}
