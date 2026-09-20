package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ds01 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52457a;

    /* JADX INFO: renamed from: b */
    public int f52458b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ y0i0 f52459c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ds01(y0i0 y0i0Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f52457a = i;
        this.f52459c = y0i0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f52457a) {
            case 0:
                return new ds01(this.f52459c, fbkVar, 0);
            case 1:
                return new ds01(this.f52459c, fbkVar, 1);
            default:
                return new ds01(this.f52459c, fbkVar, 2);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f52457a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((ds01) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f52457a) {
            case 0:
                int i = this.f52458b;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                gcu0 gcu0Var = (gcu0) this.f52459c.f267990c;
                this.f52458b = 1;
                Object objM44323e = gcu0Var.m44323e(this);
                yuk yukVar = yuk.f276404a;
                return objM44323e == yukVar ? yukVar : objM44323e;
            case 1:
                int i2 = this.f52458b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                gcu0 gcu0Var2 = (gcu0) this.f52459c.f267990c;
                this.f52458b = 1;
                Object objM44323e2 = gcu0Var2.m44323e(this);
                yuk yukVar2 = yuk.f276404a;
                return objM44323e2 == yukVar2 ? yukVar2 : objM44323e2;
            default:
                int i3 = this.f52458b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                gcu0 gcu0Var3 = (gcu0) this.f52459c.f267990c;
                this.f52458b = 1;
                Object objM44323e3 = gcu0Var3.m44323e(this);
                yuk yukVar3 = yuk.f276404a;
                return objM44323e3 == yukVar3 ? yukVar3 : objM44323e3;
        }
    }
}
