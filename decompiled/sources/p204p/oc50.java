package p204p;

import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes11.dex */
public final class oc50 implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f163814a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z650 f163815b;

    public /* synthetic */ oc50(int i, z650 z650Var) {
        this.f163814a = i;
        this.f163815b = z650Var;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        switch (this.f163814a) {
            case 0:
                return this.f163815b;
            default:
                return this.f163815b.f279709a;
        }
    }
}
