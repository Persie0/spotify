package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.car.app.model.Alert;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;
import p204p.bcg1;
import p204p.bga;
import p204p.c961;
import p204p.cec1;
import p204p.cyf1;
import p204p.dh01;
import p204p.ei01;
import p204p.h1u0;
import p204p.ihf1;
import p204p.ihk0;
import p204p.l571;
import p204p.lzj;
import p204p.mec1;
import p204p.n4e;
import p204p.o4e;
import p204p.o571;
import p204p.q4e;
import p204p.r171;
import p204p.svg1;
import p204p.u5e;
import p204p.v5e;
import p204p.vgg1;
import p204p.wtg1;
import p204p.yb9;
import p204p.ytg1;
import p204p.z1i0;

/* JADX INFO: loaded from: classes4.dex */
public class Chip extends AppCompatCheckBox implements u5e, ei01 {

    /* JADX INFO: renamed from: W0 */
    public static final Rect f2087W0 = new Rect();

    /* JADX INFO: renamed from: X0 */
    public static final int[] f2088X0 = {R.attr.state_selected};

    /* JADX INFO: renamed from: Y0 */
    public static final int[] f2089Y0 = {R.attr.state_checkable};

    /* JADX INFO: renamed from: L0 */
    public boolean f2090L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f2091M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f2092N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f2093O0;

    /* JADX INFO: renamed from: P0 */
    public int f2094P0;

    /* JADX INFO: renamed from: Q0 */
    public int f2095Q0;

    /* JADX INFO: renamed from: R0 */
    public final q4e f2096R0;

    /* JADX INFO: renamed from: S0 */
    public boolean f2097S0;

    /* JADX INFO: renamed from: T0 */
    public final Rect f2098T0;

    /* JADX INFO: renamed from: U0 */
    public final RectF f2099U0;

    /* JADX INFO: renamed from: V0 */
    public final n4e f2100V0;

    /* JADX INFO: renamed from: e */
    public v5e f2101e;

    /* JADX INFO: renamed from: f */
    public InsetDrawable f2102f;

    /* JADX INFO: renamed from: g */
    public RippleDrawable f2103g;

    /* JADX INFO: renamed from: h */
    public View.OnClickListener f2104h;

    /* JADX INFO: renamed from: i */
    public CompoundButton.OnCheckedChangeListener f2105i;

    /* JADX INFO: renamed from: t */
    public boolean f2106t;

