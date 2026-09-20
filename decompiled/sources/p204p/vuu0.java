package p204p;

import androidx.media3.session.legacy.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes2.dex */
public final class vuu0 implements gqa {

    /* JADX INFO: renamed from: a */
    public final wt31 f245079a;

    /* JADX INFO: renamed from: b */
    public final npa f245080b = new npa();

    /* JADX INFO: renamed from: c */
    public boolean f245081c;

    public vuu0(wt31 wt31Var) {
        this.f245079a = wt31Var;
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: A0 */
    public final void mo45414A0(long j) {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: H0 */
    public final int mo45415H0(hvl0 hvl0Var) throws EOFException {
        npa npaVar;
        if (this.f245081c) {
            throw new IllegalStateException("closed");
        }
        do {
            npaVar = this.f245080b;
            int iM27710d = AbstractC1686b.m27710d(npaVar, hvl0Var, true);
            if (iM27710d != -2) {
                if (iM27710d == -1) {
                    break;
                }
                npaVar.skip(hvl0Var.f95747a[iM27710d].mo51747d());
                return iM27710d;
            }
        } while (this.f245079a.mo27348g1(npaVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return -1;
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: H1 */
    public final InputStream mo45416H1() {
        return new uuu0(this);
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: J0 */
    public final iva mo45417J0(long j) {
        mo45414A0(j);
        return this.f245080b.mo45417J0(j);
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: O0 */
    public final void mo45418O0(npa npaVar, long j) throws EOFException {
        npa npaVar2 = this.f245080b;
        try {
            mo45414A0(j);
            npaVar2.mo45418O0(npaVar, j);
        } catch (EOFException e) {
            npaVar.mo42404H(npaVar2);
            throw e;
        }
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: P0 */
    public final byte[] mo45419P0() {
        wt31 wt31Var = this.f245079a;
        npa npaVar = this.f245080b;
        npaVar.mo42404H(wt31Var);
        return npaVar.m65314t(npaVar.f156904b);
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: R0 */
    public final boolean mo45420R0() {
        if (this.f245081c) {
            throw new IllegalStateException("closed");
        }
        npa npaVar = this.f245080b;
        return npaVar.mo45420R0() && this.f245079a.mo27348g1(npaVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: S */
    public final String mo45421S(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(edb.m38561j(j, "limit < 0: ").toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jM86448a = m86448a((byte) 10, 0L, j2);
        npa npaVar = this.f245080b;
        if (jM86448a != -1) {
            return AbstractC1686b.m27709c(npaVar, jM86448a);
        }
        if (j2 < Long.MAX_VALUE && request(j2) && npaVar.m65309h(j2 - 1) == 13 && request(j2 + 1) && npaVar.m65309h(j2) == 10) {
            return AbstractC1686b.m27709c(npaVar, j2);
        }
        npa npaVar2 = new npa();
        npaVar.m65308g(npaVar2, 0L, Math.min(32, npaVar.f156904b));
        throw new EOFException("\\n not found: limit=" + Math.min(npaVar.f156904b, j) + " content=" + npaVar2.mo45417J0(npaVar2.f156904b).mo51748e() + (char) 8230);
    }

    /* JADX INFO: renamed from: a */
    public final long m86448a(byte b, long j, long j2) {
        if (this.f245081c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j2) {
            throw new IllegalArgumentException(edb.m38561j(j2, "fromIndex=0 toIndex=").toString());
        }
        long jMax = 0;
        while (jMax < j2) {
            npa npaVar = this.f245080b;
            byte b2 = b;
            long j3 = j2;
            long jM65310i = npaVar.m65310i(b2, jMax, j3);
            if (jM65310i != -1) {
                return jM65310i;
            }
            long j4 = npaVar.f156904b;
            if (j4 >= j3 || this.f245079a.mo27348g1(npaVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: b1 */
    public final String mo45422b1(Charset charset) {
        wt31 wt31Var = this.f245079a;
        npa npaVar = this.f245080b;
        npaVar.mo42404H(wt31Var);
        return npaVar.m65317z(npaVar.f156904b, charset);
    }

    /* JADX INFO: renamed from: c */
    public final long m86449c() {
        mo45414A0(8L);
        return dul.m36993C(this.f245080b.readLong());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f245081c) {
            return;
        }
        this.f245081c = true;
        this.f245079a.close();
        this.f245080b.m65306c();
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: d1 */
    public final int mo45423d1() {
        mo45414A0(1L);
        npa npaVar = this.f245080b;
        byte bM65309h = npaVar.m65309h(0L);
        if ((bM65309h & MessagePack.Code.NEGFIXINT_PREFIX) == 192) {
            mo45414A0(2L);
        } else if ((bM65309h & 240) == 224) {
            mo45414A0(3L);
        } else if ((bM65309h & 248) == 240) {
            mo45414A0(4L);
        }
        return npaVar.mo45423d1();
    }

    /* JADX INFO: renamed from: e */
    public final String m86450e(long j) {
        mo45414A0(j);
        npa npaVar = this.f245080b;
        npaVar.getClass();
        return npaVar.m65317z(j, vuc.f244913a);
    }

    @Override // p204p.wt31
    /* JADX INFO: renamed from: g1 */
    public final long mo27348g1(npa npaVar, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(edb.m38561j(j, "byteCount < 0: ").toString());
        }
        if (this.f245081c) {
            throw new IllegalStateException("closed");
        }
        npa npaVar2 = this.f245080b;
        if (npaVar2.f156904b == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.f245079a.mo27348g1(npaVar2, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
        }
        return npaVar2.mo27348g1(npaVar, Math.min(j, npaVar2.f156904b));
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f245081c;
    }

    @Override // p204p.gqa, p204p.fqa
    /* JADX INFO: renamed from: l */
    public final npa mo42408l() {
        return this.f245080b;
    }

    @Override // p204p.wt31
    /* JADX INFO: renamed from: m */
    public final au71 mo27349m() {
        return this.f245079a.mo27349m();
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: o0 */
    public final long mo45424o0(iva ivaVar) {
        if (this.f245081c) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            npa npaVar = this.f245080b;
            long jM65311k = npaVar.m65311k(jMax, ivaVar);
            if (jM65311k != -1) {
                return jM65311k;
            }
            long j = npaVar.f156904b;
            if (this.f245079a.mo27348g1(npaVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: o1 */
    public final long mo45425o1(iva ivaVar) {
        return fig1.m41744v(this, ivaVar);
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: p1 */
    public final int mo45426p1() {
        mo45414A0(4L);
        return this.f245080b.mo45426p1();
    }

    @Override // p204p.gqa
    public final vuu0 peek() {
        return kif1.m56500i(new lhn0(this));
    }

    @Override // p204p.gqa
    public final int read(byte[] bArr) {
        int length = bArr.length;
        long j = length;
        dul.m37008k(bArr.length, 0, j);
        npa npaVar = this.f245080b;
        if (npaVar.f156904b == 0) {
            if (length == 0) {
                return 0;
            }
            if (this.f245079a.mo27348g1(npaVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
        }
        return npaVar.read(bArr, 0, (int) Math.min(j, npaVar.f156904b));
    }

    @Override // p204p.gqa
    public final byte readByte() {
        mo45414A0(1L);
        return this.f245080b.readByte();
    }

    @Override // p204p.gqa
    public final void readFully(byte[] bArr) throws EOFException {
        npa npaVar = this.f245080b;
        try {
            mo45414A0(bArr.length);
            npaVar.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = npaVar.f156904b;
                if (j <= 0) {
                    throw e;
                }
                int i2 = npaVar.read(bArr, i, (int) j);
                if (i2 == -1) {
                    throw new AssertionError();
                }
                i += i2;
            }
        }
    }

    @Override // p204p.gqa
    public final int readInt() {
        mo45414A0(4L);
        return this.f245080b.readInt();
    }

    @Override // p204p.gqa
    public final long readLong() {
        mo45414A0(8L);
        return this.f245080b.readLong();
    }

    @Override // p204p.gqa
    public final short readShort() {
        mo45414A0(2L);
        return this.f245080b.readShort();
    }

    @Override // p204p.gqa
    public final boolean request(long j) {
        npa npaVar;
        if (j < 0) {
            throw new IllegalArgumentException(edb.m38561j(j, "byteCount < 0: ").toString());
        }
        if (this.f245081c) {
            throw new IllegalStateException("closed");
        }
        do {
            npaVar = this.f245080b;
            if (npaVar.f156904b >= j) {
                return true;
            }
        } while (this.f245079a.mo27348g1(npaVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return false;
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: s0 */
    public final short mo45427s0() {
        mo45414A0(2L);
        return this.f245080b.mo45427s0();
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: s1 */
    public final String mo45428s1() {
        wt31 wt31Var = this.f245079a;
        npa npaVar = this.f245080b;
        npaVar.mo42404H(wt31Var);
        return npaVar.mo45428s1();
    }

    @Override // p204p.gqa
    public final void skip(long j) throws EOFException {
        if (this.f245081c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            npa npaVar = this.f245080b;
            if (npaVar.f156904b == 0 && this.f245079a.mo27348g1(npaVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, npaVar.f156904b);
            npaVar.skip(jMin);
            j -= jMin;
        }
    }

    public final String toString() {
        return "buffer(" + this.f245079a + ')';
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: w1 */
    public final long mo45429w1(fqa fqaVar) {
        npa npaVar;
        long j = 0;
        while (true) {
            wt31 wt31Var = this.f245079a;
            npaVar = this.f245080b;
            if (wt31Var.mo27348g1(npaVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
            long jM65307e = npaVar.m65307e();
            if (jM65307e > 0) {
                j += jM65307e;
                fqaVar.mo25160U0(npaVar, jM65307e);
            }
        }
        long j2 = npaVar.f156904b;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        fqaVar.mo25160U0(npaVar, j2);
        return j3;
    }

    @Override // p204p.gqa
    /* JADX INFO: renamed from: x0 */
    public final boolean mo45430x0(long j, iva ivaVar) {
        int iMo51747d = ivaVar.mo51747d();
        if (this.f245081c) {
            throw new IllegalStateException("closed");
        }
        if (iMo51747d >= 0 && j >= 0 && iMo51747d <= ivaVar.mo51747d()) {
            return iMo51747d == 0 || fig1.m41743u(this, ivaVar, iMo51747d, j, j + 1) != -1;
        }
        return false;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        npa npaVar = this.f245080b;
        if (npaVar.f156904b == 0 && this.f245079a.mo27348g1(npaVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return npaVar.read(byteBuffer);
    }
}
