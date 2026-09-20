package p204p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class grb0 {

    /* JADX INFO: renamed from: a */
    public final xmd0 f83711a;

    public grb0(xmd0 xmd0Var) {
        this.f83711a = xmd0Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m45478a(String str, String str2) {
        xmd0 xmd0Var = this.f83711a;
        List listMo24646b = xmd0Var.mo75119g().mo24646b();
        if (!listMo24646b.isEmpty()) {
            Iterator it = listMo24646b.iterator();
            while (it.hasNext()) {
                if (wl51.m88496t0(((ild0) it.next()).f103357a, str, false)) {
                    return true;
                }
            }
        }
        if (str2 == null) {
            return false;
        }
        List<ild0> listMo24646b2 = xmd0Var.mo75119g().mo24646b();
        if (listMo24646b2.isEmpty()) {
            return false;
        }
        for (ild0 ild0Var : listMo24646b2) {
            String str3 = ild0Var.f103357a;
            if (wj50.m88271j(ild0Var.f103358b, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m45479b(ibk ibkVar) {
        frb0 frb0Var;
        if (ibkVar instanceof frb0) {
            frb0Var = (frb0) ibkVar;
            int i = frb0Var.f72402c;
            if ((i & Integer.MIN_VALUE) != 0) {
                frb0Var.f72402c = i - Integer.MIN_VALUE;
            } else {
                frb0Var = new frb0(this, ibkVar);
            }
        } else {
            frb0Var = new frb0(this, ibkVar);
        }
        Object obj = frb0Var.f72400a;
        int i2 = frb0Var.f72402c;
        boolean z = true;
        if (i2 == 0) {
            bga.m29073P(obj);
            frb0Var.f72402c = 1;
            Object objM64619l = njg1.m64619l(200L, frb0Var);
            yuk yukVar = yuk.f276404a;
            if (objM64619l == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        List<ild0> listMo24646b = this.f83711a.mo75119g().mo24646b();
        if (listMo24646b.isEmpty()) {
            z = false;
        } else {
            for (ild0 ild0Var : listMo24646b) {
                String str = ild0Var.f103357a;
                if (ild0Var.f103360d == 2) {
                }
            }
            z = false;
        }
        return qyg1.m74178H(z);
    }
}