    public Chip(Context context) {
        this(context, null);
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f2099U0;
        rectF.setEmpty();
        if (m1608d() && this.f2104h != null) {
            v5e v5eVar = this.f2101e;
            Rect bounds = v5eVar.getBounds();
            rectF.setEmpty();
            if (v5eVar.m84710Y()) {
                float f = v5eVar.f237399B1 + v5eVar.f237398A1 + v5eVar.f237444m1 + v5eVar.f237457z1 + v5eVar.f237456y1;
                if (v5eVar.getLayoutDirection() == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f2098T0;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private r171 getTextAppearance() {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            return v5eVar.f237406I1.f161908f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f2091M0 != z) {
            this.f2091M0 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f2090L0 != z) {
            this.f2090L0 = z;
            refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1607c(int i) {
        this.f2095Q0 = i;
        if (!this.f2093O0) {
            InsetDrawable insetDrawable = this.f2102f;
            if (insetDrawable == null) {
                m1610f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f2102f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    m1610f();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.f2101e.f237423X0));
        int iMax2 = Math.max(0, i - this.f2101e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f2102f;
            if (insetDrawable2 == null) {
                m1610f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f2102f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    m1610f();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f2102f != null) {
            Rect rect = new Rect();
            this.f2102f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                m1610f();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f2102f = new InsetDrawable((Drawable) this.f2101e, i2, i3, i2, i3);
        m1610f();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1608d() {
        v5e v5eVar = this.f2101e;
        if (v5eVar == null) {
            return false;
        }
        Drawable drawable = v5eVar.f237441j1;
        return (drawable != null ? svg1.m79464R(drawable) : null) != null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072 A[RETURN] */
    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.f2097S0) {
            return super.dispatchHoverEvent(motionEvent);
        }
        q4e q4eVar = this.f2096R0;
        AccessibilityManager accessibilityManager = q4eVar.f185166h;
        int i2 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Chip chip = q4eVar.f185158L0;
                if (chip.m1608d() && chip.getCloseIconTouchBounds().contains(x, y)) {
                    i2 = 1;
                }
                int i3 = q4eVar.f185161Z;
                if (i3 != i2) {
                    q4eVar.f185161Z = i2;
                    q4eVar.m72156r(i2, 128);
                    q4eVar.m72156r(i3, 256);
                    return true;
                }
            } else if (action == 10 && (i = q4eVar.f185161Z) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    q4eVar.f185161Z = Integer.MIN_VALUE;
                    q4eVar.m72156r(Integer.MIN_VALUE, 128);
                    q4eVar.m72156r(i, 256);
                    return true;
                }
            } else if (super.dispatchHoverEvent(motionEvent)) {
                return false;
            }
        } else if (super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        Chip chip;
        View.OnClickListener onClickListener;
        if (!this.f2097S0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        q4e q4eVar = this.f2096R0;
        q4eVar.getClass();
        boolean zM72151m = false;
        int i2 = 0;
        zM72151m = false;
        zM72151m = false;
        zM72151m = false;
        zM72151m = false;
        zM72151m = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i2 < repeatCount && q4eVar.m72151m(i3, null)) {
                                    i2++;
                                    z = true;
                                }
                                zM72151m = z;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i = q4eVar.f185160Y;
                                if (i != Integer.MIN_VALUE) {
                                    chip = q4eVar.f185158L0;
                                    if (i == 0) {
                                        chip.performClick();
                                    } else if (i == 1) {
                                        chip.playSoundEffect(0);
                                        onClickListener = chip.f2104h;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(chip);
                                        }
                                        if (chip.f2097S0) {
                                            chip.f2096R0.m72156r(1, 1);
                                        }
                                    }
                                }
                                zM72151m = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i = q4eVar.f185160Y;
                    if (i != Integer.MIN_VALUE) {
                        chip = q4eVar.f185158L0;
                        if (i == 0) {
                            chip.performClick();
                        } else if (i == 1) {
                            chip.playSoundEffect(0);
                            onClickListener = chip.f2104h;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f2097S0) {
                                chip.f2096R0.m72156r(1, 1);
                            }
                        }
                    }
                    zM72151m = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM72151m = q4eVar.m72151m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM72151m = q4eVar.m72151m(1, null);
            }
        }
        if (!zM72151m || q4eVar.f185160Y == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        int i2;
        super.drawableStateChanged();
        v5e v5eVar = this.f2101e;
        boolean zM84687B = false;
        if (v5eVar != null && v5e.m84685z(v5eVar.f237441j1)) {
            v5e v5eVar2 = this.f2101e;
            ?? IsEnabled = isEnabled();
            if (this.f2092N0) {
                i = IsEnabled;
                i = IsEnabled + 1;
            }
            i = IsEnabled;
            int i3 = i;
            if (this.f2091M0) {
                i3 = i + 1;
            }
            int i4 = i3;
            if (this.f2090L0) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (this.f2092N0) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.f2091M0) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.f2090L0) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            if (!Arrays.equals(v5eVar2.f237422W1, iArr)) {
                v5eVar2.f237422W1 = iArr;
                if (v5eVar2.m84710Y()) {
                    zM84687B = v5eVar2.m84687B(v5eVar2.getState(), iArr);
                }
            }
        }
        if (zM84687B) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1609e() {
        v5e v5eVar;
        if (!m1608d() || (v5eVar = this.f2101e) == null || !v5eVar.f237440i1 || this.f2104h == null) {
            mec1.m61564p(this, null);
            this.f2097S0 = false;
        } else {
            mec1.m61564p(this, this.f2096R0);
            this.f2097S0 = true;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1610f() {
        this.f2103g = new RippleDrawable(cyf1.m34379o(this.f2101e.f237431b1), getBackgroundDrawable(), null);
        this.f2101e.getClass();
        RippleDrawable rippleDrawable = this.f2103g;
        WeakHashMap weakHashMap = mec1.f142677a;
        setBackground(rippleDrawable);
        m1611g();
    }

    /* JADX INFO: renamed from: g */
    public final void m1611g() {
        v5e v5eVar;
        if (TextUtils.isEmpty(getText()) || (v5eVar = this.f2101e) == null) {
            return;
        }
        int iM84714w = (int) (v5eVar.m84714w() + v5eVar.f237399B1 + v5eVar.f237456y1);
        v5e v5eVar2 = this.f2101e;
        int iM84713v = (int) (v5eVar2.m84713v() + v5eVar2.f237452u1 + v5eVar2.f237455x1);
        if (this.f2102f != null) {
            Rect rect = new Rect();
            this.f2102f.getPadding(rect);
            iM84713v += rect.left;
            iM84714w += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = mec1.f142677a;
        setPaddingRelative(iM84713v, paddingTop, iM84714w, paddingBottom);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        v5e v5eVar = this.f2101e;
        if (v5eVar == null || !v5eVar.f237446o1) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).f2111g) ? "android.widget.RadioButton" : "android.widget.CompoundButton";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f2102f;
        return insetDrawable == null ? this.f2101e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            return v5eVar.f237448q1;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            return v5eVar.f237449r1;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            return v5eVar.f237421W0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            return Math.max(0.0f, v5eVar.m84715x());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f2101e;
    }

    public float getChipEndPadding() {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            return v5eVar.f237399B1;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        v5e v5eVar = this.f2101e;
        if (v5eVar == null || (drawable = v5eVar.f237436e1) == null) {
            return null;
        }
        return svg1.m79464R(drawable);
    }

    public float getChipIconSize() {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            return v5eVar.f237438g1;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            return v5eVar.f237437f1;
        }
        return null;
    }

    public float getChipMinHeight() {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            return v5eVar.f237423X0;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            return v5eVar.f237452u1;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            return v5eVar.f237427Z0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            return v5eVar.f237429a1;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        v5e v5eVar = this.f2101e;
        if (v5eVar == null || (drawable = v5eVar.f237441j1) == null) {
            return null;
        }
        return svg1.m79464R(drawable);
    }

    public CharSequence getCloseIconContentDescription() {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            return v5eVar.f237445n1;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            return v5eVar.f237398A1;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            return v5eVar.f237444m1;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            return v5eVar.f237457z1;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            return v5eVar.f237443l1;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            return v5eVar.f237428Z1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f2097S0) {
            q4e q4eVar = this.f2096R0;
            if (q4eVar.f185160Y == 1 || q4eVar.f185159X == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public z1i0 getHideMotionSpec() {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            return v5eVar.f237451t1;
        }
        return null;
    }

    public float getIconEndPadding() {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            return v5eVar.f237454w1;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            return v5eVar.f237453v1;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            return v5eVar.f237431b1;
        }
        return null;
    }

    public dh01 getShapeAppearanceModel() {
        return this.f2101e.f150021a.f139593a;
    }

    public z1i0 getShowMotionSpec() {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            return v5eVar.f237450s1;
        }
        return null;
    }

