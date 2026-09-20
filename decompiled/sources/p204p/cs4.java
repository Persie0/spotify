package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cs4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f41460a;

    /* JADX INFO: renamed from: b */
    public final int f41461b;

    /* JADX INFO: renamed from: c */
    public final bji f41462c;

    /* JADX INFO: renamed from: d */
    public final wg61 f41463d = new wg61(new zr4(this, 2));

    public cs4(int i, bji bjiVar, boolean z) {
        this.f41460a = z;
        this.f41461b = i;
        this.f41462c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m33754a() {
        cs4 cs4Var = (cs4) this.f41463d.getValue();
        return cs4Var != null ? cs4Var.m33754a() : this.f41460a;
    }

    /* JADX INFO: renamed from: b */
    public final int m33755b() {
        cs4 cs4Var = (cs4) this.f41463d.getValue();
        return cs4Var != null ? cs4Var.m33755b() : this.f41461b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_method_tracing", "android-trace-profile", m33754a()), new k8a("trace_sampling_rate", "android-trace-profile", m33755b(), 9000, 1000000));
    }
}
