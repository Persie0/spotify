package p204p;

import android.net.Uri;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class suu0 {

    /* JADX INFO: renamed from: a */
    public final c06 f214220a;

    /* JADX INFO: renamed from: b */
    public final zv41 f214221b;

    /* JADX INFO: renamed from: c */
    public final Object f214222c;

    /* JADX INFO: renamed from: d */
    public final nuu0 f214223d;

    public suu0(c06 c06Var, xuk xukVar) {
        this.f214220a = c06Var;
        zv41 zv41VarM52819d = jag1.m52819d(null);
        this.f214221b = zv41VarM52819d;
        this.f214222c = new Object();
        this.f214223d = bzf1.m31029u(xtm0.m92074U(zv41VarM52819d, new nto0((fbk) null, this, 15)), xukVar, hf11.f90581a, lga1.f133191a);
    }

    /* JADX INFO: renamed from: a */
    public final void m79414a() {
        synchronized (this.f214222c) {
            puu0 puu0Var = (puu0) this.f214221b.getValue();
            this.f214221b.m97090l(null);
            if (puu0Var != null) {
                cv9.m33994l(puu0Var.f181531a, l0e1.m57799S(((qga1) this.f214220a.f32694b).f188428a));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m79415b(Uri uri, String str, sfa1 sfa1Var) {
        synchronized (this.f214222c) {
            try {
                puu0 puu0Var = (puu0) this.f214221b.getValue();
                if (puu0Var != null) {
                    cv9.m33994l(puu0Var.f181531a, l0e1.m57799S(((qga1) this.f214220a.f32694b).f188428a));
                }
                UUID uuidRandomUUID = UUID.randomUUID();
                c06 c06Var = this.f214220a;
                wj50.m88279p(uuidRandomUUID);
                c06Var.m31104s(uuidRandomUUID, uri, str, sfa1Var);
                zv41 zv41Var = this.f214221b;
                puu0 puu0Var2 = new puu0(uuidRandomUUID, str, sfa1Var);
                zv41Var.getClass();
                zv41Var.m97091m(null, puu0Var2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
