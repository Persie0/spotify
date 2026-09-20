package p204p;

import android.graphics.Bitmap;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class wtb1 implements xw10 {

    /* JADX INFO: renamed from: a */
    public final hyb1 f254907a;

    /* JADX INFO: renamed from: b */
    public final int f254908b;

    /* JADX INFO: renamed from: c */
    public final long f254909c;

    /* JADX INFO: renamed from: d */
    public final AtomicLong f254910d = new AtomicLong();

    public wtb1(hyb1 hyb1Var, int i, long j) {
        this.f254907a = hyb1Var;
        this.f254908b = i;
        this.f254909c = j;
    }

    @Override // p204p.bbl0
    /* JADX INFO: renamed from: a */
    public final void mo28642a(y8t y8tVar, long j, r300 r300Var, boolean z) {
        String scheme;
        int i;
        ofd0 ofd0Var = y8tVar.f270373a.f229763b;
        boolean zEquals = (ofd0Var == null || (scheme = ofd0Var.f164727a.getScheme()) == null) ? false : scheme.equals("transformer_surface_asset");
        long jM93127b = y8tVar.m93127b(j);
        AtomicLong atomicLong = this.f254910d;
        if (r300Var != null) {
            if (r300Var.f195353C % 180 != 0) {
                p300 p300VarM74564a = r300Var.m74564a();
                p300VarM74564a.f173534v = r300Var.f195395x;
                p300VarM74564a.f173535w = r300Var.f195394w;
                p300VarM74564a.f173495B = 0;
                r300Var = new r300(p300VarM74564a);
            }
            r300 r300Var2 = r300Var;
            if (zEquals) {
                i = 4;
            } else {
                String str = r300Var2.f195387p;
                str.getClass();
                if (def0.m35796m(str)) {
                    i = 2;
                } else if (str.equals("video/raw")) {
                    i = 3;
                } else {
                    if (!def0.m35798o(str)) {
                        throw new IllegalArgumentException("MIME type not supported ".concat(str));
                    }
                    i = 1;
                }
            }
            this.f254907a.mo49173o(this.f254908b, i, r300Var2, y8tVar.f270378f.f157605b, atomicLong.get() + this.f254909c);
        }
        atomicLong.addAndGet(jM93127b);
    }

    @Override // p204p.f0y0
    /* JADX INFO: renamed from: c */
    public final Surface mo40510c() {
        return this.f254907a.mo49165g(this.f254908b);
    }

    @Override // p204p.f0y0
    /* JADX INFO: renamed from: f */
    public final int mo40511f() {
        return this.f254907a.mo49169k(this.f254908b);
    }

    @Override // p204p.f0y0
    /* JADX INFO: renamed from: g */
    public final void mo40512g() {
        this.f254907a.mo49172n(this.f254908b);
    }

    @Override // p204p.f0y0
    /* JADX INFO: renamed from: h */
    public final boolean mo40513h(long j) {
        return this.f254907a.mo49161c(this.f254908b);
    }

    @Override // p204p.f0y0
    /* JADX INFO: renamed from: i */
    public final int mo40514i(Bitmap bitmap, h5j h5jVar) {
        return this.f254907a.mo49163e(this.f254908b, bitmap, h5jVar) ? 1 : 2;
    }
}
