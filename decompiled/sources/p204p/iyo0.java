package p204p;

import com.spotify.player.esperanto.proto.EsContextPlayerOptions$ContextPlayerOptionOverrides;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsOptional$OptionalBoolean;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import com.spotify.player.esperanto.proto.EsPlayOptions$PlayOptions;
import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions$PreparePlayOptions;
import com.spotify.player.esperanto.proto.EsSkipToTrack$SkipToTrack;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class iyo0 implements th00 {

    /* JADX INFO: renamed from: a */
    public final wt80 f107029a;

    /* JADX INFO: renamed from: b */
    public final dcm0 f107030b;

    /* JADX INFO: renamed from: c */
    public final nbm0 f107031c;

    /* JADX INFO: renamed from: d */
    public final Flowable f107032d;

    /* JADX INFO: renamed from: e */
    public final wf4 f107033e;

    /* JADX INFO: renamed from: f */
    public final qnk f107034f;

    /* JADX INFO: renamed from: g */
    public final wg61 f107035g = new wg61(new fyo0(this, 0));

    public iyo0(wt80 wt80Var, xre xreVar, dcm0 dcm0Var, nbm0 nbm0Var, Flowable flowable, wf4 wf4Var, qnk qnkVar) {
        this.f107029a = wt80Var;
        this.f107030b = dcm0Var;
        this.f107031c = nbm0Var;
        this.f107032d = flowable;
        this.f107033e = wf4Var;
        this.f107034f = qnkVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x023a, code lost:
    
        if (p204p.wt80.m88912b(r23.f107029a, r5, null, r6, r8, r9, r10, r11, null, r13, 130) == r15) goto L82;
     */
    @Override // p204p.th00
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(wtc0 wtc0Var, fbk fbkVar) {
        eyo0 eyo0Var;
        String str;
        String str2;
        Long l;
        r891 r891Var;
        roy0 roy0Var;
        List list;
        aho0 aho0VarM76090a;
        EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions;
        EsPlayOptions$PlayOptions esPlayOptions$PlayOptions;
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams;
        Map map;
        EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions2;
        EsPlayOptions$PlayOptions esPlayOptions$PlayOptions2;
        Map map2;
        wtc0 wtc0Var2 = wtc0Var;
        if (fbkVar instanceof eyo0) {
            eyo0Var = (eyo0) fbkVar;
            int i = eyo0Var.f64139t;
            if ((i & Integer.MIN_VALUE) != 0) {
                eyo0Var.f64139t = i - Integer.MIN_VALUE;
            } else {
                eyo0Var = new eyo0(this, fbkVar);
            }
        } else {
            eyo0Var = new eyo0(this, fbkVar);
        }
        eyo0 eyo0Var2 = eyo0Var;
        Object obj = eyo0Var2.f64137h;
        int i2 = eyo0Var2.f64139t;
        Object obj2 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            str = wtc0Var2.f254911a;
            str2 = wtc0Var2.f254912b;
            l = wtc0Var2.f254914d;
            r891Var = wtc0Var2.f254917g;
            List list2 = wtc0Var2.f254918h;
            eyo0Var2.f64130a = wtc0Var2;
            roy0Var = roy0.f201375a;
            eyo0Var2.f64131b = roy0Var;
            eyo0Var2.f64132c = str;
            eyo0Var2.f64133d = str2;
            eyo0Var2.f64134e = l;
            eyo0Var2.f64135f = r891Var;
            eyo0Var2.f64136g = list2;
            eyo0Var2.f64139t = 1;
            Object objM51950e = m51950e(eyo0Var2);
            if (objM51950e != obj2) {
                list = list2;
                obj = objM51950e;
            }
            return obj2;
        }
        if (i2 == 1) {
            List list3 = (List) eyo0Var2.f64136g;
            r891Var = eyo0Var2.f64135f;
            l = (Long) eyo0Var2.f64134e;
            str2 = (String) eyo0Var2.f64133d;
            str = (String) eyo0Var2.f64132c;
            roy0Var = (roy0) eyo0Var2.f64131b;
            wtc0 wtc0Var3 = eyo0Var2.f64130a;
            bga.m29073P(obj);
            list = list3;
            wtc0Var2 = wtc0Var3;
        } else if (i2 == 2) {
            esLoggingParams$LoggingParams = (EsLoggingParams$LoggingParams) eyo0Var2.f64136g;
            esPlayOptions$PlayOptions2 = (EsPlayOptions$PlayOptions) eyo0Var2.f64134e;
            esPreparePlayOptions$PreparePlayOptions2 = (EsPreparePlayOptions$PreparePlayOptions) eyo0Var2.f64133d;
            map2 = (Map) eyo0Var2.f64132c;
            aho0VarM76090a = (aho0) eyo0Var2.f64131b;
            bga.m29073P(obj);
            esPlayOptions$PlayOptions = esPlayOptions$PlayOptions2;
            map = map2;
            esPreparePlayOptions$PreparePlayOptions = esPreparePlayOptions$PreparePlayOptions2;
            EsLoggingParams$LoggingParams esLoggingParams$LoggingParams2 = esLoggingParams$LoggingParams;
            String contextUri = aho0VarM76090a.getContextUri();
            EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin = (EsPlayOrigin$PlayOrigin) this.f107035g.getValue();
            wj50.m88279p(esLoggingParams$LoggingParams2);
            eyo0Var2.f64130a = null;
            eyo0Var2.f64131b = null;
            eyo0Var2.f64132c = null;
            eyo0Var2.f64133d = null;
            eyo0Var2.f64134e = null;
            eyo0Var2.f64135f = null;
            eyo0Var2.f64136g = null;
            eyo0Var2.f64139t = 3;
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
        r891 r891Var2 = r891Var;
        Long l2 = l;
        String str3 = str2;
        String str4 = str;
        boolean zM87939J = this.f107033e.m87939J();
        roy0Var.getClass();
        aho0VarM76090a = roy0.m76090a(str4, str3, l2, r891Var2, list, (String) obj, zM87939J);
        mec0 mec0Var = new mec0();
        mec0Var.put("agentic_product_type", "martini");
        String str5 = wtc0Var2.f254915e;
        String str6 = wtc0Var2.f254919i;
        if (str5 != null && !wl51.m88460J0(str5)) {
            mec0Var.put("martini_conversation_id", str5);
        }
        if (str6 != null && !wl51.m88460J0(str6)) {
            mec0Var.put("play_context_decision_id", str6);
        }
        mec0 mec0VarM61540b = mec0Var.m61540b();
        String str7 = wtc0Var2.f254913c;
        int i3 = wtc0Var2.f254920j;
        onw onwVarM17830E = EsPreparePlayOptions$PreparePlayOptions.m17830E();
        if (aho0VarM76090a instanceof sgo0) {
            if (str7 != null) {
                xow xowVarM18009u = EsSkipToTrack$SkipToTrack.m18009u();
                xowVarM18009u.m91568s(str7);
                onwVarM17830E.m67427C((EsSkipToTrack$SkipToTrack) xowVarM18009u.build());
            } else {
                sgo0 sgo0Var = (sgo0) aho0VarM76090a;
                String str8 = sgo0Var.f208915b;
                if (str8 != null && !str8.equals(sgo0Var.f208914a)) {
                    xow xowVarM18009u2 = EsSkipToTrack$SkipToTrack.m18009u();
                    xowVarM18009u2.m91569t(str8);
                    onwVarM17830E.m67427C((EsSkipToTrack$SkipToTrack) xowVarM18009u2.build());
                }
            }
            Long l3 = ((sgo0) aho0VarM76090a).f208916c;
            if (l3 != null) {
                onwVarM17830E.m67425A(String.valueOf(l3.longValue()));
            }
        } else {
            if (!(aho0VarM76090a instanceof wgo0)) {
                throw new NoWhenBranchMatchedException();
            }
            xow xowVarM18009u3 = EsSkipToTrack$SkipToTrack.m18009u();
            xowVarM18009u3.m91569t(((wgo0) aho0VarM76090a).f251119b);
            onwVarM17830E.m67427C((EsSkipToTrack$SkipToTrack) xowVarM18009u3.build());
        }
        if (i3 != 0) {
            njw njwVarM17688r = EsContextPlayerOptions$ContextPlayerOptionOverrides.m17688r();
            tmw tmwVarM17771o = EsOptional$OptionalBoolean.m17771o();
            tmwVarM17771o.m81146m(i3 == 2);
            njwVarM17688r.m64643t((EsOptional$OptionalBoolean) tmwVarM17771o.build());
            onwVarM17830E.m67438x((EsContextPlayerOptions$ContextPlayerOptionOverrides) njwVarM17688r.build());
        }
        esPreparePlayOptions$PreparePlayOptions = (EsPreparePlayOptions$PreparePlayOptions) onwVarM17830E.build();
        anw anwVarM17803s = EsPlayOptions$PlayOptions.m17803s();
        if (aho0VarM76090a instanceof wgo0) {
            anwVarM17803s.m26537r(cnw.ADVANCED_PAST_TRACK);
        }
        esPlayOptions$PlayOptions = (EsPlayOptions$PlayOptions) anwVarM17803s.build();
        String str9 = wtc0Var2.f254916f;
        if (str9 == null) {
            str9 = "martini-chat-autoplay";
        }
        ilw ilwVarM17768t = EsLoggingParams$LoggingParams.m17768t();
        ilwVarM17768t.m51043m(str9);
        kbm0 kbm0Var = this.f107031c.get();
        String str10 = kbm0Var != null ? kbm0Var.f121231a : null;
        if (str10 == null) {
            str10 = "";
        }
        ilwVarM17768t.m51044q(str10);
        umw umwVarM17777q = EsOptional$OptionalInt64.m17777q();
        umwVarM17777q.m83492m(System.currentTimeMillis());
        ilwVarM17768t.m51047t(umwVarM17777q);
        esLoggingParams$LoggingParams = (EsLoggingParams$LoggingParams) ilwVarM17768t.build();
        if (str5 == null || wl51.m88460J0(str5)) {
            map = mec0VarM61540b;
            EsLoggingParams$LoggingParams esLoggingParams$LoggingParams3 = esLoggingParams$LoggingParams;
            String contextUri2 = aho0VarM76090a.getContextUri();
            EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin2 = (EsPlayOrigin$PlayOrigin) this.f107035g.getValue();
            wj50.m88279p(esLoggingParams$LoggingParams3);
            eyo0Var2.f64130a = null;
            eyo0Var2.f64131b = null;
            eyo0Var2.f64132c = null;
            eyo0Var2.f64133d = null;
            eyo0Var2.f64134e = null;
            eyo0Var2.f64135f = null;
            eyo0Var2.f64136g = null;
            eyo0Var2.f64139t = 3;
        } else {
            eyo0Var2.f64130a = null;
            eyo0Var2.f64131b = aho0VarM76090a;
            eyo0Var2.f64132c = mec0VarM61540b;
            eyo0Var2.f64133d = esPreparePlayOptions$PreparePlayOptions;
            eyo0Var2.f64134e = esPlayOptions$PlayOptions;
            eyo0Var2.f64135f = null;
            eyo0Var2.f64136g = esLoggingParams$LoggingParams;
            eyo0Var2.f64139t = 2;
            if (((bpk) this.f107034f).m30128C(str5, eyo0Var2) != obj2) {
                esPreparePlayOptions$PreparePlayOptions2 = esPreparePlayOptions$PreparePlayOptions;
                esPlayOptions$PlayOptions2 = esPlayOptions$PlayOptions;
                map2 = mec0VarM61540b;
                esPlayOptions$PlayOptions = esPlayOptions$PlayOptions2;
                map = map2;
                esPreparePlayOptions$PreparePlayOptions = esPreparePlayOptions$PreparePlayOptions2;
                EsLoggingParams$LoggingParams esLoggingParams$LoggingParams4 = esLoggingParams$LoggingParams;
                String contextUri3 = aho0VarM76090a.getContextUri();
                EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin3 = (EsPlayOrigin$PlayOrigin) this.f107035g.getValue();
                wj50.m88279p(esLoggingParams$LoggingParams4);
                eyo0Var2.f64130a = null;
                eyo0Var2.f64131b = null;
                eyo0Var2.f64132c = null;
                eyo0Var2.f64133d = null;
                eyo0Var2.f64134e = null;
                eyo0Var2.f64135f = null;
                eyo0Var2.f64136g = null;
                eyo0Var2.f64139t = 3;
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m51950e(ibk ibkVar) {
        gyo0 gyo0Var;
        xul0 xul0VarTrack;
        ContextTrack contextTrack;
        if (ibkVar instanceof gyo0) {
            gyo0Var = (gyo0) ibkVar;
            int i = gyo0Var.f85684c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gyo0Var.f85684c = i - Integer.MIN_VALUE;
            } else {
                gyo0Var = new gyo0(this, ibkVar);
            }
        } else {
            gyo0Var = new gyo0(this, ibkVar);
        }
        Object objM76980u = gyo0Var.f85682a;
        int i2 = gyo0Var.f85684c;
        fbk fbkVar = null;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76980u);
                onm0 onm0Var = new onm0(this, fbkVar, 12);
                gyo0Var.f85684c = 1;
                objM76980u = s1h1.m76980u(500L, onm0Var, gyo0Var);
                yuk yukVar = yuk.f276404a;
                if (objM76980u == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM76980u);
            }
            PlayerState playerState = (PlayerState) objM76980u;
            if (playerState != null && (xul0VarTrack = playerState.track()) != null && (contextTrack = (ContextTrack) xul0VarTrack.mo49283h()) != null) {
                return contextTrack.uri();
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return null;
    }
}
