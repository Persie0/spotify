package p204p;

import androidx.media3.session.legacy.PlaybackStateCompat;
import java.io.EOFException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class tuu0 implements fqa {

    /* JADX INFO: renamed from: a */
    public final ai21 f223923a;

    /* JADX INFO: renamed from: b */
    public final npa f223924b = new npa();

    /* JADX INFO: renamed from: c */
    public boolean f223925c;

    public tuu0(ai21 ai21Var) {
        this.f223923a = ai21Var;
    }

    @Override // p204p.fqa
    /* JADX INFO: renamed from: B0 */
    public final fqa mo42403B0(long j) {
        if (this.f223925c) {
            throw new IllegalStateException("closed");
        }
        this.f223924b.m65299K(j);
        m81592a();
        return this;
    }

    @Override // p204p.fqa
    /* JADX INFO: renamed from: H */
    public final long mo42404H(wt31 wt31Var) {
        long j = 0;
        while (true) {
            long jMo27348g1 = wt31Var.mo27348g1(this.f223924b, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (jMo27348g1 == -1) {
                return j;
            }
            j += jMo27348g1;
            m81592a();
        }
    }

    @Override // p204p.ai21
    /* JADX INFO: renamed from: U0 */
    public final void mo25160U0(npa npaVar, long j) {
        if (this.f223925c) {
            throw new IllegalStateException("closed");
        }
        this.f223924b.mo25160U0(npaVar, j);
        m81592a();
    }

    @Override // p204p.fqa
    /* JADX INFO: renamed from: Z */
    public final fqa mo42405Z(vuu0 vuu0Var, long j) throws EOFException {
        while (j > 0) {
            long jMo27348g1 = vuu0Var.mo27348g1(this.f223924b, j);
            if (jMo27348g1 == -1) {
                throw new EOFException();
            }
            j -= jMo27348g1;
            m81592a();
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final fqa m81592a() {
        if (this.f223925c) {
            throw new IllegalStateException("closed");
        }
        npa npaVar = this.f223924b;
        long jM65307e = npaVar.m65307e();
        if (jM65307e > 0) {
            this.f223923a.mo25160U0(npaVar, jM65307e);
        }
        return this;
    }

    @Override // p204p.fqa
    /* JADX INFO: renamed from: b0 */
    public final fqa mo42406b0(String str) {
        if (this.f223925c) {
            throw new IllegalStateException("closed");
        }
        this.f223924b.m65304Q(str);
        m81592a();
        return this;
    }

    @Override // p204p.ai21, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        ai21 ai21Var = this.f223923a;
        if (this.f223925c) {
            return;
        }
        npa npaVar = this.f223924b;
        long j = npaVar.f156904b;
        if (j > 0) {
            ai21Var.mo25160U0(npaVar, j);
        }
        th = null;
        try {
            ai21Var.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f223925c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p204p.fqa, p204p.ai21, java.io.Flushable
    public final void flush() {
        if (this.f223925c) {
            throw new IllegalStateException("closed");
        }
        npa npaVar = this.f223924b;
        long j = npaVar.f156904b;
        ai21 ai21Var = this.f223923a;
        if (j > 0) {
            ai21Var.mo25160U0(npaVar, j);
        }
        ai21Var.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f223925c;
    }

    @Override // p204p.fqa
    /* JADX INFO: renamed from: j1 */
    public final fqa mo42407j1(int i, int i2, String str) {
        if (this.f223925c) {
            throw new IllegalStateException("closed");
        }
        this.f223924b.m65303P(i, i2, str);
        m81592a();
        return this;
    }

    @Override // p204p.fqa
    /* JADX INFO: renamed from: l */
    public final npa mo42408l() {
        return this.f223924b;
    }

    @Override // p204p.ai21
    /* JADX INFO: renamed from: m */
    public final au71 mo25161m() {
        return this.f223923a.mo25161m();
    }

    @Override // p204p.fqa
    /* JADX INFO: renamed from: q1 */
    public final fqa mo42409q1(iva ivaVar) {
        if (this.f223925c) {
            throw new IllegalStateException("closed");
        }
        this.f223924b.m65297I(ivaVar);
        m81592a();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f223923a + ')';
    }

    @Override // p204p.fqa
    /* JADX INFO: renamed from: v0 */
    public final fqa mo42410v0(int i, byte[] bArr, int i2) {
        if (this.f223925c) {
            throw new IllegalStateException("closed");
        }
        this.f223924b.write(bArr, i, i2);
        m81592a();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.f223925c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f223924b.write(byteBuffer);
        m81592a();
        return iWrite;
    }

    @Override // p204p.fqa
    public final fqa writeByte(int i) {
        if (this.f223925c) {
            throw new IllegalStateException("closed");
        }
        this.f223924b.m65298J(i);
        m81592a();
        return this;
    }

    @Override // p204p.fqa
    public final fqa writeInt(int i) {
        if (this.f223925c) {
            throw new IllegalStateException("closed");
        }
        this.f223924b.m65301M(i);
        m81592a();
        return this;
    }

    @Override // p204p.fqa
    public final fqa writeShort(int i) {
        if (this.f223925c) {
            throw new IllegalStateException("closed");
        }
        this.f223924b.m65302N(i);
        m81592a();
        return this;
    }

    @Override // p204p.fqa
    public final fqa write(byte[] bArr) {
        if (!this.f223925c) {
            this.f223924b.write(bArr, 0, bArr.length);
            m81592a();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
