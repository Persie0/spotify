package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ssc1 extends d1y {

    /* JADX INFO: renamed from: c */
    public final psc1 f213571c;

    public ssc1(psc1 psc1Var) {
        this.f213571c = psc1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.d1y
    /* JADX INFO: renamed from: a */
    public final Object mo34674a(ibk ibkVar) {
        qsc1 qsc1Var;
        Object objM70773b;
        if (ibkVar instanceof qsc1) {
            qsc1Var = (qsc1) ibkVar;
            int i = qsc1Var.f192072c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qsc1Var.f192072c = i - Integer.MIN_VALUE;
            } else {
                qsc1Var = new qsc1(this, ibkVar);
            }
        } else {
            qsc1Var = new qsc1(this, ibkVar);
        }
        Object obj = qsc1Var.f192070a;
        int i2 = qsc1Var.f192072c;
        if (i2 == 0) {
            bga.m29073P(obj);
            qsc1Var.f192072c = 1;
            objM70773b = this.f213571c.m70773b(qsc1Var);
            Object obj2 = yuk.f276404a;
            if (objM70773b == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            objM70773b = ((s6x0) obj).f206218a;
        }
        boolean z = objM70773b instanceof c6x0;
        if (z) {
            return new dd01(0, null);
        }
        if (z) {
            objM70773b = null;
        }
        Boolean bool = (Boolean) objM70773b;
        return new ed01(Boolean.valueOf(bool != null ? bool.booleanValue() : false));
    }

    @Override // p204p.d1y
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo34675c(Object obj, Object obj2, d850 d850Var, c1y c1yVar) {
        return m79196d(((Boolean) obj2).booleanValue(), c1yVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m79196d(boolean z, ibk ibkVar) {
        rsc1 rsc1Var;
        Object objM70774c;
        if (ibkVar instanceof rsc1) {
            rsc1Var = (rsc1) ibkVar;
            int i = rsc1Var.f202288d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rsc1Var.f202288d = i - Integer.MIN_VALUE;
            } else {
                rsc1Var = new rsc1(this, ibkVar);
            }
        } else {
            rsc1Var = new rsc1(this, ibkVar);
        }
        Object obj = rsc1Var.f202286b;
        int i2 = rsc1Var.f202288d;
        boolean zBooleanValue = true;
        if (i2 == 0) {
            bga.m29073P(obj);
            rsc1Var.f202285a = z;
            rsc1Var.f202288d = 1;
            objM70774c = this.f213571c.m70774c(z, rsc1Var);
            Object obj2 = yuk.f276404a;
            if (objM70774c == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = rsc1Var.f202285a;
            bga.m29073P(obj);
            objM70774c = ((s6x0) obj).f206218a;
        }
        boolean z2 = objM70774c instanceof c6x0;
        if (z2) {
            return new dd01(0, null);
        }
        if (z2) {
            objM70774c = null;
        }
        Boolean bool = (Boolean) objM70774c;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else if (!z) {
            zBooleanValue = false;
        }
        return new ed01(Boolean.valueOf(zBooleanValue));
    }
}
