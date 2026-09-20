package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class l401 {

    /* JADX INFO: renamed from: c */
    public static final j401 f129467c = new j401();

    /* JADX INFO: renamed from: d */
    public static final rgq0 f129468d = el51.m39346p(mzz0.f148840b, new pmw0(i401.f98382b), 12);

    /* JADX INFO: renamed from: a */
    public final z4y f129469a;

    /* JADX INFO: renamed from: b */
    public final rew0 f129470b;

    public l401(faz fazVar, juk jukVar, juk jukVar2, vaz vazVar) {
        fazVar.m41197a();
        Context context = fazVar.f67665a;
        a101 a101Var = a101.f11225a;
        kg5 kg5VarM24406a = a101.m24406a(fazVar);
        z4y z4yVar = new z4y(context);
        aaq0 aaq0Var = new aaq0(24, kg5VarM24406a, jukVar);
        f129467c.getClass();
        rew0 rew0Var = new rew0(vazVar, kg5VarM24406a, aaq0Var, (wko) f129468d.m75486a(context, j401.f108540a[0]));
        this.f129469a = z4yVar;
        this.f129470b = rew0Var;
    }

    /* JADX INFO: renamed from: a */
    public final double m58033a() {
        Double dM95404s = this.f129469a.m95404s();
        if (dM95404s != null) {
            double dDoubleValue = dM95404s.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        wxz0 wxz0Var = this.f129470b.m75417b().f45951b;
        if (wxz0Var == null) {
            wj50.m88260d0("sessionConfigs");
            throw null;
        }
        Double d = wxz0Var.f256162b;
        if (d != null) {
            double dDoubleValue2 = d.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m58034b(ibk ibkVar) {
        k401 k401Var;
        l401 l401Var;
        if (ibkVar instanceof k401) {
            k401Var = (k401) ibkVar;
            int i = k401Var.f119039d;
            if ((i & Integer.MIN_VALUE) != 0) {
                k401Var.f119039d = i - Integer.MIN_VALUE;
            } else {
                k401Var = new k401(this, ibkVar);
            }
        } else {
            k401Var = new k401(this, ibkVar);
        }
        Object obj = k401Var.f119037b;
        int i2 = k401Var.f119039d;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                l401Var = k401Var.f119036a;
                bga.m29073P(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        }
        bga.m29073P(obj);
        k401Var.f119036a = this;
        k401Var.f119039d = 1;
        this.f129469a.getClass();
        if (w2a1Var != yukVar) {
            l401Var = this;
        }
        rew0 rew0Var = l401Var.f129470b;
        k401Var.f119036a = null;
        k401Var.f119039d = 2;
        return rew0Var.m75418c(k401Var) == yukVar ? yukVar : w2a1Var;
    }
}
