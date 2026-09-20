package p204p;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaRoute2Info;
import android.media.MediaRoute2ProviderService;
import android.media.RouteDiscoveryPreference;
import android.media.RoutingSessionInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Messenger;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.comscore.streaming.ContentMediaFormat;
import com.spotify.searchview.proto.AudioEpisode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class sld0 extends MediaRoute2ProviderService {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f210387f = 0;

    /* JADX INFO: renamed from: b */
    public final hmd0 f210389b;

    /* JADX INFO: renamed from: e */
    public volatile fmd0 f210392e;

    /* JADX INFO: renamed from: a */
    public final Object f210388a = new Object();

    /* JADX INFO: renamed from: c */
    public final uj5 f210390c = new uj5(0);

    /* JADX INFO: renamed from: d */
    public final SparseArray f210391d = new SparseArray();

    static {
        Log.isLoggable("MR2ProviderService", 3);
    }

    public sld0(hmd0 hmd0Var) {
        this.f210389b = hmd0Var;
    }

    /* JADX INFO: renamed from: a */
    public final String m78449a(rld0 rld0Var) {
        String string;
        synchronized (this.f210388a) {
            do {
                string = UUID.randomUUID().toString();
            } while (this.f210390c.containsKey(string));
            rld0Var.f200291i = string;
            this.f210390c.put(string, rld0Var);
        }
        return string;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* JADX INFO: renamed from: b */
    public final amd0 m78450b(String str) {
        ArrayList<rld0> arrayList;
        synchronized (this.f210388a) {
            arrayList = new ArrayList(this.f210390c.values());
        }
        for (rld0 rld0Var : arrayList) {
            gmd0 gmd0Var = (gmd0) rld0Var.f200287e.get();
            amd0 amd0Var = gmd0Var != null ? (amd0) gmd0Var.f81384i.get(str) : (amd0) rld0Var.f200283a.get(str);
            if (amd0Var != null) {
                return amd0Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final zld0 m78451c(String str) {
        zld0 zld0Var;
        synchronized (this.f210388a) {
            rld0 rld0Var = (rld0) this.f210390c.get(str);
            zld0Var = rld0Var == null ? null : rld0Var.f200284b;
        }
        return zld0Var;
    }

    /* JADX INFO: renamed from: d */
    public final tld0 m78452d(String str) {
        lmd0 lmd0Var = (lmd0) this.f210389b.f264693c;
        if ((lmd0Var == null ? null : lmd0Var.f134950d) != null && this.f210392e != null) {
            for (tld0 tld0Var : (List) this.f210392e.f71031d) {
                if (TextUtils.equals(tld0Var.m81050g(), str)) {
                    return tld0Var;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m78453e(gmd0 gmd0Var, amd0 amd0Var, int i, String str, String str2) {
        int i2;
        zld0 qld0Var;
        tld0 tld0VarM78452d = m78452d(str2);
        if (tld0VarM78452d == null) {
            return;
        }
        if (amd0Var instanceof zld0) {
            i2 = 6;
            qld0Var = (zld0) amd0Var;
        } else {
            i2 = !tld0VarM78452d.m81048e().isEmpty() ? 2 : 0;
            qld0Var = new qld0(str2, amd0Var);
        }
        rld0 rld0Var = new rld0(this, qld0Var, 0L, i2, gmd0Var);
        rld0Var.f200292j = str2;
        String strM78449a = m78449a(rld0Var);
        this.f210391d.put(i, strM78449a);
        RoutingSessionInfo.Builder volumeMax = new RoutingSessionInfo.Builder(strM78449a, str).setName(tld0VarM78452d.m81051h()).setVolumeHandling(tld0VarM78452d.m81053j()).setVolume(tld0VarM78452d.m81052i()).setVolumeMax(tld0VarM78452d.m81054k());
        if (tld0VarM78452d.m81048e().isEmpty()) {
            volumeMax.addSelectedRoute(str2);
        } else {
            Iterator it = tld0VarM78452d.m81048e().iterator();
            while (it.hasNext()) {
                volumeMax.addSelectedRoute((String) it.next());
            }
        }
        rld0Var.m75827b(volumeMax.build());
    }

    /* JADX INFO: renamed from: f */
    public final void m78454f(int i) {
        rld0 rld0Var;
        String str = (String) this.f210391d.get(i);
        if (str == null) {
            return;
        }
        this.f210391d.remove(i);
        synchronized (this.f210388a) {
            rld0Var = (rld0) this.f210390c.remove(str);
        }
        if (rld0Var != null) {
            rld0Var.m75826a(false);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m78455g(int i, Intent intent, Messenger messenger, String str) {
        if (getSessionInfo(str) == null) {
            return;
        }
        zld0 zld0VarM78451c = m78451c(str);
        if (zld0VarM78451c == null) {
            notifyRequestFailed(i, 3);
        } else {
            zld0VarM78451c.mo26391d(intent, new pld0(i, intent, messenger, str));
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m78456h(zld0 zld0Var, tld0 tld0Var, Collection collection) {
        rld0 rld0Var;
        synchronized (this.f210388a) {
            try {
                Iterator it = ((nj5) this.f210390c.entrySet()).iterator();
                while (true) {
                    qj5 qj5Var = (qj5) it;
                    if (!qj5Var.hasNext()) {
                        rld0Var = null;
                        break;
                    }
                    qj5Var.next();
                    rld0Var = (rld0) qj5Var.getValue();
                    if (rld0Var.f200284b == zld0Var) {
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (rld0Var == null) {
            return;
        }
        rld0Var.m75829d(tld0Var, collection);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x022b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0275  */
    /* JADX WARN: Code duplicated, block: B:126:0x0295  */
    /* JADX INFO: renamed from: i */
    public final void m78457i(fmd0 fmd0Var) {
        MediaRoute2Info mediaRoute2Info;
        MediaRoute2Info mediaRoute2InfoBuild;
        Bundle bundle;
        this.f210392e = fmd0Var;
        List<tld0> list = fmd0Var == null ? Collections.EMPTY_LIST : (List) fmd0Var.f71031d;
        uj5 uj5Var = new uj5(0);
        for (tld0 tld0Var : list) {
            if (tld0Var != null) {
                uj5Var.put(tld0Var.m81050g(), tld0Var);
            }
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this.f210388a) {
            try {
                Iterator it = ((rj5) this.f210390c.values()).iterator();
                while (true) {
                    un40 un40Var = (un40) it;
                    if (!un40Var.hasNext()) {
                        break;
                    }
                    rld0 rld0Var = (rld0) un40Var.next();
                    if ((rld0Var.f200286d & 4) == 0) {
                        arrayList.add(rld0Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            mediaRoute2Info = null;
            if (!it2.hasNext()) {
                break;
            }
            rld0 rld0Var2 = (rld0) it2.next();
            qld0 qld0Var = (qld0) rld0Var2.f200284b;
            if (uj5Var.containsKey(qld0Var.f189845f)) {
                rld0Var2.m75829d((tld0) uj5Var.get(qld0Var.f189845f), null);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = ((rj5) uj5Var.values()).iterator();
        while (true) {
            un40 un40Var2 = (un40) it3;
            if (!un40Var2.hasNext()) {
                notifyRoutes(arrayList2);
                return;
            }
            tld0 tld0Var2 = (tld0) un40Var2.next();
            if (tld0Var2 == null) {
                mediaRoute2InfoBuild = mediaRoute2Info;
            } else if (TextUtils.isEmpty(tld0Var2.m81050g()) || TextUtils.isEmpty(tld0Var2.m81051h())) {
                mediaRoute2InfoBuild = null;
            } else {
                MediaRoute2Info.Builder volumeMax = new MediaRoute2Info.Builder(tld0Var2.m81050g(), tld0Var2.m81051h()).setDescription(tld0Var2.f221451a.getString("status")).setConnectionState(tld0Var2.f221451a.getInt("connectionState", 0)).setVolumeHandling(tld0Var2.m81053j()).setVolume(tld0Var2.m81052i()).setVolumeMax(tld0Var2.m81054k());
                ArrayList arrayListM81045b = tld0Var2.m81045b();
                HashSet hashSet = new HashSet();
                Iterator it4 = arrayListM81045b.iterator();
                while (true) {
                    int i = 3;
                    if (it4.hasNext()) {
                        IntentFilter intentFilter = (IntentFilter) it4.next();
                        int iCountCategories = intentFilter.countCategories();
                        for (int i2 = 0; i2 < iCountCategories; i2++) {
                            String category = intentFilter.getCategory(i2);
                            category.getClass();
                            switch (category) {
                                case "android.media.intent.category.REMOTE_PLAYBACK":
                                    category = "android.media.route.feature.REMOTE_PLAYBACK";
                                    break;
                                case "android.media.intent.category.LIVE_AUDIO":
                                    category = "android.media.route.feature.LIVE_AUDIO";
                                    break;
                                case "android.media.intent.category.LIVE_VIDEO":
                                    category = "android.media.route.feature.LIVE_VIDEO";
                                    break;
                                case "android.media.intent.category.REMOTE_AUDIO_PLAYBACK":
                                    category = "android.media.route.feature.REMOTE_AUDIO_PLAYBACK";
                                    break;
                                case "android.media.intent.category.REMOTE_VIDEO_PLAYBACK":
                                    category = "android.media.route.feature.REMOTE_VIDEO_PLAYBACK";
                                    break;
                            }
                            hashSet.add(category);
                        }
                    } else {
                        MediaRoute2Info.Builder iconUri = volumeMax.addFeatures(hashSet).setIconUri(tld0Var2.m81049f());
                        if (Build.VERSION.SDK_INT >= 34) {
                            ArrayList<String> stringArrayList = tld0Var2.f221451a.getStringArrayList("deduplicationIds");
                            AbstractC1665af.m25761K(iconUri, stringArrayList != null ? Collections.unmodifiableSet(new HashSet(stringArrayList)) : Collections.EMPTY_SET);
                            AbstractC1665af.m25774e(iconUri, tld0Var2);
                            int iM81046c = tld0Var2.m81046c();
                            if (iM81046c != 1000) {
                                switch (iM81046c) {
                                    case 1:
                                        i = 1001;
                                        break;
                                    case 2:
                                        i = 1002;
                                        break;
                                    case 3:
                                        i = 8;
                                        break;
                                    case 4:
                                        i = 1003;
                                        break;
                                    case 5:
                                        i = 1004;
                                        break;
                                    case 6:
                                        i = 1005;
                                        break;
                                    case 7:
                                        i = 1006;
                                        break;
                                    case 8:
                                        i = 1007;
                                        break;
                                    case 9:
                                        i = 1008;
                                        break;
                                    case 10:
                                        i = 1009;
                                        break;
                                    case 11:
                                        i = ContentMediaFormat.EXTRA_GENERIC;
                                        break;
                                    case 12:
                                        i = 2;
                                        break;
                                    case 13:
                                        break;
                                    case 14:
                                        i = 4;
                                        break;
                                    default:
                                        switch (iM81046c) {
                                            case 16:
                                                i = 9;
                                                break;
                                            case 17:
                                                i = 11;
                                                break;
                                            case 18:
                                                i = 12;
                                                break;
                                            case 19:
                                                i = 13;
                                                break;
                                            case 20:
                                                i = 22;
                                                break;
                                            case 21:
                                                i = 23;
                                                break;
                                            case 22:
                                                i = 26;
                                                break;
                                            case 23:
                                                i = 10;
                                                break;
                                            case 24:
                                                i = 29;
                                                break;
                                            default:
                                                i = 0;
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                i = AudioEpisode.SHOW_URI_FIELD_NUMBER;
                            }
                            AbstractC1665af.m25762L(iconUri, i);
                        }
                        int iM81046c2 = tld0Var2.m81046c();
                        if (iM81046c2 != 1) {
                            if (iM81046c2 == 2) {
                            }
                            if (tld0Var2.f221451a.getBoolean("isDynamicGroupRoute", false)) {
                                iconUri.addFeature("android.media.route.feature.REMOTE_DYNAMIC_GROUP_ROUTE");
                            }
                            bundle = new Bundle();
                            bundle.putBundle("androidx.mediarouter.media.KEY_EXTRAS", tld0Var2.m81047d());
                            bundle.putParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS", new ArrayList<>(tld0Var2.m81045b()));
                            bundle.putInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", tld0Var2.m81046c());
                            bundle.putInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", tld0Var2.f221451a.getInt("playbackType", 1));
                            bundle.putString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID", tld0Var2.m81050g());
                            if (!tld0Var2.m81048e().isEmpty()) {
                                iconUri.addFeature("android.media.route.feature.REMOTE_GROUP_PLAYBACK");
                                bundle.putStringArrayList("androidx.mediarouter.media.KEY_GROUP_MEMBER_IDS", new ArrayList<>(tld0Var2.m81048e()));
                            }
                            iconUri.setExtras(bundle);
                            if (tld0Var2.m81045b().isEmpty()) {
                                iconUri.addFeature("android.media.route.feature.EMPTY");
                            }
                            mediaRoute2InfoBuild = iconUri.build();
                        } else {
                            iconUri.addFeature("android.media.route.feature.REMOTE_VIDEO_PLAYBACK");
                        }
                        iconUri.addFeature("android.media.route.feature.REMOTE_AUDIO_PLAYBACK");
                        if (tld0Var2.f221451a.getBoolean("isDynamicGroupRoute", false)) {
                            iconUri.addFeature("android.media.route.feature.REMOTE_DYNAMIC_GROUP_ROUTE");
                        }
                        bundle = new Bundle();
                        bundle.putBundle("androidx.mediarouter.media.KEY_EXTRAS", tld0Var2.m81047d());
                        bundle.putParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS", new ArrayList<>(tld0Var2.m81045b()));
                        bundle.putInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", tld0Var2.m81046c());
                        bundle.putInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", tld0Var2.f221451a.getInt("playbackType", 1));
                        bundle.putString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID", tld0Var2.m81050g());
                        if (!tld0Var2.m81048e().isEmpty()) {
                            iconUri.addFeature("android.media.route.feature.REMOTE_GROUP_PLAYBACK");
                            bundle.putStringArrayList("androidx.mediarouter.media.KEY_GROUP_MEMBER_IDS", new ArrayList<>(tld0Var2.m81048e()));
                        }
                        iconUri.setExtras(bundle);
                        if (tld0Var2.m81045b().isEmpty()) {
                            iconUri.addFeature("android.media.route.feature.EMPTY");
                        }
                        mediaRoute2InfoBuild = iconUri.build();
                    }
                }
            }
            if (mediaRoute2InfoBuild != null) {
                arrayList2.add(mediaRoute2InfoBuild);
            }
            mediaRoute2Info = null;
        }
    }

    public final void onCreateSession(long j, String str, String str2, Bundle bundle) {
        int i;
        zld0 qld0Var;
        lmd0 lmd0Var = (lmd0) this.f210389b.f264693c;
        dmd0 dmd0Var = lmd0Var == null ? null : lmd0Var.f134950d;
        tld0 tld0VarM78452d = m78452d(str2);
        if (tld0VarM78452d == null) {
            notifyRequestFailed(j, 3);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("controlHints", bundle);
        bundle2.putString("clientPackageName", str);
        new cmd0(bundle2);
        if (this.f210392e.f71029b) {
            zld0 zld0VarMo36410a = dmd0Var.mo36410a(str2);
            if (zld0VarMo36410a == null) {
                notifyRequestFailed(j, 1);
                return;
            } else {
                i = 7;
                qld0Var = zld0VarMo36410a;
            }
        } else {
            amd0 amd0VarMo36411c = dmd0Var.mo36411c(str2);
            if (amd0VarMo36411c == null) {
                notifyRequestFailed(j, 1);
                return;
            } else {
                i = tld0VarM78452d.m81048e().isEmpty() ? 1 : 3;
                qld0Var = new qld0(str2, amd0VarMo36411c);
            }
        }
        qld0Var.mo26393f();
        rld0 rld0Var = new rld0(this, qld0Var, j, i, null);
        RoutingSessionInfo.Builder volumeMax = new RoutingSessionInfo.Builder(m78449a(rld0Var), str).setName(tld0VarM78452d.m81051h()).setVolumeHandling(tld0VarM78452d.m81053j()).setVolume(tld0VarM78452d.m81052i()).setVolumeMax(tld0VarM78452d.m81054k());
        if (tld0VarM78452d.m81048e().isEmpty()) {
            volumeMax.addSelectedRoute(str2);
        } else {
            Iterator it = tld0VarM78452d.m81048e().iterator();
            while (it.hasNext()) {
                volumeMax.addSelectedRoute((String) it.next());
            }
        }
        RoutingSessionInfo routingSessionInfoBuild = volumeMax.build();
        rld0Var.m75827b(routingSessionInfoBuild);
        if ((i & 4) == 0) {
            if ((i & 2) != 0) {
                rld0Var.m75828c(str2, null, routingSessionInfoBuild);
            } else {
                rld0Var.f200283a.put(str2, rld0Var.f200284b);
            }
        }
        hmd0 hmd0Var = this.f210389b;
        qld0Var.m96361o(lzj.m60328F(((lmd0) hmd0Var.f264693c).getApplicationContext()), hmd0Var.f92962j);
    }

    public final void onDeselectRoute(long j, String str, String str2) {
        if (getSessionInfo(str) == null) {
            notifyRequestFailed(j, 4);
            return;
        }
        if (m78452d(str2) == null) {
            notifyRequestFailed(j, 3);
            return;
        }
        zld0 zld0VarM78451c = m78451c(str);
        if (zld0VarM78451c == null) {
            notifyRequestFailed(j, 3);
        } else {
            zld0VarM78451c.mo39919m(str2);
        }
    }

    public final void onDiscoveryPreferenceChanged(RouteDiscoveryPreference routeDiscoveryPreference) {
        uld0 uld0VarM32838G = ci11.m32838G(routeDiscoveryPreference);
        hmd0 hmd0Var = this.f210389b;
        hmd0Var.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!Objects.equals((uld0) hmd0Var.f264696f, uld0VarM32838G) || uld0VarM32838G.m83362b()) {
            hmd0Var.f264696f = uld0VarM32838G;
            hmd0Var.f264692b = jElapsedRealtime;
            hmd0Var.m91717r();
        }
    }

    public final void onReleaseSession(long j, String str) {
        rld0 rld0Var;
        if (getSessionInfo(str) == null) {
            return;
        }
        synchronized (this.f210388a) {
            rld0Var = (rld0) this.f210390c.remove(str);
        }
        if (rld0Var == null) {
            notifyRequestFailed(j, 4);
        } else {
            rld0Var.m75826a(true);
        }
    }

    public final void onSelectRoute(long j, String str, String str2) {
        if (getSessionInfo(str) == null) {
            notifyRequestFailed(j, 4);
            return;
        }
        if (m78452d(str2) == null) {
            notifyRequestFailed(j, 3);
            return;
        }
        zld0 zld0VarM78451c = m78451c(str);
        if (zld0VarM78451c == null) {
            notifyRequestFailed(j, 3);
        } else {
            zld0VarM78451c.mo39918l(str2);
        }
    }

    public final void onSetRouteVolume(long j, String str, int i) {
        amd0 amd0VarM78450b = m78450b(str);
        if (amd0VarM78450b == null) {
            notifyRequestFailed(j, 3);
        } else {
            amd0VarM78450b.mo26394g(i);
        }
    }

    public final void onSetSessionVolume(long j, String str, int i) {
        if (getSessionInfo(str) == null) {
            notifyRequestFailed(j, 4);
            return;
        }
        zld0 zld0VarM78451c = m78451c(str);
        if (zld0VarM78451c == null) {
            notifyRequestFailed(j, 3);
        } else {
            zld0VarM78451c.mo26394g(i);
        }
    }

    public final void onTransferToRoute(long j, String str, String str2) {
        if (getSessionInfo(str) == null) {
            notifyRequestFailed(j, 4);
            return;
        }
        if (m78452d(str2) == null) {
            notifyRequestFailed(j, 3);
            return;
        }
        zld0 zld0VarM78451c = m78451c(str);
        if (zld0VarM78451c == null) {
            notifyRequestFailed(j, 3);
        } else {
            zld0VarM78451c.mo39920n(Collections.singletonList(str2));
        }
    }
}
