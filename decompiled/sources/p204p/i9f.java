package p204p;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes7.dex */
public final class i9f {

    /* JADX INFO: renamed from: c */
    public static final ArgbEvaluator f99999c = new ArgbEvaluator();

    /* JADX INFO: renamed from: a */
    public final g9f f100000a;

    /* JADX INFO: renamed from: b */
    public int f100001b = -1;

    public i9f(g9f g9fVar) {
        this.f100000a = g9fVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m49987a(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(this.f100001b, i);
        valueAnimator.setEvaluator(f99999c);
        valueAnimator.setDuration(500L);
        valueAnimator.addUpdateListener(new rx4(this, 5));
        valueAnimator.start();
        this.f100001b = i;
    }
}
