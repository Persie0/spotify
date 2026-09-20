package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fl4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f70683a;

    /* JADX INFO: renamed from: b */
    public final bji f70684b;

    /* JADX INFO: renamed from: c */
    public final wg61 f70685c = new wg61(new jk4(this, 4));

    public fl4(boolean z, bji bjiVar) {
        this.f70683a = z;
        this.f70684b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m41981a() {
        fl4 fl4Var = (fl4) this.f70685c.getValue();
        return fl4Var != null ? fl4Var.m41981a() : this.f70683a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("is_trigger_enabled", "android-personalizedsets-recsqualitytrigger-impl", m41981a()));
    }
}
