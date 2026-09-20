package p204p;

import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.base.java.logging.Logger;
import com.spotify.metadata.proto.Metadata$Track;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$Metadata;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b7f0 {
    /* JADX INFO: renamed from: a */
    public static final gva m28374a(Map map) {
        Metadata$Track metadata$TrackM15448t;
        gva gvaVarM15452r;
        EsOfflinePlugin$Metadata esOfflinePlugin$Metadata = (EsOfflinePlugin$Metadata) map.get(Integer.valueOf(ntx.TRACK_V4.getNumber()));
        if (esOfflinePlugin$Metadata == null) {
            metadata$TrackM15448t = null;
        } else {
            try {
                metadata$TrackM15448t = Metadata$Track.m15448t(esOfflinePlugin$Metadata.m16058o().m1913r());
            } catch (InvalidProtocolBufferException e) {
                Logger.m3966b("Failed to parse track metadata", e);
                metadata$TrackM15448t = null;
            }
        }
        if (metadata$TrackM15448t == null || (gvaVarM15452r = metadata$TrackM15448t.m15452r()) == null || gvaVarM15452r.size() != 16) {
            return null;
        }
        return gvaVarM15452r;
    }
}
