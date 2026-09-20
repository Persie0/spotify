package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class nue0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f158616a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sne0 f158617b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f158618c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nue0(gh00 gh00Var, sne0 sne0Var) {
        super(1);
        this.f158616a = 3;
        this.f158618c = gh00Var;
        this.f158617b = sne0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f158616a) {
            case 0:
                this.f158617b.f210906j.invoke();
                this.f158618c.invoke(new zme0(((whu0) obj).f251445a));
                return w2a1.f247311a;
            case 1:
                d850 d850Var = (d850) obj;
                this.f158617b.f210906j.invoke();
                this.f158618c.invoke(new wme0(d850Var != null ? d850Var.f46380a : null));
                return w2a1.f247311a;
            case 2:
                vle0 vle0Var = (vle0) obj;
                boolean zEquals = vle0Var.equals(rle0.f200300a);
                sne0 sne0Var = this.f158617b;
                gh00 gh00Var = this.f158618c;
                if (zEquals) {
                    if (sne0Var.f210910n.equals(kne0.f124397a)) {
                        gh00Var.invoke(xme0.f263349a);
                    }
                } else if (vle0Var.equals(sle0.f210408a)) {
                    rne0 rne0Var = sne0Var.f210902f;
                    if (((rne0Var instanceof qne0) || (rne0Var instanceof one0)) && (!sne0Var.f210910n.equals(hne0.f93315a) || sne0Var.f210911o)) {
                        gh00Var.invoke(yme0.f274238a);
                    }
                } else if (vle0Var instanceof tle0) {
                    gh00Var.invoke(bne0.f28814a);
                } else {
                    if (!(vle0Var instanceof ule0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gh00Var.invoke(new dne0(((ule0) vle0Var).f231547a));
                }
                return w2a1.f247311a;
            default:
                egu0 egu0Var = (egu0) obj;
                boolean zEquals2 = egu0Var.equals(cgu0.f37811a);
                gh00 gh00Var2 = this.f158618c;
                if (zEquals2) {
                    gh00Var2.invoke(new fne0(this.f158617b.f210905i));
                } else {
                    if (!(egu0Var instanceof dgu0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gh00Var2.invoke(new cne0(((dgu0) egu0Var).f48898a));
                }
                return w2a1.f247311a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nue0(sne0 sne0Var, gh00 gh00Var, int i) {
        super(1);
        this.f158616a = i;
        this.f158617b = sne0Var;
        this.f158618c = gh00Var;
    }
}
