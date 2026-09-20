package p204p;

import android.view.animation.Animation;

/* JADX INFO: loaded from: classes8.dex */
public final class qu10 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f192542a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eh00 f192543b;

    public /* synthetic */ qu10(int i, eh00 eh00Var) {
        this.f192542a = i;
        this.f192543b = eh00Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.f192542a) {
            case 0:
                this.f192543b.invoke();
                break;
            default:
                this.f192543b.invoke();
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i = this.f192542a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i = this.f192542a;
    }

    /* JADX INFO: renamed from: a */
    private final void m73857a(Animation animation) {
    }

    /* JADX INFO: renamed from: b */
    private final void m73858b(Animation animation) {
    }

    /* JADX INFO: renamed from: c */
    private final void m73859c(Animation animation) {
    }

    /* JADX INFO: renamed from: d */
    private final void m73860d(Animation animation) {
    }
}
