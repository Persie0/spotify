package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class em4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f60811a;

    /* JADX INFO: renamed from: b */
    public final bji f60812b;

    /* JADX INFO: renamed from: c */
    public final wg61 f60813c = new wg61(new jk4(this, 19));

    public em4(boolean z, bji bjiVar) {
        this.f60811a = z;
        this.f60812b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m39401a() {
        em4 em4Var = (em4) this.f60813c.getValue();
        return em4Var != null ? em4Var.m39401a() : this.f60811a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("is_passthrough_creator_timestamp_enabled", "android-podcast-share", m39401a()));
    }
}
