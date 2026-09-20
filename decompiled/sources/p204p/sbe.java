package p204p;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.spotify.cosmos.util.policy.proto.ShowCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy;
import com.spotify.cosmos.util.proto.ShowCollectionState;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import spotify.collection.esperanto.proto.CollectionContainsRequest;
import spotify.collection.esperanto.proto.CollectionContainsResponse;
import spotify.collection.esperanto.proto.CollectionDecorateRequest;
import spotify.collection.esperanto.proto.CollectionDecorateResponse;
import spotify.collection.esperanto.proto.CollectionShow;
import spotify.collection.esperanto.proto.CollectionShowDecorationPolicy;

/* JADX INFO: loaded from: classes7.dex */
public final class sbe {

    /* JADX INFO: renamed from: x */
    public static final Set f207434x = bk5.m29624m1(new String[]{"track", "album", "show", "episode", "playlist", "artist", "chapter"});

    /* JADX INFO: renamed from: y */
    public static final Set f207435y = bk5.m29624m1(new String[]{"scdn.co", "spotifycdn.com"});

    /* JADX INFO: renamed from: a */
    public final Context f207436a;

    /* JADX INFO: renamed from: b */
    public final l7i0 f207437b;

    /* JADX INFO: renamed from: c */
    public final sr6 f207438c;

    /* JADX INFO: renamed from: d */
    public final sr6 f207439d;

    /* JADX INFO: renamed from: e */
    public final n93 f207440e;

    /* JADX INFO: renamed from: f */
    public final j8y0 f207441f;

    /* JADX INFO: renamed from: g */
    public final ryq0 f207442g;

    /* JADX INFO: renamed from: h */
    public final wt80 f207443h;

    /* JADX INFO: renamed from: i */
    public final xbe f207444i;

    /* JADX INFO: renamed from: j */
    public final gbe f207445j;

    /* JADX INFO: renamed from: k */
    public final Handler f207446k = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: l */
    public final c9k f207447l;

    /* JADX INFO: renamed from: m */
    public volatile WebView f207448m;

    /* JADX INFO: renamed from: n */
    public volatile boolean f207449n;

    /* JADX INFO: renamed from: o */
    public m7i0 f207450o;

    /* JADX INFO: renamed from: p */
    public s7i0 f207451p;

    /* JADX INFO: renamed from: q */
    public s9p0 f207452q;

    /* JADX INFO: renamed from: r */
    public lg21 f207453r;

    /* JADX INFO: renamed from: s */
    public di41 f207454s;

    /* JADX INFO: renamed from: t */
    public di41 f207455t;

    /* JADX INFO: renamed from: u */
    public di41 f207456u;

    /* JADX INFO: renamed from: v */
    public final Object f207457v;

    /* JADX INFO: renamed from: w */
    public final HashMap f207458w;

