package p204p;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class z1i0 {

    /* JADX INFO: renamed from: a */
    public final ab21 f278322a = new ab21(0);

    /* JADX INFO: renamed from: b */
    public final ab21 f278323b = new ab21(0);

    /* JADX INFO: renamed from: a */
    public static z1i0 m95134a(Context context, int i) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return m95135b(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return m95135b(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static z1i0 m95135b(ArrayList arrayList) {
        z1i0 z1i0Var = new z1i0();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            z1i0Var.f278323b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = r05.f194384b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = r05.f194385c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = r05.f194386d;
            }
            b2i0 b2i0Var = new b2i0();
            b2i0Var.f22618d = 0;
            b2i0Var.f22619e = 1;
            b2i0Var.f22615a = startDelay;
            b2i0Var.f22616b = duration;
            b2i0Var.f22617c = interpolator;
            b2i0Var.f22618d = objectAnimator.getRepeatCount();
            b2i0Var.f22619e = objectAnimator.getRepeatMode();
            z1i0Var.f278322a.put(propertyName, b2i0Var);
        }
        return z1i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z1i0) {
            return this.f278322a.equals(((z1i0) obj).f278322a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f278322a.hashCode();
    }

    public final String toString() {
        return "\n" + z1i0.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f278322a + "}\n";
    }
}
