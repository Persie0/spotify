package p204p;

import androidx.compose.p002ui.geometry.Offset;
import java.util.Collections;

/* JADX INFO: loaded from: classes7.dex */
public final class pg3 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f177209a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f177210b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f177211c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pg3(String str, gh00 gh00Var, int i) {
        super(1);
        this.f177209a = i;
        this.f177210b = str;
        this.f177211c = gh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f177209a) {
            case 0:
                jpz0.m54002p((mpz0) obj, Collections.singletonList(new d9m(this.f177210b, new w52(25, this.f177211c))));
                break;
            case 1:
                mpz0 mpz0Var = (mpz0) obj;
                jpz0.m54007u(mpz0Var, 0);
                String str = this.f177210b;
                if (str != null) {
                    jpz0.m54002p(mpz0Var, Collections.singletonList(new d9m(str, new gxh(27, this.f177211c))));
                }
                break;
            case 2:
                mpz0 mpz0Var2 = (mpz0) obj;
                jpz0.m54007u(mpz0Var2, 0);
                String str2 = this.f177210b;
                if (str2 != null) {
                    jpz0.m54002p(mpz0Var2, Collections.singletonList(new d9m(str2, new ifi(0, this.f177211c))));
                }
                break;
            case 3:
                ((Boolean) obj).getClass();
                this.f177211c.invoke(new t0z(this.f177210b));
                break;
            case 4:
                mpz0 mpz0Var3 = (mpz0) obj;
                jpz0.m54007u(mpz0Var3, 0);
                String str3 = this.f177210b;
                if (str3 != null) {
                    jpz0.m54000n(mpz0Var3, str3);
                }
                jpz0.m53993g(mpz0Var3, null, new t0c0(19, this.f177211c));
                break;
            case 5:
                String str4 = (String) obj;
                boolean zEquals = str4.equals(this.f177210b);
                gh00 gh00Var = this.f177211c;
                if (zEquals) {
                    gh00Var.invoke(gvk0.f84776a);
                } else {
                    gh00Var.invoke(new fvk0(str4));
                }
                break;
            case 6:
                jpz0.m54002p((mpz0) obj, Collections.singletonList(new d9m(this.f177210b, new etn0(3, this.f177211c))));
                break;
            default:
                long j = ((Offset) obj).f493a;
                this.f177211c.invoke(new tkp0(this.f177210b));
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pg3(gh00 gh00Var, String str, int i) {
        super(1);
        this.f177209a = i;
        this.f177211c = gh00Var;
        this.f177210b = str;
    }
}
