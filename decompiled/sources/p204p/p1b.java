package p204p;

import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.creativeworkplatform.headerelement.CreativeWorkHeaderStickyBehavior;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import com.spotify.encoreconsumermobile.layout.headers.ComposePlayButtonBehavior;
import com.spotify.encoreconsumermobile.layout.headers.PlayButtonBehavior;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class p1b implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f173019a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f173020b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f173021c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f173022d;

    public /* synthetic */ p1b(Object obj, Object obj2, Object obj3, int i) {
        this.f173019a = i;
        this.f173020b = obj;
        this.f173021c = obj2;
        this.f173022d = obj3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        hwd1 dwd1Var;
        switch (this.f173019a) {
            case 0:
                rlv0 rlv0Var = (rlv0) this.f173022d;
                int i9 = i3 - i;
                plv0 plv0Var = (plv0) this.f173020b;
                if (i9 == plv0Var.f178796a) {
                    return;
                }
                plv0Var.f178796a = i9;
                Rect rectM71917a = q1b.m71917a((q1b) this.f173021c, i9, view.getResources());
                int i10 = rectM71917a.left;
                dx40 dx40Var = (dx40) rlv0Var.f200373a;
                rlv0Var.f200373a = dx40.m37190c(new Rect(i10, dx40Var.f53849b, rectM71917a.right, dx40Var.f53851d));
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup == null) {
                    return;
                }
                int i11 = 0;
                while (true) {
                    if (!(i11 < viewGroup.getChildCount())) {
                        return;
                    }
                    int i12 = i11 + 1;
                    View childAt = viewGroup.getChildAt(i11);
                    if (childAt == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    int i13 = Build.VERSION.SDK_INT;
                    if (i13 >= 34) {
                        dwd1Var = new gwd1();
                    } else if (i13 >= 31) {
                        dwd1Var = new fwd1();
                    } else if (i13 >= 30) {
                        dwd1Var = new ewd1();
                    } else {
                        dwd1Var = i13 >= 29 ? new dwd1() : new bwd1();
                    }
                    dwd1Var.mo40142c(519, (dx40) rlv0Var.f200373a);
                    mec1.m61552d(childAt, dwd1Var.mo30680b());
                    i11 = i12;
                }
                break;
            case 1:
                view.removeOnLayoutChangeListener(this);
                ComposePlayButtonBehavior.m9668t((ComposeView) this.f173020b, (View) this.f173021c, (Toolbar) this.f173022d);
                return;
            case 2:
                view.removeOnLayoutChangeListener(this);
                ((CreativeWorkHeaderStickyBehavior) this.f173020b).m9053t((View) this.f173021c, (Toolbar) this.f173022d);
                return;
            case 3:
                view.removeOnLayoutChangeListener(this);
                j5p j5pVar = (j5p) this.f173020b;
                j5pVar.m52470r((c7i) this.f173021c);
                j5pVar.m52471t(((dl20) this.f173022d).f50097b);
                return;
            case 4:
                view.removeOnLayoutChangeListener(this);
                int height = ((View) this.f173020b).getHeight();
                View view2 = (View) this.f173021c;
                float y = view2.getY();
                u12 u12Var = (u12) this.f173022d;
                float f = height;
                double d = 255;
                double height2 = (((double) ((y - ((Toolbar) u12Var.f225645X).getHeight()) / f)) + 0.1d) * d;
                double y2 = (((double) (view2.getY() / f)) + 0.1d) * d;
                int iArgb = Color.argb((int) height2, 46, 46, 46);
                int iArgb2 = Color.argb((int) y2, 30, 30, 30);
                Drawable background = ((Toolbar) u12Var.f225645X).getBackground();
                if ((background instanceof GradientDrawable ? (GradientDrawable) background : null) == null) {
                    ((Toolbar) u12Var.f225645X).setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{iArgb2, iArgb}));
                    return;
                } else {
                    ((GradientDrawable) ((Toolbar) u12Var.f225645X).getBackground()).setColors(new int[]{iArgb2, iArgb});
                    return;
                }
            case 5:
                view.removeOnLayoutChangeListener(this);
                int height3 = ((ConstraintLayout) this.f173020b).getHeight();
                Barrier barrier = (Barrier) this.f173021c;
                float y3 = barrier.getY();
                Toolbar toolbar = (Toolbar) ((s2o) this.f173022d).f205038e;
                float f2 = height3;
                double d2 = 255;
                double height4 = (((double) ((y3 - toolbar.getHeight()) / f2)) + 0.1d) * d2;
                double y4 = (((double) (barrier.getY() / f2)) + 0.1d) * d2;
                int iArgb3 = Color.argb((int) height4, 46, 46, 46);
                int iArgb4 = Color.argb((int) y4, 30, 30, 30);
                Drawable background2 = toolbar.getBackground();
                if ((background2 instanceof GradientDrawable ? (GradientDrawable) background2 : null) == null) {
                    toolbar.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{iArgb4, iArgb3}));
                    return;
                } else {
                    ((GradientDrawable) toolbar.getBackground()).setColors(new int[]{iArgb4, iArgb3});
                    return;
                }
            case 6:
                view.removeOnLayoutChangeListener(this);
                int i14 = 0;
                for (Object obj : oh3.m66923j(view.getWidth(), view.getHeight(), ((lnd0) this.f173020b).f135147a, (go70) this.f173021c)) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        h6f.m46722S();
                        throw null;
                    }
                    vfd0 vfd0Var = (vfd0) obj;
                    View view3 = (View) ((ArrayList) this.f173022d).get(i14);
                    float f3 = vfd0Var.f240954a;
                    float f4 = vfd0Var.f240955b;
                    view3.setRotation(f3);
                    view3.setScaleX(f4);
                    view3.setScaleY(f4);
                    i14 = i15;
                }
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                PlayButtonBehavior.m9669t((PlayButtonView) this.f173020b, (View) this.f173021c, (Toolbar) this.f173022d);
                return;
        }
    }

    public /* synthetic */ p1b(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f173019a = i;
        this.f173020b = obj2;
        this.f173021c = obj3;
        this.f173022d = obj4;
    }
}
