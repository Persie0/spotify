package p204p;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.AbstractC0110a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class j5o0 implements owt, onp {

    /* JADX INFO: renamed from: a */
    public final owt f109024a;

    /* JADX INFO: renamed from: b */
    public final qe70 f109025b;

    /* JADX INFO: renamed from: c */
    public final gh00 f109026c;

    /* JADX INFO: renamed from: d */
    public Rect f109027d;

    /* JADX INFO: renamed from: e */
    public Rect f109028e;

    /* JADX INFO: renamed from: f */
    public int f109029f;

    /* JADX INFO: renamed from: g */
    public boolean f109030g;

    /* JADX WARN: Multi-variable type inference failed */
    public j5o0(owt owtVar, gh00 gh00Var, gh00 gh00Var2) {
        this.f109024a = owtVar;
        this.f109025b = (qe70) gh00Var;
        this.f109026c = gh00Var2;
        View view = owtVar.getView();
        p3h1.m69032r(view, new jam0(9, this, view));
        view.addOnAttachStateChangeListener(new rrp(7, this, new i5o0(this)));
    }

    /* JADX INFO: renamed from: b */
    public static RecyclerView m52459b(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            RecyclerView recyclerView = view2 instanceof RecyclerView ? (RecyclerView) view2 : null;
            AbstractC0110a layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null && linearLayoutManager.f1163O0 == 1) {
                return (RecyclerView) view2;
            }
        }
        if (view2 != null) {
            return m52459b(view2);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m52460c(Rect rect, Rect rect2) {
        if (rect2 == null || rect == null) {
            return false;
        }
        Rect rect3 = new Rect(rect);
        return rect3.intersect(rect2) && rect3.height() > 0;
    }

    @Override // p204p.owt
    /* JADX INFO: renamed from: a */
    public final void mo26764a(Object obj, ext extVar) {
        this.f109024a.mo26764a(obj, extVar);
    }

    @Override // p204p.owt
    public final View getView() {
        return this.f109024a.getView();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [p.gh00, p.qe70] */
    @Override // p204p.onp
    public final void onPause(hc80 hc80Var) {
        Object objInvoke;
        if (!this.f109030g || (objInvoke = this.f109025b.invoke(Boolean.FALSE)) == null) {
            return;
        }
        this.f109026c.invoke(objInvoke);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [p.gh00, p.qe70] */
    @Override // p204p.onp
    public final void onResume(hc80 hc80Var) {
        Object objInvoke;
        boolean zM52460c = m52460c(this.f109028e, this.f109027d);
        if (!this.f109030g || (objInvoke = this.f109025b.invoke(Boolean.valueOf(zM52460c))) == null) {
            return;
        }
        this.f109026c.invoke(objInvoke);
    }
}
