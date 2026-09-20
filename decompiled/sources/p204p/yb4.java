package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class yb4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f271068a;

    /* JADX INFO: renamed from: b */
    public final bji f271069b;

    /* JADX INFO: renamed from: c */
    public final wg61 f271070c = new wg61(new sb4(this, 5));

    public yb4(boolean z, bji bjiVar) {
        this.f271068a = z;
        this.f271069b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m93231a() {
        yb4 yb4Var = (yb4) this.f271070c.getValue();
        return yb4Var != null ? yb4Var.m93231a() : this.f271068a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("lazy_child_elements_enabled", "android-libs-nowplaying-elements-playbackcontrolswitcher", m93231a()));
    }
}
