package p204p;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.spotify.music.R;
import com.spotify.watchfeed.component.layout.p186v1.proto.WatchFeedTwoColumnsLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class bl80 extends AbstractC2440u5 {

    /* JADX INFO: renamed from: X */
    public float f28119X;

    /* JADX INFO: renamed from: Y */
    public fw4 f28120Y;

    /* JADX INFO: renamed from: e */
    public ObjectAnimator f28121e;

    /* JADX INFO: renamed from: f */
    public ObjectAnimator f28122f;

    /* JADX INFO: renamed from: g */
    public final Interpolator[] f28123g;

    /* JADX INFO: renamed from: h */
    public final gl80 f28124h;

    /* JADX INFO: renamed from: i */
    public int f28125i;

    /* JADX INFO: renamed from: t */
    public boolean f28126t;

    /* JADX INFO: renamed from: Z */
    public static final int[] f28118Z = {533, 567, 850, WatchFeedTwoColumnsLayout.CONFIGURATION_FIELD_NUMBER};

    /* JADX INFO: renamed from: L0 */
    public static final int[] f28116L0 = {1267, 1000, 333, 0};

    /* JADX INFO: renamed from: M0 */
    public static final tjc f28117M0 = new tjc(9, Float.class, "animationFraction");

    public bl80(Context context, gl80 gl80Var) {
        super(2);
        this.f28125i = 0;
        this.f28120Y = null;
        this.f28124h = gl80Var;
        this.f28123g = new Interpolator[]{AnimationUtils.loadInterpolator(context, R.animator.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R.animator.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R.animator.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R.animator.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // p204p.AbstractC2440u5
    /* JADX INFO: renamed from: G */
    public final void mo29743G(h09 h09Var) {
        this.f28120Y = h09Var;
    }

    @Override // p204p.AbstractC2440u5
    /* JADX INFO: renamed from: K */
    public final void mo29744K() {
        ObjectAnimator objectAnimator = this.f28122f;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        mo29747d();
        if (((tn40) this.f226861b).isVisible()) {
            this.f28122f.setFloatValues(this.f28119X, 1.0f);
            this.f28122f.setDuration((long) ((1.0f - this.f28119X) * 1800.0f));
            this.f28122f.start();
        }
    }

    @Override // p204p.AbstractC2440u5
    /* JADX INFO: renamed from: Q */
    public final void mo29745Q() {
        ObjectAnimator objectAnimator = this.f28121e;
        tjc tjcVar = f28117M0;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, tjcVar, 0.0f, 1.0f);
            this.f28121e = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.f28121e.setInterpolator(null);
            this.f28121e.setRepeatCount(-1);
            this.f28121e.addListener(new al80(this, 0));
        }
        if (this.f28122f == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, tjcVar, 1.0f);
            this.f28122f = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.f28122f.setInterpolator(null);
            this.f28122f.addListener(new al80(this, 1));
        }
        this.f28125i = 0;
        int iM86385l = vtg1.m86385l(this.f28124h.f107387c[0], ((tn40) this.f226861b).f59398t);
        int[] iArr = (int[]) this.f226863d;
        iArr[0] = iM86385l;
        iArr[1] = iM86385l;
        this.f28121e.start();
    }

    @Override // p204p.AbstractC2440u5
    /* JADX INFO: renamed from: S */
    public final void mo29746S() {
        this.f28120Y = null;
    }

    @Override // p204p.AbstractC2440u5
    /* JADX INFO: renamed from: d */
    public final void mo29747d() {
        ObjectAnimator objectAnimator = this.f28121e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p204p.AbstractC2440u5
    /* JADX INFO: renamed from: x */
    public final void mo29748x() {
        this.f28125i = 0;
        int iM86385l = vtg1.m86385l(this.f28124h.f107387c[0], ((tn40) this.f226861b).f59398t);
        int[] iArr = (int[]) this.f226863d;
        iArr[0] = iM86385l;
        iArr[1] = iM86385l;
    }
}
