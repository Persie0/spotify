package p204p;

import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.offline.lyricsofflineplugin.proto.TrackLyricsView;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$IdentifyCommand;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$Metadata;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes9.dex */
public final class z040 implements Function {

    /* JADX INFO: renamed from: a */
    public static final z040 f277953a = new z040();

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        String link;
        EsOfflinePlugin$IdentifyCommand.Query query = (EsOfflinePlugin$IdentifyCommand.Query) obj;
        String link2 = query.getLink();
        gva gvaVarM28374a = b7f0.m28374a(query.getMetadataMap());
        if (gvaVarM28374a == null || (link = "spotify:track:".concat(mx8.m63085a(gvaVarM28374a.m45891s()))) == null) {
            link = query.getLink();
        }
        EsOfflinePlugin$Metadata esOfflinePlugin$Metadata = (EsOfflinePlugin$Metadata) query.getMetadataMap().get(Integer.valueOf(ntx.TRACK_V4.getNumber()));
        boolean hasLyrics = false;
        if (esOfflinePlugin$Metadata != null) {
            try {
                hasLyrics = TrackLyricsView.m16040n(esOfflinePlugin$Metadata.m16058o().m1913r()).getHasLyrics();
            } catch (InvalidProtocolBufferException unused) {
            }
        }
        return new ye81(link2, link, hasLyrics);
    }
}
