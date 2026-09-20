package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class c1v implements r481 {

    /* JADX INFO: renamed from: a */
    public final t481 f33193a;

    /* JADX INFO: renamed from: b */
    public final qse0 f33194b;

    /* JADX INFO: renamed from: c */
    public final yum0 f33195c = sam.m77645B(null);

    public c1v(t481 t481Var, qse0 qse0Var) {
        this.f33193a = t481Var;
        this.f33194b = qse0Var;
    }

    @Override // p204p.r481
    /* JADX INFO: renamed from: a */
    public final oqi0 mo31275a() {
        return this.f33193a.f216938c;
    }

    @Override // p204p.r481
    /* JADX INFO: renamed from: b */
    public final void mo31276b() {
        this.f33193a.mo31276b();
    }

    @Override // p204p.r481
    /* JADX INFO: renamed from: c */
    public final Object mo31277c(xqi0 xqi0Var, ibk ibkVar) {
        return this.f33193a.mo31277c(xqi0Var, ibkVar);
    }

    /* JADX INFO: renamed from: d */
    public final ase0 m31278d() {
        Object value = this.f33195c.getValue();
        if (!this.f33193a.isVisible()) {
            value = null;
        }
        return (ase0) value;
    }

    @Override // p204p.r481
    public final void dismiss() {
        this.f33195c.setValue(null);
        this.f33193a.dismiss();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m31279e(yre0 yre0Var, xqi0 xqi0Var, ibk ibkVar) throws Throwable {
        b1v b1vVar;
        ase0 ase0Var;
        Boolean bool;
        if (ibkVar instanceof b1v) {
            b1vVar = (b1v) ibkVar;
            int i = b1vVar.f22421e;
            if ((i & Integer.MIN_VALUE) != 0) {
                b1vVar.f22421e = i - Integer.MIN_VALUE;
            } else {
                b1vVar = new b1v(this, ibkVar);
            }
        } else {
            b1vVar = new b1v(this, ibkVar);
        }
        Object obj = b1vVar.f22419c;
        int i2 = b1vVar.f22421e;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            ase0 ase0Var2 = new ase0(yre0Var, ure0.f233341a);
            qse0 qse0Var = this.f33194b;
            if (qse0Var == null) {
                ase0Var = ase0Var2;
                bool = null;
                if (!wj50.m88271j(bool, Boolean.FALSE)) {
                    this.f33195c.setValue(ase0Var);
                    b1vVar.f22417a = null;
                    b1vVar.f22418b = null;
                    b1vVar.f22421e = 2;
                    if (this.f33193a.mo31277c(xqi0Var, b1vVar) == yukVar) {
                    }
                }
                return w2a1Var;
            }
            b1vVar.f22417a = xqi0Var;
            b1vVar.f22418b = ase0Var2;
            b1vVar.f22421e = 1;
            Object objM36852d = ((dte0) qse0Var).m36852d(ote0.f169048a, ase0Var2, b1vVar);
            if (objM36852d != yukVar) {
                obj = objM36852d;
                ase0Var = ase0Var2;
            }
            return yukVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var;
        }
        ase0Var = b1vVar.f22418b;
        xqi0Var = b1vVar.f22417a;
        bga.m29073P(obj);
        bool = (Boolean) obj;
        if (!wj50.m88271j(bool, Boolean.FALSE)) {
            this.f33195c.setValue(ase0Var);
            b1vVar.f22417a = null;
            b1vVar.f22418b = null;
            b1vVar.f22421e = 2;
            if (this.f33193a.mo31277c(xqi0Var, b1vVar) == yukVar) {
                return yukVar;
            }
        }
        return w2a1Var;
    }

    @Override // p204p.r481
    public final boolean isVisible() {
        return this.f33193a.isVisible();
    }
}
