package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ms4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f146690a;

    /* JADX INFO: renamed from: b */
    public final bji f146691b;

    /* JADX INFO: renamed from: c */
    public final wg61 f146692c = new wg61(new zr4(this, 11));

    public ms4(boolean z, bji bjiVar) {
        this.f146690a = z;
        this.f146691b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m62700a() {
        ms4 ms4Var = (ms4) this.f146692c.getValue();
        return ms4Var != null ? ms4Var.m62700a() : this.f146690a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("is_dwell_time_logging_disabled", "android-ubi-dwell-time-logger-impl", m62700a()));
    }
}
