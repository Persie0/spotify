package p204p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes2.dex */
public final class bqn0 implements yf10 {

    /* JADX INFO: renamed from: b */
    public static final fv31 f29856b;

    /* JADX INFO: renamed from: c */
    public static final fv31 f29857c;

    /* JADX INFO: renamed from: a */
    public final Single f29858a;

    static {
        si5 si5Var = fv31.f73628b;
        f29856b = si5Var.m78183U("glasses_account_linking_nudge_dismissed");
        f29857c = si5Var.m78183U("glasses_education_dismissed");
    }

    public bqn0(Single single) {
        this.f29858a = single;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.yf10
    /* JADX INFO: renamed from: a */
    public final Object mo30269a(fbk fbkVar) {
        ypn0 ypn0Var;
        if (fbkVar instanceof ypn0) {
            ypn0Var = (ypn0) fbkVar;
            int i = ypn0Var.f274994c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ypn0Var.f274994c = i - Integer.MIN_VALUE;
            } else {
                ypn0Var = new ypn0(this, (ibk) fbkVar);
            }
        } else {
            ypn0Var = new ypn0(this, (ibk) fbkVar);
        }
        Object objM96567o = ypn0Var.f274992a;
        int i2 = ypn0Var.f274994c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            ypn0Var.f274994c = 1;
            objM96567o = zn91.m96567o(this.f29858a, ypn0Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        lv31 lv31VarEdit = ((hv31) objM96567o).edit();
        lv31VarEdit.m60048a(f29856b, true);
        lv31VarEdit.m60054g();
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.yf10
    /* JADX INFO: renamed from: b */
    public final Object mo30270b(fbk fbkVar) {
        xpn0 xpn0Var;
        if (fbkVar instanceof xpn0) {
            xpn0Var = (xpn0) fbkVar;
            int i = xpn0Var.f264690c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xpn0Var.f264690c = i - Integer.MIN_VALUE;
            } else {
                xpn0Var = new xpn0(this, (ibk) fbkVar);
            }
        } else {
            xpn0Var = new xpn0(this, (ibk) fbkVar);
        }
        Object objM96567o = xpn0Var.f264688a;
        int i2 = xpn0Var.f264690c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            xpn0Var.f264690c = 1;
            objM96567o = zn91.m96567o(this.f29858a, xpn0Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        lv31 lv31VarEdit = ((hv31) objM96567o).edit();
        lv31VarEdit.m60048a(f29857c, true);
        lv31VarEdit.m60054g();
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.yf10
    /* JADX INFO: renamed from: c */
    public final Object mo30271c(fbk fbkVar) {
        zpn0 zpn0Var;
        if (fbkVar instanceof zpn0) {
            zpn0Var = (zpn0) fbkVar;
            int i = zpn0Var.f285190c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zpn0Var.f285190c = i - Integer.MIN_VALUE;
            } else {
                zpn0Var = new zpn0(this, (ibk) fbkVar);
            }
        } else {
            zpn0Var = new zpn0(this, (ibk) fbkVar);
        }
        Object objM96567o = zpn0Var.f285188a;
        int i2 = zpn0Var.f285190c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            zpn0Var.f285190c = 1;
            objM96567o = zn91.m96567o(this.f29858a, zpn0Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        return qyg1.m74178H(((hv31) objM96567o).mo48713h(f29857c, false));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.yf10
    /* JADX INFO: renamed from: d */
    public final Object mo30272d(fbk fbkVar) {
        aqn0 aqn0Var;
        if (fbkVar instanceof aqn0) {
            aqn0Var = (aqn0) fbkVar;
            int i = aqn0Var.f18744c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aqn0Var.f18744c = i - Integer.MIN_VALUE;
            } else {
                aqn0Var = new aqn0(this, (ibk) fbkVar);
            }
        } else {
            aqn0Var = new aqn0(this, (ibk) fbkVar);
        }
        Object objM96567o = aqn0Var.f18742a;
        int i2 = aqn0Var.f18744c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            aqn0Var.f18744c = 1;
            objM96567o = zn91.m96567o(this.f29858a, aqn0Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        return qyg1.m74178H(((hv31) objM96567o).mo48713h(f29856b, false));
    }
}
