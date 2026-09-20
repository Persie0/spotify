package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class uh4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f230355a;

    /* JADX INFO: renamed from: b */
    public final bji f230356b;

    /* JADX INFO: renamed from: c */
    public final wg61 f230357c = new wg61(new bh4(this, 11));

    public uh4(boolean z, bji bjiVar) {
        this.f230355a = z;
        this.f230356b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m83119a() {
        uh4 uh4Var = (uh4) this.f230357c.getValue();
        return uh4Var != null ? uh4Var.m83119a() : this.f230355a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("mup_notification_v2_enabled", "android-multi-user-plan-verification-verification-notification-banner", m83119a()));
    }
}
