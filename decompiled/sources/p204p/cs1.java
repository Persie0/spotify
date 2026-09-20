package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class cs1 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41435a;

    /* JADX INFO: renamed from: b */
    public int f41436b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ u9m f41437c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gh00 f41438d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cs1(u9m u9mVar, gh00 gh00Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f41435a = i;
        this.f41437c = u9mVar;
        this.f41438d = gh00Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f41435a) {
            case 0:
                return new cs1(this.f41437c, this.f41438d, fbkVar, 0);
            case 1:
                return new cs1(this.f41437c, this.f41438d, fbkVar, 1);
            default:
                return new cs1(this.f41437c, this.f41438d, fbkVar, 2);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f41435a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((cs1) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f41435a) {
            case 0:
                int i = this.f41436b;
                wp1 wp1Var = wp1.f253637a;
                gh00 gh00Var = this.f41438d;
                try {
                    if (i == 0) {
                        bga.m29073P(obj);
                        u9m u9mVar = this.f41437c;
                        this.f41436b = 1;
                        Object objM82643e = u9m.m82643e(u9mVar, this);
                        yuk yukVar = yuk.f276404a;
                        if (objM82643e == yukVar) {
                            return yukVar;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                    }
                    gh00Var.invoke(wp1Var);
                    return w2a1.f247311a;
                } catch (Throwable th) {
                    gh00Var.invoke(wp1Var);
                    throw th;
                }
            case 1:
                int i2 = this.f41436b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    this.f41436b = 1;
                    Object objM82643e2 = u9m.m82643e(this.f41437c, this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM82643e2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                this.f41438d.invoke(spb.f212793a);
                return w2a1.f247311a;
            default:
                int i3 = this.f41436b;
                if (i3 == 0) {
                    bga.m29073P(obj);
                    this.f41436b = 1;
                    Object objM82643e3 = u9m.m82643e(this.f41437c, this);
                    yuk yukVar3 = yuk.f276404a;
                    if (objM82643e3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                this.f41438d.invoke(tpb.f222476a);
                return w2a1.f247311a;
        }
    }
}
