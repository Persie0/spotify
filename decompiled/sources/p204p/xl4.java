package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class xl4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f263027a;

    /* JADX INFO: renamed from: b */
    public final bji f263028b;

    /* JADX INFO: renamed from: c */
    public final wg61 f263029c = new wg61(new jk4(this, 13));

    public xl4(boolean z, bji bjiVar) {
        this.f263027a = z;
        this.f263028b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m91375a() {
        xl4 xl4Var = (xl4) this.f263029c.getValue();
        return xl4Var != null ? xl4Var.m91375a() : this.f263027a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("reorder_playlist_labels_enabled", "android-playlistediting-properties", m91375a()));
    }
}
