package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p204p.bcg1;
import p204p.bga;
import p204p.cyf1;
import p204p.dh01;
import p204p.ei01;
import p204p.h1u0;
import p204p.ihf1;
import p204p.mec1;
import p204p.s780;
import p204p.svg1;
import p204p.u55;
import p204p.vgg1;
import p204p.w2d0;
import p204p.wtg1;
import p204p.x2d0;
import p204p.y2d0;
import p204p.ytg1;
import p204p.z2d0;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends u55 implements Checkable, ei01 {

    /* JADX INFO: renamed from: R0 */
    public static final int[] f2054R0 = {R.attr.state_checkable};

    /* JADX INFO: renamed from: S0 */
    public static final int[] f2055S0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: L0 */
    public int f2056L0;

    /* JADX INFO: renamed from: M0 */
    public int f2057M0;

    /* JADX INFO: renamed from: N0 */
    public int f2058N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f2059O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f2060P0;

    /* JADX INFO: renamed from: Q0 */
    public int f2061Q0;

    /* JADX INFO: renamed from: d */
    public final y2d0 f2062d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f2063e;

    /* JADX INFO: renamed from: f */
    public w2d0 f2064f;

    /* JADX INFO: renamed from: g */
    public PorterDuff.Mode f2065g;

    /* JADX INFO: renamed from: h */
    public ColorStateList f2066h;

    /* JADX INFO: renamed from: i */
    public Drawable f2067i;

    /* JADX INFO: renamed from: t */
    public int f2068t;

    public MaterialButton(Context context) {
        this(context, null);
    }

    private String getA11yClassName() {
        y2d0 y2d0Var = this.f2062d;
        return ((y2d0Var == null || !y2d0Var.f268560q) ? Button.class : CompoundButton.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        return Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth());
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1595a() {
        y2d0 y2d0Var = this.f2062d;
        return (y2d0Var == null || y2d0Var.f268558o) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final void m1596b() {
        int i = this.f2061Q0;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.f2067i, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.f2067i, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.f2067i, null, null);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1597e(boolean z) {
        Drawable drawable = this.f2067i;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f2067i = drawableMutate;
            svg1.m79459M(drawableMutate, this.f2066h);
            PorterDuff.Mode mode = this.f2065g;
            if (mode != null) {
                svg1.m79460N(this.f2067i, mode);
            }
            int intrinsicWidth = this.f2068t;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f2067i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f2068t;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f2067i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f2067i;
            int i = this.f2056L0;
            int i2 = this.f2057M0;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f2067i.setVisible(true, z);
        }
        if (z) {
            m1596b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.f2061Q0;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.f2067i) || (((i3 == 3 || i3 == 4) && drawable5 != this.f2067i) || ((i3 == 16 || i3 == 32) && drawable4 != this.f2067i))) {
            m1596b();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1598f(int i, int i2) {
        if (this.f2067i == null || getLayout() == null) {
            return;
        }
        int i3 = this.f2061Q0;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.f2056L0 = 0;
                if (i3 == 16) {
                    this.f2057M0 = 0;
                    m1597e(false);
                    return;
                }
                int intrinsicHeight = this.f2068t;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f2067i.getIntrinsicHeight();
                }
                int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f2058N0) - getPaddingBottom()) / 2;
                if (this.f2057M0 != textHeight) {
                    this.f2057M0 = textHeight;
                    m1597e(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f2057M0 = 0;
        if (i3 == 1 || i3 == 3) {
            this.f2056L0 = 0;
            m1597e(false);
            return;
        }
        int intrinsicWidth = this.f2068t;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f2067i.getIntrinsicWidth();
        }
        int textWidth = i - getTextWidth();
        WeakHashMap weakHashMap = mec1.f142677a;
        int paddingEnd = ((((textWidth - getPaddingEnd()) - intrinsicWidth) - this.f2058N0) - getPaddingStart()) / 2;
        if ((getLayoutDirection() == 1) != (this.f2061Q0 == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f2056L0 != paddingEnd) {
            this.f2056L0 = paddingEnd;
            m1597e(false);
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m1595a()) {
            return this.f2062d.f268550g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: getIcon */
    public Drawable getF3797X0() {
        return this.f2067i;
    }

    public int getIconGravity() {
        return this.f2061Q0;
    }

    public int getIconPadding() {
        return this.f2058N0;
    }

    public int getIconSize() {
        return this.f2068t;
    }

    public ColorStateList getIconTint() {
        return this.f2066h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f2065g;
    }

    public int getInsetBottom() {
        return this.f2062d.f268549f;
    }

    public int getInsetTop() {
        return this.f2062d.f268548e;
    }

    public ColorStateList getRippleColor() {
        if (m1595a()) {
            return this.f2062d.f268555l;
        }
        return null;
    }

    public dh01 getShapeAppearanceModel() {
        if (m1595a()) {
            return this.f2062d.f268545b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m1595a()) {
            return this.f2062d.f268554k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m1595a()) {
            return this.f2062d.f268551h;
        }
        return 0;
    }

    @Override // p204p.u55
    public ColorStateList getSupportBackgroundTintList() {
        return m1595a() ? this.f2062d.f268553j : super.getSupportBackgroundTintList();
    }

    @Override // p204p.u55
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m1595a() ? this.f2062d.f268552i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2059O0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m1595a()) {
            ytg1.m94632w(this, this.f2062d.m92698b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        y2d0 y2d0Var = this.f2062d;
        if (y2d0Var != null && y2d0Var.f268560q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2054R0);
        }
        if (this.f2059O0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2055S0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p204p.u55, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f2059O0);
    }

    @Override // p204p.u55, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        y2d0 y2d0Var = this.f2062d;
        accessibilityNodeInfo.setCheckable(y2d0Var != null && y2d0Var.f268560q);
        accessibilityNodeInfo.setChecked(this.f2059O0);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof x2d0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x2d0 x2d0Var = (x2d0) parcelable;
        super.onRestoreInstanceState(x2d0Var.m66261c());
        setChecked(x2d0Var.f257420c);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        x2d0 x2d0Var = new x2d0(super.onSaveInstanceState());
        x2d0Var.f257420c = this.f2059O0;
        return x2d0Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m1598f(i, i2);
    }

    @Override // p204p.u55, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m1598f(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f2067i != null) {
            if (this.f2067i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!m1595a()) {
            super.setBackgroundColor(i);
            return;
        }
        y2d0 y2d0Var = this.f2062d;
        if (y2d0Var.m92698b(false) != null) {
            y2d0Var.m92698b(false).setTint(i);
        }
    }

    @Override // p204p.u55, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m1595a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        y2d0 y2d0Var = this.f2062d;
        y2d0Var.f268558o = true;
        MaterialButton materialButton = y2d0Var.f268544a;
        materialButton.setSupportBackgroundTintList(y2d0Var.f268553j);
        materialButton.setSupportBackgroundTintMode(y2d0Var.f268552i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // p204p.u55, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? ihf1.m50639w(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m1595a()) {
            this.f2062d.f268560q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        y2d0 y2d0Var = this.f2062d;
        if (y2d0Var == null || !y2d0Var.f268560q || !isEnabled() || this.f2059O0 == z) {
            return;
        }
        this.f2059O0 = z;
        refreshDrawableState();
        if (this.f2060P0) {
            return;
        }
        this.f2060P0 = true;
        Iterator it = this.f2063e.iterator();
        while (it.hasNext()) {
            ((z2d0) it.next()).m95187a(this, this.f2059O0);
        }
        this.f2060P0 = false;
    }

    public void setCornerRadius(int i) {
        if (m1595a()) {
            y2d0 y2d0Var = this.f2062d;
            if (y2d0Var.f268559p && y2d0Var.f268550g == i) {
                return;
            }
            y2d0Var.f268550g = i;
            y2d0Var.f268559p = true;
            y2d0Var.m92699c(y2d0Var.f268545b.m35961e(i));
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m1595a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m1595a()) {
            this.f2062d.m92698b(false).m63600k(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f2067i != drawable) {
            this.f2067i = drawable;
            m1597e(true);
            m1598f(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f2061Q0 != i) {
            this.f2061Q0 = i;
            m1598f(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f2058N0 != i) {
            this.f2058N0 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? ihf1.m50639w(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f2068t != i) {
            this.f2068t = i;
            m1597e(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f2066h != colorStateList) {
            this.f2066h = colorStateList;
            m1597e(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f2065g != mode) {
            this.f2065g = mode;
            m1597e(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(ihf1.m50631o(getContext(), i));
    }

    public void setInsetBottom(int i) {
        y2d0 y2d0Var = this.f2062d;
        y2d0Var.m92700d(y2d0Var.f268548e, i);
    }

    public void setInsetTop(int i) {
        y2d0 y2d0Var = this.f2062d;
        y2d0Var.m92700d(i, y2d0Var.f268549f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(w2d0 w2d0Var) {
        this.f2064f = w2d0Var;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        w2d0 w2d0Var = this.f2064f;
        if (w2d0Var != null) {
            ((s780) w2d0Var).m77371m();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m1595a()) {
            y2d0 y2d0Var = this.f2062d;
            MaterialButton materialButton = y2d0Var.f268544a;
            if (y2d0Var.f268555l != colorStateList) {
                y2d0Var.f268555l = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(cyf1.m34379o(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (m1595a()) {
            setRippleColor(ihf1.m50631o(getContext(), i));
        }
    }

    @Override // p204p.ei01
    public void setShapeAppearanceModel(dh01 dh01Var) {
        if (!m1595a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f2062d.m92699c(dh01Var);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m1595a()) {
            y2d0 y2d0Var = this.f2062d;
            y2d0Var.f268557n = z;
            y2d0Var.m92702f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m1595a()) {
            y2d0 y2d0Var = this.f2062d;
            if (y2d0Var.f268554k != colorStateList) {
                y2d0Var.f268554k = colorStateList;
                y2d0Var.m92702f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (m1595a()) {
            setStrokeColor(ihf1.m50631o(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m1595a()) {
            y2d0 y2d0Var = this.f2062d;
            if (y2d0Var.f268551h != i) {
                y2d0Var.f268551h = i;
                y2d0Var.m92702f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m1595a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // p204p.u55
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m1595a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        y2d0 y2d0Var = this.f2062d;
        if (y2d0Var.f268553j != colorStateList) {
            y2d0Var.f268553j = colorStateList;
            if (y2d0Var.m92698b(false) != null) {
                svg1.m79459M(y2d0Var.m92698b(false), y2d0Var.f268553j);
            }
        }
    }

    @Override // p204p.u55
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m1595a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        y2d0 y2d0Var = this.f2062d;
        if (y2d0Var.f268552i != mode) {
            y2d0Var.f268552i = mode;
            if (y2d0Var.m92698b(false) == null || y2d0Var.f268552i == null) {
                return;
            }
            svg1.m79460N(y2d0Var.m92698b(false), y2d0Var.f268552i);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f2059O0);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.spotify.music.R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(vgg1.m85455K(context, attributeSet, i, com.spotify.music.R.style.Widget_MaterialComponents_Button), attributeSet, i);
        this.f2063e = new LinkedHashSet();
        this.f2059O0 = false;
        this.f2060P0 = false;
        Context context2 = getContext();
        TypedArray typedArrayM28739t = bcg1.m28739t(context2, attributeSet, h1u0.f86747u, i, com.spotify.music.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f2058N0 = typedArrayM28739t.getDimensionPixelSize(12, 0);
        int i2 = typedArrayM28739t.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f2065g = bga.m29072O(i2, mode);
        this.f2066h = wtg1.m88942q(getContext(), typedArrayM28739t, 14);
        this.f2067i = wtg1.m88945t(getContext(), typedArrayM28739t, 10);
        this.f2061Q0 = typedArrayM28739t.getInteger(11, 1);
        this.f2068t = typedArrayM28739t.getDimensionPixelSize(13, 0);
        y2d0 y2d0Var = new y2d0(this, dh01.m35958b(context2, attributeSet, i, com.spotify.music.R.style.Widget_MaterialComponents_Button).m74257d());
        this.f2062d = y2d0Var;
        y2d0Var.f268546c = typedArrayM28739t.getDimensionPixelOffset(1, 0);
        y2d0Var.f268547d = typedArrayM28739t.getDimensionPixelOffset(2, 0);
        y2d0Var.f268548e = typedArrayM28739t.getDimensionPixelOffset(3, 0);
        y2d0Var.f268549f = typedArrayM28739t.getDimensionPixelOffset(4, 0);
        if (typedArrayM28739t.hasValue(8)) {
            int dimensionPixelSize = typedArrayM28739t.getDimensionPixelSize(8, -1);
            y2d0Var.f268550g = dimensionPixelSize;
            y2d0Var.m92699c(y2d0Var.f268545b.m35961e(dimensionPixelSize));
            y2d0Var.f268559p = true;
        }
        y2d0Var.f268551h = typedArrayM28739t.getDimensionPixelSize(20, 0);
        y2d0Var.f268552i = bga.m29072O(typedArrayM28739t.getInt(7, -1), mode);
        y2d0Var.f268553j = wtg1.m88942q(getContext(), typedArrayM28739t, 6);
        y2d0Var.f268554k = wtg1.m88942q(getContext(), typedArrayM28739t, 19);
        y2d0Var.f268555l = wtg1.m88942q(getContext(), typedArrayM28739t, 16);
        y2d0Var.f268560q = typedArrayM28739t.getBoolean(5, false);
        y2d0Var.f268562s = typedArrayM28739t.getDimensionPixelSize(9, 0);
        WeakHashMap weakHashMap = mec1.f142677a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayM28739t.hasValue(0)) {
            y2d0Var.f268558o = true;
            setSupportBackgroundTintList(y2d0Var.f268553j);
            setSupportBackgroundTintMode(y2d0Var.f268552i);
        } else {
            y2d0Var.m92701e();
        }
        setPaddingRelative(paddingStart + y2d0Var.f268546c, paddingTop + y2d0Var.f268548e, paddingEnd + y2d0Var.f268547d, paddingBottom + y2d0Var.f268549f);
        typedArrayM28739t.recycle();
        setCompoundDrawablePadding(this.f2058N0);
        m1597e(this.f2067i != null);
    }
}
