package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class u04 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f225379a;

    /* JADX INFO: renamed from: b */
    public final bji f225380b;

    /* JADX INFO: renamed from: c */
    public final wg61 f225381c = new wg61(new ey3(this, 21));

    public u04(boolean z, bji bjiVar) {
        this.f225379a = z;
        this.f225380b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m82110a() {
        u04 u04Var = (u04) this.f225381c.getValue();
        return u04Var != null ? u04Var.m82110a() : this.f225379a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("enable_android_app_exit_reason", "android-crash-reporting", m82110a()));
    }
}
