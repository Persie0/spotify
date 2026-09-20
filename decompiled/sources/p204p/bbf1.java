package p204p;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import p196j$.p198io.DesugarInputStream;
import p196j$.p198io.InputStreamRetargetInterface;

/* JADX INFO: loaded from: classes4.dex */
public final class bbf1 extends InputStream implements InputStreamRetargetInterface {

    /* JADX INFO: renamed from: a */
    public Iterator f25550a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f25551b;

    /* JADX INFO: renamed from: c */
    public int f25552c;

    /* JADX INFO: renamed from: d */
    public int f25553d;

    /* JADX INFO: renamed from: e */
    public int f25554e;

    /* JADX INFO: renamed from: f */
    public boolean f25555f;

    /* JADX INFO: renamed from: g */
    public byte[] f25556g;

    /* JADX INFO: renamed from: h */
    public int f25557h;

    /* JADX INFO: renamed from: a */
    public final boolean m28635a() {
        ByteBuffer byteBuffer;
        Iterator it = this.f25550a;
        do {
            this.f25553d++;
            if (!it.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) it.next();
            this.f25551b = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.f25554e = this.f25551b.position();
        if (this.f25551b.hasArray()) {
            this.f25555f = true;
            this.f25556g = this.f25551b.array();
            this.f25557h = this.f25551b.arrayOffset();
        } else {
            this.f25555f = false;
            this.f25556g = null;
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m28636c(int i) {
        int i2 = this.f25554e + i;
        this.f25554e = i2;
        if (i2 == this.f25551b.limit()) {
            m28635a();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f25553d == this.f25552c) {
            return -1;
        }
        if (this.f25555f) {
            int i = this.f25556g[this.f25554e + this.f25557h] & 255;
            m28636c(1);
            return i;
        }
        int i2 = this.f25551b.get(this.f25554e) & 255;
        m28636c(1);
        return i2;
    }

    @Override // java.io.InputStream, p196j$.p198io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.f25553d == this.f25552c) {
            return -1;
        }
        int iLimit = this.f25551b.limit();
        int i3 = this.f25554e;
        int i4 = iLimit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f25555f) {
            System.arraycopy(this.f25556g, i3 + this.f25557h, bArr, i, i2);
            m28636c(i2);
            return i2;
        }
        int iPosition = this.f25551b.position();
        this.f25551b.position(this.f25554e);
        this.f25551b.get(bArr, i, i2);
        this.f25551b.position(iPosition);
        m28636c(i2);
        return i2;
    }
}
