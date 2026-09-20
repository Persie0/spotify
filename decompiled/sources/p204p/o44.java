package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o44 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f161545a;

    /* JADX INFO: renamed from: b */
    public final bji f161546b;

    /* JADX INFO: renamed from: c */
    public final wg61 f161547c = new wg61(new y34(this, 13));

    public o44(boolean z, bji bjiVar) {
        this.f161545a = z;
        this.f161546b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m66232a() {
        o44 o44Var = (o44) this.f161547c.getValue();
        return o44Var != null ? o44Var.m66232a() : this.f161545a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_content_filtering", "android-feature-content-filtering", m66232a()));
    }
}
