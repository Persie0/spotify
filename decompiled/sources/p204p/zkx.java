package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class zkx extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f283858a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wyz0 f283859b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f283860c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zkx(wyz0 wyz0Var, gh00 gh00Var, int i) {
        super(1);
        this.f283858a = i;
        this.f283859b = wyz0Var;
        this.f283860c = gh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f283858a) {
            case 0:
                if (!(((qyz0) obj) instanceof qyz0)) {
                    throw new NoWhenBranchMatchedException();
                }
                wyz0 wyz0Var = this.f283859b;
                syz0 syz0Var = wyz0Var.f256416c;
                String str = wyz0Var.f256414a;
                syz0 syz0Var2 = syz0.f215350b;
                gh00 gh00Var = this.f283860c;
                if (syz0Var == syz0Var2) {
                    gh00Var.invoke(new uyz0(str));
                } else {
                    gh00Var.invoke(new tyz0(str));
                }
                return w2a1.f247311a;
            default:
                if (!(((qyz0) obj) instanceof qyz0)) {
                    throw new NoWhenBranchMatchedException();
                }
                wyz0 wyz0Var2 = this.f283859b;
                syz0 syz0Var3 = wyz0Var2.f256416c;
                String str2 = wyz0Var2.f256414a;
                syz0 syz0Var4 = syz0.f215350b;
                gh00 gh00Var2 = this.f283860c;
                if (syz0Var3 == syz0Var4) {
                    gh00Var2.invoke(new uyz0(str2));
                } else {
                    gh00Var2.invoke(new tyz0(str2));
                }
                return w2a1.f247311a;
        }
    }
}
