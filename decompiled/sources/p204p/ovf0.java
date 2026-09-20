package p204p;

import io.reactivex.rxjava3.core.Completable;

/* JADX INFO: loaded from: classes9.dex */
public final class ovf0 {

    /* JADX INFO: renamed from: a */
    public final fjf0 f170491a;

    /* JADX INFO: renamed from: b */
    public final vmz f170492b;

    /* JADX INFO: renamed from: c */
    public final twx0 f170493c;

    public ovf0(fjf0 fjf0Var, vmz vmzVar, twx0 twx0Var) {
        this.f170491a = fjf0Var;
        this.f170492b = vmzVar;
        this.f170493c = twx0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m68128a(boolean z, ibk ibkVar) {
        mvf0 mvf0Var;
        if (ibkVar instanceof mvf0) {
            mvf0Var = (mvf0) ibkVar;
            int i = mvf0Var.f147575c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mvf0Var.f147575c = i - Integer.MIN_VALUE;
            } else {
                mvf0Var = new mvf0(this, ibkVar);
            }
        } else {
            mvf0Var = new mvf0(this, ibkVar);
        }
        Object obj = mvf0Var.f147573a;
        int i2 = mvf0Var.f147575c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                Completable completableM81762b = this.f170493c.m81762b("mixing-fx-looping-jogwheel", z ? "1" : "0");
                mvf0Var.f147575c = 1;
                Object objM96565n = zn91.m96565n(completableM81762b, mvf0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96565n == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        } catch (Throwable unused) {
        }
        return w2a1.f247311a;
    }
}
