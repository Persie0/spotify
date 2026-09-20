package p204p;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes.dex */
public final class hd61 extends Animation {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SwipeRefreshLayout f90034a;

    public hd61(SwipeRefreshLayout swipeRefreshLayout) {
        this.f90034a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.f90034a.setAnimationProgress(f);
    }
}
