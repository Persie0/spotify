package p204p;

import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface y940 extends eru0 {

    /* JADX INFO: renamed from: O */
    public static final sy7 f270497O = new sy7("camerax.core.imageOutput.targetAspectRatio", z96.class, null);

    /* JADX INFO: renamed from: P */
    public static final sy7 f270498P;

    /* JADX INFO: renamed from: Q */
    public static final sy7 f270499Q;

    /* JADX INFO: renamed from: R */
    public static final sy7 f270500R;

    /* JADX INFO: renamed from: S */
    public static final sy7 f270501S;

    /* JADX INFO: renamed from: T */
    public static final sy7 f270502T;

    /* JADX INFO: renamed from: U */
    public static final sy7 f270503U;

    /* JADX INFO: renamed from: V */
    public static final sy7 f270504V;

    /* JADX INFO: renamed from: W */
    public static final sy7 f270505W;

    /* JADX INFO: renamed from: a0 */
    public static final sy7 f270506a0;

    static {
        Class cls = Integer.TYPE;
        f270498P = new sy7("camerax.core.imageOutput.targetRotation", cls, null);
        f270499Q = new sy7("camerax.core.imageOutput.appTargetRotation", cls, null);
        f270500R = new sy7("camerax.core.imageOutput.mirrorMode", cls, null);
        f270501S = new sy7("camerax.core.imageOutput.targetResolution", Size.class, null);
        f270502T = new sy7("camerax.core.imageOutput.defaultResolution", Size.class, null);
        f270503U = new sy7("camerax.core.imageOutput.maxResolution", Size.class, null);
        f270504V = new sy7("camerax.core.imageOutput.supportedResolutions", List.class, null);
        f270505W = new sy7("camerax.core.imageOutput.resolutionSelector", pyw0.class, null);
        f270506a0 = new sy7("camerax.core.imageOutput.customOrderedResolutions", List.class, null);
    }

    /* JADX INFO: renamed from: s */
    static void m93144s(y940 y940Var) {
        boolean zMo39829d = y940Var.mo39829d(f270497O);
        boolean z = ((Size) y940Var.mo39830f(f270501S, null)) != null;
        if (zMo39829d && z) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (((pyw0) y940Var.mo39830f(f270505W, null)) != null) {
            if (zMo39829d || z) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    /* JADX INFO: renamed from: n */
    default int m93145n() {
        return ((Integer) mo39830f(f270498P, 0)).intValue();
    }
}
