package p204p;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ej00 implements t6l0 {

    /* JADX INFO: renamed from: a */
    public final View f60097a;

    public /* synthetic */ ej00(View view) {
        this.f60097a = view;
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        View view2 = this.f60097a;
        view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop() + swd1Var.f214650a.mo51806g(519).f53849b, view2.getPaddingRight(), view2.getPaddingBottom());
        WeakHashMap weakHashMap = mec1.f142677a;
        cec1.m32550n(view2, null);
        return swd1Var;
    }
}
