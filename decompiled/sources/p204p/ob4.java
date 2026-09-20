package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ob4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f163531a;

    /* JADX INFO: renamed from: b */
    public final boolean f163532b;

    /* JADX INFO: renamed from: c */
    public final bji f163533c;

    /* JADX INFO: renamed from: d */
    public final wg61 f163534d = new wg61(new ga4(this, 26));

    public ob4(boolean z, boolean z2, bji bjiVar) {
        this.f163531a = z;
        this.f163532b = z2;
        this.f163533c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m66621a() {
        ob4 ob4Var = (ob4) this.f163534d.getValue();
        return ob4Var != null ? ob4Var.m66621a() : this.f163531a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m66622b() {
        ob4 ob4Var = (ob4) this.f163534d.getValue();
        return ob4Var != null ? ob4Var.m66622b() : this.f163532b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("skip_next_trigger_enabled", "android-libs-newplaying-feedback-mode", m66621a()), new k8a("use_element_api", "android-libs-newplaying-feedback-mode", m66622b()));
    }
}
