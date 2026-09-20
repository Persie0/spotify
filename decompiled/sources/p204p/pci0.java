package p204p;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class pci0 implements hyb1 {

    /* JADX INFO: renamed from: a */
    public final Context f176115a;

    /* JADX INFO: renamed from: b */
    public final p7f f176116b;

    /* JADX INFO: renamed from: c */
    public final vw90 f176117c;

    /* JADX INFO: renamed from: d */
    public final wra f176118d;

    /* JADX INFO: renamed from: e */
    public final gyb1 f176119e;

    /* JADX INFO: renamed from: f */
    public final Executor f176120f;

    /* JADX INFO: renamed from: g */
    public final SparseArray f176121g;

    /* JADX INFO: renamed from: h */
    public final ScheduledExecutorService f176122h;

    /* JADX INFO: renamed from: i */
    public final lgq f176123i;

    /* JADX INFO: renamed from: j */
    public final ArrayDeque f176124j;

    /* JADX INFO: renamed from: k */
    public final SparseArray f176125k;

    /* JADX INFO: renamed from: l */
    public final boolean f176126l;

    /* JADX INFO: renamed from: m */
    public List f176127m;

    /* JADX INFO: renamed from: n */
    public pmr0 f176128n;

    /* JADX INFO: renamed from: o */
    public ngq f176129o;

    /* JADX INFO: renamed from: p */
    public dgq f176130p;

    /* JADX INFO: renamed from: q */
    public di21 f176131q;

    /* JADX INFO: renamed from: r */
    public boolean f176132r;

    /* JADX INFO: renamed from: s */
    public boolean f176133s;

    /* JADX INFO: renamed from: t */
    public long f176134t;

    /* JADX INFO: renamed from: u */
    public volatile boolean f176135u;

    public pci0(Context context, Executor executor, wra wraVar, p7f p7fVar, vxb1 vxb1Var, gyb1 gyb1Var, boolean z) {
        c95.m31843i(vxb1Var instanceof lgq);
        this.f176115a = context;
        this.f176116b = p7fVar;
        this.f176118d = wraVar;
        this.f176119e = gyb1Var;
        this.f176120f = executor;
        this.f176126l = z;
        this.f176134t = -9223372036854775807L;
        this.f176121g = new SparseArray();
        String str = h0b1.f86200a;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ygi("Effect:MultipleInputVideoGraph:Thread", 2));
        this.f176122h = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        vw90 vw90Var = new vw90(17);
        this.f176117c = vw90Var;
        kgq kgqVarM58937b = ((lgq) vxb1Var).m58937b();
        kgqVarM58937b.f122433f = vw90Var;
        kgqVarM58937b.f122432e = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f176123i = new lgq(!kgqVarM58937b.f122428a, vw90Var, scheduledExecutorServiceNewSingleThreadScheduledExecutor, (de10) kgqVarM58937b.f122434g, kgqVarM58937b.f122429b, kgqVarM58937b.f122430c, kgqVarM58937b.f122431d);
        this.f176124j = new ArrayDeque();
        this.f176125k = new SparseArray();
        this.f176131q = di21.f49218c;
        kf40 kf40Var = pf40.f176960b;
        this.f176127m = wsv0.f254763e;
        this.f176128n = pmr0.f179210V0;
    }

    /* JADX INFO: renamed from: a */
    public final xxb1 m69587a(int i) {
        SparseArray sparseArray = this.f176121g;
        c95.m31855u(h0b1.m46321l(sparseArray, i));
        return (xxb1) sparseArray.get(i);
    }

    @Override // p204p.hyb1
    /* JADX INFO: renamed from: b */
    public final void mo49160b() {
        throw new UnsupportedOperationException();
    }

    @Override // p204p.hyb1
    /* JADX INFO: renamed from: c */
    public final boolean mo49161c(int i) {
        return ((ngq) m69587a(i)).m64398g();
    }

    @Override // p204p.hyb1
    /* JADX INFO: renamed from: d */
    public final void mo49162d(pmr0 pmr0Var) {
        this.f176128n = pmr0Var;
        dgq dgqVar = this.f176130p;
        if (dgqVar != null) {
            dgqVar.f48877k = pmr0Var;
        }
    }

    @Override // p204p.hyb1
    /* JADX INFO: renamed from: e */
    public final boolean mo49163e(int i, Bitmap bitmap, h5j h5jVar) {
        return ((ngq) m69587a(i)).m64397f(bitmap, h5jVar);
    }

    @Override // p204p.hyb1
    /* JADX INFO: renamed from: f */
    public final void mo49164f(List list) {
        this.f176127m = list;
    }

    @Override // p204p.hyb1
    public final void flush() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f176121g;
            if (i >= sparseArray.size()) {
                return;
            }
            ((ngq) ((xxb1) sparseArray.get(sparseArray.keyAt(i)))).m64396e();
            i++;
        }
    }

    @Override // p204p.hyb1
    /* JADX INFO: renamed from: g */
    public final Surface mo49165g(int i) {
        SparseArray sparseArray = ((ngq) m69587a(i)).f153762f.f193167g;
        c95.m31855u(h0b1.m46321l(sparseArray, 1));
        return ((pw40) sparseArray.get(1)).f181898a.mo72140m();
    }

    @Override // p204p.hyb1
    /* JADX INFO: renamed from: h */
    public final void mo49166h(long j) {
        ngq ngqVar = this.f176129o;
        ngqVar.getClass();
        c95.m31856v(!ngqVar.f153766j, "Calling this method is not allowed when renderFramesAutomatically is enabled");
        ngqVar.f153763g.m81906g(new zfq(ngqVar, j, 1));
    }

    @Override // p204p.hyb1
    /* JADX INFO: renamed from: i */
    public final boolean mo49167i() {
        return this.f176135u;
    }

    @Override // p204p.hyb1
    /* JADX INFO: renamed from: j */
    public final void mo49168j() {
        c95.m31855u(this.f176121g.size() == 0 && this.f176130p == null && this.f176129o == null && !this.f176133s);
        ngq ngqVarM58938c = this.f176123i.m58938c(this.f176115a, this.f176118d, this.f176116b, this.f176126l, ckr.f39074a, new wgb0(this, 10));
        this.f176129o = ngqVarM58938c;
        jci0 jci0Var = new jci0(this);
        SparseArray sparseArray = ngqVarM58938c.f153762f.f193167g;
        c95.m31855u(h0b1.m46321l(sparseArray, 3));
        ((pw40) sparseArray.get(3)).f181898a.mo82371N(jci0Var);
        dgq dgqVar = new dgq(this.f176115a, this.f176117c, this.f176122h, new w090(this, 20), new jci0(this));
        this.f176130p = dgqVar;
        dgqVar.f48877k = this.f176128n;
    }

    @Override // p204p.hyb1
    /* JADX INFO: renamed from: k */
    public final int mo49169k(int i) {
        AbstractC2440u5 abstractC2440u5 = ((ngq) m69587a(i)).f153762f.f193170j;
        if (abstractC2440u5 != null) {
            return abstractC2440u5.mo50699r();
        }
        return 0;
    }

    @Override // p204p.hyb1
    /* JADX INFO: renamed from: l */
    public final void mo49170l(int i) {
        c95.m31855u(!h0b1.m46321l(this.f176121g, i));
        dgq dgqVar = this.f176130p;
        dgqVar.getClass();
        synchronized (dgqVar) {
            c95.m31855u(!h0b1.m46321l(dgqVar.f48872f, i));
            dgqVar.f48872f.put(i, new cgq());
            if (dgqVar.f48881o == -1) {
                dgqVar.f48881o = i;
            }
        }
        kgq kgqVarM58937b = this.f176123i.m58937b();
        mc5 mc5Var = new mc5(this, i, 8);
        kgqVarM58937b.f122434g = mc5Var;
        kgqVarM58937b.f122429b = 2;
        this.f176121g.put(i, new lgq(!kgqVarM58937b.f122428a, (ud10) kgqVarM58937b.f122433f, (ExecutorService) kgqVarM58937b.f122432e, mc5Var, 2, kgqVarM58937b.f122430c, kgqVarM58937b.f122431d).m58938c(this.f176115a, wra.f254299c, this.f176116b, true, this.f176120f, new cl8(this, i, 25)));
    }

    @Override // p204p.hyb1
    /* JADX INFO: renamed from: m */
    public final void mo49171m(w761 w761Var) {
        ngq ngqVar = this.f176129o;
        ngqVar.getClass();
        ngqVar.m64401j(w761Var);
    }

    @Override // p204p.hyb1
    /* JADX INFO: renamed from: n */
    public final void mo49172n(int i) {
        ((ngq) m69587a(i)).m64402k();
    }

    @Override // p204p.hyb1
    /* JADX INFO: renamed from: o */
    public final void mo49173o(int i, int i2, r300 r300Var, List list, long j) {
        ((ngq) m69587a(i)).m64399h(i2, j, list, r300Var);
    }

    /* JADX INFO: renamed from: p */
    public final void m69588p() {
        wo71 wo71Var = (wo71) this.f176124j.peek();
        if (wo71Var == null) {
            return;
        }
        ngq ngqVar = this.f176129o;
        ngqVar.getClass();
        ce10 ce10Var = wo71Var.f253396a;
        int i = ce10Var.f36992c;
        int i2 = ce10Var.f36993d;
        di21 di21Var = this.f176131q;
        if (i != di21Var.f49219a || i2 != di21Var.f49220b) {
            p300 p300Var = new p300();
            p300Var.f173500G = this.f176116b;
            p300Var.f173534v = i;
            p300Var.f173535w = i2;
            ngqVar.m64399h(3, 0L, this.f176127m, new r300(p300Var));
            this.f176131q = new di21(i, i2);
        }
        int i3 = wo71Var.f253396a.f36990a;
        long j = wo71Var.f253397b;
        c95.m31855u(!ngqVar.f153779w);
        if (!ngqVar.f153769m.m41671e() || ngqVar.f153780x) {
            return;
        }
        AbstractC2440u5 abstractC2440u5 = ngqVar.f153762f.f193170j;
        abstractC2440u5.getClass();
        abstractC2440u5.mo82370F(i3, j);
        this.f176124j.remove();
        if (this.f176132r && this.f176124j.isEmpty()) {
            ngqVar.m64402k();
        }
    }

    @Override // p204p.hyb1
    public final void release() {
        if (this.f176133s) {
            return;
        }
        for (int i = 0; i < this.f176121g.size(); i++) {
            SparseArray sparseArray = this.f176121g;
            ((ngq) ((xxb1) sparseArray.get(sparseArray.keyAt(i)))).m64400i();
        }
        dgq dgqVar = this.f176130p;
        if (dgqVar != null) {
            synchronized (dgqVar) {
                try {
                    dgqVar.f48871e.m81904e(new yfq(dgqVar, 0));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new IllegalStateException(e);
                }
            }
            this.f176130p = null;
        }
        ngq ngqVar = this.f176129o;
        if (ngqVar != null) {
            ngqVar.m64400i();
            this.f176129o = null;
        }
        this.f176122h.submit(new ig10(this, 20));
        this.f176122h.shutdown();
        try {
            this.f176122h.awaitTermination(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            yif1.m93808r("Thread interrupted while waiting for executor service termination");
        }
        this.f176133s = true;
    }
}
