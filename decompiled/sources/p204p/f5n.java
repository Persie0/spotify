package p204p;

import android.content.Context;
import android.text.format.DateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public final class f5n {

    /* JADX INFO: renamed from: a */
    public final ky90 f66109a;

    /* JADX INFO: renamed from: b */
    public final ox90 f66110b;

    /* JADX INFO: renamed from: c */
    public final e5n f66111c;

    /* JADX INFO: renamed from: d */
    public final e5n f66112d;

    /* JADX INFO: renamed from: e */
    public final h4t0 f66113e;

    /* JADX INFO: renamed from: f */
    public final e5n f66114f;

    /* JADX INFO: renamed from: g */
    public final h4t0 f66115g;

    /* JADX INFO: renamed from: h */
    public final h4t0 f66116h;

    public f5n(ky90 ky90Var, ox90 ox90Var) {
        this.f66109a = ky90Var;
        this.f66110b = ox90Var;
        int i = 0;
        this.f66111c = new e5n(this, 0, i);
        this.f66112d = new e5n(this, 2, i);
        this.f66113e = be21.m28868a(new e5n(this, 1, i));
        this.f66114f = new e5n(this, 4, i);
        this.f66115g = be21.m28868a(new e5n(this, 3, i));
        this.f66116h = be21.m28868a(new e5n(this, 5, i));
    }

    /* JADX INFO: renamed from: a */
    public final clq0 m40770a() {
        ky90 ky90Var = this.f66109a;
        Context context = ky90Var.getContext();
        jg31.m53271i(context);
        u9f0 u9f0VarMo57656H = ky90Var.mo57656H();
        jg31.m53271i(u9f0VarMo57656H);
        xpx xpxVarMo57652D = ky90Var.mo57652D();
        jg31.m53271i(xpxVarMo57652D);
        rqw rqwVar = new rqw(u9f0VarMo57656H, xpxVarMo57652D);
        Context context2 = ky90Var.getContext();
        jg31.m53271i(context2);
        Context context3 = ky90Var.getContext();
        jg31.m53271i(context3);
        Locale localeM53164b = bga.m29060C(context3.getResources().getConfiguration()).m53164b(0);
        if (localeM53164b == null) {
            localeM53164b = Locale.forLanguageTag(ihf1.m50635s());
        }
        xre xreVarMo57658c = ky90Var.mo57658c();
        jg31.m53271i(xreVarMo57658c);
        x1p0 x1p0Var = new x1p0(context2, localeM53164b, xreVarMo57658c);
        Context context4 = ky90Var.getContext();
        jg31.m53271i(context4);
        Locale localeM53164b2 = bga.m29060C(context4.getResources().getConfiguration()).m53164b(0);
        if (localeM53164b2 == null) {
            localeM53164b2 = Locale.forLanguageTag(ihf1.m50635s());
        }
        xre xreVarMo57658c2 = ky90Var.mo57658c();
        jg31.m53271i(xreVarMo57658c2);
        Context context5 = ky90Var.getContext();
        jg31.m53271i(context5);
        b141 b141Var = new b141(13, x1p0Var, new w221(localeM53164b2, xreVarMo57658c2, DateFormat.is24HourFormat(context5) ? ufr.f229861b : ufr.f229860a));
        gmx gmxVarMo57668p = ky90Var.mo57668p();
        jg31.m53271i(gmxVarMo57668p);
        p7d p7dVarMo57664k = ky90Var.mo57664k();
        jg31.m53271i(p7dVarMo57664k);
        vmz vmzVarMo57665l = ky90Var.mo57665l();
        jg31.m53271i(vmzVarMo57665l);
        return new clq0(context, rqwVar, b141Var, gmxVarMo57668p, this.f66111c, p7dVarMo57664k, vmzVarMo57665l, 10);
    }
}
