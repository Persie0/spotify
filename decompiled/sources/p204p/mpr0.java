package p204p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public final class mpr0 implements EventSource {

    /* JADX INFO: renamed from: a */
    public final j5y0 f146078a;

    /* JADX INFO: renamed from: e */
    public final Observable f146082e;

    /* JADX INFO: renamed from: b */
    public final ArrayList f146079b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final PublishSubject f146080c = new PublishSubject();

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f146081d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public final wg61 f146083f = new wg61(new cgr0(this, 1));

    public mpr0(Scheduler scheduler, j5y0 j5y0Var) {
        this.f146078a = j5y0Var;
        this.f146082e = Observable.defer(new yh1(this, 25)).subscribeOn(scheduler);
    }

    @Override // com.spotify.mobius.EventSource
    /* JADX INFO: renamed from: a */
    public final Disposable mo15572a(Consumer consumer) {
        return RxEventSources.m15655a(this.f146082e, (Observable) this.f146083f.getValue()).mo15572a(new eo2(consumer, 17));
    }

    /* JADX INFO: renamed from: b */
    public final void m62500b(lpr0 lpr0Var) {
        if (this.f146081d.get()) {
            this.f146080c.onNext(lpr0Var);
        } else {
            this.f146079b.add(lpr0Var);
        }
    }
}
