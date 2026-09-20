package p204p;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class wk91 extends cy8 {

    /* JADX INFO: renamed from: i */
    public int f252163i;

    /* JADX INFO: renamed from: j */
    public int f252164j;

    /* JADX INFO: renamed from: k */
    public boolean f252165k;

    /* JADX INFO: renamed from: l */
    public int f252166l;

    /* JADX INFO: renamed from: m */
    public byte[] f252167m;

    /* JADX INFO: renamed from: n */
    public int f252168n;

    /* JADX INFO: renamed from: o */
    public long f252169o;

    @Override // p204p.cy8
    /* JADX INFO: renamed from: a */
    public final q27 mo34344a(q27 q27Var) throws AudioProcessor$UnhandledAudioFormatException {
        if (!h0b1.m46288P(q27Var.f184528c)) {
            throw new AudioProcessor$UnhandledAudioFormatException(q27Var);
        }
        this.f252165k = true;
        return (this.f252163i == 0 && this.f252164j == 0) ? q27.f184525e : q27Var;
    }

    @Override // p204p.cy8
    /* JADX INFO: renamed from: b */
    public final void mo34345b() {
        if (this.f252165k) {
            this.f252165k = false;
            int i = this.f252164j;
            int i2 = this.f43179b.f184529d;
            this.f252167m = new byte[i * i2];
            this.f252166l = this.f252163i * i2;
        }
        this.f252168n = 0;
    }

    @Override // p204p.cy8
    /* JADX INFO: renamed from: c */
    public final void mo34346c() {
        if (this.f252165k) {
            int i = this.f252168n;
            if (i > 0) {
                this.f252169o += (long) (i / this.f43179b.f184529d);
            }
            this.f252168n = 0;
        }
    }

    @Override // p204p.cy8, p204p.t27
    /* JADX INFO: renamed from: d */
    public final boolean mo31666d() {
        return super.mo31666d() && this.f252168n == 0;
    }

    @Override // p204p.cy8, p204p.t27
    /* JADX INFO: renamed from: e */
    public final ByteBuffer mo31667e() {
        int i;
        if (super.mo31666d() && (i = this.f252168n) > 0) {
            m34348l(i).put(this.f252167m, 0, this.f252168n).flip();
            this.f252168n = 0;
        }
        return super.mo31667e();
    }

    @Override // p204p.t27
    /* JADX INFO: renamed from: h */
    public final void mo31670h(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f252166l);
        this.f252169o += (long) (iMin / this.f43179b.f184529d);
        this.f252166l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f252166l > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.f252168n + i2) - this.f252167m.length;
        ByteBuffer byteBufferM34348l = m34348l(length);
        int iM46317j = h0b1.m46317j(length, 0, this.f252168n);
        byteBufferM34348l.put(this.f252167m, 0, iM46317j);
        int iM46317j2 = h0b1.m46317j(length - iM46317j, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iM46317j2);
        byteBufferM34348l.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iM46317j2;
        int i4 = this.f252168n - iM46317j;
        this.f252168n = i4;
        byte[] bArr = this.f252167m;
        System.arraycopy(bArr, iM46317j, bArr, 0, i4);
        byteBuffer.get(this.f252167m, this.f252168n, i3);
        this.f252168n += i3;
        byteBufferM34348l.flip();
    }

    @Override // p204p.t27
    /* JADX INFO: renamed from: j */
    public final long mo40331j(long j) {
        return Math.max(0L, j - h0b1.m46308e0(this.f43179b.f184526a, this.f252164j + this.f252163i));
    }

    @Override // p204p.cy8
    /* JADX INFO: renamed from: k */
    public final void mo34347k() {
        this.f252167m = h0b1.f86201b;
    }
}
