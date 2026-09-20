package p204p;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.car.app.model.Alert;
import com.spotify.legacyglue.widgetstate.StateListAnimatorButton;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class osr {

    /* JADX INFO: renamed from: a */
    public int f168862a;

    /* JADX INFO: renamed from: b */
    public int f168863b;

    /* JADX INFO: renamed from: c */
    public Object f168864c;

    /* JADX INFO: renamed from: d */
    public final Object f168865d;

    /* JADX INFO: renamed from: e */
    public final Object f168866e;

    /* JADX INFO: renamed from: f */
    public final Object f168867f;

    public osr() {
        this.f168862a = 64;
        this.f168863b = 5;
        this.f168865d = new ArrayDeque();
        this.f168866e = new ArrayDeque();
        this.f168867f = new ArrayDeque();
    }

    /* JADX INFO: renamed from: d */
    public static void m67749d(osr osrVar, wuu0 wuu0Var, zuu0 zuu0Var, wuu0 wuu0Var2, int i) {
        uo80 uo80Var;
        wuu0 wuu0Var3;
        if ((i & 1) != 0) {
            wuu0Var = null;
        }
        if ((i & 2) != 0) {
            zuu0Var = null;
        }
        if ((i & 4) != 0) {
            wuu0Var2 = null;
        }
        osrVar.getClass();
        TimeZone timeZone = c0f1.f32774a;
        boolean zIsShutdown = ((ThreadPoolExecutor) osrVar.m67751b()).isShutdown();
        synchronized (osrVar) {
            if (zuu0Var != null) {
                try {
                    if (!((ArrayDeque) osrVar.f168867f).remove(zuu0Var)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (wuu0Var2 != null) {
                wuu0Var2.f255278b.decrementAndGet();
                if (!((ArrayDeque) osrVar.f168866e).remove(wuu0Var2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (wuu0Var != null) {
                ((ArrayDeque) osrVar.f168865d).add(wuu0Var);
                zuu0 zuu0Var2 = wuu0Var.f255279c;
                if (!zuu0Var2.f286532c) {
                    String str = zuu0Var2.f286531b.f20037a.f177459d;
                    Iterator it = ((ArrayDeque) osrVar.f168866e).iterator();
                    do {
                        if (!it.hasNext()) {
                            Iterator it2 = ((ArrayDeque) osrVar.f168865d).iterator();
                            do {
                                if (!it2.hasNext()) {
                                    wuu0Var3 = null;
                                    break;
                                }
                                wuu0Var3 = (wuu0) it2.next();
                            } while (!wj50.m88271j(wuu0Var3.f255279c.f286531b.f20037a.f177459d, str));
                        } else {
                            wuu0Var3 = (wuu0) it.next();
                        }
                    } while (!wj50.m88271j(wuu0Var3.f255279c.f286531b.f20037a.f177459d, str));
                    if (wuu0Var3 != null) {
                        wuu0Var.f255278b = wuu0Var3.f255278b;
                    }
                }
            }
            if ((zuu0Var != null || wuu0Var2 != null) && (zIsShutdown || ((ArrayDeque) osrVar.f168866e).isEmpty())) {
                ((ArrayDeque) osrVar.f168867f).isEmpty();
            }
            boolean z = false;
            if (zIsShutdown) {
                List listM43728j1 = g6f.m43728j1((ArrayDeque) osrVar.f168865d);
                ((ArrayDeque) osrVar.f168865d).clear();
                uo80Var = new uo80(listM43728j1, z);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it3 = ((ArrayDeque) osrVar.f168865d).iterator();
                while (it3.hasNext()) {
                    wuu0 wuu0Var4 = (wuu0) it3.next();
                    if (((ArrayDeque) osrVar.f168866e).size() >= osrVar.f168862a) {
                        break;
                    }
                    if (wuu0Var4.f255278b.get() < osrVar.f168863b) {
                        it3.remove();
                        wuu0Var4.f255278b.incrementAndGet();
                        arrayList.add(wuu0Var4);
                        ((ArrayDeque) osrVar.f168866e).add(wuu0Var4);
                    }
                }
                uo80Var = new uo80(arrayList, z);
            }
        }
        int size = uo80Var.f232357a.size();
        boolean z2 = true;
        for (int i2 = 0; i2 < size; i2++) {
            wuu0 wuu0Var5 = (wuu0) uo80Var.f232357a.get(i2);
            if (wuu0Var5 == wuu0Var) {
                z2 = false;
            } else {
                zuu0 zuu0Var3 = wuu0Var5.f255279c;
                zuu0Var3.f286534e.mo80139m(zuu0Var3, osrVar);
            }
            if (zIsShutdown) {
                wuu0Var5.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                zuu0 zuu0Var4 = wuu0Var5.f255279c;
                zuu0Var4.m97075k(interruptedIOException);
                wuu0Var5.f255277a.mo31884f(zuu0Var4, interruptedIOException);
            } else {
                ExecutorService executorServiceM67751b = osrVar.m67751b();
                zuu0 zuu0Var5 = wuu0Var5.f255279c;
                TimeZone timeZone2 = c0f1.f32774a;
                try {
                    try {
                        ((ThreadPoolExecutor) executorServiceM67751b).execute(wuu0Var5);
                    } catch (Throwable th2) {
                        zuu0Var5.f286530a.f279270a.m67752c(wuu0Var5);
                        throw th2;
                    }
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                    interruptedIOException2.initCause(e);
                    zuu0 zuu0Var6 = wuu0Var5.f255279c;
                    zuu0Var6.m97075k(interruptedIOException2);
                    wuu0Var5.f255277a.mo31884f(zuu0Var6, interruptedIOException2);
                    zuu0Var5.f286530a.f279270a.m67752c(wuu0Var5);
                }
            }
        }
        if (!z2 || wuu0Var == null) {
            return;
        }
        zuu0 zuu0Var7 = wuu0Var.f255279c;
        zuu0Var7.f286534e.mo80140n(zuu0Var7, osrVar);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m67750a() {
        try {
            Iterator it = ((ArrayDeque) this.f168865d).iterator();
            while (it.hasNext()) {
                ((wuu0) it.next()).f255279c.cancel();
            }
            Iterator it2 = ((ArrayDeque) this.f168866e).iterator();
            while (it2.hasNext()) {
                ((wuu0) it2.next()).f255279c.cancel();
            }
            Iterator it3 = ((ArrayDeque) this.f168867f).iterator();
            while (it3.hasNext()) {
                ((zuu0) it3.next()).cancel();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized ExecutorService m67751b() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f168864c) == null) {
                this.f168864c = new ThreadPoolExecutor(0, Alert.DURATION_SHOW_INDEFINITELY, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new b0f1(c0f1.f32775b + " Dispatcher", false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f168864c;
            wj50.m88279p(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: c */
    public void m67752c(wuu0 wuu0Var) {
        m67749d(this, null, null, wuu0Var, 3);
    }

    /* JADX INFO: renamed from: e */
    public void m67753e() {
        Drawable background;
        StateListAnimatorButton stateListAnimatorButton = (StateListAnimatorButton) this.f168864c;
        zpt0 zpt0Var = (zpt0) this.f168867f;
        ojp ojpVar = (ojp) this.f168865d;
        ojp ojpVar2 = (ojp) this.f168866e;
        boolean z = ojpVar2.f166108b != 0;
        int i = ojpVar.f166108b;
        boolean z2 = i != 0;
        ojpVar.f166107a = z2;
        ojpVar2.f166107a = z || z2;
        if (ojpVar.f166107a) {
            ojpVar.f166109c = zpt0Var.m96694a(i);
            if (ojpVar.f166107a && (background = stateListAnimatorButton.getBackground()) != null) {
                yfs.m93567a(background, (ColorStateList) ojpVar.f166109c, stateListAnimatorButton.getDrawableState());
            }
        }
        if (ojpVar2.f166107a) {
            boolean z3 = m9f.m61218f(ojpVar.f166108b) > 0.5d;
            int i2 = ojpVar2.f166108b;
            if (i2 != 0) {
                ojpVar2.f166109c = zpt0Var.m96694a(i2);
            } else if (z3) {
                ojpVar2.f166109c = zpt0Var.m96694a(this.f168863b);
            } else {
                ojpVar2.f166109c = zpt0Var.m96694a(this.f168862a);
            }
            if (ojpVar2.f166107a) {
                stateListAnimatorButton.setTextColor((ColorStateList) ojpVar2.f166109c);
            }
        }
    }

    public osr(StateListAnimatorButton stateListAnimatorButton) {
        boolean z = false;
        this.f168865d = new ojp(z);
        this.f168866e = new ojp(z);
        this.f168864c = stateListAnimatorButton;
        this.f168867f = new zpt0(stateListAnimatorButton.getContext());
    }
}
