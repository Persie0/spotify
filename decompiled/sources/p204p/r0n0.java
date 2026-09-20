package p204p;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class r0n0 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f194529a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gzl f194530b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0n0(gzl gzlVar, int i) {
        super(4);
        this.f194529a = i;
        this.f194530b = gzlVar;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f194529a) {
            case 0:
                ((Number) obj3).intValue();
                return new fqg0((hqg0) this.f194530b.f85983e);
            default:
                fqg0 fqg0Var = (fqg0) obj;
                q0n0 q0n0Var = (q0n0) obj2;
                if (!((p0n0) obj4).equals(p0n0.f172717a)) {
                    throw new NoWhenBranchMatchedException();
                }
                String strM46224m = gzl.m46224m(this.f194530b, q0n0Var);
                dv91 dv91Var = new dv91("hit", 1);
                String string = strM46224m != null ? strM46224m.toString() : null;
                if (string == null) {
                    string = "";
                }
                return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), fqg0Var.f72178a, fqg0Var.f72179b.f94178a, System.currentTimeMillis());
        }
    }
}
