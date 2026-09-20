package com.spotify.voiceassistants.playermodels;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import p204p.be00;
import p204p.hk60;
import p204p.jx71;
import p204p.kkc0;
import p204p.rm60;
import p204p.xl60;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/ContextJsonAdapter;", "Lp/hk60;", "Lcom/spotify/player/model/Context;", "<init>", "()V", "Lp/xl60;", "jsonReader", "", "", "metadataBuilder", "Lp/w2a1;", "readMetadata", "(Lp/xl60;Ljava/util/Map;)V", "fromJson", "(Lp/xl60;)Lcom/spotify/player/model/Context;", "Lp/rm60;", "writer", "contextIn", "toJson", "(Lp/rm60;Lcom/spotify/player/model/Context;)V", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ContextJsonAdapter extends hk60<Context> {
    private final void readMetadata(xl60 jsonReader, Map<String, String> metadataBuilder) {
        jsonReader.mo51076c();
        while (jsonReader.mo51079i()) {
            metadataBuilder.put(jsonReader.mo51084s(), jsonReader.mo51087y());
        }
        jsonReader.mo51078f();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p204p.hk60
    @be00
    public Context fromJson(xl60 jsonReader) {
        jsonReader.mo51076c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strMo51087y = "";
        String strMo51087y2 = "";
        while (jsonReader.mo51079i()) {
            String strMo51084s = jsonReader.mo51084s();
            if (strMo51084s != null) {
                int iHashCode = strMo51084s.hashCode();
                if (iHashCode != -450004177) {
                    if (iHashCode != 116076) {
                        if (iHashCode == 116079 && strMo51084s.equals("url")) {
                            strMo51087y2 = jsonReader.mo51087y();
                        }
                    } else if (strMo51084s.equals("uri")) {
                        strMo51087y = jsonReader.mo51087y();
                    }
                } else if (strMo51084s.equals("metadata")) {
                    readMetadata(jsonReader, linkedHashMap);
                }
            }
            Logger.m3973i("Unknown JSON property: %s", strMo51084s);
            jsonReader.mo51074Q();
        }
        jsonReader.mo51078f();
        return Context.builder(strMo51087y).url(strMo51087y2).metadata(kkc0.m56706s0(linkedHashMap)).build();
    }

    @Override // p204p.hk60
    @jx71
    public void toJson(rm60 writer, Context contextIn) {
        writer.mo56891e();
        if (contextIn != null) {
            writer.mo56894s("uri").mo56887N(contextIn.uri());
            writer.mo56894s("url").mo56887N(contextIn.url());
            if (!contextIn.metadata().isEmpty()) {
                writer.mo56894s("metadata");
                writer.mo56891e();
                for (Map.Entry entry : contextIn.metadata().entrySet()) {
                    writer.mo56894s((String) entry.getKey()).mo56887N((String) entry.getValue());
                }
                writer.mo56893i();
            }
        }
        writer.mo56893i();
    }
}
