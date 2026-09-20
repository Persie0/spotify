package p204p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes10.dex */
public final class io2 {

    /* JADX INFO: renamed from: a */
    public final co2 f104100a;

    /* JADX INFO: renamed from: b */
    public final g5t0 f104101b;

    /* JADX INFO: renamed from: c */
    public final xre f104102c;

    /* JADX INFO: renamed from: d */
    public final luk f104103d;

    public io2(co2 co2Var, g5t0 g5t0Var, xre xreVar, luk lukVar) {
        this.f104100a = co2Var;
        this.f104101b = g5t0Var;
        this.f104102c = xreVar;
        this.f104103d = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m51144a(io2 io2Var, ibk ibkVar) {
        ho2 ho2Var;
        if (ibkVar instanceof ho2) {
            ho2Var = (ho2) ibkVar;
            int i = ho2Var.f93431c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ho2Var.f93431c = i - Integer.MIN_VALUE;
            } else {
                ho2Var = new ho2(io2Var, ibkVar);
            }
        } else {
            ho2Var = new ho2(io2Var, ibkVar);
        }
        Object objM33480a = ho2Var.f93429a;
        int i2 = ho2Var.f93431c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM33480a);
                co2 co2Var = io2Var.f104100a;
                ho2Var.f93431c = 1;
                objM33480a = co2Var.m33480a(ho2Var);
                yuk yukVar = yuk.f276404a;
                if (objM33480a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM33480a);
            }
            gk2 gk2Var = ((yo2) objM33480a).f274538a;
            return gk2Var == null ? ao2.f17544a : io2Var.m51145b(gk2Var);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final bo2 m51145b(gk2 gk2Var) {
        Long lM29808s0 = bm51.m29808s0(10, gk2Var.f80682b);
        String str = gk2Var.f80681a;
        boolean zM88271j = wj50.m88271j(str, "ONLINE_STATE_ONLINE");
        ao2 ao2Var = ao2.f17544a;
        if (!zM88271j) {
            return wj50.m88271j(str, "ONLINE_STATE_OFFLINE") ? new yn2(lM29808s0) : ao2Var;
        }
        if (lM29808s0 == null) {
            return ao2Var;
        }
        long jLongValue = lM29808s0.longValue();
        return fr0.m42463g((wy3) this.f104102c, jLongValue) > 300000 ? new yn2(Long.valueOf(jLongValue)) : new zn2(jLongValue);
    }
}
