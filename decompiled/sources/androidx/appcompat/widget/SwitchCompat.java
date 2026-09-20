package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.comscore.streaming.ContentType;
import java.util.WeakHashMap;
import p204p.cgs;
import p204p.cpc1;
import p204p.cx21;
import p204p.dd3;
import p204p.ee61;
import p204p.eg71;
import p204p.h3u0;
import p204p.ihf1;
import p204p.mec1;
import p204p.p7u;
import p204p.s65;
import p204p.svg1;
import p204p.tjc;
import p204p.u75;
import p204p.y8u;
import p204p.zn91;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: s1 */
    public static final tjc f262s1 = new tjc(11);

    /* JADX INFO: renamed from: t1 */
    public static final int[] f263t1 = {R.attr.state_checked};

    /* JADX INFO: renamed from: L0 */
    public int f264L0;

    /* JADX INFO: renamed from: M0 */
    public int f265M0;

    /* JADX INFO: renamed from: N0 */
    public int f266N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f267O0;

    /* JADX INFO: renamed from: P0 */
    public CharSequence f268P0;

    /* JADX INFO: renamed from: Q0 */
    public CharSequence f269Q0;

    /* JADX INFO: renamed from: R0 */
    public CharSequence f270R0;

    /* JADX INFO: renamed from: S0 */
    public CharSequence f271S0;

    /* JADX INFO: renamed from: T0 */
    public boolean f272T0;

    /* JADX INFO: renamed from: U0 */
    public int f273U0;

    /* JADX INFO: renamed from: V0 */
    public final int f274V0;

    /* JADX INFO: renamed from: W0 */
    public float f275W0;

    /* JADX INFO: renamed from: X0 */
    public float f276X0;

    /* JADX INFO: renamed from: Y0 */
    public final VelocityTracker f277Y0;

    /* JADX INFO: renamed from: Z0 */
    public final int f278Z0;

    /* JADX INFO: renamed from: a */
    public Drawable f279a;

    /* JADX INFO: renamed from: a1 */
    public float f280a1;

    /* JADX INFO: renamed from: b */
    public ColorStateList f281b;

    /* JADX INFO: renamed from: b1 */
    public int f282b1;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f283c;

    /* JADX INFO: renamed from: c1 */
    public int f284c1;

    /* JADX INFO: renamed from: d */
    public boolean f285d;

    /* JADX INFO: renamed from: d1 */
    public int f286d1;

    /* JADX INFO: renamed from: e */
    public boolean f287e;

    /* JADX INFO: renamed from: e1 */
    public int f288e1;

    /* JADX INFO: renamed from: f */
    public Drawable f289f;

    /* JADX INFO: renamed from: f1 */
    public int f290f1;

    /* JADX INFO: renamed from: g */
    public ColorStateList f291g;

    /* JADX INFO: renamed from: g1 */
    public int f292g1;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f293h;

    /* JADX INFO: renamed from: h1 */
    public int f294h1;

    /* JADX INFO: renamed from: i */
    public boolean f295i;

    /* JADX INFO: renamed from: i1 */
    public boolean f296i1;

    /* JADX INFO: renamed from: j1 */
    public final TextPaint f297j1;

    /* JADX INFO: renamed from: k1 */
    public final ColorStateList f298k1;

    /* JADX INFO: renamed from: l1 */
    public StaticLayout f299l1;

    /* JADX INFO: renamed from: m1 */
    public StaticLayout f300m1;

    /* JADX INFO: renamed from: n1 */
    public final dd3 f301n1;

    /* JADX INFO: renamed from: o1 */
    public ObjectAnimator f302o1;

    /* JADX INFO: renamed from: p1 */
    public s65 f303p1;

    /* JADX INFO: renamed from: q1 */
    public y8u f304q1;

    /* JADX INFO: renamed from: r1 */
    public final Rect f305r1;

    /* JADX INFO: renamed from: t */
    public boolean f306t;

    public SwitchCompat(Context context) {
        this(context, null);
    }

    private s65 getEmojiTextViewHelper() {
        if (this.f303p1 == null) {
            this.f303p1 = new s65(this);
        }
        return this.f303p1;
    }

    private boolean getTargetCheckedState() {
        return this.f280a1 > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((cpc1.m33562a(this) ? 1.0f - this.f280a1 : this.f280a1) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f289f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f305r1;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f279a;
        Rect rectM32735b = drawable2 != null ? cgs.m32735b(drawable2) : cgs.f37784c;
        return ((((this.f282b1 - this.f286d1) - rect.left) - rect.right) - rectM32735b.left) - rectM32735b.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f270R0 = charSequence;
        TransformationMethod transformationMethodM77319f = getEmojiTextViewHelper().m77319f(this.f301n1);
        if (transformationMethodM77319f != null) {
            charSequence = transformationMethodM77319f.getTransformation(charSequence, this);
        }
        this.f271S0 = charSequence;
        this.f300m1 = null;
        if (this.f272T0) {
            m152d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f268P0 = charSequence;
        TransformationMethod transformationMethodM77319f = getEmojiTextViewHelper().m77319f(this.f301n1);
        if (transformationMethodM77319f != null) {
            charSequence = transformationMethodM77319f.getTransformation(charSequence, this);
        }
        this.f269Q0 = charSequence;
        this.f299l1 = null;
        if (this.f272T0) {
            m152d();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m149a() {
        Drawable drawable = this.f279a;
        if (drawable != null) {
            if (this.f285d || this.f287e) {
                Drawable drawableMutate = drawable.mutate();
                this.f279a = drawableMutate;
                if (this.f285d) {
                    svg1.m79459M(drawableMutate, this.f281b);
                }
                if (this.f287e) {
                    svg1.m79460N(this.f279a, this.f283c);
                }
                if (this.f279a.isStateful()) {
                    this.f279a.setState(getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m150b() {
        Drawable drawable = this.f289f;
        if (drawable != null) {
            if (this.f295i || this.f306t) {
                Drawable drawableMutate = drawable.mutate();
                this.f289f = drawableMutate;
                if (this.f295i) {
                    svg1.m79459M(drawableMutate, this.f291g);
                }
                if (this.f306t) {
                    svg1.m79460N(this.f289f, this.f293h);
                }
                if (this.f289f.isStateful()) {
                    this.f289f.setState(getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m151c() {
        setTextOnInternal(this.f268P0);
        setTextOffInternal(this.f270R0);
        requestLayout();
    }

    /* JADX INFO: renamed from: d */
    public final void m152d() {
        if (this.f304q1 == null && this.f303p1.m77315b() && p7u.m69298d()) {
            p7u p7uVarM69297a = p7u.m69297a();
            int iM69300c = p7uVarM69297a.m69300c();
            if (iM69300c == 3 || iM69300c == 0) {
                y8u y8uVar = new y8u(this);
                this.f304q1 = y8uVar;
                p7uVarM69297a.m69305i(y8uVar);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.f288e1;
        int i4 = this.f290f1;
        int i5 = this.f292g1;
        int i6 = this.f294h1;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f279a;
        Rect rectM32735b = drawable != null ? cgs.m32735b(drawable) : cgs.f37784c;
        Drawable drawable2 = this.f289f;
        Rect rect = this.f305r1;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectM32735b != null) {
                int i8 = rectM32735b.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectM32735b.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectM32735b.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectM32735b.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.f289f.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.f289f.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f279a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f286d1 + rect.right;
            this.f279a.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                svg1.m79456J(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f279a;
        if (drawable != null) {
            svg1.m79455I(drawable, f, f2);
        }
        Drawable drawable2 = this.f289f;
        if (drawable2 != null) {
            svg1.m79455I(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f279a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f289f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!cpc1.m33562a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f282b1;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f266N0 : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (cpc1.m33562a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f282b1;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f266N0 : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return zn91.m96580u0(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f272T0;
    }

    public boolean getSplitTrack() {
        return this.f267O0;
    }

    public int getSwitchMinWidth() {
        return this.f265M0;
    }

    public int getSwitchPadding() {
        return this.f266N0;
    }

    public CharSequence getTextOff() {
        return this.f270R0;
    }

    public CharSequence getTextOn() {
        return this.f268P0;
    }

    public Drawable getThumbDrawable() {
        return this.f279a;
    }

    public final float getThumbPosition() {
        return this.f280a1;
    }

    public int getThumbTextPadding() {
        return this.f264L0;
    }

    public ColorStateList getThumbTintList() {
        return this.f281b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f283c;
    }

    public Drawable getTrackDrawable() {
        return this.f289f;
    }

    public ColorStateList getTrackTintList() {
        return this.f291g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f293h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f279a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f289f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f302o1;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f302o1.end();
        this.f302o1 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f263t1);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f289f;
        Rect rect = this.f305r1;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f290f1;
        int i2 = this.f294h1;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f279a;
        if (drawable != null) {
            if (!this.f267O0 || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectM32735b = cgs.m32735b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectM32735b.left;
                rect.right -= rectM32735b.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f299l1 : this.f300m1;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.f297j1;
            ColorStateList colorStateList = this.f298k1;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f268P0 : this.f270R0;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.f279a != null) {
            Drawable drawable = this.f289f;
            Rect rect = this.f305r1;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectM32735b = cgs.m32735b(this.f279a);
            iMax = Math.max(0, rectM32735b.left - rect.left);
            iMax2 = Math.max(0, rectM32735b.right - rect.right);
        } else {
            iMax = 0;
        }
        if (cpc1.m33562a(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f282b1 + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f282b1) + iMax + iMax2;
        }
        int gravity = getGravity() & ContentType.LONG_FORM_ON_DEMAND;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.f284c1;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.f284c1 + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.f284c1;
        }
        this.f288e1 = paddingLeft;
        this.f290f1 = paddingTop;
        this.f294h1 = height;
        this.f292g1 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        int intrinsicHeight2 = 0;
        if (this.f272T0) {
            StaticLayout staticLayout = this.f299l1;
            TextPaint textPaint = this.f297j1;
            if (staticLayout == null) {
                CharSequence charSequence = this.f269Q0;
                this.f299l1 = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f300m1 == null) {
                CharSequence charSequence2 = this.f271S0;
                this.f300m1 = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f279a;
        Rect rect = this.f305r1;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f279a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f279a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.f272T0) {
            iMax = (this.f264L0 * 2) + Math.max(this.f299l1.getWidth(), this.f300m1.getWidth());
        } else {
            iMax = 0;
        }
        this.f286d1 = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.f289f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f289f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.f279a;
        if (drawable3 != null) {
            Rect rectM32735b = cgs.m32735b(drawable3);
            iMax2 = Math.max(iMax2, rectM32735b.left);
            iMax3 = Math.max(iMax3, rectM32735b.right);
        }
        int iMax4 = this.f296i1 ? Math.max(this.f265M0, (this.f286d1 * 2) + iMax2 + iMax3) : this.f265M0;
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f282b1 = iMax4;
        this.f284c1 = iMax5;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f268P0 : this.f270R0;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ee  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f;
        VelocityTracker velocityTracker = this.f277Y0;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f274V0;
        if (actionMasked != 0) {
            float f2 = 0.0f;
            if (actionMasked == 1) {
                if (this.f273U0 == 2) {
                    this.f273U0 = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.f278Z0) {
                            targetCheckedState = cpc1.m33562a(this) ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f273U0 = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i2 = this.f273U0;
                if (i2 == 1) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    float f3 = i;
                    if (Math.abs(x - this.f275W0) > f3 || Math.abs(y - this.f276X0) > f3) {
                        this.f273U0 = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.f275W0 = x;
                        this.f276X0 = y;
                        return true;
                    }
                } else if (i2 == 2) {
                    float x2 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f4 = x2 - this.f275W0;
                    if (thumbScrollRange != 0) {
                        f = f4 / thumbScrollRange;
                    } else {
                        f = f4 > 0.0f ? 1.0f : -1.0f;
                    }
                    if (cpc1.m33562a(this)) {
                        f = -f;
                    }
                    float f5 = this.f280a1;
                    float f6 = f + f5;
                    if (f6 >= 0.0f) {
                        f2 = f6 > 1.0f ? 1.0f : f6;
                    }
                    if (f2 != f5) {
                        this.f275W0 = x2;
                        setThumbPosition(f2);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.f273U0 == 2) {
                    this.f273U0 = 0;
                    if (motionEvent.getAction() == 1) {
                        z = false;
                    } else {
                        z = false;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.f278Z0) {
                            targetCheckedState = getTargetCheckedState();
                        } else if (cpc1.m33562a(this)) {
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f273U0 = 0;
                velocityTracker.clear();
            }
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled() && this.f279a != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f279a;
                Rect rect = this.f305r1;
                drawable.getPadding(rect);
                int i3 = this.f290f1 - i;
                int i4 = (this.f288e1 + thumbOffset) - i;
                int i5 = this.f286d1 + i4 + rect.left + rect.right + i;
                int i6 = this.f294h1 + i;
                if (x3 > i4 && x3 < i5 && y2 > i3 && y2 < i6) {
                    this.f273U0 = 1;
                    this.f275W0 = x3;
                    this.f276X0 = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m77317d(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                CharSequence string = this.f268P0;
                if (string == null) {
                    string = getResources().getString(com.spotify.music.R.string.abc_capital_on);
                }
                mec1.m61568t(this, string);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string2 = this.f270R0;
            if (string2 == null) {
                string2 = getResources().getString(com.spotify.music.R.string.abc_capital_off);
            }
            mec1.m61568t(this, string2);
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap = mec1.f142677a;
            if (isLaidOut()) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f262s1, zIsChecked ? 1.0f : 0.0f);
                this.f302o1 = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(250L);
                ee61.m38647a(this.f302o1, true);
                this.f302o1.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f302o1;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(zIsChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(zn91.m96582v0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m77318e(z);
        setTextOnInternal(this.f268P0);
        setTextOffInternal(this.f270R0);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.f296i1 = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m77314a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.f272T0 != z) {
            this.f272T0 = z;
            requestLayout();
            if (z) {
                m152d();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f267O0 = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f265M0 = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f266N0 = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f297j1;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        CharSequence string = this.f270R0;
        if (string == null) {
            string = getResources().getString(com.spotify.music.R.string.abc_capital_off);
        }
        mec1.m61568t(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        CharSequence string = this.f268P0;
        if (string == null) {
            string = getResources().getString(com.spotify.music.R.string.abc_capital_on);
        }
        mec1.m61568t(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f279a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f279a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f280a1 = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(ihf1.m50639w(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f264L0 = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f281b = colorStateList;
        this.f285d = true;
        m149a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f283c = mode;
        this.f287e = true;
        m149a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f289f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f289f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(ihf1.m50639w(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f291g = colorStateList;
        this.f295i = true;
        m150b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f293h = mode;
        this.f306t = true;
        m150b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f279a || drawable == this.f289f;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.spotify.music.R.attr.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        Typeface typeface;
        Typeface typefaceCreate;
        super(context, attributeSet, i);
        this.f281b = null;
        this.f283c = null;
        this.f285d = false;
        this.f287e = false;
        this.f291g = null;
        this.f293h = null;
        this.f295i = false;
        this.f306t = false;
        this.f277Y0 = VelocityTracker.obtain();
        this.f296i1 = true;
        this.f305r1 = new Rect();
        eg71.m38806a(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.f297j1 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = h3u0.f87343w;
        cx21 cx21VarM34178J = cx21.m34178J(context, attributeSet, iArr, i);
        mec1.m61563o(this, context, iArr, attributeSet, cx21VarM34178J.m34212z(), i);
        Drawable drawableM34202l = cx21VarM34178J.m34202l(2);
        this.f279a = drawableM34202l;
        if (drawableM34202l != null) {
            drawableM34202l.setCallback(this);
        }
        Drawable drawableM34202l2 = cx21VarM34178J.m34202l(11);
        this.f289f = drawableM34202l2;
        if (drawableM34202l2 != null) {
            drawableM34202l2.setCallback(this);
        }
        setTextOnInternal(cx21VarM34178J.m34211y(0));
        setTextOffInternal(cx21VarM34178J.m34211y(1));
        this.f272T0 = cx21VarM34178J.m34196c(3, true);
        this.f264L0 = cx21VarM34178J.m34200j(8, 0);
        this.f265M0 = cx21VarM34178J.m34200j(5, 0);
        this.f266N0 = cx21VarM34178J.m34200j(6, 0);
        this.f267O0 = cx21VarM34178J.m34196c(4, false);
        ColorStateList colorStateListM34198g = cx21VarM34178J.m34198g(9);
        if (colorStateListM34198g != null) {
            this.f281b = colorStateListM34198g;
            this.f285d = true;
        }
        PorterDuff.Mode modeM32736c = cgs.m32736c(cx21VarM34178J.m34205p(10, -1), null);
        if (this.f283c != modeM32736c) {
            this.f283c = modeM32736c;
            this.f287e = true;
        }
        if (this.f285d || this.f287e) {
            m149a();
        }
        ColorStateList colorStateListM34198g2 = cx21VarM34178J.m34198g(12);
        if (colorStateListM34198g2 != null) {
            this.f291g = colorStateListM34198g2;
            this.f295i = true;
        }
        PorterDuff.Mode modeM32736c2 = cgs.m32736c(cx21VarM34178J.m34205p(13, -1), null);
        if (this.f293h != modeM32736c2) {
            this.f293h = modeM32736c2;
            this.f306t = true;
        }
        if (this.f295i || this.f306t) {
            m150b();
        }
        int iM34207t = cx21VarM34178J.m34207t(7, 0);
        if (iM34207t != 0) {
            cx21 cx21VarM34176H = cx21.m34176H(context, iM34207t, h3u0.f87344x);
            ColorStateList colorStateListM34198g3 = cx21VarM34176H.m34198g(3);
            if (colorStateListM34198g3 != null) {
                this.f298k1 = colorStateListM34198g3;
            } else {
                this.f298k1 = getTextColors();
            }
            int iM34200j = cx21VarM34176H.m34200j(0, 0);
            if (iM34200j != 0) {
                float f = iM34200j;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int iM34205p = cx21VarM34176H.m34205p(1, -1);
            int iM34205p2 = cx21VarM34176H.m34205p(2, -1);
            if (iM34205p == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (iM34205p != 2) {
                typeface = iM34205p != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (iM34205p2 > 0) {
                if (typeface == null) {
                    typefaceCreate = Typeface.defaultFromStyle(iM34205p2);
                } else {
                    typefaceCreate = Typeface.create(typeface, iM34205p2);
                }
                setSwitchTypeface(typefaceCreate);
                int i2 = (~(typefaceCreate != null ? typefaceCreate.getStyle() : 0)) & iM34205p2;
                textPaint.setFakeBoldText((i2 & 1) != 0);
                textPaint.setTextSkewX((2 & i2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (cx21VarM34176H.m34196c(14, false)) {
                this.f301n1 = new dd3(getContext());
            } else {
                this.f301n1 = null;
            }
            setTextOnInternal(this.f268P0);
            setTextOffInternal(this.f270R0);
            cx21VarM34176H.m34189K();
        }
        new u75(this).m82495m(attributeSet, i);
        cx21VarM34178J.m34189K();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f274V0 = viewConfiguration.getScaledTouchSlop();
        this.f278Z0 = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().m77316c(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
