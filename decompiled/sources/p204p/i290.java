package p204p;

import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class i290 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f97777a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k290 f97778b;

    public /* synthetic */ i290(k290 k290Var, int i) {
        this.f97777a = i;
        this.f97778b = k290Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f97777a;
        k290 k290Var = this.f97778b;
        switch (i) {
            case 0:
                rhs rhsVar = k290Var.f118573c;
                if (rhsVar != null) {
                    rhsVar.setListSelectionHidden(true);
                    rhsVar.requestLayout();
                }
                break;
            default:
                rhs rhsVar2 = k290Var.f118573c;
                if (rhsVar2 != null) {
                    WeakHashMap weakHashMap = mec1.f142677a;
                    if (rhsVar2.isAttachedToWindow() && k290Var.f118573c.getCount() > k290Var.f118573c.getChildCount() && k290Var.f118573c.getChildCount() <= k290Var.f118570Z) {
                        k290Var.f118567W0.setInputMethodMode(2);
                        k290Var.mo42575m();
                        break;
                    }
                }
                break;
        }
    }
}
