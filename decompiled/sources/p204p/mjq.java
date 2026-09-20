package p204p;

import android.util.Log;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mjq {

    /* JADX INFO: renamed from: k */
    public static final Size f144301k = new Size(0, 0);

    /* JADX INFO: renamed from: l */
    public static final boolean f144302l = vie1.m85633o("DeferrableSurface");

    /* JADX INFO: renamed from: m */
    public static final AtomicInteger f144303m = new AtomicInteger(0);

    /* JADX INFO: renamed from: n */
    public static final AtomicInteger f144304n = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public final Object f144305a = new Object();

    /* JADX INFO: renamed from: b */
    public int f144306b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f144307c = false;

    /* JADX INFO: renamed from: d */
    public gbb f144308d;

    /* JADX INFO: renamed from: e */
    public final jbb f144309e;

    /* JADX INFO: renamed from: f */
    public gbb f144310f;

    /* JADX INFO: renamed from: g */
    public final jbb f144311g;

    /* JADX INFO: renamed from: h */
    public final Size f144312h;

    /* JADX INFO: renamed from: i */
    public final int f144313i;

    /* JADX INFO: renamed from: j */
    public Class f144314j;

    public mjq(Size size, int i) {
        this.f144312h = size;
        this.f144313i = i;
        final int i2 = 0;
        jbb jbbVarM63736l = n5h1.m63736l(new hbb(this) { // from class: p.kjq

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ mjq f123408b;

            {
                this.f123408b = this;
            }

            @Override // p204p.hbb
            public final Object attachCompleter(gbb gbbVar) {
                switch (i2) {
                    case 0:
                        mjq mjqVar = this.f123408b;
                        synchronized (mjqVar.f144305a) {
                            mjqVar.f144308d = gbbVar;
                            break;
                        }
                        return "DeferrableSurface-termination(" + mjqVar + ")";
                    default:
                        mjq mjqVar2 = this.f123408b;
                        synchronized (mjqVar2.f144305a) {
                            mjqVar2.f144310f = gbbVar;
                            break;
                        }
                        return "DeferrableSurface-close(" + mjqVar2 + ")";
                }
            }
        });
        this.f144309e = jbbVarM63736l;
        final int i3 = 1;
        this.f144311g = n5h1.m63736l(new hbb(this) { // from class: p.kjq

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ mjq f123408b;

            {
                this.f123408b = this;
            }

            @Override // p204p.hbb
            public final Object attachCompleter(gbb gbbVar) {
                switch (i3) {
                    case 0:
                        mjq mjqVar = this.f123408b;
                        synchronized (mjqVar.f144305a) {
                            mjqVar.f144308d = gbbVar;
                            break;
                        }
                        return "DeferrableSurface-termination(" + mjqVar + ")";
                    default:
                        mjq mjqVar2 = this.f123408b;
                        synchronized (mjqVar2.f144305a) {
                            mjqVar2.f144310f = gbbVar;
                            break;
                        }
                        return "DeferrableSurface-close(" + mjqVar2 + ")";
                }
            }
        });
        if (vie1.m85633o("DeferrableSurface")) {
            m61987e(f144304n.incrementAndGet(), f144303m.get(), "Surface created");
            jbbVarM63736l.f110727b.mo28322a(new ljq(Log.getStackTraceString(new Exception()), this), e95.m38202g());
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo61983a() {
        gbb gbbVar;
        synchronized (this.f144305a) {
            try {
                if (this.f144307c) {
                    gbbVar = null;
                } else {
                    this.f144307c = true;
                    this.f144310f.m44211b(null);
                    if (this.f144306b == 0) {
                        gbbVar = this.f144308d;
                        this.f144308d = null;
                    } else {
                        gbbVar = null;
                    }
                    if (vie1.m85633o("DeferrableSurface")) {
                        toString();
                        vie1.m85624f("DeferrableSurface");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (gbbVar != null) {
            gbbVar.m44211b(null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m61984b() {
        gbb gbbVar;
        synchronized (this.f144305a) {
            try {
                int i = this.f144306b;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i2 = i - 1;
                this.f144306b = i2;
                if (i2 == 0 && this.f144307c) {
                    gbbVar = this.f144308d;
                    this.f144308d = null;
                } else {
                    gbbVar = null;
                }
                if (vie1.m85633o("DeferrableSurface")) {
                    toString();
                    vie1.m85624f("DeferrableSurface");
                    if (this.f144306b == 0) {
                        m61987e(f144304n.get(), f144303m.decrementAndGet(), "Surface no longer in use");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (gbbVar != null) {
            gbbVar.m44211b(null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final u790 m61985c() {
        synchronized (this.f144305a) {
            try {
                if (this.f144307c) {
                    return new se40(new DeferrableSurface$SurfaceClosedException("DeferrableSurface already closed.", this), 1);
                }
                return mo61988f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m61986d() {
        synchronized (this.f144305a) {
            try {
                int i = this.f144306b;
                if (i == 0 && this.f144307c) {
                    throw new DeferrableSurface$SurfaceClosedException("Cannot begin use on a closed surface.", this);
                }
                this.f144306b = i + 1;
                if (vie1.m85633o("DeferrableSurface")) {
                    if (this.f144306b == 1) {
                        m61987e(f144304n.get(), f144303m.incrementAndGet(), "New surface in use");
                    }
                    toString();
                    vie1.m85624f("DeferrableSurface");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m61987e(int i, int i2, String str) {
        if (!f144302l && vie1.m85633o("DeferrableSurface")) {
            vie1.m85624f("DeferrableSurface");
        }
        toString();
        vie1.m85624f("DeferrableSurface");
    }

    /* JADX INFO: renamed from: f */
    public abstract u790 mo61988f();
}
