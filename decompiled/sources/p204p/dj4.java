package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class dj4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f49546a;

    /* JADX INFO: renamed from: b */
    public final bji f49547b;

    /* JADX INFO: renamed from: c */
    public final wg61 f49548c = new wg61(new si4(this, 10));

    public dj4(boolean z, bji bjiVar) {
        this.f49546a = z;
        this.f49547b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m36149a() {
        dj4 dj4Var = (dj4) this.f49548c.getValue();
        return dj4Var != null ? dj4Var.m36149a() : this.f49546a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_agnostic_mode", "android-nowplaying-modes-agnosticmode", m36149a()));
    }
}
