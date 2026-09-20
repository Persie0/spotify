package p204p;

import androidx.media3.muxer.MuxerException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class pup implements osi0 {

    /* JADX INFO: renamed from: b */
    public static final String f181513b = w900.f249047a;

    /* JADX INFO: renamed from: a */
    public final rj40 f181514a;

    public pup(rj40 rj40Var) {
        this.f181514a = rj40Var;
    }

    @Override // p204p.osi0
    /* JADX INFO: renamed from: O */
    public final int mo63681O(r300 r300Var) {
        return this.f181514a.mo63681O(r300Var);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws MuxerException {
        this.f181514a.close();
    }

    @Override // p204p.osi0
    /* JADX INFO: renamed from: k1 */
    public final void mo63682k1(s5f0 s5f0Var) {
        this.f181514a.mo63682k1(s5f0Var);
    }

    @Override // p204p.osi0
    /* JADX INFO: renamed from: y0 */
    public final void mo63683y0(int i, ByteBuffer byteBuffer, qpa qpaVar) throws MuxerException {
        this.f181514a.mo63683y0(i, byteBuffer, qpaVar);
    }
}
