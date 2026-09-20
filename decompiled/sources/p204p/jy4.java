package p204p;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes9.dex */
public final class jy4 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f117285a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f117286b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f117287c;

    public /* synthetic */ jy4(View view, float f, int i) {
        this.f117285a = i;
        this.f117287c = view;
        this.f117286b = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f117285a) {
            case 0:
                ly4 ly4Var = (ly4) this.f117287c;
                gy4 gy4Var = ly4Var.f137950a;
                gy4Var.getClass();
                gy4Var.f85426B = n0e1.m63436m(this.f117286b, 2.0f, 40.0f);
                ly4.m60215a(ly4Var);
                break;
            default:
                z9k0 z9k0Var = (z9k0) this.f117287c;
                s9k0 s9k0Var = z9k0Var.f280817b;
                if (s9k0Var != null && s9k0Var.f206967a) {
                    z9k0Var.f280819d = true;
                    z9k0Var.f280820e = this.f117286b;
                    z9k0Var.f280821f = z9k0Var.getHeight();
                    s9k0 s9k0Var2 = z9k0Var.f280817b;
                    wj50.m88279p(s9k0Var2);
                    z9k0Var.f280822g = s9k0Var2.m77586a(z9k0Var.getHeight()) >= 0.75f;
                    ViewParent parent = z9k0Var.getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    gh00 onEvent = z9k0Var.getOnEvent();
                    if (onEvent != null) {
                        onEvent.invoke(w9k0.f249194a);
                    }
                    break;
                }
                break;
        }
    }
}
