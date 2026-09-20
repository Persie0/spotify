package p204p;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class old0 extends emd0 {

    /* JADX INFO: renamed from: L0 */
    public final jld0 f166823L0;

    /* JADX INFO: renamed from: M0 */
    public final xgi f166824M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f166825N0;

    /* JADX INFO: renamed from: O0 */
    public ArrayList f166826O0;

    /* JADX INFO: renamed from: P0 */
    public final ArrayMap f166827P0;

    /* JADX INFO: renamed from: Q0 */
    public String f166828Q0;

    /* JADX INFO: renamed from: X */
    public final ArrayMap f166829X;

    /* JADX INFO: renamed from: Y */
    public final MediaRouter2$RouteCallback f166830Y;

    /* JADX INFO: renamed from: Z */
    public final nld0 f166831Z;

    /* JADX INFO: renamed from: i */
    public final MediaRouter2 f166832i;

    /* JADX INFO: renamed from: t */
    public final z4y f166833t;

    static {
        Log.isLoggable("MR2Provider", 3);
    }

    public old0(Context context, z4y z4yVar) {
        super(context, null);
        this.f166829X = new ArrayMap();
        this.f166831Z = new nld0(this);
        this.f166823L0 = new jld0(this);
        this.f166826O0 = new ArrayList();
        this.f166827P0 = new ArrayMap();
        this.f166832i = MediaRouter2.getInstance(context);
        this.f166833t = z4yVar;
        this.f166824M0 = new xgi(new Handler(Looper.getMainLooper()), 0);
        if (Build.VERSION.SDK_INT >= 34) {
            this.f166830Y = new pvx(this, 1);
        } else {
            this.f166830Y = new mld0(this);
        }
    }

    /* JADX INFO: renamed from: i */
    public static Messenger m67285i(MediaRouter2.RoutingController routingController) {
        Bundle controlHints = routingController.getControlHints();
        if (controlHints == null) {
            return null;
        }
        return (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
    }

    /* JADX INFO: renamed from: k */
    public static String m67286k(amd0 amd0Var) {
        MediaRouter2.RoutingController routingController;
        if ((amd0Var instanceof kld0) && (routingController = ((kld0) amd0Var).f123864g) != null) {
            return routingController.getId();
        }
        return null;
    }

    @Override // p204p.emd0
    /* JADX INFO: renamed from: b */
    public final zld0 mo39413b(String str, cmd0 cmd0Var) {
        Iterator it = this.f166829X.entrySet().iterator();
        while (it.hasNext()) {
            kld0 kld0Var = (kld0) ((Map.Entry) it.next()).getValue();
            if (TextUtils.equals(str, kld0Var.f123863f)) {
                return kld0Var;
            }
        }
        return null;
    }

    @Override // p204p.emd0
    /* JADX INFO: renamed from: c */
    public final amd0 mo36411c(String str) {
        return new lld0((String) this.f166827P0.get(str), null);
    }

    @Override // p204p.emd0
    /* JADX INFO: renamed from: d */
    public final amd0 mo36412d(String str, String str2) {
        String str3 = (String) this.f166827P0.get(str);
        for (kld0 kld0Var : this.f166829X.values()) {
            if (TextUtils.equals(str2, kld0Var.m56822p())) {
                return new lld0(str3, kld0Var);
            }
        }
        return new lld0(str3, null);
    }

    @Override // p204p.emd0
    /* JADX INFO: renamed from: f */
    public final void mo36413f(uld0 uld0Var) {
        omd0 omd0Var;
        int i = zmd0.f284250c == null ? 0 : zmd0.m96427c().f143256B;
        jld0 jld0Var = this.f166823L0;
        nld0 nld0Var = this.f166831Z;
        if (i <= 0) {
            this.f166832i.unregisterRouteCallback(this.f166830Y);
            this.f166832i.unregisterTransferCallback(nld0Var);
            this.f166832i.unregisterControllerCallback(jld0Var);
            return;
        }
        dnd0 dnd0Var = zmd0.m96427c().f143279u;
        boolean z = dnd0Var == null ? false : dnd0Var.f50761c;
        if (uld0Var == null) {
            uld0Var = new uld0(omd0.f167017c, false);
        }
        uld0Var.m83361a();
        ArrayList<String> arrayListM67345b = uld0Var.f231531b.m67345b();
        if (!z) {
            arrayListM67345b.remove("android.media.intent.category.LIVE_AUDIO");
        } else if (!arrayListM67345b.contains("android.media.intent.category.LIVE_AUDIO")) {
            arrayListM67345b.add("android.media.intent.category.LIVE_AUDIO");
        }
        ArrayList<String> arrayList = null;
        if (!arrayListM67345b.isEmpty()) {
            for (String str : arrayListM67345b) {
                if (str == null) {
                    throw new IllegalArgumentException("category must not be null");
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        if (arrayList == null) {
            omd0Var = omd0.f167017c;
        } else {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", arrayList);
            omd0Var = new omd0(bundle, arrayList);
        }
        uld0 uld0Var2 = new uld0(omd0Var, uld0Var.m83362b());
        MediaRouter2 mediaRouter2 = this.f166832i;
        MediaRouter2$RouteCallback mediaRouter2$RouteCallback = this.f166830Y;
        RouteDiscoveryPreference routeDiscoveryPreferenceM32836E = ci11.m32836E(uld0Var2);
        xgi xgiVar = this.f166824M0;
        mediaRouter2.registerRouteCallback(xgiVar, mediaRouter2$RouteCallback, routeDiscoveryPreferenceM32836E);
        this.f166832i.registerTransferCallback(xgiVar, nld0Var);
        this.f166832i.registerControllerCallback(xgiVar, jld0Var);
    }

    /* JADX INFO: renamed from: j */
    public final MediaRoute2Info m67287j(String str) {
        if (str == null) {
            return null;
        }
        Iterator it = this.f166826O0.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoM90310j = xba0.m90310j(it.next());
            if (TextUtils.equals(mediaRoute2InfoM90310j.getId(), str)) {
                return mediaRoute2InfoM90310j;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final void m67288l() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        Iterator<MediaRoute2Info> it = this.f166832i.getRoutes().iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoM90310j = xba0.m90310j(it.next());
            if (mediaRoute2InfoM90310j != null && !arraySet.contains(mediaRoute2InfoM90310j) && !mediaRoute2InfoM90310j.isSystemRoute()) {
                if (this.f166825N0) {
                    if (!mediaRoute2InfoM90310j.getId().startsWith(this.f60887a.getPackageName() + "/")) {
                    }
                }
                arraySet.add(mediaRoute2InfoM90310j);
                arrayList.add(mediaRoute2InfoM90310j);
            }
        }
        if (arrayList.equals(this.f166826O0)) {
            return;
        }
        this.f166826O0 = arrayList;
        ArrayMap arrayMap = this.f166827P0;
        arrayMap.clear();
        Iterator it2 = this.f166826O0.iterator();
        while (it2.hasNext()) {
            MediaRoute2Info mediaRoute2InfoM90310j2 = xba0.m90310j(it2.next());
            Bundle extras = mediaRoute2InfoM90310j2.getExtras();
            if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                mediaRoute2InfoM90310j2.toString();
            } else {
                arrayMap.put(mediaRoute2InfoM90310j2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = this.f166826O0.iterator();
        while (it3.hasNext()) {
            tld0 tld0VarM32837F = ci11.m32837F(xba0.m90310j(it3.next()));
            if (tld0VarM32837F != null) {
                arrayList2.add(tld0VarM32837F);
            }
        }
        zmn0 zmn0Var = new zmn0(26);
        zmn0Var.m96469D(true);
        zmn0Var.m96478k(arrayList2);
        m39415g(zmn0Var.m96481n());
    }

    /* JADX INFO: renamed from: m */
    public final void m67289m(MediaRouter2.RoutingController routingController) throws Throwable {
        e6a0 e6a0Var;
        kld0 kld0Var = (kld0) this.f166829X.get(routingController);
        if (kld0Var == null) {
            Objects.toString(routingController);
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            routingController.toString();
            return;
        }
        ArrayList arrayListM32846h = ci11.m32846h(selectedRoutes);
        tld0 tld0VarM32837F = ci11.m32837F(xba0.m90310j(selectedRoutes.get(0)));
        Bundle controlHints = routingController.getControlHints();
        String string = this.f60887a.getString(R.string.mr_dialog_default_group_name);
        tld0 tld0Var = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    tld0Var = new tld0(bundle);
                }
            } catch (Exception unused) {
            }
        }
        if (tld0Var == null) {
            e6a0Var = new e6a0(routingController.getId(), string);
            e6a0Var.m37930x(2);
            e6a0Var.m37900A(1);
        } else {
            e6a0Var = new e6a0(tld0Var);
        }
        e6a0Var.m37901B(routingController.getVolume());
        e6a0Var.m37903D(routingController.getVolumeMax());
        e6a0Var.m37902C(routingController.getVolumeHandling());
        e6a0Var.m37920n();
        e6a0Var.m37913g(tld0VarM32837F.m81045b());
        e6a0Var.m37921o();
        e6a0Var.m37915i(arrayListM32846h);
        tld0 tld0VarM37919m = e6a0Var.m37919m();
        ArrayList arrayListM32846h2 = ci11.m32846h(routingController.getSelectableRoutes());
        ArrayList arrayListM32846h3 = ci11.m32846h(routingController.getDeselectableRoutes());
        fmd0 fmd0Var = this.f60893g;
        if (fmd0Var == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<tld0> listM42096q = fmd0Var.m42096q();
        if (!listM42096q.isEmpty()) {
            for (tld0 tld0Var2 : listM42096q) {
                String strM81050g = tld0Var2.m81050g();
                wld0 wld0Var = new wld0(tld0Var2);
                wld0Var.m88515e(arrayListM32846h.contains(strM81050g) ? 3 : 1);
                wld0Var.m88512b(arrayListM32846h2.contains(strM81050g));
                wld0Var.m88514d(arrayListM32846h3.contains(strM81050g));
                wld0Var.m88513c();
                arrayList.add(wld0Var.m88511a());
            }
        }
        kld0Var.f123872o = tld0VarM37919m;
        kld0Var.m96360k(tld0VarM37919m, arrayList);
    }

    /* JADX INFO: renamed from: n */
    public final void m67290n(String str) {
        MediaRoute2Info mediaRoute2InfoM67287j = m67287j(str);
        if (mediaRoute2InfoM67287j == null) {
            return;
        }
        if (TextUtils.equals(this.f166828Q0, str)) {
            mediaRoute2InfoM67287j.toString();
        } else {
            this.f166828Q0 = str;
            this.f166832i.transferTo(mediaRoute2InfoM67287j);
        }
    }
}
