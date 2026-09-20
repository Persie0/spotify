package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class tp4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f222423a;

    /* JADX INFO: renamed from: b */
    public final boolean f222424b;

    /* JADX INFO: renamed from: c */
    public final bji f222425c;

    /* JADX INFO: renamed from: d */
    public final wg61 f222426d;

    public tp4(int i, bji bjiVar, boolean z) {
        this.f222423a = i;
        this.f222424b = z;
        this.f222425c = bjiVar;
        this.f222426d = new wg61(new kp4(this, 5));
    }

    /* JADX INFO: renamed from: a */
    public final int m81246a() {
        tp4 tp4Var = (tp4) this.f222426d.getValue();
        return tp4Var != null ? tp4Var.m81246a() : this.f222423a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m81247b() {
        tp4 tp4Var = (tp4) this.f222426d.getValue();
        return tp4Var != null ? tp4Var.m81247b() : this.f222424b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("behavior_trampoline_delay_ms", "android-system-element", m81246a(), 0, 1000), new k8a("behavior_trampoline_enabled", "android-system-element", m81247b()));
    }

    public tp4(bji bjiVar) {
        this(100, bjiVar, false);
    }
}
