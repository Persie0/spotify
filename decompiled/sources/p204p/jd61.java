package p204p;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class jd61 extends Animation {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f111270a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f111271b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SwipeRefreshLayout f111272c;

    public jd61(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.f111272c = swipeRefreshLayout;
        this.f111270a = i;
        this.f111271b = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        dee deeVar = this.f111272c.f1324a1;
        int i = this.f111270a;
        deeVar.setAlpha((int) (((this.f111271b - i) * f) + i));
    }
}
