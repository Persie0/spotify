package p204p;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.spotify.music.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: p.u6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2441u6 extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public WeakReference f227180a;

    /* JADX INFO: renamed from: b */
    public IBinder f227181b;

    /* JADX INFO: renamed from: c */
    public xbe1 f227182c;

    /* JADX INFO: renamed from: d */
    public hsh f227183d;

    /* JADX INFO: renamed from: e */
    public bph f227184e;

    /* JADX INFO: renamed from: f */
    public eh00 f227185f;

    /* JADX INFO: renamed from: g */
    public boolean f227186g;

    /* JADX INFO: renamed from: h */
    public boolean f227187h;

    /* JADX INFO: renamed from: i */
    public boolean f227188i;

    public AbstractC2441u6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        this.f227185f = hkr0.f92485W0.mo41931b(this);
    }

    private final void setParentContext(hsh hshVar) {
        if (this.f227183d != hshVar) {
            this.f227183d = hshVar;
            if (hshVar != null) {
                this.f227180a = null;
            }
            xbe1 xbe1Var = this.f227182c;
            if (xbe1Var != null) {
                xbe1Var.dispose();
                this.f227182c = null;
                if (isAttachedToWindow()) {
                    m82426i();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f227181b != iBinder) {
            this.f227181b = iBinder;
            this.f227180a = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo301a(int i, xq00 xq00Var);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        m82423e();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m82423e();
        return super.addViewInLayout(view, i, layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public final void m82422b() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.f227184e == null) {
                oz3 oz3Var = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof oz3) {
                        oz3Var = (oz3) childAt;
                    }
                }
                if (oz3Var != null) {
                    oz3Var.setComposeViewContext(m82429t(rpg1.m76176q(this), oz3Var.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                m82426i();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m82423e() {
        if (this.f227187h) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    /* JADX INFO: renamed from: f */
    public final void m82424f() {
        bph bphVar;
        View view;
        if (this.f227183d == null && !isAttachedToWindow() && ((bphVar = this.f227184e) == null || (view = bphVar.f29454a) == null || !view.isAttachedToWindow())) {
            throw new IllegalStateException("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        }
        m82426i();
    }

    /* JADX INFO: renamed from: g */
    public final void m82425g() {
        View childAt = getChildAt(0);
        oz3 oz3Var = childAt instanceof oz3 ? (oz3) childAt : null;
        if (oz3Var != null && oz3Var.f172038h2) {
            oz3Var.getComposeViewContext().m30118b();
            oz3Var.f172038h2 = false;
        }
        xbe1 xbe1Var = this.f227182c;
        if (xbe1Var != null) {
            xbe1Var.dispose();
        }
        this.f227182c = null;
        requestLayout();
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m98396getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        yr7 yr7Var = tag instanceof yr7 ? (yr7) tag : null;
        if (yr7Var != null) {
            return yr7Var.m94413b();
        }
        return 1;
    }

    public final bph getComposeViewContext$ui() {
        return this.f227184e;
    }

    public final boolean getHasComposition() {
        return this.f227182c != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f227186g;
    }

    /* JADX INFO: renamed from: i */
    public final void m82426i() {
        if (this.f227182c == null) {
            try {
                this.f227187h = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    bph bphVarM82427q = this.f227184e;
                    if (bphVarM82427q == null) {
                        bphVarM82427q = m82427q();
                    }
                    this.f227182c = efe1.m38730a(this, bphVarM82427q, rkk.m75763o(new C2402t6(this, 0), true, 1003123809));
                    Trace.endSection();
                    this.f227187h = false;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                this.f227187h = false;
                throw th2;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f227188i || super.isTransitionGroup();
    }

    /* JADX INFO: renamed from: j */
    public void mo41678j(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: m */
    public void mo41679m(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        cqi0 cqi0Var = wxd1.f256013a;
        Object objM83709z = upf.m83709z(this);
        View view = this;
        while (objM83709z instanceof View) {
            View view2 = (View) objM83709z;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            objM83709z = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new RunnableC2364s6(this, 0));
        } else {
            m82422b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mo41678j(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        m82426i();
        mo41679m(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    /* JADX INFO: renamed from: q */
    public final bph m82427q() {
        bph composeViewContext;
        ijc1 ijc1Var;
        if (getChildCount() == 0) {
            composeViewContext = null;
        } else {
            View childAt = getChildAt(0);
            oz3 oz3Var = childAt instanceof oz3 ? (oz3) childAt : null;
            if (oz3Var != null) {
                composeViewContext = oz3Var.getComposeViewContext();
            } else {
                composeViewContext = null;
            }
        }
        View viewM76176q = rpg1.m76176q(this);
        bph bphVarM76178s = rpg1.m76178s(viewM76176q);
        if (bphVarM76178s != null) {
            return m82429t(viewM76176q, bphVarM76178s);
        }
        hsh hshVarM82428r = m82428r();
        hc80 hc80VarM40067h = eug1.m40067h(viewM76176q);
        if (hc80VarM40067h == null) {
            hc80VarM40067h = composeViewContext != null ? composeViewContext.f29456c : null;
            if (hc80VarM40067h == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
        }
        hc80 hc80Var = hc80VarM40067h;
        h9y0 h9y0VarM93069n = y85.m93069n(viewM76176q);
        if (h9y0VarM93069n == null) {
            h9y0VarM93069n = composeViewContext != null ? composeViewContext.f29457d : null;
            if (h9y0VarM93069n == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
            }
        }
        h9y0 h9y0Var = h9y0VarM93069n;
        ijc1 ijc1VarM59986C = lug1.m59986C(viewM76176q);
        if (ijc1VarM59986C == null) {
            ijc1Var = composeViewContext != null ? composeViewContext.f29458e : null;
        } else {
            ijc1Var = ijc1VarM59986C;
        }
        bph bphVar = new bph(rpg1.m76175p(viewM76176q), viewM76176q, hshVarM82428r, hc80Var, h9y0Var, ijc1Var);
        rpg1.m76185z(viewM76176q, bphVar);
        return bphVar;
    }

    /* JADX INFO: renamed from: r */
    public final hsh m82428r() {
        wgv0 wgv0VarM81908a;
        Object objM83709z;
        hsh hshVarM89231a = this.f227183d;
        if (hshVarM89231a == null) {
            hshVarM89231a = wxd1.m89231a(this);
            if (hshVarM89231a == null) {
                ViewParent parent = getParent();
                while (true) {
                    if (hshVarM89231a != null || !(objM83709z instanceof View)) {
                        objM83709z = parent;
                        break;
                    }
                    objM83709z = parent;
                    View view = (View) objM83709z;
                    hshVarM89231a = wxd1.m89231a(view);
                    objM83709z = upf.m83709z(view);
                }
            }
            tgv0 tgv0Var = tgv0.f220267b;
            boolean z = false;
            if (hshVarM89231a != null) {
                hsh hshVar = (!(hshVarM89231a instanceof wgv0) || ((tgv0) ((wgv0) hshVarM89231a).f251186v.getValue()).compareTo(tgv0Var) > 0) ? hshVarM89231a : null;
                if (hshVar != null) {
                    this.f227180a = new WeakReference(hshVar);
                }
            } else {
                hshVarM89231a = null;
            }
            if (hshVarM89231a == null) {
                WeakReference weakReference = this.f227180a;
                if (weakReference == null || (hshVarM89231a = (hsh) weakReference.get()) == null || ((hshVarM89231a instanceof wgv0) && ((tgv0) ((wgv0) hshVarM89231a).f251186v.getValue()).compareTo(tgv0Var) <= 0)) {
                    hshVarM89231a = null;
                }
                if (hshVarM89231a == null) {
                    if (!isAttachedToWindow()) {
                        mt40.m62791c("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    View view2 = this;
                    Object parent2 = upf.m83709z(this);
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    hsh hshVarM89231a2 = wxd1.m89231a(view2);
                    if (hshVarM89231a2 == null) {
                        wgv0VarM81908a = ((txd1) uxd1.f234903a.get()).m81908a(view2);
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, wgv0VarM81908a);
                        Handler handler = view2.getHandler();
                        int i = tb20.f218730a;
                        view2.addOnAttachStateChangeListener(new ay1(x0h1.m89578u(qg10.f188337a, new rb20(handler, "windowRecomposer cleanup", false).f197428f, 0, new gud1(wgv0VarM81908a, view2, z ? 1 : 0, 1), 2), 28));
                    } else {
                        if (!(hshVarM89231a2 instanceof wgv0)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        wgv0VarM81908a = (wgv0) hshVarM89231a2;
                    }
                    wgv0 wgv0Var = ((tgv0) wgv0VarM81908a.f251186v.getValue()).compareTo(tgv0Var) > 0 ? wgv0VarM81908a : null;
                    if (wgv0Var != null) {
                        this.f227180a = new WeakReference(wgv0Var);
                    }
                    return wgv0VarM81908a;
                }
            }
        }
        return hshVarM89231a;
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m98397setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, yr7.m94412a(i));
    }

    public final void setComposeViewContext$ui(bph bphVar) {
        if (this.f227184e != bphVar) {
            if (bphVar == null) {
                m82425g();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                oz3 oz3Var = childAt instanceof oz3 ? (oz3) childAt : null;
                if (oz3Var != null) {
                    if (oz3Var.getCoroutineContext() != bphVar.f29455b.mo48469k()) {
                        m82425g();
                    }
                    oz3Var.setComposeViewContext(bphVar);
                }
            }
            this.f227184e = bphVar;
        }
    }

    public final void setParentCompositionContext(hsh hshVar) {
        setParentContext(hshVar);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.f227186g = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((oz3) ((g2m0) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.f227188i = true;
    }

    public final void setViewCompositionStrategy(oec1 oec1Var) {
        eh00 eh00Var = this.f227185f;
        if (eh00Var != null) {
            eh00Var.invoke();
        }
        this.f227185f = oec1Var.mo41931b(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final bph m82429t(View view, bph bphVar) {
        hsh hshVarM82428r = m82428r();
        hc80 hc80VarM40067h = eug1.m40067h(view);
        ijc1 ijc1VarM59986C = lug1.m59986C(view);
        h9y0 h9y0VarM93069n = y85.m93069n(view);
        hsh hshVar = bphVar.f29455b;
        h9y0 h9y0Var = bphVar.f29457d;
        hc80 hc80Var = bphVar.f29456c;
        if (hshVarM82428r == hshVar && hc80VarM40067h == hc80Var && ijc1VarM59986C == bphVar.f29458e && h9y0VarM93069n == h9y0Var) {
            return bphVar;
        }
        if (hshVarM82428r.mo48469k() != bphVar.f29455b.mo48469k()) {
            m82425g();
        }
        if (hc80VarM40067h == null) {
            hc80VarM40067h = hc80Var;
        }
        bph bphVar2 = new bph(bphVar, view, hshVarM82428r, hc80VarM40067h, h9y0VarM93069n == null ? h9y0Var : h9y0VarM93069n, ijc1VarM59986C);
        rpg1.m76185z(view, bphVar2);
        return bphVar2;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        m82423e();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        m82423e();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        m82423e();
        super.addView(view, i, i2);
    }

    public /* synthetic */ AbstractC2441u6(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m82423e();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m82423e();
        super.addView(view, i, layoutParams);
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
