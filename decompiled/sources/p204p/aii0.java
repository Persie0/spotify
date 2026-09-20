package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class aii0 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f15992a;

    /* JADX INFO: renamed from: b */
    public final boolean f15993b;

    /* JADX INFO: renamed from: c */
    public final boolean f15994c;

    /* JADX INFO: renamed from: d */
    public final boolean f15995d;

    /* JADX INFO: renamed from: e */
    public final bji f15996e;

    /* JADX INFO: renamed from: f */
    public final wg61 f15997f;

    public aii0(boolean z, boolean z2, boolean z3, boolean z4, bji bjiVar) {
        this.f15992a = z;
        this.f15993b = z2;
        this.f15994c = z3;
        this.f15995d = z4;
        this.f15996e = bjiVar;
        this.f15997f = new wg61(new w0i0(this, 14));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m26101a() {
        aii0 aii0Var = (aii0) this.f15997f.getValue();
        return aii0Var != null ? aii0Var.m26101a() : this.f15992a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m26102b() {
        aii0 aii0Var = (aii0) this.f15997f.getValue();
        return aii0Var != null ? aii0Var.m26102b() : this.f15993b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m26103c() {
        aii0 aii0Var = (aii0) this.f15997f.getValue();
        return aii0Var != null ? aii0Var.m26103c() : this.f15994c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m26104d() {
        aii0 aii0Var = (aii0) this.f15997f.getValue();
        return aii0Var != null ? aii0Var.m26104d() : this.f15995d;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("coroutine_command_queue_enabled", "music-navigation", m26101a()), new k8a("enable_async_fragment_commits", "music-navigation", m26102b()), new k8a("enable_overlay_animations", "music-navigation", m26103c()), new k8a("nav_events_enabled", "music-navigation", m26104d()));
    }

    public aii0(bji bjiVar) {
        this(true, false, true, false, bjiVar);
    }
}
