package p204p;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xgi implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f261325a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f261326b;

    public /* synthetic */ xgi(Object obj, int i) {
        this.f261325a = i;
        this.f261326b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f261325a) {
            case 0:
                ((Handler) this.f261326b).post(runnable);
                break;
            case 1:
                ((kh61) this.f261326b).m56388f(runnable);
                break;
            case 2:
                h0b1.m46304c0(((obd0) this.f261326b).f163616e, runnable);
                break;
            case 3:
                ((pgd0) this.f261326b).m69877b(runnable);
                break;
            case 4:
                ((dhd0) this.f261326b).m36022O(runnable);
                break;
            case 5:
                h0b1.m46304c0(((vhd0) this.f261326b).f241484c, runnable);
                break;
            case 6:
                ((rpd0) this.f261326b).m76115A(runnable);
                break;
            case 7:
                ((pqd0) this.f261326b).m70641i(runnable);
                break;
            case 8:
                h0b1.m46304c0(((nrd0) this.f261326b).f157496b.f201552l, runnable);
                break;
            case 9:
                ((psd0) this.f261326b).m70784g2(runnable);
                break;
            case 10:
                ((kh61) ((bc20) this.f261326b)).m56388f(runnable);
                break;
            case 11:
                kh61 kh61Var = ((ke41) this.f261326b).f121801d;
                if (kh61Var.f122536a.getLooper() != Looper.myLooper()) {
                    kh61Var.m56388f(runnable);
                } else {
                    runnable.run();
                }
                break;
            default:
                ((Choreographer) this.f261326b).postFrameCallback(new sb20(2, runnable));
                break;
        }
    }
}
