package p204p;

import android.util.Range;

/* JADX INFO: loaded from: classes3.dex */
public interface jla1 extends nu61, t640 {

    /* JADX INFO: renamed from: B0 */
    public static final sy7 f113565B0;

    /* JADX INFO: renamed from: C0 */
    public static final sy7 f113566C0;

    /* JADX INFO: renamed from: D0 */
    public static final sy7 f113567D0;

    /* JADX INFO: renamed from: E0 */
    public static final sy7 f113568E0;

    /* JADX INFO: renamed from: F0 */
    public static final sy7 f113569F0;

    /* JADX INFO: renamed from: G0 */
    public static final sy7 f113570G0;

    /* JADX INFO: renamed from: H0 */
    public static final sy7 f113571H0;

    /* JADX INFO: renamed from: x0 */
    public static final sy7 f113572x0 = new sy7("camerax.core.useCase.defaultSessionConfig", vxz0.class, null);

    /* JADX INFO: renamed from: y0 */
    public static final sy7 f113573y0 = new sy7("camerax.core.useCase.defaultCaptureConfig", yvb.class, null);

    /* JADX INFO: renamed from: z0 */
    public static final sy7 f113574z0 = new sy7("camerax.core.useCase.sessionConfigUnpacker", tdb.class, null);

    /* JADX INFO: renamed from: A0 */
    public static final sy7 f113564A0 = new sy7("camerax.core.useCase.captureConfigUnpacker", odb.class, null);

    static {
        Class cls = Integer.TYPE;
        f113565B0 = new sy7("camerax.core.useCase.surfaceOccupancyPriority", cls, null);
        f113566C0 = new sy7("camerax.core.useCase.targetFrameRate", Range.class, null);
        Class cls2 = Boolean.TYPE;
        f113567D0 = new sy7("camerax.core.useCase.zslDisabled", cls2, null);
        f113568E0 = new sy7("camerax.core.useCase.highResolutionDisabled", cls2, null);
        f113569F0 = new sy7("camerax.core.useCase.captureType", lla1.class, null);
        f113570G0 = new sy7("camerax.core.useCase.previewStabilizationMode", cls, null);
        f113571H0 = new sy7("camerax.core.useCase.videoStabilizationMode", cls, null);
    }

    /* JADX INFO: renamed from: p */
    default int m53666p() {
        return ((Integer) mo39830f(f113570G0, 0)).intValue();
    }

    /* JADX INFO: renamed from: q */
    default lla1 mo53667q() {
        return (lla1) mo39828c(f113569F0);
    }
}
