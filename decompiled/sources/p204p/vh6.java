package p204p;

import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: classes5.dex */
public final class vh6 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final PublishSubject f241416a;

    /* JADX INFO: renamed from: b */
    public final PublishSubject f241417b;

    public vh6() {
        PublishSubject publishSubject = new PublishSubject();
        this.f241416a = publishSubject;
        this.f241417b = publishSubject;
    }

    @Override // com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        this.f241416a.onNext((uh6) obj);
    }
}
