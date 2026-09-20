package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class dp4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f51161a;

    /* JADX INFO: renamed from: b */
    public final bji f51162b;

    /* JADX INFO: renamed from: c */
    public final wg61 f51163c = new wg61(new cn4(this, 27));

    public dp4(boolean z, bji bjiVar) {
        this.f51161a = z;
        this.f51162b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m36564a() {
        dp4 dp4Var = (dp4) this.f51163c.getValue();
        return dp4Var != null ? dp4Var.m36564a() : this.f51161a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_text_content_provider_registration", "android-shareconsumers-cardproviders", m36564a()));
    }
}
