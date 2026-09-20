package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xaa0 extends lg01 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f259633a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f259634b;

    /* JADX INFO: renamed from: c */
    public final Object f259635c;

    /* JADX INFO: renamed from: d */
    public final fiz f259636d;

    public xaa0(String str, xj0 xj0Var) {
        this.f259634b = str;
        this.f259635c = xj0Var;
        this.f259636d = mvl0.m62953p(new ad01(xj0Var.f261980d, new C2199o2(this, 10), 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m90285a(int i, ibk ibkVar) {
        waa0 waa0Var;
        String str;
        if (ibkVar instanceof waa0) {
            waa0Var = (waa0) ibkVar;
            int i2 = waa0Var.f249428d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                waa0Var.f249428d = i2 - Integer.MIN_VALUE;
            } else {
                waa0Var = new waa0(this, ibkVar);
            }
        } else {
            waa0Var = new waa0(this, ibkVar);
        }
        Object objM30767c = waa0Var.f249426b;
        int i3 = waa0Var.f249428d;
        if (i3 == 0) {
            bga.m29073P(objM30767c);
            y5p y5pVarM77300j = ((s5p) ((voi) this.f259634b)).m77300j();
            if (y5pVarM77300j == null || (str = y5pVarM77300j.f269508a) == null) {
                return new dd01(0, null);
            }
            bx91 bx91Var = (bx91) this.f259635c;
            waa0Var.f249425a = i;
            waa0Var.f249428d = 1;
            objM30767c = bx91Var.m30767c(i, str, waa0Var);
            yuk yukVar = yuk.f276404a;
            if (objM30767c == yukVar) {
                return yukVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = waa0Var.f249425a;
            bga.m29073P(objM30767c);
        }
        return ((Boolean) objM30767c).booleanValue() ? new ed01(new Integer(i)) : new dd01(0, null);
    }

    @Override // p204p.lg01
    public final fiz getValue() {
        switch (this.f259633a) {
            case 0:
                return (nnc) this.f259636d;
            default:
                return this.f259636d;
        }
    }

    @Override // p204p.lg01
    public final Object setValue(Object obj, Object obj2, d850 d850Var, fbk fbkVar) {
        switch (this.f259633a) {
            case 0:
                return m90285a(((Number) obj2).intValue(), (ibk) fbkVar);
            default:
                xj0 xj0Var = (xj0) this.f259635c;
                String str = (String) this.f259634b;
                xj0Var.getClass();
                n5q n5qVar = xsr.f265651a;
                return x0h1.m89557A(tlp.f221498c, new wj0((vj0) obj2, str, xj0Var, (fbk) null, 0), fbkVar);
        }
    }

    public xaa0(voi voiVar, bx91 bx91Var) {
        this.f259634b = voiVar;
        this.f259635c = bx91Var;
        this.f259636d = xtm0.m92074U(k0e1.m54985d(((s5p) voiVar).m77301k()), new x1w((fbk) null, this, 26));
    }
}
