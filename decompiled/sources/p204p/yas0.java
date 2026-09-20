package p204p;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes8.dex */
public final class yas0 {

    /* JADX INFO: renamed from: a */
    public final djs f270991a;

    /* JADX INFO: renamed from: b */
    public final kv91 f270992b;

    /* JADX INFO: renamed from: c */
    public final f9k0 f270993c;

    /* JADX INFO: renamed from: d */
    public ViewGroup f270994d;

    /* JADX INFO: renamed from: e */
    public View f270995e;

    /* JADX INFO: renamed from: f */
    public View f270996f;

    /* JADX INFO: renamed from: g */
    public boolean f270997g;

    /* JADX INFO: renamed from: h */
    public String f270998h;

    /* JADX INFO: renamed from: i */
    public final LinearInterpolator f270999i = new LinearInterpolator();

    /* JADX INFO: renamed from: j */
    public final xas0 f271000j = new xas0(this, 1);

    /* JADX INFO: renamed from: k */
    public final xas0 f271001k = new xas0(this, 0);

    public yas0(djs djsVar, kv91 kv91Var, f9k0 f9k0Var) {
        this.f270991a = djsVar;
        this.f270992b = kv91Var;
        this.f270993c = f9k0Var;
    }

    /* JADX INFO: renamed from: a */
    public final ka91 m93218a(View view, View view2) {
        ka91 ka91Var = new ka91();
        ka91Var.m55891Y(0);
        wq21 wq21Var = new wq21(80);
        wq21Var.f279801c = 500L;
        LinearInterpolator linearInterpolator = this.f270999i;
        wq21Var.f279802d = linearInterpolator;
        wq21Var.mo55893c(view2);
        ka91Var.m55887U(wq21Var);
        wq21 wq21Var2 = new wq21(48);
        wq21Var2.f279801c = 500L;
        wq21Var2.f279802d = linearInterpolator;
        wq21Var2.mo55893c(view);
        ka91Var.m55887U(wq21Var2);
        return ka91Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m93219b() {
        View view;
        View view2;
        ViewGroup viewGroup = this.f270994d;
        if (viewGroup == null || (view = this.f270995e) == null || (view2 = this.f270996f) == null) {
            return;
        }
        viewGroup.removeCallbacks(this.f271001k);
        if (this.f270997g) {
            this.f270997g = false;
            o891.m66421a(viewGroup, m93218a(view, view2));
            view2.setVisibility(4);
            view.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m93220c() {
        ViewGroup viewGroup = this.f270994d;
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeCallbacks(this.f271000j);
        viewGroup.removeCallbacks(this.f271001k);
        if (viewGroup.isAttachedToWindow()) {
            o891.m66422b(viewGroup);
        }
        if (this.f270997g) {
            this.f270997g = false;
            View view = this.f270996f;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = this.f270995e;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m93221d(String str, ViewGroup viewGroup, View view, View view2) {
        if (this.f270997g) {
            return;
        }
        this.f270994d = viewGroup;
        this.f270995e = view;
        this.f270996f = view2;
        this.f270997g = true;
        this.f270998h = str;
        xas0 xas0Var = this.f271001k;
        viewGroup.removeCallbacks(xas0Var);
        viewGroup.postDelayed(this.f271000j, 500L);
        viewGroup.postDelayed(xas0Var, 5500L);
    }
}
