package p204p;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class z0b1 extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ eh00 f278056a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eh00 f278057b;

    public z0b1(eh00 eh00Var, eh00 eh00Var2) {
        this.f278056a = eh00Var;
        this.f278057b = eh00Var2;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        eh00 eh00Var = this.f278057b;
        if (eh00Var != null) {
            eh00Var.invoke();
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        eh00 eh00Var = this.f278056a;
        if (eh00Var != null) {
            eh00Var.invoke();
        }
    }
}