    public float getTextEndPadding() {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            return v5eVar.f237456y1;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            return v5eVar.f237455x1;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: h */
    public final void m1612h() {
        TextPaint paint = getPaint();
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            paint.drawableState = v5eVar.getState();
        }
        r171 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m74468e(getContext(), paint, this.f2100V0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ytg1.m94632w(this, this.f2101e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2088X0);
        }
        v5e v5eVar = this.f2101e;
        if (v5eVar != null && v5eVar.f237446o1) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2089Y0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f2097S0) {
            q4e q4eVar = this.f2096R0;
            int i2 = q4eVar.f185160Y;
            if (i2 != Integer.MIN_VALUE) {
                q4eVar.m72148j(i2);
            }
            if (z) {
                q4eVar.m72151m(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        v5e v5eVar = this.f2101e;
        int i2 = 0;
        accessibilityNodeInfo.setCheckable(v5eVar != null && v5eVar.f237446o1);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (!chipGroup.f178833c) {
                i = -1;
                break;
            }
            i = 0;
            while (true) {
                if (i2 >= chipGroup.getChildCount()) {
                    i = -1;
                    break;
                }
                if (chipGroup.getChildAt(i2) instanceof Chip) {
                    if (((Chip) chipGroup.getChildAt(i2)) == this) {
                        break;
                    } else {
                        i++;
                    }
                }
                i2++;
            }
            Object tag = getTag(com.spotify.music.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) c961.m31864c(isChecked(), tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1).f35411b);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f2094P0 != i) {
            this.f2094P0 = i;
            m1611g();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.f2090L0) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z = true;
                }
                z = false;
            } else {
                if (this.f2090L0) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.f2104h;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.f2097S0) {
                        this.f2096R0.m72156r(1, 1);
                    }
                    z = true;
                }
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z = true;
        } else {
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f2103g) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f2103g) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84688C(z);
        }
    }

    public void setCheckableResource(int i) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84688C(v5eVar.f237400C1.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        v5e v5eVar = this.f2101e;
        if (v5eVar == null) {
            this.f2106t = z;
            return;
        }
        if (v5eVar.f237446o1) {
            boolean zIsChecked = isChecked();
            super.setChecked(z);
            if (zIsChecked == z || (onCheckedChangeListener = this.f2105i) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84689D(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84689D(ihf1.m50639w(v5eVar.f237400C1, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84690E(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84690E(lzj.m60387w(v5eVar.f237400C1, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84691F(v5eVar.f237400C1.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        v5e v5eVar = this.f2101e;
        if (v5eVar == null || v5eVar.f237421W0 == colorStateList) {
            return;
        }
        v5eVar.f237421W0 = colorStateList;
        v5eVar.onStateChange(v5eVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListM60387w;
        v5e v5eVar = this.f2101e;
        if (v5eVar == null || v5eVar.f237421W0 == (colorStateListM60387w = lzj.m60387w(v5eVar.f237400C1, i))) {
            return;
        }
        v5eVar.f237421W0 = colorStateListM60387w;
        v5eVar.onStateChange(v5eVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84692G(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84692G(v5eVar.f237400C1.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(v5e v5eVar) {
        v5e v5eVar2 = this.f2101e;
        if (v5eVar2 != v5eVar) {
            if (v5eVar2 != null) {
                v5eVar2.f237426Y1 = new WeakReference(null);
            }
            this.f2101e = v5eVar;
            v5eVar.f237430a2 = false;
            v5eVar.f237426Y1 = new WeakReference(this);
            m1607c(this.f2095Q0);
        }
    }

    public void setChipEndPadding(float f) {
        v5e v5eVar = this.f2101e;
        if (v5eVar == null || v5eVar.f237399B1 == f) {
            return;
        }
        v5eVar.f237399B1 = f;
        v5eVar.invalidateSelf();
        v5eVar.m84686A();
    }

    public void setChipEndPaddingResource(int i) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            float dimension = v5eVar.f237400C1.getResources().getDimension(i);
            if (v5eVar.f237399B1 != dimension) {
                v5eVar.f237399B1 = dimension;
                v5eVar.invalidateSelf();
                v5eVar.m84686A();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84693H(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84693H(ihf1.m50639w(v5eVar.f237400C1, i));
        }
    }

    public void setChipIconSize(float f) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84694I(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84694I(v5eVar.f237400C1.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84695J(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84695J(lzj.m60387w(v5eVar.f237400C1, i));
        }
    }

    public void setChipIconVisible(int i) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84696K(v5eVar.f237400C1.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        v5e v5eVar = this.f2101e;
        if (v5eVar == null || v5eVar.f237423X0 == f) {
            return;
        }
        v5eVar.f237423X0 = f;
        v5eVar.invalidateSelf();
        v5eVar.m84686A();
    }

    public void setChipMinHeightResource(int i) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            float dimension = v5eVar.f237400C1.getResources().getDimension(i);
            if (v5eVar.f237423X0 != dimension) {
                v5eVar.f237423X0 = dimension;
                v5eVar.invalidateSelf();
                v5eVar.m84686A();
            }
        }
    }

    public void setChipStartPadding(float f) {
        v5e v5eVar = this.f2101e;
        if (v5eVar == null || v5eVar.f237452u1 == f) {
            return;
        }
        v5eVar.f237452u1 = f;
        v5eVar.invalidateSelf();
        v5eVar.m84686A();
    }

    public void setChipStartPaddingResource(int i) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            float dimension = v5eVar.f237400C1.getResources().getDimension(i);
            if (v5eVar.f237452u1 != dimension) {
                v5eVar.f237452u1 = dimension;
                v5eVar.invalidateSelf();
                v5eVar.m84686A();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84697L(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84697L(lzj.m60387w(v5eVar.f237400C1, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84698M(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84698M(v5eVar.f237400C1.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84699N(drawable);
        }
        m1609e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        v5e v5eVar = this.f2101e;
        if (v5eVar == null || v5eVar.f237445n1 == charSequence) {
            return;
        }
        yb9 yb9VarM93255c = yb9.m93255c();
        yb9VarM93255c.getClass();
        ihk0 ihk0Var = l571.f129843a;
        v5eVar.f237445n1 = yb9VarM93255c.m93256d(charSequence);
        v5eVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84700O(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84700O(v5eVar.f237400C1.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84699N(ihf1.m50639w(v5eVar.f237400C1, i));
        }
        m1609e();
    }

    public void setCloseIconSize(float f) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84701P(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84701P(v5eVar.f237400C1.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84702Q(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84702Q(v5eVar.f237400C1.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84703R(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84703R(lzj.m60387w(v5eVar.f237400C1, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m63600k(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f2101e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.f237428Z1 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f2093O0 = z;
        m1607c(this.f2095Q0);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            return;
        }
        super.setGravity(i);
    }

    public void setHideMotionSpec(z1i0 z1i0Var) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.f237451t1 = z1i0Var;
        }
    }

    public void setHideMotionSpecResource(int i) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.f237451t1 = z1i0.m95134a(v5eVar.f237400C1, i);
        }
    }

    public void setIconEndPadding(float f) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84705T(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84705T(v5eVar.f237400C1.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84706U(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84706U(v5eVar.f237400C1.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f2101e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.f237432b2 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f2105i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f2104h = onClickListener;
        m1609e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84707V(colorStateList);
        }
        this.f2101e.getClass();
        m1610f();
    }

    public void setRippleColorResource(int i) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84707V(lzj.m60387w(v5eVar.f237400C1, i));
            this.f2101e.getClass();
            m1610f();
        }
    }

    @Override // p204p.ei01
    public void setShapeAppearanceModel(dh01 dh01Var) {
        this.f2101e.setShapeAppearanceModel(dh01Var);
    }

    public void setShowMotionSpec(z1i0 z1i0Var) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.f237450s1 = z1i0Var;
        }
    }

    public void setShowMotionSpecResource(int i) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.f237450s1 = z1i0.m95134a(v5eVar.f237400C1, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        v5e v5eVar = this.f2101e;
        if (v5eVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(v5eVar.f237430a2 ? null : charSequence, bufferType);
        v5e v5eVar2 = this.f2101e;
        if (v5eVar2 == null || TextUtils.equals(v5eVar2.f237433c1, charSequence)) {
            return;
        }
        v5eVar2.f237433c1 = charSequence;
        v5eVar2.f237406I1.f161906d = true;
        v5eVar2.invalidateSelf();
        v5eVar2.m84686A();
    }

    public void setTextAppearance(r171 r171Var) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.f237406I1.m66279b(r171Var, v5eVar.f237400C1);
        }
        m1612h();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        v5e v5eVar = this.f2101e;
        if (v5eVar == null || v5eVar.f237456y1 == f) {
            return;
        }
        v5eVar.f237456y1 = f;
        v5eVar.invalidateSelf();
        v5eVar.m84686A();
    }

    public void setTextEndPaddingResource(int i) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            float dimension = v5eVar.f237400C1.getResources().getDimension(i);
            if (v5eVar.f237456y1 != dimension) {
                v5eVar.f237456y1 = dimension;
                v5eVar.invalidateSelf();
                v5eVar.m84686A();
            }
        }
    }

    public void setTextStartPadding(float f) {
        v5e v5eVar = this.f2101e;
        if (v5eVar == null || v5eVar.f237455x1 == f) {
            return;
        }
        v5eVar.f237455x1 = f;
        v5eVar.invalidateSelf();
        v5eVar.m84686A();
    }

    public void setTextStartPaddingResource(int i) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            float dimension = v5eVar.f237400C1.getResources().getDimension(i);
            if (v5eVar.f237455x1 != dimension) {
                v5eVar.f237455x1 = dimension;
                v5eVar.invalidateSelf();
                v5eVar.m84686A();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.spotify.music.R.attr.chipStyle);
    }

    public void setCloseIconVisible(boolean z) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84704S(z);
        }
        m1609e();
    }

    public Chip(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(vgg1.m85455K(context, attributeSet, i, com.spotify.music.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, i);
        this.f2098T0 = new Rect();
        this.f2099U0 = new RectF();
        this.f2100V0 = new n4e(this, 0);
        Context context2 = getContext();
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
                            } else {
                                throw new UnsupportedOperationException("Chip does not support multi-line text");
                            }
                        } else {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }
                } else {
                    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                }
            } else {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
        }
        v5e v5eVar = new v5e(context2, attributeSet, i);
        Context context3 = v5eVar.f237400C1;
        int[] iArr = h1u0.f86733g;
        TypedArray typedArrayM28739t = bcg1.m28739t(context3, attributeSet, iArr, i, com.spotify.music.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        v5eVar.f237434c2 = typedArrayM28739t.hasValue(37);
        Context context4 = v5eVar.f237400C1;
        ColorStateList colorStateListM88942q = wtg1.m88942q(context4, typedArrayM28739t, 24);
        if (v5eVar.f237419V0 != colorStateListM88942q) {
            v5eVar.f237419V0 = colorStateListM88942q;
            v5eVar.onStateChange(v5eVar.getState());
        }
        ColorStateList colorStateListM88942q2 = wtg1.m88942q(context4, typedArrayM28739t, 11);
        if (v5eVar.f237421W0 != colorStateListM88942q2) {
            v5eVar.f237421W0 = colorStateListM88942q2;
            v5eVar.onStateChange(v5eVar.getState());
        }
        float dimension = typedArrayM28739t.getDimension(19, 0.0f);
        if (v5eVar.f237423X0 != dimension) {
            v5eVar.f237423X0 = dimension;
            v5eVar.invalidateSelf();
            v5eVar.m84686A();
        }
        if (typedArrayM28739t.hasValue(12)) {
            v5eVar.m84692G(typedArrayM28739t.getDimension(12, 0.0f));
        }
        v5eVar.m84697L(wtg1.m88942q(context4, typedArrayM28739t, 22));
        v5eVar.m84698M(typedArrayM28739t.getDimension(23, 0.0f));
        v5eVar.m84707V(wtg1.m88942q(context4, typedArrayM28739t, 36));
        String text = typedArrayM28739t.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(v5eVar.f237433c1, text);
        o571 o571Var = v5eVar.f237406I1;
        if (!zEquals) {
            v5eVar.f237433c1 = text;
            o571Var.f161906d = true;
            v5eVar.invalidateSelf();
            v5eVar.m84686A();
        }
        r171 r171Var = (!typedArrayM28739t.hasValue(0) || (resourceId3 = typedArrayM28739t.getResourceId(0, 0)) == 0) ? null : new r171(context4, resourceId3);
        r171Var.f194793k = typedArrayM28739t.getDimension(1, r171Var.f194793k);
        o571Var.m66279b(r171Var, context4);
        int i2 = typedArrayM28739t.getInt(3, 0);
        if (i2 == 1) {
            v5eVar.f237428Z1 = TextUtils.TruncateAt.START;
        } else if (i2 == 2) {
            v5eVar.f237428Z1 = TextUtils.TruncateAt.MIDDLE;
        } else if (i2 == 3) {
            v5eVar.f237428Z1 = TextUtils.TruncateAt.END;
        }
        v5eVar.m84696K(typedArrayM28739t.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            v5eVar.m84696K(typedArrayM28739t.getBoolean(15, false));
        }
        v5eVar.m84693H(wtg1.m88945t(context4, typedArrayM28739t, 14));
        if (typedArrayM28739t.hasValue(17)) {
            v5eVar.m84695J(wtg1.m88942q(context4, typedArrayM28739t, 17));
        }
        v5eVar.m84694I(typedArrayM28739t.getDimension(16, -1.0f));
        v5eVar.m84704S(typedArrayM28739t.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            v5eVar.m84704S(typedArrayM28739t.getBoolean(26, false));
        }
        v5eVar.m84699N(wtg1.m88945t(context4, typedArrayM28739t, 25));
        v5eVar.m84703R(wtg1.m88942q(context4, typedArrayM28739t, 30));
        v5eVar.m84701P(typedArrayM28739t.getDimension(28, 0.0f));
        v5eVar.m84688C(typedArrayM28739t.getBoolean(6, false));
        v5eVar.m84691F(typedArrayM28739t.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            v5eVar.m84691F(typedArrayM28739t.getBoolean(8, false));
        }
        v5eVar.m84689D(wtg1.m88945t(context4, typedArrayM28739t, 7));
        if (typedArrayM28739t.hasValue(9)) {
            v5eVar.m84690E(wtg1.m88942q(context4, typedArrayM28739t, 9));
        }
        v5eVar.f237450s1 = (!typedArrayM28739t.hasValue(39) || (resourceId2 = typedArrayM28739t.getResourceId(39, 0)) == 0) ? null : z1i0.m95134a(context4, resourceId2);
        v5eVar.f237451t1 = (!typedArrayM28739t.hasValue(33) || (resourceId = typedArrayM28739t.getResourceId(33, 0)) == 0) ? null : z1i0.m95134a(context4, resourceId);
        float dimension2 = typedArrayM28739t.getDimension(21, 0.0f);
        if (v5eVar.f237452u1 != dimension2) {
            v5eVar.f237452u1 = dimension2;
            v5eVar.invalidateSelf();
            v5eVar.m84686A();
        }
        v5eVar.m84706U(typedArrayM28739t.getDimension(35, 0.0f));
        v5eVar.m84705T(typedArrayM28739t.getDimension(34, 0.0f));
        float dimension3 = typedArrayM28739t.getDimension(41, 0.0f);
        if (v5eVar.f237455x1 != dimension3) {
            v5eVar.f237455x1 = dimension3;
            v5eVar.invalidateSelf();
            v5eVar.m84686A();
        }
        float dimension4 = typedArrayM28739t.getDimension(40, 0.0f);
        if (v5eVar.f237456y1 != dimension4) {
            v5eVar.f237456y1 = dimension4;
            v5eVar.invalidateSelf();
            v5eVar.m84686A();
        }
        v5eVar.m84702Q(typedArrayM28739t.getDimension(29, 0.0f));
        v5eVar.m84700O(typedArrayM28739t.getDimension(27, 0.0f));
        float dimension5 = typedArrayM28739t.getDimension(13, 0.0f);
        if (v5eVar.f237399B1 != dimension5) {
            v5eVar.f237399B1 = dimension5;
            v5eVar.invalidateSelf();
            v5eVar.m84686A();
        }
        v5eVar.f237432b2 = typedArrayM28739t.getDimensionPixelSize(4, Alert.DURATION_SHOW_INDEFINITELY);
        typedArrayM28739t.recycle();
        bcg1.m28727h(context2, attributeSet, i, com.spotify.music.R.style.Widget_MaterialComponents_Chip_Action);
        bcg1.m28728i(context2, attributeSet, iArr, i, com.spotify.music.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, com.spotify.music.R.style.Widget_MaterialComponents_Chip_Action);
        this.f2093O0 = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f2095Q0 = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(bga.m29100v(getContext(), 48))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(v5eVar);
        WeakHashMap weakHashMap = mec1.f142677a;
        v5eVar.m63600k(cec1.m32541e(this));
        bcg1.m28727h(context2, attributeSet, i, com.spotify.music.R.style.Widget_MaterialComponents_Chip_Action);
        bcg1.m28728i(context2, attributeSet, iArr, i, com.spotify.music.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, i, com.spotify.music.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f2096R0 = new q4e(this, this);
        m1609e();
        if (!zHasValue) {
            setOutlineProvider(new o4e(this));
        }
        setChecked(this.f2106t);
        setText(v5eVar.f237433c1);
        setEllipsize(v5eVar.f237428Z1);
        m1612h();
        if (!this.f2101e.f237430a2) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m1611g();
        if (this.f2093O0) {
            setMinHeight(this.f2095Q0);
        }
        this.f2094P0 = getLayoutDirection();
    }

    public void setCheckedIconVisible(boolean z) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84691F(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            v5eVar.m84696K(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            Context context2 = v5eVar.f237400C1;
            v5eVar.f237406I1.m66279b(new r171(context2, i), context2);
        }
        m1612h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        v5e v5eVar = this.f2101e;
        if (v5eVar != null) {
            Context context = v5eVar.f237400C1;
            v5eVar.f237406I1.m66279b(new r171(context, i), context);
        }
        m1612h();
    }
}
