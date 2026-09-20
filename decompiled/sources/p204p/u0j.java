package p204p;

import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes6.dex */
public final class u0j implements Function {

    /* JADX INFO: renamed from: a */
    public final i4t0 f225518a;

    /* JADX INFO: renamed from: b */
    public final i4t0 f225519b;

    public /* synthetic */ u0j(i4t0 i4t0Var, i4t0 i4t0Var2) {
        this.f225518a = i4t0Var;
        this.f225519b = i4t0Var2;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        return ((Boolean) obj).booleanValue() ? (zl21) this.f225518a.get() : (zl21) this.f225519b.get();
    }
}
