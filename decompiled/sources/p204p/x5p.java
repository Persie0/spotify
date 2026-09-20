package p204p;

import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class x5p implements Consumer {

    /* JADX INFO: renamed from: a */
    public final Scheduler f258487a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f258488b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f258489c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public final PublishSubject f258490d = new PublishSubject();

    public x5p(Scheduler scheduler) {
        this.f258487a = scheduler;
    }

    @Override // com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        this.f258487a.mo23384c(new uqf1(14, this, (epi) obj));
    }
}
