package p204p;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class pbq extends fv61 {

    /* JADX INFO: renamed from: a */
    public final Object f175889a = new Object();

    /* JADX INFO: renamed from: b */
    public final ExecutorService f175890b = Executors.newFixedThreadPool(4, new obq(0));

    /* JADX INFO: renamed from: c */
    public volatile Handler f175891c;

    /* JADX INFO: renamed from: e */
    public static Handler m69533e(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // p204p.fv61
    /* JADX INFO: renamed from: a */
    public final void mo42760a(Runnable runnable) {
        this.f175890b.execute(runnable);
    }

    @Override // p204p.fv61
    /* JADX INFO: renamed from: c */
    public final boolean mo42762c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // p204p.fv61
    /* JADX INFO: renamed from: d */
    public final void mo42763d(Runnable runnable) {
        if (this.f175891c == null) {
            synchronized (this.f175889a) {
                try {
                    if (this.f175891c == null) {
                        this.f175891c = m69533e(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f175891c.post(runnable);
    }
}
