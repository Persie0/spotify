package p204p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatMapCompletable;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class b2q0 {

    /* JADX INFO: renamed from: a */
    public final er70 f22670a;

    /* JADX INFO: renamed from: b */
    public final er70 f22671b;

    /* JADX INFO: renamed from: c */
    public final i4t0 f22672c;

    /* JADX INFO: renamed from: d */
    public final i4t0 f22673d;

    /* JADX INFO: renamed from: e */
    public final i4t0 f22674e;

    /* JADX INFO: renamed from: f */
    public final i4t0 f22675f;

    /* JADX INFO: renamed from: g */
    public final s5m0 f22676g;

    /* JADX INFO: renamed from: h */
    public final r3n0 f22677h;

    /* JADX INFO: renamed from: i */
    public final Context f22678i;

    /* JADX INFO: renamed from: j */
    public final Optional f22679j;

    /* JADX INFO: renamed from: k */
    public final CompositeDisposable f22680k = new CompositeDisposable();

    public b2q0(er70 er70Var, er70 er70Var2, h4t0 h4t0Var, h4t0 h4t0Var2, h4t0 h4t0Var3, h4t0 h4t0Var4, s5m0 s5m0Var, r3n0 r3n0Var, Context context, Optional optional) {
        this.f22670a = er70Var;
        this.f22671b = er70Var2;
        this.f22672c = h4t0Var;
        this.f22673d = h4t0Var2;
        this.f22674e = h4t0Var3;
        this.f22675f = h4t0Var4;
        this.f22676g = s5m0Var;
        this.f22677h = r3n0Var;
        this.f22678i = context;
        this.f22679j = optional;
    }

    /* JADX INFO: renamed from: a */
    public final void m27966a(String str, String str2) {
        this.f22680k.mo23393b(((ufn0) this.f22674e.get()).m83023a(str).subscribe(new wk6(str2, (Object) this, (Object) str, 20), new o4n0(this, 15)));
    }

    /* JADX INFO: renamed from: b */
    public final void m27967b() {
        this.f22680k.m23396g();
        ((d2q0) this.f22670a.get()).m34791b();
    }

    /* JADX INFO: renamed from: c */
    public final void m27968c(ck11 ck11Var, String str, String str2, String str3, String str4) {
        ((d2q0) this.f22670a.get()).m34790a(str4, mkg1.m62164z(ck11Var), mkg1.m62162x(ck11Var), new kt51((e940) this.f22671b.get(), str, str2, str3, ck11Var.m33016v(), ck11Var.m33013s()));
    }

    /* JADX INFO: renamed from: d */
    public final CompletableEmpty m27969d(String str, boolean z, String str2, String str3, String str4, String str5, ok11 ok11Var, String str6, tu00 tu00Var) {
        Object objM33012r;
        String strM83388v;
        if ((ok11Var != null ? ok11Var.f166222j : null) != null) {
            Optional optional = this.f22679j;
            if (optional.isPresent() && ((bge0) optional.get()).m29119a(str)) {
                return CompletableEmpty.f7437a;
            }
        }
        if (ok11Var == null || (objM33012r = ok11Var.f166213a) == null) {
            return CompletableEmpty.f7437a;
        }
        if (objM33012r instanceof ck11) {
            ck11 ck11Var = (ck11) objM33012r;
            int iM33015u = ck11Var.m33015u();
            int i = iM33015u == 0 ? -1 : a2q0.f11715a[edb.m38547C(iM33015u)];
            if (i == -1) {
                if (tu00Var != null && (strM83388v = ulg1.m83388v(tu00Var)) != null) {
                    objM33012r = ck11.m33012r(ck11Var, strM83388v);
                }
                m27968c((ck11) objM33012r, str2, str3, str4, str5);
            } else if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (tu00Var != null) {
                    objM33012r = ck11.m33012r(ck11Var, strM83388v);
                }
                m27968c((ck11) objM33012r, str2, str3, str4, str5);
            } else if (ck11Var.m33017w() != null) {
                hha1 hha1Var = (hha1) this.f22673d.get();
                String str7 = str4 == null ? "" : str4;
                String strM33017w = ck11Var.m33017w();
                hha1Var.m47505b(new gha1(ck11Var.m33016v(), ck11Var.m33013s(), str6, "", ck11Var.m33014t(), str7, strM33017w == null ? "" : strM33017w, this.f22678i.getString(R.string.premium_label)), false);
            } else {
                m27968c(ck11Var, str2, str3, str4, str5);
            }
            CompletableEmpty completableEmpty = CompletableEmpty.f7437a;
            wj50.m88279p(completableEmpty);
            return completableEmpty;
        }
        boolean z2 = objM33012r instanceof fk11;
        i4t0 i4t0Var = this.f22672c;
        if (z2) {
            ((zu00) i4t0Var.get()).m96994b((fk11) objM33012r, str4, str, z);
            CompletableEmpty completableEmpty2 = CompletableEmpty.f7437a;
            wj50.m88279p(completableEmpty2);
            return completableEmpty2;
        }
        if (objM33012r instanceof hk11) {
            bk11 bk11Var = ok11Var.f166218f;
            kk11 kk11VarM29572a = bk11Var != null ? bk11Var.m29572a() : null;
            if (kk11VarM29572a != null) {
                ((zu00) i4t0Var.get()).m96995c((hk11) objM33012r, str, kk11VarM29572a.m56630a(), kk11VarM29572a.m56631b());
            } else {
                Logger.m3966b("Price info were not available for web checkout overlay dialog", new Object[0]);
            }
            CompletableEmpty completableEmpty3 = CompletableEmpty.f7437a;
            wj50.m88279p(completableEmpty3);
            return completableEmpty3;
        }
        if (objM33012r instanceof gk11) {
            this.f22680k.mo23393b(((h97) this.f22675f.get()).m46863a(new h0e(str, 0.0d)).onErrorComplete().subscribe());
            CompletableEmpty completableEmpty4 = CompletableEmpty.f7437a;
            wj50.m88279p(completableEmpty4);
            return completableEmpty4;
        }
        if (!(objM33012r instanceof dk11)) {
            if (objM33012r instanceof ek11) {
                return CompletableEmpty.f7437a;
            }
            throw new NoWhenBranchMatchedException();
        }
        this.f22676g.m77283a(str);
        CompletableEmpty completableEmpty5 = CompletableEmpty.f7437a;
        wj50.m88279p(completableEmpty5);
        return completableEmpty5;
    }

    /* JADX INFO: renamed from: e */
    public final void m27970e(String str) {
        new MaybeFlatMapCompletable(this.f22677h.m74697t(str), new wel0(this, 12)).subscribe();
    }
}
