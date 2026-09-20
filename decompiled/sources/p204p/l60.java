package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class l60 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f130126a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ peu f130127b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l60(peu peuVar, int i) {
        super(1);
        this.f130126a = i;
        this.f130127b = peuVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f130126a) {
            case 0:
                mpz0 mpz0Var = (mpz0) obj;
                peu peuVar = this.f130127b;
                if (peuVar != null) {
                    jpz0.m54007u(mpz0Var, 0);
                    jpz0.m53993g(mpz0Var, peuVar.f176850c, new k60(peuVar, 0));
                }
                break;
            case 1:
                ((Boolean) obj).booleanValue();
                this.f130127b.f176849b.invoke();
                break;
            case 2:
                ((Boolean) obj).booleanValue();
                this.f130127b.f176849b.invoke();
                break;
            case 3:
                mpz0 mpz0Var2 = (mpz0) obj;
                jpz0.m54007u(mpz0Var2, 0);
                peu peuVar2 = this.f130127b;
                if (peuVar2 != null) {
                    jpz0.m53993g(mpz0Var2, peuVar2.f176850c, new k60(peuVar2, 4));
                }
                break;
            case 4:
                mpz0 mpz0Var3 = (mpz0) obj;
                peu peuVar3 = this.f130127b;
                if (peuVar3 != null) {
                    jpz0.m54002p(mpz0Var3, Collections.singletonList((d9m) peuVar3.f176851d.getValue()));
                }
                break;
            case 5:
                ((Boolean) obj).booleanValue();
                this.f130127b.f176849b.invoke();
                break;
            default:
                jpz0.m54002p((mpz0) obj, Collections.singletonList((d9m) this.f130127b.f176851d.getValue()));
                break;
        }
        return w2a1.f247311a;
    }
}
