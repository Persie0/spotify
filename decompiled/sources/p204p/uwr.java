package p204p;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public final class uwr implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f234724a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wwr f234725b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bmj f234726c;

    public /* synthetic */ uwr(wwr wwrVar, bmj bmjVar, int i) {
        this.f234724a = i;
        this.f234725b = wwrVar;
        this.f234726c = bmjVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f234724a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wwr wwrVar = this.f234725b;
                wwrVar.f255825f = fFloatValue;
                RecyclerView recyclerView = wwrVar.f255822c;
                if (recyclerView != null) {
                    int childCount = recyclerView.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        wwrVar.m89214e(recyclerView.getChildAt(i), fFloatValue, this.f234726c);
                    }
                }
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wwr wwrVar2 = this.f234725b;
                wwrVar2.f255825f = fFloatValue2;
                RecyclerView recyclerView2 = wwrVar2.f255822c;
                if (recyclerView2 != null) {
                    int childCount2 = recyclerView2.getChildCount();
                    for (int i2 = 0; i2 < childCount2; i2++) {
                        wwrVar2.m89214e(recyclerView2.getChildAt(i2), fFloatValue2, this.f234726c);
                    }
                }
                break;
        }
    }
}
