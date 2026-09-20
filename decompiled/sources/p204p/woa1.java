package p204p;

import com.spotify.music.R;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class woa1 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final doh f253419a;

    /* JADX INFO: renamed from: b */
    public final z9j0 f253420b;

    /* JADX INFO: renamed from: c */
    public final lk40 f253421c;

    /* JADX INFO: renamed from: d */
    public final yoa1 f253422d;

    /* JADX INFO: renamed from: e */
    public final v0y f253423e;

    /* JADX INFO: renamed from: f */
    public final qpa1 f253424f;

    /* JADX INFO: renamed from: g */
    public boolean f253425g = true;

    /* JADX INFO: renamed from: h */
    public final pfm0 f253426h;

    public woa1(doh dohVar, n6q n6qVar, z9j0 z9j0Var, lk40 lk40Var, yoa1 yoa1Var, v0y v0yVar, qpa1 qpa1Var) {
        this.f253419a = dohVar;
        this.f253420b = z9j0Var;
        this.f253421c = lk40Var;
        this.f253422d = yoa1Var;
        this.f253423e = v0yVar;
        this.f253424f = qpa1Var;
        n6qVar.m63784c(new yaa1(this, 4));
        pw71 pw71Var = new pw71(new p1x0(R.string.user_feedback_bottom_sheet_title));
        kyw0 kyw0Var = new kyw0();
        fda fdaVar = new fda(null, bda.f26062b, null, 0, null, n6qVar, true, true, false, 1821);
        i200 i200Var = new i200(1);
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f253426h = new pfm0(new qfm0[]{pw71Var, kyw0Var, fdaVar, i200Var, new q040(xgg1.m90861q2(), xoc1.f264228x5, null)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f253426h;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f253419a.m36532a(rkk.m75763o(new voa1(this, 1), true, -1782236165));
    }
}
