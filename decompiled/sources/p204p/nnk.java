package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
public final class nnk extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f156437a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f156438b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eh00 f156439c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nnk(String str, eh00 eh00Var, int i) {
        super(1);
        this.f156437a = i;
        this.f156438b = str;
        this.f156439c = eh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f156437a) {
            case 0:
                jpz0.m54002p((mpz0) obj, Collections.singletonList(new d9m(this.f156438b, new v7h(27, this.f156439c))));
                break;
            case 1:
                if (this.f156438b.length() == 4) {
                    this.f156439c.invoke();
                }
                break;
            case 2:
                jpz0.m54002p((mpz0) obj, Collections.singletonList(new d9m(this.f156438b, new vh60(17, this.f156439c))));
                break;
            case 3:
                mpz0 mpz0Var = (mpz0) obj;
                jpz0.m54000n(mpz0Var, this.f156438b);
                jpz0.m54007u(mpz0Var, 0);
                jpz0.m53993g(mpz0Var, null, new rzt0(2, this.f156439c));
                break;
            default:
                mpz0 mpz0Var2 = (mpz0) obj;
                eh00 eh00Var = this.f156439c;
                wp81 wp81Var = new wp81(18, eh00Var);
                String str = this.f156438b;
                jpz0.m53995i(mpz0Var2, str, wp81Var);
                jpz0.m54002p(mpz0Var2, Collections.singletonList(new d9m(str, new wp81(19, eh00Var))));
                break;
        }
        return w2a1.f247311a;
    }
}
