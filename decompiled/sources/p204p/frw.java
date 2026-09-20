package p204p;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Supplier;

/* JADX INFO: loaded from: classes9.dex */
public final class frw implements Supplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f72670a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qe70 f72671b;

    /* JADX WARN: Multi-variable type inference failed */
    public frw(int i, eh00 eh00Var) {
        this.f72670a = i;
        switch (i) {
            case 1:
                this.f72671b = (qe70) eh00Var;
                break;
            default:
                this.f72671b = (qe70) eh00Var;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r0v4, types: [p.eh00, p.qe70] */
    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        switch (this.f72670a) {
            case 0:
                return Single.just(this.f72671b.invoke());
            default:
                return (ObservableSource) this.f72671b.invoke();
        }
    }
}
