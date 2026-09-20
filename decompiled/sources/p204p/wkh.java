package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wkh extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f252241a;

    /* JADX INFO: renamed from: b */
    public int f252242b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yw70 f252243c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wkh(int i, fbk fbkVar, yw70 yw70Var) {
        super(2, fbkVar);
        this.f252241a = i;
        this.f252243c = yw70Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f252241a) {
            case 0:
                return new wkh(0, fbkVar, this.f252243c);
            case 1:
                return new wkh(1, fbkVar, this.f252243c);
            case 2:
                return new wkh(2, fbkVar, this.f252243c);
            case 3:
                return new wkh(3, fbkVar, this.f252243c);
            case 4:
                return new wkh(4, fbkVar, this.f252243c);
            case 5:
                return new wkh(5, fbkVar, this.f252243c);
            case 6:
                return new wkh(6, fbkVar, this.f252243c);
            default:
                return new wkh(7, fbkVar, this.f252243c);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f252241a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        return ((wkh) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        int i = this.f252241a;
        w2a1 w2a1Var = w2a1.f247311a;
        yw70 yw70Var = this.f252243c;
        yuk yukVar = yuk.f276404a;
        switch (i) {
            case 0:
                int i2 = this.f252242b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return w2a1Var;
                }
                bga.m29073P(obj);
                this.f252242b = 1;
                t9y0 t9y0Var = yw70.f276887y;
                return yw70Var.m94782k(0, 0, this) == yukVar ? yukVar : w2a1Var;
            case 1:
                int i3 = this.f252242b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return w2a1Var;
                }
                bga.m29073P(obj);
                this.f252242b = 1;
                t9y0 t9y0Var2 = yw70.f276887y;
                return yw70Var.m94782k(0, 0, this) == yukVar ? yukVar : w2a1Var;
            case 2:
                int i4 = this.f252242b;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return w2a1Var;
                }
                bga.m29073P(obj);
                us4 us4Var = new us4(2, 14, null);
                this.f252242b = 1;
                return yw70Var.mo28414a(xqi0.f265055a, us4Var, this) == yukVar ? yukVar : w2a1Var;
            case 3:
                int i5 = this.f252242b;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return w2a1Var;
                }
                bga.m29073P(obj);
                int i6 = yw70Var.m94779h().f214608n;
                if (i6 <= 0) {
                    return w2a1Var;
                }
                this.f252242b = 1;
                return yw70Var.m94777f(i6 - 1, 0, this) == yukVar ? yukVar : w2a1Var;
            case 4:
                int i7 = this.f252242b;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return w2a1Var;
                }
                bga.m29073P(obj);
                this.f252242b = 1;
                t9y0 t9y0Var3 = yw70.f276887y;
                return yw70Var.m94777f(0, 0, this) == yukVar ? yukVar : w2a1Var;
            case 5:
                int i8 = this.f252242b;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return w2a1Var;
                }
                bga.m29073P(obj);
                this.f252242b = 1;
                t9y0 t9y0Var4 = yw70.f276887y;
                return yw70Var.m94782k(0, 0, this) == yukVar ? yukVar : w2a1Var;
            case 6:
                int i9 = this.f252242b;
                if (i9 != 0) {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return w2a1Var;
                }
                bga.m29073P(obj);
                this.f252242b = 1;
                t9y0 t9y0Var5 = yw70.f276887y;
                return yw70Var.m94782k(0, 0, this) == yukVar ? yukVar : w2a1Var;
            default:
                int i10 = this.f252242b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return w2a1Var;
                }
                bga.m29073P(obj);
                this.f252242b = 1;
                t9y0 t9y0Var6 = yw70.f276887y;
                return yw70Var.m94782k(0, 0, this) == yukVar ? yukVar : w2a1Var;
        }
    }
}
