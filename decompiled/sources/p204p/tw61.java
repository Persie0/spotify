package p204p;

import com.spotify.music.R;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class tw61 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final i4t0 f224320a;

    /* JADX INFO: renamed from: b */
    public final hkh f224321b;

    /* JADX INFO: renamed from: c */
    public final sv61 f224322c;

    /* JADX INFO: renamed from: d */
    public final qw61 f224323d;

    /* JADX INFO: renamed from: e */
    public final pfm0 f224324e;

    public tw61(s7o s7oVar, hkh hkhVar, sv61 sv61Var, qw61 qw61Var) {
        this.f224320a = s7oVar;
        this.f224321b = hkhVar;
        this.f224322c = sv61Var;
        this.f224323d = qw61Var;
        pw71 pw71Var = new pw71(new p1x0(R.string.taste_profile_page_title));
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f224324e = new pfm0(new qfm0[]{pw71Var, new q040(xgg1.m90582B5(), xoc1.f263869D6, null), new maa0()}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f224324e;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f224321b.m47840a(tky.m81027c(new v4a0[0], new bya0(this, null, 27)), rkk.m75763o(new v161(this, 6), true, -721077141), new u5a0(new sw61(this), aq61.f18101U0, alq0.f16923R0), rqg1.m76245p());
    }
}
