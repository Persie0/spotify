package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kv4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f126772a;

    /* JADX INFO: renamed from: b */
    public final wy91 f126773b;

    /* JADX INFO: renamed from: c */
    public final wg61 f126774c = new wg61(new uu4(this, 10));

    public kv4(boolean z, saw0 saw0Var) {
        this.f126772a = z;
        this.f126773b = saw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m57438a() {
        kv4 kv4Var = (kv4) this.f126774c.getValue();
        return kv4Var != null ? kv4Var.m57438a() : this.f126772a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("material_system_theme_unauth", "android-widgets-npvwidget", m57438a()));
    }
}
