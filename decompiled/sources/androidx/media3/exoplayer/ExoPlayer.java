package androidx.media3.exoplayer;

import androidx.media3.exoplayer.image.ImageOutput;
import p204p.g7p0;
import p204p.hro;
import p204p.iap0;
import p204p.jap0;
import p204p.o09;
import p204p.op3;
import p204p.wz8;

/* JADX INFO: loaded from: classes3.dex */
public interface ExoPlayer extends g7p0 {
    /* JADX INFO: renamed from: F */
    jap0 mo760F(iap0 iap0Var);

    /* JADX INFO: renamed from: G0 */
    hro mo761G0();

    /* JADX INFO: renamed from: M */
    void mo762M(wz8 wz8Var, long j);

    /* JADX INFO: renamed from: S0 */
    void mo763S0(wz8 wz8Var);

    /* JADX INFO: renamed from: Y */
    void mo764Y(wz8 wz8Var);

    /* JADX INFO: renamed from: h */
    void mo765h(int i);

    boolean isScrubbingModeEnabled();

    /* JADX INFO: renamed from: n0 */
    int mo766n0();

    /* JADX INFO: renamed from: q0 */
    o09 mo767q0(int i);

    /* JADX INFO: renamed from: r0 */
    void mo768r0(op3 op3Var);

    void setImageOutput(ImageOutput imageOutput);

    void setScrubbingModeEnabled(boolean z);

    /* JADX INFO: renamed from: w0 */
    void mo769w0(op3 op3Var);

    /* JADX INFO: renamed from: z0 */
    void mo770z0(wz8 wz8Var);
}
