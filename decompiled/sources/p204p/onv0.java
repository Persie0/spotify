package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class onv0 implements dfo {

    /* JADX INFO: renamed from: Y */
    public final cph f167366Y;

    /* JADX INFO: renamed from: a */
    public final pgo f167367a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2609yd f167368b;

    /* JADX INFO: renamed from: c */
    public final uvc f167369c;

    /* JADX INFO: renamed from: d */
    public final tw60 f167370d;

    /* JADX INFO: renamed from: e */
    public final k5m0 f167371e;

    /* JADX INFO: renamed from: f */
    public final aj2 f167372f;

    /* JADX INFO: renamed from: g */
    public final p8p0 f167373g;

    /* JADX INFO: renamed from: h */
    public final zv41 f167374h = jag1.m52819d(new b0r0(null, 7));

    /* JADX INFO: renamed from: i */
    public final tjo f167375i = jnv0.f114206a;

    /* JADX INFO: renamed from: t */
    public final xiz f167376t = axf1.m27398m(new mnv0(this, 0), phv0.f177733Q0, duu0.f53281P0, null, new mnv0(this, 1), 8);

    /* JADX INFO: renamed from: X */
    public final i5x f167365X = mhf1.m61771p(this).m94133b(oxu0.f171583W0, oxu0.f171585X0);

    public onv0(pgo pgoVar, InterfaceC2609yd interfaceC2609yd, uvc uvcVar, tw60 tw60Var, m9p0 m9p0Var, k5m0 k5m0Var, aj2 aj2Var) {
        this.f167367a = pgoVar;
        this.f167368b = interfaceC2609yd;
        this.f167369c = uvcVar;
        this.f167370d = tw60Var;
        this.f167371e = k5m0Var;
        this.f167372f = aj2Var;
        this.f167373g = m9p0Var.m61227a();
        fyf fyfVar = new fyf(new wzt0(this, 29), true, -622545164);
        wpi0 wpi0Var = xwt.f266743a;
        this.f167366Y = new cph(fyfVar, 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: f */
    public static final Object m67422f(onv0 onv0Var, String str, ibk ibkVar) {
        nnv0 nnv0Var;
        Object value;
        b0r0 b0r0VarM27853a;
        Object value2;
        b0r0 b0r0VarM27853a2;
        zv41 zv41Var = onv0Var.f167374h;
        if (ibkVar instanceof nnv0) {
            nnv0Var = (nnv0) ibkVar;
            int i = nnv0Var.f156498d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nnv0Var.f156498d = i - Integer.MIN_VALUE;
            } else {
                nnv0Var = new nnv0(onv0Var, ibkVar);
            }
        } else {
            nnv0Var = new nnv0(onv0Var, ibkVar);
        }
        Object objM84053a = nnv0Var.f156496b;
        int i2 = nnv0Var.f156498d;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 == 0) {
            bga.m29073P(objM84053a);
            if (wj50.m88271j(((b0r0) zv41Var.getValue()).f22087a, str)) {
                if (onv0Var.f167368b.mo76361c()) {
                    onv0Var.m67423g();
                    k5m0.m55541i(onv0Var.f167371e, xoc1.f264109i6.f243453a, null, ikc0.m50936h("martini-open-with-keyboard", true), false, 10);
                    return w2a1Var;
                }
                do {
                    value = zv41Var.getValue();
                    b0r0VarM27853a = (b0r0) value;
                    if (wj50.m88271j(b0r0VarM27853a.f22087a, str)) {
                        b0r0VarM27853a = b0r0.m27853a(b0r0VarM27853a, false, true, 3);
                    }
                } while (!zv41Var.m97089k(value, b0r0VarM27853a));
                if (wj50.m88271j(b0r0VarM27853a.f22087a, str) && b0r0VarM27853a.f22089c) {
                    uvc uvcVar = onv0Var.f167369c;
                    nnv0Var.f156495a = str;
                    nnv0Var.f156498d = 1;
                    objM84053a = uvcVar.m84053a(null, nnv0Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM84053a == yukVar) {
                        return yukVar;
                    }
                }
            }
            return w2a1Var;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = nnv0Var.f156495a;
        bga.m29073P(objM84053a);
        boolean z = objM84053a instanceof wvc;
        if (!z) {
            ck2 ck2Var = (ck2) onv0Var.f167372f;
            if (ck2Var.f38778q.f158717a.getValue() instanceof syc) {
                ck2Var.m33047C();
            }
        }
        do {
            value2 = zv41Var.getValue();
            b0r0VarM27853a2 = (b0r0) value2;
            if (wj50.m88271j(b0r0VarM27853a2.f22087a, str) && b0r0VarM27853a2.f22089c) {
                b0r0VarM27853a2 = b0r0.m27853a(b0r0VarM27853a2, b0r0VarM27853a2.f22088b || !z, false, 1);
            }
        } while (!zv41Var.m97089k(value2, b0r0VarM27853a2));
        return w2a1Var;
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f167365X;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f167366Y;
    }

    @Override // p204p.izd1
    /* JADX INFO: renamed from: e */
    public final pgo mo24649e() {
        return this.f167367a;
    }

    /* JADX INFO: renamed from: g */
    public final void m67423g() {
        zv41 zv41Var;
        Object value;
        do {
            zv41Var = this.f167374h;
            value = zv41Var.getValue();
        } while (!zv41Var.m97089k(value, b0r0.m27853a((b0r0) value, false, false, 1)));
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f167376t;
    }

    @Override // p204p.izd1
    public final mko getData() {
        return this.f167375i;
    }

    /* JADX INFO: renamed from: h */
    public final void m67424h(String str, boolean z) {
        zv41 zv41Var;
        Object value;
        b0r0 b0r0Var;
        do {
            zv41Var = this.f167374h;
            value = zv41Var.getValue();
            b0r0Var = (b0r0) value;
            if (z || !wj50.m88271j(b0r0Var.f22087a, str)) {
                b0r0Var = new b0r0(str, 6);
            }
        } while (!zv41Var.m97089k(value, b0r0Var));
    }
}
