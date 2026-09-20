package p204p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes11.dex */
public final class ac10 {

    /* JADX INFO: renamed from: a */
    public final epx f14226a;

    public ac10(epx epxVar) {
        this.f14226a = epxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m25412a(String str, ibk ibkVar) {
        yb10 yb10Var;
        if (ibkVar instanceof yb10) {
            yb10Var = (yb10) ibkVar;
            int i = yb10Var.f271046d;
            if ((i & Integer.MIN_VALUE) != 0) {
                yb10Var.f271046d = i - Integer.MIN_VALUE;
            } else {
                yb10Var = new yb10(this, ibkVar);
            }
        } else {
            yb10Var = new yb10(this, ibkVar);
        }
        Object objM76981v = yb10Var.f271044b;
        int i2 = yb10Var.f271046d;
        kx81 kx81Var = kx81.f127361a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76981v);
                if (str.length() == 0) {
                    Logger.m3973i("GetTraitsMetadataUseCase received an empty Uri.", new Object[0]);
                    return kx81Var;
                }
                C1668ai c1668ai = new C1668ai("npv-widget", false, (gh00) new lpx(str, 29));
                long j = bc10.f25749a;
                dmx dmxVar = new dmx(this, c1668ai, (fbk) null, 22);
                yb10Var.f271043a = str;
                yb10Var.f271046d = 1;
                objM76981v = s1h1.m76981v(j, dmxVar, yb10Var);
                yuk yukVar = yuk.f276404a;
                if (objM76981v == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = yb10Var.f271043a;
                bga.m29073P(objM76981v);
            }
            gqx gqxVar = (gqx) objM76981v;
            if (gqxVar == null) {
                Logger.m3973i("Extended metadata request timed out.", new Object[0]);
                return kx81Var;
            }
            v140 v140Var = (v140) gqxVar.mo45449a(v140.class, str).f72301b;
            erc1 erc1Var = (erc1) gqxVar.mo45449a(erc1.class, str).f72301b;
            byv byvVar = (byv) gqxVar.mo45449a(byv.class, str).f72301b;
            if (v140Var != null && erc1Var != null && byvVar != null) {
                return new lx81(v140Var, erc1Var, byvVar);
            }
            return kx81Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3974j(e2, "Failed to fetch extended metadata for npv widget.", new Object[0]);
            return kx81Var;
        }
    }
}
