package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class g841 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f77408a;

    /* JADX INFO: renamed from: b */
    public int f77409b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wf11 f77410c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ kqi0 f77411d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g841(wf11 wf11Var, kqi0 kqi0Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f77408a = i;
        this.f77410c = wf11Var;
        this.f77411d = kqi0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f77408a) {
            case 0:
                return new g841(this.f77410c, this.f77411d, fbkVar, 0);
            default:
                return new g841(this.f77410c, this.f77411d, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f77408a) {
            case 0:
                break;
        }
        return ((g841) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f77408a) {
            case 0:
                int i = this.f77409b;
                if (i == 0) {
                    bga.m29073P(obj);
                    this.f77411d.setValue(Boolean.TRUE);
                    this.f77409b = 1;
                    Object objM87929k = this.f77410c.m87929k(this);
                    yuk yukVar = yuk.f276404a;
                    if (objM87929k == yukVar) {
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
                int i2 = this.f77409b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    this.f77411d.setValue(Boolean.FALSE);
                    this.f77409b = 1;
                    Object objM87926h = this.f77410c.m87926h(this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM87926h == yukVar2) {
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
