package p204p;

import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class vi10 implements Function, Predicate {

    /* JADX INFO: renamed from: a */
    public final String f241586a;

    /* JADX INFO: renamed from: b */
    public final String f241587b;

    public /* synthetic */ vi10(String str, String str2, boolean z) {
        this.f241586a = str;
        this.f241587b = str2;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        wtq wtqVar = (wtq) obj;
        if (wtqVar instanceof utq) {
            return new xm50(((utq) wtqVar).f233969c);
        }
        if (!(wtqVar instanceof vtq)) {
            throw new NoWhenBranchMatchedException();
        }
        vtq vtqVar = (vtq) wtqVar;
        noa1 noa1Var = vtqVar.f244751b;
        if (noa1Var != null) {
            boolean z = noa1Var.f156638b;
            if (vtqVar.f244750a) {
                Boolean boolValueOf = Boolean.valueOf(z);
                Boolean bool = Boolean.TRUE;
                boolean zEquals = boolValueOf.equals(bool);
                String str = this.f241586a;
                if (zEquals) {
                    return new ym50(true, str, noa1Var);
                }
                return Boolean.valueOf(z).equals(bool) ? new zm50(this.f241587b) : new ym50(false, str, noa1Var);
            }
        }
        return new xm50(false);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        ubp0 ubp0Var = (ubp0) obj;
        if (wj50.m88271j(ubp0Var.f228853a, this.f241586a)) {
            return wj50.m88271j(ubp0Var.f228855c, this.f241587b) || ubp0Var.f228872t;
        }
        return false;
    }

    public vi10(String str, String str2) {
        ig31.m50499q(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f241586a = str;
        this.f241587b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
