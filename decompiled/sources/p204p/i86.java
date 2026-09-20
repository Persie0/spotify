package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class i86 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f99700a;

    /* JADX INFO: renamed from: b */
    public int f99701b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xom0 f99702c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f99703d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i86(xom0 xom0Var, int i, fbk fbkVar, int i2) {
        super(2, fbkVar);
        this.f99700a = i2;
        this.f99702c = xom0Var;
        this.f99703d = i;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f99700a) {
            case 0:
                return new i86(this.f99702c, this.f99703d, fbkVar, 0);
            case 1:
                return new i86(this.f99702c, this.f99703d, fbkVar, 1);
            default:
                return new i86(this.f99702c, this.f99703d, fbkVar, 2);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f99700a) {
            case 0:
                return ((i86) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 1:
                return ((i86) create((nly0) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            default:
                return ((i86) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f99700a) {
            case 0:
                int i = this.f99701b;
                if (i == 0) {
                    bga.m29073P(obj);
                    this.f99701b = 1;
                    Object objM91547g = xom0.m91547g(this.f99702c, this.f99703d, null, this, 6);
                    yuk yukVar = yuk.f276404a;
                    if (objM91547g == yukVar) {
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
                int i2 = this.f99701b;
                xom0 xom0Var = this.f99702c;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    this.f99701b = 1;
                    Object objM91552i = xom0Var.m91552i(this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM91552i == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                double d = 0.0f;
                if (-0.5d > d || d > 0.5d) {
                    pt40.m70891a("pageOffsetFraction 0.0 is not within the range -0.5 to 0.5");
                }
                xom0Var.m91561u(0.0f, xom0Var.m91553j(this.f99703d), true);
                return w2a1.f247311a;
            default:
                int i3 = this.f99701b;
                if (i3 == 0) {
                    bga.m29073P(obj);
                    this.f99701b = 1;
                    Object objM91549t = xom0.m91549t(this.f99702c, this.f99703d, this);
                    yuk yukVar3 = yuk.f276404a;
                    if (objM91549t == yukVar3) {
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
