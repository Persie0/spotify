package p204p;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class uk61 extends LinearLayout {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f231245e = 0;

    /* JADX INFO: renamed from: a */
    public ValueAnimator f231246a;

    /* JADX INFO: renamed from: b */
    public int f231247b;

    /* JADX INFO: renamed from: c */
    public float f231248c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TabLayout f231249d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk61(TabLayout tabLayout, Context context) {
        super(context);
        this.f231249d = tabLayout;
        this.f231247b = -1;
        setWillNotDraw(false);
    }

    /* JADX INFO: renamed from: a */
    public final void m83312a() {
        View childAt = getChildAt(this.f231247b);
        TabLayout tabLayout = this.f231249d;
        iw3 iw3Var = tabLayout.f2192f1;
        Drawable drawable = tabLayout.f2167M0;
        iw3Var.getClass();
        RectF rectFM51782e = iw3.m51782e(tabLayout, childAt);
        drawable.setBounds((int) rectFM51782e.left, drawable.getBounds().top, (int) rectFM51782e.right, drawable.getBounds().bottom);
    }

    /* JADX INFO: renamed from: b */
    public final void m83313b(int i) {
        TabLayout tabLayout = this.f231249d;
        Rect bounds = tabLayout.f2167M0.getBounds();
        tabLayout.f2167M0.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    /* JADX INFO: renamed from: c */
    public final void m83314c(View view, View view2, float f) {
        TabLayout tabLayout = this.f231249d;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = tabLayout.f2167M0;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.f2167M0.getBounds().bottom);
        } else {
            tabLayout.f2192f1.mo27217m(tabLayout, view, view2, f, tabLayout.f2167M0);
        }
        WeakHashMap weakHashMap = mec1.f142677a;
        postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: d */
    public final void m83315d(int i, int i2, boolean z) {
        View childAt = getChildAt(this.f231247b);
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            m83312a();
            return;
        }
        fn8 fn8Var = new fn8(this, childAt, childAt2);
        if (!z) {
            this.f231246a.removeAllUpdateListeners();
            this.f231246a.addUpdateListener(fn8Var);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f231246a = valueAnimator;
        valueAnimator.setInterpolator(r05.f194384b);
        valueAnimator.setDuration(i2);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(fn8Var);
        valueAnimator.addListener(new f19(this, i, 2));
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.f231249d;
        int iHeight = tabLayout.f2167M0.getBounds().height();
        if (iHeight < 0) {
            iHeight = tabLayout.f2167M0.getIntrinsicHeight();
        }
        int i = tabLayout.f2179Y0;
        if (i == 0) {
            height = getHeight() - iHeight;
            iHeight = getHeight();
        } else if (i != 1) {
            height = 0;
            if (i != 2) {
                iHeight = i != 3 ? 0 : getHeight();
            }
        } else {
            height = (getHeight() - iHeight) / 2;
            iHeight = (getHeight() + iHeight) / 2;
        }
        if (tabLayout.f2167M0.getBounds().width() > 0) {
            Rect bounds = tabLayout.f2167M0.getBounds();
            tabLayout.f2167M0.setBounds(bounds.left, height, bounds.right, iHeight);
            Drawable drawable = tabLayout.f2167M0;
            int i2 = tabLayout.f2168N0;
            if (i2 != 0) {
                drawable.setTint(i2);
            } else {
                drawable.setTintList(null);
            }
            drawable.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.f231246a;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            m83312a();
        } else {
            m83315d(this.f231247b, -1, false);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.f231249d;
        boolean z = true;
        if (tabLayout.f2177W0 == 1 || tabLayout.f2180Z0 == 2) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            if (iMax <= 0) {
                return;
            }
            if (iMax * childCount <= getMeasuredWidth() - (((int) bga.m29100v(getContext(), 16)) * 2)) {
                boolean z2 = false;
                for (int i4 = 0; i4 < childCount; i4++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                    if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                        layoutParams.width = iMax;
                        layoutParams.weight = 0.0f;
                        z2 = true;
                    }
                }
                z = z2;
            } else {
                tabLayout.f2177W0 = 0;
                tabLayout.m1638m(false);
            }
            if (z) {
                super.onMeasure(i, i2);
            }
        }
    }
}
