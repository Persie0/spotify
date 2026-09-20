package p204p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: classes10.dex */
public final class ngj implements ir91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f153715a;

    /* JADX INFO: renamed from: b */
    public final Object f153716b;

    /* JADX INFO: renamed from: c */
    public final Object f153717c;

    /* JADX INFO: renamed from: d */
    public final Object f153718d;

    /* JADX INFO: renamed from: e */
    public final Object f153719e;

    /* JADX INFO: renamed from: f */
    public final Object f153720f;

    /* JADX INFO: renamed from: g */
    public final Object f153721g;

    public /* synthetic */ ngj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f153715a = i;
        this.f153716b = obj;
        this.f153717c = obj2;
        this.f153718d = obj3;
        this.f153719e = obj4;
        this.f153720f = obj5;
        this.f153721g = obj6;
    }

    @Override // p204p.ir91
    /* JADX INFO: renamed from: a */
    public final hr91 mo34693a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        switch (this.f153715a) {
            case 0:
                return new poh(context, new fyf(new mgj((rmm0) this.f153716b, (ogj) this.f153717c, (ago) this.f153718d, (fxh0) this.f153719e, (vlj) this.f153720f, (fyf) this.f153721g, 1), true, -42665837));
            case 1:
                hc80 hc80VarM40067h = eug1.m40067h(viewGroup);
                h9y0 h9y0VarM93069n = y85.m93069n(viewGroup);
                if (hc80VarM40067h == null) {
                    throw new IllegalArgumentException("Page should have lifecycleOwner");
                }
                if (h9y0VarM93069n == null) {
                    throw new IllegalArgumentException("Page should have SavedStateRegistry");
                }
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) layoutInflater.inflate(R.layout.ui_holder_content, viewGroup, false);
                eug1.m40073o(coordinatorLayout, hc80VarM40067h);
                ((q1b) this.f153720f).m71918b(coordinatorLayout);
                return new sut((String) this.f153716b, coordinatorLayout, (vhl) this.f153719e, (rhl) this.f153718d, (b250) this.f153717c, h9y0VarM93069n, (fiz) this.f153721g, bundle);
            case 2:
                ovf ovfVarMo26174a = ((iju) this.f153716b).mo26174a(null);
                ConstraintLayout constraintLayout = (ConstraintLayout) ((etz) ((awo) ovfVarMo26174a).f20567b).f62823b;
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(constraintLayout, new FrameLayout.LayoutParams(-2, -2, 17));
                return new kt90(frameLayout, ovfVarMo26174a, (t2n) this.f153717c, (ae41) this.f153718d, (bsa) this.f153719e, (sef0) this.f153720f, ((jt90) this.f153721g).f115768b);
            case 3:
                return new rck0((ndk0) ((i4t0) this.f153716b).get(), (Completable) this.f153717c, (z9j0) this.f153718d, (xdk0) this.f153719e, (ske) this.f153720f, (Flowable) this.f153721g, context, layoutInflater);
            default:
                return new s9u0(this, context, viewGroup);
        }
    }

    public ngj(o9u0 o9u0Var, dy0 dy0Var, q831 q831Var, xzo xzoVar, z9j0 z9j0Var, rmm0 rmm0Var) {
        this.f153715a = 4;
        this.f153717c = o9u0Var;
        this.f153718d = dy0Var;
        this.f153719e = q831Var;
        this.f153720f = xzoVar;
        this.f153721g = z9j0Var;
        this.f153716b = rmm0Var;
    }
}
