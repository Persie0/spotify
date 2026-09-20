package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.R;
import java.util.WeakHashMap;
import p204p.b50;
import p204p.cpc1;
import p204p.edb;
import p204p.g50;
import p204p.h3u0;
import p204p.ihf1;
import p204p.lie0;
import p204p.mec1;
import p204p.ojp;
import p204p.whe0;
import p204p.y10;
import p204p.y40;
import p204p.zge0;
import p204p.zkc1;

/* JADX INFO: loaded from: classes3.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: L0 */
    public View f104L0;

    /* JADX INFO: renamed from: M0 */
    public View f105M0;

    /* JADX INFO: renamed from: N0 */
    public View f106N0;

    /* JADX INFO: renamed from: O0 */
    public LinearLayout f107O0;

    /* JADX INFO: renamed from: P0 */
    public TextView f108P0;

    /* JADX INFO: renamed from: Q0 */
    public TextView f109Q0;

    /* JADX INFO: renamed from: R0 */
    public final int f110R0;

    /* JADX INFO: renamed from: S0 */
    public final int f111S0;

    /* JADX INFO: renamed from: T0 */
    public boolean f112T0;

    /* JADX INFO: renamed from: U0 */
    public final int f113U0;

    /* JADX INFO: renamed from: a */
    public final ojp f114a;

    /* JADX INFO: renamed from: b */
    public final Context f115b;

    /* JADX INFO: renamed from: c */
    public ActionMenuView f116c;

    /* JADX INFO: renamed from: d */
    public b50 f117d;

    /* JADX INFO: renamed from: e */
    public int f118e;

    /* JADX INFO: renamed from: f */
    public zkc1 f119f;

    /* JADX INFO: renamed from: g */
    public boolean f120g;

    /* JADX INFO: renamed from: h */
    public boolean f121h;

    /* JADX INFO: renamed from: i */
    public CharSequence f122i;

    /* JADX INFO: renamed from: t */
    public CharSequence f123t;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: f */
    public static int m77f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    /* JADX INFO: renamed from: g */
    public static int m78g(int i, int i2, int i3, View view, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int iM38556e = edb.m38556e(i3, measuredHeight, 2, i2);
        if (z) {
            view.layout(i - measuredWidth, iM38556e, i, measuredHeight + iM38556e);
        } else {
            view.layout(i, iM38556e, i + measuredWidth, measuredHeight + iM38556e);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* JADX INFO: renamed from: c */
    public final void m79c(g50 g50Var) {
        View view = this.f104L0;
        int i = 0;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f113U0, (ViewGroup) this, false);
            this.f104L0 = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f104L0);
        }
        View viewFindViewById = this.f104L0.findViewById(R.id.action_mode_close_button);
        this.f105M0 = viewFindViewById;
        viewFindViewById.setOnClickListener(new y10(g50Var, i));
        zge0 zge0VarMo43568e = g50Var.mo43568e();
        b50 b50Var = this.f117d;
        if (b50Var != null) {
            b50Var.m28120j();
            y40 y40Var = b50Var.f23444R0;
            if (y40Var != null && y40Var.m93651b()) {
                ((whe0) y40Var.f272851i).dismiss();
            }
        }
        b50 b50Var2 = new b50(getContext());
        this.f117d = b50Var2;
        b50Var2.f23449Y = true;
        b50Var2.f23450Z = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        zge0VarMo43568e.m96063c(this.f117d, this.f115b);
        b50 b50Var3 = this.f117d;
        lie0 lie0Var = b50Var3.f23458h;
        if (lie0Var == null) {
            lie0 lie0Var2 = (lie0) b50Var3.f23454d.inflate(b50Var3.f23456f, (ViewGroup) this, false);
            b50Var3.f23458h = lie0Var2;
            lie0Var2.mo74b(b50Var3.f23453c);
            b50Var3.mo28115e();
        }
        lie0 lie0Var3 = b50Var3.f23458h;
        if (lie0Var != lie0Var3) {
            ((ActionMenuView) lie0Var3).setPresenter(b50Var3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) lie0Var3;
        this.f116c = actionMenuView;
        WeakHashMap weakHashMap = mec1.f142677a;
        actionMenuView.setBackground(null);
        addView(this.f116c, layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public final void m80d() {
        if (this.f107O0 == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f107O0 = linearLayout;
            this.f108P0 = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f109Q0 = (TextView) this.f107O0.findViewById(R.id.action_bar_subtitle);
            int i = this.f110R0;
            if (i != 0) {
                this.f108P0.setTextAppearance(getContext(), i);
            }
            int i2 = this.f111S0;
            if (i2 != 0) {
                this.f109Q0.setTextAppearance(getContext(), i2);
            }
        }
        this.f108P0.setText(this.f122i);
        this.f109Q0.setText(this.f123t);
        boolean zIsEmpty = TextUtils.isEmpty(this.f122i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f123t);
        this.f109Q0.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f107O0.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f107O0.getParent() == null) {
            addView(this.f107O0);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m81e() {
        removeAllViews();
        this.f106N0 = null;
        this.f116c = null;
        this.f117d = null;
        View view = this.f105M0;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f119f != null ? this.f114a.f166108b : getVisibility();
    }

    public int getContentHeight() {
        return this.f118e;
    }

    public CharSequence getSubtitle() {
        return this.f123t;
    }

    public CharSequence getTitle() {
        return this.f122i;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            zkc1 zkc1Var = this.f119f;
            if (zkc1Var != null) {
                zkc1Var.m96314c();
            }
            super.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: i */
    public final zkc1 m83i(int i, long j) {
        zkc1 zkc1Var = this.f119f;
        if (zkc1Var != null) {
            zkc1Var.m96314c();
        }
        ojp ojpVar = this.f114a;
        if (i != 0) {
            zkc1 zkc1VarM61551c = mec1.m61551c(this);
            zkc1VarM61551c.m96312a(0.0f);
            zkc1VarM61551c.m96315d(j);
            ((ActionBarContextView) ojpVar.f166109c).f119f = zkc1VarM61551c;
            ojpVar.f166108b = i;
            zkc1VarM61551c.m96317f(ojpVar);
            return zkc1VarM61551c;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        zkc1 zkc1VarM61551c2 = mec1.m61551c(this);
        zkc1VarM61551c2.m96312a(1.0f);
        zkc1VarM61551c2.m96315d(j);
        ((ActionBarContextView) ojpVar.f166109c).f119f = zkc1VarM61551c2;
        ojpVar.f166108b = i;
        zkc1VarM61551c2.m96317f(ojpVar);
        return zkc1VarM61551c2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, h3u0.f87321a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        b50 b50Var = this.f117d;
        if (b50Var != null) {
            Configuration configuration2 = b50Var.f23452b.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
                i = 5;
            } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
                i = 4;
            } else {
                i = i2 >= 360 ? 3 : 2;
            }
            b50Var.f23440N0 = i;
            zge0 zge0Var = b50Var.f23453c;
            if (zge0Var != null) {
                zge0Var.m96069q(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b50 b50Var = this.f117d;
        if (b50Var != null) {
            b50Var.m28120j();
            y40 y40Var = this.f117d.f23444R0;
            if (y40Var == null || !y40Var.m93651b()) {
                return;
            }
            ((whe0) y40Var.f272851i).dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f121h = false;
        }
        if (!this.f121h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f121h = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f121h = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zM33562a = cpc1.m33562a(this);
        int paddingRight = zM33562a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f104L0;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f104L0.getLayoutParams();
            int i5 = zM33562a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = zM33562a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = zM33562a ? paddingRight - i5 : paddingRight + i5;
            int iM78g = m78g(i7, paddingTop, paddingTop2, this.f104L0, zM33562a) + i7;
            paddingRight = zM33562a ? iM78g - i6 : iM78g + i6;
        }
        LinearLayout linearLayout = this.f107O0;
        if (linearLayout != null && this.f106N0 == null && linearLayout.getVisibility() != 8) {
            paddingRight += m78g(paddingRight, paddingTop, paddingTop2, this.f107O0, zM33562a);
        }
        View view2 = this.f106N0;
        if (view2 != null) {
            m78g(paddingRight, paddingTop, paddingTop2, view2, zM33562a);
        }
        int paddingLeft = zM33562a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f116c;
        if (actionMenuView != null) {
            m78g(paddingLeft, paddingTop, paddingTop2, actionMenuView, !zM33562a);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f118e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f104L0;
        if (view != null) {
            int iM77f = m77f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f104L0.getLayoutParams();
            paddingLeft = iM77f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f116c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m77f(this.f116c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f107O0;
        if (linearLayout != null && this.f106N0 == null) {
            if (this.f112T0) {
                this.f107O0.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f107O0.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f107O0.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = m77f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f106N0;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.f106N0.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f118e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f120g = false;
        }
        if (!this.f120g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f120g = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f120g = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.f118e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f106N0;
        if (view2 != null) {
            removeView(view2);
        }
        this.f106N0 = view;
        if (view != null && (linearLayout = this.f107O0) != null) {
            removeView(linearLayout);
            this.f107O0 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f123t = charSequence;
        m80d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f122i = charSequence;
        m80d();
        mec1.m61566r(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f112T0) {
            requestLayout();
        }
        this.f112T0 = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        Drawable drawable;
        int resourceId;
        super(context, attributeSet, i);
        ojp ojpVar = new ojp();
        ojpVar.f166109c = this;
        ojpVar.f166107a = false;
        this.f114a = ojpVar;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.f115b = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f115b = context;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h3u0.f87324d, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = ihf1.m50639w(context, resourceId);
        } else {
            drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        }
        WeakHashMap weakHashMap = mec1.f142677a;
        setBackground(drawable);
        this.f110R0 = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f111S0 = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f118e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f113U0 = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }
}
