package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class hv4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f95580a;

    /* JADX INFO: renamed from: b */
    public final wy91 f95581b;

    /* JADX INFO: renamed from: c */
    public final wg61 f95582c = new wg61(new uu4(this, 8));

    public hv4(boolean z, saw0 saw0Var) {
        this.f95580a = z;
        this.f95581b = saw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m48719a() {
        hv4 hv4Var = (hv4) this.f95582c.getValue();
        return hv4Var != null ? hv4Var.m48719a() : this.f95580a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("is_miui_widget_enabled", "android-widgets-miuidynamicnpvwidget", m48719a()));
    }
}
