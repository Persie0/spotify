package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class lhf0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f133556a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f133557b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qf40 f133558c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ kqi0 f133559d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhf0(gh00 gh00Var, qf40 qf40Var, kqi0 kqi0Var) {
        super(1);
        this.f133557b = gh00Var;
        this.f133558c = qf40Var;
        this.f133559d = kqi0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f133556a) {
            case 0:
                kqi0 kqi0Var = this.f133559d;
                kqi0Var.setValue((Integer) obj);
                this.f133557b.invoke(new xgf0(((Number) obj).intValue(), this.f133558c.indexOf(kqi0Var.getValue())));
                return w2a1.f247311a;
            default:
                h2r0 h2r0Var = (h2r0) obj;
                kqi0 kqi0Var2 = this.f133559d;
                if (!h2r0Var.equals((h2r0) kqi0Var2.getValue())) {
                    boolean z = h2r0Var instanceof e2r0;
                    qf40 qf40Var = this.f133558c;
                    gh00 gh00Var = this.f133557b;
                    if (z) {
                        gh00Var.invoke(new qwf0(qf40Var.indexOf(h2r0Var)));
                    } else if (h2r0Var instanceof f2r0) {
                        gh00Var.invoke(new swf0(qf40Var.indexOf(h2r0Var)));
                    } else {
                        if (!(h2r0Var instanceof g2r0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        gh00Var.invoke(new vwf0(((g2r0) h2r0Var).f76001a, qf40Var.indexOf(h2r0Var)));
                    }
                }
                kqi0Var2.setValue(h2r0Var);
                return w2a1.f247311a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhf0(kqi0 kqi0Var, gh00 gh00Var, qf40 qf40Var) {
        super(1);
        this.f133559d = kqi0Var;
        this.f133557b = gh00Var;
        this.f133558c = qf40Var;
    }
}
