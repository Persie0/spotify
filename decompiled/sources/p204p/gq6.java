package p204p;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class gq6 {

    /* JADX INFO: renamed from: a */
    public final cq6 f83364a;

    /* JADX INFO: renamed from: b */
    public final boolean f83365b;

    /* JADX INFO: renamed from: c */
    public View f83366c;

    /* JADX INFO: renamed from: d */
    public View f83367d;

    /* JADX INFO: renamed from: e */
    public Rect f83368e;

    /* JADX INFO: renamed from: f */
    public Float f83369f;

    /* JADX INFO: renamed from: g */
    public final n95 f83370g;

    public gq6(ofm0 ofm0Var, hc80 hc80Var, nqc1 nqc1Var, kk4 kk4Var) {
        this.f83368e = (Rect) nqc1Var.mo44173a().mo33098e();
        n95 n95Var = new n95(14, new sr5(this, 18));
        this.f83370g = n95Var;
        a6m0 a6m0Var = (a6m0) ofm0Var.mo15684j0(a6m0.class).mo31538a();
        if (a6m0Var == null || !a6m0Var.f12824a) {
            this.f83364a = new vkj0();
            this.f83365b = false;
        } else {
            this.f83364a = new rxo(n95Var, kk4Var.m56638a());
            this.f83365b = true;
        }
        nqc1Var.mo44173a().m33099f(hc80Var, new iz0(this, 2));
    }

    /* JADX INFO: renamed from: a */
    public static RecyclerView m45410a(View view) {
        RecyclerView recyclerViewM45410a;
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        Iterator it = new ek5((ViewGroup) view, 8).iterator();
        do {
            C2042k7 c2042k7 = (C2042k7) it;
            if (!c2042k7.hasNext()) {
                return null;
            }
            recyclerViewM45410a = m45410a((View) c2042k7.next());
        } while (recyclerViewM45410a == null);
        return recyclerViewM45410a;
    }
}
