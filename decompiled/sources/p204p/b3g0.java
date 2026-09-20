package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class b3g0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23045a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e3g0 f23046b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b3g0(e3g0 e3g0Var, int i) {
        super(1);
        this.f23045a = i;
        this.f23046b = e3g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002c  */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        Object wof0Var;
        switch (this.f23045a) {
            case 0:
                l5g0 l5g0Var = (l5g0) obj;
                e3g0 e3g0Var = this.f23046b;
                kbf0 kbf0Var = e3g0Var.f55794g;
                if (wj50.m88271j(l5g0Var, j5g0.f108964a)) {
                    wof0Var = kof0.f124777a;
                } else {
                    if (!wj50.m88271j(l5g0Var, k5g0.f119511a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pvf0 pvf0Var = e3g0Var.f55790c;
                    String str = pvf0Var.f181735a;
                    String str2 = pvf0Var.f181736b.f17788b;
                    aox0 aox0Var = pvf0Var.f181737c;
                    wof0Var = new wof0(str, str2, aox0Var.f17787a, aox0Var.f17788b);
                }
                kbf0Var.invoke(wof0Var);
                return w2a1.f247311a;
            default:
                tl70 tl70Var = (tl70) obj;
                String str3 = tl70Var.f221351b;
                e3g0 e3g0Var2 = this.f23046b;
                aox0 aox0Var2 = e3g0Var2.f55790c.f181737c;
                String str4 = aox0Var2.f17787a;
                String str5 = aox0Var2.f17788b;
                String str6 = tl70Var.f221350a;
                if (wj50.m88271j(str6, str4)) {
                    String str7 = str3 == null ? "" : str3;
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (!str7.equals(str5)) {
                        e3g0Var2.f55794g.invoke(new zof0(str6, str3, tl70Var.f221352c, tl70Var.f221353d));
                    }
                } else {
                    e3g0Var2.f55794g.invoke(new zof0(str6, str3, tl70Var.f221352c, tl70Var.f221353d));
                }
                return w2a1.f247311a;
        }
    }
}
