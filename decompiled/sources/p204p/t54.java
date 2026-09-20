package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class t54 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f217205a;

    /* JADX INFO: renamed from: b */
    public final boolean f217206b;

    /* JADX INFO: renamed from: c */
    public final bji f217207c;

    /* JADX INFO: renamed from: d */
    public final wg61 f217208d = new wg61(new o54(this, 4));

    public t54(boolean z, boolean z2, bji bjiVar) {
        this.f217205a = z;
        this.f217206b = z2;
        this.f217207c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m80080a() {
        t54 t54Var = (t54) this.f217208d.getValue();
        return t54Var != null ? t54Var.m80080a() : this.f217205a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m80081b() {
        t54 t54Var = (t54) this.f217208d.getValue();
        return t54Var != null ? t54Var.m80081b() : this.f217206b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_display_mode_state", "android-feature-nowplaying", m80080a()), new k8a("extended_lifecycle", "android-feature-nowplaying", m80081b()));
    }
}
