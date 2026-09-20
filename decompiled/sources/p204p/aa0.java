package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class aa0 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13697a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ba0 f13698b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aa0(ba0 ba0Var, int i) {
        super(4);
        this.f13697a = i;
        this.f13698b = ba0Var;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f13697a) {
            case 0:
                y90 y90Var = (y90) obj;
                ((Number) obj3).intValue();
                return ((ucp) this.f13698b.f25056b.get()).m82789a(y90Var.f270454a, y90Var.f270455b);
            default:
                y90 y90Var2 = (y90) obj2;
                if (!((x90) obj4).equals(x90.f259253a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ucp ucpVar = (ucp) this.f13698b.f25056b.get();
                String str = y90Var2.f270454a;
                String str2 = y90Var2.f270455b;
                boolean z = y90Var2.f270457d;
                qgg0 qgg0VarM82789a = ucpVar.m82789a(str, str2);
                nau nauVar = nau.f152117a;
                return z ? new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), qgg0VarM82789a.f188467b, st91.f213865b, System.currentTimeMillis()) : new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), qgg0VarM82789a.f188467b, st91.f213865b, System.currentTimeMillis());
        }
    }
}
