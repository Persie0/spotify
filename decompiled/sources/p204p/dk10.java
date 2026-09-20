package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dk10 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49818a;

    /* JADX INFO: renamed from: b */
    public int f49819b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fk10 f49820c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dk10(fk10 fk10Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f49818a = i;
        this.f49820c = fk10Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f49818a) {
            case 0:
                return new dk10(this.f49820c, fbkVar, 0);
            default:
                return new dk10(this.f49820c, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f49818a) {
            case 0:
                break;
        }
        return ((dk10) create(bool, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f49818a) {
            case 0:
                int i = this.f49819b;
                if (i == 0) {
                    bga.m29073P(obj);
                    this.f49819b = 1;
                    Object objM41864a = fk10.m41864a(this.f49820c, false, this);
                    yuk yukVar = yuk.f276404a;
                    if (objM41864a == yukVar) {
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
                int i2 = this.f49819b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    this.f49819b = 1;
                    Object objM41864a2 = fk10.m41864a(this.f49820c, true, this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM41864a2 == yukVar2) {
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
