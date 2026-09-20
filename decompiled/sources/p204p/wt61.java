package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class wt61 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f254867a;

    /* JADX INFO: renamed from: b */
    public int f254868b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ k3r0 f254869c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wt61(k3r0 k3r0Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f254867a = i;
        this.f254869c = k3r0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f254867a) {
            case 0:
                return new wt61(this.f254869c, fbkVar, 0);
            default:
                return new wt61(this.f254869c, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f254867a) {
            case 0:
                break;
        }
        return ((wt61) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f254867a) {
            case 0:
                int i = this.f254868b;
                if (i == 0) {
                    bga.m29073P(obj);
                    this.f254868b = 1;
                    Object objM55282c = this.f254869c.m55282c(this);
                    yuk yukVar = yuk.f276404a;
                    if (objM55282c == yukVar) {
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
                int i2 = this.f254868b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    this.f254868b = 1;
                    Object objM55282c2 = this.f254869c.m55282c(this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM55282c2 == yukVar2) {
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
