package p204p;

import com.spotify.player.esperanto.proto.EsContextPlayerOptions$ContextPlayerOptionOverrides;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions$PreparePlayOptions;
import com.spotify.player.esperanto.proto.EsSkipToTrack$SkipToTrack;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class fo31 implements f7p0 {

    /* JADX INFO: renamed from: a */
    public final xre f71415a;

    /* JADX INFO: renamed from: b */
    public final hrw f71416b;

    /* JADX INFO: renamed from: c */
    public final nbm0 f71417c;

    /* JADX INFO: renamed from: d */
    public final wt80 f71418d;

    /* JADX INFO: renamed from: e */
    public final luk f71419e;

    /* JADX INFO: renamed from: f */
    public final rf50 f71420f;

    /* JADX INFO: renamed from: g */
    public final mto0 f71421g;

    /* JADX INFO: renamed from: h */
    public final hc80 f71422h;

    /* JADX INFO: renamed from: i */
    public final String f71423i;

    /* JADX INFO: renamed from: j */
    public final s7p0 f71424j;

    /* JADX INFO: renamed from: k */
    public final st91 f71425k;

    /* JADX INFO: renamed from: l */
    public final nuu0 f71426l;

    /* JADX INFO: renamed from: m */
    public final co31 f71427m;

    /* JADX INFO: renamed from: n */
    public final co31 f71428n;

    /* JADX INFO: renamed from: o */
    public final ysk f71429o;

    public fo31(jdp0 jdp0Var, xre xreVar, hrw hrwVar, nbm0 nbm0Var, wt80 wt80Var, luk lukVar, rf50 rf50Var, mto0 mto0Var, hc80 hc80Var, String str, s7p0 s7p0Var, st91 st91Var) {
        this.f71415a = xreVar;
        this.f71416b = hrwVar;
        this.f71417c = nbm0Var;
        this.f71418d = wt80Var;
        this.f71419e = lukVar;
        this.f71420f = rf50Var;
        this.f71421g = mto0Var;
        this.f71422h = hc80Var;
        this.f71423i = str;
        this.f71424j = s7p0Var;
        this.f71425k = st91Var;
        Flowable flowableMo53041b = jdp0Var.mo53041b();
        d0k[] d0kVarArr = bmu0.f28619a;
        nuu0 nuu0VarM31029u = bzf1.m31029u(new onc(flowableMo53041b), n5h1.m63737m(hc80Var), hf11.f90582b, PlayerState.builder().build());
        this.f71426l = nuu0VarM31029u;
        this.f71427m = new co31(nuu0VarM31029u, this, 0);
        this.f71428n = new co31(nuu0VarM31029u, this, 1);
        this.f71429o = new ysk(Boolean.FALSE, 27);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (p204p.x0h1.m89557A(r10.f71419e, r11, r6) == r7) goto L24;
     */
    @Override // p204p.f7p0
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo40981a(d850 d850Var, fbk fbkVar) {
        eo31 eo31Var;
        long jCurrentTimeMillis;
        z650 z650Var;
        PlayerState playerState;
        long j;
        boolean zM42261c;
        hrw hrwVar;
        Object objM42263e;
        if (fbkVar instanceof eo31) {
            eo31Var = (eo31) fbkVar;
            int i = eo31Var.f61289e;
            if ((i & Integer.MIN_VALUE) != 0) {
                eo31Var.f61289e = i - Integer.MIN_VALUE;
            } else {
                eo31Var = new eo31(this, (ibk) fbkVar);
            }
        } else {
            eo31Var = new eo31(this, (ibk) fbkVar);
        }
        eo31 eo31Var2 = eo31Var;
        Object objM86755t = eo31Var2.f61287c;
        int i2 = eo31Var2.f61289e;
        boolean z = true;
        fbk fbkVar2 = null;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            ((wy3) this.f71415a).getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
            z650Var = d850Var.f46380a;
            if (this.f71421g == mto0.f147119d) {
                r611 r611Var = new r611(this, fbkVar2, 4);
                eo31Var2.f61285a = null;
                eo31Var2.f61286b = jCurrentTimeMillis;
                eo31Var2.f61289e = 1;
            } else {
                eo31Var2.f61285a = z650Var;
                eo31Var2.f61286b = jCurrentTimeMillis;
                eo31Var2.f61289e = 2;
                objM86755t = vyf1.m86755t(this.f71426l, eo31Var2);
                if (objM86755t != obj) {
                    playerState = (PlayerState) objM86755t;
                    wj50.m88279p(playerState);
                    if (!wj50.m88271j(playerState.contextUri(), this.f71423i)) {
                        j = jCurrentTimeMillis;
                        zM42261c = m42261c(playerState);
                        hrwVar = this.f71416b;
                        if (zM42261c) {
                            hrwVar.mo48412a(new v7p0(PauseCommand.builder().loggingParams(m42262d(j, z650Var.f279709a)).options(CommandOptions.builder().systemInitiated(false).build()).pauseOrigin(PauseResumeOrigin.builder("song-dna").build()).build())).ignoreElement().subscribe();
                            z = false;
                        } else {
                            hrwVar.mo48412a(new y7p0(ResumeCommand.builder().loggingParams(m42262d(j, z650Var.f279709a)).options(CommandOptions.builder().systemInitiated(false).build()).resumeOrigin(PauseResumeOrigin.builder("song-dna").build()).build())).ignoreElement().subscribe();
                        }
                        return Boolean.valueOf(z);
                    }
                    eo31Var2.f61285a = null;
                    eo31Var2.f61286b = jCurrentTimeMillis;
                    eo31Var2.f61289e = 3;
                    objM42263e = m42263e(this.f71423i, z650Var, jCurrentTimeMillis, eo31Var2);
                    if (objM42263e == obj) {
                        return objM42263e;
                    }
                }
            }
        } else {
            if (i2 == 1) {
                bga.m29073P(objM86755t);
                return Boolean.FALSE;
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM86755t);
                return objM86755t;
            }
            jCurrentTimeMillis = eo31Var2.f61286b;
            z650Var = eo31Var2.f61285a;
            bga.m29073P(objM86755t);
            playerState = (PlayerState) objM86755t;
            wj50.m88279p(playerState);
            if (!wj50.m88271j(playerState.contextUri(), this.f71423i)) {
                j = jCurrentTimeMillis;
                zM42261c = m42261c(playerState);
                hrwVar = this.f71416b;
                if (zM42261c) {
                    hrwVar.mo48412a(new v7p0(PauseCommand.builder().loggingParams(m42262d(j, z650Var.f279709a)).options(CommandOptions.builder().systemInitiated(false).build()).pauseOrigin(PauseResumeOrigin.builder("song-dna").build()).build())).ignoreElement().subscribe();
                    z = false;
                } else {
                    hrwVar.mo48412a(new y7p0(ResumeCommand.builder().loggingParams(m42262d(j, z650Var.f279709a)).options(CommandOptions.builder().systemInitiated(false).build()).resumeOrigin(PauseResumeOrigin.builder("song-dna").build()).build())).ignoreElement().subscribe();
                }
                return Boolean.valueOf(z);
            }
            eo31Var2.f61285a = null;
            eo31Var2.f61286b = jCurrentTimeMillis;
            eo31Var2.f61289e = 3;
            objM42263e = m42263e(this.f71423i, z650Var, jCurrentTimeMillis, eo31Var2);
            if (objM42263e == obj) {
                return objM42263e;
            }
        }
        return obj;
    }

    @Override // p204p.f7p0
    /* JADX INFO: renamed from: b */
    public final fiz mo40982b() {
        return this.f71429o;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m42261c(PlayerState playerState) {
        String strUri;
        String strContextUri = playerState.contextUri();
        String str = this.f71423i;
        if (!wj50.m88271j(strContextUri, str)) {
            return false;
        }
        ContextTrack contextTrack = (ContextTrack) playerState.track().mo49283h();
        if (contextTrack == null || (strUri = contextTrack.uri()) == null) {
            strUri = "";
        }
        return strUri.equals(str) && !playerState.isPaused() && playerState.isPlaying();
    }

    /* JADX INFO: renamed from: d */
    public final LoggingParams m42262d(long j, String str) {
        String str2;
        LoggingParams.Builder builder = LoggingParams.builder();
        String str3 = "unknown";
        if (str == null) {
            str = "unknown";
        }
        LoggingParams.Builder builderCommandInitiatedTime = builder.interactionId(str).commandInitiatedTime(Long.valueOf(j));
        kbm0 kbm0Var = this.f71417c.get();
        if (kbm0Var != null && (str2 = kbm0Var.f121231a) != null) {
            str3 = str2;
        }
        return builderCommandInitiatedTime.pageInstanceId(str3).build();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: e */
    public final Object m42263e(String str, z650 z650Var, long j, ibk ibkVar) {
        zn31 zn31Var;
        if (ibkVar instanceof zn31) {
            zn31Var = (zn31) ibkVar;
            int i = zn31Var.f284401c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zn31Var.f284401c = i - Integer.MIN_VALUE;
            } else {
                zn31Var = new zn31(this, ibkVar);
            }
        } else {
            zn31Var = new zn31(this, ibkVar);
        }
        zn31 zn31Var2 = zn31Var;
        Object objM88912b = zn31Var2.f284399a;
        int i2 = zn31Var2.f284401c;
        if (i2 == 0) {
            bga.m29073P(objM88912b);
            st80 st80Var = new st80(PlaylistRequestDecorationPolicy.m18420r(), null, null, false, null, a5u0.f12598a, null, 0, null, 478);
            dnw dnwVarM17804F = EsPlayOrigin$PlayOrigin.m17804F();
            dnwVarM17804F.m36494s("song-dna");
            dnwVarM17804F.m36496u(this.f71424j.f206454a);
            dnwVarM17804F.m36498w(str + ":dna");
            EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin = (EsPlayOrigin$PlayOrigin) dnwVarM17804F.build();
            Map mapSingletonMap = Collections.singletonMap(Context.Metadata.KEY_FORMAT_LIST_TYPE, "track");
            ilw ilwVarM17768t = EsLoggingParams$LoggingParams.m17768t();
            kbm0 kbm0Var = this.f71417c.get();
            String str2 = kbm0Var != null ? kbm0Var.f121231a : null;
            if (str2 == null) {
                str2 = "";
            }
            ilwVarM17768t.m51044q(str2);
            String str3 = z650Var != null ? z650Var.f279709a : null;
            ilwVarM17768t.m51043m(str3 != null ? str3 : "");
            umw umwVarM17777q = EsOptional$OptionalInt64.m17777q();
            umwVarM17777q.m83492m(j);
            ilwVarM17768t.m51046s((EsOptional$OptionalInt64) umwVarM17777q.build());
            EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = (EsLoggingParams$LoggingParams) ilwVarM17768t.build();
            onw onwVarM17830E = EsPreparePlayOptions$PreparePlayOptions.m17830E();
            xow xowVarM18009u = EsSkipToTrack$SkipToTrack.m18009u();
            xowVarM18009u.m91569t(str);
            onwVarM17830E.m67427C((EsSkipToTrack$SkipToTrack) xowVarM18009u.build());
            njw njwVarM17688r = EsContextPlayerOptions$ContextPlayerOptionOverrides.m17688r();
            njwVarM17688r.m64640q("media", "audio");
            onwVarM17830E.m67438x((EsContextPlayerOptions$ContextPlayerOptionOverrides) njwVarM17688r.build());
            EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions = (EsPreparePlayOptions$PreparePlayOptions) onwVarM17830E.build();
            zn31Var2.f284401c = 1;
            objM88912b = wt80.m88912b(this.f71418d, str, st80Var, esPreparePlayOptions$PreparePlayOptions, esPlayOrigin$PlayOrigin, null, mapSingletonMap, esLoggingParams$LoggingParams, null, zn31Var2, 144);
            yuk yukVar = yuk.f276404a;
            if (objM88912b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM88912b);
        }
        return Boolean.valueOf(((p2x0) objM88912b).m68970c() != null);
    }

    @Override // p204p.f7p0
    /* JADX INFO: renamed from: i */
    public final fiz mo40983i() {
        return this.f71428n;
    }

    @Override // p204p.f7p0
    public final fiz isActive() {
        return this.f71427m;
    }
}
