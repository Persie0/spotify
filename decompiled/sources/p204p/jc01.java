package p204p;

import com.spotify.mobius.Connection;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes5.dex */
public final class jc01 implements Connection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f110933a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Disposable f110934b;

    public /* synthetic */ jc01(int i, Disposable disposable) {
        this.f110933a = i;
        this.f110934b = disposable;
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f110933a) {
            case 0:
                break;
            default:
                break;
        }
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        switch (this.f110933a) {
            case 0:
                this.f110934b.dispose();
                break;
            default:
                this.f110934b.dispose();
                break;
        }
    }
}
