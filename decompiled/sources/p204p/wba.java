package p204p;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.music.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class wba extends n65 {

    /* JADX INFO: renamed from: N0 */
    public static final /* synthetic */ int f249715N0 = 0;

    /* JADX INFO: renamed from: L0 */
    public final boolean f249716L0;

    /* JADX INFO: renamed from: M0 */
    public final k83 f249717M0;

    /* JADX INFO: renamed from: X */
    public boolean f249718X;

    /* JADX INFO: renamed from: Y */
    public boolean f249719Y;

    /* JADX INFO: renamed from: Z */
    public vba f249720Z;

    /* JADX INFO: renamed from: f */
    public BottomSheetBehavior f249721f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f249722g;

    /* JADX INFO: renamed from: h */
    public CoordinatorLayout f249723h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f249724i;

    /* JADX INFO: renamed from: t */
    public boolean f249725t;

    public wba(Context context) {
        this(context, 0);
        this.f249716L0 = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        m87626g();
        super.cancel();
    }

    /* JADX INFO: renamed from: f */
    public final void m87625f() {
        if (this.f249722g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f249722g = frameLayout;
            this.f249723h = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f249722g.findViewById(R.id.design_bottom_sheet);
            this.f249724i = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorM1567z = BottomSheetBehavior.m1567z(frameLayout2);
            this.f249721f = bottomSheetBehaviorM1567z;
            bottomSheetBehaviorM1567z.m1590t(this.f249717M0);
            this.f249721f.m1574H(this.f249725t);
        }
    }

    /* JADX INFO: renamed from: g */
    public final BottomSheetBehavior m87626g() {
        if (this.f249721f == null) {
            m87625f();
        }
        return this.f249721f;
    }

    /* JADX INFO: renamed from: h */
    public final FrameLayout m87627h(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m87625f();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f249722g.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f249716L0) {
            FrameLayout frameLayout = this.f249724i;
            kp7 kp7Var = new kp7(this, 7);
            WeakHashMap weakHashMap = mec1.f142677a;
            cec1.m32550n(frameLayout, kp7Var);
        }
        this.f249724i.removeAllViews();
        if (layoutParams == null) {
            this.f249724i.addView(view);
        } else {
            this.f249724i.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new y10(this, 10));
        mec1.m61564p(this.f249724i, new C2569xe(this, 3));
        this.f249724i.setOnTouchListener(new eef(3));
        return this.f249722g;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.f249716L0 && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f249722g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.f249723h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            if (z) {
                window.getDecorView().setSystemUiVisibility(768);
            }
        }
    }

    @Override // p204p.n65, p204p.mwf, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // p204p.mwf, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f249721f;
        if (bottomSheetBehavior == null || bottomSheetBehavior.m1569C() != 5) {
            return;
        }
        this.f249721f.m1578L(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f249725t != z) {
            this.f249725t = z;
            BottomSheetBehavior bottomSheetBehavior = this.f249721f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.m1574H(z);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f249725t) {
            this.f249725t = true;
        }
        this.f249718X = z;
        this.f249719Y = true;
    }

    @Override // p204p.n65, p204p.mwf, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(m87627h(null, i, null));
    }

    @Override // p204p.n65, p204p.mwf, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(m87627h(view, 0, null));
    }

    @Override // p204p.n65, p204p.mwf, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m87627h(view, 0, layoutParams));
    }

    public wba(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        super(context, i);
        this.f249725t = true;
        this.f249718X = true;
        this.f249717M0 = new k83(this, 1);
        m63757d().mo31530f(1);
        this.f249716L0 = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }
}
