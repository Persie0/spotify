package p204p;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class mrc0 implements t6l0, InterfaceC1667ah {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f146470a;

    public /* synthetic */ mrc0(View view) {
        this.f146470a = view;
    }

    @Override // p204p.InterfaceC1667ah
    /* JADX INFO: renamed from: q */
    public boolean mo1561q(View view) {
        this.f146470a.performClick();
        return true;
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        WeakHashMap weakHashMap = mec1.f142677a;
        swd1 swd1VarM35774a = dec1.m35774a(view);
        dx40 dx40VarMo51806g = swd1VarM35774a != null ? swd1VarM35774a.f214650a.mo51806g(647) : null;
        if (dx40VarMo51806g != null) {
            int i = dx40VarMo51806g.f53850c;
            View view2 = this.f146470a;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                int i2 = marginLayoutParams.leftMargin;
                int i3 = -dx40VarMo51806g.f53848a;
                if (i2 != i3 || marginLayoutParams.rightMargin != (-i)) {
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = -i;
                    view2.setLayoutParams(marginLayoutParams);
                }
            }
        }
        return swd1Var;
    }
}
