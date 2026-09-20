package p204p;

import java.util.Set;
import java.util.function.BiFunction;

/* JADX INFO: loaded from: classes7.dex */
public final class u6i0 implements BiFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f227355a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f227356b;

    public u6i0(Object obj) {
        this.f227356b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [p.gh00, p.qe70] */
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f227355a) {
            case 0:
                Set set = (Set) obj2;
                if (set == null) {
                    return null;
                }
                set.remove(this.f227356b);
                Set set2 = set;
                return set2.isEmpty() ? null : set2;
            default:
                b9b b9bVar = (b9b) obj2;
                ((qe70) this.f227356b).invoke(b9bVar.f24817b);
                return b9bVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u6i0(gh00 gh00Var) {
        this.f227356b = (qe70) gh00Var;
    }
}
