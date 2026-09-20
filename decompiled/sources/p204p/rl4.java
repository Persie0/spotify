package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class rl4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f200216a;

    /* JADX INFO: renamed from: b */
    public final bji f200217b;

    /* JADX INFO: renamed from: c */
    public final wg61 f200218c = new wg61(new jk4(this, 10));

    public rl4(boolean z, bji bjiVar) {
        this.f200216a = z;
        this.f200217b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m75811a() {
        rl4 rl4Var = (rl4) this.f200218c.getValue();
        return rl4Var != null ? rl4Var.m75811a() : this.f200216a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("can_send_message", "android-playlist-collaboration-playlist-participants-contextmenu", m75811a()));
    }
}
