package androidx.compose.p002ui;

import androidx.compose.p002ui.internal.PlatformOptimizedCancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Landroidx/compose/ui/ModifierNodeDetachedCancellationException;", "Landroidx/compose/ui/internal/PlatformOptimizedCancellationException;", "<init>", "()V", "ui"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final class ModifierNodeDetachedCancellationException extends PlatformOptimizedCancellationException {
    public ModifierNodeDetachedCancellationException() {
        super("The Modifier.Node was detached");
    }
}
