package p204p;

import io.reactivex.rxjava3.core.Completable;

/* JADX INFO: loaded from: classes8.dex */
public final class e541 {

    /* JADX INFO: renamed from: a */
    public final lz31 f56280a;

    /* JADX INFO: renamed from: b */
    public final vmz f56281b;

    /* JADX INFO: renamed from: c */
    public final twx0 f56282c;

    public e541(lz31 lz31Var, vmz vmzVar, twx0 twx0Var) {
        this.f56280a = lz31Var;
        this.f56281b = vmzVar;
        this.f56282c = twx0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m37807a(boolean z, ibk ibkVar) {
        c541 c541Var;
        if (ibkVar instanceof c541) {
            c541Var = (c541) ibkVar;
            int i = c541Var.f34087c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c541Var.f34087c = i - Integer.MIN_VALUE;
            } else {
                c541Var = new c541(this, ibkVar);
            }
        } else {
            c541Var = new c541(this, ibkVar);
        }
        Object obj = c541Var.f34085a;
        int i2 = c541Var.f34087c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                Completable completableM81762b = this.f56282c.m81762b("speed-control", z ? "1" : "0");
                c541Var.f34087c = 1;
                Object objM96565n = zn91.m96565n(completableM81762b, c541Var);
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
