package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class n8u extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f151624a;

    /* JADX INFO: renamed from: b */
    public int f151625b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ q8u f151626c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n8u(q8u q8uVar, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f151624a = i;
        this.f151626c = q8uVar;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f151624a) {
            case 0:
                return new n8u(this.f151626c, fbkVar, 0);
            case 1:
                return new n8u(this.f151626c, fbkVar, 1);
            default:
                return new n8u(this.f151626c, fbkVar, 2);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f151624a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((n8u) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f151624a) {
            case 0:
                int i = this.f151625b;
                if (i == 0) {
                    bga.m29073P(obj);
                    q8u q8uVar = this.f151626c;
                    q8uVar.f186395f = true;
                    this.f151625b = 1;
                    Object objM72341b = q8uVar.m72341b(this);
                    yuk yukVar = yuk.f276404a;
                    if (objM72341b == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 1:
                int i2 = this.f151625b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    this.f151625b = 1;
                    Object objM72341b2 = this.f151626c.m72341b(this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM72341b2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            default:
                int i3 = this.f151625b;
                if (i3 == 0) {
                    bga.m29073P(obj);
                    this.f151625b = 1;
                    Object objM72341b3 = this.f151626c.m72341b(this);
                    yuk yukVar3 = yuk.f276404a;
                    if (objM72341b3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
        }
    }
}
