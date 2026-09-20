package p204p;

import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;

/* JADX INFO: loaded from: classes9.dex */
public final class dvo implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53491a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ evo f53492b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vn80 f53493c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f53494d;

    public /* synthetic */ dvo(evo evoVar, vn80 vn80Var, int i, int i2) {
        this.f53491a = i2;
        this.f53492b = evoVar;
        this.f53493c = vn80Var;
        this.f53494d = i;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        switch (this.f53491a) {
            case 0:
                int i = this.f53494d;
                return new CompletableFromAction(new cvo(this.f53492b, this.f53493c, (String) obj, i, 0));
            default:
                int i2 = this.f53494d;
                return new CompletableFromAction(new cvo(this.f53492b, this.f53493c, (String) obj, i2, 1));
        }
    }
}
