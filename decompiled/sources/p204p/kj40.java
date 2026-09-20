package p204p;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import com.spotify.adsdisplay.browser.BreadcrumbException;
import com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity;
import com.spotify.messages.InAppBrowserEvent;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class kj40 implements fmd1, onp {

    /* JADX INFO: renamed from: L0 */
    public final toh f123220L0;

    /* JADX INFO: renamed from: M0 */
    public final lm0 f123221M0;

    /* JADX INFO: renamed from: N0 */
    public long f123222N0;

    /* JADX INFO: renamed from: O0 */
    public long f123223O0;

    /* JADX INFO: renamed from: P0 */
    public int f123224P0;

    /* JADX INFO: renamed from: Q0 */
    public final String f123225Q0;

    /* JADX INFO: renamed from: R0 */
    public final lwr f123226R0;

    /* JADX INFO: renamed from: S0 */
    public final PublishSubject f123227S0;

    /* JADX INFO: renamed from: T0 */
    public ij40 f123228T0;

    /* JADX INFO: renamed from: X */
    public final qre0 f123229X;

    /* JADX INFO: renamed from: Y */
    public final xre f123230Y;

    /* JADX INFO: renamed from: Z */
    public final u4l0 f123231Z;

    /* JADX INFO: renamed from: a */
    public final nj40 f123232a;

    /* JADX INFO: renamed from: b */
    public final imd1 f123233b;

    /* JADX INFO: renamed from: c */
    public final xje f123234c;

    /* JADX INFO: renamed from: d */
    public final r0z f123235d;

    /* JADX INFO: renamed from: e */
    public final ClipboardManager f123236e;

    /* JADX INFO: renamed from: f */
    public final bka1 f123237f;

    /* JADX INFO: renamed from: g */
    public final wh51 f123238g;

    /* JADX INFO: renamed from: h */
    public final gcu0 f123239h;

    /* JADX INFO: renamed from: i */
    public final jyx0 f123240i;

    /* JADX INFO: renamed from: t */
    public final q831 f123241t;

    public kj40(nj40 nj40Var, imd1 imd1Var, xje xjeVar, r0z r0zVar, ClipboardManager clipboardManager, bka1 bka1Var, wh51 wh51Var, gcu0 gcu0Var, jyx0 jyx0Var, q831 q831Var, qre0 qre0Var, xre xreVar, u4l0 u4l0Var, hc80 hc80Var, toh tohVar, lm0 lm0Var) {
        this.f123232a = nj40Var;
        this.f123233b = imd1Var;
        this.f123234c = xjeVar;
        this.f123235d = r0zVar;
        this.f123236e = clipboardManager;
        this.f123237f = bka1Var;
        this.f123238g = wh51Var;
        this.f123239h = gcu0Var;
        this.f123240i = jyx0Var;
        this.f123241t = q831Var;
        this.f123229X = qre0Var;
        this.f123230Y = xreVar;
        this.f123231Z = u4l0Var;
        this.f123220L0 = tohVar;
        this.f123221M0 = lm0Var;
        hc80Var.getLifecycle().mo31986a(this);
        imd1Var.f103693b = this;
        this.f123222N0 = System.currentTimeMillis();
        this.f123224P0 = 1;
        this.f123225Q0 = UUID.randomUUID().toString();
        this.f123226R0 = new lwr();
        this.f123227S0 = new PublishSubject();
    }

    /* JADX INFO: renamed from: a */
    public final qzn m56549a() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(m56550b().f102688a));
        Activity activity = this.f123234c.f262111a;
        ResolveInfo resolveInfoResolveActivity = activity.getPackageManager().resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity != null) {
            return new qzn(activity, resolveInfoResolveActivity);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final ij40 m56550b() {
        ij40 ij40Var = this.f123228T0;
        if (ij40Var != null) {
            return ij40Var;
        }
        wj50.m88260d0("metadata");
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m56551c(aka1 aka1Var) {
        if (aka1Var instanceof tol0) {
            this.f123233b.m51093a(((tol0) aka1Var).f222285a);
            return true;
        }
        if (!this.f123238g.m88106q(aka1Var)) {
            return false;
        }
        InAppBrowserActivity inAppBrowserActivity = (InAppBrowserActivity) this.f123232a;
        inAppBrowserActivity.finish();
        View view = inAppBrowserActivity.f2690f1;
        if (view == null) {
            wj50.m88260d0("errorView");
            throw null;
        }
        view.setVisibility(8);
        inAppBrowserActivity.mo2757L().setVisibility(8);
        m56552d(aka1Var.mo24516a());
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m56552d(String str) {
        ol60 ol60Var = new ol60();
        n0e1.m63401I(ol60Var, "unsupportedUri", str);
        nl60 nl60VarM67277a = ol60Var.m67277a();
        hj40 hj40VarM13911x = InAppBrowserEvent.m13911x();
        bif1.m29317A(hj40VarM13911x, 6);
        hj40VarM13911x.m47651m(m56550b().f102689b);
        hj40VarM13911x.m47653r(m56550b().f102688a);
        hj40VarM13911x.m47652q(m56550b().f102691d);
        ((wy3) this.f123230Y).getClass();
        hj40VarM13911x.m47660y(System.currentTimeMillis());
        int i = this.f123224P0;
        this.f123224P0 = i + 1;
        hj40VarM13911x.m47657v(i);
        hj40VarM13911x.m47656u(((InAppBrowserActivity) this.f123232a).m2759u0());
        hj40VarM13911x.m47658w(this.f123225Q0);
        bif1.m29345z(hj40VarM13911x, nl60VarM67277a);
        d1h1.m34650k(this.f123229X, hj40VarM13911x);
    }

    /* JADX INFO: renamed from: e */
    public final void m56553e(String str) {
        Object c6x0Var;
        try {
            c6x0Var = new URL(str).getHost();
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (c6x0Var instanceof c6x0) {
            c6x0Var = null;
        }
        String str2 = (String) c6x0Var;
        if (str2 != null) {
            str = str2;
        }
        InAppBrowserActivity inAppBrowserActivity = (InAppBrowserActivity) this.f123232a;
        inAppBrowserActivity.f2698n1.m39516c(InAppBrowserActivity.f2687r1[1], inAppBrowserActivity, str);
    }

    /* JADX INFO: renamed from: f */
    public final void m56554f(String str) {
        List listM29659h = this.f123237f.m29659h(str, new e840(1, this, kj40.class, "onForbiddenUri", "onForbiddenUri(Ljava/lang/String;)V", 0, 0, 1));
        listM29659h.toString();
        if (!listM29659h.isEmpty()) {
            Iterator it = listM29659h.iterator();
            while (it.hasNext()) {
                if (m56551c((aka1) it.next())) {
                    return;
                }
            }
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        u4l0 u4l0Var = this.f123231Z;
        this.f123226R0.m60127a(Observable.timer(3000L, timeUnit, (Scheduler) u4l0Var.f226772b).takeUntil(this.f123227S0).observeOn((Scheduler) u4l0Var.f226773c).onErrorResumeNext(new m8p0(new BreadcrumbException(), 23)).subscribe(new tjp(22, this, str)));
    }

    /* JADX INFO: renamed from: g */
    public final void m56555g() {
        wg61 wg61Var = this.f123233b.f103694c;
        ((WebView) wg61Var.getValue()).reload();
        String url = ((WebView) wg61Var.getValue()).getUrl();
        if (url == null) {
            return;
        }
        ol60 ol60Var = new ol60();
        n0e1.m63401I(ol60Var, "currentUrl", url);
        nl60 nl60VarM67277a = ol60Var.m67277a();
        hj40 hj40VarM13911x = InAppBrowserEvent.m13911x();
        bif1.m29317A(hj40VarM13911x, 8);
        hj40VarM13911x.m47651m(m56550b().f102689b);
        hj40VarM13911x.m47653r(m56550b().f102688a);
        hj40VarM13911x.m47652q(m56550b().f102691d);
        ((wy3) this.f123230Y).getClass();
        hj40VarM13911x.m47660y(System.currentTimeMillis());
        int i = this.f123224P0;
        this.f123224P0 = i + 1;
        hj40VarM13911x.m47657v(i);
        hj40VarM13911x.m47656u(((InAppBrowserActivity) this.f123232a).m2759u0());
        hj40VarM13911x.m47658w(this.f123225Q0);
        bif1.m29345z(hj40VarM13911x, nl60VarM67277a);
        d1h1.m34650k(this.f123229X, hj40VarM13911x);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m56556h(String str) {
        Object next;
        if (this.f123220L0.mo40534c(Uri.parse(str))) {
            m56552d(str);
            return true;
        }
        Iterator it = this.f123237f.m29659h(str, new e840(1, this, kj40.class, "onForbiddenUri", "onForbiddenUri(Ljava/lang/String;)V", 0, 0, 2)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((aka1) next) instanceof a2j0));
        aka1 aka1Var = (aka1) next;
        if (aka1Var == null) {
            return false;
        }
        return m56551c(aka1Var);
    }

    @Override // p204p.onp
    public final void onCreate(hc80 hc80Var) {
        ol60 ol60Var = new ol60();
        n0e1.m63401I(ol60Var, "browserType", "webView");
        nl60 nl60VarM67277a = ol60Var.m67277a();
        hj40 hj40VarM13911x = InAppBrowserEvent.m13911x();
        bif1.m29317A(hj40VarM13911x, 4);
        hj40VarM13911x.m47651m(m56550b().f102689b);
        hj40VarM13911x.m47653r(m56550b().f102688a);
        hj40VarM13911x.m47652q(m56550b().f102691d);
        ((wy3) this.f123230Y).getClass();
        hj40VarM13911x.m47660y(System.currentTimeMillis());
        int i = this.f123224P0;
        this.f123224P0 = i + 1;
        hj40VarM13911x.m47657v(i);
        hj40VarM13911x.m47656u(((InAppBrowserActivity) this.f123232a).m2759u0());
        hj40VarM13911x.m47658w(this.f123225Q0);
        bif1.m29345z(hj40VarM13911x, nl60VarM67277a);
        d1h1.m34650k(this.f123229X, hj40VarM13911x);
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        this.f123233b.f103693b = null;
        this.f123226R0.m60129c();
        hj40 hj40VarM13911x = InAppBrowserEvent.m13911x();
        bif1.m29317A(hj40VarM13911x, 1);
        hj40VarM13911x.m47651m(m56550b().f102689b);
        hj40VarM13911x.m47653r(m56550b().f102688a);
        hj40VarM13911x.m47652q(m56550b().f102691d);
        ((wy3) this.f123230Y).getClass();
        hj40VarM13911x.m47660y(System.currentTimeMillis());
        hj40VarM13911x.m47659x(this.f123223O0);
        int i = this.f123224P0;
        this.f123224P0 = i + 1;
        hj40VarM13911x.m47657v(i);
        hj40VarM13911x.m47656u(((InAppBrowserActivity) this.f123232a).m2759u0());
        hj40VarM13911x.m47658w(this.f123225Q0);
        d1h1.m34650k(this.f123229X, hj40VarM13911x);
    }

    @Override // p204p.onp
    public final void onStart(hc80 hc80Var) {
        ((wy3) this.f123230Y).getClass();
        this.f123222N0 = System.currentTimeMillis();
    }

    @Override // p204p.onp
    public final void onStop(hc80 hc80Var) {
        long j = this.f123223O0;
        ((wy3) this.f123230Y).getClass();
        this.f123223O0 = (System.currentTimeMillis() - this.f123222N0) + j;
    }
}
