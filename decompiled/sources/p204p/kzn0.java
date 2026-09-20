package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class kzn0 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f128166a;

    /* JADX INFO: renamed from: b */
    public final bji f128167b;

    /* JADX INFO: renamed from: c */
    public final wg61 f128168c = new wg61(new pgm0(this, 12));

    public kzn0(boolean z, bji bjiVar) {
        this.f128166a = z;
        this.f128167b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m57763a() {
        kzn0 kzn0Var = (kzn0) this.f128168c.getValue();
        return kzn0Var != null ? kzn0Var.m57763a() : this.f128166a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("replace_go_to_settings_with_close", "pigeon-onboarding", m57763a()));
    }
}
