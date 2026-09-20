package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p204p.b50;
import p204p.che0;
import p204p.cjs0;
import p204p.cpc1;
import p204p.cx21;
import p204p.gug1;
import p204p.h081;
import p204p.h3u0;
import p204p.i081;
import p204p.ihf1;
import p204p.ihk0;
import p204p.iie0;
import p204p.j081;
import p204p.k081;
import p204p.kq11;
import p204p.l081;
import p204p.lhe0;
import p204p.li80;
import p204p.m081;
import p204p.mec1;
import p204p.mro;
import p204p.n281;
import p204p.r3h1;
import p204p.r561;
import p204p.rg41;
import p204p.ttx0;
import p204p.utu0;
import p204p.xqg1;
import p204p.zg11;
import p204p.zge0;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements che0 {

    /* JADX INFO: renamed from: L0 */
    public int f307L0;

    /* JADX INFO: renamed from: M0 */
    public int f308M0;

    /* JADX INFO: renamed from: N0 */
    public int f309N0;

    /* JADX INFO: renamed from: O0 */
    public final int f310O0;

    /* JADX INFO: renamed from: P0 */
    public final int f311P0;

    /* JADX INFO: renamed from: Q0 */
    public int f312Q0;

    /* JADX INFO: renamed from: R0 */
    public int f313R0;

    /* JADX INFO: renamed from: S0 */
    public int f314S0;

    /* JADX INFO: renamed from: T0 */
    public int f315T0;

    /* JADX INFO: renamed from: U0 */
    public ttx0 f316U0;

    /* JADX INFO: renamed from: V0 */
    public int f317V0;

    /* JADX INFO: renamed from: W0 */
    public int f318W0;

    /* JADX INFO: renamed from: X0 */
    public final int f319X0;

    /* JADX INFO: renamed from: Y0 */
    public CharSequence f320Y0;

    /* JADX INFO: renamed from: Z0 */
    public CharSequence f321Z0;

    /* JADX INFO: renamed from: a */
    public ActionMenuView f322a;

    /* JADX INFO: renamed from: a1 */
    public ColorStateList f323a1;

    /* JADX INFO: renamed from: b */
    public AppCompatTextView f324b;

    /* JADX INFO: renamed from: b1 */
    public ColorStateList f325b1;

    /* JADX INFO: renamed from: c */
    public AppCompatTextView f326c;

    /* JADX INFO: renamed from: c1 */
    public boolean f327c1;

    /* JADX INFO: renamed from: d */
    public AppCompatImageButton f328d;

    /* JADX INFO: renamed from: d1 */
    public boolean f329d1;

    /* JADX INFO: renamed from: e */
    public AppCompatImageView f330e;

    /* JADX INFO: renamed from: e1 */
    public final ArrayList f331e1;

    /* JADX INFO: renamed from: f */
    public final Drawable f332f;

    /* JADX INFO: renamed from: f1 */
    public final ArrayList f333f1;

    /* JADX INFO: renamed from: g */
    public final CharSequence f334g;

    /* JADX INFO: renamed from: g1 */
    public final int[] f335g1;

    /* JADX INFO: renamed from: h */
    public AppCompatImageButton f336h;

    /* JADX INFO: renamed from: h1 */
    public final li80 f337h1;

    /* JADX INFO: renamed from: i */
    public View f338i;

    /* JADX INFO: renamed from: i1 */
    public ArrayList f339i1;

    /* JADX INFO: renamed from: j1 */
    public l081 f340j1;

    /* JADX INFO: renamed from: k1 */
    public final rg41 f341k1;

    /* JADX INFO: renamed from: l1 */
    public n281 f342l1;

    /* JADX INFO: renamed from: m1 */
    public b50 f343m1;

    /* JADX INFO: renamed from: n1 */
    public j081 f344n1;

    /* JADX INFO: renamed from: o1 */
    public ihk0 f345o1;

    /* JADX INFO: renamed from: p1 */
    public kq11 f346p1;

    /* JADX INFO: renamed from: q1 */
    public boolean f347q1;

    /* JADX INFO: renamed from: r1 */
    public OnBackInvokedCallback f348r1;

    /* JADX INFO: renamed from: s1 */
    public OnBackInvokedDispatcher f349s1;

    /* JADX INFO: renamed from: t */
    public Context f350t;

    /* JADX INFO: renamed from: t1 */
    public boolean f351t1;

    /* JADX INFO: renamed from: u1 */
    public final cjs0 f352u1;

    public Toolbar(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: g */
    public static k081 m153g(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof k081;
        if (z) {
            return new k081((k081) layoutParams);
        }
        if (z) {
            return new k081((k081) layoutParams, 0);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new k081((ViewGroup.MarginLayoutParams) layoutParams) : new k081(layoutParams);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new r561(getContext());
    }

    /* JADX INFO: renamed from: i */
    public static int m154i(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return xqg1.m91847E(marginLayoutParams) + xqg1.m91848F(marginLayoutParams);
    }

    /* JADX INFO: renamed from: j */
    public static int m155j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // p204p.che0
    /* JADX INFO: renamed from: K */
    public final void mo156K(iie0 iie0Var) {
        this.f337h1.m59037b(iie0Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m157a(int i, ArrayList arrayList) {
        WeakHashMap weakHashMap = mec1.f142677a;
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int iM45782x = gug1.m45782x(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                k081 k081Var = (k081) childAt.getLayoutParams();
                if (k081Var.f117933b == 0 && m172s(childAt)) {
                    int i3 = k081Var.f117932a;
                    WeakHashMap weakHashMap2 = mec1.f142677a;
                    int layoutDirection = getLayoutDirection();
                    int iM45782x2 = gug1.m45782x(i3, layoutDirection) & 7;
                    if (iM45782x2 != 1 && iM45782x2 != 3 && iM45782x2 != 5) {
                        iM45782x2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (iM45782x2 == iM45782x) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            k081 k081Var2 = (k081) childAt2.getLayoutParams();
            if (k081Var2.f117933b == 0 && m172s(childAt2)) {
                int i5 = k081Var2.f117932a;
                WeakHashMap weakHashMap3 = mec1.f142677a;
                int layoutDirection2 = getLayoutDirection();
                int iM45782x3 = gug1.m45782x(i5, layoutDirection2) & 7;
                if (iM45782x3 != 1 && iM45782x3 != 3 && iM45782x3 != 5) {
                    iM45782x3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (iM45782x3 == iM45782x) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m158b(View view, boolean z) {
        k081 k081VarM153g;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            k081VarM153g = new k081();
        } else {
            k081VarM153g = !checkLayoutParams(layoutParams) ? m153g(layoutParams) : (k081) layoutParams;
        }
        k081VarM153g.f117933b = 1;
        if (!z || this.f338i == null) {
            addView(view, k081VarM153g);
        } else {
            view.setLayoutParams(k081VarM153g);
            this.f333f1.add(view);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m159c() {
        if (this.f336h == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f336h = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f332f);
            this.f336h.setContentDescription(this.f334g);
            k081 k081Var = new k081();
            k081Var.f117932a = (this.f310O0 & ContentType.LONG_FORM_ON_DEMAND) | 8388611;
            k081Var.f117933b = 2;
            this.f336h.setLayoutParams(k081Var);
            this.f336h.setOnClickListener(new zg11(this, 10));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof k081);
    }

    /* JADX INFO: renamed from: d */
    public final void m160d() {
        m161e();
        if (this.f322a.m111o() == null) {
            zge0 zge0Var = (zge0) this.f322a.getMenu();
            if (this.f344n1 == null) {
                this.f344n1 = new j081(this);
            }
            this.f322a.setExpandedActionViewsExclusive(true);
            zge0Var.m96063c(this.f344n1, this.f350t);
            m174u();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m161e() {
        if (this.f322a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f322a = actionMenuView;
            actionMenuView.setPopupTheme(this.f307L0);
            this.f322a.setOnMenuItemClickListener(this.f341k1);
            this.f322a.m112p(this.f345o1, new utu0(this));
            k081 k081Var = new k081();
            k081Var.f117932a = (this.f310O0 & ContentType.LONG_FORM_ON_DEMAND) | 8388613;
            this.f322a.setLayoutParams(k081Var);
            m158b(this.f322a, false);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m162f() {
        if (this.f328d == null) {
            this.f328d = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            k081 k081Var = new k081();
            k081Var.f117932a = (this.f310O0 & ContentType.LONG_FORM_ON_DEMAND) | 8388611;
            this.f328d.setLayoutParams(k081Var);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new k081();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m153g(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f336h;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.f336h;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        ttx0 ttx0Var = this.f316U0;
        if (ttx0Var != null) {
            return ttx0Var.m81537a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f318W0;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        ttx0 ttx0Var = this.f316U0;
        if (ttx0Var != null) {
            return ttx0Var.m81538b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        ttx0 ttx0Var = this.f316U0;
        if (ttx0Var != null) {
            return ttx0Var.m81539c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        ttx0 ttx0Var = this.f316U0;
        if (ttx0Var != null) {
            return ttx0Var.m81540d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f317V0;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        zge0 zge0VarM111o;
        ActionMenuView actionMenuView = this.f322a;
        return (actionMenuView == null || (zge0VarM111o = actionMenuView.m111o()) == null || !zge0VarM111o.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f318W0, 0));
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = mec1.f142677a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = mec1.f142677a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f317V0, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f330e;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f330e;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m160d();
        return this.f322a.getMenu();
    }

    public View getNavButtonView() {
        return this.f328d;
    }

    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f328d;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.f328d;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public b50 getOuterActionMenuPresenter() {
        return this.f343m1;
    }

    public Drawable getOverflowIcon() {
        m160d();
        return this.f322a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f350t;
    }

    public int getPopupTheme() {
        return this.f307L0;
    }

    public CharSequence getSubtitle() {
        return this.f321Z0;
    }

    public final TextView getSubtitleTextView() {
        return this.f326c;
    }

    public CharSequence getTitle() {
        return this.f320Y0;
    }

    public int getTitleMarginBottom() {
        return this.f315T0;
    }

    public int getTitleMarginEnd() {
        return this.f313R0;
    }

    public int getTitleMarginStart() {
        return this.f312Q0;
    }

    public int getTitleMarginTop() {
        return this.f314S0;
    }

    public final TextView getTitleTextView() {
        return this.f324b;
    }

    public mro getWrapper() {
        if (this.f342l1 == null) {
            this.f342l1 = new n281(this, true);
        }
        return this.f342l1;
    }

    /* JADX INFO: renamed from: h */
    public final int m163h(View view, int i) {
        k081 k081Var = (k081) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = k081Var.f117932a & ContentType.LONG_FORM_ON_DEMAND;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f319X0 & ContentType.LONG_FORM_ON_DEMAND;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) k081Var).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) k081Var).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) k081Var).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    /* JADX INFO: renamed from: k */
    public final void m164k() {
        Iterator it = this.f339i1.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f337h1.m59045v(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f339i1 = currentMenuItems2;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m165l(View view) {
        return view.getParent() == this || this.f333f1.contains(view);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m166m() {
        ActionMenuView actionMenuView = this.f322a;
        return actionMenuView != null && actionMenuView.m110n();
    }

    /* JADX INFO: renamed from: n */
    public final int m167n(View view, int i, int i2, int[] iArr) {
        k081 k081Var = (k081) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) k081Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iM163h = m163h(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM163h, iMax + measuredWidth, view.getMeasuredHeight() + iM163h);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) k081Var).rightMargin + iMax;
    }

    /* JADX INFO: renamed from: o */
    public final int m168o(View view, int i, int i2, int[] iArr) {
        k081 k081Var = (k081) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) k081Var).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM163h = m163h(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM163h, iMax, view.getMeasuredHeight() + iM163h);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) k081Var).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m174u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f352u1);
        m174u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f329d1 = false;
        }
        if (!this.f329d1) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f329d1 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f329d1 = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027d  */
    /* JADX WARN: Code duplicated, block: B:103:0x028f A[LOOP:0: B:102:0x028d->B:103:0x028f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x02a7 A[LOOP:1: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x02c7 A[LOOP:2: B:108:0x02c5->B:109:0x02c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x030d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x030f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0313  */
    /* JADX WARN: Code duplicated, block: B:118:0x031a A[LOOP:3: B:117:0x0318->B:118:0x031a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:48:0x012a  */
    /* JADX WARN: Code duplicated, block: B:50:0x012e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0131  */
    /* JADX WARN: Code duplicated, block: B:54:0x0143  */
    /* JADX WARN: Code duplicated, block: B:56:0x014b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x0164  */
    /* JADX WARN: Code duplicated, block: B:65:0x0168  */
    /* JADX WARN: Code duplicated, block: B:67:0x0179  */
    /* JADX WARN: Code duplicated, block: B:68:0x017b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0187  */
    /* JADX WARN: Code duplicated, block: B:72:0x0193  */
    /* JADX WARN: Code duplicated, block: B:73:0x019d  */
    /* JADX WARN: Code duplicated, block: B:75:0x01aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x020d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0210  */
    /* JADX WARN: Code duplicated, block: B:88:0x0218 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x021a  */
    /* JADX WARN: Code duplicated, block: B:91:0x021e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0232  */
    /* JADX WARN: Code duplicated, block: B:95:0x0255  */
    /* JADX WARN: Code duplicated, block: B:97:0x0258  */
    /* JADX WARN: Code duplicated, block: B:98:0x027a  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM167n;
        int iM168o;
        int iMax;
        int iMin;
        boolean zM172s;
        boolean zM172s2;
        int measuredHeight;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        k081 k081Var;
        k081 k081Var2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iMax2;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList;
        int size;
        int iM167n2;
        int i18;
        int size2;
        int i19;
        int i20;
        int size3;
        int i21;
        int i22;
        int measuredWidth;
        int i23;
        int i24;
        int i25;
        int size4;
        WeakHashMap weakHashMap = mec1.f142677a;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.f335g1;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (m172s(this.f328d)) {
            if (z3) {
                iM168o = m168o(this.f328d, i26, iMin2, iArr);
                iM167n = paddingLeft;
            } else {
                iM167n = m167n(this.f328d, paddingLeft, iMin2, iArr);
            }
            if (m172s(this.f336h)) {
                if (z3) {
                    iM168o = m168o(this.f336h, iM168o, iMin2, iArr);
                } else {
                    iM167n = m167n(this.f336h, iM167n, iMin2, iArr);
                }
            }
            if (m172s(this.f322a)) {
                if (z3) {
                    iM167n = m167n(this.f322a, iM167n, iMin2, iArr);
                } else {
                    iM168o = m168o(this.f322a, iM168o, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iM167n);
            iArr[1] = Math.max(0, currentContentInsetRight - (i26 - iM168o));
            iMax = Math.max(iM167n, currentContentInsetLeft);
            iMin = Math.min(iM168o, i26 - currentContentInsetRight);
            if (m172s(this.f338i)) {
                if (z3) {
                    iMin = m168o(this.f338i, iMin, iMin2, iArr);
                } else {
                    iMax = m167n(this.f338i, iMax, iMin2, iArr);
                }
            }
            if (m172s(this.f330e)) {
                if (z3) {
                    iMin = m168o(this.f330e, iMin, iMin2, iArr);
                } else {
                    iMax = m167n(this.f330e, iMax, iMin2, iArr);
                }
            }
            zM172s = m172s(this.f324b);
            zM172s2 = m172s(this.f326c);
            if (zM172s) {
                k081 k081Var3 = (k081) this.f324b.getLayoutParams();
                measuredHeight = this.f324b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) k081Var3).topMargin + ((ViewGroup.MarginLayoutParams) k081Var3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zM172s2) {
                k081 k081Var4 = (k081) this.f326c.getLayoutParams();
                measuredHeight = this.f326c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) k081Var4).topMargin + ((ViewGroup.MarginLayoutParams) k081Var4).bottomMargin + measuredHeight;
            }
            if (zM172s || zM172s2) {
                if (zM172s) {
                    appCompatTextView = this.f324b;
                } else {
                    appCompatTextView = this.f326c;
                }
                if (zM172s2) {
                    appCompatTextView2 = this.f326c;
                } else {
                    appCompatTextView2 = this.f324b;
                }
                k081Var = (k081) appCompatTextView.getLayoutParams();
                k081Var2 = (k081) appCompatTextView2.getLayoutParams();
                i5 = measuredHeight;
                z2 = (!zM172s && this.f324b.getMeasuredWidth() > 0) || (zM172s2 && this.f326c.getMeasuredWidth() > 0);
                i6 = this.f319X0 & ContentType.LONG_FORM_ON_DEMAND;
                i7 = iMax;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) k081Var).topMargin + this.f314S0;
                } else if (i6 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                    i14 = ((ViewGroup.MarginLayoutParams) k081Var).topMargin + this.f314S0;
                    if (iMax2 < i14) {
                        iMax2 = i14;
                    } else {
                        i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                        i16 = ((ViewGroup.MarginLayoutParams) k081Var).bottomMargin;
                        i17 = this.f315T0;
                        if (i15 < i16 + i17) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) k081Var2).bottomMargin + i17) - i15));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) k081Var2).bottomMargin) - this.f315T0) - i5;
                }
                if (z3) {
                    if (z2) {
                        i11 = this.f312Q0;
                    } else {
                        i11 = 0;
                    }
                    int i27 = i11 - iArr[1];
                    iMin -= Math.max(0, i27);
                    iArr[1] = Math.max(0, -i27);
                    if (zM172s) {
                        k081 k081Var5 = (k081) this.f324b.getLayoutParams();
                        int measuredWidth2 = iMin - this.f324b.getMeasuredWidth();
                        int measuredHeight2 = this.f324b.getMeasuredHeight() + paddingTop;
                        this.f324b.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i12 = measuredWidth2 - this.f313R0;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) k081Var5).bottomMargin;
                    } else {
                        i12 = iMin;
                    }
                    if (zM172s2) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((k081) this.f326c.getLayoutParams())).topMargin;
                        this.f326c.layout(iMin - this.f326c.getMeasuredWidth(), i28, iMin, this.f326c.getMeasuredHeight() + i28);
                        i13 = iMin - this.f313R0;
                    } else {
                        i13 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i12, i13);
                    }
                    iMax = i7;
                } else {
                    if (z2) {
                        i8 = this.f312Q0;
                    } else {
                        i8 = 0;
                    }
                    int i29 = i8 - iArr[0];
                    iMax = Math.max(0, i29) + i7;
                    iArr[0] = Math.max(0, -i29);
                    if (zM172s) {
                        k081 k081Var6 = (k081) this.f324b.getLayoutParams();
                        int measuredWidth3 = this.f324b.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f324b.getMeasuredHeight() + paddingTop;
                        this.f324b.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i9 = measuredWidth3 + this.f313R0;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) k081Var6).bottomMargin;
                    } else {
                        i9 = iMax;
                    }
                    if (zM172s2) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((k081) this.f326c.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f326c.getMeasuredWidth() + iMax;
                        this.f326c.layout(iMax, i30, measuredWidth4, this.f326c.getMeasuredHeight() + i30);
                        i10 = measuredWidth4 + this.f313R0;
                    } else {
                        i10 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i9, i10);
                    }
                }
            }
            arrayList = this.f331e1;
            m157a(3, arrayList);
            size = arrayList.size();
            iM167n2 = iMax;
            for (i18 = 0; i18 < size; i18++) {
                iM167n2 = m167n((View) arrayList.get(i18), iM167n2, iMin2, iArr);
            }
            m157a(5, arrayList);
            size2 = arrayList.size();
            for (i19 = 0; i19 < size2; i19++) {
                iMin = m168o((View) arrayList.get(i19), iMin, iMin2, iArr);
            }
            m157a(1, arrayList);
            int i31 = iArr[0];
            i20 = iArr[1];
            size3 = arrayList.size();
            i21 = i31;
            i22 = 0;
            measuredWidth = 0;
            while (i22 < size3) {
                View view = (View) arrayList.get(i22);
                k081 k081Var7 = (k081) view.getLayoutParams();
                int i32 = i20;
                int i33 = ((ViewGroup.MarginLayoutParams) k081Var7).leftMargin - i21;
                int i34 = ((ViewGroup.MarginLayoutParams) k081Var7).rightMargin - i32;
                int iMax3 = Math.max(0, i33);
                int iMax4 = Math.max(0, i34);
                int iMax5 = Math.max(0, -i33);
                int iMax6 = Math.max(0, -i34);
                measuredWidth += view.getMeasuredWidth() + iMax3 + iMax4;
                i22++;
                i21 = iMax5;
                i20 = iMax6;
            }
            i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i25 = measuredWidth + i24;
            if (i24 >= iM167n2) {
                if (i25 > iMin) {
                    iM167n2 = i24 - (i25 - iMin);
                } else {
                    iM167n2 = i24;
                }
            }
            size4 = arrayList.size();
            for (i23 = 0; i23 < size4; i23++) {
                iM167n2 = m167n((View) arrayList.get(i23), iM167n2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iM167n = paddingLeft;
        iM168o = i26;
        if (m172s(this.f336h)) {
            if (z3) {
                iM168o = m168o(this.f336h, iM168o, iMin2, iArr);
            } else {
                iM167n = m167n(this.f336h, iM167n, iMin2, iArr);
            }
        }
        if (m172s(this.f322a)) {
            if (z3) {
                iM167n = m167n(this.f322a, iM167n, iMin2, iArr);
            } else {
                iM168o = m168o(this.f322a, iM168o, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM167n);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - iM168o));
        iMax = Math.max(iM167n, currentContentInsetLeft2);
        iMin = Math.min(iM168o, i26 - currentContentInsetRight2);
        if (m172s(this.f338i)) {
            if (z3) {
                iMin = m168o(this.f338i, iMin, iMin2, iArr);
            } else {
                iMax = m167n(this.f338i, iMax, iMin2, iArr);
            }
        }
        if (m172s(this.f330e)) {
            if (z3) {
                iMin = m168o(this.f330e, iMin, iMin2, iArr);
            } else {
                iMax = m167n(this.f330e, iMax, iMin2, iArr);
            }
        }
        zM172s = m172s(this.f324b);
        zM172s2 = m172s(this.f326c);
        if (zM172s) {
            k081 k081Var8 = (k081) this.f324b.getLayoutParams();
            measuredHeight = this.f324b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) k081Var8).topMargin + ((ViewGroup.MarginLayoutParams) k081Var8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zM172s2) {
            k081 k081Var9 = (k081) this.f326c.getLayoutParams();
            measuredHeight = this.f326c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) k081Var9).topMargin + ((ViewGroup.MarginLayoutParams) k081Var9).bottomMargin + measuredHeight;
        }
        if (zM172s) {
            if (zM172s) {
                appCompatTextView = this.f324b;
            } else {
                appCompatTextView = this.f326c;
            }
            if (zM172s2) {
                appCompatTextView2 = this.f326c;
            } else {
                appCompatTextView2 = this.f324b;
            }
            k081Var = (k081) appCompatTextView.getLayoutParams();
            k081Var2 = (k081) appCompatTextView2.getLayoutParams();
            i5 = measuredHeight;
            if (zM172s) {
            }
            i6 = this.f319X0 & ContentType.LONG_FORM_ON_DEMAND;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) k081Var).topMargin + this.f314S0;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) k081Var).topMargin + this.f314S0;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) k081Var).bottomMargin;
                    i17 = this.f315T0;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) k081Var2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) k081Var2).bottomMargin) - this.f315T0) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.f312Q0;
                } else {
                    i11 = 0;
                }
                int i210 = i11 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zM172s) {
                    k081 k081Var10 = (k081) this.f324b.getLayoutParams();
                    int measuredWidth5 = iMin - this.f324b.getMeasuredWidth();
                    int measuredHeight4 = this.f324b.getMeasuredHeight() + paddingTop;
                    this.f324b.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i12 = measuredWidth5 - this.f313R0;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) k081Var10).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zM172s2) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((k081) this.f326c.getLayoutParams())).topMargin;
                    this.f326c.layout(iMin - this.f326c.getMeasuredWidth(), i211, iMin, this.f326c.getMeasuredHeight() + i211);
                    i13 = iMin - this.f313R0;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.f312Q0;
                } else {
                    i8 = 0;
                }
                int i212 = i8 - iArr[0];
                iMax = Math.max(0, i212) + i7;
                iArr[0] = Math.max(0, -i212);
                if (zM172s) {
                    k081 k081Var11 = (k081) this.f324b.getLayoutParams();
                    int measuredWidth6 = this.f324b.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f324b.getMeasuredHeight() + paddingTop;
                    this.f324b.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i9 = measuredWidth6 + this.f313R0;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) k081Var11).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zM172s2) {
                    int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((k081) this.f326c.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f326c.getMeasuredWidth() + iMax;
                    this.f326c.layout(iMax, i35, measuredWidth7, this.f326c.getMeasuredHeight() + i35);
                    i10 = measuredWidth7 + this.f313R0;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        } else {
            if (zM172s) {
                appCompatTextView = this.f324b;
            } else {
                appCompatTextView = this.f326c;
            }
            if (zM172s2) {
                appCompatTextView2 = this.f326c;
            } else {
                appCompatTextView2 = this.f324b;
            }
            k081Var = (k081) appCompatTextView.getLayoutParams();
            k081Var2 = (k081) appCompatTextView2.getLayoutParams();
            i5 = measuredHeight;
            if (zM172s) {
            }
            i6 = this.f319X0 & ContentType.LONG_FORM_ON_DEMAND;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) k081Var).topMargin + this.f314S0;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) k081Var).topMargin + this.f314S0;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) k081Var).bottomMargin;
                    i17 = this.f315T0;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) k081Var2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) k081Var2).bottomMargin) - this.f315T0) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.f312Q0;
                } else {
                    i11 = 0;
                }
                int i213 = i11 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zM172s) {
                    k081 k081Var12 = (k081) this.f324b.getLayoutParams();
                    int measuredWidth8 = iMin - this.f324b.getMeasuredWidth();
                    int measuredHeight6 = this.f324b.getMeasuredHeight() + paddingTop;
                    this.f324b.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i12 = measuredWidth8 - this.f313R0;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) k081Var12).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zM172s2) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((k081) this.f326c.getLayoutParams())).topMargin;
                    this.f326c.layout(iMin - this.f326c.getMeasuredWidth(), i214, iMin, this.f326c.getMeasuredHeight() + i214);
                    i13 = iMin - this.f313R0;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.f312Q0;
                } else {
                    i8 = 0;
                }
                int i215 = i8 - iArr[0];
                iMax = Math.max(0, i215) + i7;
                iArr[0] = Math.max(0, -i215);
                if (zM172s) {
                    k081 k081Var13 = (k081) this.f324b.getLayoutParams();
                    int measuredWidth9 = this.f324b.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f324b.getMeasuredHeight() + paddingTop;
                    this.f324b.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i9 = measuredWidth9 + this.f313R0;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) k081Var13).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zM172s2) {
                    int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((k081) this.f326c.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f326c.getMeasuredWidth() + iMax;
                    this.f326c.layout(iMax, i36, measuredWidth10, this.f326c.getMeasuredHeight() + i36);
                    i10 = measuredWidth10 + this.f313R0;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        }
        arrayList = this.f331e1;
        m157a(3, arrayList);
        size = arrayList.size();
        iM167n2 = iMax;
        while (i18 < size) {
            iM167n2 = m167n((View) arrayList.get(i18), iM167n2, iMin2, iArr);
        }
        m157a(5, arrayList);
        size2 = arrayList.size();
        while (i19 < size2) {
            iMin = m168o((View) arrayList.get(i19), iMin, iMin2, iArr);
        }
        m157a(1, arrayList);
        int i37 = iArr[0];
        i20 = iArr[1];
        size3 = arrayList.size();
        i21 = i37;
        i22 = 0;
        measuredWidth = 0;
        while (i22 < size3) {
            View view2 = (View) arrayList.get(i22);
            k081 k081Var14 = (k081) view2.getLayoutParams();
            int i38 = i20;
            int i39 = ((ViewGroup.MarginLayoutParams) k081Var14).leftMargin - i21;
            int i310 = ((ViewGroup.MarginLayoutParams) k081Var14).rightMargin - i38;
            int iMax7 = Math.max(0, i39);
            int iMax8 = Math.max(0, i310);
            int iMax9 = Math.max(0, -i39);
            int iMax10 = Math.max(0, -i310);
            measuredWidth += view2.getMeasuredWidth() + iMax7 + iMax8;
            i22++;
            i21 = iMax9;
            i20 = iMax10;
        }
        i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i25 = measuredWidth + i24;
        if (i24 >= iM167n2) {
            if (i25 > iMin) {
                iM167n2 = i24 - (i25 - iMin);
            } else {
                iM167n2 = i24;
            }
        }
        size4 = arrayList.size();
        while (i23 < size4) {
            iM167n2 = m167n((View) arrayList.get(i23), iM167n2, iMin2, iArr);
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iM154i;
        int iMax;
        int iCombineMeasuredStates;
        int iM154i2;
        int iM155j;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean zM33562a = cpc1.m33562a(this);
        int i3 = !zM33562a ? 1 : 0;
        int i4 = 0;
        if (m172s(this.f328d)) {
            m170q(this.f328d, i, 0, i2, this.f311P0);
            iM154i = m154i(this.f328d) + this.f328d.getMeasuredWidth();
            iMax = Math.max(0, m155j(this.f328d) + this.f328d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f328d.getMeasuredState());
        } else {
            iM154i = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m172s(this.f336h)) {
            m170q(this.f336h, i, 0, i2, this.f311P0);
            iM154i = m154i(this.f336h) + this.f336h.getMeasuredWidth();
            iMax = Math.max(iMax, m155j(this.f336h) + this.f336h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f336h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM154i);
        int iMax4 = Math.max(0, currentContentInsetStart - iM154i);
        int[] iArr = this.f335g1;
        iArr[zM33562a ? 1 : 0] = iMax4;
        if (m172s(this.f322a)) {
            m170q(this.f322a, i, iMax3, i2, this.f311P0);
            iM154i2 = m154i(this.f322a) + this.f322a.getMeasuredWidth();
            iMax = Math.max(iMax, m155j(this.f322a) + this.f322a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f322a.getMeasuredState());
        } else {
            iM154i2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iM154i2);
        iArr[i3] = Math.max(0, currentContentInsetEnd - iM154i2);
        if (m172s(this.f338i)) {
            iMax5 += m169p(this.f338i, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m155j(this.f338i) + this.f338i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f338i.getMeasuredState());
        }
        if (m172s(this.f330e)) {
            iMax5 += m169p(this.f330e, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m155j(this.f330e) + this.f330e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f330e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (((k081) childAt.getLayoutParams()).f117933b == 0 && m172s(childAt)) {
                iMax5 += m169p(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, m155j(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i6 = iMax5;
        int i7 = this.f314S0 + this.f315T0;
        int i8 = this.f312Q0 + this.f313R0;
        if (m172s(this.f324b)) {
            m169p(this.f324b, i, i6 + i8, i2, i7, iArr);
            int iM154i3 = m154i(this.f324b) + this.f324b.getMeasuredWidth();
            iM155j = m155j(this.f324b) + this.f324b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f324b.getMeasuredState());
            iMax2 = iM154i3;
        } else {
            iM155j = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (m172s(this.f326c)) {
            iMax2 = Math.max(iMax2, m169p(this.f326c, i, i6 + i8, i2, i7 + iM155j, iArr));
            iM155j += m155j(this.f326c) + this.f326c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f326c.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iM155j);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i6 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.f347q1) {
            i4 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i9 = 0; i9 < childCount2; i9++) {
            View childAt2 = getChildAt(i9);
            if (m172s(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i4 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i4);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof m081)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m081 m081Var = (m081) parcelable;
        super.onRestoreInstanceState(m081Var.m66261c());
        ActionMenuView actionMenuView = this.f322a;
        zge0 zge0VarM111o = actionMenuView != null ? actionMenuView.m111o() : null;
        int i = m081Var.f138563c;
        if (i != 0 && this.f344n1 != null && zge0VarM111o != null && (menuItemFindItem = zge0VarM111o.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (m081Var.f138564d) {
            cjs0 cjs0Var = this.f352u1;
            removeCallbacks(cjs0Var);
            post(cjs0Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f316U0 == null) {
            this.f316U0 = new ttx0();
        }
        this.f316U0.m81542f(i == 1);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        lhe0 lhe0Var;
        m081 m081Var = new m081(super.onSaveInstanceState());
        j081 j081Var = this.f344n1;
        if (j081Var != null && (lhe0Var = j081Var.f107383b) != null) {
            m081Var.f138563c = lhe0Var.getItemId();
        }
        m081Var.f138564d = m166m();
        return m081Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f327c1 = false;
        }
        if (!this.f327c1) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f327c1 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f327c1 = false;
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final int m169p(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* JADX INFO: renamed from: q */
    public final void m170q(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    @Override // p204p.che0
    /* JADX INFO: renamed from: r */
    public final void mo171r(iie0 iie0Var) {
        this.f337h1.m59036B(iie0Var);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m172s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.f351t1 != z) {
            this.f351t1 = z;
            m174u();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(ihf1.m50639w(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.f347q1 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f318W0) {
            this.f318W0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f317V0) {
            this.f317V0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(ihf1.m50639w(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(ihf1.m50639w(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m162f();
        this.f328d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(l081 l081Var) {
        this.f340j1 = l081Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        m160d();
        this.f322a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f307L0 != i) {
            this.f307L0 = i;
            if (i == 0) {
                this.f350t = getContext();
            } else {
                this.f350t = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f315T0 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f313R0 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f312Q0 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f314S0 = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* JADX INFO: renamed from: t */
    public final boolean m173t() {
        ActionMenuView actionMenuView = this.f322a;
        return actionMenuView != null && actionMenuView.m113q();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    /* JADX INFO: renamed from: u */
    public final void m174u() {
        boolean z;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM49310a = i081.m49310a(this);
            j081 j081Var = this.f344n1;
            int i = 0;
            if (j081Var == null || j081Var.f107383b == null || onBackInvokedDispatcherM49310a == null) {
                z = false;
            } else {
                WeakHashMap weakHashMap = mec1.f142677a;
                if (isAttachedToWindow() && this.f351t1) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z && this.f349s1 == null) {
                if (this.f348r1 == null) {
                    this.f348r1 = i081.m49311b(new h081(this, i));
                }
                i081.m49312c(onBackInvokedDispatcherM49310a, this.f348r1);
                this.f349s1 = onBackInvokedDispatcherM49310a;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.f349s1) == null) {
                return;
            }
            i081.m49313d(onBackInvokedDispatcher, this.f348r1);
            this.f349s1 = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new k081(getContext(), attributeSet);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m159c();
        }
        AppCompatImageButton appCompatImageButton = this.f336h;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m159c();
            this.f336h.setImageDrawable(drawable);
        } else {
            AppCompatImageButton appCompatImageButton = this.f336h;
            if (appCompatImageButton != null) {
                appCompatImageButton.setImageDrawable(this.f332f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f330e == null) {
                this.f330e = new AppCompatImageView(getContext());
            }
            if (!m165l(this.f330e)) {
                m158b(this.f330e, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f330e;
            if (appCompatImageView != null && m165l(appCompatImageView)) {
                removeView(this.f330e);
                this.f333f1.remove(this.f330e);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f330e;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f330e == null) {
            this.f330e = new AppCompatImageView(getContext());
        }
        AppCompatImageView appCompatImageView = this.f330e;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m162f();
        }
        AppCompatImageButton appCompatImageButton = this.f328d;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            r3h1.m74673u(this.f328d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m162f();
            if (!m165l(this.f328d)) {
                m158b(this.f328d, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.f328d;
            if (appCompatImageButton != null && m165l(appCompatImageButton)) {
                removeView(this.f328d);
                this.f333f1.remove(this.f328d);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.f328d;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f326c;
            if (appCompatTextView != null && m165l(appCompatTextView)) {
                removeView(this.f326c);
                this.f333f1.remove(this.f326c);
            }
        } else {
            if (this.f326c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.f326c = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f326c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f309N0;
                if (i != 0) {
                    this.f326c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f325b1;
                if (colorStateList != null) {
                    this.f326c.setTextColor(colorStateList);
                }
            }
            if (!m165l(this.f326c)) {
                m158b(this.f326c, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f326c;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f321Z0 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f325b1 = colorStateList;
        AppCompatTextView appCompatTextView = this.f326c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f324b;
            if (appCompatTextView != null && m165l(appCompatTextView)) {
                removeView(this.f324b);
                this.f333f1.remove(this.f324b);
            }
        } else {
            if (this.f324b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.f324b = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f324b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f308M0;
                if (i != 0) {
                    this.f324b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f323a1;
                if (colorStateList != null) {
                    this.f324b.setTextColor(colorStateList);
                }
            }
            if (!m165l(this.f324b)) {
                m158b(this.f324b, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f324b;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f320Y0 = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f323a1 = colorStateList;
        AppCompatTextView appCompatTextView = this.f324b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f319X0 = 8388627;
        this.f331e1 = new ArrayList();
        this.f333f1 = new ArrayList();
        this.f335g1 = new int[2];
        this.f337h1 = new li80(new h081(this, 1));
        this.f339i1 = new ArrayList();
        this.f341k1 = new rg41(this, 11);
        this.f352u1 = new cjs0(this, 29);
        Context context2 = getContext();
        int[] iArr = h3u0.f87345y;
        cx21 cx21VarM34178J = cx21.m34178J(context2, attributeSet, iArr, i);
        mec1.m61563o(this, context, iArr, attributeSet, cx21VarM34178J.m34212z(), i);
        this.f308M0 = cx21VarM34178J.m34207t(28, 0);
        this.f309N0 = cx21VarM34178J.m34207t(19, 0);
        this.f319X0 = cx21VarM34178J.m34206q(0, 8388627);
        this.f310O0 = cx21VarM34178J.m34206q(2, 48);
        int iM34199h = cx21VarM34178J.m34199h(22, 0);
        iM34199h = cx21VarM34178J.m34184B(27) ? cx21VarM34178J.m34199h(27, iM34199h) : iM34199h;
        this.f315T0 = iM34199h;
        this.f314S0 = iM34199h;
        this.f313R0 = iM34199h;
        this.f312Q0 = iM34199h;
        int iM34199h2 = cx21VarM34178J.m34199h(25, -1);
        if (iM34199h2 >= 0) {
            this.f312Q0 = iM34199h2;
        }
        int iM34199h3 = cx21VarM34178J.m34199h(24, -1);
        if (iM34199h3 >= 0) {
            this.f313R0 = iM34199h3;
        }
        int iM34199h4 = cx21VarM34178J.m34199h(26, -1);
        if (iM34199h4 >= 0) {
            this.f314S0 = iM34199h4;
        }
        int iM34199h5 = cx21VarM34178J.m34199h(23, -1);
        if (iM34199h5 >= 0) {
            this.f315T0 = iM34199h5;
        }
        this.f311P0 = cx21VarM34178J.m34200j(13, -1);
        int iM34199h6 = cx21VarM34178J.m34199h(9, Integer.MIN_VALUE);
        int iM34199h7 = cx21VarM34178J.m34199h(5, Integer.MIN_VALUE);
        int iM34200j = cx21VarM34178J.m34200j(7, 0);
        int iM34200j2 = cx21VarM34178J.m34200j(8, 0);
        if (this.f316U0 == null) {
            this.f316U0 = new ttx0();
        }
        this.f316U0.m81541e(iM34200j, iM34200j2);
        if (iM34199h6 != Integer.MIN_VALUE || iM34199h7 != Integer.MIN_VALUE) {
            this.f316U0.m81543g(iM34199h6, iM34199h7);
        }
        this.f317V0 = cx21VarM34178J.m34199h(10, Integer.MIN_VALUE);
        this.f318W0 = cx21VarM34178J.m34199h(6, Integer.MIN_VALUE);
        this.f332f = cx21VarM34178J.m34202l(4);
        this.f334g = cx21VarM34178J.m34211y(3);
        CharSequence charSequenceM34211y = cx21VarM34178J.m34211y(21);
        if (!TextUtils.isEmpty(charSequenceM34211y)) {
            setTitle(charSequenceM34211y);
        }
        CharSequence charSequenceM34211y2 = cx21VarM34178J.m34211y(18);
        if (!TextUtils.isEmpty(charSequenceM34211y2)) {
            setSubtitle(charSequenceM34211y2);
        }
        this.f350t = getContext();
        setPopupTheme(cx21VarM34178J.m34207t(17, 0));
        Drawable drawableM34202l = cx21VarM34178J.m34202l(16);
        if (drawableM34202l != null) {
            setNavigationIcon(drawableM34202l);
        }
        CharSequence charSequenceM34211y3 = cx21VarM34178J.m34211y(15);
        if (!TextUtils.isEmpty(charSequenceM34211y3)) {
            setNavigationContentDescription(charSequenceM34211y3);
        }
        Drawable drawableM34202l2 = cx21VarM34178J.m34202l(11);
        if (drawableM34202l2 != null) {
            setLogo(drawableM34202l2);
        }
        CharSequence charSequenceM34211y4 = cx21VarM34178J.m34211y(12);
        if (!TextUtils.isEmpty(charSequenceM34211y4)) {
            setLogoDescription(charSequenceM34211y4);
        }
        if (cx21VarM34178J.m34184B(29)) {
            setTitleTextColor(cx21VarM34178J.m34198g(29));
        }
        if (cx21VarM34178J.m34184B(20)) {
            setSubtitleTextColor(cx21VarM34178J.m34198g(20));
        }
        if (cx21VarM34178J.m34184B(14)) {
            getMenuInflater().inflate(cx21VarM34178J.m34207t(14, 0), getMenu());
        }
        cx21VarM34178J.m34189K();
    }
}
