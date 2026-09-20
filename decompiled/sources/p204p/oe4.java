package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class oe4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f164337a;

    /* JADX INFO: renamed from: b */
    public final bji f164338b;

    /* JADX INFO: renamed from: c */
    public final wg61 f164339c;

    public oe4(boolean z, bji bjiVar) {
        this.f164337a = z;
        this.f164338b = bjiVar;
        this.f164339c = new wg61(new ne4(this, 0));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m66789a() {
        oe4 oe4Var = (oe4) this.f164339c.getValue();
        return oe4Var != null ? oe4Var.m66789a() : this.f164337a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("context_menu_as_header_trailing_action_enabled", "android-list-ux-platform-consumers-sponsoredplaylist-shared", m66789a()));
    }

    public oe4(bji bjiVar) {
        this(false, bjiVar);
    }
}
