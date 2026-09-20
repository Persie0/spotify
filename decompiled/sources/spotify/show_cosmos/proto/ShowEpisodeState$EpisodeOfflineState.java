package spotify.show_cosmos.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.fi11;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ShowEpisodeState$EpisodeOfflineState extends AbstractC0269h implements sre0 {
    private static final ShowEpisodeState$EpisodeOfflineState DEFAULT_INSTANCE;
    public static final int OFFLINE_STATE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SYNC_PROGRESS_FIELD_NUMBER = 2;
    private int bitField0_;
    private String offlineState_ = "";
    private int syncProgress_;

    static {
        ShowEpisodeState$EpisodeOfflineState showEpisodeState$EpisodeOfflineState = new ShowEpisodeState$EpisodeOfflineState();
        DEFAULT_INSTANCE = showEpisodeState$EpisodeOfflineState;
        AbstractC0269h.registerDefaultInstance(ShowEpisodeState$EpisodeOfflineState.class, showEpisodeState$EpisodeOfflineState);
    }

    private ShowEpisodeState$EpisodeOfflineState() {
    }

    /* JADX INFO: renamed from: n */
    public static ShowEpisodeState$EpisodeOfflineState m97921n() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001", new Object[]{"bitField0_", "offlineState_", "syncProgress_"});
        }
        if (iOrdinal == 3) {
            return new ShowEpisodeState$EpisodeOfflineState();
        }
        if (iOrdinal == 4) {
            return new fi11(DEFAULT_INSTANCE, 12);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        r2n0 r2n0Var = PARSER;
        if (r2n0Var != null) {
            return r2n0Var;
        }
        synchronized (ShowEpisodeState$EpisodeOfflineState.class) {
            try {
                r110Var = PARSER;
                if (r110Var == null) {
                    r110Var = new r110(DEFAULT_INSTANCE);
                    PARSER = r110Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r110Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getOfflineState() {
        return this.offlineState_;
    }

    public final int getSyncProgress() {
        return this.syncProgress_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
