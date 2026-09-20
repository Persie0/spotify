package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.voiceassistants.playermodels.VoiceAssistantsPerformance;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class y9r0 implements lhx0 {

    /* JADX INFO: renamed from: a */
    public final hmm0 f270636a;

    /* JADX INFO: renamed from: b */
    public final fp10 f270637b;

    public y9r0(am71 am71Var, String str, hmm0 hmm0Var) {
        this.f270636a = hmm0Var;
        this.f270637b = new fp10(am71Var, str);
    }

    @Override // p204p.lhx0
    /* JADX INFO: renamed from: a */
    public final Object mo42314a(String str, zmy zmyVar, nxs0 nxs0Var) {
        return this.f270637b.mo42314a(str, zmyVar, nxs0Var);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m93159b(int i) {
        Object c6x0Var;
        String str;
        Object c6x0Var2;
        w2a1 w2a1Var;
        fp10 fp10Var = this.f270637b;
        synchronized (fp10Var.f71688f) {
            try {
                if (fp10Var.f71686d) {
                    return false;
                }
                fp10Var.f71686d = true;
                if (i == 1 && fp10Var.f71684b) {
                    i = 2;
                }
                sr4 sr4Var = (sr4) fp10Var.f71691i;
                String str2 = (String) fp10Var.f71683a;
                if (str2 == null) {
                    str2 = "unresolved";
                }
                Iterator it = ((LinkedHashSet) fp10Var.f71690h).iterator();
                while (it.hasNext()) {
                    fp10Var.m42316c((String) it.next());
                }
                ((LinkedHashSet) fp10Var.f71690h).clear();
                if (!fp10Var.f71685c) {
                    fp10Var.f71685c = true;
                    if (sr4Var != null) {
                        try {
                            sr4Var.m79016f("preview_preparation");
                            w2a1Var = w2a1.f247311a;
                        } catch (Throwable th) {
                            c6x0Var2 = new c6x0(th);
                        }
                    } else {
                        w2a1Var = null;
                    }
                    c6x0Var2 = w2a1Var;
                    Throwable thM77348a = s6x0.m77348a(c6x0Var2);
                    if (thM77348a != null) {
                        Logger.m3967c(thM77348a, "Failed to end Rive performance preparation point", new Object[0]);
                    }
                }
                if (sr4Var != null) {
                    try {
                        sr4Var.m79013a("rive_file_url", str2);
                        if (i == 1) {
                            str = "success";
                        } else if (i == 2) {
                            str = "failure";
                        } else {
                            if (i != 3) {
                                throw null;
                            }
                            str = "cancelled";
                        }
                        sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, str);
                        ((rr4) ((am71) fp10Var.f71687e)).m76276b(sr4Var.m79015d());
                    } catch (Throwable th2) {
                        c6x0Var = new c6x0(th2);
                    }
                } else {
                    sr4Var = null;
                }
                c6x0Var = sr4Var;
                Throwable thM77348a2 = s6x0.m77348a(c6x0Var);
                if (thM77348a2 != null) {
                    Logger.m3967c(thM77348a2, "Failed to finish Rive performance measurement", new Object[0]);
                }
                this.f270636a.invoke(this);
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m93160c(zmy zmyVar, kix0 kix0Var) {
        return this.f270637b.m42317d("share_id_resolution", zmyVar, kix0Var);
    }

    /* JADX INFO: renamed from: d */
    public final void m93161d(String str) {
        fp10 fp10Var = this.f270637b;
        synchronized (fp10Var.f71688f) {
            if (!fp10Var.f71686d && ((String) fp10Var.f71683a) == null) {
                fp10Var.f71683a = dix0.m36138b(str);
            }
        }
    }
}
