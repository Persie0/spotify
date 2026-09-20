package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class k8n0 {

    /* JADX INFO: renamed from: a */
    public final dm0 f120393a;

    /* JADX INFO: renamed from: b */
    public final ucj0 f120394b;

    /* JADX INFO: renamed from: c */
    public final em4 f120395c;

    public k8n0(dm0 dm0Var, ucj0 ucj0Var, em4 em4Var) {
        this.f120393a = dm0Var;
        this.f120394b = ucj0Var;
        this.f120395c = em4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        if (r12 == r5) goto L28;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m55752a(long j, String str, ibk ibkVar) {
        j8n0 j8n0Var;
        if (ibkVar instanceof j8n0) {
            j8n0Var = (j8n0) ibkVar;
            int i = j8n0Var.f109975e;
            if ((i & Integer.MIN_VALUE) != 0) {
                j8n0Var.f109975e = i - Integer.MIN_VALUE;
            } else {
                j8n0Var = new j8n0(this, ibkVar);
            }
        } else {
            j8n0Var = new j8n0(this, ibkVar);
        }
        Object objM82783k = j8n0Var.f109973c;
        int i2 = j8n0Var.f109975e;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM82783k);
            if (this.f120395c.m39401a()) {
                Set set = dd41.f47702f;
                if (r46.m74726U(str).f47709c == gn80.SHOW_EPISODE) {
                    j8n0Var.f109971a = str;
                    j8n0Var.f109972b = j;
                    j8n0Var.f109975e = 1;
                    objM82783k = this.f120394b.m82783k(str, j8n0Var);
                    if (objM82783k != yukVar) {
                    }
                    return yukVar;
                }
            }
            return null;
        }
        if (i2 == 1) {
            j = j8n0Var.f109972b;
            str = j8n0Var.f109971a;
            bga.m29073P(objM82783k);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM82783k);
        }
        hjc0 hjc0Var = (hjc0) objM82783k;
        fjc0 fjc0Var = hjc0Var instanceof fjc0 ? (fjc0) hjc0Var : null;
        if (fjc0Var != null) {
            int i3 = fjc0Var.f70159a;
            hvi0 hvi0Var = cks.f39079b;
            return new Long(cks.m33199r(jwg1.m54449D(i3, ils.MILLISECONDS), ils.SECONDS));
        }
        return null;
        if (((Boolean) objM82783k).booleanValue()) {
            hvi0 hvi0Var2 = cks.f39079b;
            int iM33187f = (int) cks.m33187f(jwg1.m54450E(j, ils.SECONDS));
            j8n0Var.f109971a = null;
            j8n0Var.f109972b = j;
            j8n0Var.f109975e = 2;
            objM82783k = ((fm0) this.f120393a).m42041c(str, iM33187f, (12 & 8) != 0 ? vpl.f243722a : vpl.f243723b, j8n0Var);
        }
        return null;
    }
}
