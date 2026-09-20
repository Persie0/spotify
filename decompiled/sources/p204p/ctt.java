package p204p;

import com.spotify.carapplibrary.api.CommandFailedException;
import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes5.dex */
public final class ctt {

    /* JADX INFO: renamed from: a */
    public final xzx f41971a;

    /* JADX INFO: renamed from: b */
    public final fzx f41972b;

    /* JADX INFO: renamed from: c */
    public final ExternalAccessoryDescription f41973c;

    public ctt(xzx xzxVar, fzx fzxVar, ExternalAccessoryDescription externalAccessoryDescription) {
        this.f41971a = xzxVar;
        this.f41972b = fzxVar;
        this.f41973c = externalAccessoryDescription;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: a */
    public final Object m33847a(zbf zbfVar, ibk ibkVar) {
        btt bttVar;
        Single singleM31196e;
        Long l;
        String str;
        if (ibkVar instanceof btt) {
            bttVar = (btt) ibkVar;
            int i = bttVar.f30934c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bttVar.f30934c = i - Integer.MIN_VALUE;
            } else {
                bttVar = new btt(this, ibkVar);
            }
        } else {
            bttVar = new btt(this, ibkVar);
        }
        Object objM96567o = bttVar.f30932a;
        int i2 = bttVar.f30934c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            ubf ubfVar = (ubf) zbfVar;
            PreparePlayOptions.Builder builder = PreparePlayOptions.builder();
            boolean z = zbfVar instanceof tbf;
            tbf tbfVar = z ? (tbf) zbfVar : null;
            if (tbfVar != null && (str = tbfVar.f218840b) != null) {
                builder.skipTo(SkipToTrack.builder().trackUri(str).build());
            }
            tbf tbfVar2 = z ? (tbf) zbfVar : null;
            if (tbfVar2 != null && (l = tbfVar2.f218843e) != null) {
                builder.seekTo(new Long(l.longValue()));
            }
            if (zbfVar instanceof wbf) {
                builder.playerOptionsOverride(PlayerOptionOverrides.builder().shufflingContext(Boolean.TRUE).build());
            }
            PlayOrigin.Builder builder2 = PlayOrigin.builder("android-auto");
            String strMo80393a = ubfVar.mo80393a();
            if (wj50.m88271j(strMo80393a, k0j0.f118116b) || wj50.m88271j(strMo80393a, g0j0.f75386b)) {
                strMo80393a = edb.m38564m("android_auto_", strMo80393a);
            } else {
                AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
                if (wj50.m88271j(strMo80393a, xgg1.m90749Z4().f36166c)) {
                    strMo80393a = edb.m38564m("android_auto_", strMo80393a);
                } else if (wj50.m88271j(strMo80393a, x0j0.f256889b)) {
                    strMo80393a = "android_auto_recently_played";
                } else if (wj50.m88271j(strMo80393a, o0j0.f160413b)) {
                    strMo80393a = "android_auto_your_library";
                }
            }
            builder2.referrerIdentifier(strMo80393a);
            builder2.viewUri(ubfVar.getContextUri());
            String str2 = zbfVar.mo77730b().f46380a.f279709a;
            LoggingParams.Builder builderInteractionId = LoggingParams.builder().interactionId(str2);
            kbm0 kbm0Var = zbfVar.mo77730b().f46381b;
            LoggingParams loggingParamsBuild = builderInteractionId.pageInstanceId(kbm0Var != null ? kbm0Var.f121231a : null).build();
            this.f41972b.m43245b(str2);
            String contextUri = ubfVar.getContextUri();
            PreparePlayOptions preparePlayOptionsBuild = builder.build();
            PlayOrigin playOriginBuild = builder2.build();
            wzx wzxVar = new wzx(contextUri, null, null, preparePlayOptionsBuild, playOriginBuild, loggingParamsBuild, 6);
            c0y c0yVar = (c0y) this.f41971a;
            String strM85744y = c0yVar.f32907d.m68667b(this.f41973c).m85744y();
            if (strM85744y != null) {
                PlayOrigin playOriginBuild2 = playOriginBuild.toBuilder().restrictionIdentifier(strM85744y).build();
                wj50.m88279p(playOriginBuild2);
                singleM31196e = c0yVar.m31196e(wzx.m89485b(wzxVar, playOriginBuild2));
            } else {
                singleM31196e = c0yVar.m31196e(wzxVar);
            }
            bttVar.f30934c = 1;
            objM96567o = zn91.m96567o(singleM31196e, bttVar);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        lcf lcfVar = (lcf) objM96567o;
        lcfVar.getClass();
        if (lcfVar instanceof hcf) {
            throw new CommandFailedException(((hcf) lcfVar).f89783a);
        }
        return w2a1.f247311a;
    }
}
