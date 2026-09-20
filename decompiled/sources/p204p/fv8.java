package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class fv8 implements rte0 {

    /* JADX INFO: renamed from: a */
    public final qse0 f73727a;

    /* JADX INFO: renamed from: b */
    public final luk f73728b;

    /* JADX INFO: renamed from: c */
    public final c9k f73729c;

    /* JADX INFO: renamed from: d */
    public final zv41 f73730d;

    /* JADX INFO: renamed from: e */
    public final nuu0 f73731e;

    /* JADX INFO: renamed from: f */
    public final ev8 f73732f;

    public fv8(qse0 qse0Var, luk lukVar) {
        this.f73727a = qse0Var;
        this.f73728b = lukVar;
        this.f73729c = kk40.m56661c(mlg1.m62205A(qlg1.m73202g(), lukVar));
        zv41 zv41VarM52819d = jag1.m52819d(null);
        this.f73730d = zv41VarM52819d;
        nuu0 nuu0VarM31021m = bzf1.m31021m(zv41VarM52819d);
        this.f73731e = nuu0VarM31021m;
        this.f73732f = new ev8(nuu0VarM31021m, 0);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0091  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
    
        if (r6 == r9) goto L29;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m42772a(fv8 fv8Var, fw8 fw8Var, ase0 ase0Var, ibk ibkVar) {
        av8 av8Var;
        fw8 fw8Var2;
        d0r0 d0r0Var;
        zv41 zv41Var = fv8Var.f73730d;
        if (ibkVar instanceof av8) {
            av8Var = (av8) ibkVar;
            int i = av8Var.f20125e;
            if ((i & Integer.MIN_VALUE) != 0) {
                av8Var.f20125e = i - Integer.MIN_VALUE;
            } else {
                av8Var = new av8(fv8Var, ibkVar);
            }
        } else {
            av8Var = new av8(fv8Var, ibkVar);
        }
        Object objM36852d = av8Var.f20123c;
        int i2 = av8Var.f20125e;
        w2a1 w2a1Var = w2a1.f247311a;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM36852d);
            d0r0 d0r0Var2 = new d0r0(jte0.f115852a, ase0Var, new bv8(fv8Var, fw8Var, ase0Var, null));
            av8Var.f20121a = fw8Var;
            av8Var.f20122b = d0r0Var2;
            av8Var.f20125e = 1;
            fw8Var.f74021e.emit(bw8.f31577a, av8Var);
            if (w2a1Var != yukVar) {
                fw8Var2 = fw8Var;
                d0r0Var = d0r0Var2;
            }
            return yukVar;
        }
        if (i2 == 1) {
            d0r0Var = av8Var.f20122b;
            fw8Var2 = av8Var.f20121a;
            bga.m29073P(objM36852d);
        } else if (i2 == 2) {
            d0r0Var = av8Var.f20122b;
            fw8Var2 = av8Var.f20121a;
            bga.m29073P(objM36852d);
            if (((Boolean) objM36852d).booleanValue()) {
                x0h1.m89578u(fv8Var.f73729c, null, 0, new lw2(fw8Var2, fv8Var, fbkVar, 2), 3);
                return w2a1Var;
            }
            av8Var.f20121a = fw8Var2;
            av8Var.f20122b = d0r0Var;
            av8Var.f20125e = 3;
            fw8Var2.f74023g = true;
            fw8Var2.f74021e.emit(bw8.f31578b, av8Var);
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d0r0Var = av8Var.f20122b;
            fw8Var2 = av8Var.f20121a;
            bga.m29073P(objM36852d);
        }
        c0r0 c0r0Var = (c0r0) zv41Var.getValue();
        zv41Var.m97091m(null, new c0r0(fw8Var2, d0r0Var));
        if (c0r0Var != null) {
            x0h1.m89578u(c0r0Var.f32850a.f74018b, null, 0, new jr4(fv8Var, c0r0Var, fbkVar, 27), 3);
        }
        return w2a1Var;
        qse0 qse0Var = fv8Var.f73727a;
        pte0 pte0VarM34553h = d0r0Var.m34553h();
        ase0 ase0VarM34551c = d0r0Var.m34551c();
        av8Var.f20121a = fw8Var2;
        av8Var.f20122b = d0r0Var;
        av8Var.f20125e = 2;
        objM36852d = ((dte0) qse0Var).m36852d(pte0VarM34553h, ase0VarM34551c, av8Var);
        if (objM36852d != yukVar) {
            if (((Boolean) objM36852d).booleanValue()) {
                x0h1.m89578u(fv8Var.f73729c, null, 0, new lw2(fw8Var2, fv8Var, fbkVar, 2), 3);
                return w2a1Var;
            }
            av8Var.f20121a = fw8Var2;
            av8Var.f20122b = d0r0Var;
            av8Var.f20125e = 3;
            fw8Var2.f74023g = true;
            fw8Var2.f74021e.emit(bw8.f31578b, av8Var);
        }
        return yukVar;
    }

    /* JADX INFO: renamed from: b */
    public final fw8 m42774b(yt8 yt8Var, boolean z, vre0 vre0Var) {
        cv8 cv8Var = new cv8(1, this, fv8.class, "dispose", "dispose(Lcom/spotify/banner/impl/BannerTicketImpl;)V", 0, 0, 0);
        c9k c9kVarM56661c = kk40.m56661c(mlg1.m62205A(qlg1.m73202g(), this.f73728b));
        fw8 fw8Var = new fw8(yt8Var, c9kVarM56661c, cv8Var);
        x0h1.m89578u(c9kVarM56661c, null, 0, new zu8(this, fw8Var, z, vre0Var, (fbk) null), 3);
        return fw8Var;
    }

    @Override // p204p.rte0
    /* JADX INFO: renamed from: c */
    public final fiz mo37621c() {
        return this.f73732f;
    }
}
