package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class o041 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f160229a;

    /* JADX INFO: renamed from: b */
    public int f160230b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f160231c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f160232d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ x041 f160233e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o041(Object obj, fbk fbkVar, x041 x041Var, int i) {
        super(2, fbkVar);
        this.f160229a = i;
        this.f160232d = obj;
        this.f160233e = x041Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f160229a) {
            case 0:
                o041 o041Var = new o041(this.f160232d, fbkVar, this.f160233e, 0);
                o041Var.f160231c = obj;
                return o041Var;
            case 1:
                o041 o041Var2 = new o041(this.f160232d, fbkVar, this.f160233e, 1);
                o041Var2.f160231c = obj;
                return o041Var2;
            case 2:
                o041 o041Var3 = new o041(this.f160232d, fbkVar, this.f160233e, 2);
                o041Var3.f160231c = obj;
                return o041Var3;
            case 3:
                o041 o041Var4 = new o041(this.f160232d, fbkVar, this.f160233e, 3);
                o041Var4.f160231c = obj;
                return o041Var4;
            case 4:
                o041 o041Var5 = new o041(this.f160232d, fbkVar, this.f160233e, 4);
                o041Var5.f160231c = obj;
                return o041Var5;
            default:
                o041 o041Var6 = new o041(this.f160232d, fbkVar, this.f160233e, 5);
                o041Var6.f160231c = obj;
                return o041Var6;
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        niz nizVar = (niz) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f160229a) {
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
        }
        return ((o041) create(nizVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f160229a) {
            case 0:
                int i = this.f160230b;
                if (i == 0) {
                    bga.m29073P(obj);
                    niz nizVar = (niz) this.f160231c;
                    sz31 sz31Var = (sz31) this.f160232d;
                    this.f160231c = null;
                    this.f160230b = 1;
                    Object objM89497c = x041.m89497c(this.f160233e, nizVar, sz31Var, this);
                    yuk yukVar = yuk.f276404a;
                    if (objM89497c == yukVar) {
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
                int i2 = this.f160230b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    niz nizVar2 = (niz) this.f160231c;
                    rz31 rz31Var = (rz31) this.f160232d;
                    this.f160231c = null;
                    this.f160230b = 1;
                    Object objM89503h = this.f160233e.m89503h(nizVar2, rz31Var, this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM89503h == yukVar2) {
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
                int i3 = this.f160230b;
                if (i3 == 0) {
                    bga.m29073P(obj);
                    niz nizVar3 = (niz) this.f160231c;
                    qz31 qz31Var = (qz31) this.f160232d;
                    this.f160231c = null;
                    this.f160230b = 1;
                    Object objM89496b = x041.m89496b(this.f160233e, nizVar3, qz31Var, this);
                    yuk yukVar3 = yuk.f276404a;
                    if (objM89496b == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 3:
                int i4 = this.f160230b;
                if (i4 == 0) {
                    bga.m29073P(obj);
                    niz nizVar4 = (niz) this.f160231c;
                    oz31 oz31Var = (oz31) this.f160232d;
                    this.f160231c = null;
                    this.f160230b = 1;
                    Object objM89495a = x041.m89495a(this.f160233e, nizVar4, oz31Var, this);
                    yuk yukVar4 = yuk.f276404a;
                    if (objM89495a == yukVar4) {
                        return yukVar4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 4:
                int i5 = this.f160230b;
                if (i5 == 0) {
                    bga.m29073P(obj);
                    niz nizVar5 = (niz) this.f160231c;
                    vz31 vz31Var = (vz31) this.f160232d;
                    this.f160231c = null;
                    this.f160230b = 1;
                    Object objM89500f = x041.m89500f(this.f160233e, nizVar5, vz31Var, this);
                    yuk yukVar5 = yuk.f276404a;
                    if (objM89500f == yukVar5) {
                        return yukVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            default:
                int i6 = this.f160230b;
                if (i6 == 0) {
                    bga.m29073P(obj);
                    niz nizVar6 = (niz) this.f160231c;
                    uz31 uz31Var = (uz31) this.f160232d;
                    this.f160231c = null;
                    this.f160230b = 1;
                    Object objM89499e = x041.m89499e(this.f160233e, nizVar6, uz31Var, this);
                    yuk yukVar6 = yuk.f276404a;
                    if (objM89499e == yukVar6) {
                        return yukVar6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
        }
    }
}
