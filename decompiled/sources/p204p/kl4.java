package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kl4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f123794a;

    /* JADX INFO: renamed from: b */
    public final int f123795b;

    /* JADX INFO: renamed from: c */
    public final int f123796c;

    /* JADX INFO: renamed from: d */
    public final bji f123797d;

    /* JADX INFO: renamed from: e */
    public final wg61 f123798e = new wg61(new jk4(this, 6));

    public kl4(boolean z, int i, int i2, bji bjiVar) {
        this.f123794a = z;
        this.f123795b = i;
        this.f123796c = i2;
        this.f123797d = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m56797a() {
        kl4 kl4Var = (kl4) this.f123798e.getValue();
        return kl4Var != null ? kl4Var.m56797a() : this.f123794a;
    }

    /* JADX INFO: renamed from: b */
    public final int m56798b() {
        kl4 kl4Var = (kl4) this.f123798e.getValue();
        return kl4Var != null ? kl4Var.m56798b() : this.f123795b;
    }

    /* JADX INFO: renamed from: c */
    public final int m56799c() {
        kl4 kl4Var = (kl4) this.f123798e.getValue();
        return kl4Var != null ? kl4Var.m56799c() : this.f123796c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("playback_instrumentation_enabled", "android-play-telemetry-playback-oops-instrumentation-impl", m56797a()), new k8a("playback_start_baseline_oops_sampling_bps", "android-play-telemetry-playback-oops-instrumentation-impl", m56798b(), 0, 10000), new k8a("playback_start_detailed_oops_sampling_bps", "android-play-telemetry-playback-oops-instrumentation-impl", m56799c(), 0, 10000));
    }
}
