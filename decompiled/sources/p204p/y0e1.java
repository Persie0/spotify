package p204p;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class y0e1 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f267972b = AtomicReferenceFieldUpdater.newUpdater(y0e1.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f267973c = AtomicIntegerFieldUpdater.newUpdater(y0e1.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f267974d = AtomicIntegerFieldUpdater.newUpdater(y0e1.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f267975e = AtomicIntegerFieldUpdater.newUpdater(y0e1.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceArray f267976a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* JADX INFO: renamed from: a */
    public final dv61 m92561a(dv61 dv61Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f267973c;
        if (atomicIntegerFieldUpdater.get(this) - f267974d.get(this) == 127) {
            return dv61Var;
        }
        if (dv61Var.f53379b) {
            f267975e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f267976a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, dv61Var);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    /* JADX INFO: renamed from: b */
    public final dv61 m92562b() {
        dv61 dv61Var;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f267974d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f267973c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (dv61Var = (dv61) this.f267976a.getAndSet(i2, null)) != null) {
                if (dv61Var.f53379b) {
                    f267975e.decrementAndGet(this);
                }
                return dv61Var;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final dv61 m92563c(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f267976a;
        dv61 dv61Var = (dv61) atomicReferenceArray.get(i2);
        if (dv61Var == null || dv61Var.f53379b != z || !t3d1.m80004s(atomicReferenceArray, i2, dv61Var)) {
            return null;
        }
        if (z) {
            f267975e.decrementAndGet(this);
        }
        return dv61Var;
    }
}
