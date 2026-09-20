package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ld4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f132045a;

    /* JADX INFO: renamed from: b */
    public final bji f132046b;

    /* JADX INFO: renamed from: c */
    public final wg61 f132047c = new wg61(new dd4(this, 5));

    public ld4(boolean z, bji bjiVar) {
        this.f132045a = z;
        this.f132046b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m58731a() {
        ld4 ld4Var = (ld4) this.f132047c.getValue();
        return ld4Var != null ? ld4Var.m58731a() : this.f132045a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("deduplicate_state_updates_enabled", "android-list-platform-player-impl", m58731a()));
    }
}
