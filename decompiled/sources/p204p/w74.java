package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class w74 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f248537a;

    /* JADX INFO: renamed from: b */
    public final bji f248538b;

    /* JADX INFO: renamed from: c */
    public final wg61 f248539c = new wg61(new f74(this, 13));

    public w74(boolean z, bji bjiVar) {
        this.f248537a = z;
        this.f248538b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m87314a() {
        w74 w74Var = (w74) this.f248539c.getValue();
        return w74Var != null ? w74Var.m87314a() : this.f248537a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("disable_loading_content", "android-feature-voice-assistant", m87314a()));
    }
}
