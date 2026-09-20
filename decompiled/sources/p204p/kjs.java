package p204p;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class kjs implements m861, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a */
    public final ijs f123411a;

    /* JADX INFO: renamed from: b */
    public final HandlerThread f123412b;

    /* JADX INFO: renamed from: c */
    public final zb20 f123413c;

    /* JADX INFO: renamed from: d */
    public final Handler f123414d;

    /* JADX INFO: renamed from: e */
    public int f123415e;

    /* JADX INFO: renamed from: f */
    public boolean f123416f;

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f123417g;

    /* JADX INFO: renamed from: h */
    public final LinkedHashMap f123418h;

    /* JADX INFO: renamed from: i */
    public SurfaceTexture f123419i;

    /* JADX INFO: renamed from: t */
    public SurfaceTexture f123420t;

    public kjs(cns cnsVar, iaz iazVar, iaz iazVar2) {
        Map map = Collections.EMPTY_MAP;
        this.f123415e = 0;
        this.f123416f = false;
        this.f123417g = new AtomicBoolean(false);
        this.f123418h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f123412b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f123414d = handler;
        this.f123413c = new zb20(handler);
        this.f123411a = new ijs(iazVar, iazVar2);
        try {
            try {
                n5h1.m63736l(new jt4(this, cnsVar)).get();
            } catch (InterruptedException | ExecutionException e) {
                e = e;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw ((RuntimeException) e);
            }
        } catch (RuntimeException e2) {
            release();
            throw e2;
        }
    }

    @Override // p204p.m861
    /* JADX INFO: renamed from: a */
    public final void mo32184a(l861 l861Var) {
        if (this.f123417g.get()) {
            l861Var.close();
            return;
        }
        fxf fxfVar = new fxf(22, this, l861Var);
        Objects.requireNonNull(l861Var);
        m56623d(fxfVar, new kep(l861Var, 4));
    }

    @Override // p204p.m861
    /* JADX INFO: renamed from: b */
    public final void mo32185b(s861 s861Var) {
        if (this.f123417g.get()) {
            s861Var.m77464c();
        } else {
            m56623d(new fxf(21, this, s861Var), new abq(s861Var, 0));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m56622c() {
        if (this.f123416f && this.f123415e == 0) {
            LinkedHashMap linkedHashMap = this.f123418h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((l861) it.next()).close();
            }
            linkedHashMap.clear();
            ijs ijsVar = this.f123411a;
            if (((AtomicBoolean) ijsVar.f211214c).getAndSet(false)) {
                fl00.m41970c((Thread) ijsVar.f211216e);
                ijsVar.m78664r();
            }
            ijsVar.f102886L0 = -1;
            ijsVar.f102887M0 = -1;
            this.f123412b.quit();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m56623d(Runnable runnable, Runnable runnable2) {
        try {
            this.f123413c.execute(new zq4(this, runnable2, runnable, 16));
        } catch (RejectedExecutionException unused) {
            vie1.m85618G("DualSurfaceProcessor");
            runnable2.run();
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.f123417g.get() || (surfaceTexture2 = this.f123419i) == null || this.f123420t == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.f123420t.updateTexImage();
        for (Map.Entry entry : this.f123418h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            l861 l861Var = (l861) entry.getKey();
            if (l861Var.f130809c == 34) {
                try {
                    this.f123411a.m50831v(surfaceTexture.getTimestamp(), surface, l861Var, this.f123419i, this.f123420t);
                } catch (RuntimeException unused) {
                    vie1.m85627i("DualSurfaceProcessor");
                }
            }
        }
    }

    @Override // p204p.m861
    public final void release() {
        if (this.f123417g.getAndSet(true)) {
            return;
        }
        m56623d(new kep(this, 14), new RunnableC2034k(8));
    }
}
