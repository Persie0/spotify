package p204p;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes10.dex */
public final class r9u0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: b */
    public static final r9u0 f197122b = new r9u0(0);

    /* JADX INFO: renamed from: c */
    public static final r9u0 f197123c = new r9u0(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f197124a;

    public /* synthetic */ r9u0(int i) {
        this.f197124a = i;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f197124a) {
            case 0:
                dx40 dx40VarMo51806g = swd1.m79536g(null, windowInsets).f214650a.mo51806g(519);
                view.setPadding(dx40VarMo51806g.f53848a, dx40VarMo51806g.f53849b, dx40VarMo51806g.f53850c, dx40VarMo51806g.f53851d);
                return windowInsets;
            case 1:
                dx40 dx40VarMo51806g2 = swd1.m79536g(null, windowInsets).f214650a.mo51806g(519);
                view.setPadding(0, dx40VarMo51806g2.f53849b, 0, dx40VarMo51806g2.f53851d);
                return windowInsets;
            default:
                ogs ogsVar = (ogs) view;
                boolean z = false;
                boolean z2 = windowInsets.getSystemWindowInsetTop() > 0;
                ogsVar.f165234Y0 = windowInsets;
                ogsVar.f165235Z0 = z2;
                if (!z2 && ogsVar.getBackground() == null) {
                    z = true;
                }
                ogsVar.setWillNotDraw(z);
                ogsVar.requestLayout();
                return windowInsets.consumeSystemWindowInsets();
        }
    }
}
