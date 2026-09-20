package androidx.p004xr.runtime.internal;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Landroidx/xr/runtime/internal/FaceTrackingNotCalibratedException;", "Landroidx/xr/runtime/internal/LifecycleException;", "<init>", "()V", "runtime"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final class FaceTrackingNotCalibratedException extends LifecycleException {
    public FaceTrackingNotCalibratedException() {
        super("Failed to create session, face tracking is required but has not been calibrated.", null);
    }
}
