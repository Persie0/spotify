package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class we4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f250425a;

    /* JADX INFO: renamed from: b */
    public final bji f250426b;

    /* JADX INFO: renamed from: c */
    public final wg61 f250427c;

    public we4(boolean z, bji bjiVar) {
        this.f250425a = z;
        this.f250426b = bjiVar;
        this.f250427c = new wg61(new ne4(this, 8));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m87855a() {
        we4 we4Var = (we4) this.f250427c.getValue();
        return we4Var != null ? we4Var.m87855a() : this.f250425a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("entity_page_enabled", "android-list-ux-platform-consumers-trending-near-you-shared", m87855a()));
    }

    public we4(bji bjiVar) {
        this(false, bjiVar);
    }
}
