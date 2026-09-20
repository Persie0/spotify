package p204p;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class apy0 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f18033a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ syn0 f18034b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ apy0(syn0 syn0Var, int i) {
        super(4);
        this.f18033a = i;
        this.f18034b = syn0Var;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f18033a) {
            case 0:
                ((Number) obj3).intValue();
                return new aqg0((bqg0) this.f18034b.f215298e);
            default:
                aqg0 aqg0Var = (aqg0) obj;
                zoy0 zoy0Var = (zoy0) obj2;
                if (!((yoy0) obj4).equals(yoy0.f274774a)) {
                    throw new NoWhenBranchMatchedException();
                }
                String strM79707e = syn0.m79707e(this.f18034b, zoy0Var);
                dv91 dv91Var = new dv91("hit", 1);
                String string = strM79707e != null ? strM79707e.toString() : null;
                if (string == null) {
                    string = "";
                }
                return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), aqg0Var.f18250a, st91.f213865b, System.currentTimeMillis());
        }
    }
}
