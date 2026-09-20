package p204p;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes3.dex */
public final class ely0 {

    /* JADX INFO: renamed from: a */
    public final dly0 f60776a;

    public ely0(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f60776a = new cly0(nestedScrollView);
        } else {
            this.f60776a = new oh5();
        }
    }

    /* JADX INFO: renamed from: a */
    public static ely0 m39398a(NestedScrollView nestedScrollView) {
        return new ely0(nestedScrollView);
    }

    /* JADX INFO: renamed from: b */
    public final void m39399b(int i, int i2, int i3, boolean z) {
        this.f60776a.onScrollLimit(i, i2, i3, z);
    }

    /* JADX INFO: renamed from: c */
    public final void m39400c(int i, int i2, int i3, int i4) {
        this.f60776a.onScrollProgress(i, i2, i3, i4);
    }
}
