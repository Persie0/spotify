package p204p;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class bla0 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final fla0 f28143a;

    /* JADX INFO: renamed from: b */
    public final xnh f28144b;

    /* JADX INFO: renamed from: c */
    public final uka0 f28145c;

    /* JADX INFO: renamed from: d */
    public final pul f28146d;

    /* JADX INFO: renamed from: e */
    public final e1v0 f28147e;

    /* JADX INFO: renamed from: f */
    public final bq70 f28148f;

    /* JADX INFO: renamed from: g */
    public final pfm0 f28149g;

    public bla0(fla0 fla0Var, xnh xnhVar, uka0 uka0Var, pul pulVar, e1v0 e1v0Var, bq70 bq70Var) {
        this.f28143a = fla0Var;
        this.f28144b = xnhVar;
        this.f28145c = uka0Var;
        this.f28146d = pulVar;
        this.f28147e = e1v0Var;
        this.f28148f = bq70Var;
        pw71 pw71Var = new pw71(new sl51("LocationSearchPage"));
        Parcelable.Creator<voc1> creator = voc1.CREATOR;
        this.f28149g = new pfm0(new qfm0[]{pw71Var, new q040(kif1.f122962a, mug1.m62869n(fla0Var.getUri()), null), new cs61("trending-near-you-location-search")}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f28149g;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f28144b.m91502a(rkk.m75763o(new az60(this, 21), true, 167629725), new wc21(new yka0(this), new t690(this, 23), y3z.f269021Y, z3a0.f278830S0));
    }
}
