package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lp4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f135610a;

    /* JADX INFO: renamed from: b */
    public final boolean f135611b;

    /* JADX INFO: renamed from: c */
    public final bji f135612c;

    /* JADX INFO: renamed from: d */
    public final wg61 f135613d = new wg61(new kp4(this, 0));

    public lp4(boolean z, boolean z2, bji bjiVar) {
        this.f135610a = z;
        this.f135611b = z2;
        this.f135612c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m59585a() {
        lp4 lp4Var = (lp4) this.f135613d.getValue();
        return lp4Var != null ? lp4Var.m59585a() : this.f135610a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m59586b() {
        lp4 lp4Var = (lp4) this.f135613d.getValue();
        return lp4Var != null ? lp4Var.m59586b() : this.f135611b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_stream_reporting_logger_prototype", "android-streamreporting-common-impl", m59585a()), new k8a("enforce_stream_reporting_contract", "android-streamreporting-common-impl", m59586b()));
    }
}
