package p204p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class dgs extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48889a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ egs f48890b;

    public /* synthetic */ dgs(egs egsVar, int i) {
        this.f48889a = i;
        this.f48890b = egsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f48889a) {
            case 1:
                super.onAnimationEnd(animator);
                egs egsVar = this.f48890b;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = egsVar.f59394f;
                if (arrayList != null && !egsVar.f59395g) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((fw4) it.next()).mo24427a();
                    }
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f48889a) {
            case 0:
                super.onAnimationStart(animator);
                egs egsVar = this.f48890b;
                ArrayList arrayList = egsVar.f59394f;
                if (arrayList != null && !egsVar.f59395g) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((fw4) it.next()).mo24428b();
                    }
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
