package p204p;

import android.content.Context;
import android.media.metrics.EditingSession;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;

/* JADX INFO: loaded from: classes3.dex */
public final class e9t implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    public EditingSession f57532a;

    /* JADX INFO: renamed from: b */
    public boolean f57533b;

    public e9t(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager != null) {
            this.f57532a = mediaMetricsManager.createEditingSession();
        }
    }

    /* JADX INFO: renamed from: a */
    public final LogSessionId m38262a() {
        EditingSession editingSession = this.f57532a;
        if (editingSession != null) {
            return editingSession.getSessionId();
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        EditingSession editingSession = this.f57532a;
        if (editingSession != null) {
            editingSession.close();
            this.f57532a = null;
        }
    }
}
