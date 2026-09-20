package p204p;

import androidx.car.app.model.Alert;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class ng30 implements Closeable {

    /* JADX INFO: renamed from: f */
    public static final Logger f153539f = Logger.getLogger(uf30.class.getName());

    /* JADX INFO: renamed from: a */
    public final fqa f153540a;

    /* JADX INFO: renamed from: b */
    public final npa f153541b;

    /* JADX INFO: renamed from: c */
    public int f153542c;

    /* JADX INFO: renamed from: d */
    public boolean f153543d;

    /* JADX INFO: renamed from: e */
    public final bd30 f153544e;

    public ng30(tuu0 tuu0Var) {
        this.f153540a = tuu0Var;
        npa npaVar = new npa();
        this.f153541b = npaVar;
        this.f153542c = 16384;
        this.f153544e = new bd30(npaVar);
    }

    /* JADX INFO: renamed from: a */
    public final void m64369a(x601 x601Var) {
        synchronized (this) {
            try {
                if (this.f153543d) {
                    throw new IOException("closed");
                }
                int i = this.f153542c;
                int i2 = x601Var.f258552a;
                if ((i2 & 32) != 0) {
                    i = x601Var.f258553b[5];
                }
                this.f153542c = i;
                if (((i2 & 2) != 0 ? x601Var.f258553b[1] : -1) != -1) {
                    bd30 bd30Var = this.f153544e;
                    int iMin = Math.min((i2 & 2) != 0 ? x601Var.f258553b[1] : -1, 16384);
                    int i3 = bd30Var.f25985d;
                    if (i3 != iMin) {
                        if (iMin < i3) {
                            bd30Var.f25983b = Math.min(bd30Var.f25983b, iMin);
                        }
                        bd30Var.f25984c = true;
                        bd30Var.f25985d = iMin;
                        int i4 = bd30Var.f25989h;
                        if (iMin < i4) {
                            if (iMin == 0) {
                                bk5.m29581D0(bd30Var.f25986e, null);
                                bd30Var.f25987f = bd30Var.f25986e.length - 1;
                                bd30Var.f25988g = 0;
                                bd30Var.f25989h = 0;
                            } else {
                                bd30Var.m28785a(i4 - iMin);
                            }
                        }
                    }
                }
                m64371e(0, 0, 4, 1);
                this.f153540a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m64370c(boolean z, int i, npa npaVar, int i2) {
        synchronized (this) {
            if (this.f153543d) {
                throw new IOException("closed");
            }
            m64371e(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                fqa fqaVar = this.f153540a;
                wj50.m88279p(npaVar);
                fqaVar.mo25160U0(npaVar, i2);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f153543d = true;
            this.f153540a.close();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m64371e(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = f153539f;
            if (logger.isLoggable(level)) {
                logger.fine(uf30.m82949b(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.f153542c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f153542c + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(s571.m77246e(i, "reserved bit set: ").toString());
        }
        byte[] bArr = a0f1.f11072a;
        fqa fqaVar = this.f153540a;
        fqaVar.writeByte((i2 >>> 16) & 255);
        fqaVar.writeByte((i2 >>> 8) & 255);
        fqaVar.writeByte(i2 & 255);
        fqaVar.writeByte(i3 & 255);
        fqaVar.writeByte(i4 & 255);
        fqaVar.writeInt(i & Alert.DURATION_SHOW_INDEFINITELY);
    }

    /* JADX INFO: renamed from: f */
    public final void m64372f(int i, byte[] bArr, int i2) {
        synchronized (this) {
            if (this.f153543d) {
                throw new IOException("closed");
            }
            if (edb.m38547C(i2) == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            m64371e(0, bArr.length + 8, 7, 0);
            this.f153540a.writeInt(i);
            this.f153540a.writeInt(edb.m38547C(i2));
            if (bArr.length != 0) {
                this.f153540a.write(bArr);
            }
            this.f153540a.flush();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.f153543d) {
                throw new IOException("closed");
            }
            this.f153540a.flush();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m64373g(int i, ArrayList arrayList, boolean z) {
        synchronized (this) {
            if (this.f153543d) {
                throw new IOException("closed");
            }
            this.f153544e.m28788d(arrayList);
            long j = this.f153541b.f156904b;
            long jMin = Math.min(this.f153542c, j);
            int i2 = j == jMin ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            m64371e(i, (int) jMin, 1, i2);
            this.f153540a.mo25160U0(this.f153541b, jMin);
            if (j > jMin) {
                long j2 = j - jMin;
                while (j2 > 0) {
                    long jMin2 = Math.min(this.f153542c, j2);
                    j2 -= jMin2;
                    m64371e(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                    this.f153540a.mo25160U0(this.f153541b, jMin2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m64374h(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.f153543d) {
                throw new IOException("closed");
            }
            m64371e(0, 8, 6, z ? 1 : 0);
            this.f153540a.writeInt(i);
            this.f153540a.writeInt(i2);
            this.f153540a.flush();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m64375i(int i, int i2) {
        synchronized (this) {
            if (this.f153543d) {
                throw new IOException("closed");
            }
            if (edb.m38547C(i2) == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            m64371e(i, 4, 3, 0);
            this.f153540a.writeInt(edb.m38547C(i2));
            this.f153540a.flush();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m64376k(int i, long j) {
        synchronized (this) {
            try {
                if (this.f153543d) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = f153539f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(uf30.m82950c(i, 4, j, false));
                }
                m64371e(i, 4, 8, 0);
                this.f153540a.writeInt((int) j);
                this.f153540a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
