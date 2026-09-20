package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class idr implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f101204a = 3;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f101205b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f101206c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f101207d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f101208e;

    public idr(xre xreVar, qlv0 qlv0Var, long j, niz nizVar) {
        this.f101206c = xreVar;
        this.f101207d = qlv0Var;
        this.f101205b = j;
        this.f101208e = nizVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0055  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        her herVar;
        Object objEmit;
        switch (this.f101204a) {
            case 0:
                rlv0 rlv0Var = (rlv0) this.f101207d;
                rlv0 rlv0Var2 = (rlv0) this.f101206c;
                tf60 tf60Var = (tf60) rlv0Var2.f200373a;
                if (tf60Var != null) {
                    tf60Var.mo26601e(null);
                }
                Object obj2 = rlv0Var.f200373a;
                if (obj2 != null) {
                    gdr gdrVar = (gdr) obj2;
                    gdr gdrVar2 = (gdr) obj;
                    if (!gdrVar.f78926a) {
                        gdrVar = gdrVar2;
                    }
                    if (gdrVar != null) {
                        obj = gdrVar;
                    }
                }
                rlv0Var.f200373a = obj;
                sir0 sir0Var = (sir0) this.f101208e;
                rlv0Var2.f200373a = x0h1.m89578u(sir0Var, null, 0, new C2004j6(this.f101205b, rlv0Var, sir0Var, (fbk) null, 6), 3);
                return w2a1.f247311a;
            case 1:
                qlv0 qlv0Var = (qlv0) this.f101207d;
                ((wy3) ((xre) this.f101206c)).getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (((gdr) obj).f78926a || jCurrentTimeMillis - qlv0Var.f189932a >= this.f101205b) {
                    qlv0Var.f189932a = jCurrentTimeMillis;
                    Object objEmit2 = ((niz) this.f101208e).emit(obj, fbkVar);
                    if (objEmit2 == yuk.f276404a) {
                        return objEmit2;
                    }
                }
                return w2a1.f247311a;
            case 2:
                if (fbkVar instanceof her) {
                    herVar = (her) fbkVar;
                    int i = herVar.f90488b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        herVar.f90488b = i - Integer.MIN_VALUE;
                    } else {
                        herVar = new her(this, fbkVar);
                    }
                } else {
                    herVar = new her(this, fbkVar);
                }
                Object obj3 = herVar.f90487a;
                int i2 = herVar.f90488b;
                if (i2 == 0) {
                    bga.m29073P(obj3);
                    niz nizVar = (niz) this.f101206c;
                    dfr dfrVarM82911i = uer.m82911i((ifr) obj, (ddr) this.f101207d);
                    if (dfrVarM82911i != null && (dfrVarM82911i.f48636b != ((e261) this.f101208e) || dfrVarM82911i.f48637c > this.f101205b)) {
                        herVar.f90488b = 1;
                        Object objEmit3 = nizVar.emit(obj, herVar);
                        yuk yukVar = yuk.f276404a;
                        if (objEmit3 == yukVar) {
                            return yukVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
            default:
                ((wy3) ((lb71) this.f101207d).f131588b).getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                rlv0 rlv0Var3 = (rlv0) this.f101206c;
                Object obj4 = rlv0Var3.f200373a;
                w2a1 w2a1Var = w2a1.f247311a;
                if (obj4 != null) {
                    return (jCurrentTimeMillis2 - ((Number) obj4).longValue() >= this.f101205b && (objEmit = ((niz) this.f101208e).emit(obj, fbkVar)) == yuk.f276404a) ? objEmit : w2a1Var;
                }
                rlv0Var3.f200373a = new Long(jCurrentTimeMillis2);
                return w2a1Var;
        }
    }

    public idr(niz nizVar, uer uerVar, ddr ddrVar, e261 e261Var, long j) {
        this.f101206c = nizVar;
        this.f101207d = ddrVar;
        this.f101208e = e261Var;
        this.f101205b = j;
    }

    public idr(rlv0 rlv0Var, rlv0 rlv0Var2, sir0 sir0Var, long j) {
        this.f101206c = rlv0Var;
        this.f101207d = rlv0Var2;
        this.f101208e = sir0Var;
        this.f101205b = j;
    }

    public idr(lb71 lb71Var, rlv0 rlv0Var, long j, niz nizVar) {
        this.f101207d = lb71Var;
        this.f101206c = rlv0Var;
        this.f101205b = j;
        this.f101208e = nizVar;
    }
}
