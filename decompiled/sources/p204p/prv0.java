package p204p;

import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.gander.p072v2.proto.ResetLatestCursorRequest;
import com.spotify.music.R;
import com.spotify.player.esperanto.proto.EsContext$Context;
import com.spotify.player.esperanto.proto.EsContextPlayerState$ContextPlayerState;
import com.spotify.player.esperanto.proto.EsGetStateRequest$GetStateRequest;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import com.spotify.player.esperanto.proto.EsPlay$PlayRequest;
import com.spotify.player.esperanto.proto.EsPreparePlay$PreparePlayRequest;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions$PreparePlayOptions;
import com.spotify.player.esperanto.proto.EsSignalRequest$SignalRequest;
import com.spotify.speedpreview.proto.SpeedPreviewOuterClass$SpeedPreview;
import com.spotify.time.esperanto.proto.EsServerTime$ServerTime;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.completable.CompletableToSingle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class prv0 implements Function, ant, rdc1, nwl0, w111, uia {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f180687a;

    /* JADX INFO: renamed from: b */
    public Object f180688b;

    public /* synthetic */ prv0() {
        this.f180687a = 16;
    }

    /* JADX INFO: renamed from: a */
    public void m70734a() {
        ltx0 ltx0Var = (ltx0) this.f180688b;
        ((mhy0) ltx0Var.f136903b).f143889b = true;
        phy0 phy0Var = (phy0) ltx0Var.f136904c;
        Object obj = phy0Var.f177764b;
        mhy0 mhy0Var = (mhy0) ltx0Var.f136903b;
        synchronized (obj) {
            phy0Var.f177766d.remove(mhy0Var);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Single singleJust;
        switch (this.f180687a) {
            case 0:
                icl iclVar = (icl) this.f180688b;
                iclVar.getClass();
                String str = ((qt2) obj).f192259a;
                if (str.length() > 0) {
                    return ((lt2) iclVar.f100838b).m59859f(str).map(qgr0.f188544f).toObservable();
                }
                throw new IllegalArgumentException("When refreshing a session, the sessionId must not be empty. ");
            case 1:
                tvv0 tvv0Var = (tvv0) this.f180688b;
                return Flowable.m23322h(tvv0Var.f224253a, tvv0Var.f224262t.f13342d.toFlowable(BackpressureStrategy.f7190d), snq0.f211014h);
            case 2:
                j951 j951Var = (j951) obj;
                saw0 saw0Var = (saw0) this.f180688b;
                if (!(j951Var instanceof i951)) {
                    if (!(j951Var instanceof h951)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (Math.abs((System.currentTimeMillis() - ((h951) j951Var).f88881a) / 1000) <= 10) {
                        return CompletableEmpty.f7437a;
                    }
                }
                paw0 paw0Var = saw0Var.f207286b;
                return paw0Var.m69505b().m23292c(paw0Var.m69504a(4));
            case 3:
                iiu0 iiu0Var = (iiu0) obj;
                return new CompletableToSingle(g0b1.m43282x(dau.f47107a, new blv0((zh1) this.f180688b, new ju61(iiu0Var.f102633b, iiu0Var.f102632a), null, 9)), a140.f11324d, null).onErrorReturn(new vnt0(iiu0Var, 11));
            case 4:
                djs0 djs0Var = (djs0) ((rwt0) this.f180688b).f203414b;
                vxw0 vxw0Var = ((rve1) obj).f203074c;
                vxe1 vxe1Var = (vxe1) djs0Var.f49740b;
                uxw0 uxw0VarM11118p = ResetLatestCursorRequest.m11118p();
                uxw0VarM11118p.m84185m(vxw0Var.f245847a);
                return vxe1Var.m86653b((ResetLatestCursorRequest) uxw0VarM11118p.build()).map(wvq0.f255575h).map(crq0.f41368h).onErrorReturn(wsq0.f254714i);
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 15:
            case 16:
            case 20:
            case 21:
            default:
                us2 us2Var = (us2) obj;
                xvx0 xvx0Var = (xvx0) ((csr0) this.f180688b).f41685b;
                if (us2Var instanceof ss2) {
                    xvx0Var.m92263c(2);
                    return new ug51(((ss2) us2Var).f213459a);
                }
                if (!(us2Var instanceof ts2)) {
                    throw new NoWhenBranchMatchedException();
                }
                xvx0Var.m92263c(3);
                return new tg51(((ts2) us2Var).f223189a);
            case 12:
                EsServerTime$ServerTime esServerTime$ServerTime = (EsServerTime$ServerTime) obj;
                return new cwz0(esServerTime$ServerTime.m21812q() ? Long.valueOf(esServerTime$ServerTime.m21810o()) : null, (u4l0) this.f180688b, esServerTime$ServerTime.m21811p());
            case 13:
                ihs0 ihs0Var = (ihs0) obj;
                return ihs0Var.f102358f.isEmpty() ? new CompletableFromAction(new y1s0((i101) this.f180688b, 14)).m23293d(Observable.just(ihs0Var)) : Observable.just(ihs0Var);
            case 14:
                x901 x901Var = (x901) obj;
                return x901Var instanceof m901 ? Single.just(x901Var) : ((Single) ((jt7) ((xb01) this.f180688b).f259809a).f115751c.getValue()).map(lew0.f132743X).flatMapCompletable(new0.f153133Y).m23294e(Single.just(x901Var));
            case 17:
                ycv0 ycv0Var = (ycv0) obj;
                qal qalVar = (qal) this.f180688b;
                String str2 = ycv0Var.f271576b;
                gjv0 gjv0Var = (gjv0) qalVar.f186898d;
                if (gjv0.m44961k(str2)) {
                    singleJust = vjf1.m85770t(dau.f47107a, new vx01(qalVar, str2, null, 10)).map(f8r0.f67045L0);
                } else {
                    singleJust = gjv0Var.m44970j(str2) ? Single.just(Boolean.TRUE) : Single.just(Boolean.FALSE);
                }
                Single map = singleJust.map(new y3z0(9, ycv0Var, qalVar));
                gjv0Var.m44968h();
                return map.onErrorReturnItem("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ").flatMapCompletable(new b5y0(15, qalVar, ycv0Var)).m23307y();
            case 18:
                return g0b1.m43282x(dau.f47107a, new vx01((uj81) this.f180688b, (qx21) obj, null, 11)).m23307y();
            case 19:
                za21 za21Var = (za21) this.f180688b;
                return za21.m95747j(za21Var, za21Var.f280961b.m95183k((List) obj), null, 13);
            case 22:
                return new li31(((yg31) this.f180688b).f272470a, true);
        }
    }

    @Override // p204p.uia
    /* JADX INFO: renamed from: b */
    public void mo46008b(JSONObject jSONObject, aja ajaVar) {
        cx21 cx21Var = (cx21) this.f180688b;
        if (((j4u) cx21Var.f42889b).m52401z((Intent) cx21Var.f42890c, true, jSONObject, ajaVar != null ? ajaVar.f16203a : null)) {
            return;
        }
        ((bj9) cx21Var.f42891d).invoke();
    }

    /* JADX INFO: renamed from: c */
    public ArrayList m70735c(List list, boolean z) {
        Set linkedHashSet = (LinkedHashSet) this.f180688b;
        if (linkedHashSet == null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    int i = ((xm11) obj).f263270e;
                    if (i == 1 || i == 3) {
                        arrayList.add(obj);
                    }
                }
                linkedHashSet = new LinkedHashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(((xm11) it.next()).f263266a);
                }
                this.f180688b = linkedHashSet;
            } else {
                linkedHashSet = gbu.f78413a;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (linkedHashSet.contains(((xm11) obj2).f263266a)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: d */
    public Long m70736d(String str) {
        int i = 0;
        while (true) {
            i++;
            if (i > 3) {
                na6.m63957e("Execution of sizeOfDirectory failed");
                return null;
            }
            try {
                return ((bf41) ((af41) this.f180688b)).m28993d(str);
            } catch (IOException e) {
                Logger.m3973i(edb.m38564m("sizeOfDir failed with message ", e.getMessage()), new Object[0]);
            } catch (IllegalArgumentException e2) {
                Logger.m3973i(edb.m38564m("sizeOfDir failed with message ", e2.getMessage()), new Object[0]);
            } catch (NoClassDefFoundError e3) {
                Logger.m3965a(edb.m38564m("sizeOfDir failed with message ", e3.getMessage()), new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public opy0 m70737e(yzy0 yzy0Var, rcm0 rcm0Var) {
        mxg1 mdwVar;
        mxg1 odwVar;
        wfz wfzVar;
        Resources resources = ((cz00) this.f180688b).f43412a;
        if (!(yzy0Var instanceof vzy0)) {
            boolean z = yzy0Var instanceof xzy0;
            if (z) {
                boolean z2 = false;
                if (z && (wfzVar = ((xzy0) yzy0Var).f267820a) != null) {
                    vfz vfzVar = wfzVar.f250930b;
                    sfz sfzVar = vfzVar instanceof sfz ? (sfz) vfzVar : null;
                    if (sfzVar != null && sfzVar.f208665a == 2) {
                        z2 = true;
                    }
                }
                odwVar = new odw(z2, ((xzy0) yzy0Var).f267821b);
            } else {
                if (!yzy0Var.equals(wzy0.f256710a)) {
                    throw new NoWhenBranchMatchedException();
                }
                mdwVar = ndw.f152849b;
            }
            return new opy0(new ldw(resources.getString(R.string.cosmos_search_error), resources.getString(R.string.cosmos_search_error_retry), resources.getString(R.string.cosmos_search_error_retry_button), rcm0Var, odwVar));
        }
        mdwVar = new mdw(((vzy0) yzy0Var).f246593a);
        odwVar = mdwVar;
        return new opy0(new ldw(resources.getString(R.string.cosmos_search_error), resources.getString(R.string.cosmos_search_error_retry), resources.getString(R.string.cosmos_search_error_retry_button), rcm0Var, odwVar));
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0143  */
    /* JADX WARN: Code duplicated, block: B:49:0x0154  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:56:0x01aa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: f */
    public Object m70738f(String str, double d, ibk ibkVar) {
        u541 u541Var;
        String str2;
        double d2;
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams;
        String str3;
        double d3;
        evi eviVarM79023B;
        String str4;
        double d4;
        Object objM79082p0;
        sr6 sr6Var = (sr6) this.f180688b;
        if (ibkVar instanceof u541) {
            u541Var = (u541) ibkVar;
            int i = u541Var.f226908f;
            if ((i & Integer.MIN_VALUE) != 0) {
                u541Var.f226908f = i - Integer.MIN_VALUE;
            } else {
                u541Var = new u541(this, ibkVar);
            }
        } else {
            u541Var = new u541(this, ibkVar);
        }
        Object ecr0Var = u541Var.f226906d;
        int i2 = u541Var.f226908f;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(ecr0Var);
            ilw ilwVarM17768t = EsLoggingParams$LoggingParams.m17768t();
            umw umwVarM17777q = EsOptional$OptionalInt64.m17777q();
            umwVarM17777q.m83492m(System.currentTimeMillis());
            ilwVarM17768t.m51046s((EsOptional$OptionalInt64) umwVarM17777q.build());
            EsLoggingParams$LoggingParams esLoggingParams$LoggingParams2 = (EsLoggingParams$LoggingParams) ilwVarM17768t.build();
            evi eviVarM79023B2 = sr6Var.m79023B(EsGetStateRequest$GetStateRequest.m17761p());
            str2 = str;
            u541Var.f226903a = str2;
            u541Var.f226904b = esLoggingParams$LoggingParams2;
            d2 = d;
            u541Var.f226905c = d2;
            u541Var.f226908f = 1;
            Object objM86755t = vyf1.m86755t(eviVarM79023B2, u541Var);
            if (objM86755t != yukVar) {
                esLoggingParams$LoggingParams = esLoggingParams$LoggingParams2;
                ecr0Var = objM86755t;
            }
            return yukVar;
        }
        if (i2 == 1) {
            double d5 = u541Var.f226905c;
            esLoggingParams$LoggingParams = u541Var.f226904b;
            String str5 = u541Var.f226903a;
            bga.m29073P(ecr0Var);
            str2 = str5;
            d2 = d5;
        } else {
            if (i2 == 2) {
                d3 = u541Var.f226905c;
                esLoggingParams$LoggingParams = u541Var.f226904b;
                str3 = u541Var.f226903a;
                bga.m29073P(ecr0Var);
                d2 = d3;
                str2 = str3;
                eviVarM79023B = sr6Var.m79023B(EsGetStateRequest$GetStateRequest.m17761p());
                u541Var.f226903a = str2;
                u541Var.f226904b = esLoggingParams$LoggingParams;
                u541Var.f226905c = d2;
                u541Var.f226908f = 3;
                if (vyf1.m86755t(eviVarM79023B, u541Var) != yukVar) {
                    str4 = str2;
                    u541Var.f226903a = str4;
                    u541Var.f226904b = esLoggingParams$LoggingParams;
                    u541Var.f226905c = d2;
                    u541Var.f226908f = 4;
                    ecr0Var = new ecr0();
                    if (ecr0Var != yukVar) {
                        d4 = d2;
                    }
                }
                return yukVar;
            }
            if (i2 == 3) {
                double d6 = u541Var.f226905c;
                esLoggingParams$LoggingParams = u541Var.f226904b;
                String str6 = u541Var.f226903a;
                bga.m29073P(ecr0Var);
                d2 = d6;
                str4 = str6;
                u541Var.f226903a = str4;
                u541Var.f226904b = esLoggingParams$LoggingParams;
                u541Var.f226905c = d2;
                u541Var.f226908f = 4;
                ecr0Var = new ecr0();
                if (ecr0Var != yukVar) {
                    d4 = d2;
                }
                return yukVar;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(ecr0Var);
                return w2a1Var;
            }
            d4 = u541Var.f226905c;
            esLoggingParams$LoggingParams = u541Var.f226904b;
            str4 = u541Var.f226903a;
            bga.m29073P(ecr0Var);
        }
        wj50.m88279p(esLoggingParams$LoggingParams);
        u541Var.f226903a = null;
        u541Var.f226904b = null;
        u541Var.f226905c = d4;
        u541Var.f226908f = 5;
        p541 p541VarM21530s = SpeedPreviewOuterClass$SpeedPreview.m21530s();
        p541VarM21530s.m69167t(str4);
        p541VarM21530s.m69165r(d4);
        ((ecr0) ecr0Var).getClass();
        p541VarM21530s.m69166s();
        p541VarM21530s.m69164q();
        p541VarM21530s.m69163m();
        SpeedPreviewOuterClass$SpeedPreview speedPreviewOuterClass$SpeedPreview = (SpeedPreviewOuterClass$SpeedPreview) p541VarM21530s.build();
        tow towVarM17992q = EsSignalRequest$SignalRequest.m17992q();
        towVarM17992q.m81225r("speed-preview");
        towVarM17992q.m81224q(sx8.m79587c(sx8.f214837e, speedPreviewOuterClass$SpeedPreview.toByteArray()));
        towVarM17992q.m81223m(esLoggingParams$LoggingParams);
        objM79082p0 = sr6Var.m79082p0((EsSignalRequest$SignalRequest) towVarM17992q.build(), u541Var);
        if (objM79082p0 != yukVar) {
            objM79082p0 = w2a1Var;
        }
        if (objM79082p0 == yukVar) {
            return yukVar;
        }
        return w2a1Var;
        EsContextPlayerState$ContextPlayerState esContextPlayerState$ContextPlayerState = (EsContextPlayerState$ContextPlayerState) ecr0Var;
        String strM17731s = esContextPlayerState$ContextPlayerState.m17731s();
        if (strM17731s == null || wl51.m88460J0(strM17731s) || wj50.m88271j(esContextPlayerState$ContextPlayerState.m17731s(), "spotify:speed-control:preview")) {
            wj50.m88279p(esLoggingParams$LoggingParams);
            u541Var.f226903a = str2;
            u541Var.f226904b = esLoggingParams$LoggingParams;
            u541Var.f226905c = d2;
            u541Var.f226908f = 2;
            ymw ymwVarM17793q = EsPlay$PlayRequest.m17793q();
            ymwVarM17793q.m94206m(esLoggingParams$LoggingParams);
            mnw mnwVarM17826q = EsPreparePlay$PreparePlayRequest.m17826q();
            hjw hjwVarM17675t = EsContext$Context.m17675t();
            hjwVarM17675t.m47727t("spotify:speed-control:preview");
            hjwVarM17675t.m47728u("spotify:speed-control:preview");
            mnwVarM17826q.m62368m((EsContext$Context) hjwVarM17675t.build());
            onw onwVarM17830E = EsPreparePlayOptions$PreparePlayOptions.m17830E();
            onwVarM17830E.m67435u(true);
            mnwVarM17826q.m62369q((EsPreparePlayOptions$PreparePlayOptions) onwVarM17830E.build());
            ymwVarM17793q.m94208r((EsPreparePlay$PreparePlayRequest) mnwVarM17826q.build());
            Object objM79042R = sr6Var.m79042R((EsPlay$PlayRequest) ymwVarM17793q.build(), u541Var);
            if (objM79042R != yukVar) {
                objM79042R = w2a1Var;
            }
            if (objM79042R != yukVar) {
                str3 = str2;
                d3 = d2;
                d2 = d3;
                str2 = str3;
                eviVarM79023B = sr6Var.m79023B(EsGetStateRequest$GetStateRequest.m17761p());
                u541Var.f226903a = str2;
                u541Var.f226904b = esLoggingParams$LoggingParams;
                u541Var.f226905c = d2;
                u541Var.f226908f = 3;
                if (vyf1.m86755t(eviVarM79023B, u541Var) != yukVar) {
                    str4 = str2;
                    u541Var.f226903a = str4;
                    u541Var.f226904b = esLoggingParams$LoggingParams;
                    u541Var.f226905c = d2;
                    u541Var.f226908f = 4;
                    ecr0Var = new ecr0();
                    if (ecr0Var != yukVar) {
                        d4 = d2;
                        wj50.m88279p(esLoggingParams$LoggingParams);
                        u541Var.f226903a = null;
                        u541Var.f226904b = null;
                        u541Var.f226905c = d4;
                        u541Var.f226908f = 5;
                        p541 p541VarM21530s2 = SpeedPreviewOuterClass$SpeedPreview.m21530s();
                        p541VarM21530s2.m69167t(str4);
                        p541VarM21530s2.m69165r(d4);
                        ((ecr0) ecr0Var).getClass();
                        p541VarM21530s2.m69166s();
                        p541VarM21530s2.m69164q();
                        p541VarM21530s2.m69163m();
                        SpeedPreviewOuterClass$SpeedPreview speedPreviewOuterClass$SpeedPreview2 = (SpeedPreviewOuterClass$SpeedPreview) p541VarM21530s2.build();
                        tow towVarM17992q2 = EsSignalRequest$SignalRequest.m17992q();
                        towVarM17992q2.m81225r("speed-preview");
                        towVarM17992q2.m81224q(sx8.m79587c(sx8.f214837e, speedPreviewOuterClass$SpeedPreview2.toByteArray()));
                        towVarM17992q2.m81223m(esLoggingParams$LoggingParams);
                        objM79082p0 = sr6Var.m79082p0((EsSignalRequest$SignalRequest) towVarM17992q2.build(), u541Var);
                        if (objM79082p0 != yukVar) {
                            objM79082p0 = w2a1Var;
                        }
                        if (objM79082p0 == yukVar) {
                            return w2a1Var;
                        }
                    }
                }
            }
        } else {
            eviVarM79023B = sr6Var.m79023B(EsGetStateRequest$GetStateRequest.m17761p());
            u541Var.f226903a = str2;
            u541Var.f226904b = esLoggingParams$LoggingParams;
            u541Var.f226905c = d2;
            u541Var.f226908f = 3;
            if (vyf1.m86755t(eviVarM79023B, u541Var) != yukVar) {
                str4 = str2;
                u541Var.f226903a = str4;
                u541Var.f226904b = esLoggingParams$LoggingParams;
                u541Var.f226905c = d2;
                u541Var.f226908f = 4;
                ecr0Var = new ecr0();
                if (ecr0Var != yukVar) {
                    d4 = d2;
                    wj50.m88279p(esLoggingParams$LoggingParams);
                    u541Var.f226903a = null;
                    u541Var.f226904b = null;
                    u541Var.f226905c = d4;
                    u541Var.f226908f = 5;
                    p541 p541VarM21530s3 = SpeedPreviewOuterClass$SpeedPreview.m21530s();
                    p541VarM21530s3.m69167t(str4);
                    p541VarM21530s3.m69165r(d4);
                    ((ecr0) ecr0Var).getClass();
                    p541VarM21530s3.m69166s();
                    p541VarM21530s3.m69164q();
                    p541VarM21530s3.m69163m();
                    SpeedPreviewOuterClass$SpeedPreview speedPreviewOuterClass$SpeedPreview3 = (SpeedPreviewOuterClass$SpeedPreview) p541VarM21530s3.build();
                    tow towVarM17992q3 = EsSignalRequest$SignalRequest.m17992q();
                    towVarM17992q3.m81225r("speed-preview");
                    towVarM17992q3.m81224q(sx8.m79587c(sx8.f214837e, speedPreviewOuterClass$SpeedPreview3.toByteArray()));
                    towVarM17992q3.m81223m(esLoggingParams$LoggingParams);
                    objM79082p0 = sr6Var.m79082p0((EsSignalRequest$SignalRequest) towVarM17992q3.build(), u541Var);
                    if (objM79082p0 != yukVar) {
                        objM79082p0 = w2a1Var;
                    }
                    if (objM79082p0 == yukVar) {
                        return w2a1Var;
                    }
                }
            }
        }
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public Object m70739g(String str, String str2, ekb ekbVar, boolean z, ibk ibkVar) {
        iqz0 iqz0Var;
        if (ibkVar instanceof iqz0) {
            iqz0Var = (iqz0) ibkVar;
            int i = iqz0Var.f104870c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iqz0Var.f104870c = i - Integer.MIN_VALUE;
            } else {
                iqz0Var = new iqz0(this, ibkVar);
            }
        } else {
            iqz0Var = new iqz0(this, ibkVar);
        }
        Object objM37661F = iqz0Var.f104868a;
        int i2 = iqz0Var.f104870c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM37661F);
                e3p e3pVar = (e3p) this.f180688b;
                fkb fkbVar = new fkb(str, str2, ekbVar, z);
                iqz0Var.f104870c = 1;
                objM37661F = e3pVar.m37661F(fkbVar, iqz0Var);
                yuk yukVar = yuk.f276404a;
                if (objM37661F == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM37661F);
            }
            return (rvc) objM37661F;
        } catch (Throwable th) {
            return new c6x0(th);
        }
    }

    @Override // p204p.rdc1
    public View getRoot() {
        return (LinearLayout) this.f180688b;
    }

    /* JADX INFO: renamed from: h */
    public Object m70740h(boolean z, ibk ibkVar) {
        ilw ilwVarM17768t = EsLoggingParams$LoggingParams.m17768t();
        umw umwVarM17777q = EsOptional$OptionalInt64.m17777q();
        umwVarM17777q.m83492m(System.currentTimeMillis());
        ilwVarM17768t.m51046s((EsOptional$OptionalInt64) umwVarM17777q.build());
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = (EsLoggingParams$LoggingParams) ilwVarM17768t.build();
        sr6 sr6Var = (sr6) this.f180688b;
        tow towVarM17992q = EsSignalRequest$SignalRequest.m17992q();
        towVarM17992q.m81225r("stop-speed-preview");
        towVarM17992q.m81224q(z ? "true" : "false");
        towVarM17992q.m81223m(esLoggingParams$LoggingParams);
        Object objM79082p0 = sr6Var.m79082p0((EsSignalRequest$SignalRequest) towVarM17992q.build(), ibkVar);
        return objM79082p0 == yuk.f276404a ? objM79082p0 : w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.w111
    /* JADX INFO: renamed from: l */
    public Object mo28227l(eo01 eo01Var, fbk fbkVar) {
        kp31 kp31Var;
        if (fbkVar instanceof kp31) {
            kp31Var = (kp31) fbkVar;
            int i = kp31Var.f124970c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kp31Var.f124970c = i - Integer.MIN_VALUE;
            } else {
                kp31Var = new kp31(this, (ibk) fbkVar);
            }
        } else {
            kp31Var = new kp31(this, (ibk) fbkVar);
        }
        Object objM50760w = kp31Var.f124968a;
        int i2 = kp31Var.f124970c;
        if (i2 == 0) {
            bga.m29073P(objM50760w);
            if (!eo01Var.f61267d.contains(lp31.f135609a)) {
                throw new IllegalStateException("Cannot invoke SongDNA share entry point plugin without SongDNA signal. This indicates an error with the plugin configuration");
            }
            jp31 jp31Var = (jp31) zn91.m96523K(eo01Var.f61265b, "song_dna.loader_type", jp31.class);
            if (jp31Var == null) {
                return null;
            }
            iin iinVar = (iin) this.f180688b;
            kp31Var.f124970c = 1;
            objM50760w = iinVar.m50760w(jp31Var, kp31Var);
            yuk yukVar = yuk.f276404a;
            if (objM50760w == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM50760w);
        }
        return new e211((List) objM50760w, 0, fji.f70297b, "song_dna");
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        List list = (List) obj;
        o191 o191Var = (o191) this.f180688b;
        wj50.m88279p(list);
        o191Var.m66047a(list, bg61.f26850b, true, 1);
    }

    public /* synthetic */ prv0(Object obj, int i) {
        this.f180687a = i;
        this.f180688b = obj;
    }

    public prv0(xre xreVar, sr6 sr6Var, ri5 ri5Var) {
        this.f180687a = 24;
        this.f180688b = sr6Var;
    }
}
