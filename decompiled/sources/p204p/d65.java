package p204p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class d65 extends blc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45574a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f45575b;

    public /* synthetic */ d65(Object obj, int i) {
        this.f45574a = i;
        this.f45575b = obj;
    }

    @Override // p204p.alc1
    /* JADX INFO: renamed from: d */
    public final void mo26287d(View view) {
        int i = this.f45574a;
        Object obj = this.f45575b;
        switch (i) {
            case 0:
                l65 l65Var = (l65) ((n10) obj).f149215b;
                l65Var.f130196T0.setAlpha(1.0f);
                l65Var.f130199W0.m96317f(null);
                l65Var.f130199W0 = null;
                break;
            case 1:
                l65 l65Var2 = (l65) obj;
                l65Var2.f130196T0.setAlpha(1.0f);
                l65Var2.f130199W0.m96317f(null);
                l65Var2.f130199W0 = null;
                break;
            default:
                l65 l65Var3 = (l65) ((etq) obj).f62757c;
                l65Var3.f130196T0.setVisibility(8);
                PopupWindow popupWindow = l65Var3.f130197U0;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (l65Var3.f130196T0.getParent() instanceof View) {
                    View view2 = (View) l65Var3.f130196T0.getParent();
                    WeakHashMap weakHashMap = mec1.f142677a;
                    aec1.m25717c(view2);
                }
                l65Var3.f130196T0.m81e();
                l65Var3.f130199W0.m96317f(null);
                l65Var3.f130199W0 = null;
                ViewGroup viewGroup = l65Var3.f130203Y0;
                WeakHashMap weakHashMap2 = mec1.f142677a;
                aec1.m25717c(viewGroup);
                break;
        }
    }

    @Override // p204p.blc1, p204p.alc1
    /* JADX INFO: renamed from: e */
    public void mo26288e() {
        int i = this.f45574a;
        Object obj = this.f45575b;
        switch (i) {
            case 0:
                ((l65) ((n10) obj).f149215b).f130196T0.setVisibility(0);
                break;
            case 1:
                l65 l65Var = (l65) obj;
                l65Var.f130196T0.setVisibility(0);
                if (l65Var.f130196T0.getParent() instanceof View) {
                    View view = (View) l65Var.f130196T0.getParent();
                    WeakHashMap weakHashMap = mec1.f142677a;
                    aec1.m25717c(view);
                }
                break;
        }
    }
}
