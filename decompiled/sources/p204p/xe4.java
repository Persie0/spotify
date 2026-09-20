package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class xe4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f260629a;

    /* JADX INFO: renamed from: b */
    public final bji f260630b;

    /* JADX INFO: renamed from: c */
    public final wg61 f260631c = new wg61(new ne4(this, 9));

    public xe4(boolean z, bji bjiVar) {
        this.f260629a = z;
        this.f260630b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m90433a() {
        xe4 xe4Var = (xe4) this.f260631c.getValue();
        return xe4Var != null ? xe4Var.m90433a() : this.f260629a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("hack_use_carefully_may_be_removed_at_any_time_determine_number_of_header_actions_based_on_resources", "android-list-ux-platform-header-common-impl", m90433a()));
    }
}
