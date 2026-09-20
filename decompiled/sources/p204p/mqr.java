package p204p;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.core.http.HttpConnection;
import com.spotify.core.http.HttpResponse;
import com.spotify.gpb.trackingimpl.events.proto.GpbCheckoutEvents;
import com.spotify.player.model.AudioStream;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.prefs.esperanto.proto.EsPrefs$PrefValues;
import com.spotify.tap.p163go.events.proto.SpotifyGoCommandError;
import com.spotify.tap.p163go.events.proto.SpotifyGoCommandLifecycle;
import com.spotify.upsells.p173v1.proto.BatchShouldUpsellRequest;
import com.spotify.upsells.p173v1.proto.BatchShouldUpsellRequestItem;
import com.spotify.upsells.p173v1.proto.BatchShouldUpsellResponse;
import com.spotify.upsells.p173v1.proto.BatchShouldUpsellResult;
import com.spotify.upsells.p173v1.proto.GatedFeatureContext;
import com.spotify.upsells.p173v1.proto.GetUpsellRequest;
import com.spotify.upsells.p173v1.proto.GetUpsellResponse;
import com.spotify.upsells.p173v1.proto.ShouldUpsellRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public class mqr implements jvt, Function, kbd1, iab, v94, pn90 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f146342a;

    /* JADX INFO: renamed from: b */
    public final Object f146343b;

    /* JADX INFO: renamed from: c */
    public Object f146344c;

    public /* synthetic */ mqr(int i, Object obj, Object obj2) {
        this.f146342a = i;
        this.f146343b = obj;
        this.f146344c = obj2;
    }

    /* JADX INFO: renamed from: m */
    public static void m62582m(mqr mqrVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        if ((i & 64) != 0) {
            str7 = null;
        }
        if ((i & 128) != 0) {
            str8 = null;
        }
        mqrVar.getClass();
        qc41 qc41VarM21797w = SpotifyGoCommandLifecycle.m21797w();
        qc41VarM21797w.m72518s(str);
        qc41VarM21797w.m72523x(str6);
        spi spiVar = (spi) ((s5p) ((voi) mqrVar.f146344c)).f205870Y.m23798h();
        qc41VarM21797w.m72519t(spiVar != null ? spiVar.f212880a : false);
        if (str2 != null) {
            qc41VarM21797w.m72517r(str2);
        }
        if (str3 != null) {
            qc41VarM21797w.m72516q(str3);
        }
        if (str4 != null) {
            qc41VarM21797w.m72522w(str4);
        }
        if (str5 != null) {
            qc41VarM21797w.m72515m(str5);
        }
        if (str7 != null) {
            qc41VarM21797w.m72520u(str7);
        }
        if (str8 != null) {
            qc41VarM21797w.m72521v(str8);
        }
        ((qre0) mqrVar.f146343b).m73616a(qc41VarM21797w.build());
    }

    @Override // p204p.v94
    /* JADX INFO: renamed from: K0 */
    public void mo24956K0(Object obj) {
        xy3 xy3Var = (xy3) ((oxe) this.f146343b);
        xy3Var.m92400e("application_injection");
        ((son) this.f146344c).mo24956K0((ljm) obj);
        xy3Var.m92396a("application_injection");
    }

    @Override // p204p.pn90
    /* JADX INFO: renamed from: a */
    public Completable mo32803a(on90 on90Var) {
        return g0b1.m43282x(xsr.f265652b, new lw2(this, on90Var, null, 21));
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Single singleJust;
        switch (this.f146342a) {
            case 5:
                return fnw.m42234a((fnw) this.f146343b, (String) this.f146344c, (EsPrefs$PrefValues) obj);
            case 6:
                fho0 fho0Var = (fho0) obj;
                uqw uqwVar = (uqw) this.f146343b;
                if (!(fho0Var instanceof eho0)) {
                    if (fho0Var instanceof dho0) {
                        return Single.just(lcf.m58690b(p3n0.m69077h(2)));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                xcw xcwVar = new xcw(1, (PlayCommand) this.f146344c, uqwVar);
                if (uqwVar.f233137c) {
                    singleJust = Single.defer(new yh1(xcwVar, 8));
                    wj50.m88279p(singleJust);
                } else {
                    singleJust = Single.just(xcwVar.invoke());
                    wj50.m88279p(singleJust);
                }
                return singleJust.flatMap(new skp(uqwVar, 6));
            default:
                mqr mqrVar = (mqr) this.f146343b;
                wo20 wo20Var = (wo20) this.f146344c;
                return ((q6u) mqrVar.f146344c).m72262p((List) obj, wo20Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX INFO: renamed from: b */
    public Object m62583b(ArrayList arrayList, ibk ibkVar) {
        nh30 nh30Var;
        Object c6x0Var;
        ?? r11;
        if (ibkVar instanceof nh30) {
            nh30Var = (nh30) ibkVar;
            int i = nh30Var.f153853d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nh30Var.f153853d = i - Integer.MIN_VALUE;
            } else {
                nh30Var = new nh30(this, ibkVar);
            }
        } else {
            nh30Var = new nh30(this, ibkVar);
        }
        Object objM38394c = nh30Var.f153851b;
        int i2 = nh30Var.f153853d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM38394c);
                if (arrayList.isEmpty()) {
                    return nau.f152117a;
                }
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                int i3 = 0;
                for (Object obj : arrayList) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        h6f.m46722S();
                        throw null;
                    }
                    GatedFeatureContext gatedFeatureContext = (GatedFeatureContext) obj;
                    arrayList2.add(pft0.m69840u(gatedFeatureContext.m22063r() + "_" + gatedFeatureContext.m22062q() + "_" + i3, gatedFeatureContext));
                    i3 = i4;
                }
                Map mapM56705r0 = kkc0.m56705r0(arrayList2);
                ebk ebkVar = (ebk) this.f146343b;
                z49 z49VarM22043p = BatchShouldUpsellRequest.m22043p();
                ArrayList arrayList3 = new ArrayList(mapM56705r0.size());
                for (Map.Entry entry : mapM56705r0.entrySet()) {
                    String str = (String) entry.getKey();
                    GatedFeatureContext gatedFeatureContext2 = (GatedFeatureContext) entry.getValue();
                    a59 a59VarM22046p = BatchShouldUpsellRequestItem.m22046p();
                    a59VarM22046p.m24777q(str);
                    pj11 pj11VarM22078p = ShouldUpsellRequest.m22078p();
                    pj11VarM22078p.m70121m(gatedFeatureContext2);
                    a59VarM22046p.m24776m(pj11VarM22078p);
                    arrayList3.add((BatchShouldUpsellRequestItem) a59VarM22046p.build());
                }
                z49VarM22043p.m95321m(arrayList3);
                BatchShouldUpsellRequest batchShouldUpsellRequest = (BatchShouldUpsellRequest) z49VarM22043p.build();
                nh30Var.f153850a = mapM56705r0;
                nh30Var.f153853d = 1;
                objM38394c = ebkVar.m38394c(batchShouldUpsellRequest, nh30Var);
                yuk yukVar = yuk.f276404a;
                arrayList = mapM56705r0;
                if (objM38394c == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Map map = nh30Var.f153850a;
                bga.m29073P(objM38394c);
                arrayList = map;
            }
            c6x0Var = (BatchShouldUpsellResponse) objM38394c;
            r11 = arrayList;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
            r11 = arrayList;
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null) {
            Logger.m3967c(thM77348a, "Failed to check batchShouldUpsell", new Object[0]);
        }
        if (c6x0Var instanceof c6x0) {
            c6x0Var = null;
        }
        BatchShouldUpsellResponse batchShouldUpsellResponse = (BatchShouldUpsellResponse) c6x0Var;
        if (batchShouldUpsellResponse == null) {
            return null;
        }
        ae50<BatchShouldUpsellResult> ae50VarM22047n = batchShouldUpsellResponse.m22047n();
        ArrayList arrayList4 = new ArrayList();
        for (BatchShouldUpsellResult batchShouldUpsellResult : ae50VarM22047n) {
            GatedFeatureContext gatedFeatureContext3 = (GatedFeatureContext) r11.get(batchShouldUpsellResult.m22048n());
            pqm0 pqm0VarM69840u = gatedFeatureContext3 != null ? pft0.m69840u(gatedFeatureContext3, batchShouldUpsellResult.m22049o()) : null;
            if (pqm0VarM69840u != null) {
                arrayList4.add(pqm0VarM69840u);
            }
        }
        return kkc0.m56705r0(arrayList4);
    }

    /* JADX INFO: renamed from: c */
    public void m62584c() {
        qp10 qp10VarM11216u = GpbCheckoutEvents.m11216u();
        qp10VarM11216u.m73412m("CheckoutInitiated");
        qp10VarM11216u.m73414r();
        l101 l101Var = (l101) ((k101) this.f146344c);
        qp10VarM11216u.m73418v(l101Var.m57846c());
        l101Var.m57845b();
        qp10VarM11216u.m73416t(l101Var.m57845b());
        ((qre0) this.f146343b).m73616a(qp10VarM11216u.build());
    }

    /* JADX INFO: renamed from: d */
    public Parcelable m62585d(fk30 fk30Var) {
        WeakHashMap weakHashMap = (WeakHashMap) this.f146343b;
        IdentityHashMap identityHashMap = (IdentityHashMap) ((rb5) this.f146344c).f197473d;
        fk30Var.getClass();
        fk30 fk30Var2 = (fk30) identityHashMap.get(fk30Var);
        if (fk30Var2 != null) {
            return (Parcelable) weakHashMap.get(fk30Var2.mo41867id());
        }
        throw new IllegalArgumentException(s571.m77251j("Model ", fk30Var.mo41867id() != null ? fk30Var.mo41867id() : fk30Var.toString(), " not resolved"));
    }

    @Override // p204p.kbd1
    /* JADX INFO: renamed from: e */
    public jbd1 mo42947e(hc80 hc80Var, eh00 eh00Var, eh00 eh00Var2) {
        return ebd1.m38363a((ebd1) this.f146343b, hc80Var, eh00Var, eh00Var2, new si20(this, 9), 16);
    }

    @Override // p204p.iab
    /* JADX INFO: renamed from: f */
    public void mo31884f(y8b y8bVar, IOException iOException) {
        m62592n(iOException);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public Object m62586g(GatedFeatureContext gatedFeatureContext, w5r w5rVar, ibk ibkVar) {
        oh30 oh30Var;
        Object c6x0Var;
        if (ibkVar instanceof oh30) {
            oh30Var = (oh30) ibkVar;
            int i = oh30Var.f165329c;
            if ((i & Integer.MIN_VALUE) != 0) {
                oh30Var.f165329c = i - Integer.MIN_VALUE;
            } else {
                oh30Var = new oh30(this, ibkVar);
            }
        } else {
            oh30Var = new oh30(this, ibkVar);
        }
        Object objM38392a = oh30Var.f165327a;
        int i2 = oh30Var.f165329c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM38392a);
                ic10 ic10VarM22067q = GetUpsellRequest.m22067q();
                ic10VarM22067q.m50223q(gatedFeatureContext);
                ArrayList arrayList = new ArrayList();
                arrayList.add(w5rVar);
                if (((ajq0) this.f146344c).f16338b.m43648a()) {
                    arrayList.add(w5r.DEVICE_CAPABILITY_GENERIC_CONSIDERATION_PAGE);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ic10VarM22067q.m50222m((w5r) it.next());
                }
                ebk ebkVar = (ebk) this.f146343b;
                GetUpsellRequest getUpsellRequest = (GetUpsellRequest) ic10VarM22067q.build();
                oh30Var.f165329c = 1;
                objM38392a = ebkVar.m38392a(getUpsellRequest, oh30Var);
                yuk yukVar = yuk.f276404a;
                if (objM38392a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM38392a);
            }
            c6x0Var = (GetUpsellResponse) objM38392a;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null) {
            Logger.m3967c(thM77348a, "Failed to get upsell", new Object[0]);
        }
        if (c6x0Var instanceof c6x0) {
            return null;
        }
        return c6x0Var;
    }

    /* JADX INFO: renamed from: h */
    public void m62587h(String str, String str2) {
        l101 l101Var = (l101) ((k101) this.f146344c);
        l101Var.m57845b();
        qp10 qp10VarM11216u = GpbCheckoutEvents.m11216u();
        qp10VarM11216u.m73412m("GPBCheckoutCompleted");
        qp10VarM11216u.m73414r();
        qp10VarM11216u.m73416t(l101Var.m57845b());
        qp10VarM11216u.m73417u(str2);
        if (str != null) {
            qp10VarM11216u.m73415s(str);
        }
        ((qre0) this.f146343b).m73616a(qp10VarM11216u.build());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public Object m62588i(kft kftVar, ibk ibkVar) {
        kry kryVar;
        if (ibkVar instanceof kry) {
            kryVar = (kry) ibkVar;
            int i = kryVar.f125748d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kryVar.f125748d = i - Integer.MIN_VALUE;
            } else {
                kryVar = new kry(this, ibkVar);
            }
        } else {
            kryVar = new kry(this, ibkVar);
        }
        Object objM87990b = kryVar.f125746b;
        int i2 = kryVar.f125748d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM87990b);
                wfx wfxVar = (wfx) this.f146343b;
                uj00 uj00Var = kftVar.f122223a;
                boolean z = kftVar.f122224b;
                kryVar.f125745a = kftVar;
                kryVar.f125748d = 1;
                objM87990b = wfxVar.m87990b(uj00Var, z, kryVar);
                yuk yukVar = yuk.f276404a;
                if (objM87990b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kftVar = kryVar.f125745a;
                bga.m29073P(objM87990b);
            }
            return new duw((bj00) objM87990b, kftVar.f122223a, ((bq4) this.f146344c).m30175b());
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new cuw(th, kftVar.f122223a == uj00.f230850a);
        }
    }

    /* JADX INFO: renamed from: j */
    public Object m62589j(Uri uri, ibk ibkVar) {
        if (xuf1.m92171j(uri)) {
            return x0h1.m89557A((luk) this.f146343b, new cv0(this, uri, null, 4), ibkVar);
        }
        throw new IllegalArgumentException(("Uri " + uri + " is not a local uri").toString());
    }

    /* JADX INFO: renamed from: k */
    public void m62590k() throws IOException {
        String str = (String) this.f146343b;
        if (((FileChannel) this.f146344c) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.f146344c = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.f146344c;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.f146344c = null;
            throw new IllegalStateException(s571.m77251j("Unable to lock file: '", str, "'."), th);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m62591l(byte[] bArr, int i) {
        pc41 pc41VarM21787p = SpotifyGoCommandError.m21787p();
        cva cvaVar = gva.f84678b;
        pc41VarM21787p.m69543m(gva.m45886d(0, bArr, bArr.length));
        pc41VarM21787p.m69544q(f710.m40941i(i));
        ((qre0) this.f146343b).m73616a(pc41VarM21787p.build());
    }

    /* JADX INFO: renamed from: n */
    public void m62592n(IOException iOException) {
        HttpConnection httpConnection = (HttpConnection) this.f146343b;
        if (iOException instanceof SocketTimeoutException) {
            httpConnection.onError(HttpConnection.kErrorHttpTimeout);
        } else if (((rg30) this.f146344c).f198818e) {
            httpConnection.onError(HttpConnection.kErrorHttpAborted);
        } else {
            httpConnection.onError(HttpConnection.kErrorHttpFail);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m62593o(fk30 fk30Var, Parcelable parcelable) {
        IdentityHashMap identityHashMap = (IdentityHashMap) ((rb5) this.f146344c).f197473d;
        fk30Var.getClass();
        fk30 fk30Var2 = (fk30) identityHashMap.get(fk30Var);
        if (fk30Var2 == null || fk30Var2.mo41867id() == null) {
            return;
        }
        ((WeakHashMap) this.f146343b).put(fk30Var2.mo41867id(), parcelable);
    }

    /* JADX INFO: renamed from: p */
    public void m62594p(boolean z) {
        synchronized (this.f146343b) {
            ((qoz) this.f146344c).f191086a = z;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m62595q(wi01 wi01Var, int i, d850 d850Var, Long l) {
        ern0 ern0VarM67568r;
        l511 j511Var;
        if (l == null || (ern0VarM67568r = opo.m67567q(pft0.m69840u("t", String.valueOf(l.longValue() / ((long) 1000))))) == null) {
            ern0VarM67568r = opo.m67568r();
        }
        ern0 ern0Var = ern0VarM67568r;
        boolean zM66813b = ((of4) this.f146344c).m66813b();
        Bundle bundleM70529j = pp91.m70529j(pft0.m69840u("lyrics.share.asset_content", wi01Var));
        pqm0 pqm0VarM69840u = zM66813b ? pft0.m69840u(bundleM70529j, Bundle.EMPTY) : pft0.m69840u(Bundle.EMPTY, bundleM70529j);
        Bundle bundle = (Bundle) pqm0VarM69840u.f180350a;
        Bundle bundle2 = (Bundle) pqm0VarM69840u.f180351b;
        n011 n011Var = (n011) this.f146343b;
        lu01 lu01Var = new lu01(wi01Var.getEntityUri(), null, ern0Var, null, null, null, bundle, 58);
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            j511Var = zM66813b ? new j511("lyricssharing") : new j511();
        } else {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            j511Var = k511.f119387b;
        }
        l511 l511Var = j511Var;
        wj50.m88279p(bundle2);
        n011Var.m63275a(lu01Var, bundle2, l511Var, d850Var, zM66813b ? lau.f131415a : geg1.m44518y(umb0.f231792a));
    }

    @Override // p204p.jvt
    public void start() {
        hxt hxtVar = (hxt) this.f146344c;
        View view = (View) this.f146343b;
        if (view.isAttachedToWindow()) {
            hxt.m49040a(view, hxtVar);
        } else {
            hxtVar.f96303p = true;
        }
    }

    @Override // p204p.jvt
    public void stop() {
        g2q g2qVarM75604G;
        hxt hxtVar = (hxt) this.f146344c;
        hxtVar.f96303p = false;
        View view = hxtVar.f96307t;
        if (view.isSaveEnabled()) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            view.saveHierarchyState(sparseArray);
            Bundle bundle = new Bundle();
            bundle.putSparseParcelableArray("view_state", sparseArray);
            hxtVar.f96289b.mo31976j(bundle);
        }
        if (hxtVar.f96301n) {
            hxtVar.f96304q = false;
            b250 b250VarM30652c = hxtVar.f96296i.m30652c();
            if (b250VarM30652c != null && (g2qVarM75604G = riw0.m75604G(b250VarM30652c)) != null) {
                g2qVarM75604G.m43409n(hxtVar.f96288a.mo29380b(), hxtVar.f96289b.mo31974h());
            }
            hxtVar.f96301n = false;
            hxtVar.m49049j();
        }
    }

    @Override // p204p.iab
    /* JADX INFO: renamed from: y */
    public void mo31897y(y8b y8bVar, n2x0 n2x0Var) {
        HttpConnection httpConnection = (HttpConnection) this.f146343b;
        try {
            if (n2x0Var.f149853P0) {
                httpConnection.onRedirect();
            }
            sep sepVarM78536e = n2x0Var.f149862f.m78536e();
            sepVarM78536e.m77929c("SPT-Protocol", n2x0Var.f149858b.f195574a);
            httpConnection.onHeaders(new HttpResponse(n2x0Var.f149860d, n2x0Var.f149857a.f20037a.f177464i, sepVarM78536e.m77935i().toString()));
            p3x0 p3x0Var = n2x0Var.f149863g;
            byte[] bArr = new byte[8192];
            while (true) {
                int i = p3x0Var.mo28080C1().read(bArr);
                if (i == -1) {
                    HttpConnection.onComplete$default(httpConnection, false, 1, null);
                    return;
                }
                httpConnection.onBytesAvailable(bArr, i);
            }
        } catch (IOException e) {
            m62592n(e);
        } finally {
            n2x0Var.close();
        }
    }

    public mqr(rb5 rb5Var) {
        this.f146342a = 21;
        this.f146343b = new WeakHashMap();
        this.f146344c = rb5Var;
    }

    public mqr(String str) {
        this.f146342a = 10;
        this.f146343b = str.concat(".lck");
    }

    public mqr(int i) {
        this.f146342a = i;
        switch (i) {
            case 13:
                this.f146343b = new Object();
                AudioStream audioStream = AudioStream.DEFAULT;
                qoz qozVar = new qoz();
                qozVar.f191086a = false;
                qozVar.f191087b = audioStream;
                qozVar.f191088c = wdd0.DEFAULT;
                this.f146344c = qozVar;
                break;
            default:
                this.f146343b = new LinkedHashMap();
                this.f146344c = new AtomicInteger(1);
                break;
        }
    }
}
