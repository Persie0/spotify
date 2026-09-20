package p204p;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: loaded from: classes8.dex */
public final class wdq extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f250321a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ deq f250322b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wdq(deq deqVar, int i) {
        super(0);
        this.f250321a = i;
        this.f250322b = deqVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f250321a;
        deq deqVar = this.f250322b;
        switch (i) {
            case 0:
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(1000L);
                valueAnimatorOfFloat.setRepeatCount(-1);
                valueAnimatorOfFloat.setRepeatMode(1);
                valueAnimatorOfFloat.addUpdateListener(new aee(2, valueAnimatorOfFloat, deqVar));
                valueAnimatorOfFloat.addListener(new xdq(0, deqVar, valueAnimatorOfFloat));
                return valueAnimatorOfFloat;
            default:
                return ((LayerDrawable) deqVar.f48148c.getProgressDrawable()).findDrawableByLayerId(R.id.secondaryProgress);
        }
    }
}
