package p204p;

import com.spotify.player.esperanto.proto.EsContextTrack$ContextTrack;
import com.spotify.player.esperanto.proto.EsProvidedTrack$ProvidedTrack;
import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes9.dex */
public abstract class n9k {
    /* JADX INFO: renamed from: a */
    public static final ContextTrack m63926a(EsProvidedTrack$ProvidedTrack esProvidedTrack$ProvidedTrack) {
        EsContextTrack$ContextTrack esContextTrack$ContextTrackM17850q = esProvidedTrack$ProvidedTrack.m17850q();
        ContextTrack.Builder builder = ContextTrack.builder(esContextTrack$ContextTrackM17850q.getUri());
        String uid = esContextTrack$ContextTrackM17850q.getUid();
        if (uid != null && uid.length() != 0) {
            builder.uid(esContextTrack$ContextTrackM17850q.getUid());
        }
        if (esContextTrack$ContextTrackM17850q.getMetadataCount() > 0) {
            builder.metadata(esContextTrack$ContextTrackM17850q.getMetadataMap());
        }
        ContextTrack.Builder builder2 = builder.build().toBuilder();
        builder2.provider(esProvidedTrack$ProvidedTrack.m17851s());
        return builder2.build();
    }

    /* JADX INFO: renamed from: b */
    public static final EsContextTrack$ContextTrack m63927b(ContextTrack contextTrack) {
        yjw yjwVarM17753s = EsContextTrack$ContextTrack.m17753s();
        String strUri = contextTrack.uri();
        if (strUri != null && strUri.length() != 0) {
            yjwVarM17753s.m93941r(contextTrack.uri());
        }
        String strUid = contextTrack.uid();
        if (strUid != null && strUid.length() != 0) {
            yjwVarM17753s.m93940q(contextTrack.uid());
        }
        xf40 xf40VarMetadata = contextTrack.metadata();
        if (xf40VarMetadata != null && !xf40VarMetadata.isEmpty()) {
            yjwVarM17753s.m93939m(contextTrack.metadata());
        }
        return (EsContextTrack$ContextTrack) yjwVarM17753s.build();
    }

    /* JADX INFO: renamed from: c */
    public static final EsProvidedTrack$ProvidedTrack m63928c(ContextTrack contextTrack) {
        rnw rnwVarM17849t = EsProvidedTrack$ProvidedTrack.m17849t();
        rnwVarM17849t.m76012m(m63927b(contextTrack));
        rnwVarM17849t.m76013q(contextTrack.provider());
        return (EsProvidedTrack$ProvidedTrack) rnwVarM17849t.build();
    }
}
