package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class mj2 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f144147a;

    /* JADX INFO: renamed from: b */
    public int f144148b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ck2 f144149c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mj2(ck2 ck2Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f144147a = i;
        this.f144149c = ck2Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f144147a) {
            case 0:
                return new mj2(this.f144149c, fbkVar, 0);
            case 1:
                return new mj2(this.f144149c, fbkVar, 1);
            case 2:
                return new mj2(this.f144149c, fbkVar, 2);
            default:
                return new mj2(this.f144149c, fbkVar, 3);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f144147a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((mj2) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f144147a) {
            case 0:
                int i = this.f144148b;
                if (i == 0) {
                    bga.m29073P(obj);
                    this.f144148b = 1;
                    Object objM33053J = this.f144149c.m33053J(this);
                    yuk yukVar = yuk.f276404a;
                    if (objM33053J == yukVar) {
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
                int i2 = this.f144148b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    this.f144148b = 1;
                    Object objM33053J2 = this.f144149c.m33053J(this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM33053J2 == yukVar2) {
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
                int i3 = this.f144148b;
                if (i3 == 0) {
                    bga.m29073P(obj);
                    this.f144148b = 1;
                    Object objM33053J3 = this.f144149c.m33053J(this);
                    yuk yukVar3 = yuk.f276404a;
                    if (objM33053J3 == yukVar3) {
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
                int i4 = this.f144148b;
                if (i4 == 0) {
                    bga.m29073P(obj);
                    this.f144148b = 1;
                    Object objM33053J4 = this.f144149c.m33053J(this);
                    yuk yukVar4 = yuk.f276404a;
                    if (objM33053J4 == yukVar4) {
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
