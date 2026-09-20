package p204p;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class o0e1 {

    /* JADX INFO: renamed from: a */
    public final fc5 f160371a;

    /* JADX INFO: renamed from: b */
    public final luk f160372b;

    /* JADX INFO: renamed from: c */
    public final Handler f160373c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d */
    public final zr20 f160374d = new zr20(this, 4);

    public o0e1(ExecutorService executorService) {
        fc5 fc5Var = new fc5(executorService);
        this.f160371a = fc5Var;
        this.f160372b = z2h1.m95213t(fc5Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m66013a(Runnable runnable) {
        this.f160371a.execute(runnable);
    }
}
