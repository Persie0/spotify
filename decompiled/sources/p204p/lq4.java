package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class lq4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f135941a;

    /* JADX INFO: renamed from: b */
    public final bji f135942b;

    /* JADX INFO: renamed from: c */
    public final wg61 f135943c = new wg61(new kp4(this, 20));

    public lq4(boolean z, bji bjiVar) {
        this.f135941a = z;
        this.f135942b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m59693a() {
        lq4 lq4Var = (lq4) this.f135943c.getValue();
        return lq4Var != null ? lq4Var.m59693a() : this.f135941a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("playlist_history_enabled", "android-system-playlist-editing-history", m59693a()));
    }
}
