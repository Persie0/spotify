package p204p;

import com.spotify.player.model.PlayerError;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class hr5 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f94364a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ObservableEmitter f94365b;

    public /* synthetic */ hr5(ObservableEmitter observableEmitter, int i) {
        this.f94364a = i;
        this.f94365b = observableEmitter;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f94364a) {
            case 0:
                this.f94365b.onNext((PlayerError) obj);
                break;
            case 1:
                this.f94365b.onNext((Set) obj);
                break;
            case 2:
                this.f94365b.onNext(obj);
                break;
            default:
                this.f94365b.tryOnError((Throwable) obj);
                break;
        }
    }
}
