package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class oj4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f165952a;

    /* JADX INFO: renamed from: b */
    public final bji f165953b;

    /* JADX INFO: renamed from: c */
    public final wg61 f165954c = new wg61(new si4(this, 19));

    public oj4(boolean z, bji bjiVar) {
        this.f165952a = z;
        this.f165953b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m67085a() {
        oj4 oj4Var = (oj4) this.f165954c.getValue();
        return oj4Var != null ? oj4Var.m67085a() : this.f165952a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_playback_control_switcher", "android-nowplayingmini-defaultmode", m67085a()));
    }
}
