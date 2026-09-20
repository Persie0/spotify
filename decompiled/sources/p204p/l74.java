package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class l74 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f130556a;

    /* JADX INFO: renamed from: b */
    public final bji f130557b;

    /* JADX INFO: renamed from: c */
    public final wg61 f130558c = new wg61(new f74(this, 5));

    public l74(boolean z, bji bjiVar) {
        this.f130556a = z;
        this.f130557b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m58391a() {
        l74 l74Var = (l74) this.f130558c.getValue();
        return l74Var != null ? l74Var.m58391a() : this.f130556a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("disable_for_static", "android-feature-transcript-excerpts", m58391a()));
    }
}
