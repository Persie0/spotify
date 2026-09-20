package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c44 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f33836a;

    /* JADX INFO: renamed from: b */
    public final bji f33837b;

    /* JADX INFO: renamed from: c */
    public final wg61 f33838c = new wg61(new y34(this, 3));

    public c44(boolean z, bji bjiVar) {
        this.f33836a = z;
        this.f33837b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m31419a() {
        c44 c44Var = (c44) this.f33838c.getValue();
        return c44Var != null ? c44Var.m31419a() : this.f33836a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("group_blends_enabled", "android-feature-blend-members", m31419a()));
    }
}
