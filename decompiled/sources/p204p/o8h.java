package p204p;

import io.ably.lib.rest.Auth;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public final class o8h extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f162811a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ng11 f162812b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o8h(ng11 ng11Var, int i) {
        super(1);
        this.f162811a = i;
        this.f162812b = ng11Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f162811a) {
            case 0:
                jpz0.m54000n((mpz0) obj, Pattern.compile("\\[([^]]+)]\\(([^)]+)\\)").matcher(bm51.m29801l0(this.f162812b.f153525a, Auth.WILDCARD_CLIENTID, "")).replaceAll("$1"));
                break;
            default:
                lg11 lg11Var = (lg11) obj;
                gh00 gh00Var = this.f162812b.f153528d;
                if (gh00Var != null) {
                    gh00Var.invoke(lg11Var);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
