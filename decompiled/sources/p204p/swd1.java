package p204p;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class swd1 {

    /* JADX INFO: renamed from: b */
    public static final swd1 f214649b;

    /* JADX INFO: renamed from: a */
    public final pwd1 f214650a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            f214649b = owd1.f170699s;
        } else if (i >= 30) {
            f214649b = mwd1.f147771r;
        } else {
            f214649b = pwd1.f181995b;
        }
    }

    public swd1(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.f214650a = new owd1(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.f214650a = new nwd1(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.f214650a = new mwd1(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f214650a = new lwd1(this, windowInsets);
        } else if (i >= 28) {
            this.f214650a = new kwd1(this, windowInsets);
        } else {
            this.f214650a = new jwd1(this, windowInsets);
        }
    }

    /* JADX INFO: renamed from: e */
    public static dx40 m79535e(dx40 dx40Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, dx40Var.f53848a - i);
        int iMax2 = Math.max(0, dx40Var.f53849b - i2);
        int iMax3 = Math.max(0, dx40Var.f53850c - i3);
        int iMax4 = Math.max(0, dx40Var.f53851d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? dx40Var : dx40.m37189b(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: g */
    public static swd1 m79536g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        swd1 swd1Var = new swd1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = mec1.f142677a;
            swd1 swd1VarM35774a = dec1.m35774a(view);
            pwd1 pwd1Var = swd1Var.f214650a;
            pwd1Var.mo51814t(swd1VarM35774a);
            pwd1Var.mo51804d(view.getRootView());
            pwd1Var.mo51815v(view.getWindowSystemUiVisibility());
        }
        return swd1Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m79537a() {
        return this.f214650a.mo51808l().f53851d;
    }

    /* JADX INFO: renamed from: b */
    public final int m79538b() {
        return this.f214650a.mo51808l().f53848a;
    }

    /* JADX INFO: renamed from: c */
    public final int m79539c() {
        return this.f214650a.mo51808l().f53850c;
    }

    /* JADX INFO: renamed from: d */
    public final int m79540d() {
        return this.f214650a.mo51808l().f53849b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof swd1) {
            return p1m0.m68831l(this.f214650a, ((swd1) obj).f214650a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final WindowInsets m79541f() {
        pwd1 pwd1Var = this.f214650a;
        if (pwd1Var instanceof iwd1) {
            return ((iwd1) pwd1Var).f106406c;
        }
        return null;
    }

    public final int hashCode() {
        pwd1 pwd1Var = this.f214650a;
        if (pwd1Var == null) {
            return 0;
        }
        return pwd1Var.hashCode();
    }

    public swd1(swd1 swd1Var) {
        if (swd1Var != null) {
            pwd1 pwd1Var = swd1Var.f214650a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 34 && (pwd1Var instanceof owd1)) {
                this.f214650a = new owd1(this, (owd1) pwd1Var);
            } else if (i >= 31 && (pwd1Var instanceof nwd1)) {
                this.f214650a = new nwd1(this, (nwd1) pwd1Var);
            } else if (i >= 30 && (pwd1Var instanceof mwd1)) {
                this.f214650a = new mwd1(this, (mwd1) pwd1Var);
            } else if (i >= 29 && (pwd1Var instanceof lwd1)) {
                this.f214650a = new lwd1(this, (lwd1) pwd1Var);
            } else if (i >= 28 && (pwd1Var instanceof kwd1)) {
                this.f214650a = new kwd1(this, (kwd1) pwd1Var);
            } else if (pwd1Var instanceof jwd1) {
                this.f214650a = new jwd1(this, (jwd1) pwd1Var);
            } else if (pwd1Var instanceof iwd1) {
                this.f214650a = new iwd1(this, (iwd1) pwd1Var);
            } else {
                this.f214650a = new pwd1(this);
            }
            pwd1Var.mo51805e(this);
            return;
        }
        this.f214650a = new pwd1(this);
    }
}
