package p204p;

import com.spotify.player.esperanto.proto.EsContextPlayerOptions$ContextPlayerOptionOverrides;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsOptional$OptionalBoolean;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions$PreparePlayOptions;
import com.spotify.player.esperanto.proto.EsSkipToTrack$SkipToTrack;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class e0b {

    /* JADX INFO: renamed from: a */
    public final i4t0 f54920a;

    /* JADX INFO: renamed from: b */
    public final ewk0 f54921b;

    /* JADX INFO: renamed from: c */
    public final nbm0 f54922c;

    /* JADX INFO: renamed from: d */
    public final qwx0 f54923d;

    /* JADX INFO: renamed from: e */
    public final xre f54924e;

    /* JADX INFO: renamed from: f */
    public final mjp0 f54925f;

    /* JADX INFO: renamed from: g */
    public final String f54926g;

    /* JADX INFO: renamed from: h */
    public final q040 f54927h;

    /* JADX INFO: renamed from: i */
    public final bs11 f54928i;

    /* JADX INFO: renamed from: j */
    public Disposable f54929j;

    /* JADX INFO: renamed from: k */
    public boolean f54930k;

    public e0b(i4t0 i4t0Var, ewk0 ewk0Var, nbm0 nbm0Var, qwx0 qwx0Var, xre xreVar, mjp0 mjp0Var, String str, q040 q040Var, bs11 bs11Var, hc80 hc80Var) {
        this.f54920a = i4t0Var;
        this.f54921b = ewk0Var;
        this.f54922c = nbm0Var;
        this.f54923d = qwx0Var;
        this.f54924e = xreVar;
        this.f54925f = mjp0Var;
        this.f54926g = str;
        this.f54927h = q040Var;
        this.f54928i = bs11Var;
        hc80Var.getLifecycle().mo31986a(new r12(this, 2));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m37484b(n0b n0bVar, boolean z) {
        String strM63335c = n0bVar.m63335c();
        String strM63339g = n0bVar.m63339g();
        if (strM63339g == null) {
            strM63339g = "";
        }
        boolean zM88271j = wj50.m88271j(strM63335c, strM63339g);
        String strM63335c2 = n0bVar.m63335c();
        Set set = dd41.f47702f;
        return ((!r46.m74709B(strM63335c2, gn80.ALBUM, gn80.ALBUM_AUTOPLAY, gn80.ALBUM_RADIO) && !r46.m74710C(strM63335c2, r46.m74721O()) && !r46.m74708A(strM63335c2, gn80.PLAYLIST_RADIO)) || zM88271j || z) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m37485c(n0b n0bVar, boolean z) {
        String strM63335c = n0bVar.m63335c();
        String strM63339g = n0bVar.m63339g();
        if (strM63339g == null) {
            strM63339g = "";
        }
        boolean zM88271j = wj50.m88271j(strM63335c, strM63339g);
        boolean z2 = !zM88271j;
        if (z) {
            return z2;
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        String strM63335c2 = n0bVar.m63335c();
        Set set = dd41.f47702f;
        return n0bVar.m63340h() || (!zM88271j && !(r46.m74709B(strM63335c2, gn80.ALBUM, gn80.ALBUM_AUTOPLAY, gn80.ALBUM_RADIO) || r46.m74710C(strM63335c2, r46.m74721O()) || r46.m74708A(strM63335c2, gn80.PLAYLIST_RADIO)));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x025b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x0067  */
    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:39:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:94:0x023b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0246  */
    /* JADX INFO: renamed from: a */
    public final Object m37486a(n0b n0bVar, ibk ibkVar) {
        d0b d0bVar;
        n0b n0bVarM63333a;
        String str;
        n0b n0bVar2;
        bs11 bs11Var;
        String strM63335c;
        boolean zM74710C;
        xre xreVar;
        nbm0 nbm0Var;
        i4t0 i4t0Var;
        d850 d850VarM63336d;
        kbm0 kbm0Var;
        String str2;
        onw onwVarM17830E;
        z650 z650Var;
        z650 z650Var2;
        d850 d850VarM63336d2;
        z650 z650Var3;
        if (ibkVar instanceof d0b) {
            d0bVar = (d0b) ibkVar;
            int i = d0bVar.f43838d;
            if ((i & Integer.MIN_VALUE) != 0) {
                d0bVar.f43838d = i - Integer.MIN_VALUE;
            } else {
                d0bVar = new d0b(this, ibkVar);
            }
        } else {
            d0bVar = new d0b(this, ibkVar);
        }
        Object objM30341a = d0bVar.f43836b;
        int i2 = d0bVar.f43838d;
        String str3 = null;
        if (i2 == 0) {
            bga.m29073P(objM30341a);
            if (n0bVar.m63337e()) {
                String strM63339g = n0bVar.m63339g();
                if (strM63339g == null || (bs11Var = this.f54928i) == null) {
                    str = null;
                    n0bVar2 = n0bVar;
                } else {
                    d0bVar.f43835a = n0bVar;
                    d0bVar.f43838d = 1;
                    objM30341a = bs11Var.m30341a(strM63339g, d0bVar);
                    yuk yukVar = yuk.f276404a;
                    if (objM30341a == yukVar) {
                        return yukVar;
                    }
                    n0bVar2 = n0bVar;
                }
                if (str != null) {
                    n0bVarM63333a = n0b.m63333a(n0bVar2, str, null, 126);
                } else {
                    n0bVarM63333a = n0bVar2;
                }
            } else {
                n0bVarM63333a = n0bVar;
            }
            strM63335c = n0bVarM63333a.m63335c();
            this.f54921b.getClass();
            if (ewk0.m40146b(strM63335c)) {
                d850VarM63336d2 = n0bVarM63333a.m63336d();
                if (d850VarM63336d2 != null && (z650Var3 = d850VarM63336d2.f46380a) != null) {
                    str3 = z650Var3.f279709a;
                }
                return new f4b(str3 != null ? str3 : "");
            }
            String strM63335c2 = n0bVarM63333a.m63335c();
            Set set = dd41.f47702f;
            zM74710C = r46.m74710C(strM63335c2, r46.m74721O());
            xreVar = this.f54924e;
            nbm0Var = this.f54922c;
            i4t0Var = this.f54920a;
            if (zM74710C && !r46.m74708A(strM63335c2, gn80.PLAYLIST_RADIO)) {
                Context contextFromUri = Context.fromUri(n0bVarM63333a.m63335c());
                PlayCommand.Builder builder = PlayCommand.Builder.builder();
                if (n0bVarM63333a.m63340h()) {
                    wj50.m88279p(contextFromUri);
                    contextFromUri = contextFromUri.toBuilder().metadata(c95.m31821M(pft0.m69840u("is_single_track_video_content", "true"))).build();
                }
                PlayCommand.Builder builderContext = builder.context(contextFromUri);
                PreparePlayOptions.Builder builderAlwaysPlaySomething = PreparePlayOptions.Builder.builder().alwaysPlaySomething(true);
                if (m37485c(n0bVarM63333a, this.f54930k)) {
                    String strM63339g2 = n0bVarM63333a.m63339g();
                    if (strM63339g2 == null) {
                        strM63339g2 = "";
                    }
                    builderAlwaysPlaySomething.skipTo(SkipToTrack.fromUri(strM63339g2));
                }
                Long lM63338f = n0bVarM63333a.m63338f();
                if (lM63338f != null) {
                    long jLongValue = lM63338f.longValue();
                    if (jLongValue > 0) {
                        builderAlwaysPlaySomething.seekTo(Long.valueOf(jLongValue));
                    }
                }
                if (m37484b(n0bVarM63333a, this.f54930k)) {
                    PlayerOptionOverrides playerOptionOverridesBuild = PlayerOptionOverrides.builder().shufflingContext(Boolean.TRUE).build();
                    wj50.m88279p(builderAlwaysPlaySomething);
                    builderAlwaysPlaySomething.playerOptionsOverride(playerOptionOverridesBuild);
                }
                builderContext.options(builderAlwaysPlaySomething.build());
                builderContext.playOrigin((PlayOrigin) i4t0Var.get());
                LoggingParams.Builder builder2 = LoggingParams.builder();
                ((wy3) xreVar).getClass();
                LoggingParams.Builder builderCommandInitiatedTime = builder2.commandInitiatedTime(Long.valueOf(System.currentTimeMillis()));
                kbm0 kbm0Var2 = nbm0Var.get();
                String str4 = kbm0Var2 != null ? kbm0Var2.f121231a : null;
                if (str4 == null) {
                    str4 = "";
                }
                LoggingParams.Builder builderPageInstanceId = builderCommandInitiatedTime.pageInstanceId(str4);
                d850 d850VarM63336d3 = n0bVarM63333a.m63336d();
                if (d850VarM63336d3 != null && (z650Var2 = d850VarM63336d3.f46380a) != null) {
                    str3 = z650Var2.f279709a;
                }
                builderContext.loggingParams(builderPageInstanceId.interactionId(str3 != null ? str3 : "").build());
                return new q8k(builderContext.build());
            }
            ilw ilwVarM17768t = EsLoggingParams$LoggingParams.m17768t();
            d850VarM63336d = n0bVarM63333a.m63336d();
            if (d850VarM63336d != null && (z650Var = d850VarM63336d.f46380a) != null) {
                str3 = z650Var.f279709a;
            }
            if (str3 == null) {
                str3 = "";
            }
            ilwVarM17768t.m51043m(str3);
            kbm0Var = nbm0Var.get();
            if (kbm0Var != null || (str2 = kbm0Var.f121231a) == null) {
                str2 = "";
            }
            ilwVarM17768t.m51044q(str2);
            umw umwVarM17777q = EsOptional$OptionalInt64.m17777q();
            ((wy3) xreVar).getClass();
            umwVarM17777q.m83492m(System.currentTimeMillis());
            ilwVarM17768t.m51046s((EsOptional$OptionalInt64) umwVarM17777q.build());
            EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = (EsLoggingParams$LoggingParams) ilwVarM17768t.build();
            dnw dnwVarM17804F = EsPlayOrigin$PlayOrigin.m17804F();
            dnwVarM17804F.m36494s(((PlayOrigin) i4t0Var.get()).featureIdentifier());
            dnwVarM17804F.m36495t(((PlayOrigin) i4t0Var.get()).featureVersion());
            dnwVarM17804F.m36498w(this.f54927h.f183902b.f243453a);
            dnwVarM17804F.m36496u(((PlayOrigin) i4t0Var.get()).referrerIdentifier());
            EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin = (EsPlayOrigin$PlayOrigin) dnwVarM17804F.build();
            st80 st80Var = new st80(null, this.f54925f.mo61982a(this.f54926g).m70161a(n0bVarM63333a.m63335c()), null, false, null, a5u0.f12598a, null, 0, null, 477);
            onwVarM17830E = EsPreparePlayOptions$PreparePlayOptions.m17830E();
            if (m37485c(n0bVarM63333a, this.f54930k)) {
                xow xowVarM18009u = EsSkipToTrack$SkipToTrack.m18009u();
                String strM63339g3 = n0bVarM63333a.m63339g();
                xowVarM18009u.m91569t(strM63339g3 != null ? strM63339g3 : "");
                onwVarM17830E.m67427C((EsSkipToTrack$SkipToTrack) xowVarM18009u.build());
            }
            if (m37484b(n0bVarM63333a, this.f54930k)) {
                njw njwVarM17688r = EsContextPlayerOptions$ContextPlayerOptionOverrides.m17688r();
                tmw tmwVarM17771o = EsOptional$OptionalBoolean.m17771o();
                tmwVarM17771o.m81146m(true);
                njwVarM17688r.m64643t((EsOptional$OptionalBoolean) tmwVarM17771o.build());
                onwVarM17830E.m67438x((EsContextPlayerOptions$ContextPlayerOptionOverrides) njwVarM17688r.build());
            }
            onwVarM17830E.m67433s(true);
            return new nu80(esLoggingParams$LoggingParams, esPlayOrigin$PlayOrigin, (EsPreparePlayOptions$PreparePlayOptions) onwVarM17830E.build(), st80Var);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        n0bVar2 = d0bVar.f43835a;
        bga.m29073P(objM30341a);
        str = (String) objM30341a;
        if (str != null) {
            n0bVarM63333a = n0b.m63333a(n0bVar2, str, null, 126);
        } else {
            n0bVarM63333a = n0bVar2;
        }
        strM63335c = n0bVarM63333a.m63335c();
        this.f54921b.getClass();
        if (ewk0.m40146b(strM63335c)) {
            d850VarM63336d2 = n0bVarM63333a.m63336d();
            if (d850VarM63336d2 != null) {
                str3 = z650Var3.f279709a;
            }
            return new f4b(str3 != null ? str3 : "");
        }
        String strM63335c3 = n0bVarM63333a.m63335c();
        Set set2 = dd41.f47702f;
        zM74710C = r46.m74710C(strM63335c3, r46.m74721O());
        xreVar = this.f54924e;
        nbm0Var = this.f54922c;
        i4t0Var = this.f54920a;
        if (zM74710C) {
        }
        ilw ilwVarM17768t2 = EsLoggingParams$LoggingParams.m17768t();
        d850VarM63336d = n0bVarM63333a.m63336d();
        if (d850VarM63336d != null) {
            str3 = z650Var.f279709a;
        }
        if (str3 == null) {
            str3 = "";
        }
        ilwVarM17768t2.m51043m(str3);
        kbm0Var = nbm0Var.get();
        if (kbm0Var != null) {
            str2 = "";
        } else {
            str2 = "";
        }
        ilwVarM17768t2.m51044q(str2);
        umw umwVarM17777q2 = EsOptional$OptionalInt64.m17777q();
        ((wy3) xreVar).getClass();
        umwVarM17777q2.m83492m(System.currentTimeMillis());
        ilwVarM17768t2.m51046s((EsOptional$OptionalInt64) umwVarM17777q2.build());
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams2 = (EsLoggingParams$LoggingParams) ilwVarM17768t2.build();
        dnw dnwVarM17804F2 = EsPlayOrigin$PlayOrigin.m17804F();
        dnwVarM17804F2.m36494s(((PlayOrigin) i4t0Var.get()).featureIdentifier());
        dnwVarM17804F2.m36495t(((PlayOrigin) i4t0Var.get()).featureVersion());
        dnwVarM17804F2.m36498w(this.f54927h.f183902b.f243453a);
        dnwVarM17804F2.m36496u(((PlayOrigin) i4t0Var.get()).referrerIdentifier());
        EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin2 = (EsPlayOrigin$PlayOrigin) dnwVarM17804F2.build();
        st80 st80Var2 = new st80(null, this.f54925f.mo61982a(this.f54926g).m70161a(n0bVarM63333a.m63335c()), null, false, null, a5u0.f12598a, null, 0, null, 477);
        onwVarM17830E = EsPreparePlayOptions$PreparePlayOptions.m17830E();
        if (m37485c(n0bVarM63333a, this.f54930k)) {
            xow xowVarM18009u2 = EsSkipToTrack$SkipToTrack.m18009u();
            String strM63339g4 = n0bVarM63333a.m63339g();
            xowVarM18009u2.m91569t(strM63339g4 != null ? strM63339g4 : "");
            onwVarM17830E.m67427C((EsSkipToTrack$SkipToTrack) xowVarM18009u2.build());
        }
        if (m37484b(n0bVarM63333a, this.f54930k)) {
            njw njwVarM17688r2 = EsContextPlayerOptions$ContextPlayerOptionOverrides.m17688r();
            tmw tmwVarM17771o2 = EsOptional$OptionalBoolean.m17771o();
            tmwVarM17771o2.m81146m(true);
            njwVarM17688r2.m64643t((EsOptional$OptionalBoolean) tmwVarM17771o2.build());
            onwVarM17830E.m67438x((EsContextPlayerOptions$ContextPlayerOptionOverrides) njwVarM17688r2.build());
        }
        onwVarM17830E.m67433s(true);
        return new nu80(esLoggingParams$LoggingParams2, esPlayOrigin$PlayOrigin2, (EsPreparePlayOptions$PreparePlayOptions) onwVarM17830E.build(), st80Var2);
    }
}
