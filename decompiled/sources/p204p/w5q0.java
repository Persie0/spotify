package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class w5q0 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f248170a;

    /* JADX INFO: renamed from: b */
    public final bji f248171b;

    /* JADX INFO: renamed from: c */
    public final wg61 f248172c;

    public w5q0(boolean z, bji bjiVar) {
        this.f248170a = z;
        this.f248171b = bjiVar;
        this.f248172c = new wg61(new fyo0(this, 15));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m87257a() {
        w5q0 w5q0Var = (w5q0) this.f248172c.getValue();
        return w5q0Var != null ? w5q0Var.m87257a() : this.f248170a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("content_agnostic_show_menu_loader_enabled", "podcast-ui-platform-contextmenuimpl", m87257a()));
    }

    public w5q0(bji bjiVar) {
        this(false, bjiVar);
    }
}
