package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ud4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f229163a;

    /* JADX INFO: renamed from: b */
    public final bji f229164b;

    /* JADX INFO: renamed from: c */
    public final wg61 f229165c;

    public ud4(boolean z, bji bjiVar) {
        this.f229163a = z;
        this.f229164b = bjiVar;
        this.f229165c = new wg61(new dd4(this, 14));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m82824a() {
        ud4 ud4Var = (ud4) this.f229165c.getValue();
        return ud4Var != null ? ud4Var.m82824a() : this.f229163a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("row_slots_enabled", "android-list-ux-platform-consumers-celebrity-blend-shared", m82824a()));
    }

    public ud4(bji bjiVar) {
        this(false, bjiVar);
    }
}
