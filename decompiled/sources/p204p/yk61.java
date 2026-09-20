package p204p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.spotify.music.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class yk61 extends LinearLayout {

    /* JADX INFO: renamed from: M0 */
    public static final /* synthetic */ int f273607M0 = 0;

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ TabLayout f273608L0;

    /* JADX INFO: renamed from: a */
    public vk61 f273609a;

    /* JADX INFO: renamed from: b */
    public TextView f273610b;

    /* JADX INFO: renamed from: c */
    public ImageView f273611c;

    /* JADX INFO: renamed from: d */
    public View f273612d;

    /* JADX INFO: renamed from: e */
    public dq8 f273613e;

    /* JADX INFO: renamed from: f */
    public View f273614f;

    /* JADX INFO: renamed from: g */
    public TextView f273615g;

    /* JADX INFO: renamed from: h */
    public ImageView f273616h;

    /* JADX INFO: renamed from: i */
    public Drawable f273617i;

    /* JADX INFO: renamed from: t */
    public int f273618t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk61(TabLayout tabLayout, Context context) {
        super(context);
        this.f273608L0 = tabLayout;
        this.f273618t = 2;
        m93969f(context);
        int i = tabLayout.f2187d;
        int i2 = tabLayout.f2189e;
        int i3 = tabLayout.f2191f;
        int i4 = tabLayout.f2193g;
        WeakHashMap weakHashMap = mec1.f142677a;
        setPaddingRelative(i, i2, i3, i4);
        setGravity(17);
        setOrientation(!tabLayout.f2182a1 ? 1 : 0);
        setClickable(true);
        eec1.m38653a(this, PointerIcon.getSystemIcon(getContext(), 1002));
    }

    private dq8 getBadge() {
        return this.f273613e;
    }

    private dq8 getOrCreateBadge() {
        int iMax;
        if (this.f273613e == null) {
            Context context = getContext();
            dq8 dq8Var = new dq8(context);
            bcg1.m28727h(context, null, R.attr.badgeStyle, R.style.Widget_MaterialComponents_Badge);
            int[] iArr = h1u0.f86729c;
            bcg1.m28728i(context, null, iArr, R.attr.badgeStyle, R.style.Widget_MaterialComponents_Badge, new int[0]);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.badgeStyle, R.style.Widget_MaterialComponents_Badge);
            int i = typedArrayObtainStyledAttributes.getInt(8, 4);
            cq8 cq8Var = dq8Var.f51890h;
            int i2 = cq8Var.f40787e;
            o571 o571Var = dq8Var.f51885c;
            if (i2 != i) {
                cq8Var.f40787e = i;
                dq8Var.f51880X = ((int) Math.pow(10.0d, ((double) i) - 1.0d)) - 1;
                o571Var.f161906d = true;
                dq8Var.m36634f();
                dq8Var.invalidateSelf();
            }
            if (typedArrayObtainStyledAttributes.hasValue(9) && cq8Var.f40786d != (iMax = Math.max(0, typedArrayObtainStyledAttributes.getInt(9, 0)))) {
                cq8Var.f40786d = iMax;
                o571Var.f161906d = true;
                dq8Var.m36634f();
                dq8Var.invalidateSelf();
            }
            int defaultColor = wtg1.m88942q(context, typedArrayObtainStyledAttributes, 0).getDefaultColor();
            cq8Var.f40783a = defaultColor;
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(defaultColor);
            n3d0 n3d0Var = dq8Var.f51884b;
            if (n3d0Var.f150021a.f139595c != colorStateListValueOf) {
                n3d0Var.m63601l(colorStateListValueOf);
                dq8Var.invalidateSelf();
            }
            if (typedArrayObtainStyledAttributes.hasValue(3)) {
                int defaultColor2 = wtg1.m88942q(context, typedArrayObtainStyledAttributes, 3).getDefaultColor();
                cq8Var.f40784b = defaultColor2;
                if (o571Var.f161903a.getColor() != defaultColor2) {
                    o571Var.f161903a.setColor(defaultColor2);
                    dq8Var.invalidateSelf();
                }
            }
            int i3 = typedArrayObtainStyledAttributes.getInt(1, 8388661);
            if (cq8Var.f40791i != i3) {
                cq8Var.f40791i = i3;
                WeakReference weakReference = dq8Var.f51878M0;
                if (weakReference != null && weakReference.get() != null) {
                    View view = (View) dq8Var.f51878M0.get();
                    WeakReference weakReference2 = dq8Var.f51879N0;
                    dq8Var.m36633e(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
                }
            }
            cq8Var.f40780X = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
            dq8Var.m36634f();
            cq8Var.f40781Y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(10, 0);
            dq8Var.m36634f();
            cq8Var.f40782Z = typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, cq8Var.f40780X);
            dq8Var.m36634f();
            cq8Var.f40777L0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(11, cq8Var.f40781Y);
            dq8Var.m36634f();
            if (typedArrayObtainStyledAttributes.hasValue(2)) {
                dq8Var.f51887e = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, (int) dq8Var.f51887e);
            }
            if (typedArrayObtainStyledAttributes.hasValue(4)) {
                dq8Var.f51889g = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, (int) dq8Var.f51889g);
            }
            if (typedArrayObtainStyledAttributes.hasValue(5)) {
                dq8Var.f51888f = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, (int) dq8Var.f51888f);
            }
            typedArrayObtainStyledAttributes.recycle();
            this.f273613e = dq8Var;
        }
        m93966c();
        dq8 dq8Var2 = this.f273613e;
        if (dq8Var2 != null) {
            return dq8Var2;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    /* JADX INFO: renamed from: b */
    public final void m93965b() {
        if (this.f273613e != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.f273612d;
            if (view != null) {
                dq8 dq8Var = this.f273613e;
                if (dq8Var != null) {
                    WeakReference weakReference = dq8Var.f51879N0;
                    if ((weakReference != null ? (FrameLayout) weakReference.get() : null) != null) {
                        WeakReference weakReference2 = dq8Var.f51879N0;
                        (weakReference2 != null ? (FrameLayout) weakReference2.get() : null).setForeground(null);
                    } else {
                        view.getOverlay().remove(dq8Var);
                    }
                }
                this.f273612d = null;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m93966c() {
        if (this.f273613e != null) {
            if (this.f273614f != null) {
                m93965b();
                return;
            }
            TextView textView = this.f273610b;
            if (textView == null || this.f273609a == null) {
                m93965b();
                return;
            }
            if (this.f273612d == textView) {
                m93967d(textView);
                return;
            }
            m93965b();
            TextView textView2 = this.f273610b;
            if (this.f273613e == null || textView2 == null) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            dq8 dq8Var = this.f273613e;
            Rect rect = new Rect();
            textView2.getDrawingRect(rect);
            dq8Var.setBounds(rect);
            dq8Var.m36633e(textView2, null);
            WeakReference weakReference = dq8Var.f51879N0;
            if ((weakReference != null ? (FrameLayout) weakReference.get() : null) != null) {
                WeakReference weakReference2 = dq8Var.f51879N0;
                (weakReference2 != null ? (FrameLayout) weakReference2.get() : null).setForeground(dq8Var);
            } else {
                textView2.getOverlay().add(dq8Var);
            }
            this.f273612d = textView2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m93967d(View view) {
        dq8 dq8Var = this.f273613e;
        if (dq8Var == null || view != this.f273612d) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        dq8Var.setBounds(rect);
        dq8Var.m36633e(view, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f273617i;
        if ((drawable == null || !drawable.isStateful()) ? false : this.f273617i.setState(drawableState)) {
            invalidate();
            this.f273608L0.invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m93968e() {
        vk61 vk61Var = this.f273609a;
        View view = vk61Var != null ? vk61Var.f242155c : null;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent != null) {
                    ((ViewGroup) parent).removeView(view);
                }
                addView(view);
            }
            this.f273614f = view;
            TextView textView = this.f273610b;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.f273611c;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f273611c.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(android.R.id.text1);
            this.f273615g = textView2;
            if (textView2 != null) {
                this.f273618t = textView2.getMaxLines();
            }
            this.f273616h = (ImageView) view.findViewById(android.R.id.icon);
        } else {
            View view2 = this.f273614f;
            if (view2 != null) {
                removeView(view2);
                this.f273614f = null;
            }
            this.f273615g = null;
            this.f273616h = null;
        }
        boolean z = false;
        if (this.f273614f == null) {
            if (this.f273611c == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.f273611c = imageView2;
                addView(imageView2, 0);
            }
            if (this.f273610b == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.f273610b = textView3;
                addView(textView3);
                this.f273618t = this.f273610b.getMaxLines();
            }
            TextView textView4 = this.f273610b;
            TabLayout tabLayout = this.f273608L0;
            textView4.setTextAppearance(tabLayout.f2195h);
            ColorStateList colorStateList = tabLayout.f2197i;
            if (colorStateList != null) {
                this.f273610b.setTextColor(colorStateList);
            }
            m93970g(this.f273610b, this.f273611c);
            m93966c();
            ImageView imageView3 = this.f273611c;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new xk61(this, imageView3));
            }
            TextView textView5 = this.f273610b;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new xk61(this, textView5));
            }
        } else {
            TextView textView6 = this.f273615g;
            if (textView6 != null || this.f273616h != null) {
                m93970g(textView6, this.f273616h);
            }
        }
        if (vk61Var != null && !TextUtils.isEmpty(null)) {
            setContentDescription(null);
        }
        if (vk61Var != null) {
            TabLayout tabLayout2 = vk61Var.f242156d;
            if (tabLayout2 == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout2.getSelectedTabPosition();
            if (selectedTabPosition != -1 && selectedTabPosition == vk61Var.f242154b) {
                z = true;
            }
        }
        setSelected(z);
    }

    /* JADX INFO: renamed from: f */
    public final void m93969f(Context context) {
        int colorForState;
        TabLayout tabLayout = this.f273608L0;
        int i = tabLayout.f2171Q0;
        if (i != 0) {
            Drawable drawableM50639w = ihf1.m50639w(context, i);
            this.f273617i = drawableM50639w;
            if (drawableM50639w != null && drawableM50639w.isStateful()) {
                this.f273617i.setState(getDrawableState());
            }
        } else {
            this.f273617i = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        int colorForState2 = 0;
        gradientDrawable.setColor(0);
        Drawable rippleDrawable = gradientDrawable;
        if (tabLayout.f2166L0 != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList colorStateList = tabLayout.f2166L0;
            if (colorStateList != null) {
                colorForState = colorStateList.getColorForState(cyf1.f43266b, colorStateList.getDefaultColor());
            } else {
                colorForState = 0;
            }
            int iM61224l = m9f.m61224l(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
            int[][] iArr = {cyf1.f43267c, StateSet.NOTHING};
            if (colorStateList != null) {
                colorForState2 = colorStateList.getColorForState(cyf1.f43265a, colorStateList.getDefaultColor());
            }
            ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{iM61224l, m9f.m61224l(colorForState2, Math.min(Color.alpha(colorForState2) * 2, 255))});
            boolean z = tabLayout.f2190e1;
            GradientDrawable gradientDrawable3 = gradientDrawable;
            if (z) {
                gradientDrawable3 = null;
            }
            rippleDrawable = new RippleDrawable(colorStateList2, gradientDrawable3, z ? null : gradientDrawable2);
        }
        WeakHashMap weakHashMap = mec1.f142677a;
        setBackground(rippleDrawable);
        tabLayout.invalidate();
    }

    /* JADX INFO: renamed from: g */
    public final void m93970g(TextView textView, ImageView imageView) {
        vk61 vk61Var = this.f273609a;
        CharSequence charSequence = vk61Var != null ? vk61Var.f242153a : null;
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (zIsEmpty) {
                textView.setVisibility(8);
                textView.setText((CharSequence) null);
            } else {
                textView.setText(charSequence);
                this.f273609a.getClass();
                textView.setVisibility(0);
                setVisibility(0);
            }
        }
        if (imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int iM29100v = (zIsEmpty || imageView.getVisibility() != 0) ? 0 : (int) bga.m29100v(getContext(), 8);
            if (this.f273608L0.f2182a1) {
                if (iM29100v != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(iM29100v);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (iM29100v != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iM29100v;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        r3h1.m74673u(this, zIsEmpty ? null : charSequence);
    }

    public int getContentHeight() {
        View[] viewArr = {this.f273610b, this.f273611c, this.f273614f};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view.getTop()) : view.getTop();
                iMax = z ? Math.max(iMax, view.getBottom()) : view.getBottom();
                z = true;
            }
        }
        return iMax - iMin;
    }

    public int getContentWidth() {
        View[] viewArr = {this.f273610b, this.f273611c, this.f273614f};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                z = true;
            }
        }
        return iMax - iMin;
    }

    public vk61 getTab() {
        return this.f273609a;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        dq8 dq8Var = this.f273613e;
        if (dq8Var != null && dq8Var.isVisible()) {
            CharSequence contentDescription = getContentDescription();
            StringBuilder sb = new StringBuilder();
            sb.append((Object) contentDescription);
            sb.append(", ");
            dq8 dq8Var2 = this.f273613e;
            cq8 cq8Var = dq8Var2.f51890h;
            String quantityString = null;
            if (dq8Var2.isVisible()) {
                if (!dq8Var2.m36632d()) {
                    quantityString = cq8Var.f40788f;
                } else if (cq8Var.f40789g > 0 && (context = (Context) dq8Var2.f51883a.get()) != null) {
                    int iM36631c = dq8Var2.m36631c();
                    int i = dq8Var2.f51880X;
                    quantityString = iM36631c <= i ? context.getResources().getQuantityString(cq8Var.f40789g, dq8Var2.m36631c(), Integer.valueOf(dq8Var2.m36631c())) : context.getString(cq8Var.f40790h, Integer.valueOf(i));
                }
            }
            sb.append((Object) quantityString);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) c961.m31864c(isSelected(), 0, 1, this.f273609a.f242154b, 1).f35411b);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C2212of.f164591g.f164604a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.f273608L0;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(tabLayout.f2172R0, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f273610b != null) {
            float f = tabLayout.f2169O0;
            int i3 = this.f273618t;
            ImageView imageView = this.f273611c;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.f273610b;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.f2170P0;
                }
            } else {
                i3 = 1;
            }
            float textSize = this.f273610b.getTextSize();
            int lineCount = this.f273610b.getLineCount();
            int maxLines = this.f273610b.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                if (tabLayout.f2180Z0 == 1 && f > textSize && lineCount == 1) {
                    Layout layout = this.f273610b.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.f273610b.setTextSize(0, f);
                this.f273610b.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.f273609a == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        vk61 vk61Var = this.f273609a;
        TabLayout tabLayout = vk61Var.f242156d;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.m1635j(vk61Var, true);
        return true;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.f273610b;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.f273611c;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.f273614f;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(vk61 vk61Var) {
        if (vk61Var != this.f273609a) {
            this.f273609a = vk61Var;
            m93968e();
        }
    }
}
