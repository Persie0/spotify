package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h14 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f86510a;

    /* JADX INFO: renamed from: b */
    public final boolean f86511b;

    /* JADX INFO: renamed from: c */
    public final bji f86512c;

    /* JADX INFO: renamed from: d */
    public final wg61 f86513d = new wg61(new ey3(this, 24));

    public h14(boolean z, boolean z2, bji bjiVar) {
        this.f86510a = z;
        this.f86511b = z2;
        this.f86512c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m46396a() {
        h14 h14Var = (h14) this.f86513d.getValue();
        return h14Var != null ? h14Var.m46396a() : this.f86510a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m46397b() {
        h14 h14Var = (h14) this.f86513d.getValue();
        return h14Var != null ? h14Var.m46397b() : this.f86511b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("connection_quality_data_saver_enabled", "android-datasaver-connectionquality-impl", m46396a()), new k8a("event_logging_enabled", "android-datasaver-connectionquality-impl", m46397b()));
    }
}
