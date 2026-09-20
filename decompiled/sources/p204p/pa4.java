package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pa4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f175382a;

    /* JADX INFO: renamed from: b */
    public final boolean f175383b;

    /* JADX INFO: renamed from: c */
    public final bji f175384c;

    /* JADX INFO: renamed from: d */
    public final wg61 f175385d;

    public pa4(boolean z, boolean z2, bji bjiVar) {
        this.f175382a = z;
        this.f175383b = z2;
        this.f175384c = bjiVar;
        this.f175385d = new wg61(new ga4(this, 8));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m69432a() {
        pa4 pa4Var = (pa4) this.f175385d.getValue();
        return pa4Var != null ? pa4Var.m69432a() : this.f175382a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m69433b() {
        pa4 pa4Var = (pa4) this.f175385d.getValue();
        return pa4Var != null ? pa4Var.m69433b() : this.f175383b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("stream_reporting_tracker_debug_tracing_enabled", "android-libs-betamax-royalty-stream-reporting", m69432a()), new k8a("stream_reporting_tracker_non_context_player_enabled", "android-libs-betamax-royalty-stream-reporting", m69433b()));
    }

    public pa4(bji bjiVar) {
        this(false, true, bjiVar);
    }
}
