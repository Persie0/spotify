package p204p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.car.app.model.Alert;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class k290 implements ft11 {

    /* JADX INFO: renamed from: X0 */
    public static final Method f118554X0;

    /* JADX INFO: renamed from: Y0 */
    public static final Method f118555Y0;

    /* JADX INFO: renamed from: L0 */
    public t8m f118556L0;

    /* JADX INFO: renamed from: M0 */
    public View f118557M0;

    /* JADX INFO: renamed from: N0 */
    public AdapterView.OnItemClickListener f118558N0;

    /* JADX INFO: renamed from: S0 */
    public final Handler f118563S0;

    /* JADX INFO: renamed from: U0 */
    public Rect f118565U0;

    /* JADX INFO: renamed from: V0 */
    public boolean f118566V0;

    /* JADX INFO: renamed from: W0 */
    public final v65 f118567W0;

    /* JADX INFO: renamed from: X */
    public boolean f118568X;

    /* JADX INFO: renamed from: a */
    public final Context f118571a;

    /* JADX INFO: renamed from: b */
    public ListAdapter f118572b;

    /* JADX INFO: renamed from: c */
    public rhs f118573c;

    /* JADX INFO: renamed from: f */
    public int f118576f;

    /* JADX INFO: renamed from: g */
    public int f118577g;

    /* JADX INFO: renamed from: i */
    public boolean f118579i;

    /* JADX INFO: renamed from: t */
    public boolean f118580t;

    /* JADX INFO: renamed from: d */
    public final int f118574d = -2;

    /* JADX INFO: renamed from: e */
    public int f118575e = -2;

    /* JADX INFO: renamed from: h */
    public final int f118578h = 1002;

    /* JADX INFO: renamed from: Y */
    public int f118569Y = 0;

    /* JADX INFO: renamed from: Z */
    public final int f118570Z = Alert.DURATION_SHOW_INDEFINITELY;

    /* JADX INFO: renamed from: O0 */
    public final i290 f118559O0 = new i290(this, 1);

    /* JADX INFO: renamed from: P0 */
    public final azp f118560P0 = new azp(this, 5);

    /* JADX INFO: renamed from: Q0 */
    public final j290 f118561Q0 = new j290(this);

    /* JADX INFO: renamed from: R0 */
    public final i290 f118562R0 = new i290(this, 0);

    /* JADX INFO: renamed from: T0 */
    public final Rect f118564T0 = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f118554X0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f118555Y0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public k290(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.f118571a = context;
        this.f118563S0 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h3u0.f87335o, i, 0);
        this.f118576f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f118577g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f118579i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        v65 v65Var = new v65(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, h3u0.f87339s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            v65Var.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        v65Var.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : ihf1.m50639w(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f118567W0 = v65Var;
        v65Var.setInputMethodMode(1);
    }

    @Override // p204p.ft11
    /* JADX INFO: renamed from: a */
    public final boolean mo42574a() {
        return this.f118567W0.isShowing();
    }

    /* JADX INFO: renamed from: b */
    public final Drawable m55153b() {
        return this.f118567W0.getBackground();
    }

    /* JADX INFO: renamed from: c */
    public final int m55154c() {
        return this.f118576f;
    }

    /* JADX INFO: renamed from: d */
    public final void m55155d(int i) {
        this.f118576f = i;
    }

    @Override // p204p.ft11
    public final void dismiss() {
        v65 v65Var = this.f118567W0;
        v65Var.dismiss();
        v65Var.setContentView(null);
        this.f118573c = null;
        this.f118563S0.removeCallbacks(this.f118559O0);
    }

    /* JADX INFO: renamed from: g */
    public final void m55156g(int i) {
        this.f118577g = i;
        this.f118579i = true;
    }

    /* JADX INFO: renamed from: j */
    public final int m55157j() {
        if (this.f118579i) {
            return this.f118577g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public void mo40959k(ListAdapter listAdapter) {
        t8m t8mVar = this.f118556L0;
        if (t8mVar == null) {
            this.f118556L0 = new t8m(this, 1);
        } else {
            ListAdapter listAdapter2 = this.f118572b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(t8mVar);
            }
        }
        this.f118572b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f118556L0);
        }
        rhs rhsVar = this.f118573c;
        if (rhsVar != null) {
            rhsVar.setAdapter(this.f118572b);
        }
    }

    @Override // p204p.ft11
    /* JADX INFO: renamed from: m */
    public final void mo42575m() {
        int i;
        int iMakeMeasureSpec;
        int paddingBottom;
        rhs rhsVar;
        rhs rhsVar2 = this.f118573c;
        Context context = this.f118571a;
        v65 v65Var = this.f118567W0;
        if (rhsVar2 == null) {
            rhs rhsVarMo36082q = mo36082q(context, !this.f118566V0);
            this.f118573c = rhsVarMo36082q;
            rhsVarMo36082q.setAdapter(this.f118572b);
            this.f118573c.setOnItemClickListener(this.f118558N0);
            this.f118573c.setFocusable(true);
            this.f118573c.setFocusableInTouchMode(true);
            this.f118573c.setOnItemSelectedListener(new f290(this, 0));
            this.f118573c.setOnScrollListener(this.f118561Q0);
            v65Var.setContentView(this.f118573c);
        }
        Drawable background = v65Var.getBackground();
        Rect rect = this.f118564T0;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.f118579i) {
                this.f118577g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iM43374a = g290.m43374a(v65Var, this.f118557M0, this.f118577g, v65Var.getInputMethodMode() == 2);
        int i3 = this.f118574d;
        if (i3 == -1) {
            paddingBottom = iM43374a + i;
        } else {
            int i4 = this.f118575e;
            if (i4 != -2) {
                iMakeMeasureSpec = i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iM75519a = this.f118573c.m75519a(iMakeMeasureSpec, iM43374a);
            paddingBottom = iM75519a + (iM75519a > 0 ? this.f118573c.getPaddingBottom() + this.f118573c.getPaddingTop() + i : 0);
        }
        boolean z = v65Var.getInputMethodMode() == 2;
        v65Var.setWindowLayoutType(this.f118578h);
        if (v65Var.isShowing()) {
            View view = this.f118557M0;
            WeakHashMap weakHashMap = mec1.f142677a;
            if (view.isAttachedToWindow()) {
                int width = this.f118575e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f118557M0.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    if (z) {
                        v65Var.setWidth(this.f118575e == -1 ? -1 : 0);
                        v65Var.setHeight(0);
                    } else {
                        v65Var.setWidth(this.f118575e == -1 ? -1 : 0);
                        v65Var.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                v65Var.setOutsideTouchable(true);
                View view2 = this.f118557M0;
                int i5 = width;
                int i6 = this.f118576f;
                int i7 = this.f118577g;
                int i8 = i5 < 0 ? -1 : i5;
                if (i3 < 0) {
                    i3 = -1;
                }
                v65Var.update(view2, i6, i7, i8, i3);
                return;
            }
            return;
        }
        int width2 = this.f118575e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f118557M0.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        v65Var.setWidth(width2);
        v65Var.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f118554X0;
            if (method != null) {
                try {
                    method.invoke(v65Var, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        } else {
            h290.m46484b(v65Var, true);
        }
        v65Var.setOutsideTouchable(true);
        v65Var.setTouchInterceptor(this.f118560P0);
        if (this.f118568X) {
            v65Var.setOverlapAnchor(this.f118580t);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f118555Y0;
            if (method2 != null) {
                try {
                    method2.invoke(v65Var, this.f118565U0);
                } catch (Exception unused2) {
                }
            }
        } else {
            h290.m46483a(v65Var, this.f118565U0);
        }
        v65Var.showAsDropDown(this.f118557M0, this.f118576f, this.f118577g, this.f118569Y);
        this.f118573c.setSelection(-1);
        if ((!this.f118566V0 || this.f118573c.isInTouchMode()) && (rhsVar = this.f118573c) != null) {
            rhsVar.setListSelectionHidden(true);
            rhsVar.requestLayout();
        }
        if (this.f118566V0) {
            return;
        }
        this.f118563S0.post(this.f118562R0);
    }

    @Override // p204p.ft11
    /* JADX INFO: renamed from: n */
    public final rhs mo42576n() {
        return this.f118573c;
    }

    /* JADX INFO: renamed from: o */
    public final void m55158o(Drawable drawable) {
        this.f118567W0.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: q */
    public rhs mo36082q(Context context, boolean z) {
        return new rhs(context, z);
    }

    /* JADX INFO: renamed from: r */
    public final void m55159r(int i) {
        Drawable background = this.f118567W0.getBackground();
        if (background == null) {
            this.f118575e = i;
            return;
        }
        Rect rect = this.f118564T0;
        background.getPadding(rect);
        this.f118575e = rect.left + rect.right + i;
    }
}
