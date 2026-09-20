package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class azt extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21679a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eh00 f21680b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f21681c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ azt(eh00 eh00Var, gh00 gh00Var, int i) {
        super(1);
        this.f21679a = i;
        this.f21680b = eh00Var;
        this.f21681c = gh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f21679a) {
            case 0:
                this.f21681c.invoke((String) obj);
                this.f21680b.invoke();
                return w2a1.f247311a;
            case 1:
                this.f21680b.invoke();
                this.f21681c.invoke(new icy((String) obj));
                return w2a1.f247311a;
            case 2:
                ukp0 ukp0Var = (ukp0) obj;
                if (ukp0Var.equals(skp0.f210179a)) {
                    this.f21680b.invoke();
                } else {
                    if (!(ukp0Var instanceof tkp0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f21681c.invoke(new vpe0(((tkp0) ukp0Var).f221197a));
                }
                return w2a1.f247311a;
            case 3:
                hsp0 hsp0Var = (hsp0) obj;
                if (hsp0Var.equals(fsp0.f72917a)) {
                    this.f21680b.invoke();
                } else {
                    if (!(hsp0Var instanceof gsp0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f21681c.invoke(new vpe0(((gsp0) hsp0Var).f84003a));
                }
                return w2a1.f247311a;
            case 4:
                hsp0 hsp0Var2 = (hsp0) obj;
                if (hsp0Var2.equals(fsp0.f72917a)) {
                    this.f21680b.invoke();
                } else {
                    if (!(hsp0Var2 instanceof gsp0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f21681c.invoke(new vpe0(((gsp0) hsp0Var2).f84003a));
                }
                return w2a1.f247311a;
            default:
                this.f21680b.invoke();
                this.f21681c.invoke((vda1) obj);
                return w2a1.f247311a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azt(gh00 gh00Var, eh00 eh00Var) {
        super(1);
        this.f21679a = 0;
        this.f21681c = gh00Var;
        this.f21680b = eh00Var;
    }
}
