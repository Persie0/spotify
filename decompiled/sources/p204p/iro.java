package p204p;

import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class iro extends opa {

    /* JADX INFO: renamed from: b */
    public r300 f105016b;

    /* JADX INFO: renamed from: c */
    public final myl f105017c = new myl();

    /* JADX INFO: renamed from: d */
    public ByteBuffer f105018d;

    /* JADX INFO: renamed from: e */
    public boolean f105019e;

    /* JADX INFO: renamed from: f */
    public long f105020f;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f105021g;

    /* JADX INFO: renamed from: h */
    public final int f105022h;

    static {
        dgd0.m35920a("media3.decoder");
    }

    public iro(int i) {
        this.f105022h = i;
    }

    /* JADX INFO: renamed from: g */
    public void mo51465g() {
        this.f167824a = 0;
        ByteBuffer byteBuffer = this.f105018d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f105021g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f105019e = false;
    }

    /* JADX INFO: renamed from: h */
    public final ByteBuffer m51466h(int i) {
        int i2 = this.f105022h;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f105018d;
        throw new DecoderInputBuffer$InsufficientCapacityException(edb.m38560i(byteBuffer == null ? 0 : byteBuffer.capacity(), i, "Buffer too small (", " < ", ")"));
    }

    /* JADX INFO: renamed from: i */
    public final void m51467i(int i) {
        ByteBuffer byteBuffer = this.f105018d;
        if (byteBuffer == null) {
            this.f105018d = m51466h(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            this.f105018d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferM51466h = m51466h(i2);
        byteBufferM51466h.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferM51466h.put(byteBuffer);
        }
        this.f105018d = byteBufferM51466h;
    }

    /* JADX INFO: renamed from: j */
    public final void m51468j() {
        ByteBuffer byteBuffer = this.f105018d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f105021g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
