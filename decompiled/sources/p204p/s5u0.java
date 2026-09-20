package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class s5u0 extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ wtb f205909a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f205910b;

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        s5u0 s5u0Var = new s5u0(3, (fbk) obj3);
        s5u0Var.f205909a = (wtb) obj;
        s5u0Var.f205910b = zBooleanValue;
        return s5u0Var.invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        wtb wtbVar = this.f205909a;
        boolean z = this.f205910b;
        bga.m29073P(obj);
        if (!(wtbVar instanceof rtb) && !(wtbVar instanceof utb)) {
            z = false;
            if (!(wtbVar instanceof stb) && !(wtbVar instanceof ttb) && !(wtbVar instanceof vtb)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return qyg1.m74178H(z);
    }
}
