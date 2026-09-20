package p204p;

import android.content.res.Resources;

/* JADX INFO: renamed from: p.d4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1765d4 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final doh f45037a;

    /* JADX INFO: renamed from: b */
    public final pfm0 f45038b;

    static {
        pfm0 pfm0Var = pfm0.f177111c;
    }

    public C1765d4(Resources resources, cbm0 cbm0Var, doh dohVar, C1801e4 c1801e4) {
        this.f45037a = dohVar;
        this.f45038b = new pfm0(new qfm0[]{new e6m0(true), new q040(cbm0Var, xoc1.f264197t6.m83614b(c1801e4.m37704e()), null), new fda(Integer.valueOf((int) (resources.getDisplayMetrics().heightPixels * 0.4f)), bda.f26062b, null, 0, null, null, false, false, false, 2044)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f45038b;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f45037a.m36532a(jyf.f117398a);
    }
}
