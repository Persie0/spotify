package p204p;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class pwe {

    /* JADX INFO: renamed from: c */
    public int f181999c;

    /* JADX INFO: renamed from: e */
    public final InputStream f182001e;

    /* JADX INFO: renamed from: f */
    public int f182002f;

    /* JADX INFO: renamed from: i */
    public int f182005i;

    /* JADX INFO: renamed from: h */
    public int f182004h = Alert.DURATION_SHOW_INDEFINITELY;

    /* JADX INFO: renamed from: a */
    public final byte[] f181997a = new byte[4096];

    /* JADX INFO: renamed from: b */
    public int f181998b = 0;

    /* JADX INFO: renamed from: d */
    public int f182000d = 0;

    /* JADX INFO: renamed from: g */
    public int f182003g = 0;

    public pwe(InputStream inputStream) {
        this.f182001e = inputStream;
    }

    /* JADX INFO: renamed from: a */
    public final void m71235a(int i) {
        if (this.f182002f != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m71236b() throws InvalidProtocolBufferException {
        if (this.f182005i >= 64) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m71237c() {
        int i = this.f182004h;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f182003g + this.f182000d);
    }

    /* JADX INFO: renamed from: d */
    public final void m71238d(int i) {
        this.f182004h = i;
        m71250p();
    }

    /* JADX INFO: renamed from: e */
    public final int m71239e(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.f182003g + this.f182000d + i;
        int i3 = this.f182004h;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.m24218b();
        }
        this.f182004h = i2;
        m71250p();
        return i3;
    }

    /* JADX INFO: renamed from: f */
    public final xj90 m71240f() {
        int iM71246l = m71246l();
        int i = this.f181998b;
        int i2 = this.f182000d;
        if (iM71246l > i - i2 || iM71246l <= 0) {
            return iM71246l == 0 ? hva.f95637a : new xj90(m71243i(iM71246l));
        }
        byte[] bArr = new byte[iM71246l];
        System.arraycopy(this.f181997a, i2, bArr, 0, iM71246l);
        xj90 xj90Var = new xj90(bArr);
        this.f182000d += iM71246l;
        return xj90Var;
    }

    /* JADX INFO: renamed from: g */
    public final int m71241g() {
        return m71246l();
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC2155n8 m71242h(s2n0 s2n0Var, bux buxVar) throws InvalidProtocolBufferException {
        int iM71246l = m71246l();
        m71236b();
        int iM71239e = m71239e(iM71246l);
        this.f182005i++;
        AbstractC2155n8 abstractC2155n8 = (AbstractC2155n8) s2n0Var.mo77051a(this, buxVar);
        m71235a(0);
        this.f182005i--;
        m71238d(iM71239e);
        return abstractC2155n8;
    }

    /* JADX INFO: renamed from: i */
    public final byte[] m71243i(int i) throws IOException {
        if (i <= 0) {
            if (i == 0) {
                return fe50.f68685a;
            }
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.f182003g;
        int i3 = this.f182000d;
        int i4 = i2 + i3 + i;
        int i5 = this.f182004h;
        if (i4 > i5) {
            m71253s((i5 - i2) - i3);
            throw InvalidProtocolBufferException.m24218b();
        }
        byte[] bArr = this.f181997a;
        if (i < 4096) {
            byte[] bArr2 = new byte[i];
            int i6 = this.f181998b - i3;
            System.arraycopy(bArr, i3, bArr2, 0, i6);
            this.f182000d = this.f181998b;
            int i7 = i - i6;
            if (i7 > 0) {
                m71251q(i7);
            }
            System.arraycopy(bArr, 0, bArr2, i6, i7);
            this.f182000d = i7;
            return bArr2;
        }
        int i8 = this.f181998b;
        this.f182003g = i2 + i8;
        this.f182000d = 0;
        this.f181998b = 0;
        int length = i8 - i3;
        int i9 = i - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i9 > 0) {
            int iMin = Math.min(i9, 4096);
            byte[] bArr3 = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = this.f182001e.read(bArr3, i10, iMin - i10);
                if (i11 == -1) {
                    throw InvalidProtocolBufferException.m24218b();
                }
                this.f182003g += i11;
                i10 += i11;
            }
            i9 -= iMin;
            arrayList.add(bArr3);
        }
        byte[] bArr4 = new byte[i];
        System.arraycopy(bArr, i3, bArr4, 0, length);
        for (byte[] bArr5 : arrayList) {
            System.arraycopy(bArr5, 0, bArr4, length, bArr5.length);
            length += bArr5.length;
        }
        return bArr4;
    }

    /* JADX INFO: renamed from: j */
    public final int m71244j() throws InvalidProtocolBufferException {
        int i = this.f182000d;
        if (this.f181998b - i < 4) {
            m71251q(4);
            i = this.f182000d;
        }
        this.f182000d = i + 4;
        byte[] bArr = this.f181997a;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: k */
    public final long m71245k() throws InvalidProtocolBufferException {
        int i = this.f182000d;
        if (this.f181998b - i < 8) {
            m71251q(8);
            i = this.f182000d;
        }
        this.f182000d = i + 8;
        byte[] bArr = this.f181997a;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: l */
    public final int m71246l() {
        int i;
        int i2 = this.f182000d;
        int i3 = this.f181998b;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f181997a;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f182000d = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                long j = i6;
                if (j < 0) {
                    i = (int) ((-128) ^ j);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    long j2 = i8;
                    if (j2 >= 0) {
                        i = (int) (16256 ^ j2);
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        long j3 = i10;
                        if (j3 < 0) {
                            i = (int) ((-2080896) ^ j3);
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (int) (((long) (i10 ^ (b2 << 28))) ^ 266354560);
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.f182000d = i5;
                return i;
            }
        }
        return (int) m71248n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r3[r2] < 0) goto L39;
     */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m71247m() {
        long j;
        long j2;
        long j3;
        int i = this.f182000d;
        int i2 = this.f181998b;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f181997a;
            byte b = bArr[i];
            if (b >= 0) {
                this.f182000d = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                long j4 = (bArr[i3] << 7) ^ b;
                if (j4 >= 0) {
                    int i5 = i + 3;
                    long j5 = j4 ^ ((long) (bArr[i4] << 14));
                    if (j5 >= 0) {
                        j3 = 16256;
                    } else {
                        i4 = i + 4;
                        j4 = j5 ^ ((long) (bArr[i5] << 21));
                        if (j4 < 0) {
                            j2 = -2080896;
                        } else {
                            i5 = i + 5;
                            j5 = j4 ^ (((long) bArr[i4]) << 28);
                            if (j5 >= 0) {
                                j3 = 266354560;
                            } else {
                                i4 = i + 6;
                                j4 = j5 ^ (((long) bArr[i5]) << 35);
                                if (j4 >= 0) {
                                    i5 = i + 7;
                                    j5 = j4 ^ (((long) bArr[i4]) << 42);
                                    if (j5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j4 = j5 ^ (((long) bArr[i5]) << 49);
                                        if (j4 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            int i6 = i + 9;
                                            long j6 = (j4 ^ (((long) bArr[i4]) << 56)) ^ 71499008037633920L;
                                            i4 = j6 < 0 ? i + 10 : i6;
                                            j = j6;
                                        }
                                    }
                                    this.f182000d = i4;
                                    return j;
                                }
                                j2 = -34093383808L;
                            }
                        }
                    }
                    i4 = i5;
                    j = j3 ^ j5;
                    this.f182000d = i4;
                    return j;
                }
                j2 = -128;
                j = j2 ^ j4;
                this.f182000d = i4;
                return j;
            }
        }
        return m71248n();
    }

    /* JADX INFO: renamed from: n */
    public final long m71248n() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f182000d == this.f181998b) {
                m71251q(1);
            }
            int i2 = this.f182000d;
            this.f182000d = i2 + 1;
            byte b = this.f181997a[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: o */
    public final int m71249o() throws InvalidProtocolBufferException {
        if (this.f182000d == this.f181998b && !m71254t(1)) {
            this.f182002f = 0;
            return 0;
        }
        int iM71246l = m71246l();
        this.f182002f = iM71246l;
        if ((iM71246l >>> 3) != 0) {
            return iM71246l;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: p */
    public final void m71250p() {
        int i = this.f181998b + this.f181999c;
        this.f181998b = i;
        int i2 = this.f182003g + i;
        int i3 = this.f182004h;
        if (i2 <= i3) {
            this.f181999c = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f181999c = i4;
        this.f181998b = i - i4;
    }

    /* JADX INFO: renamed from: q */
    public final void m71251q(int i) throws InvalidProtocolBufferException {
        if (!m71254t(i)) {
            throw InvalidProtocolBufferException.m24218b();
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m71252r(int i, w780 w780Var) throws IOException {
        boolean zM71252r;
        int i2 = i & 7;
        if (i2 == 0) {
            long jM71247m = m71247m();
            w780Var.m87353Y(i);
            w780Var.m87354Z(jM71247m);
            return true;
        }
        if (i2 == 1) {
            long jM71245k = m71245k();
            w780Var.m87353Y(i);
            w780Var.m87352X(jM71245k);
            return true;
        }
        if (i2 == 2) {
            xj90 xj90VarM71240f = m71240f();
            w780Var.m87353Y(i);
            w780Var.m87353Y(xj90VarM71240f.size());
            w780Var.m87349U(xj90VarM71240f);
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
            }
            int iM71244j = m71244j();
            w780Var.m87353Y(i);
            w780Var.m87351W(iM71244j);
            return true;
        }
        w780Var.m87353Y(i);
        do {
            int iM71249o = m71249o();
            if (iM71249o == 0) {
                break;
            }
            m71236b();
            this.f182005i++;
            zM71252r = m71252r(iM71249o, w780Var);
            this.f182005i--;
        } while (zM71252r);
        int i3 = ((i >>> 3) << 3) | 4;
        m71235a(i3);
        w780Var.m87353Y(i3);
        return true;
    }

    /* JADX INFO: renamed from: s */
    public final void m71253s(int i) throws InvalidProtocolBufferException {
        int i2 = this.f181998b;
        int i3 = this.f182000d;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f182000d = i3 + i;
            return;
        }
        if (i < 0) {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.f182003g;
        int i6 = i5 + i3 + i;
        int i7 = this.f182004h;
        if (i6 > i7) {
            m71253s((i7 - i5) - i3);
            throw InvalidProtocolBufferException.m24218b();
        }
        this.f182000d = i2;
        m71251q(1);
        while (true) {
            int i8 = i - i4;
            int i9 = this.f181998b;
            if (i8 <= i9) {
                this.f182000d = i8;
                return;
            } else {
                i4 += i9;
                this.f182000d = i9;
                m71251q(1);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m71254t(int i) throws IOException {
        InputStream inputStream;
        int i2 = this.f182000d;
        int i3 = i2 + i;
        int i4 = this.f181998b;
        if (i3 <= i4) {
            throw new IllegalStateException(edb.m38563l("refillBuffer() called when ", i, " bytes were already available in buffer"));
        }
        if (this.f182003g + i2 + i <= this.f182004h && (inputStream = this.f182001e) != null) {
            byte[] bArr = this.f181997a;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f182003g += i2;
                this.f181998b -= i2;
                this.f182000d = 0;
            }
            int i5 = this.f181998b;
            int i6 = inputStream.read(bArr, i5, bArr.length - i5);
            if (i6 == 0 || i6 < -1 || i6 > bArr.length) {
                throw new IllegalStateException(edb.m38563l("InputStream#read(byte[]) returned invalid result: ", i6, "\nThe InputStream implementation is buggy."));
            }
            if (i6 > 0) {
                this.f181998b += i6;
                if ((this.f182003g + i) - 67108864 > 0) {
                    throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                m71250p();
                if (this.f181998b >= i) {
                    return true;
                }
                return m71254t(i);
            }
        }
        return false;
    }
}
