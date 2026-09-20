package p204p;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes9.dex */
public final class odc1 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f164156a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f164157b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f164158c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f164159d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ View f164160e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f164161f;

    public odc1(int i, int i2, float f, float f2, View view, boolean z) {
        this.f164156a = i;
        this.f164157b = i2;
        this.f164158c = f;
        this.f164159d = f2;
        this.f164160e = view;
        this.f164161f = z;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = this.f164157b;
        int i2 = this.f164156a;
        int i3 = i2 + ((int) ((i - i2) * fFloatValue));
        float f = this.f164158c;
        float fM38555d = edb.m38555d(this.f164159d, f, fFloatValue, f);
        View view = this.f164160e;
        view.setAlpha(fM38555d);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (this.f164161f) {
            layoutParams.width = i3;
        } else {
            layoutParams.height = i3;
        }
        view.setLayoutParams(layoutParams);
        view.requestLayout();
    }
}
