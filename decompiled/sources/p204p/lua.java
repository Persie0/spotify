package p204p;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class lua implements wt31 {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f137041a;

    /* JADX INFO: renamed from: b */
    public final int f137042b;

    public lua(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        this.f137041a = byteBufferSlice;
        this.f137042b = byteBufferSlice.capacity();
    }

    @Override // p204p.wt31
    /* JADX INFO: renamed from: g1 */
    public final long mo27348g1(npa npaVar, long j) {
        ByteBuffer byteBuffer = this.f137041a;
        int iPosition = byteBuffer.position();
        int i = this.f137042b;
        if (iPosition == i) {
            return -1L;
        }
        int iPosition2 = (int) (((long) byteBuffer.position()) + j);
        if (iPosition2 <= i) {
            i = iPosition2;
        }
        byteBuffer.limit(i);
        return npaVar.write(byteBuffer);
    }

    @Override // p204p.wt31
    /* JADX INFO: renamed from: m */
    public final au71 mo27349m() {
        return au71.f19881d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
