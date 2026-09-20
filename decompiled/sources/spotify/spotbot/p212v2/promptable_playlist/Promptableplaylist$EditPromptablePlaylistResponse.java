package spotify.spotbot.p212v2.promptable_playlist;

import com.google.protobuf.AbstractC0269h;
import p204p.c8s0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class Promptableplaylist$EditPromptablePlaylistResponse extends AbstractC0269h implements sre0 {
    private static final Promptableplaylist$EditPromptablePlaylistResponse DEFAULT_INSTANCE;
    public static final int LOCATION_SENSITIVE_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_UPDATE_TRIGGERED_FIELD_NUMBER = 2;
    public static final int PROMPT_VERSION_FIELD_NUMBER = 1;
    private boolean locationSensitive_;
    private boolean playlistUpdateTriggered_;
    private int promptVersion_;

    static {
        Promptableplaylist$EditPromptablePlaylistResponse promptableplaylist$EditPromptablePlaylistResponse = new Promptableplaylist$EditPromptablePlaylistResponse();
        DEFAULT_INSTANCE = promptableplaylist$EditPromptablePlaylistResponse;
        AbstractC0269h.registerDefaultInstance(Promptableplaylist$EditPromptablePlaylistResponse.class, promptableplaylist$EditPromptablePlaylistResponse);
    }

    private Promptableplaylist$EditPromptablePlaylistResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0007\u0004\u0007", new Object[]{"promptVersion_", "playlistUpdateTriggered_", "locationSensitive_"});
        }
        if (iOrdinal == 3) {
            return new Promptableplaylist$EditPromptablePlaylistResponse();
        }
        if (iOrdinal == 4) {
            return new c8s0(DEFAULT_INSTANCE, 16);
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
        synchronized (Promptableplaylist$EditPromptablePlaylistResponse.class) {
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

    /* JADX INFO: renamed from: n */
    public final boolean m98025n() {
        return this.locationSensitive_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m98026o() {
        return this.promptVersion_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
