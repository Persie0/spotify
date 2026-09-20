package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class lc30 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f131806a;

    /* JADX INFO: renamed from: b */
    public int f131807b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mc30 f131808c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lc30(mc30 mc30Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f131806a = i;
        this.f131808c = mc30Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f131806a) {
            case 0:
                return new lc30(this.f131808c, fbkVar, 0);
            default:
                return new lc30(this.f131808c, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f131806a) {
            case 0:
                break;
        }
        return ((lc30) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f131806a) {
            case 0:
                int i = this.f131807b;
                if (i == 0) {
                    bga.m29073P(obj);
                    this.f131807b = 1;
                    Object objM61437H1 = mc30.m61437H1(this.f131808c, this);
                    yuk yukVar = yuk.f276404a;
                    if (objM61437H1 == yukVar) {
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
                int i2 = this.f131807b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    this.f131807b = 1;
                    Object objM61438I1 = mc30.m61438I1(this.f131808c, this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM61438I1 == yukVar2) {
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
