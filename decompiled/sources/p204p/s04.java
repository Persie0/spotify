package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class s04 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f204297a;

    /* JADX INFO: renamed from: b */
    public final bji f204298b;

    /* JADX INFO: renamed from: c */
    public final wg61 f204299c;

    public s04(boolean z, bji bjiVar) {
        this.f204297a = z;
        this.f204298b = bjiVar;
        this.f204299c = new wg61(new ey3(this, 19));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m76846a() {
        s04 s04Var = (s04) this.f204299c.getValue();
        return s04Var != null ? s04Var.m76846a() : this.f204297a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("premium_upsell_panel_enabled", "android-context-menu", m76846a()));
    }

    public s04(bji bjiVar) {
        this(false, bjiVar);
    }
}
