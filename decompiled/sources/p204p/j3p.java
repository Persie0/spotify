package p204p;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.compose.p002ui.platform.ComposeView;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.tasks.Task;
import com.spotify.base.java.logging.Logger;
import com.spotify.checkout.proto.model.p044v1.proto.GetSessionStatusRequest;
import com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoremobile.facepile.FacePileView;
import com.spotify.liveevents.uiusecases.concertentityheader.elements.CalendarIconView;
import com.spotify.player.esperanto.proto.EsPause$PauseRequest;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;
import spotify.mdata.proto.Mdata$LocalBatchedEntityRequest;
import spotify.mdata.proto.Mdata$LocalExtensionQuery;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto$GetResumePointRequest;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto$GetResumePointResponse;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto$ItemResumePoint;

/* JADX INFO: loaded from: classes6.dex */
public final class j3p implements ant, Function, gk00, jnx0, InterfaceC1667ah, BiFunction, fyv, r7l0, Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f108450a;

    /* JADX INFO: renamed from: b */
    public final Object f108451b;

    public /* synthetic */ j3p(Object obj, int i) {
        this.f108450a = i;
        this.f108451b = obj;
    }

    /* JADX INFO: renamed from: a */
    public CastDevice m52284a(String str) {
        Object next;
        l7p l7pVar = (l7p) this.f108451b;
        String str2 = (String) l7pVar.f130711e.get(str);
        zv41 zv41VarM52819d = l7pVar.f130707a.f216819h;
        if (zv41VarM52819d == null) {
            zv41VarM52819d = jag1.m52819d(lau.f131415a);
        }
        Iterator it = ((Iterable) zv41VarM52819d.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!wj50.m88271j(((rmx0) next).f200635a, str2));
        rmx0 rmx0Var = (rmx0) next;
        if (rmx0Var == null) {
            Logger.m3966b("CastBasic->%s", "No cast route found for connectStateIdentifier: ".concat(str));
            return null;
        }
        Bundle bundle = rmx0Var.f200645k;
        if (bundle != null) {
            return CastDevice.m1481M(bundle);
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return veu.m85328c((fk30) this.f108451b, ((Boolean) obj2).booleanValue(), ((Boolean) obj).booleanValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m52285b(String str, ibk ibkVar) {
        f7w f7wVar;
        if (ibkVar instanceof f7w) {
            f7wVar = (f7w) ibkVar;
            int i = f7wVar.f66805d;
            if ((i & Integer.MIN_VALUE) != 0) {
                f7wVar.f66805d = i - Integer.MIN_VALUE;
            } else {
                f7wVar = new f7w(this, ibkVar);
            }
        } else {
            f7wVar = new f7w(this, ibkVar);
        }
        Object objM79021A = f7wVar.f66803b;
        int i2 = f7wVar.f66805d;
        if (i2 == 0) {
            bga.m29073P(objM79021A);
            sr6 sr6Var = (sr6) this.f108451b;
            gax0 gax0VarM97880s = ResumptionProgressEsperanto$GetResumePointRequest.m97880s();
            gax0VarM97880s.m44185q(str);
            gax0VarM97880s.m44186r("episode_share");
            gax0VarM97880s.m44187s("episode_share");
            ResumptionProgressEsperanto$GetResumePointRequest resumptionProgressEsperanto$GetResumePointRequest = (ResumptionProgressEsperanto$GetResumePointRequest) gax0VarM97880s.build();
            f7wVar.f66802a = str;
            f7wVar.f66805d = 1;
            objM79021A = sr6Var.m79021A(resumptionProgressEsperanto$GetResumePointRequest, f7wVar);
            yuk yukVar = yuk.f276404a;
            if (objM79021A == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = f7wVar.f66802a;
            bga.m29073P(objM79021A);
        }
        ResumptionProgressEsperanto$ItemResumePoint resumptionProgressEsperanto$ItemResumePoint = (ResumptionProgressEsperanto$ItemResumePoint) ((ResumptionProgressEsperanto$GetResumePointResponse) objM79021A).m97882n().get(str);
        if (resumptionProgressEsperanto$ItemResumePoint != null && resumptionProgressEsperanto$ItemResumePoint.m97893o() == iax0.ITEM_RESULT_SUCCESS && resumptionProgressEsperanto$ItemResumePoint.m97895q()) {
            return new Long(resumptionProgressEsperanto$ItemResumePoint.m97894p().m97919o().m1932r() * ((long) 1000));
        }
        return null;
    }

    @Override // p204p.fyv
    /* JADX INFO: renamed from: f */
    public fiz mo26898f() {
        FlowableMap flowableMap = (FlowableMap) this.f108451b;
        d0k[] d0kVarArr = bmu0.f28619a;
        return new onc(flowableMap);
    }

    @Override // p204p.jnx0
    /* JADX INFO: renamed from: n */
    public void mo25436n(Intent intent, dd41 dd41Var, e301 e301Var) {
        ((xcp) ((la2) this.f108451b).f131226b).m90397a(intent.getStringExtra("DEVICE_PICKER_INTERACTION_ID"), intent.getBooleanExtra("DEVICE_PICKER_OPEN_PARTICIPANTS", false));
    }

    @Override // p204p.r7l0
    public void onComplete(Task task) {
        Exception excM65555t;
        mzx0 mzx0Var = (mzx0) this.f108451b;
        boolean zMo1518j = task.mo1518j();
        w2a1 w2a1Var = w2a1.f247311a;
        if (zMo1518j) {
            mzx0Var.resumeWith(w2a1Var);
            return;
        }
        Exception excMo1514f = task.mo1514f();
        if (excMo1514f == null || (excM65555t = nsg1.m65555t(excMo1514f)) == null) {
            mzx0Var.resumeWith(w2a1Var);
        } else {
            mzx0Var.resumeWith(new c6x0(excM65555t));
        }
    }

    @Override // p204p.gk00
    public void onFailure(Throwable th) {
        gbb gbbVar = (gbb) this.f108451b;
        if (th instanceof TimeoutException) {
            gbbVar.m44212c(th);
        } else {
            gbbVar.m44211b(Collections.EMPTY_LIST);
        }
    }

    @Override // p204p.gk00
    public void onSuccess(Object obj) {
        List list = (List) obj;
        list.getClass();
        ((gbb) this.f108451b).m44211b(new ArrayList(list));
    }

    @Override // p204p.InterfaceC1667ah
    /* JADX INFO: renamed from: q */
    public boolean mo1561q(View view) {
        ogs ogsVar = (ogs) this.f108451b;
        if (!ogs.m66899k(view) || ogsVar.m66907f(view) == 2) {
            return false;
        }
        ogsVar.m66903b(view);
        return true;
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        String str;
        switch (this.f108450a) {
            case 1:
                d7i d7iVar = (d7i) obj;
                ((CalendarIconView) ((j5p) this.f108451b).f109054e.f43731g).mo2820d(new q8b(252, null, null, d7iVar.f46211l, d7iVar.f46212m, false));
                break;
            case 2:
                rjl rjlVar = (rjl) obj;
                w9p w9pVar = (w9p) this.f108451b;
                ComposeView composeView = w9pVar.f249224h;
                ed00 ed00Var = rjlVar.f199852g;
                boolean z = (ed00Var == null || rjlVar.f199855j.f220958b != 1 || (str = rjlVar.f199853h) == null || str.length() == 0) ? false : true;
                composeView.setVisibility(z ? 0 : 8);
                if (z) {
                    composeView.setContent(new fyf(new q9p(w9pVar, rjlVar, ed00Var, 1), true, 881259148));
                    break;
                }
                break;
            case 3:
                int iIntValue = ((Number) obj).intValue();
                hol0 hol0Var = (hol0) ((iin) this.f108451b).f102607c;
                ((TextView) hol0Var.f93563c).setVisibility(iIntValue);
                ((TextView) hol0Var.f93564d).setVisibility(iIntValue);
                ((TextView) hol0Var.f93565e).setVisibility(iIntValue);
                ((TextView) hol0Var.f93566f).setVisibility(iIntValue);
                break;
            case 4:
                List list = (List) obj;
                qbp qbpVar = (qbp) this.f108451b;
                FacePileView facePileView = qbpVar.f187134d;
                e940 e940Var = qbpVar.f187131a;
                if (!list.isEmpty()) {
                    list.subList(1, list.size());
                }
                omo0.m67370v(e940Var, null, facePileView.f3809a, list, facePileView.f3811c, null);
                break;
            case 5:
                xzo xzoVar = (xzo) this.f108451b;
                ((z3x) obj).getClass();
                ((TextView) ((z9p) xzoVar.f267728c).f280846e).setText("");
                break;
            case 6:
            case 7:
            case 10:
            default:
                ((ContentRestrictionBadgeView) ((tdq) this.f108451b).f219454c.f225654h).mo2820d((qsj) obj);
                break;
            case 8:
                Boolean bool = (Boolean) obj;
                qxo qxoVar = (qxo) this.f108451b;
                wj50.m88279p(bool);
                ((AddToButtonView) ((rk0) qxoVar.f193717c).f199935c).mo2820d(new pi1(bool.booleanValue() ? qi1.f188893b : qi1.f188892a, false, null, null, ti1.f220528b, 14));
                break;
            case 9:
                String str2 = (String) obj;
                g0q g0qVar = (g0q) this.f108451b;
                wj50.m88279p(str2);
                ((TextView) g0qVar.f75420e.f39343e).setText(str2);
                ((TextView) g0qVar.f75419d.f225646Y).setText(str2);
                break;
            case 11:
                nf81 nf81Var = (nf81) obj;
                adq adqVar = (adq) this.f108451b;
                wj50.m88279p(nf81Var);
                ((AddToButtonView) adqVar.f14659d.f56507d).mo2820d(new pi1(nf81Var.f153292h ? qi1.f188893b : qi1.f188892a, false, null, null, null, 30));
                break;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) throws IOException {
        Throwable th = (Throwable) obj;
        d7x d7xVar = (d7x) this.f108451b;
        c7x c7xVar = d7xVar.f46287e;
        wra0 wra0Var = d7xVar.f46285c;
        c7xVar.invoke(b7x.f24435b);
        if (!d7x.m35238d(th)) {
            wra0Var.mo46854e("Error while writing to disk.", th);
            return true;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        "Error while writing to disk: ".concat(message);
        wra0Var.mo46853c();
        return true;
    }

    public j3p(veu veuVar, fk30 fk30Var) {
        this.f108450a = 22;
        this.f108451b = fk30Var;
    }

    public j3p() {
        this.f108450a = 17;
        this.f108451b = (SmallDisplaySizeQuirk) rbr.f197650a.m76583e(SmallDisplaySizeQuirk.class);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01ce  */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, p.gh00] */
    /* JADX WARN: Type inference failed for: r1v1, types: [p.gh00, p.qe70] */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        boolean z;
        switch (this.f108450a) {
            case 6:
                return Observable.fromIterable((List) obj).flatMapSingle(new t5p((qqp) this.f108451b, 6)).toList();
            case 7:
                qwp qwpVar = (qwp) this.f108451b;
                Throwable th = (Throwable) qwpVar.f193394b.invoke(obj);
                if (th == null) {
                    return Observable.just(qwpVar.f193393a.invoke(obj));
                }
                return Observable.error(th);
            case 13:
                C2263po c2263po = (C2263po) this.f108451b;
                return ((m241) c2263po.f179550b).mo32086c((irw) c2263po.f179551c, ((a041) obj).f10989a).m23308z(w141.f246944b).onErrorReturnItem(w141.f246943a);
            case 16:
                PlayerState playerState = (PlayerState) obj;
                if (!playerState.isPaused() && playerState.isPlaying()) {
                    Boolean bool = (Boolean) ((ulp) ((qyy0) this.f108451b).f194062e).f231607f.m23798h();
                    z = bool != null ? bool.booleanValue() : true;
                }
                return new dor(z);
            case 18:
                qgc0 qgc0Var = (qgc0) obj;
                if (qgc0Var instanceof pgc0) {
                    ngc0 ngc0Var = ((pgc0) qgc0Var).f177287a;
                    k4y k4yVar = ngc0Var.f153642c;
                    e4y e4yVar = new e4y(k4yVar.f119369c, k4yVar.f119370d, k4yVar.f119367a, vkf1.m85845K(k4yVar.f119368b));
                    d4y d4yVar = ngc0Var.f153643d;
                    y3y y3yVar = new y3y(d4yVar.f45265c, d4yVar.f45266d, d4yVar.f45263a, vkf1.m85845K(d4yVar.f45264b));
                    gy31 gy31Var = ngc0Var.f153640a;
                    ay31 ay31Var = gy31Var != null ? new ay31(gy31Var.f85418a, vkf1.m85845K(gy31Var.f85422e), gy31Var.f85419b, gy31Var.f85420c, gy31Var.f85421d, gy31Var.f85423f, gy31Var.f85424g) : null;
                    wx31 wx31Var = ngc0Var.f153641b;
                    z5z z5zVar = new z5z(e4yVar, y3yVar, ay31Var, new rx31(wx31Var.f255926c, wx31Var.f255927d, wx31Var.f255924a, vkf1.m85845K(wx31Var.f255925b)));
                    return ((Completable) ((C2483v5) ((ei1) this.f108451b).f59758c).invoke(z5zVar)).m23294e(Single.just(new y5s(z5zVar)));
                }
                Single singleJust = Single.just(x5s.f258505a);
                wj50.m88279p(singleJust);
                return singleJust;
            case 20:
                wqt wqtVar = (wqt) this.f108451b;
                vb41 vb41Var = wqtVar.f254169b;
                hb10 hb10VarM6198o = GetSessionStatusRequest.m6198o();
                hb10VarM6198o.m46960m(wqtVar.f254168a.mo75140m0());
                return vb41Var.mo26813b((GetSessionStatusRequest) hb10VarM6198o.build()).compose(new kq11(2)).map(u0o0.f225556Z0).onErrorReturn(lew0.f132748Z0);
            case 21:
                dvy dvyVar = (dvy) obj;
                n0u n0uVar = (n0u) this.f108451b;
                bvy bvyVar = dvyVar instanceof bvy ? (bvy) dvyVar : null;
                if (bvyVar == null) {
                    Logger.m3966b(s571.m77251j("Unexpected FieldValidationResponse type: ", dvyVar.getClass().getSimpleName(), ". Expected FieldValidationResponse.Email for email validation."), new Object[0]);
                    bvyVar = new bvy(new l2u(n0uVar.f149169a, null));
                }
                return new w0u(bvyVar.f31481a, n0uVar.f149170b);
            case 27:
                ss90 ss90Var = (ss90) obj;
                rqw rqwVar = (rqw) this.f108451b;
                ps90 ps90Var = ss90Var.f213548a;
                if (ps90Var == null) {
                    return Single.just(ss90Var);
                }
                List list = ps90Var.f180789k;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = ((rs90) it.next()).f202238c;
                    if (str.length() <= 0) {
                        str = null;
                    }
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                if (arrayList.isEmpty()) {
                    return Single.just(ss90Var);
                }
                y4d0 y4d0VarM97627o = Mdata$LocalBatchedEntityRequest.m97627o();
                z4d0 z4d0VarM97637q = Mdata$LocalExtensionQuery.m97637q();
                z4d0VarM97637q.m95345r(ntx.ON_PLATFORM_REPUTATION_TRAIT);
                z4d0VarM97637q.m95343m(arrayList);
                y4d0VarM97627o.m92811m(z4d0VarM97637q);
                Mdata$LocalBatchedEntityRequest mdata$LocalBatchedEntityRequest = (Mdata$LocalBatchedEntityRequest) y4d0VarM97627o.build();
                u9f0 u9f0Var = rqwVar.f201899a;
                wj50.m88279p(mdata$LocalBatchedEntityRequest);
                return u9f0Var.m82604a(mdata$LocalBatchedEntityRequest).map(new jwo(rqwVar, 29)).map(new u7q(23, ps90Var, ss90Var)).onErrorReturnItem(ss90Var);
            default:
                EsPause$PauseRequest esPause$PauseRequest = (EsPause$PauseRequest) obj;
                r7k r7kVar = ((hrw) this.f108451b).f94545a;
                wj50.m88279p(esPause$PauseRequest);
                return r7kVar.callSingle("spotify.player.esperanto.proto.ContextPlayer", "Pause", esPause$PauseRequest).map(t0b1.f215814Q0).map(uwk.f234682a1);
        }
    }
}
