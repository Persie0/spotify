package p204p;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class gwg extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f85003a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f85004b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f85005c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gwg(String str, int i, List list) {
        super(1);
        this.f85003a = i;
        this.f85004b = str;
        this.f85005c = list;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) throws Exception {
        switch (this.f85003a) {
            case 0:
                mpz0 mpz0Var = (mpz0) obj;
                jpz0.m54000n(mpz0Var, this.f85004b);
                jpz0.m54002p(mpz0Var, this.f85005c);
                return w2a1.f247311a;
            case 1:
                return new z7i0(null, Collections.singletonList(this.f85004b), this.f85005c, null, 9);
            case 2:
                mpz0 mpz0Var2 = (mpz0) obj;
                jpz0.m54000n(mpz0Var2, this.f85004b);
                jpz0.m54002p(mpz0Var2, this.f85005c);
                return w2a1.f247311a;
            case 3:
                ezx0 ezx0VarMo63454G1 = ((yyx0) obj).mo63454G1(this.f85004b);
                try {
                    Iterator it = this.f85005c.iterator();
                    int i = 1;
                    while (it.hasNext()) {
                        ezx0VarMo63454G1.mo24842R(i, (String) it.next());
                        i++;
                    }
                    ezx0VarMo63454G1.mo24841E1();
                    return w2a1.f247311a;
                } finally {
                    ezx0VarMo63454G1.close();
                }
            default:
                mpz0 mpz0Var3 = (mpz0) obj;
                jpz0.m54000n(mpz0Var3, this.f85004b);
                jpz0.m54002p(mpz0Var3, this.f85005c);
                return w2a1.f247311a;
        }
    }
}
