package p204p;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public interface t27 {

    /* JADX INFO: renamed from: a */
    public static final ByteBuffer f216437a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* JADX INFO: renamed from: d */
    boolean mo31666d();

    /* JADX INFO: renamed from: e */
    ByteBuffer mo31667e();

    /* JADX INFO: renamed from: f */
    q27 mo31668f(q27 q27Var);

    default void flush() {
        throw new IllegalStateException("AudioProcessor must implement at least one #flush() overload.");
    }

    /* JADX INFO: renamed from: g */
    default void mo31669g(s27 s27Var) {
        flush();
    }

    /* JADX INFO: renamed from: h */
    void mo31670h(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: i */
    void mo31671i();

    boolean isActive();

    void reset();

    /* JADX INFO: renamed from: j */
    default long mo40331j(long j) {
        return j;
    }
}
