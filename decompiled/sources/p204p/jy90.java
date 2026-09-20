package p204p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class jy90 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final hkh f117331a;

    /* JADX INFO: renamed from: b */
    public final hr40 f117332b;

    /* JADX INFO: renamed from: c */
    public final clq0 f117333c;

    /* JADX INFO: renamed from: d */
    public final ox90 f117334d;

    /* JADX INFO: renamed from: e */
    public final xre f117335e;

    /* JADX INFO: renamed from: f */
    public final kx90 f117336f;

    /* JADX INFO: renamed from: g */
    public final z9j0 f117337g;

    /* JADX INFO: renamed from: h */
    public final n600 f117338h;

    /* JADX INFO: renamed from: i */
    public final b5n f117339i;

    /* JADX INFO: renamed from: j */
    public final d5n f117340j;

    /* JADX INFO: renamed from: k */
    public final pfm0 f117341k;

    public jy90(hkh hkhVar, hr40 hr40Var, zy5 zy5Var, clq0 clq0Var, ox90 ox90Var, xre xreVar, kx90 kx90Var, z9j0 z9j0Var, n600 n600Var, b5n b5nVar, d5n d5nVar, w1k0 w1k0Var) {
        this.f117331a = hkhVar;
        this.f117332b = hr40Var;
        this.f117333c = clq0Var;
        this.f117334d = ox90Var;
        this.f117335e = xreVar;
        this.f117336f = kx90Var;
        this.f117337g = z9j0Var;
        this.f117338h = n600Var;
        this.f117339i = b5nVar;
        this.f117340j = d5nVar;
        pw71 pw71Var = new pw71(new sl51(""));
        zox zoxVar = new zox();
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        cbm0 cbm0VarM90607F2 = xgg1.m90607F2();
        Parcelable.Creator<voc1> creator = voc1.CREATOR;
        this.f117341k = new pfm0(new qfm0[]{pw71Var, zoxVar, new q040(cbm0VarM90607F2, mug1.m62869n(ox90Var.m68201g()), null)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f117341k;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        ox90 ox90Var = this.f117334d;
        return this.f117331a.m47840a(this.f117333c.m33305C(ox90Var.m68201g()), rkk.m75763o(new hy90(this, 2), true, 32038950), new u5a0(new iy90(this), new pn40(this, 6), zy5.m97229j(ox90Var.m68200c())), new hlh(upg.f232684b, null, rkk.m75763o(new hy90(this, 3), true, -1871488484), false, 58));
    }
}
