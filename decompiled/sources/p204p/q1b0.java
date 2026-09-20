package p204p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes8.dex */
public final class q1b0 {

    /* JADX INFO: renamed from: a */
    public final f1b0 f184281a;

    /* JADX INFO: renamed from: b */
    public final uw00 f184282b;

    public q1b0(f1b0 f1b0Var, uw00 uw00Var) {
        this.f184281a = f1b0Var;
        this.f184282b = uw00Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m71919a(voc1 voc1Var, d850 d850Var, ibk ibkVar) {
        p1b0 p1b0Var;
        if (ibkVar instanceof p1b0) {
            p1b0Var = (p1b0) ibkVar;
            int i = p1b0Var.f173027e;
            if ((i & Integer.MIN_VALUE) != 0) {
                p1b0Var.f173027e = i - Integer.MIN_VALUE;
            } else {
                p1b0Var = new p1b0(this, ibkVar);
            }
        } else {
            p1b0Var = new p1b0(this, ibkVar);
        }
        Object objM96567o = p1b0Var.f173025c;
        int i2 = p1b0Var.f173027e;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            Single singleM84079a = this.f184282b.m84079a();
            p1b0Var.f173023a = voc1Var;
            p1b0Var.f173024b = d850Var;
            p1b0Var.f173027e = 1;
            objM96567o = zn91.m96567o(singleM84079a, p1b0Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d850Var = p1b0Var.f173024b;
            voc1Var = p1b0Var.f173023a;
            bga.m29073P(objM96567o);
        }
        d850 d850Var2 = d850Var;
        if (((Boolean) objM96567o).booleanValue()) {
            uw00.m84078d(this.f184282b, voc1Var.f243453a, d850Var2, null, new t690(this, 29), 8);
        } else {
            this.f184281a.m40532a(sh7.f209129d);
        }
        return w2a1.f247311a;
    }
}
