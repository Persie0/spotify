package p204p;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.credentials.exceptions.GetCredentialException;
import com.spotify.base.java.logging.Logger;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoItemsResponse;
import com.spotify.encoreconsumermobile.elements.backbutton.BackButtonView;
import com.spotify.encoreconsumermobile.elements.badge.badgegroup.BadgeGroupView;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.MessageParsingException;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.data.network.MessageNotReturnedException;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import com.spotify.pendragon.p123v1.proto.FetchMessageListResponse;
import com.spotify.pendragon.p123v1.proto.InAppMessage;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.subjects.Subject;
import io.reactivex.rxjava3.subjects.UnicastSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public class qq8 implements Function, ObservableOnSubscribe, ggc1, qja1, nar0, dn6, Producer, ant {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f191504a;

    /* JADX INFO: renamed from: b */
    public Object f191505b;

    public /* synthetic */ qq8(Object obj, int i) {
        this.f191504a = i;
        this.f191505b = obj;
    }

    @Override // p204p.nar0
    /* JADX INFO: renamed from: a */
    public Long mo64035a() {
        lar0 lar0Var = (lar0) this.f191505b;
        if (lar0Var != null) {
            jar0 jar0Var = lar0Var.f131400b;
            iar0 iar0Var = jar0Var instanceof iar0 ? (iar0) jar0Var : null;
            kar0 kar0Var = iar0Var != null ? iar0Var.f100331b : null;
            if (kar0Var != null) {
                long j = kar0Var.f120953b;
                hvi0 hvi0Var = cks.f39079b;
                return Long.valueOf(TimeUnit.SECONDS.toMillis(cks.m33199r(j, ils.SECONDS)));
            }
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) throws MessageNotReturnedException {
        switch (this.f191504a) {
            case 2:
                qry qryVar = (qry) obj;
                vc9 vc9Var = (vc9) this.f191505b;
                tvx0 tvx0Var = vc9Var.f240076a;
                int i = qryVar.f191924b.f58716b.f251737a;
                tvx0Var.getClass();
                return Single.zip(sjf1.m78337v(Single.create(new t9w0(tvx0Var, i, 2)), 4).compose(new zy5(1)), sjf1.m78337v(vc9Var.f240077b.mo65228a().map(snq0.f211016t), 1), new fj1(qryVar, 26)).doOnSubscribe(new kc9(vc9Var, 0));
            case 5:
                Logger.m3967c((Throwable) obj, "Assisted Curation: Failed to fetch next page of Bridge Tracks", new Object[0]);
                return (yja) this.f191505b;
            case 9:
                Throwable th = (Throwable) obj;
                ((unb) this.f191505b).getClass();
                na6.m63959g("Cannot start playing from PlayAction", th);
                return new hcf(edb.m38564m("Cannot start playing from PlayAction", th.getLocalizedMessage()));
            case 10:
                Map map = (Map) obj;
                ((b3c) this.f191505b).f23015b = g0c.f75332a;
                return map;
            case 14:
                FetchMessageListResponse fetchMessageListResponse = (FetchMessageListResponse) obj;
                ycc yccVar = (ycc) this.f191505b;
                if (fetchMessageListResponse.getMessagesList().isEmpty() && fetchMessageListResponse.m17164o().isEmpty()) {
                    throw new MessageNotReturnedException();
                }
                ArrayList arrayList = new ArrayList();
                for (InAppMessage inAppMessage : fetchMessageListResponse.getMessagesList()) {
                    try {
                        nwo nwoVar = (nwo) yccVar.f271454c;
                        wj50.m88279p(inAppMessage);
                        arrayList.add(nwoVar.invoke(inAppMessage));
                    } catch (MessageParsingException e) {
                        wj50.m88279p(inAppMessage);
                        ycc.m93338a(yccVar, inAppMessage, e);
                    }
                }
                ae50 ae50VarM17164o = fetchMessageListResponse.m17164o();
                b321 b321Var = (b321) yccVar.f271455d;
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(ae50VarM17164o, 10));
                Iterator<E> it = ae50VarM17164o.iterator();
                while (it.hasNext()) {
                    arrayList2.add(b321Var.invoke(it.next()));
                }
                return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.network.FetchMessageListResponse(arrayList, arrayList2);
            case 15:
                wh51 wh51Var = ((a1f) this.f191505b).f11401f;
                boolean z = ((y0f) obj).f267977a;
                return ((hy21) ((kx21) wh51Var.f251263c)).m49111e((String) wh51Var.f251262b, z ? r431.f195646b : r431.f195645a, null).m23296h(af8.f15059M0);
            case 16:
                return j4f.m52339d((j4f) this.f191505b, (CollectionPlatformEsperantoItemsResponse) obj);
            case 17:
                return new dyl0(new pqm0((eyl0) this.f191505b, (Map) obj));
            default:
                ybv ybvVar = ((qu80) obj).f192599e;
                boolean z2 = ybvVar.f271278w.f156638b;
                u300 u300VarM87094a = ((w300) ((x5j) this.f191505b).f258454d).m87094a(ybvVar.f271271p);
                return Boolean.valueOf((!z2 || u300VarM87094a == u300.PROMPT_PLAYLIST || u300VarM87094a == u300.PROMPT_PLAYLIST_TEST) ? false : true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m73499b(ihl0 ihl0Var, ibk ibkVar) {
        yxd yxdVar;
        if (ibkVar instanceof yxd) {
            yxdVar = (yxd) ibkVar;
            int i = yxdVar.f277230c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yxdVar.f277230c = i - Integer.MIN_VALUE;
            } else {
                yxdVar = new yxd(this, ibkVar);
            }
        } else {
            yxdVar = new yxd(this, ibkVar);
        }
        Object objM56684z = yxdVar.f277228a;
        int i2 = yxdVar.f277230c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM56684z);
                wj0 wj0Var = new wj0(this, ihl0Var, (fbk) null, 17);
                yxdVar.f277230c = 1;
                objM56684z = kk40.m56684z(wj0Var, yxdVar);
                yuk yukVar = yuk.f276404a;
                if (objM56684z == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM56684z);
            }
            return (ljl0) objM56684z;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return new xil0(true);
        }
    }

    @Override // p204p.ggc1
    /* JADX INFO: renamed from: c */
    public Subject mo44686c() {
        return (Subject) this.f191505b;
    }

    @Override // p204p.nar0
    /* JADX INFO: renamed from: d */
    public Long mo64036d() {
        lar0 lar0Var = (lar0) this.f191505b;
        if (lar0Var != null) {
            jar0 jar0Var = lar0Var.f131400b;
            iar0 iar0Var = jar0Var instanceof iar0 ? (iar0) jar0Var : null;
            kar0 kar0Var = iar0Var != null ? iar0Var.f100331b : null;
            if (kar0Var != null) {
                long j = kar0Var.f120952a;
                hvi0 hvi0Var = cks.f39079b;
                return Long.valueOf(TimeUnit.SECONDS.toMillis(cks.m33199r(j, ils.SECONDS)));
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001c  */
    @Override // p204p.nar0
    /* JADX INFO: renamed from: e */
    public String mo64037e() {
        hhb1 hhb1Var;
        lar0 lar0Var = (lar0) this.f191505b;
        if (lar0Var != null) {
            jar0 jar0Var = lar0Var.f131400b;
            iar0 iar0Var = jar0Var instanceof iar0 ? (iar0) jar0Var : null;
            ihb1 ihb1Var = iar0Var != null ? iar0Var.f100330a : null;
            if (ihb1Var != null) {
                hhb1Var = ihb1Var.f102229a;
            } else {
                hhb1Var = null;
            }
        } else {
            hhb1Var = null;
        }
        ghb1 ghb1Var = hhb1Var instanceof ghb1 ? (ghb1) hhb1Var : null;
        if (ghb1Var != null) {
            return ghb1Var.f79881a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public Object m73500f(gcl gclVar, ArrayList arrayList, String str, nkb nkbVar, ibk ibkVar) {
        x4l x4lVar;
        okb gkbVar;
        if (ibkVar instanceof x4l) {
            x4lVar = (x4l) ibkVar;
            int i = x4lVar.f258145c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x4lVar.f258145c = i - Integer.MIN_VALUE;
            } else {
                x4lVar = new x4l(this, ibkVar);
            }
        } else {
            x4lVar = new x4l(this, ibkVar);
        }
        Object objM37673h = x4lVar.f258143a;
        int i2 = x4lVar.f258145c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM37673h);
                if (gclVar instanceof fcl) {
                    gkbVar = new hkb(arrayList, nkbVar, ((fcl) gclVar).f68137a, ((fcl) gclVar).f68138b, str);
                } else {
                    if (!(gclVar instanceof ecl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gkbVar = new gkb((String) g6f.m43741q0(arrayList), nkbVar);
                }
                e3p e3pVar = (e3p) this.f191505b;
                x4lVar.f258145c = 1;
                objM37673h = e3pVar.m37673h(gkbVar, x4lVar);
                yuk yukVar = yuk.f276404a;
                if (objM37673h == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM37673h);
            }
            return (rvc) objM37673h;
        } catch (Throwable th) {
            return new c6x0(th);
        }
    }

    @Override // p204p.dn6
    /* JADX INFO: renamed from: g */
    public Single mo25091g(Intent intent, e301 e301Var) {
        switch (this.f191504a) {
            case 19:
                ogm0 ogm0Var = (ogm0) this.f191505b;
                Class clsMo24412c = ogm0Var.mo24412c();
                Set set = dd41.f47702f;
                return Single.just(new u1j0(clsMo24412c, ogm0Var.mo24413d(intent, r46.m74726U(intent.getDataString()), e301Var), ogm0Var.mo24414e()));
            default:
                n5q n5qVar = xsr.f265651a;
                return vjf1.m85770t(pvb0.f181680a, new xvd(this, intent, e301Var, (fbk) null, 25)).onErrorReturn(v450.f237057U0);
        }
    }

    @Override // com.spotify.mobius.functions.Producer
    public Object get() {
        switch (this.f191504a) {
            case 21:
                return new SchedulerWorkRunner(((upj) this.f191505b).f232706c);
            default:
                return new DispatcherWorker(((b6m) this.f191505b).f23988d);
        }
    }

    @Override // p204p.nar0
    public String getImageUri() {
        List list;
        Object next;
        lar0 lar0Var = (lar0) this.f191505b;
        if (lar0Var != null) {
            jar0 jar0Var = lar0Var.f131400b;
            iar0 iar0Var = jar0Var instanceof iar0 ? (iar0) jar0Var : null;
            ihb1 ihb1Var = iar0Var != null ? iar0Var.f100330a : null;
            if (ihb1Var != null && (list = ihb1Var.f102230b.f139524a) != null) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((z240) next).f278476b != a340.f11862c);
                z240 z240Var = (z240) next;
                if (z240Var != null) {
                    return z240Var.f278475a.f198763a;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public l7s m73501h() {
        sdo sdoVar = (sdo) this.f191505b;
        fwk0 fwk0Var = (fwk0) sdoVar.f208048b;
        jg31.m53271i(fwk0Var);
        aca0 aca0Var = (aca0) sdoVar.f208049c;
        jg31.m53271i(aca0Var);
        hwk0 hwk0Var = new hwk0(fwk0Var, aca0Var);
        gmj gmjVar = (gmj) sdoVar.f208050d;
        jg31.m53271i(gmjVar);
        sas sasVar = new sas(hwk0Var, gmjVar);
        fiz fizVar = (fiz) sdoVar.f208051e;
        luk lukVar = (luk) sdoVar.f208052f;
        jg31.m53271i(lukVar);
        luk lukVar2 = (luk) sdoVar.f208053g;
        jg31.m53271i(lukVar2);
        return new l7s(sasVar, fizVar, lukVar, lukVar2);
    }

    /* JADX INFO: renamed from: i */
    public ConstraintLayout m73502i() {
        return (BadgeGroupView) this.f191505b;
    }

    /* JADX INFO: renamed from: j */
    public s4a0 m73503j() {
        return v3h1.m84575H(((hol0) this.f191505b).m48099x());
    }

    /* JADX INFO: renamed from: k */
    public xxg0 m73504k() {
        hq31 hq31Var = (hq31) this.f191505b;
        return new xxg0(((zam0) hq31Var.f94016b.get()).path(), ((voc1) hq31Var.f94017c.get()).f243453a, 15);
    }

    @Override // p204p.qja1
    /* JADX INFO: renamed from: l */
    public boolean mo27923l(Uri uri) {
        return ((iae) ((hae) this.f191505b)).m50059c(uri);
    }

    /* JADX INFO: renamed from: m */
    public void m73505m(Exception exc) {
        GetCredentialException getCredentialException = (GetCredentialException) exc;
        hqb hqbVar = (hqb) this.f191505b;
        if (hqbVar.isActive()) {
            hqbVar.resumeWith(new c6x0(getCredentialException));
        }
    }

    /* JADX INFO: renamed from: n */
    public String m73506n(String str) {
        Set set = (Set) ((LinkedHashMap) this.f191505b).get(str);
        if (set != null && set.size() == 1) {
            return (String) g6f.m43739p0(set);
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.core.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) {
        switch (this.f191504a) {
            case 3:
                if (Looper.getMainLooper() != Looper.myLooper()) {
                    throw new IllegalStateException("Must subscribe to createBluetoothA2dpObservable on main thread!");
                }
                sy9 sy9Var = (sy9) this.f191505b;
                y59 y59Var = new y59(1, sy9Var, observableEmitter);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
                intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
                intentFilter.addAction("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED");
                lzj.m60346X(sy9Var.f215190a, y59Var, intentFilter, new Handler(Looper.getMainLooper()), 2);
                observableEmitter.setCancellable(new gr5(1, sy9Var, y59Var));
                return;
            default:
                pi4 pi4Var = new pi4((qe70) new tho(observableEmitter, 0), 1);
                uho uhoVar = (uho) this.f191505b;
                ((ConnectivityManager) uhoVar.f230491b.getValue()).registerDefaultNetworkCallback(pi4Var);
                observableEmitter.setCancellable(new gr5(2, uhoVar, pi4Var));
                return;
        }
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        cgl cglVar = (cgl) this.f191505b;
        u12 u12Var = cglVar.f37718T0;
        ((BackButtonView) u12Var.f225652f).mo2821c(new adk(cglVar, 15));
        ((BehaviorRetainingAppBarLayout) u12Var.f225648b).m1526a(new uze(cglVar, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qq8(vh00 vh00Var) {
        this.f191504a = 22;
        this.f191505b = (mb61) vh00Var;
    }

    public qq8(int i) {
        this.f191504a = i;
        switch (i) {
            case 7:
                this.f191505b = UnicastSubject.m23812f(1, (Runnable) new wg61(new bj9(this, 25)).getValue()).m23811c();
                break;
            default:
                this.f191505b = new LinkedHashMap();
                break;
        }
    }
}
