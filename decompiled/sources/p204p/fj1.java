package p204p;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.spotify.mobius.functions.Consumer;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.premiumdestinationbadge.p129v1.BadgeRequest;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableNever;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes5.dex */
public final class fj1 implements oo21, Function, xge0, BiFunction, SingleOnSubscribe, dn6, fha1, InterfaceC2207oa, mp3, wja {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70040a;

    /* JADX INFO: renamed from: b */
    public Object f70041b;

    public /* synthetic */ fj1() {
        this.f70040a = 29;
    }

    /* JADX INFO: renamed from: h */
    public static String m41779h(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // p204p.wja
    /* JADX INFO: renamed from: a */
    public void mo26364a(z2l z2lVar) {
        this.f70041b = z2lVar;
        Log.isLoggable("FirebaseCrashlytics", 3);
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return ((ihi) obj).f102296c == u300.BLEND && ((rc4) this.f70041b).m75203b();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        String strUri;
        cbf0 cbf0VarM35556a;
        switch (this.f70040a) {
            case 3:
                Flowable flowable = ((C2062kq) this.f70041b).f125171a;
                return AbstractC0000a.m11j(flowable, flowable);
            case 4:
            case 5:
            case 8:
            case 14:
            case 16:
            case 17:
            case 18:
            default:
                String str = (String) ((Map) obj).get("country_code");
                if (str == null) {
                    return MaybeEmpty.f8264a;
                }
                sq8 sq8VarM19530o = BadgeRequest.m19530o();
                sq8VarM19530o.m78941m(str);
                BadgeRequest badgeRequest = (BadgeRequest) sq8VarM19530o.build();
                eq8 eq8Var = (eq8) this.f70041b;
                wj50.m88279p(badgeRequest);
                return eq8Var.m39724a(badgeRequest).map(u4g1.f226713t).toMaybe();
            case 6:
                return new nya0(((dz0) this.f70041b).f54476j.f225056n, ((s6x0) obj).f206218a);
            case 7:
                return new cku0(((oju0) this.f70041b).f166145a, (Throwable) obj);
            case 9:
                return Observable.fromIterable((List) obj).concatMap(new ckx0((lt2) this.f70041b, 12)).toList();
            case 10:
                y5f y5fVar = (y5f) ((Map) obj).get(((r53) this.f70041b).f195934a);
                return Boolean.valueOf(y5fVar != null ? y5fVar.f269419c : false);
            case 11:
                ha3 ha3Var = ((ja3) obj).f110313a;
                if (ha3Var == null) {
                    return ((ya3) this.f70041b).m93176j(ka3.f120768b, za3.f280966c);
                }
                Single singleJust = Single.just(ha3Var);
                wj50.m88279p(singleJust);
                return singleJust;
            case 12:
                return Single.create(new az1((du3) this.f70041b, 15));
            case 13:
                return Single.create(new az1((fy3) this.f70041b, 16));
            case 15:
                PlayerState playerState = (PlayerState) obj;
                if (!playerState.track().mo49279c()) {
                    int i = Flowable.f7192a;
                    return FlowableNever.f7888b.m23339T(Flowable.m23313I(Boolean.FALSE));
                }
                ContextTrack contextTrack = (ContextTrack) playerState.track().mo49278b();
                wj50.m88279p(contextTrack);
                String strContextUri = e72.m37980N(contextTrack) ? "" : playerState.contextUri();
                if (!e72.m37990X(contextTrack) || (strUri = e72.m38000d0(contextTrack, ContextTrack.Metadata.KEY_POINTER_URI)) == null) {
                    strUri = contextTrack.uri();
                }
                ezx ezxVar = ((uzx) this.f70041b).f235651a.f246567g;
                wj50.m88279p(strUri);
                wj50.m88279p(strContextUri);
                ezxVar.getClass();
                Set set = dd41.f47702f;
                gn80 gn80Var = r46.m74726U(strUri).f47709c;
                gn80 gn80Var2 = gn80.PODCAST_CHAPTER;
                if (gn80Var == gn80Var2) {
                    strContextUri = "spotify:playlist:37i9dQZF1FgnTBfUlzkeKt";
                }
                return ezxVar.f64489b.m95459c(strContextUri, Collections.singletonList(strUri), r46.m74726U(strUri).f47709c == gn80Var2 || r46.m74726U(strUri).f47709c == gn80.CLIP).flatMapSingle(new czx(ezxVar, strUri, strContextUri, 1)).distinctUntilChanged().toFlowable(BackpressureStrategy.f7190d);
            case 19:
                dbf0 dbf0VarM38368c = ((ebf0) obj).m38368c(hy5.class, ((vx5) this.f70041b).f245618a);
                hy5 hy5Var = (hy5) ((dbf0VarM38368c == null || (cbf0VarM35556a = dbf0VarM38368c.m35556a()) == null) ? null : (ktx) cbf0VarM35556a.f36107a);
                nx5 nx5Var = hy5Var != null ? (nx5) g6f.m43741q0(hy5Var.f96463a) : null;
                wj50.m88279p(nx5Var);
                return new ux5(nx5Var.f159365b, nx5Var.f159366c, nx5Var.f159367d);
        }
    }

    @Override // p204p.mp3
    /* JADX INFO: renamed from: b */
    public void mo31097b(String str, Bundle bundle) {
        z2l z2lVar = (z2l) this.f70041b;
        if (z2lVar != null) {
            try {
                String str2 = "$A$:" + m41779h(str, bundle);
                a3l a3lVar = z2lVar.f278613a;
                ((q4l) a3lVar.f11997p.f197471b).m72169a(new y2l(a3lVar, System.currentTimeMillis() - a3lVar.f11985d, str2, 0));
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public Serializable m41780c(String str, ibk ibkVar) {
        yp6 yp6Var;
        if (ibkVar instanceof yp6) {
            yp6Var = (yp6) ibkVar;
            int i = yp6Var.f274829c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yp6Var.f274829c = i - Integer.MIN_VALUE;
            } else {
                yp6Var = new yp6(this, ibkVar);
            }
        } else {
            yp6Var = new yp6(this, ibkVar);
        }
        Object objM83539b = yp6Var.f274827a;
        int i2 = yp6Var.f274829c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM83539b);
                unb unbVar = (unb) this.f70041b;
                yp6Var.f274829c = 1;
                objM83539b = unbVar.m83539b(str, yp6Var);
                yuk yukVar = yuk.f276404a;
                if (objM83539b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM83539b);
            }
            Boolean bool = (Boolean) objM83539b;
            bool.getClass();
            return bool;
        } catch (Throwable th) {
            return new c6x0(th);
        }
    }

