package p204p;

import com.spotify.mobius.disposables.Disposable;

/* JADX INFO: loaded from: classes5.dex */
public final class dnh0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50838a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Disposable f50839b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dnh0(Disposable disposable, int i) {
        super(0);
        this.f50838a = i;
        this.f50839b = disposable;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f50838a) {
            case 0:
                this.f50839b.dispose();
                break;
            default:
                this.f50839b.dispose();
                break;
        }
        return w2a1.f247311a;
    }
}
