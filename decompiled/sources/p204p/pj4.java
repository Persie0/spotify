package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class pj4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f178160a;

    /* JADX INFO: renamed from: b */
    public final bji f178161b;

    /* JADX INFO: renamed from: c */
    public final wg61 f178162c = new wg61(new si4(this, 20));

    public pj4(boolean z, bji bjiVar) {
        this.f178160a = z;
        this.f178161b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m70123a() {
        pj4 pj4Var = (pj4) this.f178162c.getValue();
        return pj4Var != null ? pj4Var.m70123a() : this.f178160a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_playback_control_switcher", "android-nowplayingmini-reinventfreemode", m70123a()));
    }
}