    public sbe(Context context, l7i0 l7i0Var, sr6 sr6Var, sr6 sr6Var2, n93 n93Var, j8y0 j8y0Var, ryq0 ryq0Var, wt80 wt80Var, xbe xbeVar, gbe gbeVar) {
        this.f207436a = context;
        this.f207437b = l7i0Var;
        this.f207438c = sr6Var;
        this.f207439d = sr6Var2;
        this.f207440e = n93Var;
        this.f207441f = j8y0Var;
        this.f207442g = ryq0Var;
        this.f207443h = wt80Var;
        this.f207444i = xbeVar;
        this.f207445j = gbeVar;
        n5q n5qVar = xsr.f265651a;
        this.f207447l = kk40.m56661c(opo.m67570t(tlp.f221498c, njg1.m64613f()));
        this.f207457v = new Object();
        this.f207458w = new HashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m77723a(sbe sbeVar, String str, boolean z, ibk ibkVar) {
        jbe jbeVar;
        if (ibkVar instanceof jbe) {
            jbeVar = (jbe) ibkVar;
            int i = jbeVar.f110750d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jbeVar.f110750d = i - Integer.MIN_VALUE;
            } else {
                jbeVar = new jbe(sbeVar, ibkVar);
            }
        } else {
            jbeVar = new jbe(sbeVar, ibkVar);
        }
        Object objM79067i = jbeVar.f110748b;
        int i2 = jbeVar.f110750d;
        if (i2 == 0) {
            bga.m29073P(objM79067i);
            sr6 sr6Var = sbeVar.f207439d;
            w2f w2fVarM97463q = CollectionContainsRequest.m97463q();
            w2fVarM97463q.m87077q(str);
            CollectionContainsRequest collectionContainsRequest = (CollectionContainsRequest) w2fVarM97463q.build();
            jbeVar.f110747a = z;
            jbeVar.f110750d = 1;
            objM79067i = sr6Var.m79067i(collectionContainsRequest, jbeVar);
            yuk yukVar = yuk.f276404a;
            if (objM79067i == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = jbeVar.f110747a;
            bga.m29073P(objM79067i);
        }
        CollectionContainsResponse collectionContainsResponse = (CollectionContainsResponse) objM79067i;
        Object objM43745s0 = g6f.m43745s0(collectionContainsResponse.m97468q());
        Boolean bool = Boolean.TRUE;
        if (wj50.m88271j(objM43745s0, bool)) {
            return z ? "followed" : "saved";
        }
        return wj50.m88271j(g6f.m43745s0(collectionContainsResponse.m97467p()), bool) ? "banned" : "none";
    }

    /* JADX INFO: renamed from: b */
    public static final void m77724b(sbe sbeVar) {
        s7i0 s7i0Var;
        if (sbeVar.f207450o == null) {
            sbeVar.f207450o = sbeVar.f207437b.m58415a(new yo3(1));
        }
        if (sbeVar.f207451p == null) {
            m7i0 m7i0Var = sbeVar.f207450o;
            sbeVar.f207451p = m7i0Var != null ? m7i0Var.m61064a(new e7i0("chromeless", y2e.f268588e), 1) : null;
        }
        if (sbeVar.f207452q == null) {
            s7i0 s7i0Var2 = sbeVar.f207451p;
            s9p0 s9p0VarMo43757c = s7i0Var2 != null ? s7i0Var2.mo43757c(false) : null;
            sbeVar.f207452q = s9p0VarMo43757c;
            if (s9p0VarMo43757c != null && (s7i0Var = sbeVar.f207451p) != null) {
                s7i0Var.mo32673a(s9p0VarMo43757c);
            }
        }
        if (sbeVar.f207453r == null) {
            s9p0 s9p0Var = sbeVar.f207452q;
            lg21 lg21VarM77588a = s9p0Var != null ? s9p0Var.m77588a() : null;
            sbeVar.f207453r = lg21VarM77588a;
            if (lg21VarM77588a != null) {
                lg21VarM77588a.m58933l();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: c */
    public static final Object m77725c(sbe sbeVar, String str, ibk ibkVar) {
        obe obeVar;
        Boolean boolValueOf;
        if (ibkVar instanceof obe) {
            obeVar = (obe) ibkVar;
            int i = obeVar.f163628c;
            if ((i & Integer.MIN_VALUE) != 0) {
                obeVar.f163628c = i - Integer.MIN_VALUE;
            } else {
                obeVar = new obe(sbeVar, ibkVar);
            }
        } else {
            obeVar = new obe(sbeVar, ibkVar);
        }
        Object objM86755t = obeVar.f163626a;
        int i2 = obeVar.f163628c;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
            bjp0 bjp0VarM18365h0 = PlaylistDecorationPolicy.m18365h0();
            bjp0VarM18365h0.m29493E();
            top0VarM18421v.m81216x(bjp0VarM18365h0);
            fiz fizVarM62846k = ((mu80) sbeVar.f207443h).m62846k(str, new st80((PlaylistRequestDecorationPolicy) top0VarM18421v.build(), null, null, false, null, c5u0.f34291a, null, 0, null, 478));
            obeVar.f163628c = 1;
            objM86755t = vyf1.m86755t(fizVarM62846k, obeVar);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        p2x0 p2x0Var = (p2x0) objM86755t;
        p2x0Var.getClass();
        if (p2x0Var instanceof k2x0) {
            boolValueOf = Boolean.FALSE;
        } else {
            if (!(p2x0Var instanceof m2x0)) {
                throw new NoWhenBranchMatchedException();
            }
            boolValueOf = Boolean.valueOf(((qu80) ((m2x0) p2x0Var).f139474a).f192599e.f271262g);
        }
        return boolValueOf.booleanValue() ? "saved" : "none";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        if (r8 == r5) goto L25;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m77726d(sbe sbeVar, String str, ibk ibkVar) {
        pbe pbeVar;
        ShowCollectionState showCollectionStateM97521p;
        if (ibkVar instanceof pbe) {
            pbeVar = (pbe) ibkVar;
            int i = pbeVar.f175791d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pbeVar.f175791d = i - Integer.MIN_VALUE;
            } else {
                pbeVar = new pbe(sbeVar, ibkVar);
            }
        } else {
            pbeVar = new pbe(sbeVar, ibkVar);
        }
        Object objM96571q = pbeVar.f175789b;
        int i2 = pbeVar.f175791d;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM96571q);
            Observable observableM76738b = sbeVar.f207442g.m76738b(str);
            pbeVar.f175788a = str;
            pbeVar.f175791d = 1;
            objM96571q = zn91.m96571q(observableM76738b, 1, null, pbeVar);
            if (objM96571q != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            str = pbeVar.f175788a;
            bga.m29073P(objM96571q);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96571q);
        }
        CollectionShow collectionShow = (CollectionShow) g6f.m43745s0(((CollectionDecorateResponse) objM96571q).m97481q());
        if (collectionShow == null || (showCollectionStateM97521p = collectionShow.m97521p()) == null || !showCollectionStateM97521p.getIsInCollection()) {
            return "none";
        }
        return collectionShow.m97522q().getIsBook() ? "saved" : "followed";
        if (((Boolean) objM96571q).booleanValue()) {
            return "presaved";
        }
        sr6 sr6Var = sbeVar.f207439d;
        b3f b3fVarM97476u = CollectionDecorateRequest.m97476u();
        b3fVarM97476u.m28008q(str);
        u5f u5fVarM97529r = CollectionShowDecorationPolicy.m97529r();
        u5fVarM97529r.m82402q();
        u5fVarM97529r.m82401m((ShowCollectionDecorationPolicy) ShowCollectionDecorationPolicy.newBuilder().setIsInCollection(true).build());
        u5fVarM97529r.m82404s((ShowDecorationPolicy) ShowDecorationPolicy.newBuilder().setIsBook(true).build());
        b3fVarM97476u.m28014w((CollectionShowDecorationPolicy) u5fVarM97529r.build());
        CollectionDecorateRequest collectionDecorateRequest = (CollectionDecorateRequest) b3fVarM97476u.build();
        pbeVar.f175788a = null;
        pbeVar.f175791d = 2;
        objM96571q = sr6Var.m79071k(collectionDecorateRequest, pbeVar);
    }

    @JavascriptInterface
    public final void closePage() {
        if (!this.f207449n) {
            this.f207449n = true;
            kk40.m56680v(this.f207447l, null);
            this.f207448m = null;
            this.f207446k.post(new ibe(this, 1));
        }
        this.f207446k.post(new ibe(this, 0));
    }

    /* JADX INFO: renamed from: e */
    public final boolean m77727e(int i, String str) {
        boolean z;
        synchronized (this.f207457v) {
            try {
                HashMap map = this.f207458w;
                Object hj5Var = map.get(str);
                if (hj5Var == null) {
                    hj5Var = new hj5();
                    map.put(str, hj5Var);
                }
                hj5 hj5Var2 = (hj5) hj5Var;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                while (!hj5Var2.isEmpty() && jElapsedRealtime - ((Number) hj5Var2.first()).longValue() > 1000) {
                    hj5Var2.removeFirst();
                }
                if (hj5Var2.f91964c >= i) {
                    z = false;
                } else {
                    hj5Var2.addLast(Long.valueOf(jElapsedRealtime));
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: f */
    public final void m77728f(String str) {
        Context context = this.f207436a;
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setPackage(context.getPackageName());
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m77729g(String str, String str2) {
        WebView webView;
        if (!axf1.m27410y(str) || this.f207449n || (webView = this.f207448m) == null) {
            return;
        }
        this.f207446k.post(new qk8(this, webView, str, str2, 2));
    }

    @JavascriptInterface
    public final float getBottomInset() {
        if (this.f207449n) {
            return 0.0f;
        }
        return Float.valueOf(0.0f).floatValue();
    }

    @JavascriptInterface
    public final void getCollectionStateAsync(String str, String str2) {
        if (!this.f207449n && axf1.m27410y(str2)) {
            if (!this.f207445j.f78282c || !axf1.m27411z(str)) {
                m77729g(str2, zk60.m96301c("none").toString());
                return;
            }
            di41 di41Var = this.f207456u;
            if (di41Var != null) {
                di41Var.mo26601e(null);
            }
            this.f207456u = x0h1.m89578u(this.f207447l, null, 0, new kbe(str, this, str2, (fbk) null), 3);
        }
    }

    @JavascriptInterface
    public final void hasPreciseLocationPermissionAsync(String str) {
        if (!this.f207449n && axf1.m27410y(str)) {
            if (this.f207445j.f78284e) {
                x0h1.m89578u(this.f207447l, null, 0, new lbe(0, str, this, null), 3);
            } else {
                m77729g(str, "false");
            }
        }
    }

    @JavascriptInterface
    public final void isCurrentlyPlayingAsync(String str, String str2) {
        if (!this.f207449n && axf1.m27410y(str2)) {
            if (!this.f207445j.f78281b || !axf1.m27411z(str)) {
                m77729g(str2, "false");
                return;
            }
            di41 di41Var = this.f207455t;
            if (di41Var != null) {
                di41Var.mo26601e(null);
            }
            this.f207455t = x0h1.m89578u(this.f207447l, null, 0, new kbe(this, str, str2, (fbk) null), 3);
        }
    }

    @JavascriptInterface
    public final void navigate(String str) {
        if (!this.f207449n && this.f207445j.f78283d && axf1.m27411z(str) && m77727e(5, "navigate")) {
            m77728f(str);
        }
    }

    @JavascriptInterface
    public final void pausePlayback() {
        if (!this.f207449n && this.f207445j.f78281b) {
            x0h1.m89578u(this.f207447l, null, 0, new mbe(this, null, 0), 3);
        }
    }

    @JavascriptInterface
    public final void playBetamax(String str) {
        String host;
        if (!this.f207449n && this.f207445j.f78281b && str.length() <= 2048) {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            if (!wj50.m88271j(scheme != null ? scheme.toLowerCase(Locale.ROOT) : null, pka1.f178421b) || (host = uri.getHost()) == null || wl51.m88460J0(host)) {
                return;
            }
            String lowerCase = host.toLowerCase(Locale.ROOT);
            Set<String> set = f207435y;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (String str2 : set) {
                    if (lowerCase.equals(str2)) {
                        break;
                    }
                    if (bm51.m29796g0(lowerCase, "." + str2, false)) {
                        break;
                    }
                }
            }
            if (m77727e(10, "playBetamax")) {
                this.f207446k.post(new uqf1(8, this, str));
            }
        }
    }

    @JavascriptInterface
    public final void playUri(String str) {
        if (!this.f207449n && this.f207445j.f78281b && axf1.m27411z(str)) {
            List listM88477a1 = wl51.m88477a1(str, new String[]{":"}, 0, 6);
            if (listM88477a1.size() >= 2 && wj50.m88271j(listM88477a1.get(0), "spotify") && f207434x.contains(listM88477a1.get(1)) && m77727e(5, "playUri")) {
                x0h1.m89578u(this.f207447l, null, 0, new nbe(this, str, null), 3);
            }
        }
    }

    @JavascriptInterface
    public final void removeFromCollection(String str) {
        if (!this.f207449n && this.f207445j.f78282c && axf1.m27411z(str) && m77727e(5, "removeFromCollection")) {
            x0h1.m89578u(this.f207447l, null, 0, new nbe(1, str, this, null), 3);
        }
    }

    @JavascriptInterface
    public final void requestPreciseLocationPermissionAsync(String str) {
        if (!this.f207449n && axf1.m27410y(str)) {
            if (!this.f207445j.f78284e) {
                m77729g(str, "false");
            } else if (m77727e(2, "requestPreciseLocationPermission")) {
                x0h1.m89578u(this.f207447l, null, 0, new lbe(1, str, this, null), 3);
            } else {
                m77729g(str, "false");
            }
        }
    }

    @JavascriptInterface
    public final void saveToCollection(String str) {
        if (!this.f207449n && this.f207445j.f78282c && axf1.m27411z(str) && m77727e(5, "saveToCollection")) {
            x0h1.m89578u(this.f207447l, null, 0, new nbe(2, str, this, null), 3);
        }
    }

    @JavascriptInterface
    public final void showContextMenu(String str) {
        if (!this.f207449n && this.f207445j.f78283d && axf1.m27411z(str) && m77727e(5, "showContextMenu")) {
            m77728f(str);
        }
    }

    @JavascriptInterface
    public final void stopBetamax() {
        if (!this.f207449n && this.f207445j.f78281b) {
            this.f207446k.post(new ibe(this, 2));
        }
    }

    @JavascriptInterface
    public final void stopPlayback() {
        pausePlayback();
    }

    @JavascriptInterface
    public final void subscribeToPlayerState() {
        if (!this.f207449n && this.f207445j.f78281b) {
            di41 di41Var = this.f207454s;
            fbk fbkVar = null;
            if (di41Var != null) {
                di41Var.mo26601e(null);
            }
            this.f207454s = x0h1.m89578u(this.f207447l, null, 0, new mbe(this, fbkVar, 1), 3);
        }
    }
}
