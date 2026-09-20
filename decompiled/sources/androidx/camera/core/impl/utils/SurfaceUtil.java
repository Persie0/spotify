package androidx.camera.core.impl.utils;

import android.view.Surface;
import p204p.og6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SurfaceUtil {
    static {
        System.loadLibrary("surface_util_jni");
    }

    /* JADX INFO: renamed from: a */
    public static og6 m192a(Surface surface) {
        int[] iArrNativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        og6 og6Var = new og6(27);
        int i = iArrNativeGetSurfaceInfo[0];
        int i2 = iArrNativeGetSurfaceInfo[1];
        int i3 = iArrNativeGetSurfaceInfo[2];
        return og6Var;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);
}
