package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ho4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f93450a;

    /* JADX INFO: renamed from: b */
    public final bji f93451b;

    /* JADX INFO: renamed from: c */
    public final wg61 f93452c = new wg61(new cn4(this, 24));

    public ho4(boolean z, bji bjiVar) {
        this.f93450a = z;
        this.f93451b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m48018a() {
        ho4 ho4Var = (ho4) this.f93452c.getValue();
        return ho4Var != null ? ho4Var.m48018a() : this.f93450a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_notifying_wearos_watch", "android-remotedownloads-page", m48018a()));
    }
}
