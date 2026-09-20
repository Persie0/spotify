package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class kf4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f122050a;

    /* JADX INFO: renamed from: b */
    public final bji f122051b;

    /* JADX INFO: renamed from: c */
    public final wg61 f122052c;

    public kf4(boolean z, bji bjiVar) {
        this.f122050a = z;
        this.f122051b = bjiVar;
        this.f122052c = new wg61(new ne4(this, 18));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m56246a() {
        kf4 kf4Var = (kf4) this.f122052c.getValue();
        return kf4Var != null ? kf4Var.m56246a() : this.f122050a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("login_method_page_enabled", "android-login-settings-loginmethods-impl", m56246a()));
    }

    public kf4(bji bjiVar) {
        this(false, bjiVar);
    }
}
