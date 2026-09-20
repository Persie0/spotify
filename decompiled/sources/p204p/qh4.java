package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qh4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f188618a;

    /* JADX INFO: renamed from: b */
    public final bji f188619b;

    /* JADX INFO: renamed from: c */
    public final wg61 f188620c = new wg61(new bh4(this, 7));

    public qh4(boolean z, bji bjiVar) {
        this.f188618a = z;
        this.f188619b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m72784a() {
        qh4 qh4Var = (qh4) this.f188620c.getValue();
        return qh4Var != null ? qh4Var.m72784a() : this.f188618a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_service", "android-microsoft-continuity-service", m72784a()));
    }
}
