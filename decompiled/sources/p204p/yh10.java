package p204p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.music.R;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class yh10 extends ViewGroup implements s4t0, fh10, InterfaceC2333rc {

    /* JADX INFO: renamed from: a */
    public ai10 f272711a;

    /* JADX INFO: renamed from: b */
    public vh10 f272712b;

    /* JADX INFO: renamed from: c */
    public final Rect f272713c;

    public yh10(Context context, int i, al20 al20Var) {
        super(context, null, i);
        this.f272713c = new Rect();
        int iM92170i = xuf1.m92170i(getContext());
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, v2u0.f236728a, i, 0);
        try {
            float fraction = typedArrayObtainStyledAttributes.getFraction(3, 1, 1, -1.0f);
            int integer = typedArrayObtainStyledAttributes.getInteger(4, 3);
            al20 al20Var2 = integer != 1 ? integer != 2 ? al20.IMAGE_AND_COLOR : al20.IMAGE_ONLY : al20.COLOR_ONLY;
            typedArrayObtainStyledAttributes.recycle();
            this.f272712b = new vh10(new cdv(this, 13), fraction, iM92170i, getResources().getDisplayMetrics().heightPixels);
            bl20 bl20Var = new bl20(context, (al20) vie1.m85630l(al20Var, al20Var2));
            addView(bl20Var.getView(), 0);
            this.f272711a = new ai10(this, bl20Var);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m93615b(int i, ji10 ji10Var) {
        if (ji10Var != null) {
            xh10 xh10Var = (xh10) ji10Var.getView().getLayoutParams();
            if (xh10Var != null ? xh10Var.f261415a : false) {
                return;
            }
            View view = ji10Var.getView();
            view.offsetTopAndBottom(i - view.getTop());
        }
    }

    /* JADX INFO: renamed from: c */
    public static cl8 m93616c() {
        cl8 cl8Var = new cl8(11, false);
        cl8Var.f39206b = R.attr.glueHeaderStyle;
        cl8Var.f39207c = al20.IMAGE_AND_COLOR;
        return cl8Var;
    }

    @Override // p204p.hny0
    /* JADX INFO: renamed from: a */
    public final void mo32831a(float f, int i) {
        vh10 vh10Var = this.f272712b;
        int i2 = vh10Var.f241382d + vh10Var.f241380b + i + vh10Var.f241386h;
        yh10 yh10Var = (yh10) vh10Var.f241385g.f36952b;
        m93615b(i2, yh10Var.f272711a.f15849b);
        m93615b(vh10Var.f241382d + i, yh10Var.f272711a.f15850c);
        ai10 ai10Var = this.f272711a;
        ai10.m26048a(f, ai10Var.f15850c);
        ai10.m26048a(f, ai10Var.f15849b);
        zh10 zh10Var = ai10Var.f15849b;
        if (zh10Var instanceof em20) {
            ((em20) zh10Var).mo30875a(f, i);
        }
        bl20 bl20Var = (bl20) ai10Var.f15851d;
        njx njxVar = bl20Var.f28069d;
        if (njxVar != null) {
            njxVar.f154665c = i;
            int iM64649d = njxVar.m64649d(i);
            ImageView imageView = (ImageView) njxVar.f154668f;
            imageView.offsetTopAndBottom(iM64649d - imageView.getTop());
            WeakHashMap weakHashMap = mec1.f142677a;
            imageView.postInvalidateOnAnimation();
            bl20Var.f28070e.mo31432a(f);
        }
        bl20Var.f28066a.f125194c.setAlpha(255);
        bl20Var.invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new xh10(-1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        xh10 xh10Var = new xh10(context, attributeSet);
        xh10Var.f261416b = 2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v2u0.f236729b);
        try {
            xh10Var.f261415a = typedArrayObtainStyledAttributes.getBoolean(1, true);
            xh10Var.f261416b = typedArrayObtainStyledAttributes.getInt(0, 2);
            return xh10Var;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // p204p.s4t0
    public ImageView getBackgroundImageView() {
        return ((bl20) this.f272711a.f15851d).getBackgroundImageView();
    }

    public zh10 getContentViewBinder() {
        return this.f272711a.f15849b;
    }

    public GlueToolbar getGlueToolbar() {
        return this.f272711a.f15850c;
    }

    @Override // p204p.fh10
    public int getTotalScrollRange() {
        vh10 vh10Var = this.f272712b;
        return vh10Var.f241379a - ((vh10Var.f241380b + vh10Var.f241381c) + vh10Var.f241382d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        Rect rect = this.f272713c;
        ((bl20) this.f272711a.f15851d).getView().layout(rect.left, rect.top, getMeasuredWidth() - (rect.left + rect.right), getMeasuredHeight() - (rect.top + rect.bottom));
        int measuredHeight2 = this.f272712b.f241382d;
        GlueToolbar glueToolbar = this.f272711a.f15850c;
        if (glueToolbar != null) {
            View view = glueToolbar.getView();
            view.layout(0, measuredHeight2, view.getMeasuredWidth(), view.getMeasuredHeight() + measuredHeight2);
            this.f272712b.getClass();
            measuredHeight2 += view.getMeasuredHeight();
        }
        zh10 zh10Var = this.f272711a.f15849b;
        if (zh10Var != null) {
            View view2 = zh10Var.getView();
            int measuredHeight3 = (getMeasuredHeight() - measuredHeight2) - this.f272712b.f241381c;
            int i5 = ((xh10) view2.getLayoutParams()).f261416b;
            if (i5 == 0) {
                measuredHeight = measuredHeight2;
            } else if (i5 == 1) {
                measuredHeight = (measuredHeight3 + measuredHeight2) - view2.getMeasuredHeight();
            } else {
                if (i5 != 2) {
                    throw new IllegalArgumentException(String.format(Locale.getDefault(), "Invalid gravity value: %d", Integer.valueOf(i5)));
                }
                measuredHeight = ((measuredHeight3 - view2.getMeasuredHeight()) / 2) + measuredHeight2;
            }
            this.f272712b.f241386h = measuredHeight - measuredHeight2;
            view2.layout(0, measuredHeight, view2.getMeasuredWidth(), view2.getMeasuredHeight() + measuredHeight);
        }
        zh10 zh10Var2 = this.f272711a.f15849b;
        if (zh10Var2 instanceof gh10) {
            ((gh10) zh10Var2).m44709b();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        vh10 vh10Var = this.f272712b;
        int iMax = vh10Var.f241381c + vh10Var.f241382d;
        GlueToolbar glueToolbar = this.f272711a.f15850c;
        if (glueToolbar != null) {
            View view = glueToolbar.getView();
            xh10 xh10Var = (xh10) view.getLayoutParams();
            xh10Var.getClass();
            int i4 = ((ViewGroup.MarginLayoutParams) xh10Var).height;
            c95.m31843i((i4 == -2 || i4 == -1) ? false : true);
            view.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(((ViewGroup.MarginLayoutParams) xh10Var).height, 1073741824));
            int measuredHeight = view.getMeasuredHeight();
            this.f272712b.getClass();
            iMax += measuredHeight;
            this.f272712b.f241380b = measuredHeight;
        } else {
            vh10Var.f241380b = 0;
        }
        zh10 zh10Var = this.f272711a.f15849b;
        if (zh10Var != null) {
            vh10 vh10Var2 = this.f272712b;
            float f = vh10Var2.f241383e;
            int i5 = f != -1.0f ? ((int) (vh10Var2.f241384f * f)) - (vh10Var2.f241382d + vh10Var2.f241380b) : 0;
            View view2 = zh10Var.getView();
            xh10 xh10Var2 = (xh10) view2.getLayoutParams();
            if (xh10Var2 == null || (i3 = ((ViewGroup.MarginLayoutParams) xh10Var2).height) == -1) {
                view2.setMinimumHeight(i5);
                view2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            } else if (i3 == -2) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            } else {
                view2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(((ViewGroup.MarginLayoutParams) xh10Var2).height, 1073741824));
            }
            iMax += Math.max(view2.getMeasuredHeight(), i5);
        }
        Rect rect = this.f272713c;
        ((bl20) this.f272711a.f15851d).getView().measure(View.MeasureSpec.makeMeasureSpec((size - rect.left) - rect.right, 1073741824), View.MeasureSpec.makeMeasureSpec((iMax - rect.top) - rect.bottom, 1073741824));
        setMeasuredDimension(size, iMax);
        this.f272712b.f241379a = iMax;
    }

    public void setAccessoryMargin(int i) {
        this.f272712b.f241381c = i;
    }

    public void setAvoidCroppingImageWithParallax(boolean z) {
        ((bl20) this.f272711a.f15851d).setAvoidCroppingImageWithParallax(z);
    }

    public void setChildHelper(ai10 ai10Var) {
        this.f272711a = ai10Var;
    }

    public void setColor(int i) {
        ((bl20) this.f272711a.f15851d).setSolidColor(i);
    }

    public void setContentViewBinder(zh10 zh10Var) {
        ai10 ai10Var = this.f272711a;
        ai10Var.getClass();
        xh10 xh10Var = new xh10(-1);
        yh10 yh10Var = ai10Var.f15848a;
        zh10 zh10Var2 = ai10Var.f15849b;
        if (zh10Var2 != null) {
            yh10Var.removeView(zh10Var2.getView());
        }
        ai10Var.f15849b = zh10Var;
        if (zh10Var != null) {
            yh10Var.addView(zh10Var.getView(), 1, xh10Var);
        }
    }

    @Override // p204p.InterfaceC2333rc
    public void setCoordinatorAccessoryOffset(int i) {
        setAccessoryMargin(i);
    }

    public void setGlueToolbar(GlueToolbar glueToolbar) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.actionBarSize});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        ai10 ai10Var = this.f272711a;
        ai10Var.getClass();
        xh10 xh10Var = new xh10(dimensionPixelSize);
        if (glueToolbar != null) {
            xh10Var.f261417c = new dj0(glueToolbar);
        }
        yh10 yh10Var = ai10Var.f15848a;
        GlueToolbar glueToolbar2 = ai10Var.f15850c;
        if (glueToolbar2 != null) {
            yh10Var.removeView(glueToolbar2.getView());
        }
        ai10Var.f15850c = glueToolbar;
        if (glueToolbar != null) {
            yh10Var.addView(glueToolbar.getView(), ai10Var.f15849b != null ? 2 : 1, xh10Var);
        }
    }

    public void setHasFixedSize(boolean z) {
        ((bl20) this.f272711a.f15851d).setHasFixedSize(z);
    }

    public void setHeaderInnerState(vh10 vh10Var) {
        this.f272712b = vh10Var;
    }

    @Override // p204p.fh10
    public View getView() {
        return this;
    }
}
