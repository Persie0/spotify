package p204p;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class ze21 implements hyb1 {

    /* JADX INFO: renamed from: a */
    public final Context f281856a;

    /* JADX INFO: renamed from: b */
    public final vxb1 f281857b;

    /* JADX INFO: renamed from: c */
    public final p7f f281858c;

    /* JADX INFO: renamed from: d */
    public final gyb1 f281859d;

    /* JADX INFO: renamed from: e */
    public final wra f281860e;

    /* JADX INFO: renamed from: f */
    public final Executor f281861f;

    /* JADX INFO: renamed from: g */
    public final boolean f281862g;

    /* JADX INFO: renamed from: h */
    public xxb1 f281863h;

    /* JADX INFO: renamed from: i */
    public w761 f281864i;

    /* JADX INFO: renamed from: j */
    public pf40 f281865j;

    /* JADX INFO: renamed from: k */
    public boolean f281866k;

    /* JADX INFO: renamed from: l */
    public volatile boolean f281867l;

    /* JADX INFO: renamed from: m */
    public int f281868m;

    public ze21(Context context, Executor executor, wra wraVar, p7f p7fVar, vxb1 vxb1Var, gyb1 gyb1Var, boolean z) {
        this.f281856a = context;
        this.f281857b = vxb1Var;
        this.f281858c = p7fVar;
        this.f281859d = gyb1Var;
        this.f281860e = wraVar;
        this.f281861f = executor;
        kf40 kf40Var = pf40.f176960b;
        this.f281865j = wsv0.f254763e;
        this.f281862g = z;
        this.f281868m = -1;
    }

    @Override // p204p.hyb1
    /* JADX INFO: renamed from: b */
    public final void mo49160b() {
        this.f281863h.getClass();
        throw new UnsupportedOperationException("Replaying when enableReplayableCache is set to false");
    }

    @Override // p204p.hyb1
    /* JADX INFO: renamed from: c */
    public final boolean mo49161c(int i) {
        this.f281863h.getClass();
        return ((ngq) this.f281863h).m64398g();
    }

    @Override // p204p.hyb1
    /* JADX INFO: renamed from: d */
    public final void mo49162d(pmr0 pmr0Var) {
        c95.m31844j(pmr0Var.equals(pmr0.f179210V0), "SingleInputVideoGraph does not use VideoCompositor, and therefore cannot apply VideoCompositorSettings");
    }

    @Override // p204p.hyb1
    /* JADX INFO: renamed from: e */
    public final boolean mo49163e(int i, Bitmap bitmap, h5j h5jVar) {
        this.f281863h.getClass();
        return ((ngq) this.f281863h).m64397f(bitmap, h5jVar);
    }

    @Override // p204p.hyb1
    /* JADX INFO: renamed from: f */
    public final void mo49164f(List list) {
        this.f281865j = pf40.m69791p(list);
    }

    @Override // p204p.hyb1
    public final void flush() {
        this.f281863h.getClass();
        ((ngq) this.f281863h).m64396e();
    }

    @Override // p204p.hyb1
    /* JADX INFO: renamed from: g */
    public final Surface mo49165g(int i) {
        this.f281863h.getClass();
        SparseArray sparseArray = ((ngq) this.f281863h).f153762f.f193167g;
        c95.m31855u(h0b1.m46321l(sparseArray, 1));
        return ((pw40) sparseArray.get(1)).f181898a.mo72140m();
    }

    @Override // p204p.hyb1
    /* JADX INFO: renamed from: h */
    public final void mo49166h(long j) {
        this.f281863h.getClass();
        ngq ngqVar = (ngq) this.f281863h;
        c95.m31856v(!ngqVar.f153766j, "Calling this method is not allowed when renderFramesAutomatically is enabled");
        ngqVar.f153763g.m81906g(new zfq(ngqVar, j, 1));
    }

    @Override // p204p.hyb1
    /* JADX INFO: renamed from: i */
    public final boolean mo49167i() {
        return this.f281867l;
    }

    @Override // p204p.hyb1
    /* JADX INFO: renamed from: k */
    public final int mo49169k(int i) {
        this.f281863h.getClass();
        AbstractC2440u5 abstractC2440u5 = ((ngq) this.f281863h).f153762f.f193170j;
        if (abstractC2440u5 != null) {
            return abstractC2440u5.mo50699r();
        }
        return 0;
    }

    @Override // p204p.hyb1
    /* JADX INFO: renamed from: l */
    public final void mo49170l(int i) {
        c95.m31855u(this.f281863h == null && !this.f281866k);
        c95.m31856v(this.f281868m == -1, "This VideoGraph supports only one input.");
        this.f281868m = i;
        xxb1 xxb1VarMo35149a = this.f281857b.mo35149a(this.f281856a, this.f281860e, this.f281858c, this.f281862g, new tn20(this));
        this.f281863h = xxb1VarMo35149a;
        w761 w761Var = this.f281864i;
        if (w761Var != null) {
            ((ngq) xxb1VarMo35149a).m64401j(w761Var);
        }
    }

    @Override // p204p.hyb1
    /* JADX INFO: renamed from: m */
    public final void mo49171m(w761 w761Var) {
        this.f281864i = w761Var;
        xxb1 xxb1Var = this.f281863h;
        if (xxb1Var != null) {
            ((ngq) xxb1Var).m64401j(w761Var);
        }
    }

    @Override // p204p.hyb1
    /* JADX INFO: renamed from: n */
    public final void mo49172n(int i) {
        this.f281863h.getClass();
        ((ngq) this.f281863h).m64402k();
    }

    @Override // p204p.hyb1
    /* JADX INFO: renamed from: o */
    public final void mo49173o(int i, int i2, r300 r300Var, List list, long j) {
        this.f281863h.getClass();
        xxb1 xxb1Var = this.f281863h;
        jf40 jf40Var = new jf40(4);
        jf40Var.m28987e(list);
        jf40Var.m28987e(this.f281865j);
        ((ngq) xxb1Var).m64399h(i2, j, jf40Var.m53150g(), r300Var);
    }

    @Override // p204p.hyb1
    public final void release() {
        if (this.f281866k) {
            return;
        }
        xxb1 xxb1Var = this.f281863h;
        if (xxb1Var != null) {
            ((ngq) xxb1Var).m64400i();
        }
        this.f281866k = true;
    }

    @Override // p204p.hyb1
    /* JADX INFO: renamed from: j */
    public final void mo49168j() {
    }
}
