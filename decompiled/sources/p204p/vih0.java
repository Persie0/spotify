package p204p;

import android.util.Log;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vih0 implements Closeable, gc80 {

    /* JADX INFO: renamed from: e */
    public static final vi10 f241716e = new vi10("MobileVisionBase", "");

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f241717a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final AbstractC2440u5 f241718b;

    /* JADX INFO: renamed from: c */
    public final px0 f241719c;

    /* JADX INFO: renamed from: d */
    public final Executor f241720d;

    public vih0(gd71 gd71Var, Executor executor) {
        this.f241718b = gd71Var;
        px0 px0Var = new px0(20);
        this.f241719c = px0Var;
        this.f241720d = executor;
        ((AtomicInteger) gd71Var.f226862c).incrementAndGet();
        gd71Var.m82373c(executor, aqk.f18266d, (c4d1) px0Var.f182174b).m92992m(hcj0.f89814S0);
    }

    /* JADX INFO: renamed from: c */
    public static void m85666c() {
        String str;
        vi10 vi10Var = f241716e;
        if (!Log.isLoggable(vi10Var.f241586a, 6) || (str = vi10Var.f241587b) == null) {
            return;
        }
        str.concat("Error preloading model resource");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @zal0(ta80.ON_DESTROY)
    public synchronized void close() {
        boolean z = true;
        if (this.f241717a.getAndSet(true)) {
            return;
        }
        this.f241719c.m71321c();
        AbstractC2440u5 abstractC2440u5 = this.f241718b;
        Executor executor = this.f241720d;
        if (((AtomicInteger) abstractC2440u5.f226862c).get() <= 0) {
            z = false;
        }
        ig31.m50471A(z);
        ((s831) abstractC2440u5.f226861b).m77457f(new vpa1(16, abstractC2440u5, new ev61()), executor);
    }
}
