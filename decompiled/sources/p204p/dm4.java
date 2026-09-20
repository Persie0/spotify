package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class dm4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f50419a;

    /* JADX INFO: renamed from: b */
    public final bji f50420b;

    /* JADX INFO: renamed from: c */
    public final wg61 f50421c;

    public dm4(boolean z, bji bjiVar) {
        this.f50419a = z;
        this.f50420b = bjiVar;
        this.f50421c = new wg61(new jk4(this, 18));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m36394a() {
        dm4 dm4Var = (dm4) this.f50421c.getValue();
        return dm4Var != null ? dm4Var.m36394a() : this.f50419a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("stop_player_on_context_end_enabled", "android-podcast-player", m36394a()));
    }

    public dm4(bji bjiVar) {
        this(false, bjiVar);
    }
}
