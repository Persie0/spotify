package p204p;

import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes.dex */
public abstract class hmy0 {

    /* JADX INFO: renamed from: a */
    public static final u9y0 f93098a = new u9y0(10);

    /* JADX INFO: renamed from: b */
    public static final fmy0 f93099b = new fmy0();

    /* JADX INFO: renamed from: c */
    public static final emy0 f93100c = new emy0();

    /* JADX INFO: renamed from: d */
    public static final yom0 f93101d = new yom0(1);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m47996a(nny0 nny0Var, long j, ibk ibkVar) {
        gmy0 gmy0Var;
        olv0 olv0Var;
        nny0 nny0Var2;
        if (ibkVar instanceof gmy0) {
            gmy0Var = (gmy0) ibkVar;
            int i = gmy0Var.f81504d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gmy0Var.f81504d = i - Integer.MIN_VALUE;
            } else {
                gmy0Var = new gmy0(ibkVar);
            }
        } else {
            gmy0Var = new gmy0(ibkVar);
        }
        Object obj = gmy0Var.f81503c;
        int i2 = gmy0Var.f81504d;
        if (i2 == 0) {
            bga.m29073P(obj);
            olv0Var = new olv0();
            C2004j6 c2004j6 = new C2004j6(nny0Var, j, olv0Var, (fbk) null, 14);
            gmy0Var.f81501a = nny0Var;
            gmy0Var.f81502b = olv0Var;
            gmy0Var.f81504d = 1;
            Object objM65224f = nny0Var.m65224f(xqi0.f265055a, c2004j6, gmy0Var);
            yuk yukVar = yuk.f276404a;
            if (objM65224f == yukVar) {
                return yukVar;
            }
            nny0Var2 = nny0Var;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            olv0 olv0Var2 = gmy0Var.f81502b;
            nny0 nny0Var3 = gmy0Var.f81501a;
            bga.m29073P(obj);
            olv0Var = olv0Var2;
            nny0Var2 = nny0Var3;
        }
        return new Offset(nny0Var2.m65226h(olv0Var.f166933a));
    }

    /* JADX INFO: renamed from: b */
    public static fxh0 m47997b(fxh0 fxh0Var, omy0 omy0Var, vvl0 vvl0Var, qhu0 qhu0Var, boolean z, boolean z2, voi0 voi0Var, int i) {
        if ((i & 8) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        if ((i & 64) != 0) {
            voi0Var = null;
        }
        return fxh0Var.mo34315F(new dmy0(omy0Var, vvl0Var, qhu0Var, z3, z4, voi0Var));
    }
}
