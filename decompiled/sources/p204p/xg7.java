package p204p;

import com.spotify.authentication.login5esperanto.EsAuthenticateResult$AuthenticateResult;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class xg7 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f261231a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicReference f261232b;

    public /* synthetic */ xg7(AtomicReference atomicReference, int i) {
        this.f261231a = i;
        this.f261232b = atomicReference;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        Disposable disposable;
        switch (this.f261231a) {
            case 0:
                EsAuthenticateResult$AuthenticateResult esAuthenticateResult$AuthenticateResult = (EsAuthenticateResult$AuthenticateResult) obj;
                if ((esAuthenticateResult$AuthenticateResult.m3575s() == 1 || esAuthenticateResult$AuthenticateResult.m3575s() == 2 || esAuthenticateResult$AuthenticateResult.m3575s() == 4) && (disposable = (Disposable) this.f261232b.get()) != null) {
                    disposable.dispose();
                }
                break;
            case 1:
                Disposable disposable2 = (Disposable) this.f261232b.get();
                if (disposable2 != null) {
                    disposable2.dispose();
                }
                break;
            case 2:
                this.f261232b.set((PlayerState) obj);
                break;
            case 3:
                this.f261232b.set((iy21) obj);
                break;
            default:
                this.f261232b.set((k031) obj);
                break;
        }
    }
}
