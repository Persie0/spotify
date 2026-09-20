package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import com.spotify.nowplaying.musicinstallation.NowPlayingActivity;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;

/* JADX INFO: loaded from: classes11.dex */
public final class zha implements kxf {

    /* JADX INFO: renamed from: a */
    public final bxb f282848a;

    /* JADX INFO: renamed from: b */
    public final yfd1 f282849b;

    /* JADX INFO: renamed from: c */
    public final z9j0 f282850c;

    /* JADX INFO: renamed from: d */
    public final nbm0 f282851d;

    /* JADX INFO: renamed from: e */
    public final aiq f282852e;

    /* JADX INFO: renamed from: f */
    public final q831 f282853f;

    /* JADX INFO: renamed from: g */
    public final wek0 f282854g;

    /* JADX INFO: renamed from: h */
    public final uqw f282855h;

    /* JADX INFO: renamed from: i */
    public final siy f282856i;

    /* JADX INFO: renamed from: j */
    public final pnh0 f282857j;

    /* JADX INFO: renamed from: k */
    public final pu4 f282858k;

    public zha(bxb bxbVar, yfd1 yfd1Var, z9j0 z9j0Var, nbm0 nbm0Var, aiq aiqVar, q831 q831Var, wek0 wek0Var, uqw uqwVar, siy siyVar, pnh0 pnh0Var, pu4 pu4Var) {
        this.f282848a = bxbVar;
        this.f282849b = yfd1Var;
        this.f282850c = z9j0Var;
        this.f282851d = nbm0Var;
        this.f282852e = aiqVar;
        this.f282853f = q831Var;
        this.f282854g = wek0Var;
        this.f282855h = uqwVar;
        this.f282856i = siyVar;
        this.f282857j = pnh0Var;
        this.f282858k = pu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:95:0x01cf  */
    /* JADX INFO: renamed from: d */
    public static final Object m96120d(zha zhaVar, lwf lwfVar, String str, String str2, boolean z, boolean z2, String str3, ibk ibkVar) {
        yha yhaVar;
        String str4;
        Context contextFromTrackUris;
        s150 s150VarMo31674d;
        d850 d850Var;
        zv41 zv41Var;
        i1p0 i1p0Var;
        zv41 zv41Var2;
        i1p0 i1p0Var2;
        Long lM55119a;
        Object c6x0Var;
        aiq aiqVar = zhaVar.f282852e;
        if (ibkVar instanceof yha) {
            yhaVar = (yha) ibkVar;
            int i = yhaVar.f272796d;
            if ((i & Integer.MIN_VALUE) != 0) {
                yhaVar.f272796d = i - Integer.MIN_VALUE;
            } else {
                yhaVar = new yha(zhaVar, ibkVar);
            }
        } else {
            yhaVar = new yha(zhaVar, ibkVar);
        }
        Object objM96567o = yhaVar.f272794b;
        int i2 = yhaVar.f272796d;
        boolean z3 = false;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            if (str.length() > 0) {
                contextFromTrackUris = Context.fromUri(str);
                str4 = str2;
            } else {
                str4 = str2;
                contextFromTrackUris = Context.fromTrackUris(str4, pf40.m69794t(str2));
            }
            PreparePlayOptions.Builder builder = PreparePlayOptions.builder();
            if (z) {
                k1p0 k1p0Var = lwfVar.f137559c.f127088b;
                long j = 0;
                long jLongValue = (k1p0Var == null || (lM55119a = k1p0Var.m55119a()) == null) ? 0L : lM55119a.longValue();
                if (k1p0Var != null && (zv41Var2 = k1p0Var.f118406b) != null && (i1p0Var2 = (i1p0) zv41Var2.getValue()) != null) {
                    j = i1p0Var2.f97563d;
                }
                if (!((k1p0Var == null || (zv41Var = k1p0Var.f118406b) == null || (i1p0Var = (i1p0) zv41Var.getValue()) == null) ? false : i1p0Var.f97566g)) {
                    jLongValue += j;
                }
                builder.seekTo(new Long(jLongValue));
            }
            if (str.length() > 0) {
                builder.skipTo(SkipToTrack.fromUri(str4));
            }
            if (z2) {
                builder.playerOptionsOverride(PlayerOptionOverrides.builder().modes(Collections.singletonMap("media", "video")).build());
            }
            PreparePlayOptions preparePlayOptionsBuild = builder.alwaysPlaySomething(true).build();
            yfd1 yfd1Var = zhaVar.f282849b;
            u150 u150Var = lwfVar.f137561e;
            if (u150Var != null) {
                yfd1Var.getClass();
                s150VarMo31674d = u150Var.mo31674d();
            } else {
                s150VarMo31674d = null;
            }
            yt91 yt91VarM96903c = yfd1Var.m93561h(s150VarMo31674d).f80483a.m96903c();
            yt91VarM96903c.f276055i.add(new bu91("watch_feed_component", "boxed_entity_row", null, str4, str3));
            yt91VarM96903c.f276056j = true;
            zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
            String str5 = xoc1.f264152o1.f243453a;
            dv91 dv91Var = new dv91("hit", 1);
            String string = str5 != null ? str5.toString() : null;
            if (string == null) {
                string = "";
            }
            d850 d850VarMo57453r = yfd1Var.f272208a.mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
            PlayCommand.Builder builder2 = PlayCommand.builder(contextFromTrackUris, PlayOrigin.builder("watch-feed").build());
            LoggingParams.Builder builderInteractionId = LoggingParams.builder().interactionId(d850VarMo57453r.f46380a.f279709a);
            kbm0 kbm0Var = zhaVar.f282851d.get();
            String str6 = kbm0Var != null ? kbm0Var.f121231a : null;
            PlayCommand playCommandBuild = builder2.loggingParams(builderInteractionId.pageInstanceId(str6 != null ? str6 : "").build()).options(preparePlayOptionsBuild).build();
            aiq.m26115a(aiqVar, 7);
            try {
                Single singleM83821a = zhaVar.f282855h.m83821a(playCommandBuild);
                yhaVar.f272793a = d850VarMo57453r;
                yhaVar.f272796d = 1;
                objM96567o = zn91.m96567o(singleM83821a, yhaVar);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
                d850Var = d850VarMo57453r;
            } catch (Throwable th) {
                th = th;
                d850Var = d850VarMo57453r;
                c6x0Var = new c6x0(th);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d850Var = yhaVar.f272793a;
            try {
                bga.m29073P(objM96567o);
            } catch (Throwable th2) {
                th = th2;
                c6x0Var = new c6x0(th);
            }
        }
        c6x0Var = (lcf) objM96567o;
        qlg1.m73220y(yhaVar.getContext());
        boolean z4 = c6x0Var instanceof c6x0;
        if (z4) {
            aiqVar.f16074a.onNext(tdd1.f219290a);
            q831 q831Var = zhaVar.f282853f;
            Integer numValueOf = Integer.valueOf(R.string.watch_feed_cta_playback_error_message);
            na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf);
            na6.m63963k(true, "Invalid resource ID provided: %s", null);
            q831Var.m72305j(new g631(null, "", numValueOf, null, null, null, null, null, false));
        } else {
            if (z4) {
                c6x0Var = null;
            }
            lcf lcfVar = (lcf) c6x0Var;
            if (lcfVar != null && (lcfVar instanceof icf)) {
                z3 = true;
            }
            if (z3) {
                wek0 wek0Var = zhaVar.f282854g;
                z650 z650Var = d850Var.f46380a;
                voc1 voc1Var = NowPlayingActivity.f6264u1;
                wek0Var.m87887a(cgg1.m32723u(t36.m79971q().f243453a, z650Var), true, z650Var);
            } else {
                aiqVar.f16074a.onNext(tdd1.f219290a);
                q831 q831Var2 = zhaVar.f282853f;
                Integer numValueOf2 = Integer.valueOf(R.string.watch_feed_cta_playback_error_message);
                na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf2);
                na6.m63963k(true, "Invalid resource ID provided: %s", null);
                q831Var2.m72305j(new g631(null, "", numValueOf2, null, null, null, null, null, false));
            }
        }
        return w2a1.f247311a;
    }

    @Override // p204p.kxf
    /* JADX INFO: renamed from: b */
    public final twf mo24314b(vwf vwfVar, lwf lwfVar) {
        uha uhaVar = (uha) vwfVar;
        u150 u150Var = lwfVar.f137561e;
        lyg1 lyg1Var = uhaVar.f230395f;
        return new twf(new swf(u150Var, "boxed_entity_row", lyg1Var != null ? lyg1Var.mo60256l() : null, uhaVar.f230389X));
    }

    @Override // p204p.kxf
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void mo24313a(uha uhaVar, lwf lwfVar, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(1550900230);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(uhaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? xq00Var.m91766g(lwfVar) : xq00Var.m91770i(lwfVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            fxh0Var2 = fxh0Var;
            i2 |= xq00Var.m91766g(fxh0Var2) ? 256 : 128;
        } else {
            fxh0Var2 = fxh0Var;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(this) ? 2048 : 1024;
        }
        boolean z = false;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 & 14;
            boolean zM91770i = xq00Var.m91770i(this) | (i3 == 4);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == ia7Var) {
                objM91750T = new cn8(19, this, uhaVar);
                xq00Var.m91793t0(objM91750T);
            }
            int i4 = i2 & ContentType.LONG_FORM_ON_DEMAND;
            gbm.m44243e(uhaVar, lwfVar, (gh00) objM91750T, xq00Var, i3 | 64 | i4);
            boolean zM91770i2 = (i3 == 4) | xq00Var.m91770i(this);
            if (i4 == 32 || ((i2 & 64) != 0 && xq00Var.m91770i(lwfVar))) {
                z = true;
            }
            boolean z2 = zM91770i2 | z;
            Object objM91750T2 = xq00Var.m91750T();
            if (z2 || objM91750T2 == ia7Var) {
                objM91750T2 = new C2255pg(uhaVar, this, lwfVar, 27);
                xq00Var.m91793t0(objM91750T2);
            }
            int i5 = i2 << 6;
            nyg1.m65874a(this.f282848a, lwfVar, uhaVar, (eh00) objM91750T2, fxh0Var2, xq00Var, 64 | i4 | (i5 & 896) | (i5 & 57344));
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ve9(this, uhaVar, lwfVar, fxh0Var, i, 4);
        }
    }
}
