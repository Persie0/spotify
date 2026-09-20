package p204p;

import android.animation.Animator;

/* JADX INFO: loaded from: classes.dex */
public final class bee implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cee f26338a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dee f26339b;

    public bee(dee deeVar, cee ceeVar) {
        this.f26339b = deeVar;
        this.f26338a = ceeVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        dee deeVar = this.f26339b;
        cee ceeVar = this.f26338a;
        deeVar.m35777a(1.0f, ceeVar, true);
        ceeVar.f37101k = ceeVar.f37095e;
        ceeVar.f37102l = ceeVar.f37096f;
        ceeVar.f37103m = ceeVar.f37097g;
        ceeVar.m32555a((ceeVar.f37100j + 1) % ceeVar.f37099i.length);
        if (!deeVar.f48067f) {
            deeVar.f48066e += 1.0f;
            return;
        }
        deeVar.f48067f = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (ceeVar.f37104n) {
            ceeVar.f37104n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f26339b.f48066e = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
