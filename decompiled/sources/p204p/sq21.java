package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class sq21 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f212995a;

    /* JADX INFO: renamed from: b */
    public final boolean f212996b;

    /* JADX INFO: renamed from: c */
    public final bji f212997c;

    /* JADX INFO: renamed from: d */
    public final wg61 f212998d = new wg61(new cy11(this, 14));

    public sq21(boolean z, boolean z2, bji bjiVar) {
        this.f212995a = z;
        this.f212996b = z2;
        this.f212997c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m78932a() {
        sq21 sq21Var = (sq21) this.f212998d.getValue();
        return sq21Var != null ? sq21Var.m78932a() : this.f212995a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m78933b() {
        sq21 sq21Var = (sq21) this.f212998d.getValue();
        return sq21Var != null ? sq21Var.m78933b() : this.f212996b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_sleeptimer_fade_out", "sleeptimer-handler", m78932a()), new k8a("use_player_state_backed_sleep_timer", "sleeptimer-handler", m78933b()));
    }
}
