package p204p;

import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;

/* JADX INFO: loaded from: classes11.dex */
public final class dnt implements Function, Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50878a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qe70 f50879b;

    /* JADX WARN: Multi-variable type inference failed */
    public dnt(int i, gh00 gh00Var) {
        this.f50878a = i;
        switch (i) {
            case 1:
                this.f50879b = (qe70) gh00Var;
                break;
            case 2:
                this.f50879b = (qe70) gh00Var;
                break;
            default:
                this.f50879b = (qe70) gh00Var;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r0v2, types: [p.gh00, p.qe70] */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f50878a) {
            case 0:
                wj50.m88279p(obj);
                return (CompletableSource) this.f50879b.invoke(obj);
            default:
                return this.f50879b.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.gh00, p.qe70] */
    @Override // io.reactivex.rxjava3.functions.Predicate
    public /* synthetic */ boolean test(Object obj) {
        return ((Boolean) this.f50879b.invoke(obj)).booleanValue();
    }
}
