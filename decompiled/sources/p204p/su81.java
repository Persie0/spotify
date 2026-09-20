package p204p;

import java.util.function.BiFunction;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class su81 implements BiFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qe70 f214031a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vu81 f214032b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hu81 f214033c;

    /* JADX WARN: Multi-variable type inference failed */
    public su81(gh00 gh00Var, vu81 vu81Var, hu81 hu81Var) {
        this.f214031a = (qe70) gh00Var;
        this.f214032b = vu81Var;
        this.f214033c = hu81Var;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [p.gh00, p.qe70] */
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        b9b b9bVar = (b9b) obj2;
        qu81 qu81Var = (qu81) this.f214031a.invoke(b9bVar);
        if (qu81Var != null) {
            boolean z = qu81Var instanceof pu81;
            if (z) {
                throw new IllegalStateException("For Started event use dispatchInitialTrafficEvent");
            }
            boolean z2 = b9bVar.f24818c;
            vu81 vu81Var = this.f214032b;
            if (!z2) {
                vu81Var.f244895g.mo46962a(qu81Var);
            }
            if (!z && !(qu81Var instanceof ju81) && !(qu81Var instanceof ku81) && !(qu81Var instanceof nu81) && !(qu81Var instanceof ou81)) {
                if (!(qu81Var instanceof lu81) && !(qu81Var instanceof mu81)) {
                    throw new NoWhenBranchMatchedException();
                }
                gh00 gh00Var = (gh00) vu81Var.f244893e.remove(this.f214033c);
                if (!(qu81Var instanceof mu81) || gh00Var == null) {
                    return null;
                }
                gh00Var.invoke(((mu81) qu81Var).f147281e);
                return null;
            }
        }
        return b9bVar;
    }
}
