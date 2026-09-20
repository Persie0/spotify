package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class on9 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f167198a;

    /* JADX INFO: renamed from: b */
    public int f167199b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ un9 f167200c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ on9(un9 un9Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f167198a = i;
        this.f167200c = un9Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f167198a) {
            case 0:
                return new on9(this.f167200c, fbkVar, 0);
            default:
                return new on9(this.f167200c, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f167198a) {
            case 0:
                break;
        }
        return ((on9) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f167198a) {
            case 0:
                int i = this.f167199b;
                if (i == 0) {
                    bga.m29073P(obj);
                    this.f167199b = 1;
                    Object objM83536f = un9.m83536f(this.f167200c, this);
                    yuk yukVar = yuk.f276404a;
                    if (objM83536f == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            default:
                int i2 = this.f167199b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    un9 un9Var = this.f167200c;
                    pn9 pn9Var = new pn9(un9Var, null, 0);
                    this.f167199b = 1;
                    Object objM83537r = un9Var.m83537r(pn9Var, this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM83537r == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
        }
    }
}
