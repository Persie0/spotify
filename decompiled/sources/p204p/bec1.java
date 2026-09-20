package p204p;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class bec1 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public swd1 f26330a = null;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f26331b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t6l0 f26332c;

    public bec1(View view, t6l0 t6l0Var) {
        this.f26331b = view;
        this.f26332c = t6l0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        swd1 swd1VarM79536g = swd1.m79536g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        t6l0 t6l0Var = this.f26332c;
        if (i < 30) {
            cec1.m32537a(windowInsets, this.f26331b);
            if (swd1VarM79536g.equals(this.f26330a)) {
                return t6l0Var.mo24684x(view, swd1VarM79536g).m79541f();
            }
        }
        this.f26330a = swd1VarM79536g;
        swd1 swd1VarMo24684x = t6l0Var.mo24684x(view, swd1VarM79536g);
        if (i >= 30) {
            return swd1VarMo24684x.m79541f();
        }
        WeakHashMap weakHashMap = mec1.f142677a;
        aec1.m25717c(view);
        return swd1VarMo24684x.m79541f();
    }
}
