package p204p;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayOptions;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class wxx {

    /* JADX INFO: renamed from: m */
    public static final Set f256140m = s601.m77310m0(gn80.ALBUM, gn80.LOCAL_FILES_ROOT);

    /* JADX INFO: renamed from: n */
    public static final Set f256141n = s601.m77310m0(us80.f233558a, zs80.f285887a, at80.f19613a, ys80.f275721a);

    /* JADX INFO: renamed from: o */
    public static final pt80 f256142o = pt80.f181071a;

    /* JADX INFO: renamed from: p */
    public static final Set f256143p = s601.m77310m0(gn80.TRACK, gn80.SHOW_EPISODE, gn80.PODCAST_CHAPTER, gn80.CLIP);

    /* JADX INFO: renamed from: a */
    public final qwx0 f256144a;

    /* JADX INFO: renamed from: b */
    public final luv0 f256145b;

    /* JADX INFO: renamed from: c */
    public final wt80 f256146c;

    /* JADX INFO: renamed from: d */
    public final scn f256147d;

    /* JADX INFO: renamed from: e */
    public final q490 f256148e;

    /* JADX INFO: renamed from: f */
    public final Observable f256149f;

    /* JADX INFO: renamed from: g */
    public final PlaylistRequestDecorationPolicy f256150g;

    /* JADX INFO: renamed from: h */
    public final mcu0 f256151h;

    /* JADX INFO: renamed from: i */
    public final luk f256152i;

    /* JADX INFO: renamed from: j */
    public final Flowable f256153j;

    /* JADX INFO: renamed from: k */
    public final epx f256154k;

    /* JADX INFO: renamed from: l */
    public final wg61 f256155l = new wg61(new zyv(this, 22));

    public wxx(qwx0 qwx0Var, luv0 luv0Var, wt80 wt80Var, mi80 mi80Var, ure ureVar, scn scnVar, q490 q490Var, Observable observable, PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy, xre xreVar, mcu0 mcu0Var, luk lukVar, Flowable flowable, epx epxVar) {
        this.f256144a = qwx0Var;
        this.f256145b = luv0Var;
        this.f256146c = wt80Var;
        this.f256147d = scnVar;
        this.f256148e = q490Var;
        this.f256149f = observable;
        this.f256150g = playlistRequestDecorationPolicy;
        this.f256151h = mcu0Var;
        this.f256152i = lukVar;
        this.f256153j = flowable;
        this.f256154k = epxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r13 == r4) goto L21;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable m89329a(wxx wxxVar, String str, ibk ibkVar) {
        qxx qxxVar;
        if (ibkVar instanceof qxx) {
            qxxVar = (qxx) ibkVar;
            int i = qxxVar.f193761d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qxxVar.f193761d = i - Integer.MIN_VALUE;
            } else {
                qxxVar = new qxx(wxxVar, ibkVar);
            }
        } else {
            qxxVar = new qxx(wxxVar, ibkVar);
        }
        Object objM96567o = qxxVar.f193759b;
        int i2 = qxxVar.f193761d;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            Single singleFirstOrError = wxxVar.f256149f.firstOrError();
            qxxVar.f193758a = str;
            qxxVar.f193761d = 1;
            objM96567o = zn91.m96567o(singleFirstOrError, qxxVar);
            if (objM96567o != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            str = qxxVar.f193758a;
            bga.m29073P(objM96567o);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        i490 i490Var = (i490) objM96567o;
        return new pqm0(new st80(wxxVar.f256150g, i490Var, f256141n, false, f256142o, a5u0.f12598a, null, 0, null, 448), i490Var);
        u490 u490VarMo44949a = wxxVar.f256148e.mo44949a((String) objM96567o);
        qxxVar.f193758a = null;
        qxxVar.f193761d = 2;
        objM96567o = u490VarMo44949a.m82316a(str, qxxVar);
    }

    /* JADX INFO: renamed from: b */
    public static final Single m89330b(wxx wxxVar, PlayOrigin playOrigin, LoggingParams loggingParams, Map map, String str, PreparePlayOptions preparePlayOptions) {
        Context.Builder builder = Context.fromUri(str).toBuilder();
        if (map != null) {
            builder.metadata((Map<String, String>) map);
        }
        PlayCommand.Builder builderLoggingParams = PlayCommand.builder(builder.build(), playOrigin).loggingParams(loggingParams);
        if (preparePlayOptions != null) {
            builderLoggingParams.options(preparePlayOptions);
        }
        return ((uqw) wxxVar.f256155l.getValue()).m83821a(builderLoggingParams.build());
    }

    /* JADX INFO: renamed from: d */
    public static Single m89331d(wxx wxxVar, PlayOrigin playOrigin, LoggingParams loggingParams, Map map, String str, PreparePlayOptions preparePlayOptions) {
        return ((rwx0) wxxVar.f256144a).f203428a.firstOrError().flatMap(new vxx(wxxVar, str, preparePlayOptions, map, loggingParams, playOrigin, (PlayOptions) null));
    }

    /* JADX INFO: renamed from: e */
    public static PlayerOptionOverrides m89332e(PreparePlayOptions preparePlayOptions, boolean z, boolean z2) {
        PlayerOptionOverrides.Builder builder;
        xul0 xul0VarPlayerOptionsOverride;
        PlayerOptionOverrides playerOptionOverrides;
        xul0 xul0VarRepeatingContext;
        xul0 xul0VarPlayerOptionsOverride2;
        PlayerOptionOverrides playerOptionOverrides2;
        xul0 xul0VarShufflingContext;
        xul0 xul0VarPlayerOptionsOverride3;
        PlayerOptionOverrides playerOptionOverrides3;
        if (preparePlayOptions == null || (xul0VarPlayerOptionsOverride3 = preparePlayOptions.playerOptionsOverride()) == null || (playerOptionOverrides3 = (PlayerOptionOverrides) xul0VarPlayerOptionsOverride3.mo49283h()) == null || (builder = playerOptionOverrides3.toBuilder()) == null) {
            builder = PlayerOptionOverrides.builder();
        }
        if (z2) {
            builder.shufflingContext(Boolean.FALSE);
        } else if (!z) {
            boolean zM88271j = false;
            if ((preparePlayOptions == null || (xul0VarPlayerOptionsOverride2 = preparePlayOptions.playerOptionsOverride()) == null || (playerOptionOverrides2 = (PlayerOptionOverrides) xul0VarPlayerOptionsOverride2.mo49283h()) == null || (xul0VarShufflingContext = playerOptionOverrides2.shufflingContext()) == null) ? false : wj50.m88271j(xul0VarShufflingContext.mo49283h(), Boolean.FALSE)) {
                builder = PlayerOptionOverrides.builder();
                if (preparePlayOptions != null && (xul0VarPlayerOptionsOverride = preparePlayOptions.playerOptionsOverride()) != null && (playerOptionOverrides = (PlayerOptionOverrides) xul0VarPlayerOptionsOverride.mo49283h()) != null && (xul0VarRepeatingContext = playerOptionOverrides.repeatingContext()) != null) {
                    zM88271j = wj50.m88271j(xul0VarRepeatingContext.mo49283h(), Boolean.TRUE);
                }
                if (zM88271j) {
                    builder.repeatingContext(Boolean.TRUE);
                }
            }
        }
        return builder.build();
    }

    /* JADX INFO: renamed from: c */
    public final Single m89333c(String str, PreparePlayOptions preparePlayOptions, PlayOrigin playOrigin, LoggingParams loggingParams, Map map) {
        Single singleJust;
        Set set = dd41.f47702f;
        dd41 dd41VarM74726U = r46.m74726U(str);
        gn80 gn80Var = dd41VarM74726U.f47709c;
        if (gn80Var == gn80.ARTIST) {
            singleJust = this.f256151h.m61498e().take(1L).singleOrError().map(new nch1(dd41VarM74726U.m35710h(), 6));
        } else if (gn80Var == gn80.COLLECTION_ARTIST) {
            singleJust = Single.just("spotify:list:liked-songs-artist:".concat(dd41VarM74726U.m35710h()));
        } else {
            singleJust = gn80Var == gn80.COLLECTION_PODCASTS_EPISODES ? Single.just("spotify:list:whats-new:podcasts") : Single.just(str);
        }
        return singleJust.flatMap(new txx(this, str, preparePlayOptions, playOrigin, loggingParams, map, 0));
    }
}
