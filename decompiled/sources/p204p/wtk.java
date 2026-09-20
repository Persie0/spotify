package p204p;

import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class wtk extends Scheduler {

    /* JADX INFO: renamed from: c */
    public final xtk f254955c;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f254956d = new AtomicBoolean(false);

    public wtk(xtk xtkVar) {
        this.f254955c = xtkVar;
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: b */
    public final Scheduler.Worker mo23281b() {
        return new vtk(this);
    }
}
