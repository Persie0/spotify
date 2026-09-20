package p204p;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class r42 implements ewr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f195634a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Disposable f195635b;

    public /* synthetic */ r42(int i, Disposable disposable) {
        this.f195634a = i;
        this.f195635b = disposable;
    }

    @Override // p204p.ewr
    public final void dispose() {
        switch (this.f195634a) {
            case 0:
                this.f195635b.dispose();
                break;
            case 1:
                this.f195635b.dispose();
                break;
            default:
                this.f195635b.dispose();
                break;
        }
    }
}
