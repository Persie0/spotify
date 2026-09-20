package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class t6b0 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f217526a;

    /* JADX INFO: renamed from: b */
    public final bji f217527b;

    /* JADX INFO: renamed from: c */
    public final wg61 f217528c = new wg61(new t790(this, 25));

    public t6b0(boolean z, bji bjiVar) {
        this.f217526a = z;
        this.f217527b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m80158a() {
        t6b0 t6b0Var = (t6b0) this.f217528c.getValue();
        return t6b0Var != null ? t6b0Var.m80158a() : this.f217526a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("use_unboxing_onboarding_tour", "lossless-streaming", m80158a()));
    }
}
