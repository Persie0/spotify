package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class x14 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f257058a;

    /* JADX INFO: renamed from: b */
    public final bji f257059b;

    /* JADX INFO: renamed from: c */
    public final wg61 f257060c = new wg61(new u14(this, 2));

    public x14(int i, bji bjiVar) {
        this.f257058a = i;
        this.f257059b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m89620a() {
        x14 x14Var = (x14) this.f257060c.getValue();
        return x14Var != null ? x14Var.m89620a() : this.f257058a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("cooldown_ms", "android-device-predictability-nudge", m89620a(), 0, 86400000));
    }
}
