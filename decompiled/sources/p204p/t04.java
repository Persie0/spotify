package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t04 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f215755a;

    /* JADX INFO: renamed from: b */
    public final bji f215756b;

    /* JADX INFO: renamed from: c */
    public final wg61 f215757c = new wg61(new ey3(this, 20));

    public t04(boolean z, bji bjiVar) {
        this.f215755a = z;
        this.f215756b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m79770a() {
        t04 t04Var = (t04) this.f215757c.getValue();
        return t04Var != null ? t04Var.m79770a() : this.f215755a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("output_device_enabled", "android-contextual-attributes-manager", m79770a()));
    }
}
