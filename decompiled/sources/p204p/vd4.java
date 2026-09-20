package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class vd4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f240309a;

    /* JADX INFO: renamed from: b */
    public final bji f240310b;

    /* JADX INFO: renamed from: c */
    public final wg61 f240311c;

    public vd4(boolean z, bji bjiVar) {
        this.f240309a = z;
        this.f240310b = bjiVar;
        this.f240311c = new wg61(new dd4(this, 15));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m85208a() {
        vd4 vd4Var = (vd4) this.f240311c.getValue();
        return vd4Var != null ? vd4Var.m85208a() : this.f240309a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_filter_chips_chip_bar_action", "android-list-ux-platform-consumers-clips-shared", m85208a()));
    }

    public vd4(bji bjiVar) {
        this(false, bjiVar);
    }
}
