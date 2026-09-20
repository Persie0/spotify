package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class b210 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f22466a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ th00 f22467b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f22468c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b210(th00 th00Var, String str, int i) {
        super(1);
        this.f22466a = i;
        this.f22467b = th00Var;
        this.f22468c = str;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f22466a) {
            case 0:
                aop0 aop0Var = (aop0) obj;
                if (!(aop0Var instanceof aop0)) {
                    throw new NoWhenBranchMatchedException();
                }
                th00 th00Var = this.f22467b;
                if (th00Var != null) {
                    th00Var.invoke(this.f22468c, aop0Var.f17742b);
                }
                return w2a1.f247311a;
            default:
                this.f22467b.invoke(this.f22468c, (String) obj);
                return w2a1.f247311a;
        }
    }
}
