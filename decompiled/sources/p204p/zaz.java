package p204p;

import android.app.job.JobParameters;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Pair;
import androidx.media3.session.legacy.MediaBrowserCompat;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zaz implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f281186a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f281187b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f281188c;

    public /* synthetic */ zaz(int i, Object obj, Object obj2) {
        this.f281186a = i;
        this.f281187b = obj;
        this.f281188c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        fmd0 fmd0Var;
        int i5 = this.f281186a;
        int i6 = 1;
        Object obj = this.f281188c;
        Object obj2 = this.f281187b;
        switch (i5) {
            case 0:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) obj2;
                ev61 ev61Var = (ev61) obj;
                d501 d501Var = FirebaseMessaging.f2408k;
                try {
                    ev61Var.m40097b(firebaseMessaging.m1894a());
                    return;
                } catch (Exception e) {
                    ev61Var.m40096a(e);
                    return;
                }
            case 1:
                fx10 fx10Var = (fx10) obj;
                for (Pair pair : (ArrayList) obj2) {
                    ((zw10) pair.first).mo41049a((gx10) pair.second);
                }
                Iterator it = fx10Var.f74221c.iterator();
                while (it.hasNext()) {
                    ((C2411td) it.next()).f219196a.run();
                }
                return;
            case 2:
                ((hqb) obj2).m48208B((rb20) obj, w2a1.f247311a);
                return;
            case 3:
                x43 x43Var = (x43) obj2;
                c95.m31855u(x43Var.f257959b);
                ((HashSet) x43Var.f257967t).remove((String) obj);
                if (((pf40) x43Var.f257957Z) != null) {
                    x43Var.m89834k(-9223372036854775807L);
                    return;
                }
                return;
            case 4:
                h7u h7uVar = ((r130) obj2).f194729c;
                Uri uri = ((p030) obj).f172463m;
                rjp rjpVar = (rjp) ((r030) h7uVar.f88555b).f194366b.f209912d.get(uri);
                if (rjpVar != null) {
                    rjp.m75650b(rjpVar, uri, true);
                    return;
                }
                return;
            case 5:
                xvb xvbVar = (xvb) obj;
                ((xvb) obj2).m92224m();
                if (xvbVar != null) {
                    xvbVar.m92224m();
                    return;
                }
                return;
            case 6:
                ev61 ev61Var2 = (ev61) obj;
                try {
                    ev61Var2.m40097b(((m540) obj2).m60829a());
                    return;
                } catch (Exception e2) {
                    ev61Var2.m40096a(e2);
                    return;
                }
            case 7:
                ke60 ke60Var = (ke60) obj;
                why0.m88178a("JavaUploadDataSinkBase#executeOnExecutor " + ((String) obj2) + " running callback");
                try {
                    ke60Var.run();
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            case 8:
                ue60 ue60Var = (ue60) obj2;
                re60 re60Var = ue60Var.f229414a;
                String str = ue60Var.f229429p;
                re60Var.getClass();
                re60Var.m75383b(new jt4(re60Var, (yka1) obj, str, 12), "onRedirectReceived");
                return;
            case 9:
                ue60 ue60Var2 = (ue60) obj2;
                ue60Var2.m82894c(new ke60(ue60Var2, (us30) obj, 2), "read");
                return;
            case 10:
                int i7 = JobInfoSchedulerService.f1671a;
                ((JobInfoSchedulerService) obj2).jobFinished((JobParameters) obj, false);
                return;
            case 11:
                ((xoi0) ((xh70) obj2).f261460b).mo33102k((dk90) obj);
                return;
            case 12:
                dk90 dk90Var = (dk90) obj2;
                ek90 ek90Var = (ek90) obj;
                if (dk90Var.f49931a.get()) {
                    ek90Var.getClass();
                    dk90Var.f49932b.mo49913c(ek90Var.f60415a);
                    return;
                }
                return;
            case 13:
                vya0 vya0Var = (vya0) obj2;
                Bundle bundle = (Bundle) obj;
                if (p2l.f173365a.contains(vya0.class)) {
                    return;
                }
                try {
                    vya0Var.f246031b.m33793J("fb_mobile_login_heartbeat", bundle);
                    return;
                } catch (Throwable th3) {
                    p2l.m68953a(vya0.class, th3);
                    return;
                }
            case 14:
                vad0 vad0Var = (vad0) obj2;
                vad0Var.f239227c1.set(vad0Var.m65987G((xyx) obj, vad0Var.f239215W0, 0));
                return;
            case 15:
                jcd0 jcd0Var = (jcd0) obj2;
                ocd0 ocd0Var = (ocd0) obj;
                if (jcd0Var.f111093o) {
                    return;
                }
                ocd0Var.mo56040a(jcd0Var);
                return;
            case 16:
                MediaBrowserServiceCompat.Result result = (MediaBrowserServiceCompat.Result) obj;
                try {
                    r201 r201Var = (r201) ((y790) obj2).get();
                    c95.m31848n(r201Var, "SessionResult must not be null");
                    result.sendResult(r201Var.f195004b);
                    return;
                } catch (InterruptedException | CancellationException | ExecutionException e3) {
                    yif1.m93821x0("Custom action failed", e3);
                    result.sendError(null);
                    return;
                }
            case 17:
                ArrayList arrayList = (ArrayList) obj;
                if (((t601) obj2).isCancelled()) {
                    for (int i8 = 0; i8 < arrayList.size(); i8++) {
                        if (arrayList.get(i8) != null) {
                            ((u790) arrayList.get(i8)).cancel(false);
                        }
                    }
                    return;
                }
                return;
            case 18:
                ArrayList arrayList2 = (ArrayList) obj;
                pgd0 pgd0Var = ((ngd0) obj2).f153654d;
                for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                    ogd0 ogd0Var = (ogd0) arrayList2.get(i9);
                    Bundle bundle2 = ogd0Var.f165094d;
                    MediaBrowserServiceCompat.Result result2 = ogd0Var.f165095e;
                    if (bundle2 != null) {
                        try {
                            bundle2.setClassLoader(pgd0Var.f177293d.f201546f.getClassLoader());
                            i = bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
                            i2 = bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
                        } catch (BadParcelableException unused) {
                            result2.sendResult(null);
                            return;
                        }
                    } else {
                        i = 0;
                        i2 = Integer.MAX_VALUE;
                    }
                    if (i < 0 || i2 < 1) {
                        i3 = 0;
                        i4 = Integer.MAX_VALUE;
                    } else {
                        i3 = i;
                        i4 = i2;
                    }
                    t601 t601VarM46324m0 = h0b1.m46324m0(pgd0Var.f177293d.m36018K(ogd0Var.f165091a, ogd0Var.f165093c, i3, i4, x280.m89722d(pgd0Var.f177293d.f201546f, bundle2)), new hgd0(pgd0Var, i6));
                    t601VarM46324m0.mo28322a(new lgd0(t601VarM46324m0, result2, i6), ckr.f39074a);
                    break;
                }
                return;
            case 19:
                dhd0 dhd0Var = (dhd0) obj2;
                String str2 = (String) obj;
                wsv0 wsv0VarMo36024i = dhd0Var.f49060H.f79643a.mo36024i();
                for (int i10 = 0; i10 < wsv0VarMo36024i.f254765d; i10++) {
                    tnd0 tnd0VarM76127m = (tnd0) wsv0VarMo36024i.get(i10);
                    if (!dhd0Var.f201537B || !dhd0Var.m76131r(tnd0VarM76127m) || (tnd0VarM76127m = dhd0Var.m76127m()) != null) {
                        dhd0Var.m76122f(tnd0VarM76127m, new us30(11, dhd0Var, str2));
                    }
                }
                return;
            case 20:
                ((qhd0) obj2).f188721d.reportTrackChangeEvent((TrackChangeEvent) obj);
                return;
            case 21:
                ((qhd0) obj2).f188721d.reportNetworkEvent((NetworkEvent) obj);
                return;
            case 22:
                ((qhd0) obj2).f188721d.reportPlaybackErrorEvent((PlaybackErrorEvent) obj);
                return;
            case 23:
                ((qhd0) obj2).f188721d.reportPlaybackMetrics((PlaybackMetrics) obj);
                return;
            case 24:
                ((qhd0) obj2).f188721d.reportPlaybackStateEvent((PlaybackStateEvent) obj);
                return;
            case 25:
                gmd0 gmd0Var = (gmd0) obj2;
                if (gmd0Var.f81386k.remove((String) obj) == null || (fmd0Var = ((lmd0) gmd0Var.f81387l.f264693c).f134950d.f60893g) == null) {
                    return;
                }
                lmd0.m59427d(gmd0Var.f113831a, 5, 0, 0, gmd0Var.mo45228a(fmd0Var), null);
                return;
            case 26:
                ((y8j) obj2).accept((ArrayList) obj);
                return;
            case 27:
                rpd0 rpd0Var = (rpd0) obj2;
                pf40 pf40Var = (pf40) obj;
                rpd0Var.f201539D = pf40Var;
                pqd0 pqd0Var = rpd0Var.f201548h;
                pqd0Var.f180286u = pf40Var;
                pqd0Var.m70645m();
                rpd0Var.m76123g(new zca0(pf40Var, 15));
                return;
            case 28:
                rpd0 rpd0Var2 = (rpd0) obj2;
                pdp0 pdp0Var = (pdp0) obj;
                pqd0 pqd0Var2 = rpd0Var2.f201548h;
                rpd0Var2.f201560t = pdp0Var;
                ppd0 ppd0Var = new ppd0(rpd0Var2, pdp0Var);
                pdp0Var.mo43839I(ppd0Var);
                rpd0Var2.f201562v = ppd0Var;
                try {
                    pqd0Var2.f180271f.m65407r(0, pdp0Var);
                    break;
                } catch (RemoteException e4) {
                    yif1.m93810s("Exception in using media1 API", e4);
                }
                pqd0Var2.f180275j.setActive(true);
                rpd0Var2.f201559s = new cap0(pdp0Var.mo43843K(), 0, pdp0Var.m69694c1(), pdp0Var.m69693b1(), pdp0Var.m69693b1(), 0, pdp0Var.mo43890j(), pdp0Var.getRepeatMode(), pdp0Var.mo43857R0(), pdp0Var.mo43910u0(), pdp0Var.m69696e1(), 0, pdp0Var.mo43865W(18) ? pdp0Var.mo43846L0() : phd0.f177558M, pdp0Var.mo43865W(22) ? pdp0Var.mo43879d() : 1.0f, 1.0f, pdp0Var.mo43865W(21) ? pdp0Var.mo43912v0() : xs6.f265509i, 0, pdp0Var.mo43865W(28) ? pdp0Var.mo43861U() : o0m.f160423d, pdp0Var.mo43896m(), pdp0Var.mo43865W(23) ? pdp0Var.mo43887h0() : 0, pdp0Var.m69698g1(), pdp0Var.mo43899o(), 1, pdp0Var.mo43873a0(), pdp0Var.getPlaybackState(), pdp0Var.mo43888i(), pdp0Var.mo43877c(), pdp0Var.m69697f1(), pdp0Var.mo43871Z0(), pdp0Var.mo43835F0(), pdp0Var.mo43900o0(), pdp0Var.mo43865W(30) ? pdp0Var.mo43858S() : tt81.f223553b, pdp0Var.mo43882e0());
                rpd0Var2.m76129o(pdp0Var.mo43895l0());
                return;
            default:
                rpd0 rpd0Var3 = (rpd0) obj2;
                Bundle bundle3 = (Bundle) obj;
                rpd0Var3.f201540E = bundle3;
                rpd0Var3.m76123g(new ncd0(i6, bundle3));
                return;
        }
    }
}
