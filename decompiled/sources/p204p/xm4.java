package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xm4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f263283a;

    /* JADX INFO: renamed from: b */
    public final bji f263284b;

    /* JADX INFO: renamed from: c */
    public final wg61 f263285c = new wg61(new jk4(this, 27));

    public xm4(boolean z, bji bjiVar) {
        this.f263283a = z;
        this.f263284b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m91447a() {
        xm4 xm4Var = (xm4) this.f263285c.getValue();
        return xm4Var != null ? xm4Var.m91447a() : this.f263283a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_resumption_progress_api", "android-progress-resumption-lib", m91447a()));
    }
}
