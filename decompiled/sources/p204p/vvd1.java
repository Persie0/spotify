package p204p;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class vvd1 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public final ptc f245216a;

    /* JADX INFO: renamed from: b */
    public swd1 f245217b;

    public vvd1(View view, ptc ptcVar) {
        swd1 swd1VarMo30680b;
        this.f245216a = ptcVar;
        WeakHashMap weakHashMap = mec1.f142677a;
        swd1 swd1VarM35774a = dec1.m35774a(view);
        if (swd1VarM35774a != null) {
            int i = Build.VERSION.SDK_INT;
            swd1VarMo30680b = (i >= 34 ? new gwd1(swd1VarM35774a) : i >= 31 ? new fwd1(swd1VarM35774a) : i >= 30 ? new ewd1(swd1VarM35774a) : i >= 29 ? new dwd1(swd1VarM35774a) : new bwd1(swd1VarM35774a)).mo30680b();
        } else {
            swd1VarMo30680b = null;
        }
        this.f245217b = swd1VarMo30680b;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.f245217b = swd1.m79536g(view, windowInsets);
            return wvd1.m89087j(view, windowInsets);
        }
        swd1 swd1VarM79536g = swd1.m79536g(view, windowInsets);
        pwd1 pwd1Var = swd1VarM79536g.f214650a;
        if (this.f245217b == null) {
            WeakHashMap weakHashMap = mec1.f142677a;
            this.f245217b = dec1.m35774a(view);
        }
        if (this.f245217b == null) {
            this.f245217b = swd1VarM79536g;
            return wvd1.m89087j(view, windowInsets);
        }
        ptc ptcVarM89088k = wvd1.m89088k(view);
        if (ptcVarM89088k != null && Objects.equals((swd1) ptcVarM89088k.f181100b, swd1VarM79536g)) {
            return wvd1.m89087j(view, windowInsets);
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        swd1 swd1Var = this.f245217b;
        int i = 1;
        while (i <= 512) {
            dx40 dx40VarMo51806g = pwd1Var.mo51806g(i);
            dx40 dx40VarMo51806g2 = swd1Var.f214650a.mo51806g(i);
            int i2 = dx40VarMo51806g.f53848a;
            int i3 = dx40VarMo51806g.f53851d;
            int i4 = dx40VarMo51806g.f53850c;
            int i5 = dx40VarMo51806g.f53849b;
            int i6 = dx40VarMo51806g2.f53848a;
            int i7 = dx40VarMo51806g2.f53851d;
            int i8 = dx40VarMo51806g2.f53850c;
            int i9 = dx40VarMo51806g2.f53849b;
            boolean z = i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7;
            if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                if (z) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr2[0] = iArr2[0] | i;
                }
            }
            i <<= 1;
            iArr = iArr;
        }
        int i10 = iArr[0];
        int i11 = iArr2[0];
        int i12 = i10 | i11;
        if (i12 == 0) {
            this.f245217b = swd1VarM79536g;
            return wvd1.m89087j(view, windowInsets);
        }
        swd1 swd1Var2 = this.f245217b;
        if ((i10 & 8) != 0) {
            interpolator = wvd1.f255475e;
        } else if ((i11 & 8) != 0) {
            interpolator = wvd1.f255476f;
        } else if ((i10 & 519) != 0) {
            interpolator = wvd1.f255477g;
        } else {
            interpolator = (i11 & 519) != 0 ? wvd1.f255478h : null;
        }
        awd1 awd1Var = new awd1(i12, interpolator, (i12 & 8) != 0 ? 160L : 250L);
        awd1Var.m27306f(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(awd1Var.f20489a.mo94689b());
        dx40 dx40VarMo51806g3 = pwd1Var.mo51806g(i12);
        dx40 dx40VarMo51806g4 = swd1Var2.f214650a.mo51806g(i12);
        int iMin = Math.min(dx40VarMo51806g3.f53848a, dx40VarMo51806g4.f53848a);
        int i13 = dx40VarMo51806g3.f53849b;
        int i14 = dx40VarMo51806g4.f53849b;
        int iMin2 = Math.min(i13, i14);
        int i15 = dx40VarMo51806g3.f53850c;
        int i16 = dx40VarMo51806g4.f53850c;
        int iMin3 = Math.min(i15, i16);
        int i17 = dx40VarMo51806g3.f53851d;
        int i18 = dx40VarMo51806g4.f53851d;
        yya1 yya1Var = new yya1(12, dx40.m37189b(iMin, iMin2, iMin3, Math.min(i17, i18)), dx40.m37189b(Math.max(dx40VarMo51806g3.f53848a, dx40VarMo51806g4.f53848a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
        wvd1.m89084g(view, awd1Var, swd1VarM79536g, false);
        duration.addUpdateListener(new uvd1(awd1Var, swd1VarM79536g, swd1Var2, i12, view));
        duration.addListener(new g9p(7, awd1Var, view));
        inl0.m51135a(view, new qk8(view, awd1Var, yya1Var, duration, 17));
        this.f245217b = swd1VarM79536g;
        return wvd1.m89087j(view, windowInsets);
    }
}
