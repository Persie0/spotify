package p204p;

import android.content.Context;
import android.text.format.DateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public final class c5n {

    /* JADX INFO: renamed from: a */
    public final nu90 f34220a;

    /* JADX INFO: renamed from: b */
    public final ox90 f34221b;

    /* JADX INFO: renamed from: c */
    public final c2n f34222c;

    /* JADX INFO: renamed from: d */
    public final c2n f34223d;

    /* JADX INFO: renamed from: e */
    public final h4t0 f34224e;

    /* JADX INFO: renamed from: f */
    public final c2n f34225f;

    /* JADX INFO: renamed from: g */
    public final h4t0 f34226g;

    public c5n(nu90 nu90Var, ox90 ox90Var) {
        this.f34220a = nu90Var;
        this.f34221b = ox90Var;
        int i = 29;
        this.f34222c = new c2n(this, 0, i);
        this.f34223d = new c2n(this, 2, i);
        this.f34224e = be21.m28868a(new c2n(this, 1, i));
        this.f34225f = new c2n(this, 4, i);
        this.f34226g = be21.m28868a(new c2n(this, 3, i));
    }

    /* JADX INFO: renamed from: a */
    public final clq0 m31487a() {
        nu90 nu90Var = this.f34220a;
        Context context = nu90Var.getContext();
        jg31.m53271i(context);
        u9f0 u9f0VarMo57656H = nu90Var.mo57656H();
        jg31.m53271i(u9f0VarMo57656H);
        xpx xpxVarMo57652D = nu90Var.mo57652D();
        jg31.m53271i(xpxVarMo57652D);
        rqw rqwVar = new rqw(u9f0VarMo57656H, xpxVarMo57652D);
        Context context2 = nu90Var.getContext();
        jg31.m53271i(context2);
        Context context3 = nu90Var.getContext();
        jg31.m53271i(context3);
        Locale localeM53164b = bga.m29060C(context3.getResources().getConfiguration()).m53164b(0);
        if (localeM53164b == null) {
            localeM53164b = Locale.forLanguageTag(ihf1.m50635s());
        }
        xre xreVarMo57658c = nu90Var.mo57658c();
        jg31.m53271i(xreVarMo57658c);
        x1p0 x1p0Var = new x1p0(context2, localeM53164b, xreVarMo57658c);
        Context context4 = nu90Var.getContext();
        jg31.m53271i(context4);
        Locale localeM53164b2 = bga.m29060C(context4.getResources().getConfiguration()).m53164b(0);
        if (localeM53164b2 == null) {
            localeM53164b2 = Locale.forLanguageTag(ihf1.m50635s());
        }
        xre xreVarMo57658c2 = nu90Var.mo57658c();
        jg31.m53271i(xreVarMo57658c2);
        Context context5 = nu90Var.getContext();
        jg31.m53271i(context5);
        b141 b141Var = new b141(13, x1p0Var, new w221(localeM53164b2, xreVarMo57658c2, DateFormat.is24HourFormat(context5) ? ufr.f229861b : ufr.f229860a));
        gmx gmxVarMo57668p = nu90Var.mo57668p();
        jg31.m53271i(gmxVarMo57668p);
        p7d p7dVarMo57664k = nu90Var.mo57664k();
        jg31.m53271i(p7dVarMo57664k);
        vmz vmzVarMo57665l = nu90Var.mo57665l();
        jg31.m53271i(vmzVarMo57665l);
        return new clq0(context, rqwVar, b141Var, gmxVarMo57668p, this.f34222c, p7dVarMo57664k, vmzVarMo57665l, 10);
    }
}
