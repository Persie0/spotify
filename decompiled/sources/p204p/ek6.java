package p204p;

import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: classes5.dex */
public final class ek6 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final PublishSubject f60390a = new PublishSubject();

    @Override // com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        this.f60390a.onNext((dk6) obj);
    }
}
