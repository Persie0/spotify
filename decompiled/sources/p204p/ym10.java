package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ym10 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f274133a;

    /* JADX INFO: renamed from: b */
    public int f274134b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zm10 f274135c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ym10(zm10 zm10Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f274133a = i;
        this.f274135c = zm10Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f274133a) {
            case 0:
                return new ym10(this.f274135c, fbkVar, 0);
            case 1:
                return new ym10(this.f274135c, fbkVar, 1);
            default:
                return new ym10(this.f274135c, fbkVar, 2);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f274133a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((ym10) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f274133a) {
            case 0:
                int i = this.f274134b;
                if (i == 0) {
                    bga.m29073P(obj);
                    ui10 ui10Var = this.f274135c.f284118a;
                    this.f274134b = 1;
                    Object objM83171a = ui10Var.m83171a(this);
                    yuk yukVar = yuk.f276404a;
                    if (objM83171a == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    ((s6x0) obj).getClass();
                }
                return w2a1.f247311a;
            case 1:
                int i2 = this.f274134b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return w2a1.f247311a;
                }
                bga.m29073P(obj);
                this.f274134b = 1;
                zm10.m96394c(this.f274135c, this);
                return yuk.f276404a;
            default:
                int i3 = this.f274134b;
                if (i3 == 0) {
                    bga.m29073P(obj);
                    ui10 ui10Var2 = this.f274135c.f284118a;
                    this.f274134b = 1;
                    Object objM83174d = ui10Var2.m83174d(this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM83174d == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    ((s6x0) obj).getClass();
                }
                return w2a1.f247311a;
        }
    }
}
