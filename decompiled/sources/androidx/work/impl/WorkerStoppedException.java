package androidx.work.impl;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Landroidx/work/impl/WorkerStoppedException;", "Ljava/util/concurrent/CancellationException;", "work-runtime_release"}, m24213k = 1, m24214mv = {1, 8, 0}, m24216xi = 48)
public final class WorkerStoppedException extends CancellationException {

    /* JADX INFO: renamed from: a */
    public final int f1420a;

    public WorkerStoppedException(int i) {
        this.f1420a = i;
    }
}
