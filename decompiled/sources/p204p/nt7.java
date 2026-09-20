package p204p;

import android.content.Context;
import android.content.res.Resources;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Bundle;
import com.spotify.mobius.functions.Consumer;
import com.spotify.music.R;
import com.spotify.notifications.models.preferences.Item$Preference;
import com.spotify.pam.p118v2.GetBillingViewResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import spotify.autodownload.esperanto.proto.DecoratedFollowedShowsResponse;
import spotify.autodownload.esperanto.proto.DecoratedShow;

/* JADX INFO: loaded from: classes5.dex */
public class nt7 implements Function, ghw, mu61 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f157997a;

    /* JADX INFO: renamed from: b */
    public final Object f157998b;

    /* JADX INFO: renamed from: c */
    public final Object f157999c;

    public /* synthetic */ nt7(int i, Object obj, Object obj2) {
        this.f157997a = i;
        this.f157998b = obj;
        this.f157999c = obj2;
    }

    /* JADX INFO: renamed from: j */
    public static int m65601j(int i) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            return 5;
        }
        if (iM38547C == 1) {
            return 7;
        }
        if (iM38547C == 2) {
            return 3;
        }
        if (iM38547C == 3) {
            return 6;
        }
        if (iM38547C == 4) {
            return 8;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: a */
    public cva m65602a() {
        if (((qwe) this.f157998b).m74076l0() == 0) {
            return new cva((byte[]) this.f157999c);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        rv50 rv50Var;
        switch (this.f157997a) {
            case 0:
                DecoratedFollowedShowsResponse decoratedFollowedShowsResponse = (DecoratedFollowedShowsResponse) obj;
                b450 b450Var = (b450) this.f157999c;
                ot7 ot7Var = (ot7) this.f157998b;
                ae50 ae50VarM97401p = decoratedFollowedShowsResponse.m97401p();
                ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM97401p, 10));
                Iterator<E> it = ae50VarM97401p.iterator();
                while (it.hasNext()) {
                    arrayList.add(((DecoratedShow) it.next()).getUri());
                }
                if (arrayList.isEmpty()) {
                    return Observable.just(ot7.m67769a(ot7Var, decoratedFollowedShowsResponse, nau.f152117a, b450Var));
                }
                return ((jpx) ot7Var.f168990b).m53978b(new C1668ai("autodownload-settings-content-experience", false, (gh00) new l24(5, arrayList))).filter(cve0.f42412h).map(new twz0(arrayList, ot7Var, decoratedFollowedShowsResponse, b450Var, 17));
            case 2:
                ya8 ya8Var = (ya8) this.f157998b;
                Restrictions restrictions = ((PlayerState) obj).restrictions();
                hrd0 hrd0Var = (hrd0) this.f157999c;
                ya8Var.getClass();
                return (restrictions.disallowTogglingRepeatTrackReasons().isEmpty() || !(hrd0Var == hrd0.f94415b)) ? hrd0Var : hrd0.f94414a;
            case 16:
                AbstractC1961i abstractC1961i = (AbstractC1961i) obj;
                r3c r3cVar = (r3c) this.f157998b;
                ArrayList arrayList2 = (ArrayList) this.f157999c;
                r3cVar.getClass();
                if (abstractC1961i instanceof C1879g) {
                    rv50Var = rv50.f202999a;
                } else if (abstractC1961i instanceof C1796e) {
                    rv50Var = rv50.f203000b;
                } else {
                    if (!(abstractC1961i instanceof C1760d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rv50Var = rv50.f203001c;
                }
                Collection collectionValues = r3cVar.f195476e.values();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : collectionValues) {
                    if (((r2c) obj2).mo27912e().contains(rv50Var)) {
                        arrayList3.add(obj2);
                    }
                }
                Iterator it2 = g6f.m43735n0(arrayList3, j0c.class).iterator();
                while (it2.hasNext()) {
                    ((j0c) it2.next()).mo52062c(abstractC1961i, arrayList2);
                }
                return CompletableEmpty.f7437a;
            default:
                cfc cfcVar = (cfc) obj;
                Item$Preference item$Preference = cfcVar.f37319c;
                String str = item$Preference.key;
                kmc kmcVar = cfcVar.f37320d;
                lmc lmcVarM49324F = i091.m49324F(kmcVar.name());
                srl0 srl0VarM49325G = i091.m49325G(str);
                if (srl0VarM49325G != null) {
                    Observable observable = ((xgq0) this.f157998b).m90935d(new yrl0[]{new yrl0(lmcVarM49324F, srl0VarM49325G, true)}, 1, xoc1.f263857C2.f243453a).m23308z(new hfc(kmcVar, true)).subscribeOn((Scheduler) this.f157999c).onErrorReturnItem(new gfc(kmcVar, true, item$Preference)).toObservable();
                    wj50.m88279p(observable);
                    return observable;
                }
                Observable observableJust = Observable.just(new gfc(kmcVar, true, item$Preference));
                wj50.m88279p(observableJust);
                return observableJust;
        }
    }

    @Override // p204p.ghw
    /* JADX INFO: renamed from: b */
    public void mo44764b() {
        Consumer consumer;
        b58 b58Var = (b58) ((t58) this.f157998b).f217240a.f133656d.f122733a;
        if (b58Var == null || (consumer = (Consumer) ((q58) this.f157999c).f185456b) == null) {
            return;
        }
        consumer.accept(b58Var);
    }

    @Override // p204p.ghw
    /* JADX INFO: renamed from: c */
    public void mo44765c() {
        Consumer consumer;
        b58 b58Var = (b58) ((t58) this.f157998b).f217240a.f133655c.f122733a;
        if (b58Var == null || (consumer = (Consumer) ((q58) this.f157999c).f185456b) == null) {
            return;
        }
        consumer.accept(b58Var);
    }

    /* JADX INFO: renamed from: d */
    public int mo56200d(ArrayList arrayList, htz0 htz0Var, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f157998b).captureBurst(arrayList, new ucb(htz0Var, captureCallback), ((leb) this.f157999c).f132502a);
    }

    /* JADX INFO: renamed from: e */
    public qf40 m65603e(String str, List list) {
        Resources resources = (Resources) this.f157998b;
        List listM46715L = h6f.m46715L(new wzc(1, resources.getString(R.string.chat_content_picker_tab_search), tuu.f223921c, "spotify:chat-pick-entity:".concat(str), true), new wzc(2, resources.getString(R.string.chat_content_picker_tab_lyric_stickers), sru.f213379c, "spotify:chat-pick-lyrics-stickers:".concat(str), ((ynb) this.f157999c).m94233f()), new wzc(3, resources.getString(R.string.chat_content_picker_tab_gifs), kqu.f125437c, "spotify:chat-pick-gifs:".concat(str), true));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM46715L) {
            if (((wzc) obj).f256569e) {
                arrayList.add(obj);
            }
        }
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (list.contains(m6b.m61001p(((wzc) obj2).f256565a))) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.isEmpty()) {
                na6.m63957e("No tabs match requestedTabIds=" + list + ". Check that the IDs are valid and the tabs are enabled.");
            } else {
                arrayList = arrayList2;
            }
        }
        return opo.m67574x(arrayList);
    }

    /* JADX INFO: renamed from: f */
    public Bundle m65604f(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("mode", (String) this.f157998b);
        bundle.putString("uri", str);
        bundle.putString("context_source", str2);
        if (str3 != null) {
            bundle.putString(ContextTrack.Metadata.KEY_PROVIDER, str3);
        }
        return bundle;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r2 == r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r2 == r4) goto L25;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m65605g(boolean z, ibk ibkVar) {
        qj8 qj8Var;
        GetBillingViewResponse getBillingViewResponse;
        boolean z2 = z;
        if (ibkVar instanceof qj8) {
            qj8Var = (qj8) ibkVar;
            int i = qj8Var.f189192d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qj8Var.f189192d = i - Integer.MIN_VALUE;
            } else {
                qj8Var = new qj8(this, ibkVar);
            }
        } else {
            qj8Var = new qj8(this, ibkVar);
        }
        Object objM45556f = qj8Var.f189190b;
        int i2 = qj8Var.f189192d;
        if (i2 == 0) {
            bga.m29073P(objM45556f);
            yuk yukVar = yuk.f276404a;
            if (z2) {
                grm0 grm0Var = (grm0) this.f157999c;
                qj8Var.f189189a = z2;
                qj8Var.f189192d = 1;
                objM45556f = grm0.m45556f(grm0Var, null, qj8Var, 1, null);
            } else {
                grm0 grm0Var2 = (grm0) this.f157998b;
                qj8Var.f189189a = z2;
                qj8Var.f189192d = 2;
                objM45556f = grm0.m45556f(grm0Var2, null, qj8Var, 1, null);
            }
            return yukVar;
        }
        if (i2 == 1) {
            z2 = qj8Var.f189189a;
            bga.m29073P(objM45556f);
            getBillingViewResponse = (GetBillingViewResponse) objM45556f;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = qj8Var.f189189a;
            bga.m29073P(objM45556f);
            getBillingViewResponse = (GetBillingViewResponse) objM45556f;
        }
        boolean z3 = z2;
        String planName = getBillingViewResponse.m16475r().getPlanName();
        String strM16565w = getBillingViewResponse.m16475r().m16565w();
        String strM16554A = getBillingViewResponse.m16475r().m16554A();
        String title = getBillingViewResponse.m16473p().getTitle();
        String strM16552q = getBillingViewResponse.m16473p().m16552q();
        String strM16550o = getBillingViewResponse.m16473p().m16550o();
        String strM16551p = getBillingViewResponse.m16473p().m16551p();
        String title2 = getBillingViewResponse.m16476s().getTitle();
        String subtitle = getBillingViewResponse.m16476s().getSubtitle();
        String title3 = getBillingViewResponse.m16474q().getTitle();
        String subtitle2 = getBillingViewResponse.m16474q().getSubtitle();
        String uri = getBillingViewResponse.m16474q().getUri();
        String title4 = getBillingViewResponse.m16477t() ? getBillingViewResponse.m16471n().getTitle() : "";
        wj50.m88279p(title4);
        String subtitle3 = getBillingViewResponse.m16477t() ? getBillingViewResponse.m16471n().getSubtitle() : "";
        wj50.m88279p(subtitle3);
        String title5 = getBillingViewResponse.m16478u() ? getBillingViewResponse.m16472o().getTitle() : "";
        wj50.m88279p(title5);
        String subtitle4 = getBillingViewResponse.m16478u() ? getBillingViewResponse.m16472o().getSubtitle() : "";
        wj50.m88279p(subtitle4);
        String uri2 = getBillingViewResponse.m16478u() ? getBillingViewResponse.m16472o().getUri() : "";
        wj50.m88279p(uri2);
        return new pe9(planName, strM16565w, strM16554A, title, strM16552q, strM16550o, strM16551p, title2, subtitle, title4, subtitle3, title5, subtitle4, uri2, title3, subtitle2, uri, z3);
    }

    /* JADX INFO: renamed from: h */
    public qwe m65606h() {
        return (qwe) this.f157998b;
    }

    /* JADX INFO: renamed from: i */
    public om01 m65607i(ume umeVar, long j, boolean z) {
        String string;
        Context context = (Context) this.f157998b;
        wwu wwuVar = null;
        Long lValueOf = umeVar != null ? Long.valueOf(umeVar.f231842e - umeVar.f231841d) : null;
        if (lValueOf != null) {
            string = context.getString(R.string.podcast_episode_clip_sticker, ((fus0) this.f157999c).m42747d(lValueOf.longValue()));
        } else {
            long jM54450E = jwg1.m54450E(j, ils.MILLISECONDS);
            hvi0 hvi0Var = cks.f39079b;
            long jM33199r = cks.m33199r(jM54450E, ils.SECONDS);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            int hours = (int) timeUnit.toHours(jM33199r);
            int minutes = ((int) timeUnit.toMinutes(jM33199r)) - (hours * 60);
            long j2 = jM33199r % ((long) 60);
            string = context.getString(R.string.podcast_episode_prefix, context.getString(R.string.timestamp_share_card_label, hours > 0 ? String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(hours), Integer.valueOf(minutes), Long.valueOf(j2)}, 3)) : String.format(Locale.US, "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(minutes), Long.valueOf(j2)}, 2))));
        }
        wj50.m88279p(string);
        if (lValueOf != null) {
            wwuVar = ewu.f63601c;
        } else if (z) {
            wwuVar = mwu.f147884c;
        }
        return new om01(string, wwuVar);
    }

    /* JADX INFO: renamed from: k */
    public void m65608k(uzz uzzVar) {
        bn6 bn6Var = (bn6) this.f157999c;
        vr11 vr11Var = (vr11) this.f157998b;
        int i = uzzVar.f235662b;
        if (i != 0) {
            bn6Var.execute(new kbb(vr11Var, i));
        } else {
            bn6Var.execute(new lk00(7, vr11Var, uzzVar.f235661a));
        }
    }

    /* JADX INFO: renamed from: l */
    public int mo56201l(CaptureRequest captureRequest, htz0 htz0Var, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f157998b).setRepeatingRequest(captureRequest, new ucb(htz0Var, captureCallback), ((leb) this.f157999c).f132502a);
    }

    /* JADX INFO: renamed from: m */
    public void m65609m(String str, String str2, d850 d850Var, vaz0 vaz0Var) {
        voc1 voc1Var = new voc1(str2);
        i3k i3kVarM75788a = ((rkn) this.f157999c).m75788a(voc1Var);
        Observable observableM69157a = p4w.m69157a((p4w) this.f157998b, str, str2, null, voc1Var, new a5w(null, true, false, false, false, false, true, false, false, true, false, false, false, false, false, false, null, null, false, false, false, false, vaz0Var, false, null, false, null, 1040186813), null, 36);
        String str3 = d850Var.f46380a.f279709a;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        i3k.m49622b(i3kVarM75788a, observableM69157a, xgg1.m90801h1(), new z6k(str, str2, 4), str3, 48);
    }

    /* JADX INFO: renamed from: n */
    public ck81 m65610n(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.f157998b;
            if (i2 >= iArr.length) {
                yif1.m93808r("Unmatched track of type: " + i);
                return new nlr();
            }
            if (i == iArr[i2]) {
                return ((p0y0[]) this.f157999c)[i2];
            }
            i2++;
        }
    }

    @Override // p204p.mu61
    public void onSuccess() {
        asb asbVar = (asb) this.f157998b;
        qp0 qp0Var = (qp0) asbVar.f19371Y0;
        psb psbVar = (psb) this.f157999c;
        qp0Var.m73409b(psbVar, "downloaded", null, null);
        C2529wd c2529wd = (C2529wd) asbVar.f19372Z0;
        String str = psbVar.f180797a;
        ((LinkedHashSet) c2529wd.f250161b).add(str);
        ((PublishSubject) c2529wd.f250162c).onNext(new fsb(str, true));
    }

    @Override // p204p.mu61
    /* JADX INFO: renamed from: p */
    public void mo25096p(Exception exc) {
        ((qp0) ((asb) this.f157998b).f19371Y0).m73409b((psb) this.f157999c, "failure", "CANVAS_IMAGE_LOAD_ERROR", "Loading canvas image failed");
    }

    public nt7(voi voiVar) {
        this.f157997a = 29;
        this.f157998b = voiVar;
        this.f157999c = h6f.m46715L(xfr.f261082e, xfr.f261076Y);
    }

    public nt7(rmm0 rmm0Var) {
        this.f157997a = 28;
        this.f157998b = xtm0.m92080a(1, 2, 4);
        this.f157999c = rmm0Var.mo29877i().mo27151a(uh1.f230321k, new wh1(this, 8));
    }

    public nt7(kv91 kv91Var, st91 st91Var) {
        this.f157997a = 5;
        this.f157998b = kv91Var;
        this.f157999c = new hog0(st91Var, 29);
    }

    public nt7(kv91 kv91Var, int i) {
        this.f157997a = i;
        switch (i) {
            case 18:
                this.f157998b = kv91Var;
                this.f157999c = new hog0(xoc1.f263889G2.f243453a, 20);
                break;
            default:
                this.f157998b = kv91Var;
                this.f157999c = new jcg0(new l9g0(10), 2);
                break;
        }
    }

    public nt7(CameraCaptureSession cameraCaptureSession, leb lebVar) {
        this.f157997a = 12;
        cameraCaptureSession.getClass();
        this.f157998b = cameraCaptureSession;
        this.f157999c = lebVar;
    }

    public nt7(int i) {
        this.f157997a = 10;
        byte[] bArr = new byte[i];
        this.f157999c = bArr;
        Logger logger = uwe.f234637i;
        this.f157998b = new qwe(bArr, i);
    }
}
