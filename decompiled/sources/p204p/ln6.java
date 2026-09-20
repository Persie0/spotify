package p204p;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public class ln6 extends au71 {

    /* JADX INFO: renamed from: h */
    public static final sgz f135096h;

    /* JADX INFO: renamed from: i */
    public static ln6 f135097i;

    /* JADX INFO: renamed from: j */
    public static final ReentrantLock f135098j;

    /* JADX INFO: renamed from: k */
    public static final Condition f135099k;

    /* JADX INFO: renamed from: l */
    public static final long f135100l;

    /* JADX INFO: renamed from: m */
    public static final long f135101m;

    /* JADX INFO: renamed from: e */
    public int f135102e;

    /* JADX INFO: renamed from: f */
    public int f135103f = -1;

    /* JADX INFO: renamed from: g */
    public long f135104g;

    static {
        sgz sgzVar = new sgz((char) 0, 4);
        sgzVar.f208959c = new ln6[8];
        f135096h = sgzVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        f135098j = reentrantLock;
        f135099k = reentrantLock.newCondition();
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f135100l = millis;
        f135101m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: renamed from: i */
    public final void m59473i() {
        long j = this.f19884c;
        boolean z = this.f19882a;
        if (j != 0 || z) {
            ReentrantLock reentrantLock = f135098j;
            reentrantLock.lock();
            try {
                if (this.f135102e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f135102e = 1;
                hvi0.m48869c(this);
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m59474j() {
        ReentrantLock reentrantLock = f135098j;
        reentrantLock.lock();
        try {
            int i = this.f135102e;
            this.f135102e = 0;
            if (i != 1) {
                return i == 2;
            }
            f135096h.m78120h(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: k */
    public IOException mo39258k(IOException iOException) {
        throw null;
    }

    /* JADX INFO: renamed from: l */
    public void mo39259l() {
    }
}
