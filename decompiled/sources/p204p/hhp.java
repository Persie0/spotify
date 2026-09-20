package p204p;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class hhp implements d5y {

    /* JADX INFO: renamed from: b */
    public final fho f91552b;

    /* JADX INFO: renamed from: c */
    public final long f91553c;

    /* JADX INFO: renamed from: d */
    public long f91554d;

    /* JADX INFO: renamed from: f */
    public int f91556f;

    /* JADX INFO: renamed from: g */
    public int f91557g;

    /* JADX INFO: renamed from: e */
    public byte[] f91555e = new byte[65536];

    /* JADX INFO: renamed from: a */
    public final byte[] f91551a = new byte[4096];

    static {
        dgd0.m35920a("media3.extractor");
    }

    public hhp(fho fhoVar, long j, long j2) {
        this.f91552b = fhoVar;
        this.f91554d = j;
        this.f91553c = j2;
    }

    @Override // p204p.d5y
    /* JADX INFO: renamed from: b */
    public final boolean mo35035b(int i, boolean z) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f91557g, i);
        m47604j(iMin);
        int iM47603f = iMin;
        while (iM47603f < i && iM47603f != -1) {
            byte[] bArr = this.f91551a;
            iM47603f = m47603f(bArr, -iM47603f, Math.min(i, bArr.length + iM47603f), iM47603f, z);
        }
        if (iM47603f != -1) {
            this.f91554d += (long) iM47603f;
        }
        return iM47603f != -1;
    }

    @Override // p204p.d5y
    /* JADX INFO: renamed from: c */
    public final boolean mo35036c(byte[] bArr, int i, int i2, boolean z) {
        if (!mo35045w(i2, z)) {
            return false;
        }
        System.arraycopy(this.f91555e, this.f91556f - i2, bArr, i, i2);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m47602d(int i) {
        int i2 = this.f91556f + i;
        byte[] bArr = this.f91555e;
        if (i2 > bArr.length) {
            this.f91555e = Arrays.copyOf(this.f91555e, h0b1.m46317j(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m47603f(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.f91552b.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p204p.d5y
    /* JADX INFO: renamed from: g */
    public final void mo35037g() {
        this.f91556f = 0;
    }

    @Override // p204p.d5y
    public final long getLength() {
        return this.f91553c;
    }

    @Override // p204p.d5y
    public final long getPosition() {
        return this.f91554d;
    }

    @Override // p204p.d5y
    /* JADX INFO: renamed from: h */
    public final boolean mo35038h(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iMin;
        int i3 = this.f91557g;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.f91555e, 0, bArr, i, iMin);
            m47604j(iMin);
        }
        int iM47603f = iMin;
        while (iM47603f < i2 && iM47603f != -1) {
            iM47603f = m47603f(bArr, i, i2, iM47603f, z);
        }
        if (iM47603f != -1) {
            this.f91554d += (long) iM47603f;
        }
        return iM47603f != -1;
    }

    @Override // p204p.d5y
    /* JADX INFO: renamed from: i */
    public final void mo35039i(int i, byte[] bArr, int i2) {
        mo35036c(bArr, i, i2, false);
    }

    /* JADX INFO: renamed from: j */
    public final void m47604j(int i) {
        int i2 = this.f91557g - i;
        this.f91557g = i2;
        this.f91556f = 0;
        byte[] bArr = this.f91555e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f91555e = bArr2;
    }

    @Override // p204p.d5y
    /* JADX INFO: renamed from: k */
    public final long mo35040k() {
        return this.f91554d + ((long) this.f91556f);
    }

    @Override // p204p.d5y
    /* JADX INFO: renamed from: n */
    public final void mo35041n(int i) {
        mo35045w(i, false);
    }

    @Override // p204p.d5y
    /* JADX INFO: renamed from: r */
    public final int mo35042r(int i, byte[] bArr, int i2) throws EOFException, InterruptedIOException {
        hhp hhpVar;
        int iMin;
        m47602d(i2);
        int i3 = this.f91557g;
        int i4 = this.f91556f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            hhpVar = this;
            iMin = hhpVar.m47603f(this.f91555e, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            hhpVar.f91557g += iMin;
        } else {
            hhpVar = this;
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(hhpVar.f91555e, hhpVar.f91556f, bArr, i, iMin);
        hhpVar.f91556f += iMin;
        return iMin;
    }

    @Override // p204p.fho
    public final int read(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        hhp hhpVar;
        int i3 = this.f91557g;
        int iM47603f = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.f91555e, 0, bArr, i, iMin);
            m47604j(iMin);
            iM47603f = iMin;
        }
        if (iM47603f == 0) {
            hhpVar = this;
            iM47603f = hhpVar.m47603f(bArr, i, i2, 0, true);
        } else {
            hhpVar = this;
        }
        if (iM47603f != -1) {
            hhpVar.f91554d += (long) iM47603f;
        }
        return iM47603f;
    }

    @Override // p204p.d5y
    public final void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        mo35038h(bArr, i, i2, false);
    }

    @Override // p204p.d5y
    /* JADX INFO: renamed from: s */
    public final int mo35043s(int i) throws EOFException, InterruptedIOException {
        hhp hhpVar;
        int iMin = Math.min(this.f91557g, i);
        m47604j(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f91551a;
            hhpVar = this;
            iMin = hhpVar.m47603f(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            hhpVar = this;
        }
        if (iMin != -1) {
            hhpVar.f91554d += (long) iMin;
        }
        return iMin;
    }

    @Override // p204p.d5y
    /* JADX INFO: renamed from: v */
    public final void mo35044v(int i) throws EOFException, InterruptedIOException {
        mo35035b(i, false);
    }

    @Override // p204p.d5y
    /* JADX INFO: renamed from: w */
    public final boolean mo35045w(int i, boolean z) {
        m47602d(i);
        int iM47603f = this.f91557g - this.f91556f;
        while (iM47603f < i) {
            int i2 = i;
            boolean z2 = z;
            iM47603f = m47603f(this.f91555e, this.f91556f, i2, iM47603f, z2);
            if (iM47603f == -1) {
                return false;
            }
            this.f91557g = this.f91556f + iM47603f;
            i = i2;
            z = z2;
        }
        this.f91556f += i;
        return true;
    }
}
