package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class dz9 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54581a;

    /* JADX INFO: renamed from: b */
    public int f54582b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fz9 f54583c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dz9(fz9 fz9Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f54581a = i;
        this.f54583c = fz9Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f54581a) {
            case 0:
                return new dz9(this.f54583c, fbkVar, 0);
            default:
                return new dz9(this.f54583c, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f54581a) {
            case 0:
                return ((dz9) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            default:
                return ((dz9) create((Boolean) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f54581a) {
            case 0:
                int i = this.f54582b;
                if (i == 0) {
                    bga.m29073P(obj);
                    this.f54582b = 1;
                    Object objM43177f = fz9.m43177f(this.f54583c, this);
                    yuk yukVar = yuk.f276404a;
                    if (objM43177f == yukVar) {
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
                int i2 = this.f54582b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    this.f54582b = 1;
                    Object objM43177f2 = fz9.m43177f(this.f54583c, this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM43177f2 == yukVar2) {
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
