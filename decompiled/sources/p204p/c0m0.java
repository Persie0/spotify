package p204p;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mainlayout.p106ui.view.containers.MainLayoutFragmentContainerView;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class c0m0 {

    /* JADX INFO: renamed from: a */
    public final View f32822a;

    /* JADX INFO: renamed from: b */
    public final View f32823b;

    /* JADX INFO: renamed from: c */
    public final int f32824c;

    /* JADX INFO: renamed from: d */
    public final int f32825d;

    /* JADX INFO: renamed from: e */
    public int f32826e;

    /* JADX INFO: renamed from: f */
    public ValueAnimator f32827f;

    /* JADX INFO: renamed from: g */
    public ObjectAnimator f32828g;

    /* JADX INFO: renamed from: h */
    public ObjectAnimator f32829h;

    /* JADX INFO: renamed from: i */
    public yxb0 f32830i;

    public c0m0(MainLayoutFragmentContainerView mainLayoutFragmentContainerView, ViewGroup viewGroup, int i, int i2) {
        this.f32822a = mainLayoutFragmentContainerView;
        this.f32823b = viewGroup;
        this.f32824c = i;
        this.f32825d = i2;
        viewGroup.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: a */
    public final void m31185a() {
        ValueAnimator valueAnimator = this.f32827f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ObjectAnimator objectAnimator = this.f32828g;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f32829h;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        this.f32827f = null;
        this.f32828g = null;
        this.f32829h = null;
    }

    /* JADX INFO: renamed from: b */
    public final int m31186b(int i) {
        int i2 = i == 0 ? -1 : a0m0.f11121a[edb.m38547C(i)];
        if (i2 == -1 || i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return this.f32824c;
        }
        if (i2 == 3) {
            return this.f32825d;
        }
        throw new NoWhenBranchMatchedException();
    }
}
