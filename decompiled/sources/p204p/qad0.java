package p204p;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface qad0 {
    /* JADX INFO: renamed from: a */
    void mo28880a(Bundle bundle);

    /* JADX INFO: renamed from: b */
    void mo28881b(long j, int i, int i2, int i3);

    /* JADX INFO: renamed from: c */
    void mo28882c(int i, myl mylVar, long j, int i2);

    /* JADX INFO: renamed from: d */
    void mo28883d(cbd0 cbd0Var, Handler handler);

    /* JADX INFO: renamed from: e */
    MediaFormat mo28884e();

    /* JADX INFO: renamed from: f */
    void mo28885f();

    void flush();

    /* JADX INFO: renamed from: g */
    ByteBuffer mo28886g(int i);

    /* JADX INFO: renamed from: h */
    void mo28887h(int i);

    /* JADX INFO: renamed from: i */
    default boolean mo28888i(cz90 cz90Var) {
        return false;
    }

    /* JADX INFO: renamed from: j */
    void mo28889j(Surface surface);

    /* JADX INFO: renamed from: k */
    void mo28890k(int i);

    /* JADX INFO: renamed from: l */
    boolean mo28891l();

    /* JADX INFO: renamed from: m */
    default void mo28892m(Runnable runnable) {
        runnable.run();
    }

    /* JADX INFO: renamed from: n */
    void mo28893n(int i, long j);

    /* JADX INFO: renamed from: o */
    int mo28894o();

    /* JADX INFO: renamed from: p */
    int mo28895p(MediaCodec.BufferInfo bufferInfo);

    /* JADX INFO: renamed from: q */
    ByteBuffer mo28896q(int i);

    /* JADX INFO: renamed from: r */
    void mo28897r(ArrayList arrayList);

    void release();

    /* JADX INFO: renamed from: s */
    void mo28898s(ArrayList arrayList);
}