    @Override // p204p.oo21
    /* JADX INFO: renamed from: d */
    public void mo30790d() {
        Consumer consumer;
        C1939hj c1939hj = (C1939hj) this.f70041b;
        if (c1939hj.f91919e == null || (consumer = c1939hj.f91918d) == null) {
            return;
        }
        c1939hj.f91917c.getClass();
        consumer.accept(new rto(C2377si.f209302a));
    }

    /* JADX INFO: renamed from: e */
    public r8n m41781e(String str) {
        xqb xqbVar;
        rjn rjnVar = (rjn) this.f70041b;
        switch (rjnVar.f199863a) {
            case 0:
                xqbVar = new xqb(9, (t4f) ((phn) rjnVar.f199864b).f177688b.f212145i3.get(), str);
                break;
            case 1:
                xqbVar = new xqb(9, (t4f) ((vfn) rjnVar.f199864b).f241004b.f212145i3.get(), str);
                break;
            default:
                xqbVar = new xqb(9, (t4f) ((vfn) rjnVar.f199864b).f241004b.f212145i3.get(), str);
                break;
        }
        t4f t4fVar = (t4f) xqbVar.f264945b;
        jg31.m53271i(t4fVar);
        String str2 = (String) xqbVar.f264946c;
        jg31.m53271i(str2);
        return new r8n(t4fVar, str2);
    }

    /* JADX INFO: renamed from: f */
    public z9t m41782f() {
        return new z9t(new mc60((oh4) ((rb5) this.f70041b).f197472c));
    }

    @Override // p204p.dn6
    /* JADX INFO: renamed from: g */
    public Single mo25091g(Intent intent, e301 e301Var) {
        return ((Observable) ((bt7) this.f70041b).f30527b.invoke()).firstOrError().map(new at7(intent)).onErrorReturn(efy.f59141N0);
    }

