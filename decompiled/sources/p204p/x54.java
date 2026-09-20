package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class x54 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f258276a;

    /* JADX INFO: renamed from: b */
    public final bji f258277b;

    /* JADX INFO: renamed from: c */
    public final wg61 f258278c = new wg61(new o54(this, 6));

    public x54(boolean z, bji bjiVar) {
        this.f258276a = z;
        this.f258277b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m89962a() {
        x54 x54Var = (x54) this.f258278c.getValue();
        return x54Var != null ? x54Var.m89962a() : this.f258276a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_queue_peek_on_add", "android-feature-nowplaying-queue-navigation", m89962a()));
    }
}
