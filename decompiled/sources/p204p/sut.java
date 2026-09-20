package p204p;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.processors.BehaviorProcessor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class sut implements hr91, x3x0 {

    /* JADX INFO: renamed from: a */
    public final CoordinatorLayout f214213a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f214214b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f214215c;

    /* JADX INFO: renamed from: d */
    public Bundle f214216d;

    /* JADX INFO: renamed from: e */
    public final BehaviorProcessor f214217e;

    public sut(String str, CoordinatorLayout coordinatorLayout, out outVar, nut nutVar, b250 b250Var, h9y0 h9y0Var, fiz fizVar, Bundle bundle) {
        int id;
        this.f214213a = coordinatorLayout;
        hzd0 hzd0Var = new hzd0();
        this.f214214b = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f214215c = arrayList;
        this.f214216d = pp91.m70528i();
        BehaviorProcessor behaviorProcessor = new BehaviorProcessor();
        this.f214217e = behaviorProcessor;
        joc1.m53876c(coordinatorLayout, hhg1.m47529h(hhg1.m47529h(new x150(new rut(this, 1)), b250Var), new sam0(fizVar != null ? k0e1.m54986e(fizVar, dau.f47107a) : new FlowableOnBackpressureLatest(behaviorProcessor.m23356t(Functions.f7225a)))));
        qy8 qy8VarMo59789a = nutVar.mo59789a(hzd0Var);
        up60 up60Var = hxt.f96286w;
        coordinatorLayout.addView(ia7.m50020m(coordinatorLayout.getContext(), coordinatorLayout, qy8VarMo59789a, new kut(str), u1h1.m82222q(qy8VarMo59789a, "HeaderElement_key", h9y0Var, new kut(str)), 96).f96307t, new hqk(-1, -2));
        cut cutVarMo30264a = outVar.mo30264a(new qut(this, 0), new qut(this, 1), new rut(this, 0));
        Context context = coordinatorLayout.getContext();
        w2a1 w2a1Var = w2a1.f247311a;
        hxt hxtVarM50020m = ia7.m50020m(context, coordinatorLayout, cutVarMo30264a, w2a1Var, u1h1.m82222q(cutVarMo30264a, "TabsElement_key", h9y0Var, w2a1Var), 96);
        View view = hxtVarM50020m.f96307t;
        coordinatorLayout.addView(view);
        hqk hqkVar = new hqk(-1, -1);
        hqkVar.m48293b(new AppBarLayout.ScrollingViewBehavior());
        view.setLayoutParams(hqkVar);
        put putVar = new put(hxtVarM50020m);
        WeakHashMap weakHashMap = mec1.f142677a;
        cec1.m32550n(view, putVar);
        if (!coordinatorLayout.isLaidOut() || coordinatorLayout.isLayoutRequested()) {
            coordinatorLayout.addOnLayoutChangeListener(new agl(1));
        } else {
            View viewFindViewWithTag = coordinatorLayout.findViewWithTag("appBarLayout");
            if (viewFindViewWithTag != null) {
                viewFindViewWithTag.setFocusable(false);
                viewFindViewWithTag.setFocusableInTouchMode(false);
            }
            View viewFindViewWithTag2 = coordinatorLayout.findViewWithTag("backButton");
            View viewFindViewWithTag3 = coordinatorLayout.findViewWithTag("find");
            View viewFindViewWithTag4 = coordinatorLayout.findViewWithTag("headerTitle");
            View viewFindViewWithTag5 = coordinatorLayout.findViewWithTag("tabsContainer");
            View viewFindViewWithTag6 = coordinatorLayout.findViewWithTag("lastHeaderAction");
            if (viewFindViewWithTag2 != null) {
                if (viewFindViewWithTag3 != null) {
                    id = viewFindViewWithTag3.getId();
                } else {
                    id = viewFindViewWithTag4 != null ? viewFindViewWithTag4.getId() : -1;
                }
                viewFindViewWithTag2.setNextFocusForwardId(id);
            }
            if (viewFindViewWithTag3 != null) {
                viewFindViewWithTag3.setNextFocusForwardId(viewFindViewWithTag4 != null ? viewFindViewWithTag4.getId() : -1);
            }
            if (viewFindViewWithTag6 != null) {
                viewFindViewWithTag6.setNextFocusForwardId(viewFindViewWithTag5 != null ? viewFindViewWithTag5.getId() : -1);
            }
            if (viewFindViewWithTag2 != null) {
                viewFindViewWithTag2.requestFocus();
            }
        }
        if (bundle != null) {
            this.f214216d = bundle;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((gh00) it.next()).invoke(bundle);
            }
        }
    }

    @Override // p204p.hr91
    public final Object getView() {
        return this.f214213a;
    }

    @Override // p204p.hr91
    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        Iterator it = this.f214214b.iterator();
        while (it.hasNext()) {
            ((gh00) it.next()).invoke(bundle);
        }
        return bundle;
    }

    @Override // p204p.hr91
    public final void start() {
        this.f214217e.onNext(Boolean.TRUE);
    }

    @Override // p204p.hr91
    public final void stop() {
        BehaviorProcessor behaviorProcessor = this.f214217e;
        if (behaviorProcessor.m23784f0()) {
            behaviorProcessor.onNext(Boolean.FALSE);
        }
    }
}
