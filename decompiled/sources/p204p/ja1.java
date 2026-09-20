package p204p;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class ja1 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f110296a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ li0 f110297b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja1(li0 li0Var, int i) {
        super(4);
        this.f110296a = i;
        this.f110297b = li0Var;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f110296a) {
            case 0:
                ((Number) obj3).intValue();
                return new gqg0((hqg0) this.f110297b.f133683e);
            default:
                gqg0 gqg0Var = (gqg0) obj;
                ia1 ia1Var = (ia1) obj2;
                if (!((ha1) obj4).equals(ha1.f89085a)) {
                    throw new NoWhenBranchMatchedException();
                }
                String strM59015m = li0.m59015m(this.f110297b, ia1Var);
                dv91 dv91Var = new dv91("hit", 1);
                String string = strM59015m != null ? strM59015m.toString() : null;
                if (string == null) {
                    string = "";
                }
                return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), gqg0Var.f83471a, gqg0Var.f83472b.f94178a, System.currentTimeMillis());
        }
    }
}
