package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class bjz extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f27786a;

    /* JADX INFO: renamed from: b */
    public int f27787b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fiz f27788c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ pir0 f27789d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bjz(fiz fizVar, pir0 pir0Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f27786a = i;
        this.f27788c = fizVar;
        this.f27789d = pir0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f27786a) {
            case 0:
                return new bjz(this.f27788c, this.f27789d, fbkVar, 0);
            default:
                return new bjz(this.f27788c, this.f27789d, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f27786a) {
            case 0:
                break;
        }
        return ((bjz) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f27786a) {
            case 0:
                int i = this.f27787b;
                if (i == 0) {
                    bga.m29073P(obj);
                    uwd uwdVar = new uwd(this.f27789d, 2);
                    this.f27787b = 1;
                    Object objCollect = this.f27788c.collect(uwdVar, this);
                    yuk yukVar = yuk.f276404a;
                    if (objCollect == yukVar) {
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
                int i2 = this.f27787b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    uwd uwdVar2 = new uwd(this.f27789d, 6);
                    this.f27787b = 1;
                    Object objCollect2 = this.f27788c.collect(uwdVar2, this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objCollect2 == yukVar2) {
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
