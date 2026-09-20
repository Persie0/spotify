package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xj81 {

    /* JADX INFO: renamed from: a */
    public final epx f262070a;

    public xj81(epx epxVar) {
        this.f262070a = epxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public final Object m91209a(String str, String str2, ibk ibkVar, boolean z) {
        wj81 wj81Var;
        List list;
        if (ibkVar instanceof wj81) {
            wj81Var = (wj81) ibkVar;
            int i = wj81Var.f251909e;
            if ((i & Integer.MIN_VALUE) != 0) {
                wj81Var.f251909e = i - Integer.MIN_VALUE;
            } else {
                wj81Var = new wj81(this, ibkVar);
            }
        } else {
            wj81Var = new wj81(this, ibkVar);
        }
        Object objM86756u = wj81Var.f251907c;
        int i2 = wj81Var.f251909e;
        try {
            if (i2 == 0) {
                bga.m29073P(objM86756u);
                if (str.length() == 0) {
                    return new t8f0(new q8f0("Entity URI cannot be empty"));
                }
                yab yabVarM54985d = k0e1.m54985d(((jpx) this.f262070a).m53978b(new C1668ai(str2, new cj1(str, z, 25))));
                ro01 ro01Var = new ro01(18);
                wj81Var.f251905a = str;
                wj81Var.f251906b = z;
                wj81Var.f251909e = 1;
                objM86756u = vyf1.m86756u(yabVarM54985d, ro01Var, wj81Var);
                yuk yukVar = yuk.f276404a;
                if (objM86756u == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = wj81Var.f251906b;
                str = wj81Var.f251905a;
                bga.m29073P(objM86756u);
            }
            gqx gqxVar = (gqx) objM86756u;
            v140 v140Var = (v140) gqxVar.mo45449a(v140.class, str).f72301b;
            daj dajVar = (daj) gqxVar.mo45449a(daj.class, str).f72301b;
            if (v140Var == null) {
                return new t8f0(new s8f0("No IdentityTrait found for URI: ".concat(str)));
            }
            if (z && dajVar == null) {
                return new t8f0(new s8f0("No ConsumptionExperienceTrait found for URI: ".concat(str)));
            }
            String str3 = v140Var.f236243a;
            String strM43753y0 = g6f.m43753y0(v140Var.f236246d, ", ", null, null, ug81.f230028X, 30);
            if (dajVar == null || (list = dajVar.f47051b) == null) {
                list = lau.f131415a;
            }
            u140 u140Var = v140Var.f236247e;
            return new u8f0(new tj81(str3, list, strM43753y0, u140Var != null ? u140Var.f225678a : null));
        } catch (Exception e) {
            e.toString();
            return new t8f0(new r8f0(edb.m38564m("Failed to fetch metadata: ", e.getMessage())));
        }
    }
}
