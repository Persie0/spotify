package com.spotify.voiceassistants.playermodels;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayOrigin;
import kotlin.Metadata;
import p204p.be00;
import p204p.hk60;
import p204p.jx71;
import p204p.rm60;
import p204p.xl60;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/PlayOriginJsonAdapter;", "Lp/hk60;", "Lcom/spotify/player/model/PlayOrigin;", "<init>", "()V", "Lp/xl60;", "jsonReader", "fromJson", "(Lp/xl60;)Lcom/spotify/player/model/PlayOrigin;", "Lp/rm60;", "writer", "playOriginIn", "Lp/w2a1;", "toJson", "(Lp/rm60;Lcom/spotify/player/model/PlayOrigin;)V", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class PlayOriginJsonAdapter extends hk60<PlayOrigin> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p204p.hk60
    @be00
    public PlayOrigin fromJson(xl60 jsonReader) {
        jsonReader.mo51076c();
        String strMo51087y = "";
        String strMo51087y2 = "";
        String strMo51087y3 = strMo51087y2;
        while (jsonReader.mo51079i()) {
            String strMo51084s = jsonReader.mo51084s();
            if (strMo51084s != null) {
                int iHashCode = strMo51084s.hashCode();
                if (iHashCode != -1358351982) {
                    if (iHashCode != -305604868) {
                        if (iHashCode == 1163267273 && strMo51084s.equals("referrer_identifier")) {
                            strMo51087y2 = jsonReader.mo51087y();
                        }
                    } else if (strMo51084s.equals("restriction_identifier")) {
                        strMo51087y3 = jsonReader.mo51087y();
                    }
                } else if (strMo51084s.equals("feature_identifier")) {
                    strMo51087y = jsonReader.mo51087y();
                }
            }
            Logger.m3973i("Unknown JSON property: %s", strMo51084s);
            jsonReader.mo51074Q();
        }
        jsonReader.mo51078f();
        return PlayOrigin.builder(strMo51087y).referrerIdentifier(strMo51087y2).restrictionIdentifier(strMo51087y3).build();
    }

    @Override // p204p.hk60
    @jx71
    public void toJson(rm60 writer, PlayOrigin playOriginIn) {
        writer.mo56891e();
        if (playOriginIn != null) {
            writer.mo56894s("feature_identifier").mo56887N(playOriginIn.featureIdentifier());
            writer.mo56894s("referrer_identifier").mo56887N(playOriginIn.referrerIdentifier());
            writer.mo56894s("restriction_identifier").mo56887N(playOriginIn.restrictionIdentifier());
        }
        writer.mo56893i();
    }
}
