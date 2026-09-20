package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class e94 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f57355a;

    /* JADX INFO: renamed from: b */
    public final boolean f57356b;

    /* JADX INFO: renamed from: c */
    public final boolean f57357c;

    /* JADX INFO: renamed from: d */
    public final boolean f57358d;

    /* JADX INFO: renamed from: e */
    public final boolean f57359e;

    /* JADX INFO: renamed from: f */
    public final bji f57360f;

    /* JADX INFO: renamed from: g */
    public final wg61 f57361g;

    public e94(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, bji bjiVar) {
        this.f57355a = z;
        this.f57356b = z2;
        this.f57357c = z3;
        this.f57358d = z4;
        this.f57359e = z5;
        this.f57360f = bjiVar;
        this.f57361g = new wg61(new f74(this, 22));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m38191a() {
        e94 e94Var = (e94) this.f57361g.getValue();
        return e94Var != null ? e94Var.m38191a() : this.f57355a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m38192b() {
        e94 e94Var = (e94) this.f57361g.getValue();
        return e94Var != null ? e94Var.m38192b() : this.f57356b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m38193c() {
        e94 e94Var = (e94) this.f57361g.getValue();
        return e94Var != null ? e94Var.m38193c() : this.f57357c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m38194d() {
        e94 e94Var = (e94) this.f57361g.getValue();
        return e94Var != null ? e94Var.m38194d() : this.f57358d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m38195e() {
        e94 e94Var = (e94) this.f57361g.getValue();
        return e94Var != null ? e94Var.m38195e() : this.f57359e;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("bridge_collection_enabled", "android-genui-chromeless", m38191a()), new k8a("bridge_location_enabled", "android-genui-chromeless", m38192b()), new k8a("bridge_navigation_enabled", "android-genui-chromeless", m38193c()), new k8a("bridge_playback_enabled", "android-genui-chromeless", m38194d()), new k8a("is_enabled", "android-genui-chromeless", m38195e()));
    }

    public e94(bji bjiVar) {
        this(true, true, true, true, true, bjiVar);
    }
}
