package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class oy3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f171649a;

    /* JADX INFO: renamed from: b */
    public final bji f171650b;

    /* JADX INFO: renamed from: c */
    public final wg61 f171651c = new wg61(new ey3(this, 5));

    public oy3(boolean z, bji bjiVar) {
        this.f171649a = z;
        this.f171650b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m68408a() {
        oy3 oy3Var = (oy3) this.f171651c.getValue();
        return oy3Var != null ? oy3Var.m68408a() : this.f171649a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("jumpstart_enabled", "android-car-mobile-jumpstart", m68408a()));
    }
}