    @Override // p204p.xge0
    /* JADX INFO: renamed from: m */
    public boolean mo41783m(zge0 zge0Var, lhe0 lhe0Var) {
        boolean zOnMenuItemSelected;
        e50 e50Var = ((ActionMenuView) this.f70041b).f163b1;
        if (e50Var != null) {
            Toolbar toolbar = (Toolbar) ((rg41) e50Var).f198831b;
            if (toolbar.f337h1.m59047x(lhe0Var)) {
                zOnMenuItemSelected = true;
            } else {
                l081 l081Var = toolbar.f340j1;
                zOnMenuItemSelected = l081Var != null ? ((o081) ((onz0) l081Var).f167415b).f160271g.onMenuItemSelected(0, lhe0Var) : false;
            }
            if (zOnMenuItemSelected) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.fha1
    /* JADX INFO: renamed from: n */
    public Object mo35625n(fbk fbkVar) {
        w39 w39Var;
        if (fbkVar instanceof w39) {
            w39Var = (w39) fbkVar;
            int i = w39Var.f247526c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w39Var.f247526c = i - Integer.MIN_VALUE;
            } else {
                w39Var = new w39(this, (ibk) fbkVar);
            }
        } else {
            w39Var = new w39(this, (ibk) fbkVar);
        }
        Object objM66947a = w39Var.f247524a;
        int i2 = w39Var.f247526c;
        if (i2 == 0) {
            bga.m29073P(objM66947a);
            oha1 oha1Var = (oha1) this.f70041b;
            w39Var.f247526c = 1;
            objM66947a = oha1Var.m66947a(w39Var);
            yuk yukVar = yuk.f276404a;
            if (objM66947a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM66947a);
        }
        return new po41(null, null, (String) objM66947a);
    }

    @Override // p204p.xge0
    /* JADX INFO: renamed from: r */
    public void mo41784r(zge0 zge0Var) {
        xge0 xge0Var = ((ActionMenuView) this.f70041b).f158W0;
        if (xge0Var != null) {
            xge0Var.mo41784r(zge0Var);
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        bji bjiVar;
        bji bjiVar2;
        bji bjiVar3;
        switch (this.f70040a) {
            case 14:
                w84 w84Var = (w84) this.f70041b;
                fnk0 fnk0Var = w84Var.f248847h;
                if (fnk0Var == null || !fnk0Var.m42228h("android-gen-alpha-account-creation.parental_controls_transition_entry_point_enabled")) {
                    bjiVar = fnk0Var;
                    bjiVar = w84Var.f248848i;
                }
                if (bjiVar != null) {
                }
                break;
            case 17:
                tt4 tt4Var = (tt4) this.f70041b;
                fnk0 fnk0Var2 = tt4Var.f223513b;
                if (fnk0Var2 == null || !fnk0Var2.m42228h("android-video.allow_showing_music_videos_setting")) {
                    bjiVar2 = fnk0Var2;
                    bjiVar2 = tt4Var.f223514c;
                }
                if (bjiVar2 != null) {
                }
                break;
            default:
                gi5 gi5Var = (gi5) this.f70041b;
                fnk0 fnk0Var3 = gi5Var.f80068r;
                if (fnk0Var3 == null || !fnk0Var3.m42228h("apps-music-libs-eventsender.heartbeat_interval")) {
                    bjiVar3 = fnk0Var3;
                    bjiVar3 = gi5Var.f80069s;
                }
                if (bjiVar3 != null) {
                }
                break;
        }
    }

    public /* synthetic */ fj1(Object obj, int i) {
        this.f70040a = i;
        this.f70041b = obj;
    }

    public fj1(ay5 ay5Var, vx5 vx5Var) {
        this.f70040a = 19;
        this.f70041b = vx5Var;
    }

    public fj1(tv30 tv30Var) {
        this.f70040a = 27;
        ig31.m50506x(tv30Var);
        this.f70041b = tv30Var;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f70040a) {
            case 5:
                ((v02) this.f70041b).m84366g((String) obj, (am81) obj2);
                return w2a1.f247311a;
            default:
                return new dn70(((qry) this.f70041b).f191924b.f58716b.f251737a, (x6x0) obj, (x6x0) obj2);
        }
    }
}
