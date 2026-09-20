package p204p;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class fse0 {

    /* JADX INFO: renamed from: a */
    public final z9j0 f72837a;

    /* JADX INFO: renamed from: b */
    public final qse0 f72838b;

    public fse0(z9j0 z9j0Var, qse0 qse0Var) {
        this.f72837a = z9j0Var;
        this.f72838b = qse0Var;
    }

    /* JADX INFO: renamed from: b */
    public static Object m42556b(fse0 fse0Var, String str, dse0 dse0Var, Bundle bundle, fbk fbkVar, int i) {
        if ((i & 16) != 0) {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        fse0Var.getClass();
        return fse0Var.m42557a(str, null, dse0Var, new ase0(new wre0(false), tre0.f223055a), bundle2, fbkVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m42557a(String str, d850 d850Var, dse0 dse0Var, ase0 ase0Var, Bundle bundle, fbk fbkVar) {
        ese0 ese0Var;
        pte0 pte0Var;
        if (fbkVar instanceof ese0) {
            ese0Var = (ese0) fbkVar;
            int i = ese0Var.f62350g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ese0Var.f62350g = i - Integer.MIN_VALUE;
            } else {
                ese0Var = new ese0(this, fbkVar);
            }
        } else {
            ese0Var = new ese0(this, fbkVar);
        }
        Object objM36852d = ese0Var.f62348e;
        int i2 = ese0Var.f62350g;
        if (i2 == 0) {
            bga.m29073P(objM36852d);
            if (dse0Var instanceof cse0) {
                pte0Var = lte0.f136766a;
            } else {
                if (!(dse0Var instanceof bse0)) {
                    throw new NoWhenBranchMatchedException();
                }
                pte0Var = kte0.f126252a;
            }
            ese0Var.f62344a = str;
            ese0Var.f62345b = d850Var;
            ese0Var.f62346c = ase0Var;
            ese0Var.f62347d = bundle;
            ese0Var.f62350g = 1;
            objM36852d = ((dte0) this.f72838b).m36852d(pte0Var, ase0Var, ese0Var);
            yuk yukVar = yuk.f276404a;
            if (objM36852d == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bundle = ese0Var.f62347d;
            ase0Var = ese0Var.f62346c;
            d850Var = ese0Var.f62345b;
            str = ese0Var.f62344a;
            bga.m29073P(objM36852d);
        }
        boolean zBooleanValue = ((Boolean) objM36852d).booleanValue();
        if (zBooleanValue) {
            he90 he90VarM47528g = hhg1.m47528g(str);
            he90VarM47528g.m47295y(d850Var);
            he90VarM47528g.m47279i(pp91.m70529j(pft0.m69840u("message_metadata", ase0Var)));
            this.f72837a.mo47348i(he90VarM47528g.m47272b(), bundle);
        }
        return qyg1.m74178H(zBooleanValue);
    }
}
