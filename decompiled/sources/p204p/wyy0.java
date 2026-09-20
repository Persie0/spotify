package p204p;

import com.spotify.player.esperanto.proto.EsContextPlayerOptions$ContextPlayerOptionOverrides;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions$PreparePlayOptions;
import com.spotify.player.esperanto.proto.EsSkipToTrack$SkipToTrack;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class wyy0 {

    /* JADX INFO: renamed from: a */
    public final uqw f256401a;

    /* JADX INFO: renamed from: b */
    public final PlayOrigin f256402b;

    /* JADX INFO: renamed from: c */
    public final scm0 f256403c;

    /* JADX INFO: renamed from: d */
    public final lwr f256404d;

    /* JADX INFO: renamed from: e */
    public final gap0 f256405e;

    /* JADX INFO: renamed from: f */
    public final y64 f256406f;

    /* JADX INFO: renamed from: g */
    public final wt80 f256407g;

    /* JADX INFO: renamed from: h */
    public final tk11 f256408h;

    /* JADX INFO: renamed from: i */
    public final bho0 f256409i = new bho0(m89385b());

    public wyy0(uqw uqwVar, p8p0 p8p0Var, PlayOrigin playOrigin, scm0 scm0Var, lwr lwrVar, gap0 gap0Var, y64 y64Var, ekn eknVar, Scheduler scheduler, wt80 wt80Var, tk11 tk11Var) {
        this.f256401a = uqwVar;
        this.f256402b = playOrigin;
        this.f256403c = scm0Var;
        this.f256404d = lwrVar;
        this.f256405e = gap0Var;
        this.f256406f = y64Var;
        this.f256407g = wt80Var;
        this.f256408h = tk11Var;
        eknVar.m39304a(uqwVar);
    }

    /* JADX INFO: renamed from: a */
    public static final hcf m89383a(wyy0 wyy0Var, Throwable th) {
        na6.m63959g("Cannot start playing from PlayAction", th);
        return new hcf(edb.m38564m("Cannot start playing from PlayAction", th.getLocalizedMessage()));
    }

    /* JADX INFO: renamed from: d */
    public static EsPlayOrigin$PlayOrigin m89384d(PlayOrigin playOrigin) {
        dnw dnwVarM17804F = EsPlayOrigin$PlayOrigin.m17804F();
        dnwVarM17804F.m36494s(playOrigin.featureIdentifier());
        dnwVarM17804F.m36495t(playOrigin.featureVersion());
        dnwVarM17804F.m36498w(playOrigin.viewUri());
        dnwVarM17804F.m36493r(playOrigin.externalReferrer());
        dnwVarM17804F.m36496u(playOrigin.referrerIdentifier());
        dnwVarM17804F.m36492q(playOrigin.deviceIdentifier());
        dnwVarM17804F.m36497v(playOrigin.restrictionIdentifier());
        dnwVarM17804F.m36491m(playOrigin.featureClasses());
        return (EsPlayOrigin$PlayOrigin) dnwVarM17804F.build();
    }

    /* JADX INFO: renamed from: b */
    public final PlayOrigin m89385b() {
        return this.f256402b.toBuilder().viewUri(this.f256403c.m77806a().f197897d).referrerIdentifier("search").build();
    }

    /* JADX INFO: renamed from: c */
    public final PlayCommand m89386c(Context context, d850 d850Var, long j, PreparePlayOptions preparePlayOptions) {
        z650 z650Var;
        PlayCommand.Builder builder = PlayCommand.builder(context, this.f256409i.f27222a);
        LoggingParams.Builder builderCommandInitiatedTime = LoggingParams.builder().commandInitiatedTime(Long.valueOf(j));
        kbm0 kbm0Var = this.f256405e.f78086a.get();
        String str = null;
        String str2 = kbm0Var != null ? kbm0Var.f121231a : null;
        if (str2 == null) {
            str2 = "";
        }
        LoggingParams.Builder builderPageInstanceId = builderCommandInitiatedTime.pageInstanceId(str2);
        if (d850Var != null && (z650Var = d850Var.f46380a) != null) {
            str = z650Var.f279709a;
        }
        return builder.loggingParams(builderPageInstanceId.interactionId(str != null ? str : "").build()).options(preparePlayOptions).playOrigin(m89385b()).build();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: e */
    public final Object m89387e(String str, d850 d850Var, long j, boolean z, ibk ibkVar) {
        uyy0 uyy0Var;
        if (ibkVar instanceof uyy0) {
            uyy0Var = (uyy0) ibkVar;
            int i = uyy0Var.f235386c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uyy0Var.f235386c = i - Integer.MIN_VALUE;
            } else {
                uyy0Var = new uyy0(this, ibkVar);
            }
        } else {
            uyy0Var = new uyy0(this, ibkVar);
        }
        uyy0 uyy0Var2 = uyy0Var;
        Object objM88912b = uyy0Var2.f235384a;
        int i2 = uyy0Var2.f235386c;
        if (i2 == 0) {
            bga.m29073P(objM88912b);
            mec0 mec0Var = new mec0();
            mec0Var.put("pointer.npv_mode", "standalone");
            if (z) {
                mec0Var.put("is_single_track_video_content", "true");
            }
            mec0 mec0VarM61540b = mec0Var.m61540b();
            st80 st80Var = new st80(PlaylistRequestDecorationPolicy.m18420r(), null, null, false, new qt80(bk5.m29624m1(new in80[]{in80.f103929t, in80.f103926g})), a5u0.f12598a, null, 0, null, 462);
            EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOriginM89384d = m89384d(m89385b());
            EsLoggingParams$LoggingParams esLoggingParams$LoggingParamsM44179a = this.f256405e.m44179a(j, d850Var);
            uyy0Var2.f235386c = 1;
            objM88912b = wt80.m88912b(this.f256407g, str, st80Var, null, esPlayOrigin$PlayOriginM89384d, null, mec0VarM61540b, esLoggingParams$LoggingParamsM44179a, null, uyy0Var2, 148);
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

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: f */
    public final Object m89388f(String str, d850 d850Var, long j, boolean z, boolean z2, ibk ibkVar) {
        vyy0 vyy0Var;
        if (ibkVar instanceof vyy0) {
            vyy0Var = (vyy0) ibkVar;
            int i = vyy0Var.f246351c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vyy0Var.f246351c = i - Integer.MIN_VALUE;
            } else {
                vyy0Var = new vyy0(this, ibkVar);
            }
        } else {
            vyy0Var = new vyy0(this, ibkVar);
        }
        vyy0 vyy0Var2 = vyy0Var;
        Object objM88912b = vyy0Var2.f246349a;
        int i2 = vyy0Var2.f246351c;
        if (i2 == 0) {
            bga.m29073P(objM88912b);
            x401 x401Var = new x401();
            x401Var.add(in80.f103923d);
            if (this.f256406f.m92889W()) {
                x401Var.add(in80.f103925f);
            }
            st80 st80Var = new st80(PlaylistRequestDecorationPolicy.m18420r(), null, null, false, new qt80(n0e1.m63425d(x401Var)), a5u0.f12598a, null, 0, null, 462);
            EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOriginM89384d = m89384d(m89385b());
            mec0 mec0Var = new mec0();
            mec0Var.put(Context.Metadata.KEY_FORMAT_LIST_TYPE, "track");
            mec0Var.put(Context.Metadata.KEY_REPORTING_URI, "spotify:search");
            if (z) {
                mec0Var.put("is_single_track_video_content", "true");
            }
            mec0 mec0VarM61540b = mec0Var.m61540b();
            EsLoggingParams$LoggingParams esLoggingParams$LoggingParamsM44179a = this.f256405e.m44179a(j, d850Var);
            onw onwVarM17830E = EsPreparePlayOptions$PreparePlayOptions.m17830E();
            xow xowVarM18009u = EsSkipToTrack$SkipToTrack.m18009u();
            xowVarM18009u.m91569t(str);
            onwVarM17830E.m67427C((EsSkipToTrack$SkipToTrack) xowVarM18009u.build());
            njw njwVarM17688r = EsContextPlayerOptions$ContextPlayerOptionOverrides.m17688r();
            njwVarM17688r.m64639m(z2 ? Collections.singletonMap("media", "audio") : nau.f152117a);
            onwVarM17830E.m67438x((EsContextPlayerOptions$ContextPlayerOptionOverrides) njwVarM17688r.build());
            EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions = (EsPreparePlayOptions$PreparePlayOptions) onwVarM17830E.build();
            vyy0Var2.f246351c = 1;
            objM88912b = wt80.m88912b(this.f256407g, str, st80Var, esPreparePlayOptions$PreparePlayOptions, esPlayOrigin$PlayOriginM89384d, null, mec0VarM61540b, esLoggingParams$LoggingParamsM44179a, null, vyy0Var2, 144);
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
}
