package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.browse.MediaBrowser;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import com.spotify.apprater.appraterdialog.AppRaterActivity;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes6.dex */
public final class zq2 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f285286a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f285287b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f285288c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zq2(int i, Object obj, Object obj2) {
        super(0);
        this.f285286a = i;
        this.f285287b = obj;
        this.f285288c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r8v0, types: [p.fbk] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // p204p.eh00
    public final Object invoke() {
        ContextTrack contextTrack;
        xf40 xf40VarMetadata;
        ContextTrack contextTrack2;
        cpz0 cpz0Var;
        lp70 lp70Var;
        Object c6x0Var;
        z650 z650Var;
        float coverArtSize;
        float f;
        int i = this.f285286a;
        float contentRadius = 0.0f;
        int i2 = 26;
        int i3 = 2;
        String str = 0;
        str = null;
        String str2 = null;
        str = 0;
        str = 0;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = this.f285288c;
        Object obj2 = this.f285287b;
        switch (i) {
            case 0:
                ar2 ar2Var = (ar2) obj2;
                ar2Var.f18908a.mo57453r(ar2Var.f18909b.m49946e(), null);
                ((yq2) obj).f275113c.invoke();
                return w2a1Var;
            case 1:
                ((Handler) ((kcj0) obj2).f121502f).post(new n10((i941) obj, i3));
                return w2a1Var;
            case 2:
                q4k q4kVar = (q4k) obj;
                return q4k.m72168a((q4k) ((f1k) obj2).f64915f.invoke(), q4kVar.f185214g, q4kVar.f185218k, q4kVar.f185219l, false, null, null, q4kVar.f185207D, 536867775);
            case 3:
                return new cjc0(((uhm) obj2).m83165a(), new lc1((z13) obj, 29));
            case 4:
                return z2h1.m95219z(new bjc0((iv0) obj2, new k23((z13) obj, 7)), mi21.m61822f(1.0f, cxh0.f43038a), null, 4);
            case 5:
                fj3 fj3Var = (fj3) obj2;
                return ((tim) obj).m80925a(((View) fj3Var.f70058a.f84481e).getId(), fj3Var.f70059b, new k23(fj3Var, 11));
            case 6:
                ((ood0) obj2).m67497q((qdm) obj).mo33104m(f2b.f65144a);
                return w2a1Var;
            case 7:
                hol0 hol0Var = (hol0) obj2;
                PlayerState playerState = (PlayerState) obj;
                xul0 xul0VarTrack = playerState.track();
                String strUri = (xul0VarTrack == null || (contextTrack2 = (ContextTrack) xul0VarTrack.mo49283h()) == null) ? null : contextTrack2.uri();
                xul0 xul0VarTrack2 = playerState.track();
                if (xul0VarTrack2 != null && (contextTrack = (ContextTrack) xul0VarTrack2.mo49283h()) != null && (xf40VarMetadata = contextTrack.metadata()) != null) {
                    str = (String) xf40VarMetadata.get(ContextTrack.Metadata.KEY_POINTER_URI);
                }
                ((wy3) ((xre) hol0Var.f93564d)).getClass();
                return new uv3((Long) playerState.position(System.currentTimeMillis()).mo49283h(), strUri, str, playerState.isPaused());
            case 8:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj));
            case 9:
                return Boolean.valueOf(super/*android.view.View*/.dispatchGenericMotionEvent((MotionEvent) obj));
            case 10:
                tz3 tz3Var = (tz3) obj;
                kly0 kly0Var = (kly0) obj2;
                bky0 bky0Var = kly0Var.f124010e;
                bky0 bky0Var2 = kly0Var.f124011f;
                Float f2 = kly0Var.f124008c;
                Float f3 = kly0Var.f124009d;
                float fFloatValue = (bky0Var == null || f2 == null) ? 0.0f : ((Number) bky0Var.f28041a.invoke()).floatValue() - f2.floatValue();
                float fFloatValue2 = (bky0Var2 == null || f3 == null) ? 0.0f : ((Number) bky0Var2.f28041a.invoke()).floatValue() - f3.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iM82026A = tz3Var.m82026A(kly0Var.f124006a);
                    epz0 epz0Var = (epz0) tz3Var.m82047s().m87103b(tz3Var.f225114X);
                    if (epz0Var != null) {
                        try {
                            C2374sf c2374sf = tz3Var.f225118Z;
                            if (c2374sf != null) {
                                c2374sf.m77977l(tz3Var.m82039k(epz0Var));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    epz0 epz0Var2 = (epz0) tz3Var.m82047s().m87103b(tz3Var.f225116Y);
                    if (epz0Var2 != null) {
                        try {
                            C2374sf c2374sf2 = tz3Var.f225102L0;
                            if (c2374sf2 != null) {
                                c2374sf2.m77977l(tz3Var.m82039k(epz0Var2));
                            }
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    tz3Var.f225123d.invalidate();
                    epz0 epz0Var3 = (epz0) tz3Var.m82047s().m87103b(iM82026A);
                    if (epz0Var3 != null && (cpz0Var = epz0Var3.f61737a) != null && (lp70Var = cpz0Var.f40688c) != null) {
                        if (bky0Var != null) {
                            tz3Var.f225104N0.m81201i(iM82026A, bky0Var);
                        }
                        if (bky0Var2 != null) {
                            tz3Var.f225105O0.m81201i(iM82026A, bky0Var2);
                        }
                        tz3Var.m82050w(lp70Var);
                    }
                }
                if (bky0Var != null) {
                    kly0Var.f124008c = (Float) bky0Var.f28041a.invoke();
                }
                if (bky0Var2 != null) {
                    kly0Var.f124009d = (Float) bky0Var2.f28041a.invoke();
                }
                return w2a1Var;
            case 11:
                a14 a14Var = (a14) obj2;
                gjx gjxVar = a14Var.f11319c;
                if (gjxVar != null) {
                    gjxVar.mo43850O((x04) obj);
                }
                gjx gjxVar2 = a14Var.f11319c;
                if (gjxVar2 != null) {
                    gjxVar2.stop();
                }
                gjx gjxVar3 = a14Var.f11319c;
                if (gjxVar3 != null) {
                    gjxVar3.mo43905s(xs6.f265509i, false);
                }
                return w2a1Var;
            case 12:
                Context applicationContext = ((Context) obj2).getApplicationContext();
                IntentFilter intentFilter = new IntentFilter("android.intent.action.AIRPLANE_MODE");
                wj50.m88279p(applicationContext);
                e84 e84Var = (e84) obj;
                return mvl0.m62953p(new vjz(new C2417tj(i2, gk40.m45029e(applicationContext, intentFilter), e84Var), new fa2(e84Var, str, 21)));
            case 13:
                kcj0 kcj0Var = (kcj0) obj;
                ComponentName componentName = (ComponentName) kcj0Var.f121499c;
                ag4 ag4Var = (ag4) kcj0Var.f121502f;
                Bundle bundle = new Bundle();
                bundle.putBoolean(MediaBrowserServiceCompat.BrowserRoot.EXTRA_SUGGESTED, true);
                bundle.putString("com.spotify.music.extra.SUGGESTED_TYPE", "npv-recommendations-widget");
                bundle.putString("com.spotify.music.extra.VERSION", "0.1");
                return new MediaBrowser((Context) obj2, componentName, ag4Var, bundle);
            case 14:
                ((ConnectivityManager) ((wg61) ((jke) obj2).f113294e).getValue()).unregisterNetworkCallback((pi4) obj);
                return w2a1Var;
            case 15:
                try {
                    ((NsdManager) obj2).stopServiceDiscovery((uj4) obj);
                    c6x0Var = w2a1Var;
                } catch (Throwable th) {
                    c6x0Var = new c6x0(th);
                }
                Throwable thM77348a = s6x0.m77348a(c6x0Var);
                if (thM77348a != null) {
                    String message = thM77348a.getMessage();
                    if (message == null) {
                        message = "stopServiceDiscovery threw error";
                    }
                    na6.m63972t(message, thM77348a);
                }
                return w2a1Var;
            case 16:
                return Float.valueOf(((Boolean) ((kqi0) obj).getValue()).booleanValue() ? 1.0f : ((Number) ((f8b0) obj2).getValue()).floatValue());
            case 17:
                rc5 rc5Var = (rc5) obj2;
                kv91 kv91Var = (kv91) rc5Var.f197733c.getValue();
                yt91 yt91VarM96903c = rc5Var.f197732b.f25561b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("dismiss_button", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                ((eh00) obj).invoke();
                return w2a1Var;
            case 18:
                AppRaterActivity appRaterActivity = (AppRaterActivity) obj2;
                appRaterActivity.startActivity((Intent) obj);
                appRaterActivity.finish();
                return w2a1Var;
            case 19:
                EditText editText = (EditText) obj2;
                if (!editText.requestFocus()) {
                    return Boolean.FALSE;
                }
                InputMethodManager inputMethodManager = (InputMethodManager) obj;
                if (inputMethodManager != null) {
                    return Boolean.valueOf(inputMethodManager.showSoftInput(editText, 1));
                }
                return null;
            case 20:
                d850 d850VarMo32667a = ((zn5) obj2).mo32667a();
                if (d850VarMo32667a != null && (z650Var = d850VarMo32667a.f46380a) != null) {
                    str2 = z650Var.f279709a;
                }
                ((gh00) obj).invoke(str2);
                return w2a1Var;
            case 21:
                ((gh00) obj2).invoke(((jr6) obj).f115092a);
                return w2a1Var;
            case 22:
                ArtworkView artworkView = (ArtworkView) obj;
                q76 q76Var = (q76) obj2;
                if (q76Var.mo24908a().f88011b instanceof z56) {
                    contentRadius = artworkView.getContentRadius();
                } else if (q76Var.mo24908a().f88011b instanceof a66) {
                    contentRadius = (artworkView.getContext().getResources().getDisplayMetrics().densityDpi / 160) * ((a66) q76Var.mo24908a().f88011b).f12702d;
                } else {
                    String str3 = ArtworkView.f3599Q0;
                    if ((q76Var instanceof m66) || (q76Var instanceof q66) || (q76Var instanceof l76) || (q76Var instanceof o66) || (q76Var instanceof k66) || (q76Var instanceof m76) || (q76Var instanceof n76) || (q76Var instanceof v66) || (q76Var instanceof x66) || (q76Var.mo24908a().f88011b instanceof y56)) {
                        coverArtSize = artworkView.getCoverArtSize();
                        f = 2.0f;
                    } else if ((q76Var instanceof u66) || (q76Var instanceof p66) || (q76Var instanceof g76) || (q76Var instanceof h76) || (q76Var instanceof j76)) {
                        coverArtSize = artworkView.getCoverArtSize();
                        f = 12.0f;
                    }
                    contentRadius = coverArtSize / f;
                }
                return Float.valueOf(contentRadius);
            case 23:
                ((oc6) obj2).f163831o.invoke(new ff6((AbstractC1961i) obj));
                return w2a1Var;
            case 24:
                ((zc6) obj2).f281464c.invoke(new hf6(((zzb) obj).f287938e));
                return w2a1Var;
            case 25:
                ((jn6) obj2).f114022a.mo53808b((String) obj);
                return w2a1Var;
            case 26:
                return new io6((ry8) ((gh00) obj2).invoke((ago) obj));
            case 27:
                ((gh00) obj2).invoke((lcd) obj);
                return w2a1Var;
            case 28:
                return new cjc0((dut) ((iu6) obj2).f105871a.invoke((q2c) obj), hu6.f95316b);
            default:
                sv6 sv6Var = ((rv6) obj2).f203004a;
                b60 b60Var = new b60(i3);
                luk lukVar = (luk) sv6Var.f214345h;
                vbu0 vbu0Var = new vbu0(zsq.m96897z(), i2);
                m011 m011Var = (m011) sv6Var.f214340c;
                jg31.m53271i(m011Var);
                k8n0 k8n0Var = (k8n0) sv6Var.f214339b;
                dv71 dv71Var = (dv71) sv6Var.f214341d;
                kv71 kv71Var = (kv71) sv6Var.f214342e;
                fus0 fus0Var = (fus0) sv6Var.f214344g;
                Context context = (Context) sv6Var.f214343f;
                return new cjc0(new ew6(b60Var, new qv6(lukVar, vbu0Var, m011Var, (q2c) obj, new dy0(k8n0Var, dv71Var, kv71Var, fus0Var, context, sv6Var.f214338a), context, fus0Var)), hu6.f95322f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq2(sir0 sir0Var, NsdManager nsdManager, uj4 uj4Var) {
        super(0);
        this.f285286a = 15;
        this.f285287b = nsdManager;
        this.f285288c = uj4Var;
    }
}
