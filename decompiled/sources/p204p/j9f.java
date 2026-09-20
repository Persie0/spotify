package p204p;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes8.dex */
public final class j9f {

    /* JADX INFO: renamed from: d */
    public static final ArgbEvaluator f110159d = new ArgbEvaluator();

    /* JADX INFO: renamed from: a */
    public int f110160a;

    /* JADX INFO: renamed from: b */
    public final long f110161b = 300;

    /* JADX INFO: renamed from: c */
    public final h9f f110162c;

    public j9f(int i, h9f h9fVar) {
        this.f110160a = i;
        this.f110162c = h9fVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m52742a(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(this.f110160a, i);
        valueAnimator.setEvaluator(f110159d);
        valueAnimator.setDuration(this.f110161b);
        valueAnimator.addUpdateListener(new rx4(this, 4));
        valueAnimator.start();
        this.f110160a = i;
    }
}
