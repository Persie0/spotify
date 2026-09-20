package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Display;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ido0 extends mdo0 {

    /* JADX INFO: renamed from: Q0 */
    public static final ArrayList f101186Q0;

    /* JADX INFO: renamed from: R0 */
    public static final ArrayList f101187R0;

    /* JADX INFO: renamed from: L0 */
    public int f101188L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f101189M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f101190N0;

    /* JADX INFO: renamed from: O0 */
    public final ArrayList f101191O0;

    /* JADX INFO: renamed from: P0 */
    public final ArrayList f101192P0;

    /* JADX INFO: renamed from: X */
    public final end0 f101193X;

    /* JADX INFO: renamed from: Y */
    public final fnd0 f101194Y;

    /* JADX INFO: renamed from: Z */
    public final MediaRouter.RouteCategory f101195Z;

    /* JADX INFO: renamed from: i */
    public final mg10 f101196i;

    /* JADX INFO: renamed from: t */
    public final MediaRouter f101197t;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        f101186Q0 = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        f101187R0 = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public ido0(Context context, mg10 mg10Var) {
        super(context, new t180(new ComponentName("android", mdo0.class.getName()), 18));
        this.f101191O0 = new ArrayList();
        this.f101192P0 = new ArrayList();
        this.f101196i = mg10Var;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.f101197t = mediaRouter;
        this.f101193X = new end0(this);
        this.f101194Y = new fnd0(this);
        this.f101195Z = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(R.string.mr_user_route_category_name), false);
        m50363t();
    }

    /* JADX INFO: renamed from: n */
    public static ldo0 m50351n(MediaRouter.RouteInfo routeInfo) {
        Object tag = routeInfo.getTag();
        if (tag instanceof ldo0) {
            return (ldo0) tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static void m50352u(ldo0 ldo0Var) {
        MediaRouter.UserRouteInfo userRouteInfo = ldo0Var.f132315b;
        wmd0 wmd0Var = ldo0Var.f132314a;
        userRouteInfo.setName(wmd0Var.f252813d);
        userRouteInfo.setPlaybackType(wmd0Var.f252821l);
        userRouteInfo.setPlaybackStream(wmd0Var.f252822m);
        userRouteInfo.setVolume(wmd0Var.f252825p);
        userRouteInfo.setVolumeMax(wmd0Var.f252826q);
        userRouteInfo.setVolumeHandling(wmd0Var.m88556c());
        userRouteInfo.setDescription(wmd0Var.f252814e);
    }

    @Override // p204p.emd0
    /* JADX INFO: renamed from: c */
    public final amd0 mo36411c(String str) {
        int iM50355k = m50355k(str);
        if (iM50355k >= 0) {
            return new jdo0(((kdo0) this.f101191O0.get(iM50355k)).f121705a);
        }
        return null;
    }

    @Override // p204p.emd0
    /* JADX INFO: renamed from: f */
    public final void mo36413f(uld0 uld0Var) {
        boolean zM83362b;
        int i = 0;
        if (uld0Var != null) {
            uld0Var.m83361a();
            ArrayList arrayListM67345b = uld0Var.f231531b.m67345b();
            int size = arrayListM67345b.size();
            int i2 = 0;
            while (i < size) {
                String str = (String) arrayListM67345b.get(i);
                if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                    i2 |= 1;
                } else {
                    i2 = str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | 8388608;
                }
                i++;
            }
            zM83362b = uld0Var.m83362b();
            i = i2;
        } else {
            zM83362b = false;
        }
        if (this.f101188L0 == i && this.f101189M0 == zM83362b) {
            return;
        }
        this.f101188L0 = i;
        this.f101189M0 = zM83362b;
        m50363t();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m50353i(MediaRouter.RouteInfo routeInfo) {
        String strM38565n;
        if (m50351n(routeInfo) != null || m50354j(routeInfo) >= 0) {
            return false;
        }
        String str = this.f101197t.getDefaultRoute() == routeInfo ? "DEFAULT_ROUTE" : String.format(Locale.US, "ROUTE_%08x", Integer.valueOf(m50357m(routeInfo).hashCode()));
        if (m50355k(str) >= 0) {
            int i = 2;
            while (true) {
                Locale locale = Locale.US;
                strM38565n = edb.m38565n(str, "_", i);
                if (m50355k(strM38565n) < 0) {
                    break;
                }
                i++;
            }
            str = strM38565n;
        }
        kdo0 kdo0Var = new kdo0(routeInfo, str);
        e6a0 e6a0Var = new e6a0(str, m50357m(routeInfo));
        m50358o(kdo0Var, e6a0Var);
        kdo0Var.f121707c = e6a0Var.m37919m();
        this.f101191O0.add(kdo0Var);
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final int m50354j(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.f101191O0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((kdo0) arrayList.get(i)).f121705a == routeInfo) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: k */
    public final int m50355k(String str) {
        ArrayList arrayList = this.f101191O0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((kdo0) arrayList.get(i)).f121706b.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public final int m50356l(wmd0 wmd0Var) {
        ArrayList arrayList = this.f101192P0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((ldo0) arrayList.get(i)).f132314a == wmd0Var) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: m */
    public final String m50357m(MediaRouter.RouteInfo routeInfo) {
        int i;
        Context context = this.f60887a;
        CharSequence name = routeInfo.getName(context);
        if (!TextUtils.isEmpty(name)) {
            return name.toString();
        }
        if ((routeInfo.getSupportedTypes() & 8388608) != 0) {
            return "";
        }
        int deviceType = routeInfo.getDeviceType();
        if (deviceType == 1) {
            i = R.string.mr_route_name_tv;
        } else if (deviceType != 2) {
            i = deviceType != 3 ? R.string.mr_route_name_unknown : R.string.mr_route_name_bluetooth;
        } else {
            i = R.string.mr_route_name_speaker;
        }
        return context.getString(i);
    }

    /* JADX INFO: renamed from: o */
    public final void m50358o(kdo0 kdo0Var, e6a0 e6a0Var) {
        Bundle bundle = (Bundle) e6a0Var.f56598b;
        MediaRouter.RouteInfo routeInfo = kdo0Var.f121705a;
        int supportedTypes = routeInfo.getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            e6a0Var.m37913g(f101186Q0);
        }
        if ((supportedTypes & 2) != 0) {
            e6a0Var.m37913g(f101187R0);
        }
        e6a0Var.m37900A(routeInfo.getPlaybackType());
        bundle.putInt("playbackStream", routeInfo.getPlaybackStream());
        e6a0Var.m37901B(routeInfo.getVolume());
        e6a0Var.m37903D(routeInfo.getVolumeMax());
        e6a0Var.m37902C(routeInfo.getVolumeHandling());
        bundle.putBoolean("isSystemRoute", (supportedTypes & 8388608) == 0);
        if (!routeInfo.isEnabled()) {
            bundle.putBoolean(x09.f256832d, false);
        }
        if (routeInfo.isConnecting()) {
            e6a0Var.m37930x(1);
        }
        Display presentationDisplay = routeInfo.getPresentationDisplay();
        if (presentationDisplay != null) {
            bundle.putInt("presentationDisplayId", presentationDisplay.getDisplayId());
        }
        CharSequence description = routeInfo.getDescription();
        if (description != null) {
            bundle.putString("status", description.toString());
        }
        e6a0Var.m37931y(kdo0Var.f121705a.getDeviceType());
    }

    /* JADX INFO: renamed from: p */
    public final void m50359p(wmd0 wmd0Var) {
        emd0 emd0VarM88555b = wmd0Var.m88555b();
        MediaRouter mediaRouter = this.f101197t;
        if (emd0VarM88555b == this) {
            int iM50354j = m50354j(mediaRouter.getSelectedRoute(8388611));
            if (iM50354j < 0 || !((kdo0) this.f101191O0.get(iM50354j)).f121706b.equals(wmd0Var.f252811b)) {
                return;
            }
            wmd0Var.m88564k(false);
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfoCreateUserRoute = mediaRouter.createUserRoute(this.f101195Z);
        ldo0 ldo0Var = new ldo0(wmd0Var, userRouteInfoCreateUserRoute);
        userRouteInfoCreateUserRoute.setTag(ldo0Var);
        userRouteInfoCreateUserRoute.setVolumeCallback(this.f101194Y);
        m50352u(ldo0Var);
        this.f101192P0.add(ldo0Var);
        mediaRouter.addUserRoute(userRouteInfoCreateUserRoute);
    }

    /* JADX INFO: renamed from: q */
    public final void m50360q(wmd0 wmd0Var) {
        int iM50356l;
        if (wmd0Var.m88555b() == this || (iM50356l = m50356l(wmd0Var)) < 0) {
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfo = ((ldo0) this.f101192P0.remove(iM50356l)).f132315b;
        userRouteInfo.setTag(null);
        userRouteInfo.setVolumeCallback(null);
        try {
            this.f101197t.removeUserRoute(userRouteInfo);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m50361r(wmd0 wmd0Var) {
        if (wmd0Var.m88559f()) {
            emd0 emd0VarM88555b = wmd0Var.m88555b();
            MediaRouter mediaRouter = this.f101197t;
            if (emd0VarM88555b != this) {
                int iM50356l = m50356l(wmd0Var);
                if (iM50356l >= 0) {
                    mediaRouter.selectRoute(8388611, ((ldo0) this.f101192P0.get(iM50356l)).f132315b);
                    return;
                }
                return;
            }
            int iM50355k = m50355k(wmd0Var.f252811b);
            if (iM50355k >= 0) {
                mediaRouter.selectRoute(8388611, ((kdo0) this.f101191O0.get(iM50355k)).f121705a);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m50362s() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f101191O0;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            tld0 tld0Var = ((kdo0) arrayList2.get(i)).f121707c;
            if (tld0Var == null) {
                throw new IllegalArgumentException("route must not be null");
            }
            if (arrayList.contains(tld0Var)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            arrayList.add(tld0Var);
        }
        m39415g(new fmd0(arrayList, false));
    }

    /* JADX INFO: renamed from: t */
    public final void m50363t() {
        boolean z = this.f101190N0;
        end0 end0Var = this.f101193X;
        MediaRouter mediaRouter = this.f101197t;
        if (z) {
            mediaRouter.removeCallback(end0Var);
        }
        this.f101190N0 = true;
        mediaRouter.addCallback(this.f101188L0, end0Var, (this.f101189M0 ? 1 : 0) | 2);
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean zM50353i = false;
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zM50353i |= m50353i((MediaRouter.RouteInfo) it.next());
        }
        if (zM50353i) {
            m50362s();
        }
    }
}
