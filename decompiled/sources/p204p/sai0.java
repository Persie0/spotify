package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class sai0 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f207217a;

    /* JADX INFO: renamed from: b */
    public int f207218b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f207219c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ th00 f207220d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ kqi0 f207221e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sai0(th00 th00Var, kqi0 kqi0Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f207217a = i;
        this.f207220d = th00Var;
        this.f207221e = kqi0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f207217a) {
            case 0:
                sai0 sai0Var = new sai0(this.f207220d, this.f207221e, fbkVar, 0);
                sai0Var.f207219c = obj;
                return sai0Var;
            case 1:
                sai0 sai0Var2 = new sai0(this.f207220d, this.f207221e, fbkVar, 1);
                sai0Var2.f207219c = obj;
                return sai0Var2;
            case 2:
                sai0 sai0Var3 = new sai0(this.f207220d, this.f207221e, fbkVar, 2);
                sai0Var3.f207219c = obj;
                return sai0Var3;
            default:
                sai0 sai0Var4 = new sai0(this.f207220d, this.f207221e, fbkVar, 3);
                sai0Var4.f207219c = obj;
                return sai0Var4;
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f207217a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((sai0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f207217a) {
            case 0:
                xuk xukVar = (xuk) this.f207219c;
                int i = this.f207218b;
                if (i == 0) {
                    bga.m29073P(obj);
                    if (((Boolean) this.f207221e.getValue()).booleanValue()) {
                        this.f207219c = null;
                        this.f207218b = 1;
                        Object objInvoke = this.f207220d.invoke(xukVar, this);
                        yuk yukVar = yuk.f276404a;
                        if (objInvoke == yukVar) {
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
            case 1:
                int i2 = this.f207218b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    pir0 pir0Var = new pir0(this.f207221e, ((xuk) this.f207219c).mo31960M());
                    this.f207218b = 1;
                    Object objInvoke2 = this.f207220d.invoke(pir0Var, this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objInvoke2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 2:
                int i3 = this.f207218b;
                if (i3 == 0) {
                    bga.m29073P(obj);
                    pir0 pir0Var2 = new pir0(this.f207221e, ((xuk) this.f207219c).mo31960M());
                    this.f207218b = 1;
                    Object objInvoke3 = this.f207220d.invoke(pir0Var2, this);
                    yuk yukVar3 = yuk.f276404a;
                    if (objInvoke3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            default:
                int i4 = this.f207218b;
                if (i4 == 0) {
                    bga.m29073P(obj);
                    pir0 pir0Var3 = new pir0(this.f207221e, ((xuk) this.f207219c).mo31960M());
                    this.f207218b = 1;
                    Object objInvoke4 = this.f207220d.invoke(pir0Var3, this);
                    yuk yukVar4 = yuk.f276404a;
                    if (objInvoke4 == yukVar4) {
                        return yukVar4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
        }
    }
}
