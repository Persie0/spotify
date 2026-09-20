package p204p;

import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public final class p5t implements Consumer {

    /* JADX INFO: renamed from: a */
    public final Scheduler f174223a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f174224b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f174225c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public final PublishSubject f174226d = new PublishSubject();

    public p5t(Scheduler scheduler) {
        this.f174223a = scheduler;
    }

    @Override // com.spotify.mobius.functions.Consumer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(o5t o5tVar) {
        this.f174223a.mo23384c(new uqf1(18, this, o5tVar));
    }
}
