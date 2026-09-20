package p204p;

import android.view.View;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes2.dex */
public final class yoc1 extends b05 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f274637a;

    public yoc1(View view) {
        this.f274637a = view;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f274637a.setVisibility(8);
    }
}
