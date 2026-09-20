package p204p;

import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;
import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: classes9.dex */
public abstract class soo0 {
    /* JADX INFO: renamed from: a */
    public static final EsPlayOrigin$PlayOrigin m78834a(PlayOrigin playOrigin) {
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
}
