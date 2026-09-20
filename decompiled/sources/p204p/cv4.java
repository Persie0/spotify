package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cv4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f42288a;

    /* JADX INFO: renamed from: b */
    public final bji f42289b;

    /* JADX INFO: renamed from: c */
    public final wg61 f42290c = new wg61(new uu4(this, 4));

    public cv4(boolean z, bji bjiVar) {
        this.f42288a = z;
        this.f42289b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m33975a() {
        cv4 cv4Var = (cv4) this.f42290c.getValue();
        return cv4Var != null ? cv4Var.m33975a() : this.f42288a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_active_device_id_saver", "android-where-to-play", m33975a()));
    }
}
