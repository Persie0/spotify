package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d04 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f43743a;

    /* JADX INFO: renamed from: b */
    public final bji f43744b;

    /* JADX INFO: renamed from: c */
    public final wg61 f43745c = new wg61(new ey3(this, 13));

    public d04(boolean z, bji bjiVar) {
        this.f43743a = z;
        this.f43744b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m34516a() {
        d04 d04Var = (d04) this.f43745c.getValue();
        return d04Var != null ? d04Var.m34516a() : this.f43743a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("token_exchanger_timekeeper_enabled", "android-connectivity-cosmosauthtoken", m34516a()));
    }
}
