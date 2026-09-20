package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import java.util.WeakHashMap;
import p204p.bcg1;
import p204p.dh01;
import p204p.ei01;
import p204p.g3d0;
import p204p.h1u0;
import p204p.i3d0;
import p204p.ihf1;
import p204p.m3d0;
import p204p.mec1;
import p204p.n3d0;
import p204p.svg1;
import p204p.vgg1;
import p204p.vtg1;
import p204p.wtg1;
import p204p.ytg1;

/* JADX INFO: loaded from: classes.dex */
public class MaterialCardView extends CardView implements Checkable, ei01 {

    /* JADX INFO: renamed from: M0 */
    public static final int[] f2080M0 = {R.attr.state_checkable};

    /* JADX INFO: renamed from: N0 */
    public static final int[] f2081N0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: O0 */
    public static final int[] f2082O0 = {com.spotify.music.R.attr.state_dragged};

    /* JADX INFO: renamed from: L0 */
    public boolean f2083L0;

    /* JADX INFO: renamed from: h */
    public final i3d0 f2084h;

    /* JADX INFO: renamed from: i */
    public final boolean f2085i;

    /* JADX INFO: renamed from: t */
    public boolean f2086t;

    public MaterialCardView(Context context) {
        this(context, null);
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f2084h.f98144c.getBounds());
        return rectF;
    }

    /* JADX INFO: renamed from: b */
    public final void m1604b() {
        i3d0 i3d0Var;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (i3d0Var = this.f2084h).f98155n) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        i3d0Var.f98155n.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        i3d0Var.f98155n.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f2084h.f98144c.f150021a.f139595c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f2084h.f98145d.f150021a.f139595c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f2084h.f98150i;
    }

    public int getCheckedIconMargin() {
        return this.f2084h.f98146e;
    }

    public int getCheckedIconSize() {
        return this.f2084h.f98147f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f2084h.f98152k;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f2084h.f98143b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f2084h.f98143b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f2084h.f98143b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f2084h.f98143b.top;
    }

    public float getProgress() {
        return this.f2084h.f98144c.f150021a.f139601i;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f2084h.f98144c.m63597h();
    }

    public ColorStateList getRippleColor() {
        return this.f2084h.f98151j;
    }

    public dh01 getShapeAppearanceModel() {
        return this.f2084h.f98153l;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f2084h.f98154m;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f2084h.f98154m;
    }

    public int getStrokeWidth() {
        return this.f2084h.f98148g;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2086t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ytg1.m94632w(this, this.f2084h.f98144c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        i3d0 i3d0Var = this.f2084h;
        if (i3d0Var != null && i3d0Var.f98159r) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2080M0);
        }
        if (this.f2086t) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2081N0);
        }
        if (this.f2083L0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2082O0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.f2086t);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        i3d0 i3d0Var = this.f2084h;
        accessibilityNodeInfo.setCheckable(i3d0Var != null && i3d0Var.f98159r);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f2086t);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        i3d0 i3d0Var = this.f2084h;
        MaterialCardView materialCardView = i3d0Var.f98142a;
        MaterialCardView materialCardView2 = i3d0Var.f98142a;
        if (i3d0Var.f98156o != null) {
            int i5 = i3d0Var.f98146e;
            int i6 = i3d0Var.f98147f;
            int iCeil = (measuredWidth - i5) - i6;
            int iCeil2 = (measuredHeight - i5) - i6;
            if (materialCardView.getUseCompatPadding()) {
                iCeil2 -= (int) Math.ceil(((materialCardView2.getMaxCardElevation() * 1.5f) + (i3d0Var.m49610g() ? i3d0Var.m49605a() : 0.0f)) * 2.0f);
                iCeil -= (int) Math.ceil((materialCardView2.getMaxCardElevation() + (i3d0Var.m49610g() ? i3d0Var.m49605a() : 0.0f)) * 2.0f);
            }
            int i7 = iCeil2;
            int i8 = i3d0Var.f98146e;
            WeakHashMap weakHashMap = mec1.f142677a;
            if (materialCardView.getLayoutDirection() == 1) {
                i4 = iCeil;
                i3 = i8;
            } else {
                i3 = iCeil;
                i4 = i8;
            }
            i3d0Var.f98156o.setLayerInset(2, i3, i3d0Var.f98146e, i4, i7);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f2085i) {
            i3d0 i3d0Var = this.f2084h;
            if (!i3d0Var.f98158q) {
                i3d0Var.f98158q = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.f2084h.f98144c.m63601l(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        i3d0 i3d0Var = this.f2084h;
        i3d0Var.f98144c.m63600k(i3d0Var.f98142a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        n3d0 n3d0Var = this.f2084h.f98145d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        n3d0Var.m63601l(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f2084h.f98159r = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f2086t != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f2084h.m49608e(drawable);
    }

    public void setCheckedIconMargin(int i) {
        this.f2084h.f98146e = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.f2084h.f98146e = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.f2084h.m49608e(ihf1.m50639w(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.f2084h.f98147f = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.f2084h.f98147f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        i3d0 i3d0Var = this.f2084h;
        i3d0Var.f98152k = colorStateList;
        Drawable drawable = i3d0Var.f98150i;
        if (drawable != null) {
            svg1.m79459M(drawable, colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        i3d0 i3d0Var = this.f2084h;
        if (i3d0Var != null) {
            Drawable drawable = i3d0Var.f98149h;
            MaterialCardView materialCardView = i3d0Var.f98142a;
            Drawable drawableM49606c = materialCardView.isClickable() ? i3d0Var.m49606c() : i3d0Var.f98145d;
            i3d0Var.f98149h = drawableM49606c;
            if (drawable != drawableM49606c) {
                if (materialCardView.getForeground() instanceof InsetDrawable) {
                    ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableM49606c);
                } else {
                    materialCardView.setForeground(i3d0Var.m49607d(drawableM49606c));
                }
            }
        }
    }

    public void setDragged(boolean z) {
        if (this.f2083L0 != z) {
            this.f2083L0 = z;
            refreshDrawableState();
            m1604b();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f2084h.m49612i();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        i3d0 i3d0Var = this.f2084h;
        i3d0Var.m49612i();
        i3d0Var.m49611h();
    }

    public void setProgress(float f) {
        i3d0 i3d0Var = this.f2084h;
        i3d0Var.f98144c.m63602m(f);
        n3d0 n3d0Var = i3d0Var.f98145d;
        if (n3d0Var != null) {
            n3d0Var.m63602m(f);
        }
        n3d0 n3d0Var2 = i3d0Var.f98157p;
        if (n3d0Var2 != null) {
            n3d0Var2.m63602m(f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0031  */
    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        i3d0 i3d0Var = this.f2084h;
        i3d0Var.m49609f(i3d0Var.f98153l.m35961e(f));
        i3d0Var.f98149h.invalidateSelf();
        if (i3d0Var.m49610g()) {
            i3d0Var.m49611h();
        } else if (i3d0Var.f98142a.getPreventCornerOverlap()) {
            n3d0 n3d0Var = i3d0Var.f98144c;
            if (!n3d0Var.f150021a.f139593a.m35960d(n3d0Var.m63596g())) {
                i3d0Var.m49611h();
            }
        }
        if (i3d0Var.m49610g()) {
            i3d0Var.m49612i();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        i3d0 i3d0Var = this.f2084h;
        i3d0Var.f98151j = colorStateList;
        RippleDrawable rippleDrawable = i3d0Var.f98155n;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList colorStateListM50631o = ihf1.m50631o(getContext(), i);
        i3d0 i3d0Var = this.f2084h;
        i3d0Var.f98151j = colorStateListM50631o;
        RippleDrawable rippleDrawable = i3d0Var.f98155n;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListM50631o);
        }
    }

    @Override // p204p.ei01
    public void setShapeAppearanceModel(dh01 dh01Var) {
        setClipToOutline(dh01Var.m35960d(getBoundsAsRectF()));
        this.f2084h.m49609f(dh01Var);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        i3d0 i3d0Var = this.f2084h;
        if (i != i3d0Var.f98148g) {
            i3d0Var.f98148g = i;
            n3d0 n3d0Var = i3d0Var.f98145d;
            ColorStateList colorStateList = i3d0Var.f98154m;
            n3d0Var.f150021a.f139602j = i;
            n3d0Var.invalidateSelf();
            m3d0 m3d0Var = n3d0Var.f150021a;
            if (m3d0Var.f139596d != colorStateList) {
                m3d0Var.f139596d = colorStateList;
                n3d0Var.onStateChange(n3d0Var.getState());
            }
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        i3d0 i3d0Var = this.f2084h;
        i3d0Var.m49612i();
        i3d0Var.m49611h();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        i3d0 i3d0Var = this.f2084h;
        if (i3d0Var != null && i3d0Var.f98159r && isEnabled()) {
            this.f2086t = !this.f2086t;
            refreshDrawableState();
            m1604b();
            boolean z = this.f2086t;
            Drawable drawable = i3d0Var.f98150i;
            if (drawable != null) {
                drawable.setAlpha(z ? 255 : 0);
            }
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.spotify.music.R.attr.materialCardViewStyle);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        i3d0 i3d0Var = this.f2084h;
        if (i3d0Var.f98154m != colorStateList) {
            i3d0Var.f98154m = colorStateList;
            n3d0 n3d0Var = i3d0Var.f98145d;
            n3d0Var.f150021a.f139602j = i3d0Var.f98148g;
            n3d0Var.invalidateSelf();
            m3d0 m3d0Var = n3d0Var.f150021a;
            if (m3d0Var.f139596d != colorStateList) {
                m3d0Var.f139596d = colorStateList;
                n3d0Var.onStateChange(n3d0Var.getState());
            }
        }
        invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(vgg1.m85455K(context, attributeSet, i, com.spotify.music.R.style.Widget_MaterialComponents_CardView), attributeSet, i);
        this.f2086t = false;
        this.f2083L0 = false;
        this.f2085i = true;
        TypedArray typedArrayM28739t = bcg1.m28739t(getContext(), attributeSet, h1u0.f86751y, i, com.spotify.music.R.style.Widget_MaterialComponents_CardView, new int[0]);
        i3d0 i3d0Var = new i3d0(this, attributeSet, i);
        this.f2084h = i3d0Var;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        n3d0 n3d0Var = i3d0Var.f98144c;
        n3d0Var.m63601l(cardBackgroundColor);
        i3d0Var.f98143b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        i3d0Var.m49611h();
        MaterialCardView materialCardView = i3d0Var.f98142a;
        ColorStateList colorStateListM88942q = wtg1.m88942q(materialCardView.getContext(), typedArrayM28739t, 10);
        i3d0Var.f98154m = colorStateListM88942q;
        if (colorStateListM88942q == null) {
            i3d0Var.f98154m = ColorStateList.valueOf(-1);
        }
        i3d0Var.f98148g = typedArrayM28739t.getDimensionPixelSize(11, 0);
        boolean z = typedArrayM28739t.getBoolean(0, false);
        i3d0Var.f98159r = z;
        materialCardView.setLongClickable(z);
        i3d0Var.f98152k = wtg1.m88942q(materialCardView.getContext(), typedArrayM28739t, 5);
        i3d0Var.m49608e(wtg1.m88945t(materialCardView.getContext(), typedArrayM28739t, 2));
        i3d0Var.f98147f = typedArrayM28739t.getDimensionPixelSize(4, 0);
        i3d0Var.f98146e = typedArrayM28739t.getDimensionPixelSize(3, 0);
        ColorStateList colorStateListM88942q2 = wtg1.m88942q(materialCardView.getContext(), typedArrayM28739t, 6);
        i3d0Var.f98151j = colorStateListM88942q2;
        if (colorStateListM88942q2 == null) {
            i3d0Var.f98151j = ColorStateList.valueOf(vtg1.m86387n(materialCardView, com.spotify.music.R.attr.colorControlHighlight));
        }
        ColorStateList colorStateListM88942q3 = wtg1.m88942q(materialCardView.getContext(), typedArrayM28739t, 1);
        colorStateListM88942q3 = colorStateListM88942q3 == null ? ColorStateList.valueOf(0) : colorStateListM88942q3;
        n3d0 n3d0Var2 = i3d0Var.f98145d;
        n3d0Var2.m63601l(colorStateListM88942q3);
        RippleDrawable rippleDrawable = i3d0Var.f98155n;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(i3d0Var.f98151j);
        }
        n3d0Var.m63600k(materialCardView.getCardElevation());
        float f = i3d0Var.f98148g;
        ColorStateList colorStateList = i3d0Var.f98154m;
        n3d0Var2.f150021a.f139602j = f;
        n3d0Var2.invalidateSelf();
        m3d0 m3d0Var = n3d0Var2.f150021a;
        if (m3d0Var.f139596d != colorStateList) {
            m3d0Var.f139596d = colorStateList;
            n3d0Var2.onStateChange(n3d0Var2.getState());
        }
        materialCardView.setBackgroundInternal(i3d0Var.m49607d(n3d0Var));
        Drawable drawableM49606c = materialCardView.isClickable() ? i3d0Var.m49606c() : n3d0Var2;
        i3d0Var.f98149h = drawableM49606c;
        materialCardView.setForeground(i3d0Var.m49607d(drawableM49606c));
        typedArrayM28739t.recycle();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f2084h.f98144c.m63601l(colorStateList);
    }

    public void setOnCheckedChangeListener(g3d0 g3d0Var) {
    }
}
