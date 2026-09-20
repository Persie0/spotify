package p204p;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class x45 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ n3d0 f257987a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AppBarLayout f257988b;

    public x45(AppBarLayout appBarLayout, n3d0 n3d0Var) {
        this.f257988b = appBarLayout;
        this.f257987a = n3d0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f257987a.m63600k(fFloatValue);
        AppBarLayout appBarLayout = this.f257988b;
        Drawable drawable = appBarLayout.f1931S0;
        if (drawable instanceof n3d0) {
            ((n3d0) drawable).m63600k(fFloatValue);
        }
        Iterator it = appBarLayout.f1929Q0.iterator();
        if (it.hasNext()) {
            ikc0.m50942n(it.next());
            throw null;
        }
    }
}
