package com.spotify.nowplaying.uiusecases.overlay;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDefer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.processors.BehaviorProcessor;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.dqs;
import p204p.eh00;
import p204p.g0m0;
import p204p.kk00;
import p204p.l1m0;
import p204p.m0m0;
import p204p.m12;
import p204p.mec1;
import p204p.n0m0;
import p204p.o0m0;
import p204p.pv50;
import p204p.yh1;
import p204p.ytl0;
import p204p.zkc1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003!\"#B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017R/\u0010 \u001a\u001a\u0012\u0016\u0012\u0014 \u001b*\t\u0018\u00010\u0019¢\u0006\u0002\b\u001a0\u0019¢\u0006\u0002\b\u001a0\u00188\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, m24212d2 = {"Lcom/spotify/nowplaying/uiusecases/overlay/OverlayHidingFrameLayout;", "Landroid/widget/FrameLayout;", "Lp/o0m0;", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/g0m0;", "overlayDisplayMode", "Lp/w2a1;", "setOverlayDisplayMode", "(Lp/g0m0;)V", "Landroid/view/View;", "overlayLayout", "setOverlayView", "(Landroid/view/View;)V", "fadeDurationMs", "setFadeDuration", "(I)V", "Lio/reactivex/rxjava3/core/Flowable;", "Lp/l1m0;", "Lkotlin/jvm/internal/EnhancedNullability;", "kotlin.jvm.PlatformType", "b", "Lio/reactivex/rxjava3/core/Flowable;", "getOverlayState", "()Lio/reactivex/rxjava3/core/Flowable;", "overlayState", "p/m0m0", "p/m12", "p/pv50", "src_main_java_com_spotify_nowplaying_uiusecases-uiusecases"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public class OverlayHidingFrameLayout extends FrameLayout implements o0m0, ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: S0 */
    public static final /* synthetic */ int f6303S0 = 0;

    /* JADX INFO: renamed from: L0 */
    public g0m0 f6304L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f6305M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f6306N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f6307O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f6308P0;

    /* JADX INFO: renamed from: Q0 */
    public final m12 f6309Q0;

    /* JADX INFO: renamed from: R0 */
    public final m12 f6310R0;

    /* JADX INFO: renamed from: a */
    public final BehaviorProcessor f6311a;

    /* JADX INFO: renamed from: b */
    public final FlowableDistinctUntilChanged f6312b;

    /* JADX INFO: renamed from: c */
    public final GestureDetector f6313c;

    /* JADX INFO: renamed from: d */
    public final kk00 f6314d;

    /* JADX INFO: renamed from: e */
    public final Drawable f6315e;

    /* JADX INFO: renamed from: f */
    public final Drawable f6316f;

    /* JADX INFO: renamed from: g */
    public final Drawable f6317g;

    /* JADX INFO: renamed from: h */
    public View f6318h;

    /* JADX INFO: renamed from: i */
    public int f6319i;

    /* JADX INFO: renamed from: t */
    public final int f6320t;

    public OverlayHidingFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m15994d(View view, int i, int i2) {
        if (view.getVisibility() == 0) {
            if (!view.isClickable() || i < view.getLeft() || i > view.getRight() || i2 < view.getTop() || i2 > view.getBottom()) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int i3 = 0;
                    while (true) {
                        if (!(i3 < viewGroup.getChildCount())) {
                            break;
                        }
                        int i4 = i3 + 1;
                        View childAt = viewGroup.getChildAt(i3);
                        if (childAt == null) {
                            throw new IndexOutOfBoundsException();
                        }
                        int left = i - viewGroup.getLeft();
                        int top = i2 - viewGroup.getTop();
                        if (left < 0 || top < 0 || !m15994d(childAt, left, top)) {
                            i3 = i4;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // p204p.o0m0
    /* JADX INFO: renamed from: a */
    public final void mo15995a(boolean z) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        View view = this.f6318h;
        if (view != null && (viewPropertyAnimatorAnimate = view.animate()) != null) {
            viewPropertyAnimatorAnimate.cancel();
        }
        if (!m15999f(4, z)) {
            this.f6311a.onNext(l1m0.f128756b);
            return;
        }
        View view2 = this.f6318h;
        if (view2 != null) {
            zkc1 zkc1VarM61551c = mec1.m61551c(view2);
            zkc1VarM61551c.m96315d(this.f6319i);
            zkc1VarM61551c.m96316e(dqs.f52077c);
            zkc1VarM61551c.m96317f(this.f6310R0);
            zkc1VarM61551c.m96312a(0.0f);
            zkc1VarM61551c.m96318g();
        }
    }

    @Override // p204p.o0m0
    /* JADX INFO: renamed from: b */
    public final void mo15996b(boolean z) {
        this.f6307O0 = z;
        if (z) {
            m16001h(this.f6306N0 ? this.f6315e : this.f6317g, 20);
        } else {
            m16001h(this.f6316f, 200);
        }
    }

    @Override // p204p.o0m0
    /* JADX INFO: renamed from: c */
    public final void mo15997c(boolean z) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        View view = this.f6318h;
        if (view != null && (viewPropertyAnimatorAnimate = view.animate()) != null) {
            viewPropertyAnimatorAnimate.cancel();
        }
        m16000g(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        if (this.f6318h == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        kk00 kk00Var = this.f6314d;
        removeCallbacks(kk00Var);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f6308P0 = false;
        }
        if (actionMasked == 1 && this.f6304L0 == g0m0.f75395a) {
            removeCallbacks(kk00Var);
            postDelayed(kk00Var, this.f6320t);
        }
        if (actionMasked == 0 && this.f6305M0) {
            View view = this.f6318h;
            if (view != null && (viewPropertyAnimatorAnimate = view.animate()) != null) {
                viewPropertyAnimatorAnimate.cancel();
            }
        } else if (!this.f6308P0 && this.f6313c.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m15998e() {
        View view = this.f6318h;
        return view != null && view.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m15999f(int i, boolean z) {
        View view = this.f6318h;
        if (view == null || view.getVisibility() == i) {
            return false;
        }
        if (!z) {
            View view2 = this.f6318h;
            if (view2 != null) {
                view2.setAlpha(i == 0 ? 1.0f : 0.0f);
            }
            View view3 = this.f6318h;
            if (view3 != null) {
                view3.setVisibility(i);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: g */
    public final void m16000g(boolean z) {
        if (this.f6304L0 == g0m0.f75395a) {
            kk00 kk00Var = this.f6314d;
            removeCallbacks(kk00Var);
            postDelayed(kk00Var, this.f6320t);
        }
        boolean z2 = this.f6306N0;
        l1m0 l1m0Var = l1m0.f128755a;
        BehaviorProcessor behaviorProcessor = this.f6311a;
        if (z2) {
            this.f6306N0 = false;
            behaviorProcessor.onNext(l1m0Var);
            mo15996b(this.f6307O0);
        } else {
            if (!m15999f(0, z)) {
                behaviorProcessor.onNext(l1m0Var);
                return;
            }
            View view = this.f6318h;
            if (view != null) {
                zkc1 zkc1VarM61551c = mec1.m61551c(view);
                zkc1VarM61551c.m96315d(this.f6319i);
                zkc1VarM61551c.m96316e(dqs.f52077c);
                zkc1VarM61551c.m96317f(this.f6309Q0);
                zkc1VarM61551c.m96312a(1.0f);
                zkc1VarM61551c.m96318g();
            }
        }
    }

    public final Flowable<l1m0> getOverlayState() {
        return this.f6312b;
    }

    /* JADX INFO: renamed from: h */
    public final void m16001h(Drawable drawable, int i) {
        View view = this.f6318h;
        if (view != null) {
            Drawable background = view.getBackground();
            if (background == null) {
                background = this.f6316f;
            }
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{background, drawable});
            transitionDrawable.setCrossFadeEnabled(true);
            transitionDrawable.startTransition(i);
            WeakHashMap weakHashMap = mec1.f142677a;
            view.setBackground(transitionDrawable);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        setOverlayView(view2);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        super.onDetachedFromWindow();
        View view = this.f6318h;
        if (view != null && (viewPropertyAnimatorAnimate = view.animate()) != null) {
            viewPropertyAnimatorAnimate.cancel();
        }
        removeCallbacks(null);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof m0m0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m0m0 m0m0Var = (m0m0) parcelable;
        super.onRestoreInstanceState(m0m0Var.getSuperState());
        this.f6304L0 = m0m0Var.f138701a;
        if (m0m0Var.f138702b) {
            mo15997c(false);
        } else {
            mo15995a(false);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        m0m0 m0m0Var = new m0m0(super.onSaveInstanceState());
        m0m0Var.f138701a = this.f6304L0;
        m0m0Var.f138702b = m15998e();
        return m0m0Var;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        this.f6308P0 = z;
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setFadeDuration(int fadeDurationMs) {
        this.f6319i = fadeDurationMs;
    }

    @Override // p204p.o0m0
    public void setOverlayDisplayMode(g0m0 overlayDisplayMode) {
        this.f6304L0 = overlayDisplayMode;
        if (this.f6318h == null || overlayDisplayMode == g0m0.f75395a) {
            return;
        }
        removeCallbacks(this.f6314d);
    }

    public final void setOverlayView(View overlayLayout) {
        ViewParent parent = overlayLayout.getParent();
        while (parent != this) {
            parent = parent.getParent();
            if (parent == null) {
                throw new IllegalArgumentException("Overlay has to be a child of the container!");
            }
        }
        this.f6318h = overlayLayout;
    }

    public OverlayHidingFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public OverlayHidingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        BehaviorProcessor behaviorProcessor = new BehaviorProcessor();
        this.f6311a = behaviorProcessor;
        Flowable flowableM23339T = behaviorProcessor.m23339T(new FlowableDefer(new yh1(this, 19)));
        flowableM23339T.getClass();
        this.f6312b = flowableM23339T.m23356t(Functions.f7225a);
        this.f6313c = new GestureDetector(getContext(), new pv50(this));
        this.f6314d = new kk00(this, 22);
        this.f6315e = context.getDrawable(R.drawable.nowplaying_minimized_overlay_gradient);
        this.f6316f = context.getDrawable(R.color.opacity_white_0);
        Drawable background = getBackground();
        this.f6317g = background == null ? context.getDrawable(R.drawable.nowplaying_overlay_gradient) : background;
        this.f6319i = 150;
        this.f6320t = 3500;
        this.f6304L0 = g0m0.f75396b;
        this.f6309Q0 = new m12((FrameLayout) this, (eh00) new n0m0(this, 2), (eh00) ytl0.f276172g, 23);
        this.f6310R0 = new m12((FrameLayout) this, (eh00) new n0m0(this, 0), (eh00) new n0m0(this, 1), 23);
        setOnHierarchyChangeListener(this);
    }

    public /* synthetic */ OverlayHidingFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
