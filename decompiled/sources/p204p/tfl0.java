package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class tfl0 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f220012a;

    /* JADX INFO: renamed from: b */
    public final boolean f220013b;

    /* JADX INFO: renamed from: c */
    public final bji f220014c;

    /* JADX INFO: renamed from: d */
    public final wg61 f220015d = new wg61(new nzk0(this, 5));

    public tfl0(boolean z, boolean z2, bji bjiVar) {
        this.f220012a = z;
        this.f220013b = z2;
        this.f220014c = bjiVar;
    }

    /* JADX INFO: renamed from: d */
    public static tfl0 m80684d(uys0 uys0Var) {
        return new tfl0(uys0Var.mo47707c("on-tour:enable_concert_w_friends_overlay", false), uys0Var.mo47707c("on-tour:enable_reranked_on_tour_card", false), null);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m80685b() {
        tfl0 tfl0Var = (tfl0) this.f220015d.getValue();
        return tfl0Var != null ? tfl0Var.m80685b() : this.f220012a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m80686c() {
        tfl0 tfl0Var = (tfl0) this.f220015d.getValue();
        return tfl0Var != null ? tfl0Var.m80686c() : this.f220013b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_concert_w_friends_overlay", "on-tour", m80685b()), new k8a("enable_reranked_on_tour_card", "on-tour", m80686c()));
    }
}
