package com.spotify.voiceassistants.playermodels;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0001H\u0007¨\u0006\u0005"}, m24212d2 = {"Lcom/spotify/voiceassistants/playermodels/SpeakeasyPlayerModelsMoshiAdaptersModule;", "", "<init>", "()V", "provideCommandPlayResponseCustomJsonAdapter", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class SpeakeasyPlayerModelsMoshiAdaptersModule {
    public static final SpeakeasyPlayerModelsMoshiAdaptersModule INSTANCE = new SpeakeasyPlayerModelsMoshiAdaptersModule();

    private SpeakeasyPlayerModelsMoshiAdaptersModule() {
    }

    public final Object provideCommandPlayResponseCustomJsonAdapter() {
        return new CommandPlayResponseCustomJsonAdapter(null, 1, null);
    }
}
