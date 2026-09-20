package p204p;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class hg30 implements wt31 {

    /* JADX INFO: renamed from: a */
    public final gqa f91008a;

    /* JADX INFO: renamed from: b */
    public int f91009b;

    /* JADX INFO: renamed from: c */
    public int f91010c;

    /* JADX INFO: renamed from: d */
    public int f91011d;

    /* JADX INFO: renamed from: e */
    public int f91012e;

    /* JADX INFO: renamed from: f */
    public int f91013f;

    public hg30(gqa gqaVar) {
        this.f91008a = gqaVar;
    }

    @Override // p204p.wt31
    /* JADX INFO: renamed from: g1 */
    public final long mo27348g1(npa npaVar, long j) throws IOException {
        int i;
        int i2;
        do {
            int i3 = this.f91012e;
            gqa gqaVar = this.f91008a;
            if (i3 == 0) {
                gqaVar.skip(this.f91013f);
                this.f91013f = 0;
                if ((this.f91010c & 4) == 0) {
                    i = this.f91011d;
                    int iM24353n = a0f1.m24353n(gqaVar);
                    this.f91012e = iM24353n;
                    this.f91009b = iM24353n;
                    int i4 = gqaVar.readByte() & 255;
                    this.f91010c = gqaVar.readByte() & 255;
                    Logger logger = ig30.f101871d;
                    if (logger.isLoggable(Level.FINE)) {
                        iva ivaVar = uf30.f229666a;
                        logger.fine(uf30.m82949b(true, this.f91011d, this.f91009b, i4, this.f91010c));
                    }
                    i2 = gqaVar.readInt() & Alert.DURATION_SHOW_INDEFINITELY;
                    this.f91011d = i2;
                    if (i4 != 9) {
                        throw new IOException(i4 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jMo27348g1 = gqaVar.mo27348g1(npaVar, Math.min(j, i3));
                if (jMo27348g1 != -1) {
                    this.f91012e -= (int) jMo27348g1;
                    return jMo27348g1;
                }
            }
            return -1L;
        } while (i2 == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // p204p.wt31
    /* JADX INFO: renamed from: m */
    public final au71 mo27349m() {
        return this.f91008a.mo27349m();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
