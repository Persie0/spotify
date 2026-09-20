package com.spotify.cosmos.cosmos;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m24212d2 = {"Lcom/spotify/cosmos/cosmos/Lifetime;", "", "Lp/w2a1;", "release", "()V", "Companion", "src_main_java_com_spotify_cosmos_cosmos-cosmos"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface Lifetime {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final Lifetime UNRESOLVED = new Lifetime() { // from class: com.spotify.cosmos.cosmos.Lifetime$Companion$UNRESOLVED$1
        @Override // com.spotify.cosmos.cosmos.Lifetime
        public void release() {
        }
    };

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m24211d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, m24212d2 = {"Lcom/spotify/cosmos/cosmos/Lifetime$Companion;", "", "<init>", "()V", "UNRESOLVED", "Lcom/spotify/cosmos/cosmos/Lifetime;", "src_main_java_com_spotify_cosmos_cosmos-cosmos"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void release();
}
