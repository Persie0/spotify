package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class lze extends mb61 implements zh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f138353a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f138354b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lze(int i, int i2, fbk fbkVar) {
        super(i, fbkVar);
        this.f138353a = i2;
    }

    @Override // p204p.zh00
    /* JADX INFO: renamed from: e1 */
    public final Object mo25195e1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f138353a) {
            case 0:
                lze lzeVar = new lze(5, 0, (fbk) obj5);
                lzeVar.f138354b = (kze) obj;
                w2a1 w2a1Var = w2a1.f247311a;
                lzeVar.invokeSuspend(w2a1Var);
                return w2a1Var;
            case 1:
                lze lzeVar2 = new lze(5, 1, (fbk) obj5);
                lzeVar2.f138354b = (qw10) obj3;
                w2a1 w2a1Var2 = w2a1.f247311a;
                lzeVar2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
            case 2:
                lze lzeVar3 = new lze(5, 2, (fbk) obj5);
                lzeVar3.f138354b = (j5e0) obj3;
                w2a1 w2a1Var3 = w2a1.f247311a;
                lzeVar3.invokeSuspend(w2a1Var3);
                return w2a1Var3;
            case 3:
                lze lzeVar4 = new lze(5, 3, (fbk) obj5);
                lzeVar4.f138354b = (eiv0) obj3;
                w2a1 w2a1Var4 = w2a1.f247311a;
                lzeVar4.invokeSuspend(w2a1Var4);
                return w2a1Var4;
            case 4:
                lze lzeVar5 = new lze(5, 4, (fbk) obj5);
                lzeVar5.f138354b = (m4y0) obj3;
                w2a1 w2a1Var5 = w2a1.f247311a;
                lzeVar5.invokeSuspend(w2a1Var5);
                return w2a1Var5;
            case 5:
                lze lzeVar6 = new lze(5, 5, (fbk) obj5);
                lzeVar6.f138354b = (ysb1) obj;
                w2a1 w2a1Var6 = w2a1.f247311a;
                lzeVar6.invokeSuspend(w2a1Var6);
                return w2a1Var6;
            default:
                lze lzeVar7 = new lze(5, 6, (fbk) obj5);
                lzeVar7.f138354b = (lyb1) obj;
                w2a1 w2a1Var7 = w2a1.f247311a;
                lzeVar7.invokeSuspend(w2a1Var7);
                return w2a1Var7;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f138353a) {
            case 0:
                kze kzeVar = (kze) this.f138354b;
                bga.m29073P(obj);
                kzeVar.f128093a.invoke();
                return w2a1.f247311a;
            case 1:
                qw10 qw10Var = (qw10) this.f138354b;
                bga.m29073P(obj);
                if (qw10Var instanceof qw10) {
                    return w2a1.f247311a;
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                j5e0 j5e0Var = (j5e0) this.f138354b;
                bga.m29073P(obj);
                if (j5e0Var != null) {
                    return w2a1.f247311a;
                }
                throw new NoWhenBranchMatchedException();
            case 3:
                eiv0 eiv0Var = (eiv0) this.f138354b;
                bga.m29073P(obj);
                if (eiv0Var instanceof eiv0) {
                    return w2a1.f247311a;
                }
                throw new NoWhenBranchMatchedException();
            case 4:
                m4y0 m4y0Var = (m4y0) this.f138354b;
                bga.m29073P(obj);
                if (m4y0Var instanceof m4y0) {
                    return w2a1.f247311a;
                }
                throw new NoWhenBranchMatchedException();
            case 5:
                ysb1 ysb1Var = (ysb1) this.f138354b;
                bga.m29073P(obj);
                ysb1Var.f275738a.invoke();
                return w2a1.f247311a;
            default:
                lyb1 lyb1Var = (lyb1) this.f138354b;
                bga.m29073P(obj);
                lyb1Var.f138027a.invoke();
                return w2a1.f247311a;
        }
    }
}
