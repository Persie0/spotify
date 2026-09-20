package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class dos extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51107a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f51108b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f51109c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dos(gh00 gh00Var, gh00 gh00Var2, int i) {
        super(1);
        this.f51107a = i;
        this.f51108b = gh00Var;
        this.f51109c = gh00Var2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f51107a) {
            case 0:
                Object objInvoke = this.f51108b.invoke(obj);
                if (objInvoke != null) {
                    this.f51109c.invoke(objInvoke);
                }
                return w2a1.f247311a;
            case 1:
                return this.f51109c.invoke(this.f51108b.invoke(obj));
            case 2:
                int iOrdinal = ((aze0) obj).ordinal();
                gh00 gh00Var = this.f51109c;
                oyf0 oyf0Var = oyf0.f171759a;
                gh00 gh00Var2 = this.f51108b;
                if (iOrdinal == 0) {
                    gh00Var2.invoke(oyf0Var);
                    gh00Var.invoke(cyf0.f43264a);
                } else if (iOrdinal == 1) {
                    gh00Var2.invoke(oyf0Var);
                    gh00Var.invoke(new dyf0(true));
                } else if (iOrdinal == 2) {
                    gh00Var2.invoke(oyf0Var);
                    gh00Var.invoke(new dyf0(false));
                } else if (iOrdinal != 3 && iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return w2a1.f247311a;
            default:
                int iOrdinal2 = ((aze0) obj).ordinal();
                gh00 gh00Var3 = this.f51109c;
                uzf0 uzf0Var = uzf0.f235548a;
                gh00 gh00Var4 = this.f51108b;
                if (iOrdinal2 == 0) {
                    gh00Var4.invoke(uzf0Var);
                    gh00Var3.invoke(ozf0.f172262a);
                } else if (iOrdinal2 == 1) {
                    gh00Var4.invoke(uzf0Var);
                    gh00Var3.invoke(new pzf0(true));
                } else if (iOrdinal2 == 2) {
                    gh00Var4.invoke(uzf0Var);
                    gh00Var3.invoke(new pzf0(false));
                } else if (iOrdinal2 != 3 && iOrdinal2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return w2a1.f247311a;
        }
    }
}
