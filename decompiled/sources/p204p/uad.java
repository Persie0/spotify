package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class uad extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f228452a;

    /* JADX INFO: renamed from: b */
    public int f228453b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c1v f228454c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uad(c1v c1vVar, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f228452a = i;
        this.f228454c = c1vVar;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f228452a) {
            case 0:
                return new uad(this.f228454c, fbkVar, 0);
            case 1:
                return new uad(this.f228454c, fbkVar, 1);
            default:
                return new uad(this.f228454c, fbkVar, 2);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f228452a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((uad) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f228452a) {
            case 0:
                int i = this.f228453b;
                if (i == 0) {
                    bga.m29073P(obj);
                    yre0 yre0Var = new yre0(true);
                    this.f228453b = 1;
                    Object objM31279e = this.f228454c.m31279e(yre0Var, xqi0.f265055a, this);
                    yuk yukVar = yuk.f276404a;
                    if (objM31279e == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 1:
                int i2 = this.f228453b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    yre0 yre0Var2 = new yre0(true);
                    this.f228453b = 1;
                    Object objM31279e2 = this.f228454c.m31279e(yre0Var2, xqi0.f265055a, this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM31279e2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            default:
                int i3 = this.f228453b;
                if (i3 == 0) {
                    bga.m29073P(obj);
                    yre0 yre0Var3 = new yre0(true);
                    this.f228453b = 1;
                    Object objM31279e3 = this.f228454c.m31279e(yre0Var3, xqi0.f265055a, this);
                    yuk yukVar3 = yuk.f276404a;
                    if (objM31279e3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
        }
    }
}
