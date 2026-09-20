package androidx.compose.foundation.gestures;

import androidx.compose.foundation.internal.PlatformOptimizedCancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Landroidx/compose/foundation/gestures/FlingCancellationException;", "Landroidx/compose/foundation/internal/PlatformOptimizedCancellationException;", "<init>", "()V", "foundation"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final class FlingCancellationException extends PlatformOptimizedCancellationException {
    public FlingCancellationException() {
        super("The fling animation was cancelled");
    }
}
