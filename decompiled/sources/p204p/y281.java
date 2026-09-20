package p204p;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.spotify.music.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class y281 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: X */
    public static y281 f268497X;

    /* JADX INFO: renamed from: Y */
    public static y281 f268498Y;

    /* JADX INFO: renamed from: a */
    public final View f268499a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f268500b;

    /* JADX INFO: renamed from: c */
    public final int f268501c;

    /* JADX INFO: renamed from: d */
    public final x281 f268502d;

    /* JADX INFO: renamed from: e */
    public final x281 f268503e;

    /* JADX INFO: renamed from: f */
    public int f268504f;

    /* JADX INFO: renamed from: g */
    public int f268505g;

    /* JADX INFO: renamed from: h */
    public h481 f268506h;

    /* JADX INFO: renamed from: i */
    public boolean f268507i;

    /* JADX INFO: renamed from: t */
    public boolean f268508t;

    /* JADX WARN: Type inference failed for: r0v0, types: [p.x281] */
    /* JADX WARN: Type inference failed for: r0v1, types: [p.x281] */
    public y281(View view, CharSequence charSequence) {
        final int i = 0;
        this.f268502d = new Runnable(this) { // from class: p.x281

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ y281 f257394b;

            {
                this.f257394b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.f257394b.m92694c(false);
                        break;
                    default:
                        this.f257394b.m92693a();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f268503e = new Runnable(this) { // from class: p.x281

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ y281 f257394b;

            {
                this.f257394b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f257394b.m92694c(false);
                        break;
                    default:
                        this.f257394b.m92693a();
                        break;
                }
            }
        };
        this.f268499a = view;
        this.f268500b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = rec1.f198345a;
        this.f268501c = Build.VERSION.SDK_INT >= 28 ? qec1.m72608b(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f268508t = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* JADX INFO: renamed from: b */
    public static void m92692b(y281 y281Var) {
        y281 y281Var2 = f268497X;
        if (y281Var2 != null) {
            y281Var2.f268499a.removeCallbacks(y281Var2.f268502d);
        }
        f268497X = y281Var;
        if (y281Var != null) {
            y281Var.f268499a.postDelayed(y281Var.f268502d, ViewConfiguration.getLongPressTimeout());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m92693a() {
        y281 y281Var = f268498Y;
        View view = this.f268499a;
        if (y281Var == this) {
            f268498Y = null;
            h481 h481Var = this.f268506h;
            if (h481Var != null) {
                View view2 = (View) h481Var.f87466b;
                if (view2.getParent() != null) {
                    ((WindowManager) h481Var.f87465a.getSystemService("window")).removeView(view2);
                }
                this.f268506h = null;
                this.f268508t = true;
                view.removeOnAttachStateChangeListener(this);
            }
        }
        if (f268497X == this) {
            m92692b(null);
        }
        view.removeCallbacks(this.f268503e);
    }

    /* JADX INFO: renamed from: c */
    public final void m92694c(boolean z) {
        int height;
        int i;
        int i2;
        int i3;
        long longPressTimeout;
        long j;
        long j2;
        WeakHashMap weakHashMap = mec1.f142677a;
        View view = this.f268499a;
        if (view.isAttachedToWindow()) {
            m92692b(null);
            y281 y281Var = f268498Y;
            if (y281Var != null) {
                y281Var.m92693a();
            }
            f268498Y = this;
            this.f268507i = z;
            h481 h481Var = new h481(view.getContext());
            View view2 = (View) h481Var.f87466b;
            this.f268506h = h481Var;
            int width = this.f268504f;
            int i4 = this.f268505g;
            boolean z2 = this.f268507i;
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) h481Var.f87468d;
            ViewParent parent = view2.getParent();
            Context context = h481Var.f87465a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            ((TextView) h481Var.f87467c).setText(this.f268500b);
            int[] iArr = (int[]) h481Var.f87471g;
            int[] iArr2 = (int[]) h481Var.f87470f;
            Rect rect = (Rect) h481Var.f87469e;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i4 + dimensionPixelOffset2;
                i = i4 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            int i5 = width;
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                for (Context context2 = view.getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                i3 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = 0;
                    i3 = 1;
                } else {
                    Resources resources = context.getResources();
                    i3 = 1;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i2 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i6 = iArr2[i2] - iArr[i2];
                iArr2[i2] = i6;
                iArr2[i3] = iArr2[i3] - iArr[i3];
                layoutParams.x = (i6 + i5) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i2);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i7 = iArr2[i3];
                int i8 = ((i7 + i) - dimensionPixelOffset3) - measuredHeight;
                int i9 = i7 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i8 >= 0) {
                        layoutParams.y = i8;
                    } else {
                        layoutParams.y = i9;
                    }
                } else if (measuredHeight + i9 <= rect.height()) {
                    layoutParams.y = i9;
                } else {
                    layoutParams.y = i8;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f268507i) {
                j2 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == i3) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            x281 x281Var = this.f268503e;
            view.removeCallbacks(x281Var);
            view.postDelayed(x281Var, j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f268506h == null || !this.f268507i) {
            View view2 = this.f268499a;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f268508t = true;
                        m92693a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f268506h == null) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (this.f268508t) {
                        this.f268504f = x;
                        this.f268505g = y;
                        this.f268508t = false;
                        m92692b(this);
                    } else {
                        int iAbs = Math.abs(x - this.f268504f);
                        int i = this.f268501c;
                        if (iAbs > i || Math.abs(y - this.f268505g) > i) {
                            this.f268504f = x;
                            this.f268505g = y;
                            this.f268508t = false;
                            m92692b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f268504f = view.getWidth() / 2;
        this.f268505g = view.getHeight() / 2;
        m92694c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m92693a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
