package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class q39 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f184818a;

    /* JADX INFO: renamed from: b */
    public int f184819b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ r481 f184820c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q39(r481 r481Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f184818a = i;
        this.f184820c = r481Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f184818a) {
            case 0:
                return new q39(this.f184820c, fbkVar, 0);
            default:
                return new q39(this.f184820c, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f184818a) {
            case 0:
                break;
        }
        return ((q39) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f184818a) {
            case 0:
                int i = this.f184819b;
                if (i == 0) {
                    bga.m29073P(obj);
                    this.f184819b = 1;
                    Object objMo31277c = this.f184820c.mo31277c(xqi0.f265055a, this);
                    yuk yukVar = yuk.f276404a;
                    if (objMo31277c == yukVar) {
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
                int i2 = this.f184819b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    this.f184819b = 1;
                    Object objMo31277c2 = this.f184820c.mo31277c(xqi0.f265056b, this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objMo31277c2 == yukVar2) {
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
