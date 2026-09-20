package p204p;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class kn6 extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                sgz sgzVar = ln6.f135096h;
                ReentrantLock reentrantLock = ln6.f135098j;
                reentrantLock.lock();
                try {
                    ln6 ln6VarM48873g = hvi0.m48873g();
                    if (ln6VarM48873g == ln6.f135097i) {
                        ln6.f135097i = null;
                        reentrantLock.unlock();
                        return;
                    } else {
                        reentrantLock.unlock();
                        if (ln6VarM48873g != null) {
                            ln6VarM48873g.mo39259l();
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
        }
    }
}
