package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class t5e0 extends mb61 implements zh00 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ j5e0 f217285a;

    @Override // p204p.zh00
    /* JADX INFO: renamed from: e1 */
    public final Object mo25195e1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        t5e0 t5e0Var = new t5e0(5, (fbk) obj5);
        t5e0Var.f217285a = (j5e0) obj3;
        w2a1 w2a1Var = w2a1.f247311a;
        t5e0Var.invokeSuspend(w2a1Var);
        return w2a1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        j5e0 j5e0Var = this.f217285a;
        bga.m29073P(obj);
        if (j5e0Var != null) {
            return w2a1.f247311a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
