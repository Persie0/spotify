package p204p;

import android.content.Context;
import android.os.Build;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import org.threeten.p203bp.format.DateTimeParseException;

/* JADX INFO: loaded from: classes6.dex */
public final class v95 implements hgm {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f238842a = 2;

    /* JADX INFO: renamed from: b */
    public final Object f238843b;

    /* JADX INFO: renamed from: c */
    public Object f238844c;

    /* JADX INFO: renamed from: d */
    public Object f238845d;

    /* JADX INFO: renamed from: e */
    public Object f238846e;

    public v95(i4t0 i4t0Var, i4t0 i4t0Var2, szb0 szb0Var) {
        this.f238843b = szb0Var;
        szb0Var.m79731a(new cyc1(this, i4t0Var, i4t0Var2, 5));
    }

    /* JADX INFO: renamed from: a */
    public static final long m84939a(v95 v95Var, Long l) {
        ((wy3) ((xre) v95Var.f238845d)).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jMo41478j = w4u0.f247891b.mo41478j(7200000L);
        return l != null ? Math.min(jCurrentTimeMillis + 86400000, l.longValue()) + jMo41478j : jCurrentTimeMillis + 86400000 + jMo41478j;
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ xre m84940b(v95 v95Var) {
        return (xre) v95Var.f238845d;
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ aia1 m84941c(v95 v95Var) {
        return (aia1) v95Var.f238844c;
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ rha1 m84942d(v95 v95Var) {
        return (rha1) v95Var.f238843b;
    }

    /* JADX INFO: renamed from: e */
    public static final Long m84943e(v95 v95Var, String str) {
        if (str == null || wl51.m88460J0(str)) {
            return null;
        }
        try {
            return Long.valueOf(z050.m95042r6(str).m95047v6());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    @Override // p204p.hgm
    public final void shutdown() {
        switch (this.f238842a) {
            case 0:
                ((iwr) this.f238846e).m51847a();
                break;
            case 1:
                di41 di41Var = (di41) this.f238846e;
                if (di41Var != null) {
                    di41Var.mo26601e(null);
                }
                break;
            default:
                ((szb0) this.f238843b).m79731a(new ixb1(this, 23));
                break;
        }
    }

    public v95(luk lukVar, rha1 rha1Var, aia1 aia1Var, xre xreVar, pha1 pha1Var) {
        this.f238843b = rha1Var;
        this.f238844c = aia1Var;
        this.f238845d = xreVar;
        c9k c9kVarM56661c = kk40.m56661c(lukVar);
        di41 di41Var = (di41) this.f238846e;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        if (pha1Var.f177519a.m45674a()) {
            this.f238846e = x0h1.m89578u(c9kVarM56661c, null, 0, new bia1(this, null), 3);
        }
    }

    public v95(u04 u04Var, Context context, er70 er70Var, er70 er70Var2, igm igmVar) {
        this.f238843b = context;
        this.f238844c = er70Var;
        this.f238845d = er70Var2;
        iwr iwrVar = new iwr();
        this.f238846e = iwrVar;
        if (Build.VERSION.SDK_INT < 30 || !u04Var.m82110a()) {
            return;
        }
        iwrVar.m51848b(new CompletableFromAction(new u95(this)).m23303t((Scheduler) igmVar.get()).m23296h(C2234p.f172411d).m23299p(Functions.f7232h).subscribe());
    }
}
