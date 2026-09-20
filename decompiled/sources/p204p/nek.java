package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class nek extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f153001a;

    /* JADX INFO: renamed from: b */
    public int f153002b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gw4 f153003c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gw4 f153004d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nek(gw4 gw4Var, gw4 gw4Var2, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f153001a = i;
        this.f153003c = gw4Var;
        this.f153004d = gw4Var2;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f153001a) {
            case 0:
                return new nek(this.f153003c, this.f153004d, fbkVar, 0);
            case 1:
                return new nek(this.f153003c, this.f153004d, fbkVar, 1);
            default:
                return new nek(this.f153003c, this.f153004d, fbkVar, 2);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f153001a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((nek) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        nek nekVar;
        switch (this.f153001a) {
            case 0:
                int i = this.f153002b;
                yuk yukVar = yuk.f276404a;
                if (i != 0) {
                    if (i == 1) {
                        bga.m29073P(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(obj);
                Float f = new Float(0.0f);
                this.f153002b = 1;
                if (gw4.m45909c(this.f153003c, f, null, null, null, this, 14) == yukVar) {
                    return yukVar;
                }
                Float f2 = new Float(0.0f);
                this.f153002b = 2;
                if (gw4.m45909c(this.f153004d, f2, null, null, null, this, 14) == yukVar) {
                    return yukVar;
                }
                return w2a1.f247311a;
            case 1:
                int i2 = this.f153002b;
                yuk yukVar2 = yuk.f276404a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        bga.m29073P(obj);
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(obj);
                Float f3 = new Float(0.0f);
                this.f153002b = 1;
                if (this.f153003c.m45914g(f3, this) == yukVar2) {
                    return yukVar2;
                }
                Float f4 = new Float(0.0f);
                this.f153002b = 2;
                if (this.f153004d.m45914g(f4, this) == yukVar2) {
                    return yukVar2;
                }
                return w2a1.f247311a;
            default:
                int i3 = this.f153002b;
                yuk yukVar3 = yuk.f276404a;
                if (i3 != 0) {
                    if (i3 == 1) {
                        bga.m29073P(obj);
                        nekVar = this;
                    } else {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(obj);
                Float f5 = new Float(0.0f);
                this.f153002b = 1;
                nekVar = this;
                if (gw4.m45909c(this.f153003c, f5, null, null, null, nekVar, 14) == yukVar3) {
                    return yukVar3;
                }
                Float f6 = new Float(0.0f);
                nekVar.f153002b = 2;
                if (gw4.m45909c(nekVar.f153004d, f6, null, null, null, nekVar, 14) == yukVar3) {
                    return yukVar3;
                }
                return w2a1.f247311a;
        }
    }
}
