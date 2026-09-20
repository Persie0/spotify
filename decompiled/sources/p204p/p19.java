package p204p;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p19 {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f172992a;

    /* JADX INFO: renamed from: b */
    public final Context f172993b;

    /* JADX INFO: renamed from: c */
    public final o19 f172994c;

    /* JADX INFO: renamed from: d */
    public final oyj f172995d;

    /* JADX INFO: renamed from: e */
    public int f172996e;

    /* JADX INFO: renamed from: g */
    public final Rect f172998g;

    /* JADX INFO: renamed from: h */
    public int f172999h;

    /* JADX INFO: renamed from: i */
    public int f173000i;

    /* JADX INFO: renamed from: j */
    public int f173001j;

    /* JADX INFO: renamed from: k */
    public int f173002k;

    /* JADX INFO: renamed from: l */
    public ArrayList f173003l;

    /* JADX INFO: renamed from: m */
    public e631 f173004m;

    /* JADX INFO: renamed from: n */
    public final AccessibilityManager f173005n;

    /* JADX INFO: renamed from: q */
    public static final int[] f172991q = {R.attr.snackbarStyle};

    /* JADX INFO: renamed from: p */
    public static final Handler f172990p = new Handler(Looper.getMainLooper(), new h19());

    /* JADX INFO: renamed from: f */
    public final i19 f172997f = new i19(this, 0);

    /* JADX INFO: renamed from: o */
    public final j19 f173006o = new j19(this);

    public p19(Context context, ViewGroup viewGroup, View view, oyj oyjVar) {
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (oyjVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f172992a = viewGroup;
        this.f172995d = oyjVar;
        this.f172993b = context;
        bcg1.m28729j(context, bcg1.f25886a, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f172991q);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        o19 o19Var = (o19) layoutInflaterFrom.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.f172994c = o19Var;
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            float actionTextColorAlpha = o19Var.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout.f2163b.setTextColor(vtg1.m86393t(vtg1.m86387n(snackbarContentLayout, R.attr.colorSurface), snackbarContentLayout.f2163b.getCurrentTextColor(), actionTextColorAlpha));
            }
            snackbarContentLayout.setMaxInlineActionWidth(o19Var.getMaxInlineActionWidth());
        }
        o19Var.addView(view);
        ViewGroup.LayoutParams layoutParams = o19Var.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.f172998g = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        WeakHashMap weakHashMap = mec1.f142677a;
        o19Var.setAccessibilityLiveRegion(1);
        o19Var.setImportantForAccessibility(1);
        o19Var.setFitsSystemWindows(true);
        cec1.m32550n(o19Var, new c961(this, 27));
        mec1.m61564p(o19Var, new C2569xe(this, 2));
        this.f173005n = (AccessibilityManager) context.getSystemService("accessibility");
    }

    /* JADX INFO: renamed from: a */
    public final void m68775a(l19 l19Var) {
        if (this.f173003l == null) {
            this.f173003l = new ArrayList();
        }
        this.f173003l.add(l19Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m68776b(int i) {
        bwt0 bwt0VarM30706t = bwt0.m30706t();
        j19 j19Var = this.f173006o;
        synchronized (bwt0VarM30706t.f31729b) {
            try {
                if (bwt0VarM30706t.m30721v(j19Var)) {
                    bwt0VarM30706t.m30715g((j831) bwt0VarM30706t.f31731d, i);
                } else {
                    j831 j831Var = (j831) bwt0VarM30706t.f31732e;
                    if (j831Var != null && j831Var.f109784a.get() == j19Var) {
                        bwt0VarM30706t.m30715g((j831) bwt0VarM30706t.f31732e, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m68777c(int i) {
        bwt0 bwt0VarM30706t = bwt0.m30706t();
        j19 j19Var = this.f173006o;
        synchronized (bwt0VarM30706t.f31729b) {
            try {
                if (bwt0VarM30706t.m30721v(j19Var)) {
                    bwt0VarM30706t.f31731d = null;
                    if (((j831) bwt0VarM30706t.f31732e) != null) {
                        bwt0VarM30706t.m30713H();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList = this.f173003l;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((l19) this.f173003l.get(size)).mo30894a(this, i);
            }
        }
        ViewParent parent = this.f172994c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f172994c);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m68778d() {
        bwt0 bwt0VarM30706t = bwt0.m30706t();
        j19 j19Var = this.f173006o;
        synchronized (bwt0VarM30706t.f31729b) {
            try {
                if (bwt0VarM30706t.m30721v(j19Var)) {
                    bwt0VarM30706t.m30712G((j831) bwt0VarM30706t.f31731d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList = this.f173003l;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((l19) this.f173003l.get(size)).mo30895b(this);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m68779e() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        o19 o19Var = this.f172994c;
        AccessibilityManager accessibilityManager = this.f173005n;
        if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
            o19Var.post(new i19(this, 1));
            return;
        }
        if (o19Var.getParent() != null) {
            o19Var.setVisibility(0);
        }
        m68778d();
    }

    /* JADX INFO: renamed from: f */
    public final void m68780f() {
        Rect rect;
        o19 o19Var = this.f172994c;
        ViewGroup.LayoutParams layoutParams = o19Var.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (rect = this.f172998g) == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = rect.bottom + this.f172999h;
        marginLayoutParams.leftMargin = rect.left + this.f173000i;
        marginLayoutParams.rightMargin = rect.right + this.f173001j;
        o19Var.requestLayout();
        if (Build.VERSION.SDK_INT < 29 || this.f173002k <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = o19Var.getLayoutParams();
        if ((layoutParams2 instanceof hqk) && (((hqk) layoutParams2).f94198a instanceof SwipeDismissBehavior)) {
            i19 i19Var = this.f172997f;
            o19Var.removeCallbacks(i19Var);
            o19Var.post(i19Var);
        }
    }
}
