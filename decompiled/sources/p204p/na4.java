package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class na4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f151930a;

    /* JADX INFO: renamed from: b */
    public final boolean f151931b;

    /* JADX INFO: renamed from: c */
    public final bji f151932c;

    /* JADX INFO: renamed from: d */
    public final wg61 f151933d = new wg61(new ga4(this, 6));

    public na4(boolean z, boolean z2, bji bjiVar) {
        this.f151930a = z;
        this.f151931b = z2;
        this.f151932c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m63948a() {
        na4 na4Var = (na4) this.f151933d.getValue();
        return na4Var != null ? na4Var.m63948a() : this.f151930a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m63949b() {
        na4 na4Var = (na4) this.f151933d.getValue();
        return na4Var != null ? na4Var.m63949b() : this.f151931b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("is_instrumentation_enabled", "android-libs-appstorage", m63948a()), new k8a("is_shared_preferences_instrumentation_enabled", "android-libs-appstorage", m63949b()));
    }
}
