package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kq4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f125209a;

    /* JADX INFO: renamed from: b */
    public final boolean f125210b;

    /* JADX INFO: renamed from: c */
    public final boolean f125211c;

    /* JADX INFO: renamed from: d */
    public final boolean f125212d;

    /* JADX INFO: renamed from: e */
    public final bji f125213e;

    /* JADX INFO: renamed from: f */
    public final wg61 f125214f = new wg61(new kp4(this, 19));

    public kq4(boolean z, boolean z2, boolean z3, boolean z4, bji bjiVar) {
        this.f125209a = z;
        this.f125210b = z2;
        this.f125211c = z3;
        this.f125212d = z4;
        this.f125213e = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m57075a() {
        kq4 kq4Var = (kq4) this.f125214f.getValue();
        return kq4Var != null ? kq4Var.m57075a() : this.f125209a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m57076b() {
        kq4 kq4Var = (kq4) this.f125214f.getValue();
        return kq4Var != null ? kq4Var.m57076b() : this.f125210b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m57077c() {
        kq4 kq4Var = (kq4) this.f125214f.getValue();
        return kq4Var != null ? kq4Var.m57077c() : this.f125211c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m57078d() {
        kq4 kq4Var = (kq4) this.f125214f.getValue();
        return kq4Var != null ? kq4Var.m57078d() : this.f125212d;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("cache_stable_intents", "android-system-playback-notifications", m57075a()), new k8a("media_action_api_enabled", "android-system-playback-notifications", m57076b()), new k8a("notification_dsl_enabled", "android-system-playback-notifications", m57077c()), new k8a("should_use_vit", "android-system-playback-notifications", m57078d()));
    }
}
