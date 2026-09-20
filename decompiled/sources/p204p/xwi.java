package p204p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: classes6.dex */
public final class xwi {

    /* JADX INFO: renamed from: a */
    public final voi f266688a;

    /* JADX INFO: renamed from: b */
    public final lwc1 f266689b;

    /* JADX INFO: renamed from: c */
    public final xip f266690c;

    public xwi(voi voiVar, lwc1 lwc1Var, xip xipVar) {
        this.f266688a = voiVar;
        this.f266689b = lwc1Var;
        this.f266690c = xipVar;
    }

    /* JADX INFO: renamed from: a */
    public final vmx0 m92285a() {
        s5p s5pVar = (s5p) this.f266688a;
        api apiVarM77296c = s5pVar.m77296c();
        int iMo26680B = 0;
        boolean zMo26685G = apiVarM77296c != null ? apiVarM77296c.mo26685G() : false;
        api apiVarM77296c2 = s5pVar.m77296c();
        if (apiVarM77296c2 != null && apiVarM77296c2.mo26685G() && (iMo26680B = apiVarM77296c2.mo26680B()) >= 24) {
            iMo26680B = 24;
        }
        api apiVarM77296c3 = s5pVar.m77296c();
        int iM72082M = -1;
        if (apiVarM77296c3 != null && apiVarM77296c3.mo26685G()) {
            double dMo44585d = this.f266689b.mo44585d();
            int iMo26680B2 = apiVarM77296c3.mo26680B();
            iM72082M = q3d0.m72082M(dMo44585d * ((double) (iMo26680B2 < 24 ? iMo26680B2 : 24)));
        }
        return new vmx0(iM72082M, iMo26680B, zMo26685G);
    }

    /* JADX INFO: renamed from: b */
    public final void m92286b(int i) {
        double dM63437n;
        api apiVarM77296c = ((s5p) this.f266688a).m77296c();
        if (apiVarM77296c == null || !apiVarM77296c.mo26685G()) {
            return;
        }
        String str = apiVarM77296c.mo26686H().f191320a;
        int iMo26680B = apiVarM77296c.mo26680B();
        if (iMo26680B >= 24) {
            iMo26680B = 24;
        }
        if (iMo26680B <= 0) {
            Logger.m3973i(s571.m77246e(iMo26680B, "Volume steps is lower or 0: "), new Object[0]);
            dM63437n = 0.0d;
        } else {
            dM63437n = ((double) n0e1.m63437n(i, 0, iMo26680B)) / ((double) iMo26680B);
        }
        double d = dM63437n;
        lwc1.m60116g(this.f266689b, d, "gos_volume_set", this.f266690c.m91154e((int) (((double) 100) * d), str), 8);
    }

    /* JADX INFO: renamed from: c */
    public final void m92287c(int i) {
        api apiVarM77296c = ((s5p) this.f266688a).m77296c();
        if (apiVarM77296c == null || !apiVarM77296c.mo26685G()) {
            return;
        }
        lwc1 lwc1Var = this.f266689b;
        xip xipVar = this.f266690c;
        if (i == -1) {
            String str = apiVarM77296c.mo26686H().f191320a;
            lwc1.m60114b(lwc1Var, "gos_volume_update", xipVar.m91152c(apiVarM77296c.mo26686H().f191320a), 4);
        } else {
            if (i != 1) {
                return;
            }
            String str2 = apiVarM77296c.mo26686H().f191320a;
            lwc1.m60115f(lwc1Var, "gos_volume_update", xipVar.m91153d(apiVarM77296c.mo26686H().f191320a), 4);
        }
    }
}
