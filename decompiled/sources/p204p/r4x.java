package p204p;

import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class r4x implements Consumer {

    /* JADX INFO: renamed from: a */
    public final Scheduler f195869a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f195870b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f195871c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public final PublishSubject f195872d = new PublishSubject();

    public r4x(Scheduler scheduler) {
        this.f195869a = scheduler;
    }

    @Override // com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        this.f195869a.mo23384c(new lk00(20, this, obj));
    }
}
