package p204p;

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class co50 implements Executor {

    /* JADX INFO: renamed from: c */
    public static volatile co50 f40185c;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40186a;

    /* JADX INFO: renamed from: b */
    public final Object f40187b;

    public co50(ExecutorService executorService) {
        this.f40186a = 1;
        this.f40187b = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f40186a) {
            case 0:
                ((ExecutorService) this.f40187b).execute(runnable);
                break;
            case 1:
                ((Executor) this.f40187b).execute(new dd60(1, runnable));
                break;
            default:
                ((d6f1) this.f40187b).post(runnable);
                break;
        }
    }

    public co50(int i) {
        this.f40186a = i;
        switch (i) {
            case 2:
                this.f40187b = new d6f1(Looper.getMainLooper());
                break;
            default:
                this.f40187b = Executors.newFixedThreadPool(2, new obq(1));
                break;
        }
    }
}
