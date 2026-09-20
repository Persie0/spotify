package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class uu3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f234095a;

    /* JADX INFO: renamed from: b */
    public final bji f234096b;

    /* JADX INFO: renamed from: c */
    public final wg61 f234097c = new wg61(new ju3(this, 8));

    public uu3(boolean z, bji bjiVar) {
        this.f234095a = z;
        this.f234096b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m83966a() {
        uu3 uu3Var = (uu3) this.f234097c.getValue();
        return uu3Var != null ? uu3Var.m83966a() : this.f234095a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("use_accessory_state_manager", "android-app-state-accessories-bluetooth", m83966a()));
    }
}
