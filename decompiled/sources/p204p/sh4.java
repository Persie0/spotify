package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class sh4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f209083a;

    /* JADX INFO: renamed from: b */
    public final bji f209084b;

    /* JADX INFO: renamed from: c */
    public final wg61 f209085c = new wg61(new bh4(this, 9));

    public sh4(boolean z, bji bjiVar) {
        this.f209083a = z;
        this.f209084b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m78124a() {
        sh4 sh4Var = (sh4) this.f209085c.getValue();
        return sh4Var != null ? sh4Var.m78124a() : this.f209083a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("mup_onboarding_v2_enabled", "android-multi-user-plan-verification-verification-code-onboarding", m78124a()));
    }
}
