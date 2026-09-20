package p204p;

import android.animation.ValueAnimator;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class yyp implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ConstraintLayout f277555a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ j7q0 f277556b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f277557c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TransitionSet f277558d;

    public yyp(zyp zypVar, ConstraintLayout constraintLayout, j7q0 j7q0Var, int i, TransitionSet transitionSet) {
        this.f277555a = constraintLayout;
        this.f277556b = j7q0Var;
        this.f277557c = i;
        this.f277558d = transitionSet;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        j7q0 j7q0Var = this.f277556b;
        int i = this.f277557c;
        ConstraintLayout constraintLayout = this.f277555a;
        zyp.m97239b(constraintLayout, j7q0Var, i);
        TransitionManager.beginDelayedTransition(constraintLayout, this.f277558d);
    }
}
