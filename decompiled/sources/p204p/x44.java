package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class x44 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f257977a;

    /* JADX INFO: renamed from: b */
    public final bji f257978b;

    /* JADX INFO: renamed from: c */
    public final wg61 f257979c = new wg61(new y34(this, 18));

    public x44(boolean z, bji bjiVar) {
        this.f257977a = z;
        this.f257978b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m89836a() {
        x44 x44Var = (x44) this.f257979c.getValue();
        return x44Var != null ? x44Var.m89836a() : this.f257977a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("experimental_episode_consumption_state_label_enabled", "android-feature-episode-subtitle-builder", m89836a()));
    }
}
