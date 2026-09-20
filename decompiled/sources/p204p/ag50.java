package p204p;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Handler;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p002ui.platform.ComposeView;

/* JADX INFO: loaded from: classes7.dex */
public final class ag50 {

    /* JADX INFO: renamed from: a */
    public final Application f15286a;

    /* JADX INFO: renamed from: b */
    public final vp50 f15287b;

    /* JADX INFO: renamed from: c */
    public final Handler f15288c;

    /* JADX INFO: renamed from: e */
    public boolean f15290e;

    /* JADX INFO: renamed from: f */
    public Activity f15291f;

    /* JADX INFO: renamed from: g */
    public m12 f15292g;

    /* JADX INFO: renamed from: d */
    public boolean f15289d = true;

    /* JADX INFO: renamed from: h */
    public final zf50 f15293h = new zf50(this, 1);

    /* JADX INFO: renamed from: i */
    public final zf50 f15294i = new zf50(this, 0);

    /* JADX INFO: renamed from: j */
    public final fey f15295j = new fey(this);

    public ag50(Application application, Activity activity, vp50 vp50Var, Handler handler) {
        this.f15286a = application;
        this.f15287b = vp50Var;
        this.f15288c = handler;
    }

    /* JADX INFO: renamed from: a */
    public static final void m25840a(ag50 ag50Var) {
        Handler handler = ag50Var.f15288c;
        if (ag50Var.f15289d) {
            ag50Var.f15289d = false;
            handler.removeCallbacks(ag50Var.f15293h);
            handler.removeCallbacks(ag50Var.f15294i);
            m12 m12Var = ag50Var.f15292g;
            if (m12Var != null) {
                ComposeView composeView = (ComposeView) m12Var.f138797c;
                dir dirVar = (dir) m12Var.f138799e;
                ViewGroup viewGroup = (ViewGroup) m12Var.f138798d;
                if (m12Var.f138796b) {
                    m12Var.f138796b = false;
                    ViewParent parent = composeView.getParent();
                    ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(composeView);
                    }
                    if (eug1.m40067h(viewGroup) == dirVar) {
                        eug1.m40073o(viewGroup, null);
                    }
                    if (lug1.m59986C(viewGroup) == dirVar) {
                        lug1.m59989F(viewGroup, null);
                    }
                    if (y85.m93069n(viewGroup) == dirVar) {
                        y85.m93047D(viewGroup, null);
                    }
                    dirVar.f49464b.m66678i(fb80.f67750a);
                    dirVar.f49466d.m47681a();
                }
            }
            ag50Var.f15292g = null;
            ag50Var.f15286a.unregisterActivityLifecycleCallbacks(ag50Var.f15295j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static boolean m25841b(Activity activity) {
        jfm0 jfm0VarMo15684j0;
        ofm0 ofm0Var = activity instanceof ofm0 ? (ofm0) activity : null;
        q040 q040Var = (ofm0Var == null || (jfm0VarMo15684j0 = ofm0Var.mo15684j0(q040.class)) == null) ? null : (q040) jfm0VarMo15684j0.mo31538a();
        if (!wj50.m88271j(q040Var != null ? q040Var.f183902b : null, xoc1.f264236y5)) {
            return false;
        }
        Intent intent = activity.getIntent();
        if (!wj50.m88271j(intent != null ? intent.getStringExtra("feedbackReportMode") : null, "InternalBug")) {
            return false;
        }
        activity.finish();
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m25842c(Activity activity) {
        if (this.f15289d) {
            boolean z = this.f15290e;
            Handler handler = this.f15288c;
            if (!z) {
                this.f15290e = true;
                handler.postDelayed(this.f15293h, 5000L);
            }
            if (m25841b(activity)) {
                return;
            }
            this.f15291f = activity;
            zf50 zf50Var = this.f15294i;
            handler.removeCallbacks(zf50Var);
            handler.postDelayed(zf50Var, 300L);
        }
    }
}
