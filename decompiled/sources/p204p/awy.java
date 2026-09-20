package p204p;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes11.dex */
public final class awy implements wt31 {

    /* JADX INFO: renamed from: a */
    public final xn60 f20725a;

    /* JADX INFO: renamed from: b */
    public long f20726b;

    /* JADX INFO: renamed from: c */
    public boolean f20727c;

    public awy(xn60 xn60Var, long j) {
        this.f20725a = xn60Var;
        this.f20726b = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        xn60 xn60Var = this.f20725a;
        if (this.f20727c) {
            return;
        }
        this.f20727c = true;
        ReentrantLock reentrantLock = xn60Var.f263540c;
        reentrantLock.lock();
        try {
            int i = xn60Var.f263539b - 1;
            xn60Var.f263539b = i;
            if (i == 0 && xn60Var.f263538a) {
                reentrantLock.unlock();
                synchronized (xn60Var) {
                    xn60Var.f263541d.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p204p.wt31
    /* JADX INFO: renamed from: g1 */
    public final long mo27348g1(npa npaVar, long j) {
        long j2;
        long j3;
        int i;
        if (this.f20727c) {
            throw new IllegalStateException("closed");
        }
        xn60 xn60Var = this.f20725a;
        long j4 = this.f20726b;
        if (j < 0) {
            throw new IllegalArgumentException(edb.m38561j(j, "byteCount < 0: ").toString());
        }
        long j5 = j + j4;
        long j6 = j4;
        while (true) {
            if (j6 < j5) {
                gfz0 gfz0VarM65296G = npaVar.m65296G(1);
                byte[] bArr = gfz0VarM65296G.f79489a;
                int i2 = gfz0VarM65296G.f79491c;
                j2 = -1;
                int iMin = (int) Math.min(j5 - j6, 8192 - i2);
                synchronized (xn60Var) {
                    xn60Var.f263541d.seek(j6);
                    i = 0;
                    while (true) {
                        if (i < iMin) {
                            int i3 = xn60Var.f263541d.read(bArr, i2, iMin - i);
                            if (i3 != -1) {
                                i += i3;
                            } else if (i == 0) {
                                i = -1;
                                break;
                            }
                        }
                        break;
                    }
                }
                if (i == -1) {
                    if (gfz0VarM65296G.f79490b == gfz0VarM65296G.f79491c) {
                        npaVar.f156903a = gfz0VarM65296G.m44640a();
                        kgz0.m56374a(gfz0VarM65296G);
                    }
                    if (j4 == j6) {
                        j3 = -1;
                        break;
                    }
                } else {
                    gfz0VarM65296G.f79491c += i;
                    long j7 = i;
                    j6 += j7;
                    npaVar.f156904b += j7;
                }
            } else {
                j2 = -1;
            }
            j3 = j6 - j4;
            break;
        }
        if (j3 != j2) {
            this.f20726b += j3;
        }
        return j3;
    }

    @Override // p204p.wt31
    /* JADX INFO: renamed from: m */
    public final au71 mo27349m() {
        return au71.f19881d;
    }
}
