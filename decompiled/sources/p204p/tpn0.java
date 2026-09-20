package p204p;

import android.app.Activity;
import android.content.Intent;
import android.os.SystemClock;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.spotify.base.java.logging.Logger;
import com.spotify.kidsaccount.api.p083v2.proto.NotEmpty;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.puffin_esperanto.proto.PuffinFilterRequestOuterClass$PuffinDisableProcessingRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class tpn0 implements Function, v4p0, BiFunction, hxr0, ant, InterfaceC2207oa, dn6, wh00, mmk0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f222568a;

    /* JADX INFO: renamed from: b */
    public final Object f222569b;

    public /* synthetic */ tpn0(Object obj, int i) {
        this.f222568a = i;
        this.f222569b = obj;
    }

    /* JADX INFO: renamed from: f */
    public static z7p0 m81265f(PlayerState playerState, int i) {
        return new z7p0((int) Math.max(0L, Math.min(playerState.timestamp() + ((long) i), ((Long) playerState.duration().mo49280e(0L)).longValue())));
    }

    @Override // p204p.hxr0
    /* JADX INFO: renamed from: a */
    public void mo49038a(int i, Object obj) {
        if (i == 6 || i == 7 || i == 8) {
        }
        ((ProfileInstallReceiver) this.f222569b).setResultCode(i);
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return ((m64) this.f222569b).m60945h();
    }

    @Override // p204p.v4p0
    public void apply(long j) {
        Map map;
        x1p0 x1p0Var = (x1p0) this.f222569b;
        gvk gvkVar = (gvk) x1p0Var.f257247b;
        ewu0 ewu0Var = ewu0.f63604b;
        yzo0 yzo0Var = (yzo0) x1p0Var.f257251f;
        gvkVar.m45896b(new h0c1(ewu0Var, null, (yzo0Var == null || (map = yzo0Var.f277859a.f128768d) == null) ? null : (String) map.get("playback_id")));
    }

    /* JADX INFO: renamed from: b */
    public Completable m81266b(boolean z) {
        C2048kd c2048kd = (C2048kd) this.f222569b;
        x8t0 x8t0VarM20008o = PuffinFilterRequestOuterClass$PuffinDisableProcessingRequest.m20008o();
        x8t0VarM20008o.m90227m(z ? z8t0.USER_INITIATED : z8t0.UNKNOWN);
        return c2048kd.callSingle("spotify.puffin_esperanto.proto.PuffinService", "DisableProcessing", (PuffinFilterRequestOuterClass$PuffinDisableProcessingRequest) x8t0VarM20008o.build()).map(jbr0.f110864d).ignoreElement();
    }

    @Override // p204p.mmk0
    /* JADX INFO: renamed from: c */
    public void mo49913c(Object obj) {
        ((y8j) this.f222569b).accept(obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: d */
    public Object m81267d(oit oitVar, ibk ibkVar) throws Throwable {
        uko0 uko0Var;
        if (ibkVar instanceof uko0) {
            uko0Var = (uko0) ibkVar;
            int i = uko0Var.f231336c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uko0Var.f231336c = i - Integer.MIN_VALUE;
            } else {
                uko0Var = new uko0(this, ibkVar);
            }
        } else {
            uko0Var = new uko0(this, ibkVar);
        }
        Object obj = uko0Var.f231334a;
        int i2 = uko0Var.f231336c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                String str = oitVar.f165887b;
                String strM56834f = oitVar.f165886a;
                if (str != null && !wj50.m88271j(strM56834f, str)) {
                    strM56834f = klh.m56834f(strM56834f, "?context=", oitVar.f165887b);
                }
                String str2 = strM56834f;
                gfi0 gfi0Var = (gfi0) this.f222569b;
                d850 d850Var = oitVar.f165888c;
                n6j0 n6j0Var = d850Var != null ? new n6j0(d850Var) : null;
                if (str2 == null) {
                    throw new IllegalStateException("uri was not set!");
                }
                p6j0 p6j0Var = new p6j0(str2, "", false, false, 0, 0, false, null, null, n6j0Var);
                uko0Var.f231336c = 1;
                Object objM44622b = gfi0Var.m44622b(p6j0Var, null, uko0Var);
                yuk yukVar = yuk.f276404a;
                if (objM44622b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3966b("ExtendedUserActivityRowElement", edb.m38564m("Play in context failed: ", e2.getMessage()));
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: e */
    public Single m81268e(xul0 xul0Var, h8p0 h8p0Var, int i) {
        er70 er70Var = (er70) this.f222569b;
        if (!xul0Var.mo49279c()) {
            return ((p8p0) er70Var.get()).mo48412a(h8p0Var);
        }
        xul0 xul0VarTrack = ((PlayerState) xul0Var.mo49278b()).track();
        return (xul0VarTrack.mo49279c() && e72.m37986T((ContextTrack) xul0VarTrack.mo49278b())) ? ((p8p0) er70Var.get()).mo48412a(m81265f((PlayerState) xul0Var.mo49278b(), i)) : ((p8p0) er70Var.get()).mo48412a(h8p0Var);
    }

    @Override // p204p.dn6
    /* JADX INFO: renamed from: g */
    public Single mo25091g(Intent intent, e301 e301Var) {
        return ((Observable) ((bt7) this.f222569b).f30527b.invoke()).firstOrError().map(alr0.f16968d).onErrorReturn(blr0.f28268d);
    }

    /* JADX INFO: renamed from: h */
    public Single m81269h(xul0 xul0Var) {
        er70 er70Var = (er70) this.f222569b;
        if (xul0Var.mo49279c()) {
            return ((p8p0) er70Var.get()).mo48412a(((PlayerState) xul0Var.mo49278b()).isPaused() ? new x7p0("wear-playbackcontrolcommandshandler", false) : new u7p0("wear-playbackcontrolcommandshandler", false));
        }
        return ((p8p0) er70Var.get()).mo48412a(new x7p0("wear-playbackcontrolcommandshandler", false));
    }

    @Override // p204p.mmk0
    public void onError(Throwable th) {
        vie1.m85627i("ObserverToConsumerAdapter");
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        switch (this.f222568a) {
            case 17:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                g161 g161Var = (g161) this.f222569b;
                g161Var.f75536f = zBooleanValue;
                g161Var.m47712h();
                break;
            default:
                ((hxt) ((mou0) this.f222569b).f145754i.getValue()).m49046g((f191) obj);
                break;
        }
    }

    public tpn0(oh5 oh5Var, gg5 gg5Var) {
        this.f222568a = 10;
        this.f222569b = oh5Var;
    }

    public tpn0(j64 j64Var, Activity activity) {
        this.f222568a = 0;
        this.f222569b = j64Var;
        activity.getString(R.string.settings_inline_card_title_text);
        activity.getString(R.string.settings_inline_card_subtitle_text_noud);
        activity.getString(R.string.settings_inline_card_subtitle_text_free);
        activity.getString(R.string.settings_inline_card_free_cta);
        activity.getString(R.string.settings_inline_card_nuod_cta);
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f222568a) {
            case 11:
                return kkc0.m56700m0(kkc0.m56700m0((LinkedHashMap) this.f222569b, (Map) obj), (Map) obj2);
            default:
                gav0 gav0Var = (gav0) obj2;
                Map mapM56696i0 = ((iav0) obj).f100351a;
                mav0 mav0Var = (mav0) this.f222569b;
                Scheduler scheduler = mav0Var.f141691e;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (gav0Var instanceof dav0) {
                    scheduler.mo23384c(new lav0(mav0Var, 0));
                    mapM56696i0 = kkc0.m56701n0(mapM56696i0, new pqm0(((dav0) gav0Var).f47113a, Long.valueOf(jElapsedRealtime)));
                } else if (gav0Var instanceof fav0) {
                    scheduler.mo23384c(new lav0(mav0Var, 1));
                    mapM56696i0 = kkc0.m56696i0(((fav0) gav0Var).f67642a, mapM56696i0);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapM56696i0.entrySet()) {
                    if (((Number) entry.getValue()).longValue() + 10000 > jElapsedRealtime) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return new iav0(linkedHashMap);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f222568a) {
            case 3:
                p8p0 p8p0Var = ((q0p0) this.f222569b).f184055t;
                wj50.m88279p(p8p0Var);
                return p8p0Var.mo48412a((h8p0) obj);
            case 5:
                Long l = (Long) ((xul0) obj).mo49283h();
                if (l != null) {
                    PlayerState playerState = (PlayerState) this.f222569b;
                    return new djf((int) (l.longValue() / 1000), (int) (((Number) playerState.duration().mo49280e(-1000L)).longValue() / 1000));
                }
                return cjf.f38572a;
            case 7:
                String str = (String) obj;
                nop0 nop0Var = (nop0) this.f222569b;
                g231 g231Var = nop0Var.f156774a;
                wj50.m88279p(str);
                return g231Var.m43370a(str).flatMapObservable(new d2j0(25, nop0Var, str));
            case 8:
                if (((Boolean) obj).booleanValue()) {
                    return new nx20((ehv) ((lqk0) this.f222569b).f136080d.getValue());
                }
                return yby.f271310f;
            case 9:
                zaq0 zaq0Var = (zaq0) this.f222569b;
                if (((Boolean) obj).booleanValue()) {
                    return vjf1.m85770t(dau.f47107a, new onm0(zaq0Var, (fbk) null, 22));
                }
                l470 l470Var = zaq0Var.f281105b.f56019a;
                ppj0 ppj0VarM12095p = NotEmpty.m12095p();
                ppj0VarM12095p.m70595m();
                return l470Var.m58120e((NotEmpty) ppj0VarM12095p.build()).map(zzx.f288149h);
            case 12:
                Observable observable = (Observable) obj;
                Single singleSingleOrError = observable.take(1L).singleOrError();
                oxe oxeVar = (oxe) this.f222569b;
                return singleSingleOrError.doOnSubscribe(new qmx(oxeVar, 22)).doOnSuccess(new o4n0(oxeVar, 19)).flatMapObservable(new r9p0(observable));
            case 13:
                return ((vsk) this.f222569b).m86360c(((lrr0) obj).f136353f).map(vnq0.f243217c).map(wnq0.f253256c).onErrorReturn(koq0.f124892c);
            case 15:
                return ((vsk) ((cxq0) this.f222569b).f43080b).m86360c(((e301) obj).f55571a).map(alr0.f16967c);
            case 21:
                fmt0 fmt0Var = (fmt0) obj;
                return ((jpx) ((wnt0) this.f222569b).f253294i).m53978b(new C1668ai("queue", false, (gh00) new snt0(fmt0Var, 0))).filter(pnq0.f179505e).take(1L).map(new ezk0(fmt0Var, 28)).onErrorReturn(new k4k0(fmt0Var, 29));
            case 23:
                ((xlt0) ((w9r0) this.f222569b).f249254d).m91442a(false);
                return w2a1.f247311a;
            case 26:
                p2x0 p2x0Var = (p2x0) obj;
                ono0 ono0Var = new ono0((j5v0) this.f222569b, 9);
                if (p2x0Var instanceof k2x0) {
                    ono0Var.invoke(((k2x0) p2x0Var).f118699a);
                    return Boolean.FALSE;
                }
                if (p2x0Var instanceof m2x0) {
                    return Boolean.TRUE;
                }
                throw new NoWhenBranchMatchedException();
            default:
                String str2 = (String) obj;
                etz etzVar = (etz) ((kz5) this.f222569b).f128014d;
                wj50.m88279p(str2);
                return etzVar.m40004y(str2).m23307y();
        }
    }
}
