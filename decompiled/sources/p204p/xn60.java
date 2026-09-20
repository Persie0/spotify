package p204p;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes11.dex */
public final class xn60 implements Closeable {

    /* JADX INFO: renamed from: a */
    public boolean f263538a;

    /* JADX INFO: renamed from: b */
    public int f263539b;

    /* JADX INFO: renamed from: c */
    public final ReentrantLock f263540c = new ReentrantLock();

    /* JADX INFO: renamed from: d */
    public final RandomAccessFile f263541d;

    public xn60(RandomAccessFile randomAccessFile) {
        this.f263541d = randomAccessFile;
    }

    /* JADX INFO: renamed from: a */
    public final awy m91495a(long j) {
        ReentrantLock reentrantLock = this.f263540c;
        reentrantLock.lock();
        try {
            if (this.f263538a) {
                throw new IllegalStateException("closed");
            }
            this.f263539b++;
            reentrantLock.unlock();
            return new awy(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f263540c;
        reentrantLock.lock();
        try {
            if (this.f263538a) {
                reentrantLock.unlock();
                return;
            }
            this.f263538a = true;
            if (this.f263539b != 0) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            synchronized (this) {
                this.f263541d.close();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.f263540c;
        reentrantLock.lock();
        try {
            if (this.f263538a) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            synchronized (this) {
                length = this.f263541d.length();
            }
            return length;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
