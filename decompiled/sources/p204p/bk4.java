package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bk4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f27829a;

    /* JADX INFO: renamed from: b */
    public final bji f27830b;

    /* JADX INFO: renamed from: c */
    public final wg61 f27831c = new wg61(new si4(this, 24));

    public bk4(boolean z, bji bjiVar) {
        this.f27829a = z;
        this.f27830b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m29576a() {
        bk4 bk4Var = (bk4) this.f27831c.getValue();
        return bk4Var != null ? bk4Var.m29576a() : this.f27829a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("personalised_home_in_system_ui", "android-oem-integrations-systemui", m29576a()));
    }
}
