package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class zm4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f284152a;

    /* JADX INFO: renamed from: b */
    public final bji f284153b;

    /* JADX INFO: renamed from: c */
    public final wg61 f284154c = new wg61(new jk4(this, 29));

    public zm4(boolean z, bji bjiVar) {
        this.f284152a = z;
        this.f284153b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m96403a() {
        zm4 zm4Var = (zm4) this.f284154c.getValue();
        return zm4Var != null ? zm4Var.m96403a() : this.f284152a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("contextual_page_enabled", "android-promptedplaylists-ai-disclosure-sheet", m96403a()));
    }
}
