package p204p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import com.spotify.remoteconfig.fetcherimpl.network.UcsRequestFailedException;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import io.reactivex.rxjava3.functions.Consumer;
import java.io.IOException;
import java.util.Map;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes6.dex */
public final class fxc1 implements Consumer {

    /* JADX INFO: renamed from: b */
    public static final fxc1 f74335b = new fxc1(0);

    /* JADX INFO: renamed from: c */
    public static final fxc1 f74336c = new fxc1(1);

    /* JADX INFO: renamed from: d */
    public static final fxc1 f74337d = new fxc1(2);

    /* JADX INFO: renamed from: e */
    public static final fxc1 f74338e = new fxc1(3);

    /* JADX INFO: renamed from: f */
    public static final fxc1 f74339f = new fxc1(4);

    /* JADX INFO: renamed from: g */
    public static final fxc1 f74340g = new fxc1(5);

    /* JADX INFO: renamed from: h */
    public static final fxc1 f74341h = new fxc1(6);

    /* JADX INFO: renamed from: i */
    public static final fxc1 f74342i = new fxc1(7);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f74343a;

    public /* synthetic */ fxc1(int i) {
        this.f74343a = i;
    }

    /* JADX INFO: renamed from: d */
    public static void m43006d(Throwable th) {
        Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) throws UcsRequestFailedException {
        switch (this.f74343a) {
            case 0:
                Throwable th = (Throwable) obj;
                Logger.m3967c(th, edb.m38564m("Up volume failure: ", th.getMessage()), new Object[0]);
                return;
            case 1:
                return;
            case 2:
                Logger.m3967c((Throwable) obj, "Couldn't update WazeBannerContent", new Object[0]);
                return;
            case 3:
                ((Throwable) obj).toString();
                return;
            case 4:
                ((Throwable) obj).toString();
                return;
            case 5:
                return;
            case 6:
                na6.m63959g("Error in event source", (Throwable) obj);
                return;
            case 7:
                return;
            case 8:
                C1672am c1672am = (C1672am) obj;
                boolean z = c1672am.f17018a;
                xul0 xul0Var = c1672am.f17020c;
                xul0 xul0Var2 = c1672am.f17019b;
                if (z && xul0Var2.mo49279c() && xul0Var.mo49279c()) {
                    d2y0 d2y0Var = (d2y0) xul0Var.mo49278b();
                    View view = (View) xul0Var2.mo49278b();
                    d2y0Var.f44696i = view;
                    if (view != null) {
                        r381 r381Var = d2y0Var.f44691d;
                        View viewInflate = LayoutInflater.from(d2y0Var.f44688a).inflate(R.layout.samsung_account_linking_nudge, (ViewGroup) null);
                        fcq fcqVar = d2y0Var.f44692e;
                        igx0 igx0Var = new igx0();
                        wj50.m88279p(viewInflate);
                        igx0Var.f102079h = viewInflate;
                        zbq zbqVarM41335b = fcq.m41335b(fcqVar, igx0Var);
                        ((Button) viewInflate.findViewById(R.id.samsung_nudge_link_button)).setOnClickListener(new b2y0(d2y0Var, 0));
                        ((Button) viewInflate.findViewById(R.id.samsung_nudge_cancel_button)).setOnClickListener(new b2y0(d2y0Var, 1));
                        ((mcq) r381Var).m61471f(zbqVarM41335b, view, new ase0(xre0.f265332a, ure0.f233341a), (44 & 8) != 0 ? null : uv51.f234364b1, new c2y0(d2y0Var, 1), (44 & 32) != 0 ? null : null);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                Logger.m3967c((Throwable) obj, "Failed to subscribe to app rater state", new Object[0]);
                return;
            case 10:
                Logger.m3967c((Throwable) obj, "Failed to subscribe to app rater state", new Object[0]);
                return;
            case 11:
                o2x0 o2x0Var = (o2x0) obj;
                if ((o2x0Var != null ? o2x0Var.f161171a.f149860d : -1) != 200) {
                    if ((o2x0Var != null ? o2x0Var.f161171a.f149860d : -1) != 304) {
                        if ((o2x0Var != null ? o2x0Var.f161171a.f149860d : -1) != 404) {
                            if ((o2x0Var != null ? o2x0Var.f161171a.f149860d : -1) != 429) {
                                throw new UcsRequestFailedException(o2x0Var);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 12:
                throw ei6.m39072i(obj);
            case 13:
                return;
            case 14:
                throw ei6.m39072i(obj);
            case 15:
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof UndeliverableException) {
                    UndeliverableException undeliverableException = (UndeliverableException) th2;
                    if (undeliverableException.getCause() instanceof HttpException) {
                        return;
                    }
                    Throwable cause = undeliverableException.getCause();
                    if ((cause instanceof IOException) || (cause instanceof InterruptedException)) {
                        return;
                    }
                    Logger.m3967c(undeliverableException, "UndeliverableException thrown", new Object[0]);
                    if (cause != null) {
                        Logger.m3965a("UndeliverableException caused by %s", cause.getMessage());
                        return;
                    }
                    return;
                }
                if (th2 instanceof CompositeException) {
                    m43006d((CompositeException) th2);
                    return;
                }
                if (th2 instanceof MissingBackpressureException) {
                    m43006d((MissingBackpressureException) th2);
                    return;
                } else {
                    if (!(th2 instanceof OnErrorNotImplementedException)) {
                        m43006d(th2);
                        return;
                    }
                    OnErrorNotImplementedException onErrorNotImplementedException = (OnErrorNotImplementedException) th2;
                    Logger.m3965a("Unwrapping OnErrorNotImplementedException: %s", onErrorNotImplementedException.getMessage());
                    m43006d(onErrorNotImplementedException.getCause());
                    return;
                }
            case 16:
                Logger.m3966b("Failed to receive Marquee response, error: %s", ((kqc0) obj).f125250b);
                return;
            case 17:
                Logger.m3965a("Handling " + ((Object) null) + " has failed: " + ((Throwable) obj).getMessage(), new Object[0]);
                return;
            case 18:
                return;
            case 19:
                return;
            case 20:
                return;
            case 21:
                return;
            case 22:
                throw null;
            case 23:
                throw ei6.m39072i(obj);
            case 24:
                throw ei6.m39072i(obj);
            case 25:
                if (((htr0) obj).f95153n1 == 4) {
                    throw new RuntimeException() { // from class: com.spotify.profile.profile.entity.ProfileEntityPage$FailLoadingProfileEntityException
                    };
                }
                return;
            case 26:
                gwg1.m45948t((String) ((Map) obj).get("filter-age-restricted-content"), false);
                return;
            case 27:
            case 28:
                return;
            default:
                throw ei6.m39072i(obj);
        }
    }

    public /* synthetic */ fxc1(Object obj, int i) {
        this.f74343a = i;
    }

    /* JADX INFO: renamed from: a */
    private final void m43004a(Object obj) {
    }

    /* JADX INFO: renamed from: c */
    private final void m43005c(Object obj) {
    }
}
