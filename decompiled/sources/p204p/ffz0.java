package p204p;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ffz0 extends ahi implements opj0 {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f69123d = AtomicIntegerFieldUpdater.newUpdater(ffz0.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c */
    public final long f69124c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public ffz0(long j, ffz0 ffz0Var, int i) {
        super(ffz0Var);
        this.f69124c = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // p204p.ahi
    /* JADX INFO: renamed from: d */
    public final boolean mo25986d() {
        return f69123d.get(this) == mo41558g() && m25985c() != null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m41557f() {
        return f69123d.addAndGet(this, -65536) == mo41558g() && m25985c() != null;
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo41558g();

    /* JADX INFO: renamed from: h */
    public abstract void mo41559h(int i, juk jukVar);

    /* JADX INFO: renamed from: i */
    public final void m41560i() {
        if (f69123d.incrementAndGet(this) == mo41558g()) {
            m25987e();
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m41561j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f69123d;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == mo41558g() && m25985c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
