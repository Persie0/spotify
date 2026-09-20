package p204p;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class fn8 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71218a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f71219b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f71220c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ View f71221d;

    public fn8(List list, ArrayList arrayList, gn8 gn8Var) {
        this.f71219b = list;
        this.f71220c = arrayList;
        this.f71221d = gn8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f71218a) {
            case 0:
                float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
                ArrayList arrayList = new ArrayList();
                List list = (List) this.f71219b;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    PointF pointF = (PointF) list.get(i);
                    PointF pointF2 = (PointF) ((ArrayList) this.f71220c).get(i);
                    if (wj50.m88271j(pointF, pointF2)) {
                        arrayList.add(pointF);
                    } else {
                        float f = pointF.x;
                        float f2 = pointF2.y;
                        arrayList.add(new PointF(f, f2 - ((f2 - pointF.y) * animatedFraction)));
                    }
                }
                ((gn8) this.f71221d).m45293b(arrayList);
                break;
            default:
                ((uk61) this.f71221d).m83314c((View) this.f71219b, (View) this.f71220c, valueAnimator.getAnimatedFraction());
                break;
        }
    }

    public fn8(uk61 uk61Var, View view, View view2) {
        this.f71221d = uk61Var;
        this.f71219b = view;
        this.f71220c = view2;
    }
}
