package p204p;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.compose.p002ui.geometry.Size;

/* JADX INFO: loaded from: classes3.dex */
public final class vfs implements Drawable.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wfs f241024a;

    public vfs(wfs wfsVar) {
        this.f241024a = wfsVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        long jFloatToRawIntBits;
        wfs wfsVar = this.f241024a;
        yum0 yum0Var = wfsVar.f250885g;
        yum0Var.setValue(Integer.valueOf(((Number) yum0Var.getValue()).intValue() + 1));
        Drawable drawable2 = wfsVar.f250884f;
        Object obj = xfs.f261091a;
        if (drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) {
            jFloatToRawIntBits = 9205357640488583168L;
        } else {
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(drawable2.getIntrinsicWidth())) << 32) | (((long) Float.floatToRawIntBits(drawable2.getIntrinsicHeight())) & 4294967295L);
        }
        wfsVar.f250886h.setValue(new Size(jFloatToRawIntBits));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, p.fr70] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        ((Handler) xfs.f261091a.getValue()).postAtTime(runnable, j);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, p.fr70] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        ((Handler) xfs.f261091a.getValue()).removeCallbacks(runnable);
    }
}
