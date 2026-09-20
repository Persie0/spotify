package p204p;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class vwd1 extends m3h1 {

    /* JADX INFO: renamed from: b */
    public final Window f245476b;

    /* JADX INFO: renamed from: c */
    public final gjv0 f245477c;

    public vwd1(Window window, gjv0 gjv0Var) {
        this.f245476b = window;
        this.f245477c = gjv0Var;
    }

    /* JADX INFO: renamed from: A */
    public final void m86558A(int i) {
        this.f245476b.clearFlags(i);
    }

    @Override // p204p.m3h1
    /* JADX INFO: renamed from: o */
    public final void mo60684o(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    m86559x(4);
                } else if (i2 == 2) {
                    m86559x(2);
                } else if (i2 == 8) {
                    ((jhz0) this.f245477c.f80569b).mo53434f();
                }
            }
        }
    }

    @Override // p204p.m3h1
    /* JADX INFO: renamed from: r */
    public final void mo60686r(boolean z) {
        if (!z) {
            m86561z(8192);
            return;
        }
        m86558A(67108864);
        m86560y();
        m86559x(8192);
    }

    @Override // p204p.m3h1
    /* JADX INFO: renamed from: s */
    public final void mo60687s(int i) {
        this.f245476b.getDecorView().setTag(356039078, Integer.valueOf(i));
        if (i == 0) {
            m86561z(6144);
            return;
        }
        if (i == 1) {
            m86561z(4096);
            m86559x(2048);
        } else {
            if (i != 2) {
                return;
            }
            m86561z(2048);
            m86559x(4096);
        }
    }

    @Override // p204p.m3h1
    /* JADX INFO: renamed from: u */
    public final void mo60688u(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    m86561z(4);
                    m86558A(1024);
                } else if (i2 == 2) {
                    m86561z(2);
                } else if (i2 == 8) {
                    ((jhz0) this.f245477c.f80569b).mo53437i();
                }
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m86559x(int i) {
        View decorView = this.f245476b.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    /* JADX INFO: renamed from: y */
    public final void m86560y() {
        this.f245476b.addFlags(Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: z */
    public final void m86561z(int i) {
        View decorView = this.f245476b.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
