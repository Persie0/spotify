package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ny3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f159691a;

    /* JADX INFO: renamed from: b */
    public final bji f159692b;

    /* JADX INFO: renamed from: c */
    public final wg61 f159693c = new wg61(new ey3(this, 4));

    public ny3(boolean z, bji bjiVar) {
        this.f159691a = z;
        this.f159692b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m65868a() {
        ny3 ny3Var = (ny3) this.f159693c.getValue();
        return ny3Var != null ? ny3Var.m65868a() : this.f159691a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a(x09.f256832d, "android-car-mobile-interoperability-monitor", m65868a()));
    }
}
