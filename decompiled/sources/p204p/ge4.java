package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ge4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f79011a;

    /* JADX INFO: renamed from: b */
    public final bji f79012b;

    /* JADX INFO: renamed from: c */
    public final wg61 f79013c;

    public ge4(boolean z, bji bjiVar) {
        this.f79011a = z;
        this.f79012b = bjiVar;
        this.f79013c = new wg61(new dd4(this, 25));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m44449a() {
        ge4 ge4Var = (ge4) this.f79013c.getValue();
        return ge4Var != null ? ge4Var.m44449a() : this.f79011a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_filter_chips_chip_bar_action", "android-list-ux-platform-consumers-offlinebackup-shared", m44449a()));
    }

    public ge4(bji bjiVar) {
        this(false, bjiVar);
    }
}
