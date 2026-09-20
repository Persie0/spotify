package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jqd0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f114892a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pdp0 f114893b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f114894c;

    public /* synthetic */ jqd0(pdp0 pdp0Var, int i, int i2) {
        this.f114892a = i2;
        this.f114893b = pdp0Var;
        this.f114894c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f114892a) {
            case 0:
                pdp0 pdp0Var = this.f114893b;
                if (pdp0Var.mo43865W(25) || pdp0Var.mo43865W(33)) {
                    boolean zMo43865W = pdp0Var.mo43865W(33);
                    int i = this.f114894c;
                    if (!zMo43865W) {
                        pdp0Var.mo43862U0(i);
                    } else {
                        pdp0Var.mo43915x0(i, 1);
                    }
                }
                break;
            default:
                pdp0 pdp0Var2 = this.f114893b;
                if (pdp0Var2.mo43865W(26) || pdp0Var2.mo43865W(34)) {
                    int i2 = this.f114894c;
                    if (i2 == -100) {
                        if (!pdp0Var2.mo43865W(34)) {
                            pdp0Var2.mo43867X(true);
                        } else {
                            pdp0Var2.mo43918z(1, true);
                        }
                    } else if (i2 == -1) {
                        if (!pdp0Var2.mo43865W(34)) {
                            pdp0Var2.mo43825A();
                        } else {
                            pdp0Var2.mo43856R(1);
                        }
                    } else if (i2 == 1) {
                        if (!pdp0Var2.mo43865W(34)) {
                            pdp0Var2.mo43880d0();
                        } else {
                            pdp0Var2.mo43827B(1);
                        }
                    } else if (i2 == 100) {
                        if (!pdp0Var2.mo43865W(34)) {
                            pdp0Var2.mo43867X(false);
                        } else {
                            pdp0Var2.mo43918z(1, false);
                        }
                    } else if (i2 != 101) {
                        ei6.m39077n(i2, "onAdjustVolume: Ignoring unknown direction: ");
                    } else if (!pdp0Var2.mo43865W(34)) {
                        pdp0Var2.mo43867X(!pdp0Var2.m69698g1());
                    } else {
                        pdp0Var2.mo43918z(1, !pdp0Var2.m69698g1());
                    }
                }
                break;
        }
    }
}
