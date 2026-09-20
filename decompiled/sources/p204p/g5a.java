package p204p;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes5.dex */
public final class g5a extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f76627a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Disposable f76628b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g5a(int i, Disposable disposable) {
        super(1);
        this.f76627a = i;
        this.f76628b = disposable;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f76627a) {
            case 0:
                this.f76628b.dispose();
                break;
            case 1:
                this.f76628b.dispose();
                break;
            case 2:
                this.f76628b.dispose();
                break;
            default:
                this.f76628b.dispose();
                break;
        }
        return w2a1.f247311a;
    }
}
