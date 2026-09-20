package p204p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class w5c extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f248053a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z9j0 f248054b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w5c(z9j0 z9j0Var, int i) {
        super(4);
        this.f248053a = i;
        this.f248054b = z9j0Var;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        String str;
        String str2;
        int i = this.f248053a;
        z9j0 z9j0Var = this.f248054b;
        switch (i) {
            case 0:
                r5c r5cVar = (r5c) obj2;
                cvt cvtVar = (cvt) obj4;
                if (!(((k5c) obj3) instanceof k5c)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (r5cVar instanceof q5c) {
                    String str3 = "";
                    if (cvtVar != null) {
                        d850 d850VarM60683w = m3h1.m60683w(cvtVar);
                        m5c m5cVar = ((q5c) r5cVar).f185501c;
                        if (m5cVar != null && (str2 = m5cVar.f140183b) != null) {
                            str3 = str2;
                        }
                        z9j0Var.mo47342b(str3, d850VarM60683w, null);
                    } else {
                        m5c m5cVar2 = ((q5c) r5cVar).f185501c;
                        if (m5cVar2 != null && (str = m5cVar2.f140183b) != null) {
                            str3 = str;
                        }
                        z9j0Var.mo47346g(str3);
                    }
                }
                return w2a1.f247311a;
            default:
                cak0 cak0Var = (cak0) obj;
                return Completable.m23290n(new CompletableFromAction(new jo10(cak0Var, z9j0Var, (cvt) obj4)), cak0Var.f35835e);
        }
    }
}
