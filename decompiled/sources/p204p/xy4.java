package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xy4 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f267210a;

    /* JADX INFO: renamed from: b */
    public int f267211b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Float f267212c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gw4 f267213d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xy4(Float f, gw4 gw4Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f267210a = i;
        this.f267212c = f;
        this.f267213d = gw4Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f267210a) {
            case 0:
                return new xy4(this.f267212c, this.f267213d, fbkVar, 0);
            default:
                return new xy4(this.f267212c, this.f267213d, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f267210a) {
            case 0:
                break;
        }
        return ((xy4) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f267210a) {
            case 0:
                int i = this.f267211b;
                if (i == 0) {
                    bga.m29073P(obj);
                    Float f = this.f267212c;
                    if (f != null) {
                        this.f267211b = 1;
                        Object objM45914g = this.f267213d.m45914g(f, this);
                        yuk yukVar = yuk.f276404a;
                        if (objM45914g == yukVar) {
                            return yukVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            default:
                int i2 = this.f267211b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    Float f2 = this.f267212c;
                    if (f2 != null) {
                        this.f267211b = 1;
                        Object objM45914g2 = this.f267213d.m45914g(f2, this);
                        yuk yukVar2 = yuk.f276404a;
                        if (objM45914g2 == yukVar2) {
                            return yukVar2;
                        }
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
