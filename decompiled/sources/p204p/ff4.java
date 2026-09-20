package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ff4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f68900a;

    /* JADX INFO: renamed from: b */
    public final int f68901b;

    /* JADX INFO: renamed from: c */
    public final boolean f68902c;

    /* JADX INFO: renamed from: d */
    public final bji f68903d;

    /* JADX INFO: renamed from: e */
    public final wg61 f68904e = new wg61(new ne4(this, 16));

    public ff4(int i, bji bjiVar, boolean z, boolean z2) {
        this.f68900a = z;
        this.f68901b = i;
        this.f68902c = z2;
        this.f68903d = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m41505a() {
        ff4 ff4Var = (ff4) this.f68904e.getValue();
        return ff4Var != null ? ff4Var.m41505a() : this.f68900a;
    }

    /* JADX INFO: renamed from: b */
    public final int m41506b() {
        ff4 ff4Var = (ff4) this.f68904e.getValue();
        return ff4Var != null ? ff4Var.m41506b() : this.f68901b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m41507c() {
        ff4 ff4Var = (ff4) this.f68904e.getValue();
        return ff4Var != null ? ff4Var.m41507c() : this.f68902c;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_banner_dismiss", "android-livesharing-controller-impl", m41505a()), new k8a("pause_playback_delay_millis", "android-livesharing-controller-impl", m41506b(), 0, 10000), new k8a("use_jam_api", "android-livesharing-controller-impl", m41507c()));
    }
}
