package p204p;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes3.dex */
public final class cly0 implements dly0 {

    /* JADX INFO: renamed from: a */
    public final ScrollFeedbackProvider f39422a;

    public cly0(NestedScrollView nestedScrollView) {
        this.f39422a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // p204p.dly0
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.f39422a.onScrollLimit(i, i2, i3, z);
    }

    @Override // p204p.dly0
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.f39422a.onScrollProgress(i, i2, i3, i4);
    }
}
