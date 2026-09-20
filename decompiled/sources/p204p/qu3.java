package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class qu3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f192552a;

    /* JADX INFO: renamed from: b */
    public final bji f192553b;

    /* JADX INFO: renamed from: c */
    public final wg61 f192554c = new wg61(new ju3(this, 6));

    public qu3(boolean z, bji bjiVar) {
        this.f192552a = z;
        this.f192553b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m73873a() {
        qu3 qu3Var = (qu3) this.f192554c.getValue();
        return qu3Var != null ? qu3Var.m73873a() : this.f192552a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("is_branch_initialisation_enabled", "android-allboarding-branch", m73873a()));
    }
}
