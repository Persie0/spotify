package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gq4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f83339a;

    /* JADX INFO: renamed from: b */
    public final bji f83340b;

    /* JADX INFO: renamed from: c */
    public final wg61 f83341c = new wg61(new kp4(this, 16));

    public gq4(boolean z, bji bjiVar) {
        this.f83339a = z;
        this.f83340b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m45407a() {
        gq4 gq4Var = (gq4) this.f83341c.getValue();
        return gq4Var != null ? gq4Var.m45407a() : this.f83339a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("disable_auto_preview_when_active_npv", "android-system-multiplayer-devicestateprovider", m45407a()));
    }
}
