package p204p;

import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class q4x implements Consumer {

    /* JADX INFO: renamed from: a */
    public final Scheduler f185360a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f185361b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f185362c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public final PublishSubject f185363d = new PublishSubject();

    public q4x(Scheduler scheduler) {
        this.f185360a = scheduler;
    }

    /* JADX INFO: renamed from: a */
    public final Observable m72181a() {
        return Observable.defer(new yh1(this, 9)).subscribeOn(this.f185360a);
    }

    @Override // com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        this.f185360a.mo23384c(new uqf1(19, this, obj));
    }
}
