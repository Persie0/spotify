package p204p;

import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.Semaphore;

/* JADX INFO: renamed from: p.s6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2364s6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f205964a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f205965b;

    public /* synthetic */ RunnableC2364s6(Object obj, int i) {
        this.f205964a = i;
        this.f205965b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f205964a) {
            case 0:
                ((AbstractC2441u6) this.f205965b).m82422b();
                return;
            case 1:
                tz3 tz3Var = (tz3) this.f205965b;
                Trace.beginSection("measureAndLayout");
                try {
                    tz3Var.f225123d.m68606u(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        tz3Var.m82042n();
                        Trace.endSection();
                        tz3Var.f225130g1 = false;
                        return;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            case 2:
                ((cwf) this.f205965b).invalidateOptionsMenu();
                return;
            case 3:
                ((CompletableObserver) this.f205965b).onComplete();
                return;
            case 4:
                ((Observer) this.f205965b).onComplete();
                return;
            case 5:
                ggy ggyVar = (ggy) this.f205965b;
                ggyVar.f79765a.mo25404i(hgy.m47481b(ggyVar.f79766b));
                return;
            case 6:
                ((uaz) this.f205965b).m82700a();
                return;
            case 7:
                i500 i500Var = (i500) this.f205965b;
                y800 y800Var = i500Var.f98717r1;
                y800Var.f270162f.m59918k(i500Var.f98697d);
                i500Var.f98697d = null;
                return;
            case 8:
                r9b0 r9b0Var = (r9b0) this.f205965b;
                Semaphore semaphore = r9b0Var.f197005i1;
                nsh nshVar = r9b0Var.f196971M0;
                if (nshVar == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    nshVar.mo65560r(r9b0Var.f196990b.m46923j());
                    if (r9b0.f196967o1 && r9b0Var.f197001g1) {
                        if (r9b0Var.f197006j1 == null) {
                            r9b0Var.f197006j1 = new Handler(Looper.getMainLooper());
                            r9b0Var.f197007k1 = new ig10(r9b0Var, 13);
                        }
                        r9b0Var.f197006j1.post(r9b0Var.f197007k1);
                    }
                    break;
                } catch (InterruptedException unused) {
                } finally {
                    semaphore.release();
                }
                return;
            case 9:
                whr0 whr0Var = (whr0) this.f205965b;
                oc80 oc80Var = whr0Var.f251432f;
                if (whr0Var.f251428b == 0) {
                    whr0Var.f251429c = true;
                    oc80Var.m66676g(ta80.ON_PAUSE);
                }
                if (whr0Var.f251427a == 0 && whr0Var.f251429c) {
                    oc80Var.m66676g(ta80.ON_STOP);
                    whr0Var.f251430d = true;
                    return;
                }
                return;
            default:
                ((Disposable) this.f205965b).dispose();
                return;
        }
    }
}
