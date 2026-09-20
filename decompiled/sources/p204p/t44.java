package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class t44 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f216893a;

    /* JADX INFO: renamed from: b */
    public final bji f216894b;

    /* JADX INFO: renamed from: c */
    public final wg61 f216895c = new wg61(new y34(this, 17));

    public t44(boolean z, bji bjiVar) {
        this.f216893a = z;
        this.f216894b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m80030a() {
        t44 t44Var = (t44) this.f216895c.getValue();
        return t44Var != null ? t44Var.m80030a() : this.f216893a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("enable_composer_page", "android-feature-creator-root-page", m80030a()));
    }
}
