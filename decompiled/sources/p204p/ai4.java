package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ai4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f15871a;

    /* JADX INFO: renamed from: b */
    public final bji f15872b;

    /* JADX INFO: renamed from: c */
    public final wg61 f15873c = new wg61(new bh4(this, 16));

    public ai4(boolean z, bji bjiVar) {
        this.f15871a = z;
        this.f15872b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m26056a() {
        ai4 ai4Var = (ai4) this.f15873c.getValue();
        return ai4Var != null ? ai4Var.m26056a() : this.f15871a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("track_player_state_subscriptions", "android-music-libs-player", m26056a()));
    }
}
