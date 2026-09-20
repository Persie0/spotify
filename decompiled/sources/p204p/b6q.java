package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.interapp.model.AbstractC0800a;
import com.spotify.interapp.model.AppProtocol$Message;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class b6q extends q3r implements fu51 {

    /* JADX INFO: renamed from: m */
    public static final AtomicInteger f24005m = new AtomicInteger();

    /* JADX INFO: renamed from: b */
    public final u4i f24006b;

    /* JADX INFO: renamed from: c */
    public final xf40 f24007c;

    /* JADX INFO: renamed from: d */
    public final boolean f24008d;

    /* JADX INFO: renamed from: e */
    public final int f24009e;

    /* JADX INFO: renamed from: f */
    public final a301 f24010f;

    /* JADX INFO: renamed from: g */
    public final m401 f24011g;

    /* JADX INFO: renamed from: h */
    public final String f24012h;

    /* JADX INFO: renamed from: i */
    public final String f24013i;

    /* JADX INFO: renamed from: j */
    public final hve0 f24014j;

    /* JADX INFO: renamed from: k */
    public final cke f24015k;

    /* JADX INFO: renamed from: l */
    public volatile int f24016l;

    public b6q(u4i u4iVar, a301 a301Var, btv0 btv0Var, m401 m401Var, cke ckeVar) {
        int iIncrementAndGet = f24005m.incrementAndGet();
        this.f24009e = iIncrementAndGet;
        this.f24016l = 0;
        this.f24007c = xf40.m90451c(btv0Var);
        this.f24006b = u4iVar;
        this.f24010f = a301Var;
        this.f24008d = true;
        this.f24014j = new hve0(11);
        this.f24012h = "app_to_app";
        this.f24013i = "app_remote";
        this.f24015k = ckeVar;
        this.f24011g = m401Var;
        m401Var.getClass();
        m401Var.f139788a.put(Integer.valueOf(iIncrementAndGet), new r3r(this));
        m401Var.f139789b.onNext(new ArrayList(m401Var.f139788a.values()));
    }

    /* JADX INFO: renamed from: a */
    public final void m28302a(int i, int i2, Object obj) {
        if (this.f24016l == 1) {
            u4i u4iVar = this.f24006b;
            u4iVar.getClass();
            u4iVar.m82341l(new Object[]{36, Integer.valueOf(i), Integer.valueOf(i2), AbstractC0800a.f4604a, Collections.EMPTY_LIST, obj});
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m28303b(String str) {
        if (this.f24016l == 2) {
            return;
        }
        this.f24016l = 2;
        a301 a301Var = this.f24010f;
        Disposable disposable = a301Var.f11803t;
        if (disposable != null) {
            if (!disposable.isDisposed()) {
                a301Var.f11803t.dispose();
            }
            a301Var.f11803t = null;
        }
        m12 m12Var = a301Var.f11802s;
        if (m12Var != null) {
            m12Var.m60494H();
        }
        ac50 ac50Var = a301Var.f11787d;
        ac50Var.f14260d = true;
        synchronized (ac50Var.f14259c) {
            ac50Var.f14259c.clear();
        }
        zu0 zu0Var = a301Var.f11801r;
        if (zu0Var != null) {
            ((fy41) zu0Var.f286297Z).f74519b.m60129c();
            for (c19 c19Var : ((HashMap) zu0Var.f286301d).values()) {
                synchronized (c19Var) {
                    c19Var.f33023a.clear();
                    c19Var.mo31251d();
                }
            }
        }
        this.f24006b.m82341l(new Object[]{6, new AppProtocol$Message("App service stopping"), str});
        u4i u4iVar = this.f24006b;
        ExecutorService executorService = (ExecutorService) u4iVar.f226725d;
        ((CompositeDisposable) u4iVar.f226729h).m23396g();
        c5f0 c5f0Var = (c5f0) u4iVar.f226724c;
        c5f0Var.f34160c = null;
        tw80 tw80Var = (tw80) u4iVar.f226726e;
        if (tw80Var != null) {
            ((Disposable) tw80Var.f224373i).dispose();
        }
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(500L, TimeUnit.MILLISECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException unused) {
            executorService.shutdownNow();
        }
        try {
            c5f0Var.f34159b.getBinder().unlinkToDeath(c5f0Var, 0);
        } catch (NoSuchElementException unused2) {
            Logger.m3966b("Trying to close a session that has never been started.", new Object[0]);
            c5f0Var.binderDied();
        }
    }
}
